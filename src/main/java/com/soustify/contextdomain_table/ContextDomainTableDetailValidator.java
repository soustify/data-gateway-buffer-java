// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: context_domain_table_detail.proto

package com.soustify.contextdomain_table;


@SuppressWarnings("all")
public class ContextDomainTableDetailValidator {
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		
		if (clazz.equals(com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest.class)) return new ContextDomainTableDetailRequestValidator();
		return null;
	}


/**
	 * Validates {@code ContextDomainTableDetailRequest} protobuf objects.
	 */
	public static class ContextDomainTableDetailRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest> {
		
	
		
	
		
	
		
	
		
		private final com.soustify.contextdomain_table.ContextDomainTableDetail.Operation[] OPERATION__IN = new com.soustify.contextdomain_table.ContextDomainTableDetail.Operation[]{
			com.soustify.contextdomain_table.ContextDomainTableDetail.Operation.forNumber(0),
			com.soustify.contextdomain_table.ContextDomainTableDetail.Operation.forNumber(1),
			com.soustify.contextdomain_table.ContextDomainTableDetail.Operation.forNumber(2),
		};
	
	
	

	public void assertValid(com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.uuid(".contextdomain_table.ContextDomainTableDetailRequest.id", proto.getId());
	
			io.envoyproxy.pgv.StringValidation.uuid(".contextdomain_table.ContextDomainTableDetailRequest.transaction_id", proto.getTransactionId());
	
			io.envoyproxy.pgv.StringValidation.uuid(".contextdomain_table.ContextDomainTableDetailRequest.entity_id", proto.getEntityId());
	
			io.envoyproxy.pgv.StringValidation.minLength(".contextdomain_table.ContextDomainTableDetailRequest.entity_table", proto.getEntityTable(), 10);
	
			io.envoyproxy.pgv.CollectiveValidation.in(".contextdomain_table.ContextDomainTableDetailRequest.operation", proto.getOperation(), OPERATION__IN);
	
	
	}
}
}

