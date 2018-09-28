package com.rodrigoneves.trafegometro.app_escalas;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.util_date_time.Escalas;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class EscalasFragment extends Fragment {

    public EscalasFragment() {
    }

    TextView dataPicker;
    Button textPicker;
    ImageView dayPlus;
    ImageView dayMinus;
    TextView manha4x2x4;
    TextView tarde4x2x4;
    TextView noite4x2x4;
    TextView folga4x2x4;
    TextView manha4x1;
    TextView tarde4x1;
    TextView folga4x1;
    TextView manha6x1x2x3;
    TextView tarde6x1x2x3;
    TextView vespertino6x1x2x3;
    TextView noite6x1x2x3;
    TextView folga6x1x2x3;
    TextView folgs6x1x2x3_2;
    DateTime dateEnd;
    Calendar calendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener dateSetListener;
    Escalas escalas;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.escalas, container, false);

        escalas = new Escalas();
        dataPicker = rootView.findViewById(R.id.dataPicker);
        textPicker = rootView.findViewById(R.id.textPicker);
        dayPlus = rootView.findViewById(R.id.mais_um_dia);
        dayMinus = rootView.findViewById(R.id.menos_um_dia);
        manha4x2x4 = rootView.findViewById(R.id.manha4x2x4);
        tarde4x2x4 = rootView.findViewById(R.id.tarde4x2x4);
        noite4x2x4 = rootView.findViewById(R.id.noite4x2x4);
        folga4x2x4 = rootView.findViewById(R.id.folga4x2x4);
        manha4x1 = rootView.findViewById(R.id.manha4x1);
        tarde4x1 = rootView.findViewById(R.id.tarde4x1);
        folga4x1 = rootView.findViewById(R.id.folga4x1);
        manha6x1x2x3 = rootView.findViewById(R.id.manha6x1x2x3);
        tarde6x1x2x3 = rootView.findViewById(R.id.tarde6x1x2x3);
        vespertino6x1x2x3 = rootView.findViewById(R.id.vespertino6x1x2x3);
        noite6x1x2x3 = rootView.findViewById(R.id.noite6x1x2x3);
        folga6x1x2x3 = rootView.findViewById(R.id.folga6x1x2x3);
        folgs6x1x2x3_2 = rootView.findViewById(R.id.folga6x1x2x3_2);

        updateLabel();

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        dayMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.add(Calendar.DATE, -1);
                updateLabel();
            }
        });

        dayPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.add(Calendar.DATE, 1);
                updateLabel();
            }
        });

        dataPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataPickerDialog();
            }
        });

        textPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataPickerDialog();
            }
        });
        return rootView;
    }

    private void dataPickerDialog() {
        new DatePickerDialog(Objects.requireNonNull(getContext()),
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH))
                .show();
    }

    private void updateLabel() {
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        dateEnd = new DateTime(ano, mes, dia, 6, 0);

        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(myFormat, new Locale("pt", "BR"));
        dataPicker.setText(simpleDateFormat.format(calendar.getTime()));

        escalas.updateDate(dateEnd);

        manha4x2x4.setText(escalas.getManha4x2x4());
        tarde4x2x4.setText(escalas.getTarde4x24());
        noite4x2x4.setText(escalas.getNoite4x2x4());
        folga4x2x4.setText(escalas.getFolga4x2x4());
        manha4x1.setText(escalas.getManha4x1());
        tarde4x1.setText(escalas.getTarde4x1());
        folga4x1.setText(escalas.getFolga4x1());
        manha6x1x2x3.setText(escalas.getManha6x1x2x3());
        tarde6x1x2x3.setText(escalas.getTarde6x1x2x3());
        vespertino6x1x2x3.setText(escalas.getVespertino6x1x2x3());
        noite6x1x2x3.setText(escalas.getNoite6x1x2x3());
        folga6x1x2x3.setText(escalas.getFolga6x1x2x3());
        folgs6x1x2x3_2.setText(escalas.getFolga6x1x2x3_2());
    }
}
