package com.fint.tools.llvmir

class Value(val typeId: FTypeId, use: Option[Use], val name: String = "") {
  val uses: List[Use] = List()
}

class Constant(typeId: FTypeId) extends Value(typeId, None) {
}

class BlockAddress extends Constant(FTypeId.FBlockAddressTyID) {
}

class GlobalValue(typeId: FTypeId) extends Constant(typeId)
class GlobalObject(typeId: FTypeId) extends GlobalValue(typeId)
class GlobalVariable extends GlobalObject(FTypeId.PointerTyID) {
}