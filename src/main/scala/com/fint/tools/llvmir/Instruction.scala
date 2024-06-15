package com.fint.tools.llvmir

enum TermOps(val opcode: Int) {
  case Ret extends TermOps(1)
  case Br extends TermOps(2)
  case Switch extends TermOps(3)
  case IndirectBr extends TermOps(4)
  case Invoke extends TermOps(5)
  case Resume extends TermOps(6)
  case Unreachable extends TermOps(7)
  case CleanupRet extends TermOps(8)
  case CatchRet extends TermOps(9)
  case CatchSwitch extends TermOps(10)
  case CallBr extends TermOps(11)
}

enum UnaryOps(val opcode: Int) {
  case FNeg extends UnaryOps(12)
}

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

enum MemoryOps(val opcode: Int) {
  case Alloca extends MemoryOps(31)
  case Load extends MemoryOps(32)
  case Store extends MemoryOps(33)
  case GetElementPtr extends MemoryOps(34)
  case Fence extends MemoryOps(35)
  case AtomicCmpXchg extends MemoryOps(36)
  case AtomicRMW extends MemoryOps(37)
}

enum CastOps(val opcode: Int) {
  case Trunc extends CastOps(38)
  case ZExt extends CastOps(39)
  case SExt extends CastOps(40)
  case FPToUI extends CastOps(41)
  case FPToSI extends CastOps(42)
  case UIToFP extends CastOps(43)
  case SIToFP extends CastOps(44)
  case FPTrunc extends CastOps(45)
  case FPExt extends CastOps(46)
  case PtrToInt extends CastOps(47)
  case IntToPtr extends CastOps(48)
  case BitCast extends CastOps(49)
  case AddrSpaceCast extends CastOps(50)
}

enum FuncletPadOps(val opcode: Int) {
  case CleanupPad extends FuncletPadOps(51)
  case CatchPad extends FuncletPadOps(52)
}

enum OtherOps(val opcode: Int) {
  case ICmp extends OtherOps(53)
  case FCmp extends OtherOps(54)
  case PHI extends OtherOps(55)
  case Call extends OtherOps(56)
  case Select extends OtherOps(57)
  case UserOp1 extends OtherOps(58)
  case UserOp2 extends OtherOps(59)
  case VAArg extends OtherOps(60)
  case ExtractElement extends OtherOps(61)
  case InsertElement extends OtherOps(62)
  case ShuffleVector extends OtherOps(63)
  case ExtractValue extends OtherOps(64)
  case InsertValue extends OtherOps(65)
  case LandingPad extends OtherOps(66)
}

class Instruction(val ftype: FType) extends Value(ftype) {
}
