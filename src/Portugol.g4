grammar Portugol;

programa : PROGRAMA '{' corpo '}';
corpo: bibliotecas declaracoes;
bibliotecas : biblioteca*;
biblioteca : INCLUA BIBLIOTECA ID ('-->' ID)?;

declaracoes : (dec_funcao | dec_var | dec_constante)*;

dimensao : '[' (INTEIRO | id_consumo )? ']';

item_var : ID ('=' expressao)?  #decSingleVar | 
           ID dimensao+ ('=' inicializacao_vetor)?  #decVetor ;
lista_var : item_var (',' item_var)*;
dec_var : tipo lista_var ;
inicializacao_vetor: '{' inicializacao_vetor (',' inicializacao_vetor)* '}' | '{' valor_constante (',' valor_constante)* '}';

dec_constante : CONST tipo ID '=' valor_constante;

dec_lista_param : dec_item_param (',' dec_item_param)*;
dec_item_param: tipo '&'? ID #itemParamVar |
                tipo dimensao+ ID #itemParamVetor ;

dec_funcao : FUNCAO (tipo dimensao* | 'vazio')? ID '(' dec_lista_param? ')' bloco;

operando : id_consumo | valor_constante | chamada_funcao;

expressao : (NAO | NAO_BINARIO ) '(' expressao ')' |
                  expressao operador_aritmetico_prioritario expressao |
                  expressao (operador_aritmetico_secundario_concatenacao | operador_aritmetico_secundario) expressao  |
                  expressao operador_bit expressao |
                  expressao operador_comparacao_prioritario expressao |
                  expressao operador_comparacao_secundario expressao |
                  expressao operador_e_binario expressao |
                  expressao operador_ou_binario expressao |
                  expressao operador_e_logico expressao |
                  expressao operador_ou_logico expressao |
                  operando | '(' expressao ')' ;   

operador_aritmetico_prioritario : ('*' | '/' | '%');
operador_aritmetico_secundario_concatenacao : '+';
operador_aritmetico_secundario : '-';
operador_bit : ('<<' | '>>');
operador_comparacao_prioritario : ('<'  | '<=' | '>' | '>=');
operador_comparacao_secundario : ('!='  | '==' );
operador_e_binario : ('&' );
operador_ou_binario : ('|' );
operador_e_logico : ('e' );
operador_ou_logico : ('ou' );


tipo : INTEIRO_DECLARACAO | REAL_DECLARACAO | CARACTER_DECLARACAO | CADEIA_DECLARACAO | LOGICO_DECLARACAO;
id_consumo : ID ('[' expressao ']')*;

valor_constante : INTEIRO | REAL | CARACTER | CADEIA | LOGICO ;

se : SE '(' expressao ')' bloco (SENAO bloco)?;
faca : FACA bloco ENQUANTO '(' expressao ')';
enquanto : ENQUANTO '(' expressao ')' bloco;
para : PARA '('contador_para? (',' contador_para)* ';' expressao? ';' alteracaoValorVariavel? (',' alteracaoValorVariavel)* ')' bloco;

contador_para : tipo ID '=' expressao;

escolha : ESCOLHA'('expressao')''{' caso* (CASO CONTRARIO ':' comando*)? '}';
caso : CASO valor_constante ':' comando* PARE?;

bloco : '{' comando* '}' | comando;
comando : (dec_var | enquanto | alteracaoValorVariavel | se | chamada_funcao | faca | escolha | retorno | para | leia | escreva | LIMPA'('')' );
chamada_funcao : (id_consumo | chamada_funcao_biblioteca ) param_funcao;
chamada_funcao_biblioteca : id_consumo'.'ID ;
param_funcao: '(' (expressao (',' expressao)*)? ')'; 
retorno : RETORNE expressao;

alteracaoValorVariavel : atribuicao | id_consumo'++' | id_consumo'--';
atribuicao : id_consumo ('=' | '+=' | '-=' | '/=' | '*=' | '%=') expressao;
operador : SOMA | SUBTRACAO | DIVISAO | MULTIPLICACAO | MAIOR | MENOR | MAIOR_IGUAL | MENOR_IGUAL | DIFERENTE; 

/*
*Tokens Estruturais
*/
SE : 'se';
PONTO_VIRGULA: ';';
PONTO : '.';
VIRGULA : ',';
ABRE_CHAVE : '{';
FECHA_CHAVE : '}';
ABRE_COLCHETE : '[';
FECHA_COLCHETE : ']';
DOIS_PONTOS : ':';
ABRE_PARENTESES : '(';
FECHA_PARENTESES : ')';
ATRIBUICAO : '=';
PROGRAMA : 'programa';
VAZIO : 'vazio';
REAL_DECLARACAO : 'real';
LOGICO_DECLARACAO : 'logico';
CADEIA_DECLARACAO : 'cadeia';
INTEIRO_DECLARACAO : 'inteiro';
CARACTER_DECLARACAO : 'caracter';
ESCOLHA : 'escolha';
CASO : 'caso';
CONTRARIO: 'contrario';
CONST : 'const';
FUNCAO : 'funcao';
RETORNE : 'retorne';
PARA : 'para';
PARE : 'pare';
FACA : 'faca';
ENQUANTO : 'enquanto';
SENAO : 'senao';
INCLUA : 'inclua';
BIBLIOTECA : 'biblioteca';

/*
* IO
*/
LEIA : 'leia';
leia: LEIA'(' ID (',' ID)* ')';
ESCREVA : 'escreva';
escreva:  ESCREVA '(' lista_param ')';
LIMPA : 'limpa';
lista_param : expressao (',' expressao)* ;

/*
* Operadores Aritméticos
*/
SOMA : '+';
SUBTRACAO : '-';
MULTIPLICACAO : '*';
DIVISAO : '/';
MODULO : '%';
INCREMENTO : '++';
DECREMENTO : '--';
ATRIBUICAO_INCREMENTO : '+=';
ATRIBUICAO_DECREMENTO : '-=';
ATRIBUICAO_DIVISAO : '/=';
ATRIBUICAO_MULTIPLICAO : '*=';
ATRIBUICAO_MODULO : '%=';

/*
*Operadores Relacionais
*/
MAIOR : '>';
MENOR : '<';
MAIOR_IGUAL : '>=';
MENOR_IGUAL : '<=';
IGUAL : '==';
DIFERENTE : '!=';

/*
*Operadores L�gicos
*/
E : 'e';
OU : 'ou';
NAO : 'nao';

/*
*Operadores Bin�rios
*/

E_BINARIO : '&';
OU_BINARIO : '|';
NAO_BINARIO : '~';
SHIFT_DIREITA : '>>';
SHIFT_ESQUERDA : '<<';

/*
*Tipos
*/
INTEIRO : [0-9]+;
INTEIRO_HEXADECIMAL : '0'[xX][0-9A-Z]+;
INTEIRO_BINARIO : '0'[bB][01]+;
REAL : [0-9]+ '.'? [0-9]+;
CADEIA : '"' (. | '\"' | ESCAPES)*? '"' ;  
CARACTER : '\'' (. | ESCAPES | '\'' )? '\'';
LOGICO : 'verdadeiro' | 'falso';

fragment
ESCAPES : '\b' | '\n' | '\t' | '\f' | '\r' | '\\';

/*
*Variáveis e constantes
*/
ID : [A-Za-z][A-Za-z0-9_]*;

/*
*Identificador biblioteca
*/
ALIAS_BIBLIOTECA : '-->';

/*
*Coment�rios
*/
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip;

WS : [ \r\t\n]+ -> skip ;