package rsk

fun String.replaceMultipleWhiteSpace() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}