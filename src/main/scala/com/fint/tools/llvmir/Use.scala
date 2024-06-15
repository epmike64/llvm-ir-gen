package com.fint.tools.llvmir


class User extends Value(FType.FUserTyID) {
  val uses: List[Use] = List()
}

class Use(val user: User, val value: Value) {
}
