package com.fint.tools.llvmir

class Value(ftype: FType, val name: String = "") {}

class Constant(ftype: FType) extends Value(ftype) {
}
class BlockAddress extends Constant(FType.FBlockAddressTyID) {
}

class GlobalValue(ftype: FType) extends Constant(ftype)
class GlobalObject(ftype: FType) extends GlobalValue(ftype)
class GlobalVariable extends GlobalObject(FType.PointerTyID) {
}