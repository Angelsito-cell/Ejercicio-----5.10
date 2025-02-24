fun main() {
    val productos = listOf(
        Producto("Laptop", 1200.0),
        Producto("Mouse", 25.0),
        Producto("Teclado", 45.0)
    )

    val pedido = Pedido(productos)

    println("Total del pedido: ${pedido.calcularTotal()}€")
    println("Estado: ${pedido.estado}")
}
