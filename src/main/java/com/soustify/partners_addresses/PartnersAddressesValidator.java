// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: partners_addresses.proto

package com.soustify.partners_addresses;


@SuppressWarnings("all")
public class PartnersAddressesValidator {
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		
		if (clazz.equals(com.soustify.partners_addresses.PartnersAddresses.Request.class)) return new RequestValidator();
		if (clazz.equals(com.soustify.partners_addresses.PartnersAddresses.Response.class)) return new ResponseValidator();
		return null;
	}


/**
	 * Validates {@code Request} protobuf objects.
	 */
	public static class RequestValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.partners_addresses.PartnersAddresses.Request> {
		
	
		
	
		
	
	
	

	public void assertValid(com.soustify.partners_addresses.PartnersAddresses.Request proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Request.id_partner", proto.getIdPartner());
	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Request.id_address", proto.getIdAddress());
	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Request.id", proto.getId());
	
	
	}
}
/**
	 * Validates {@code Response} protobuf objects.
	 */
	public static class ResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.partners_addresses.PartnersAddresses.Response> {
		
	
		
	
		
	
		
	
	
	

	public void assertValid(com.soustify.partners_addresses.PartnersAddresses.Response proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Response.id", proto.getId());
	// no validation rules for Status

	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Response.id_partner", proto.getIdPartner());
	
			io.envoyproxy.pgv.StringValidation.uuid(".partners_addresses.Response.id_address", proto.getIdAddress());
	
	
	}
}
}

