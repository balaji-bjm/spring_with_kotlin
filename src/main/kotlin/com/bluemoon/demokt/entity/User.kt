package com.bluemoon.demokt.entity

import org.hibernate.annotations.GeneratorType
import org.hibernate.annotations.GenericGenerator
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {
    @Id
    @GenericGenerator(name="gen",strategy="identity")
    @GeneratedValue(generator="gen")
    var id: Long = 0

    @Column(name="name")
    var name: String = "NA"

}