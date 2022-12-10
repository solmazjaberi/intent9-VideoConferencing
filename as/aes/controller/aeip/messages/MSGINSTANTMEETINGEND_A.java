package generatedbyassl.as.aes.controller.aeip.messages;

import java.io.Serializable;
import generatedbyassl.as.ASSLMESSAGE;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'msgInstantMeetingEnd_A' (specified as MESSAGE ASSL tier).
 */
public class MSGINSTANTMEETINGEND_A
	extends ASSLMESSAGE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MSGINSTANTMEETINGEND_A' class.
	 */
	static private MSGINSTANTMEETINGEND_A oInstance = null;
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
	private  MSGINSTANTMEETINGEND_A (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MSGINSTANTMEETINGEND_A' class.
	 */
	static public MSGINSTANTMEETINGEND_A getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MSGINSTANTMEETINGEND_A();
		}
		return oInstance;
	}

}