package com.amar.paymentservice.payment;



import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
