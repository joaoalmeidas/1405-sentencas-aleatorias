import java.security.SecureRandom;

public class Sentencas {

	public static void main(String[] args) {
		
		final String[] artigo = {"the", "a", "one", "some", "any"};
		final String[] substantivo = {"boy", "girl", "dog", "town", "car"};
		final String[] verbo = {"drove", "jumped", "ran", "walked", "skipped"};
		final String[] preposicao = {"to", "from", "over", "under", "on"};
		
		SecureRandom aleatorio = new SecureRandom();
		
		for(int i = 0; i < 20; i++) {
			
			String frase = "";
			
			frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
			
			frase += substantivo[aleatorio.nextInt(substantivo.length)] + " ";
			
			frase += verbo[aleatorio.nextInt(verbo.length)] + " ";
			
			frase += preposicao[aleatorio.nextInt(preposicao.length)] + " ";
			
			frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
			
			frase += substantivo[aleatorio.nextInt(substantivo.length)] + " ";
			
			System.out.println(frase);
		}
		
	}

}
