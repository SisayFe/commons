package io.mosip.registration.processor.bio.dedupe.request.validator;

import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.mosip.registration.processor.bio.dedupe.abis.dto.BioDedupeResponseDTO;

/**
 * The Class BioDedupeReqRespJsonSerializer.
 * @author Rishabh Keshari
 */
public class BioDedupeReqRespJsonSerializer implements JsonSerializer<BioDedupeResponseDTO> {

	/* (non-Javadoc)
	 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
	 */
	@Override
	public JsonElement serialize(BioDedupeResponseDTO src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject object = new JsonObject();
	        object.add("id", context.serialize(src.getId()));
	        object.add("version", context.serialize(src.getVersion()));
	        object.add("timestamp", context.serialize(src.getTimestamp()));
	        object.add("response", context.serialize(src.getFile()));
	        object.add("error", context.serialize(src.getError()));
	        return object;
	}

}