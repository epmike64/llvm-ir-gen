package com.fint.tools.llvmir

class Use(val user: User, val value: Value) {
}


class User(typeId: FTypeId, use: Option[Use], val numOps: Int) extends Value(typeId, use) {
}

