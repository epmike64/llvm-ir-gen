package com.fint.tools.llvmir

class Value(ftype: FType, val name: String = "") {}

class User(ftype: FType) extends Value(ftype) {}

class Constant(ftype: FType) extends User(ftype) {
}

class GlobalValue(ftype: FType) extends Constant(ftype)
class GlobalObject(ftype: FType) extends GlobalValue(ftype)
class GlobalVariable extends GlobalObject(FType.PointerTyID) {
}