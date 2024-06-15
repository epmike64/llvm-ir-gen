package com.fint.tools.llvmir

object FCompilationUnit {
  private var _regCounter = 0
  def nextRegID = {
      _regCounter += 1
      _regCounter
  }
}
