package com.starking.payment;

public interface PaymentService {

    PaymentResponse processPayment(PaymentRequest request);
}
