package com.fint.tools.llvmir

import scala.collection.mutable.ArrayBuffer

class LLVMContext(val targetTriple: String = "") {
  val modules = ArrayBuffer[Module]()
}

object Module {
  def create(llvmContext: LLVMContext, moduleID: String, sourceFileName: String = "") = {
    val m = new Module(llvmContext, moduleID, sourceFileName)
    llvmContext.modules += m
    m
  }
}

class Module private (val llvmContext: LLVMContext, val moduleID: String, val sourceFileName: String) {
  val functions = ArrayBuffer[Function]()
  val globalVariables = ArrayBuffer[GlobalVariable]()
}
