package com.fint.tools.llvmir

class Value(typeId: FTypeId, val name: String = "") {}

class Constant(typeId: FTypeId) extends Value(typeId) {
}
class BlockAddress extends Constant(FTypeId.FBlockAddressTyID) {
}

class GlobalValue(typeId: FTypeId) extends Constant(typeId)
class GlobalObject(typeId: FTypeId) extends GlobalValue(typeId)
class GlobalVariable extends GlobalObject(FTypeId.PointerTyID) {
}