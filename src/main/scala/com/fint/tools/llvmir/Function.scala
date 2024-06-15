package com.fint.tools.llvmir

import com.fint.tools.util.NameIndexMap

class Argument(val typeID: Type) extends Value(typeID) {
}

class Function extends GlobalObject(Type.FunctionTyID) {
  val arguments = NameIndexMap[Argument]()
  val basicBlocks = NameIndexMap[BasicBlock]()

}