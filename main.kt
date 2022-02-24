
//Exercicio 5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados. (DO WHILE)
/*
fun main() {
  
var soma = 0
  
do{
   print("Digite um número: ")
   val num = readLine()!!.toInt()

   soma += num
  
}while(num != 0)
   println("soma = $soma")

}*/


//Exercicio 1 -Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
/*
fun main() {

for(i in 1000..1999 step 1){
  if(i% 11 == 5){
   println("$i")
  }
}

}*/


//Exercicio 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
/*
fun main(){

  var idade = 0
  var pessoas21 = -1
  var pessoas50 = 0

  while(idade!=-99)
  {     
      print("Digite a sua idade ou digite -99 para sair: ")
      idade = readLine()!!.toInt()
    
      if(idade < 21){
        pessoas21++
        
      }else if(idade > 50){
        pessoas50++
      }
      
  }
    println("Total de pessoas com menos de 21 anos: $pessoas21")
    println("Total de pessoas com mais de 50 anos: $pessoas50")
  
   
}*/