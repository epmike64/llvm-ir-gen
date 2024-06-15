package com.fint.tools.util

import scala.collection.mutable

trait NodeData[D] {
  def data: D
  def name: String
}

class Node[D] (val data: NodeData[D]) {
  private val chldEdges = mutable.Map[String, Node[D]]()
  private[util] def addChldEdge(node: Node[D]): Unit = {
    chldEdges += (node.data.name -> node)
  }
}

class Graph[D] {

  private val nodes = mutable.Map[String, Node[D]]()

  def addNode(data: NodeData[D]): Unit = {
    if(nodes.contains(data.name)) {
      throw new IllegalArgumentException(s"Node ${data.name} already exists in the map")
    }
    val node = Node(data)
    nodes += (node.data.name -> node)
  }

  def getNode(name: String): Option[Node[D]] = {
    nodes.get(name)
  }

  def connectNodes(node1: String, node2: String): Unit = {
    nodes.get(node1) match {
      case Some(n1) => nodes.get(node2) match {
        case Some(n2) => n1.addChldEdge(n2)
        case None => throw new IllegalArgumentException(s"Node $node2 does not exist in the map")
      }
      case None => throw new IllegalArgumentException(s"Node $node1 does not exist in the map")
    }
  }

  def size: Int = nodes.size

  def isEmpty: Boolean = nodes.isEmpty

  def nonEmpty: Boolean = nodes.nonEmpty

  def clear(): Unit = {
    nodes.clear()
  }

  def iterator: Iterator[Node[D]] = nodes.valuesIterator
}
