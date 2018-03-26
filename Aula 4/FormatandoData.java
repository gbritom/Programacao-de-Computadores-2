package br.com.prog2.aula4;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author Gabriel Melandes
 */
public class FormatandoData {

	public static void main(String[] args) {
		System.out.println("#	Teste nº 01	#");
		Date dataHoje1 = new Date();
		System.out.println(dataHoje1);

		System.out.println("#	Teste nº 02	#");
		Date dataHoje2 = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");// use MM e não mm
		System.out.println("Data: " + sf.format(dataHoje2));

		System.out.println("#	Teste nº 03	#");
		Instant dataHoje3 = Instant.now();
		System.out.println(dataHoje3);

		System.out.println("#	Teste nº 04	#");
		ZoneId fusoHorarioJapao = ZoneId.of("Asia/Tokyo");
		ZonedDateTime agoraNoJapao = ZonedDateTime.now(fusoHorarioJapao);
		System.out.println(agoraNoJapao);

	}

}
