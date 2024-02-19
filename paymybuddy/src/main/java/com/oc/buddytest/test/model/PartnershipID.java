package com.oc.buddytest.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class PartnershipID implements Serializable {

    @Column(name = "user1Id")
    private long senderId;

    @Column(name = "user2Id")
    private long receiverId;

}
