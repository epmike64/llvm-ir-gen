package com.fint.tools.llvmir

import com.fint.tools.util.NameIndexMap

class Argument(val typeId: FTypeId) extends Value(typeId) {
}

class Function extends GlobalObject(FTypeId.FunctionTyID) {
  val arguments = NameIndexMap[Argument]()
  val basicBlocks = NameIndexMap[BasicBlock]()

}