package util;
import java.util.Random;
public class NameCreator {
	 public static String createName(){
	        String line = "��Ǯ��������֣��������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ�" +
	                "�������˸��ɷ�����³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��" +
	                "Ƥ���뿵����Ԫ������ƽ�ƺ�������Ҧ��տ����ë����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������" +
	                "������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�����������Ĳ��﷮��";
	        Random random = new Random();
	        String name = line.charAt(random.nextInt(line.length()))+"";
	        for(int i= 1+random.nextInt(2);i>0;i--){
	            name+=line.charAt(random.nextInt(line.length()))+"";
	        }
	        return name;
	    }

}
