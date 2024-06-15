package com.fint.tools.llvmir

import com.fint.tools.util.NameIndexMap

class Argument(val ftype: FType) extends Value(ftype) {
}

class Function extends GlobalObject(FType.FunctionTyID) {
  val arguments = NameIndexMap[Argument]()
  val basicBlocks = NameIndexMap[BasicBlock]()

}