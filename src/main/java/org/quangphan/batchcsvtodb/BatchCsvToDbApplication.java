package org.quangphan.batchcsvtodb;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class BatchCsvToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchCsvToDbApplication.class, args);
	}

}
