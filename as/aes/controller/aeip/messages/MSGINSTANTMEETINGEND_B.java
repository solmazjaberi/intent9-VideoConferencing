package generatedbyassl.as.aes.controller.aeip.messages;

import java.io.Serializable;
import generatedbyassl.as.ASSLMESSAGE;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'msgInstantMeetingEnd_B' (specified as MESSAGE ASSL tier).
 */
public class MSGINSTANTMEETINGEND_B
	extends ASSLMESSAGE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MSGINSTANTMEETINGEND_B' class.
	 */
	static private MSGINSTANTMEETINGEND_B oInstance = null;
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
	private  MSGINSTANTMEETINGEND_B (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MSGINSTANTMEETINGEND_B' class.
	 */
	static public MSGINSTANTMEETINGEND_B getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MSGINSTANTMEETINGEND_B();
		}
		return oInstance;
	}

}