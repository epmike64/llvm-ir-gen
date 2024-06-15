package com.fint.tools.llvmir


enum BinaryOps(val opcode: Int) {
  case Add extends BinaryOps(13)
  case FAdd extends BinaryOps(14)
  case Sub extends BinaryOps(15)
  case FSub extends BinaryOps(16)
  case Mul extends BinaryOps(17)
  case FMul extends BinaryOps(18)
  case UDiv extends BinaryOps(19)
  case SDiv extends BinaryOps(20)
  case FDiv extends BinaryOps(21)
  case URem extends BinaryOps(22)
  case SRem extends BinaryOps(23)
  case FRem extends BinaryOps(24)
  case Shl extends BinaryOps(25)
  case LShr extends BinaryOps(26)
  case AShr extends BinaryOps(27)
  case And extends BinaryOps(28)
  case Or extends BinaryOps(29)
  case Xor extends BinaryOps(30)
}


class Instruction(val ftype: FType) extends Value(ftype) {
}
