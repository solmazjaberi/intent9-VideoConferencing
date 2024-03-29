package generatedbyassl.as.autonomicnetwork.asself_management.self_configuring;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inRequestVideoConference_B' (specified as FLUENT ASSL tier).
 */
public class INREQUESTVIDEOCONFERENCE_B
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INREQUESTVIDEOCONFERENCE_B' class.
	 */
	static private INREQUESTVIDEOCONFERENCE_B oInstance = null;
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
	private  INREQUESTVIDEOCONFERENCE_B (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.autonomicnetwork.events.TIMETOREQUEST_B.getInstance() );
		generatedbyassl.as.autonomicnetwork.events.TIMETOREQUEST_B.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.autonomicnetwork.events.REQUEST_BPROCESSED.getInstance() );
		generatedbyassl.as.autonomicnetwork.events.REQUEST_BPROCESSED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INREQUESTVIDEOCONFERENCE_B' class.
	 */
	static public INREQUESTVIDEOCONFERENCE_B getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INREQUESTVIDEOCONFERENCE_B();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}