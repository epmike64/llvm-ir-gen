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

enum OpsClass(val opcode: Int) {
  case TerminatorOps extends OpsClass(1)
  case UnaryOps extends OpsClass(2)
  case BinaryOps extends OpsClass(3)
  case MemoryOps extends OpsClass(4)
  case CastOps extends OpsClass(5)
  case FuncletPadOps extends OpsClass(6)
  case OtherOps extends OpsClass(7)
}


enum FInstrId(val opcode: Int, opsClass: OpsClass) {
  case Ret extends FInstrId(1, OpsClass.TerminatorOps)
  case Br extends FInstrId(2, OpsClass.TerminatorOps)
  case Switch extends FInstrId(3, OpsClass.TerminatorOps)
  case IndirectBr extends FInstrId(4, OpsClass.TerminatorOps)
  case Invoke extends FInstrId(5, OpsClass.TerminatorOps)
  case Resume extends FInstrId(6, OpsClass.TerminatorOps)
  case Unreachable extends FInstrId(7, OpsClass.TerminatorOps)
  case CleanupRet extends FInstrId(8, OpsClass.TerminatorOps)
  case CatchRet extends FInstrId(9, OpsClass.TerminatorOps)
  case CatchSwitch extends FInstrId(10, OpsClass.TerminatorOps)
  case CallBr extends FInstrId(11, OpsClass.TerminatorOps)
  case FNeg extends FInstrId(12, OpsClass.UnaryOps)
  case Add extends FInstrId(13, OpsClass.BinaryOps)
  case FAdd extends FInstrId(14, OpsClass.BinaryOps)
  case Sub extends FInstrId(15, OpsClass.BinaryOps)
  case FSub extends FInstrId(16, OpsClass.BinaryOps)
  case Mul extends FInstrId(17, OpsClass.BinaryOps)
  case FMul extends FInstrId(18, OpsClass.BinaryOps)
  case UDiv extends FInstrId(19, OpsClass.BinaryOps)
  case SDiv extends FInstrId(20, OpsClass.BinaryOps)
  case FDiv extends FInstrId(21, OpsClass.BinaryOps)
  case URem extends FInstrId(22, OpsClass.BinaryOps)
  case SRem extends FInstrId(23, OpsClass.BinaryOps)
  case FRem extends FInstrId(24, OpsClass.BinaryOps)
  case Shl extends FInstrId(25, OpsClass.BinaryOps)
  case LShr extends FInstrId(26, OpsClass.BinaryOps)
  case AShr extends FInstrId(27, OpsClass.BinaryOps)
  case And extends FInstrId(28, OpsClass.BinaryOps)
  case Or extends FInstrId(29, OpsClass.BinaryOps)
  case Xor extends FInstrId(30, OpsClass.BinaryOps)
  case Alloca extends FInstrId(31, OpsClass.MemoryOps)
  case Load extends FInstrId(32, OpsClass.MemoryOps)
  case Store extends FInstrId(33, OpsClass.MemoryOps)
  case GetElementPtr extends FInstrId(34, OpsClass.MemoryOps)
  case Fence extends FInstrId(35, OpsClass.MemoryOps)
  case AtomicCmpXchg extends FInstrId(36, OpsClass.MemoryOps)
  case AtomicRMW extends FInstrId(37, OpsClass.MemoryOps)
  case Trunc extends FInstrId(38, OpsClass.CastOps)
  case ZExt extends FInstrId(39, OpsClass.CastOps)
  case SExt extends FInstrId(40, OpsClass.CastOps)
  case FPToUI extends FInstrId(41, OpsClass.CastOps)
  case FPToSI extends FInstrId(42, OpsClass.CastOps)
  case UIToFP extends FInstrId(43, OpsClass.CastOps)
  case SIToFP extends FInstrId(44, OpsClass.CastOps)
  case FPTrunc extends FInstrId(45, OpsClass.CastOps)
  case FPExt extends FInstrId(46, OpsClass.CastOps)
  case PtrToInt extends FInstrId(47, OpsClass.CastOps)
  case IntToPtr extends FInstrId(48, OpsClass.CastOps)
  case BitCast extends FInstrId(49, OpsClass.CastOps)
  case AddrSpaceCast extends FInstrId(50, OpsClass.CastOps)
  case CleanupPad extends FInstrId(51, OpsClass.FuncletPadOps)
  case CatchPad extends FInstrId(52, OpsClass.FuncletPadOps)
  case ICmp extends FInstrId(53, OpsClass.OtherOps)
  case FCmp extends FInstrId(54, OpsClass.OtherOps)
  case PHI extends FInstrId(55, OpsClass.OtherOps)
  case Call extends FInstrId(56, OpsClass.OtherOps)
  case Select extends FInstrId(57, OpsClass.OtherOps)
  case UserOp1 extends FInstrId(58, OpsClass.OtherOps)
  case UserOp2 extends FInstrId(59, OpsClass.OtherOps)
  case VAArg extends FInstrId(60, OpsClass.OtherOps)
  case ExtractElement extends FInstrId(61, OpsClass.OtherOps)
  case InsertElement extends FInstrId(62, OpsClass.OtherOps)
  case ShuffleVector extends FInstrId(63, OpsClass.OtherOps)
  case ExtractValue extends FInstrId(64, OpsClass.OtherOps)
  case InsertValue extends FInstrId(65, OpsClass.OtherOps)
  case LandingPad extends FInstrId(66, OpsClass.OtherOps)
}


class Instruction(val typeId: FTypeId, val instrId: FInstrId, val use: Use, val numOps: Int, val insertAtEnd: BasicBlock) extends Value(typeId) {
}
