package com.fint.tools.llvmir


class UnaryInstruction(typeId: FTypeId, instrId: FInstrId, use: Use, numOps: Int, insertAtEnd: BasicBlock) extends Instruction(typeId, instrId, use, numOps, insertAtEnd) {
}

class AllocaInstruction(typeId: FTypeId, use: Use, numOps: Int, insertAtEnd: BasicBlock) extends Instruction(typeId, FInstrId.Alloca, use, numOps, insertAtEnd) {
}

class PHINodeInstruction(typeId: FTypeId, use: Use, numOps: Int, insertAtEnd: BasicBlock) extends Instruction(typeId, FInstrId.PHI, use, numOps, insertAtEnd) {
}
