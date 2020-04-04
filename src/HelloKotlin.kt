fun main() {
    var a: Int = 123
    var b: Int? = null // 변수에 값이 할당되지 않았다는 것을 정보로 활용하는 경우 (nullable 변수)

    var intValue:Int = 1234 // 32bit 10 진수
    var longValue:Long = 1234L // 64bint 10 진수
    var intValueByHex:Int = 0x1af // 16진수
    var intValueByBin:Int = 0b10110110 // 2진수
    // 8진수 지원 X
    
    var doubleValue:Double = 123.5
    var doubleValueWithExp:Double = 123.5e10
    var floatValue:Float = 123.5f

    //UTF-16BE
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    val stringValue = "one lint string test"

    println(a)
}

//Kotlin comment = C/C++ comment
// semi colon not using
// ClassName 파스칼 표기법
// functionName
// var, val(const)
// runtime 시, 변경하면 안되는 값 = val
// class 에 선언 된 변수 : property
// Scope 내에 선언 : local variable
// Kotlin 이 고전적인 언어들과 크게 다른점, 고전적인 언어들은 변수가 선언된 후 초기화되지않으면 null 값을 가지게 됨
// Kotlin 의 경우 기본 변수에서 null 을 허용하지 않으면 또한 변수의 값을 할당하지 않은채로 사용하면 문법에러를 나타내고
// 컴파일을 막아줌 -> 의도치않은 동작이나 null pointer exception 원천 차단
// 선언된 변수는 사용하기 전에 초기화를 하면 됌
// Primitive Type (기본 자료형)