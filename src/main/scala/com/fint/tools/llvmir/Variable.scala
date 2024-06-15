package com.fint.tools.llvmir

class Value(typeID: Type, val name: String = "") {}

class User(typeID: Type) extends Value(typeID) {}

class Constant(typeID: Type) extends User(typeID) {
}

class GlobalValue(typeID: Type) extends Constant(typeID)
class GlobalObject(typeID: Type) extends GlobalValue(typeID)
class GlobalVariable extends GlobalObject(Type.PointerTyID) {
}