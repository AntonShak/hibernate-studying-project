package com.shakov.dao;

import com.shakov.entity.Payment;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import java.util.List;

import static com.shakov.entity.QPayment.payment;

public class PaymentRepository extends RepositoryBase<Long, Payment> {

    public PaymentRepository(EntityManager entityManager) {
        super(Payment.class, entityManager);
    }

    public List<Payment> findAllByReceiverId(Long receiverId) {
        return new JPAQuery<Payment>(getEntityManager())
                .select(payment)
                .from(payment)
                .where(payment.receiver.id.eq(receiverId))
                .fetch();

//        getEntityManager().createQuery("select p from Payment p where p.receiver.id = :receiverId", Payment.class)
//                .setParameter("receiverId", receiverId)
//                .getResultList();
    }
}











