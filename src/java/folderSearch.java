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
public class folderSearch {
    public static void main(String[] args){
        try{
            System.out.println("folderSearch 시작");
            
            // 폴더 내 파일 객체 배열 생성
            String path = "D:\\egov\\dev\\sfsystem\\src\\main\\webapp\\mi\\FIN\\AST\\";
            File folder = new File(path);
            File[] fileList = folder.listFiles();

            // 파일 갯수만큼 
            for (File file : fileList){
                if(file.isFile() && file.canRead()){
                    // 파일명
                    String fileNm = file.getName();
                    // 출력 문자열
                    String result = "";
                    
                    // 파일 입력스트림 생성
                    FileReader fileReader = new FileReader(file);
                    // 입력버퍼 새성
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    
                    // 문자열 찾기
                    String line = "";
                    String newFileNm = "";
                    while ((line = bufferedReader.readLine()) != null){
                        if (line.contains("출력")){ // 찾을 문자
                            newFileNm = fileNm + "_NXCore"; // 신규파일 명
                            result += line + "\n";
                        }
                    }
                    
                    if (!result.isEmpty()){
                        System.out.println("folderSearch : " + fileNm);
                        // new파일 객체 생성
                        File newFile = new File(path + "copy\\" + newFileNm);
                        // 파일 출력스트림 생성
                        FileWriter fileWriter = new FileWriter(newFile);
                        // 출력버퍼 생성
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    
                        if (newFile.isFile()){
                            bufferedWriter.write(result);
                        }
                        
                        // writer close
                        //fileWriter.close();
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                    // reader close
                    fileReader.close();
                    bufferedReader.close();
                    
                }
            }
            
            System.out.println("folderSearch 끝");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
        }
    }
}
