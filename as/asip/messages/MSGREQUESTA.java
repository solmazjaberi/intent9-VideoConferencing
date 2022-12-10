package generatedbyassl.as.asip.messages;

import java.io.Serializable;
import generatedbyassl.as.ASSLMESSAGE;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'msgRequestA' (specified as MESSAGE ASSL tier).
 */
public class MSGREQUESTA
	extends ASSLMESSAGE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MSGREQUESTA' class.
	 */
	static private MSGREQUESTA oInstance = null;
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
	private  MSGREQUESTA (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MSGREQUESTA' class.
	 */
	static public MSGREQUESTA getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MSGREQUESTA();
		}
		return oInstance;
	}

}