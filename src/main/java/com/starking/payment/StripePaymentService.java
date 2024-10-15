package com.starking.payment;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        PaymentResponse response = new PaymentResponse();
        response.setSuccess(true);
        response.setTransactionId("txn_123456789");
        response.setMessage("Pagamento realizado com sucesso.");
        return response;
    }
}
