package rsk

class Header(var Name:String) {}

operator infix fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}