package _09_07;

public class exercise52 {
	/*Попробуйте создать цикл while с меткой. 
	Сделайте метку внешней и укажите условие, чтобы проверить, 
	является ли переменная age меньше или равна 21. 
	В цикле увеличьте возраст на 1. Каждый раз, 
	когда программа проходит через цикл, проверьте, является ли Возраст 16. 
	Если это так, выведите сообщение "get your driver's license" и 
	продолжайте внешний цикл. Если нет, выведите " еще один год."*/
	public static void main(String[] args) {
		int age = 0; 
		{
			
			
		}
		outer:
		while (age <= 21) {
			age++;
			if(age==16) {
				System.out.println("get your driver's license");
				continue outer;
			}
			
				System.out.println("Another year");
		}
	}
}
