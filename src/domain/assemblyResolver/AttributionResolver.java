package domain.assemblyResolver;

/**
 *
 * @author Felipe
 */
public class AttributionResolver extends DefaultResolver {

    private final String cmd;
    
    public AttributionResolver(String cmd) {
        this.cmd = cmd;
    }
    
    @Override
    public String resolve() {
        IResolver next = getNext();
        if(next == null)
            return cmd;
        
        return next.resolve() + cmd;
    }
    
}
