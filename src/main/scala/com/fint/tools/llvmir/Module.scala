package com.fint.tools.llvmir

import scala.collection.mutable

class LLVMContext(val targetTriple: String = "") {
  private val modules = mutable.Map[String, Module]()
  def addModule(m: Module):Unit = {
    if (modules.contains(m.moduleID)) {
      throw new IllegalArgumentException(s"Module with ID ${m.moduleID} already exists")
    }
    modules += (m.moduleID -> m)
  }
}

object Module {
  def apply(llvmContext: LLVMContext, moduleID: String, sourceFileName: String = "") = {
    new Module(llvmContext, moduleID, sourceFileName)
  }
}

class Module private (val llvmContext: LLVMContext, val moduleID: String, val sourceFileName: String) {
  private val functions = mutable.Map[String, Function]()
  private val globalVariables = mutable.Map[String, GlobalVariable]()
}
