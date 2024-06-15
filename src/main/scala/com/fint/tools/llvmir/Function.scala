package com.fint.tools.llvmir

import com.fint.tools.util.NameIndexMap

class Function extends GlobalObject(TypeID.FunctionTyID) {
  val arguments = NameIndexMap[Argument]()
  val basicBlocks = NameIndexMap[BasicBlock]()

}