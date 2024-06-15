package com.fint.tools.util

import scala.collection.mutable

trait NodeData[D] {
  def data: D
  def name: String
}

class Node[D] private[Node] (val data: NodeData[D]) {
  val edges = mutable.Map[String, Node[D]]()

  private def connect(node: Node[D]): Unit = {
    if(edges.contains(node.data.name)) {
      throw new IllegalArgumentException(s"Node ${node.data.name} already exists in the map")
    }
    edges += (node.data.name -> node)
  }
}

object Node {
  def apply[D](data: NodeData[D]): Node[D] = new Node(data)
  def connect[D](node1: Node[D], node2: Node[D]): Unit = {
    node1.connect(node2)
    node2.connect(node1)
  }
}

class Graph[D] {
  import Node._
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
        case Some(n2) => Node.connect(n1, n2)
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
