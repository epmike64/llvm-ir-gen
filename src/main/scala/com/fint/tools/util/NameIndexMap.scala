package com.fint.tools.util

import scala.collection.mutable


class NameIndexMap[A] {
  private val nameMap: mutable.Map[String, A] = mutable.Map()
  private val indexMap: mutable.Map[Int, A] = mutable.Map()

  def put(name: String, value: A): Unit = {
    if(nameMap.contains(name)) {
      throw new IllegalArgumentException(s"Name $name already exists in the map")
    }
    nameMap += (name -> value)
    indexMap += (indexMap.size -> value)
  }

  def getByName(name: String): Option[A] = {
    nameMap.get(name)
  }

  def getByIndex(index: Int): Option[A] = {
    indexMap.get(index)
  }

  def size: Int = nameMap.size

  def isEmpty: Boolean = nameMap.isEmpty

  def nonEmpty: Boolean = nameMap.nonEmpty

  def clear(): Unit = {
    nameMap.clear()
    indexMap.clear()
  }

  def iterator: Iterator[A] = indexMap.valuesIterator
}
