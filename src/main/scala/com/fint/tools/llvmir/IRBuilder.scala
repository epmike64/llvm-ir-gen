package com.fint.tools.llvmir

trait IRBuilder(val llvmContext: LLVMContext) {

  def setInsertPoint(bb: BasicBlock): Unit
  def createFAdd(lhs: Value, rhs: Value, name: String = ""): Value
  def createFSub(lhs: Value, rhs: Value, name: String = ""): Value
  def createFMul(lhs: Value, rhs: Value, name: String = ""): Value
  def createFCmpULT(lhs: Value, rhs: Value, name: String = ""): Value
  def CreateUIToFP(value: Value, destType: FType, name: String = ""): Value
}
