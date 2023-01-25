package kr.bomblock.kotlin_basic1

fun main(){
    Person("Denis", "Panjuta")

    var dneis = Person("Denis", "Panjuta")
    var john = Person()
}
//todo :constructor - 보조 생성자
// init - 객채가 나오자 마자 호출되는것 위의 코드가 실행되면 자동으로 출력 객채를 시작하기 위해서 사용


class Person(firstName: String = "John", lastName: String = "Doe"){
//constructor(firstName: String, lastName: String){

    //Initialzer Block
    init {
        println("Initialized a new Person object with" +
                "frirstName = $firstName and lastName = $lastName ")

    }

}