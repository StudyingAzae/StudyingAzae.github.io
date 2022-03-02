package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 213084
 *
 */
public class fileSearch {
    public static void main(String[] args){
        try{
            System.out.println("fileSearch 시작");
            String path = "C:\\Swaf-IDE\\workspace\\sfrs-web\\src\\main\\nxui17\\SALRET\\";
            String fileNm = "SALRET0001.xfdl";
            // 파일 객체 생성
            File file = new File(path + fileNm);
            // 파일 입력스트림 생성
            FileReader fileReader = new FileReader(file);
            // 입력버퍼 새성
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // 출력 문자열
            String result = "";
            // 문자열 찾기
            String line = "";
            String newFileNm = "";
            while ((line = bufferedReader.readLine()) != null){
                if (line.contains("NXCore")){ // 찾을 문자
                    newFileNm = fileNm + "_NXCore"; // 신규파일 명
                    result += line + "\n";
                }
            }
            
            // new파일 객체 생성
            File newFile = new File(path + newFileNm);
            // 파일 출력스트림 생성
            FileWriter fileWriter = new FileWriter(newFile);
            // 출력버퍼 생성
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
            if (newFile.isFile()){
                bufferedWriter.write(result);
            }
            
            fileReader.close();
            bufferedReader.close();
            bufferedWriter.close();
            
            System.out.println("fileSearch 끝");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
        }
    }
}
