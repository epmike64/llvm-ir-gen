package com.fint.tools.llvmir

import scala.collection.mutable

class LLVMContext(val targetTriple: String = "") {
  private val modules = mutable.Map[String, FModule]()
  def addModule(m: FModule):Unit = {
    if (modules.contains(m.moduleID)) {
      throw new IllegalArgumentException(s"Module with ID ${m.moduleID} already exists")
    }
    modules += (m.moduleID -> m)
  }
}

class FModule(val llvmContext: LLVMContext, val moduleID: String, val sourceFileName: String) {
  private val functions = mutable.Map[String, Function]()
  private val globalVariables = mutable.Map[String, GlobalVariable]()
}
