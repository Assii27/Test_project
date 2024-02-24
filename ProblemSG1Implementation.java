package com.patilcoding;


//filePath="D:\Interview\Coding\PatilCoding.pmf"

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class PMFRecord {
    private int code;
    private String data;

    public PMFRecord(int code, String data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "PMFRecord{" +
                "code=" + code +
                ", data='" + data + '\'' +
                '}';
    }
}

class PMFParser {
    public static List<PMFRecord> parsePMFFile(String filename) {
        List<PMFRecord> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int code = Integer.parseInt(line.substring(0, 1));
                String data = line.substring(1).trim();
                PMFRecord record = null;

                switch (code) {
                    case 1:
                        record = new PMFRecord(code, data);
                        break;
                    case 2:
                        record = new PMFRecord(code, data);
                        break;
                    case 3:
                        record = new PMFRecord(code, data.replace("_", "."));
                        break;
                }

                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return records;
    }
}

public class ProblemSG1Implementation {
    public static void main(String[] args) {
        String filename = "D:/Interview/Coding/PatilCoding.pmf";
        List<PMFRecord> records = PMFParser.parsePMFFile(filename);

        // Print the records
        for (PMFRecord record : records) {
            System.out.println(record);
        }
    }
}

