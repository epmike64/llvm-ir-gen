package com.fint.tools.llvmir

import scala.collection.mutable.ArrayBuffer


class BasicBlock (val llvmContext: LLVMContext, val blockLabel:String, val parent: Function, val insertBefore: BasicBlock) extends Value(FTypeId.FBasicBlockTyID) {
  private val instructions = ArrayBuffer[Instruction]()
}