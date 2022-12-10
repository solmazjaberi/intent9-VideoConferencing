package generatedbyassl.as.aes.user_a.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Request_ASent' (specified as EVENT ASSL tier).
 */
public class REQUEST_ASENT
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'REQUEST_ASENT' class.
	 */
	static private REQUEST_ASENT oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  REQUEST_ASENT (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'REQUEST_ASENT' class.
	 */
	static public REQUEST_ASENT getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new REQUEST_ASENT();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Initialises the event after the system has been started.
	 */
	public synchronized void postStartInit (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
	}

}