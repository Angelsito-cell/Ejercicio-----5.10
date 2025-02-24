class Pedido(private val productos: List<Producto>, var estado: EstadoPedido = EstadoPedido.PENDIENTE) {
    fun calcularTotal(): Double = productos.sumOf { it.precio }
}
