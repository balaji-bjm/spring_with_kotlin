package com.bluemoon.demokt.repo

import com.bluemoon.demokt.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : CrudRepository<User, Long> {
}