package org.example.global;

import org.example.model.Toy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.example.global.Vars.winTxt;

public class MyFileWriter {

    public static void writeToy(Toy winnerToy) {
            String result_string = winnerToy.getName() + System.lineSeparator();
            List<String> winToy = new ArrayList<>();
            winToy.add(result_string);
            try {
                File myTxt = new File(winTxt);
                FileWriter fr = new FileWriter(myTxt);
                BufferedWriter br = new BufferedWriter(fr);

                br.write(winToy.toString());
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
