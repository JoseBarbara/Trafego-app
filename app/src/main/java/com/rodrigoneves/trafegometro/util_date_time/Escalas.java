package com.rodrigoneves.trafegometro.util_date_time;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Arrays;

public class Escalas {

    private static final DateTime DATE_START = new DateTime(1900, 1, 1, 0, 0);
    private static final String[] COUNT =
            {"1ª ", "2ª ", "3ª ", "4ª ", "5ª ", "6ª ", "1ª de 1 ", "1ª de 3 ", "2ª de 3 ", "3ª de 3 "};
    private static final String[] LETRAS =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    private String[] posicao4x2x4;
    private String[] posicao4x1;
    private String[] posicao6x1x2x3;

    public void updateDate(DateTime dateEnd) {

        int d = Days.daysBetween(DATE_START, dateEnd).getDays();

        int escalaDezDias = d % 10;
        switch (escalaDezDias) {
            case 0:
                posicao4x2x4 = new String[]{COUNT[3] + LETRAS[0], COUNT[1] + LETRAS[2], COUNT[1] + LETRAS[4], COUNT[3] + LETRAS[1], COUNT[1] + LETRAS[3]};
                break;
            case 1:
                posicao4x2x4 = new String[]{COUNT[0] + LETRAS[1], COUNT[2] + LETRAS[2], COUNT[0] + LETRAS[0], COUNT[0] + LETRAS[4], COUNT[2] + LETRAS[3]};
                break;
            case 2:
                posicao4x2x4 = new String[]{COUNT[1] + LETRAS[1], COUNT[3] + LETRAS[2], COUNT[1] + LETRAS[0], COUNT[1] + LETRAS[4], COUNT[3] + LETRAS[3]};
                break;
            case 3:
                posicao4x2x4 = new String[]{COUNT[2] + LETRAS[1], COUNT[0] + LETRAS[3], COUNT[0] + LETRAS[2], COUNT[0] + LETRAS[0], COUNT[2] + LETRAS[4]};
                break;
            case 4:
                posicao4x2x4 = new String[]{COUNT[3] + LETRAS[1], COUNT[1] + LETRAS[3], COUNT[1] + LETRAS[2], COUNT[1] + LETRAS[0], COUNT[3] + LETRAS[4]};
                break;
            case 5:
                posicao4x2x4 = new String[]{COUNT[0] + LETRAS[4], COUNT[2] + LETRAS[3], COUNT[0] + LETRAS[1], COUNT[2] + LETRAS[0], COUNT[0] + LETRAS[2]};
                break;
            case 6:
                posicao4x2x4 = new String[]{COUNT[1] + LETRAS[4], COUNT[3] + LETRAS[3], COUNT[1] + LETRAS[1], COUNT[3] + LETRAS[0], COUNT[1] + LETRAS[2]};
                break;
            case 7:
                posicao4x2x4 = new String[]{COUNT[0] + LETRAS[0], COUNT[0] + LETRAS[4], COUNT[0] + LETRAS[3], COUNT[0] + LETRAS[1], COUNT[2] + LETRAS[2]};
                break;
            case 8:
                posicao4x2x4 = new String[]{COUNT[1] + LETRAS[0], COUNT[1] + LETRAS[4], COUNT[1] + LETRAS[3], COUNT[1] + LETRAS[1], COUNT[3] + LETRAS[2]};
                break;
            default:
                posicao4x2x4 = new String[]{COUNT[2] + LETRAS[0], COUNT[0] + LETRAS[2], COUNT[0] + LETRAS[4], COUNT[2] + LETRAS[1], COUNT[0] + LETRAS[3]};
                break;
        }

        int escalaDozeDias = d % 12;
        switch (escalaDozeDias) {
            case 0:
                posicao4x1 = new
                        String[]{COUNT[0] + LETRAS[5], COUNT[1] + LETRAS[6], COUNT[0] + LETRAS[9], COUNT[1] + LETRAS[10], COUNT[7] + LETRAS[7], COUNT[7] + LETRAS[11]};
                posicao6x1x2x3 = new String[]
                        {COUNT[1] + LETRAS[0], COUNT[5] + LETRAS[3], COUNT[3] + LETRAS[4], COUNT[0] + LETRAS[1], COUNT[7] + LETRAS[5], COUNT[9] + LETRAS[2]};
                break;
            case 1:
                posicao4x1 = new String[]{COUNT[1] + LETRAS[5], COUNT[2] + LETRAS[6], COUNT[1] + LETRAS[9], COUNT[2] + LETRAS[10], COUNT[8] + LETRAS[7], COUNT[8] + LETRAS[11]};
                posicao6x1x2x3 = new String[]
                        {COUNT[2] + LETRAS[0], COUNT[0] + LETRAS[2], COUNT[4] + LETRAS[4], COUNT[1] + LETRAS[1], COUNT[6] + LETRAS[3], COUNT[8] + LETRAS[5]};
                break;
            case 2:
                posicao4x1 = new String[]{COUNT[2] + LETRAS[5], COUNT[3] + LETRAS[6], COUNT[2] + LETRAS[9], COUNT[3] + LETRAS[10], COUNT[9] + LETRAS[7], COUNT[9] + LETRAS[11]};
                posicao6x1x2x3 = new String[]
                        {COUNT[3] + LETRAS[0], COUNT[1] + LETRAS[2], COUNT[5] + LETRAS[4], COUNT[0] + LETRAS[3], COUNT[7] + LETRAS[1], COUNT[9] + LETRAS[5]};
                break;
            case 3:
                posicao4x1 = new String[]{COUNT[3] + LETRAS[5], COUNT[0] + LETRAS[7], COUNT[3] + LETRAS[9], COUNT[0] + LETRAS[11], COUNT[6] + LETRAS[6], COUNT[6] + LETRAS[10]};
                posicao6x1x2x3 = new String[]
                        {COUNT[4] + LETRAS[0], COUNT[2] + LETRAS[2], COUNT[0] + LETRAS[5], COUNT[1] + LETRAS[3], COUNT[8] + LETRAS[1], COUNT[6] + LETRAS[4]};
                break;
            case 4:
                posicao4x1 = new String[]{COUNT[0] + LETRAS[6], COUNT[1] + LETRAS[7], COUNT[0] + LETRAS[10], COUNT[1] + LETRAS[11], COUNT[7] + LETRAS[5], COUNT[7] + LETRAS[9]};
                posicao6x1x2x3 = new String[]
                        {COUNT[5] + LETRAS[0], COUNT[3] + LETRAS[2], COUNT[1] + LETRAS[5], COUNT[0] + LETRAS[4], COUNT[9] + LETRAS[1], COUNT[7] + LETRAS[3]};
                break;
            case 5:
                posicao4x1 = new String[]{COUNT[1] + LETRAS[6], COUNT[2] + LETRAS[7], COUNT[1] + LETRAS[10], COUNT[2] + LETRAS[11], COUNT[8] + LETRAS[5], COUNT[8] + LETRAS[9]};
                posicao6x1x2x3 = new String[]
                        {COUNT[0] + LETRAS[1], COUNT[4] + LETRAS[2], COUNT[2] + LETRAS[5], COUNT[1] + LETRAS[4], COUNT[6] + LETRAS[0], COUNT[8] + LETRAS[3]};
                break;
            case 6:
                posicao4x1 = new String[]{COUNT[2] + LETRAS[6], COUNT[3] + LETRAS[7], COUNT[2] + LETRAS[10], COUNT[3] + LETRAS[11], COUNT[9] + LETRAS[5], COUNT[9] + LETRAS[9]};
                posicao6x1x2x3 = new String[]
                        {COUNT[1] + LETRAS[1], COUNT[5] + LETRAS[2], COUNT[3] + LETRAS[5], COUNT[0] + LETRAS[0], COUNT[7] + LETRAS[4], COUNT[9] + LETRAS[3]};
                break;
            case 7:
                posicao4x1 = new String[]{COUNT[0] + LETRAS[5], COUNT[3] + LETRAS[6], COUNT[0] + LETRAS[9], COUNT[3] + LETRAS[10], COUNT[6] + LETRAS[7], COUNT[6] + LETRAS[11]};
                posicao6x1x2x3 = new String[]
                        {COUNT[2] + LETRAS[1], COUNT[0] + LETRAS[3], COUNT[4] + LETRAS[5], COUNT[1] + LETRAS[0], COUNT[8] + LETRAS[4], COUNT[6] + LETRAS[2]};
                break;
            case 8:
                posicao4x1 = new String[]{COUNT[1] + LETRAS[5], COUNT[0] + LETRAS[7], COUNT[1] + LETRAS[9], COUNT[0] + LETRAS[11], COUNT[7] + LETRAS[6], COUNT[7] + LETRAS[10]};
                posicao6x1x2x3 = new String[]
                        {COUNT[3] + LETRAS[1], COUNT[1] + LETRAS[3], COUNT[5] + LETRAS[5], COUNT[0] + LETRAS[2], COUNT[7] + LETRAS[0], COUNT[9] + LETRAS[4]};
                break;
            case 9:
                posicao4x1 = new String[]{COUNT[2] + LETRAS[5], COUNT[1] + LETRAS[7], COUNT[2] + LETRAS[9], COUNT[1] + LETRAS[11], COUNT[8] + LETRAS[6], COUNT[8] + LETRAS[10]};
                posicao6x1x2x3 = new String[]
                        {COUNT[4] + LETRAS[1], COUNT[2] + LETRAS[3], COUNT[0] + LETRAS[4], COUNT[1] + LETRAS[2], COUNT[8] + LETRAS[0], COUNT[6] + LETRAS[5]};
                break;
            case 10:
                posicao4x1 = new String[]{COUNT[3] + LETRAS[5], COUNT[2] + LETRAS[7], COUNT[3] + LETRAS[9], COUNT[2] + LETRAS[11], COUNT[9] + LETRAS[6], COUNT[9] + LETRAS[10]};
                posicao6x1x2x3 = new String[]
                        {COUNT[5] + LETRAS[1], COUNT[3] + LETRAS[3], COUNT[1] + LETRAS[4], COUNT[0] + LETRAS[5], COUNT[9] + LETRAS[0], COUNT[7] + LETRAS[2]};
                break;
            default:
                posicao4x1 = new String[]{COUNT[0] + LETRAS[6], COUNT[3] + LETRAS[7], COUNT[0] + LETRAS[10], COUNT[3] + LETRAS[11], COUNT[6] + LETRAS[5], COUNT[6] + LETRAS[9]};
                posicao6x1x2x3 = new String[]
                        {COUNT[0] + LETRAS[0], COUNT[4] + LETRAS[3], COUNT[2] + LETRAS[4], COUNT[1] + LETRAS[5], COUNT[6] + LETRAS[1], COUNT[8] + LETRAS[2]};
                break;
        }
    }

    public String getManha4x2x4() {
        return posicao4x2x4[0];
    }

    public String getTarde4x24() {
        return posicao4x2x4[1];
    }

    public String getNoite4x2x4() {
        return posicao4x2x4[2];
    }

    public String getFolga4x2x4() {
        return String.format("%s\n%s", posicao4x2x4[3], posicao4x2x4[4]);
    }

    public String getManha4x1() {
        return String.format("%s\n%s", posicao4x1[0], posicao4x1[1]);
    }

    public String getTarde4x1() {
        return String.format("%s\n%s", posicao4x1[2], posicao4x1[3]);
    }

    public String getFolga4x1() {
        return String.format("%s\n%s", posicao4x1[4], posicao4x1[5]);
    }

    public String getManha6x1x2x3() {
        return posicao6x1x2x3[0];
    }

    public String getTarde6x1x2x3() {
        return posicao6x1x2x3[1];
    }

    public String getVespertino6x1x2x3() {
        return posicao6x1x2x3[2];
    }

    public String getNoite6x1x2x3() {
        return posicao6x1x2x3[3];
    }

    public String getFolga6x1x2x3() {
        return posicao6x1x2x3[4];
    }

    public String getFolga6x1x2x3_2() {
        return posicao6x1x2x3[5];
    }

    @Override
    public String toString() {
        return "Escalas{" +
                "posicao4x2x4=" + Arrays.toString(posicao4x2x4) +
                ", posicao4x1=" + Arrays.toString(posicao4x1) +
                ", posicao6x1x2x3=" + Arrays.toString(posicao6x1x2x3) +
                '}';
    }
}
