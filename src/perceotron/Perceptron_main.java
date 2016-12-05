package perceotron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[] = {0.6, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);

		//�w�K�f�[�^
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};
		
		//�w�K
		int index;
		for(int i = 0; i < 100; i++){
		  index = (int)(Math.random()*4);
		  plib.getParameter(input[index], output[index]);
		  System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}
		//���ʊm�F
		for(int i = 0; i < output.length; i++){
		if(plib.getOutput(input[i]) == output[i])
		  System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		  else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
	    System.out.println("Check : nu = "+nu[0]+", "+nu[1]);



	}
//�w�K�f�[�^��output��AND���Z�̒l��(1�C0�C0�C0�j�ɕς����B�܂��Anu[]�̒l��{0.35�C0.2}�̂܂܂ł�nu�̕ω��������Ȃ������A�����nu�̌v�Z���ɂ��郢nu��
//�ω����Ȃ����߂ł���B����āAnu�̒l��ς��邱�Ƃɂ���ĕω����݂���B
}
