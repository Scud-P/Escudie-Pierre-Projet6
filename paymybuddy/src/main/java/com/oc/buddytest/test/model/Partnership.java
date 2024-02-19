package com.oc.buddytest.test.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

    @Data
    @Entity
    @Table(name = "partnership")
    public class Partnership {

        @EmbeddedId
        private PartnershipID id;
    }

