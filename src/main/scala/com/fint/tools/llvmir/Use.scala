package com.fint.tools.llvmir


class User extends Value(FTypeId.FUserTyID) {
  val uses: List[Use] = List()
}

class Use(val user: User, val value: Value) {
}
