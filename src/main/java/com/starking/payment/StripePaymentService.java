package com.starking.payment;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {


    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        return null;
    }
}
