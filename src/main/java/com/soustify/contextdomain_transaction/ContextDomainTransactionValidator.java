// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: context_domain_transaction.proto

package com.soustify.contextdomain_transaction;


@SuppressWarnings("all")
public class ContextDomainTransactionValidator {
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		
		if (clazz.equals(com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest.class)) return new ContextDomainTransactionRequestValidator();
		return null;
	}


/**
	 * Validates {@code ContextDomainTransactionRequest} protobuf objects.
	 */
	public static class ContextDomainTransactionRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest> {
		
	
		
	
		
	
	
	

	public void assertValid(com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".contextdomain_transaction.ContextDomainTransactionRequest.id", proto.getId());
	
			io.envoyproxy.pgv.StringValidation.uuid(".contextdomain_transaction.ContextDomainTransactionRequest.user_id", proto.getUserId());
	
			io.envoyproxy.pgv.StringValidation.minLength(".contextdomain_transaction.ContextDomainTransactionRequest.user_pool", proto.getUserPool(), 10);
	
	
	}
}
}

