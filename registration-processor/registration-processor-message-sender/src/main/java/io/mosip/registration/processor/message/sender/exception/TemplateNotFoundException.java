package io.mosip.registration.processor.message.sender.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.processor.core.exception.util.PlatformErrorMessages;

/**
 * The Class TemplateNotFoundException.
 */
public class TemplateNotFoundException extends BaseUncheckedException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new template not found exception.
	 */
	public TemplateNotFoundException() {
		super();
	}

	/**
	 * Instantiates a new template not found exception.
	 *
	 * @param message
	 *            the message
	 */
	public TemplateNotFoundException(String message) {
		super(PlatformErrorMessages.RPR_TEM_NOT_FOUND.getCode(), message);
	}

	/**
	 * Instantiates a new template not found exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public TemplateNotFoundException(String message, Throwable cause) {
		super(PlatformErrorMessages.RPR_TEM_NOT_FOUND.getCode() + EMPTY_SPACE, message, cause);
	}

}
