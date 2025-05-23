// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: roles_policies.proto

package com.soustify.roles_policies;


@SuppressWarnings("all")
public class RolesPoliciesValidator {
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		
		if (clazz.equals(com.soustify.roles_policies.RolesPolicies.Request.class)) return new RequestValidator();
		if (clazz.equals(com.soustify.roles_policies.RolesPolicies.Response.class)) return new ResponseValidator();
		return null;
	}


/**
	 * Validates {@code Request} protobuf objects.
	 */
	public static class RequestValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.roles_policies.RolesPolicies.Request> {
		
	
		
	
		
	
	
	

	public void assertValid(com.soustify.roles_policies.RolesPolicies.Request proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Request.id_role", proto.getIdRole());
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Request.id_policy", proto.getIdPolicy());
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Request.id", proto.getId());
	
	
	}
}
/**
	 * Validates {@code Response} protobuf objects.
	 */
	public static class ResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.roles_policies.RolesPolicies.Response> {
		
	
		
	
		
	
		
	
		
	
	
	

	public void assertValid(com.soustify.roles_policies.RolesPolicies.Response proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Response.id_role", proto.getIdRole());
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Response.id_policy", proto.getIdPolicy());
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Response.id_auditable", proto.getIdAuditable());
	
			io.envoyproxy.pgv.StringValidation.uuid(".roles_policies.Response.id", proto.getId());
	// no validation rules for Status

	
	
	}
}
}

