package ucmis.m2t.generator;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * Eclipse application wrapper for MainGenerator to enable running with tycho-eclipserun-plugin.
 * 
 * @author Generated
 */
public class MainApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		
		// Call the MainGenerator.main() method
		MainGenerator.main(args);
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// Nothing to stop
	}
}
