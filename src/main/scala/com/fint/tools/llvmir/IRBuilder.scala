package com.fint.tools.llvmir

trait IRBuilder(val llvmContext: LLVMContext) {

  def setInsertPoint(bb: BasicBlock): Unit
}
