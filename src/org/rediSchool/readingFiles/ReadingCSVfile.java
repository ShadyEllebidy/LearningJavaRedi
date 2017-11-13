package org.rediSchool.readingFiles;

import org.rediSchool.exception.CSVexception;
import src.Student;

import java.io.*;
import java.util.*;

public class ReadingCSVfile {
    public static void main(String [] args){
        ReadingCSVfile csvReader = new ReadingCSVfile();
                throw new CSVexception("hi, We are expecting a csv file");
            } catch (CSVexception csVexception) {
                csVexception.printStackTrace();
            }
            return students;
        }

        try( BufferedReader reader= new BufferedReader(new FileReader(new File(path)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("name")) {
                    continue;
                }
                String[] studentAttributes = line.split(";");
                Student student = new Student(studentAttributes[0], studentAttributes[1], studentAttributes[2], studentAttributes[3], Integer.parseInt(studentAttributes[4]));
                students.add(student);
            }
        }   }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
