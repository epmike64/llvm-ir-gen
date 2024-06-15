package com.fint.tools.llvmir

import scala.collection.mutable.ArrayBuffer

object BasicBlock {

  def create(blockLabel:String, parent: Function = null, insertBefore: BasicBlock = null) = {
    new BasicBlock(blockLabel, parent, insertBefore)
  }
}

class BasicBlock private(val blockLabel:String, val parent: Function, val insertBefore: BasicBlock) extends Value(TypeID.FlintBasicBlockTyID) {
  val instructions = ArrayBuffer[Instruction]()
}