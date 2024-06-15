package com.fint.tools.llvmir

class PHINode(typeId: FTypeId, use: Use, numOps: Int, insertAtEnd: BasicBlock) extends Instruction(typeId, FInstrId.PHI, use, numOps, insertAtEnd) {

}
