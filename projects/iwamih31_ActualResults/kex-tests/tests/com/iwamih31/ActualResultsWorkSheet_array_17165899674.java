package com.iwamih31;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ActualResultsWorkSheet_array_17165899674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9826;
     Object term10959;

    public ActualResultsWorkSheet_array_17165899674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9826 = newInstance(Class.forName("com.iwamih31.ActualResultsWorkSheet"));
        Object[] term10473 = (Object[]) newArray("java.lang.String", 5);
        Object[] term10534 = (Object[]) newArray("java.lang.String", 3);
        Object[] term10571 = (Object[]) newArray("java.lang.String", 4);
        Object[] term10620 = (Object[]) newArray("java.lang.String", 8);
        Object[] term10717 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10718 = (Object[]) newArray("java.lang.String", 4);
        Object[] term10767 = (Object[]) newArray("java.lang.String", 1);
        Object[] term10780 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10781 = (Object[]) newArray("java.lang.String", 1);
        Object[] term10794 = (Object[]) newArray("java.lang.String", 5);
        int[] term10867 = (int[]) newIntArray(3);
        Object[] term10871 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 2);
        Object[] term10872 = (Object[]) newArray("java.lang.String", 2);
        Object[] term10897 = (Object[]) newArray("java.lang.String", 5);
        setElement(term10473, 0, "NWldOLAbqk");
        setElement(term10473, 1, "qnYaYSpDwO");
        setElement(term10473, 2, "dgbFDCdHtj");
        setElement(term10473, 3, "EKpdCBubDE");
        setElement(term10473, 4, "zMsSLTfGhl");
        setField(term9826, term9826.getClass(), "row_1_Border", term10473);
        setElement(term10534, 0, "bEmHScVZaQ");
        setElement(term10534, 1, "TcuXODkzBV");
        setElement(term10534, 2, "coJPjrBZNe");
        setField(term9826, term9826.getClass(), "row_1_Align_", term10534);
        setElement(term10571, 0, "vMsWjuPTnO");
        setElement(term10571, 1, "zHvfKaOstO");
        setElement(term10571, 2, "tOszriqETr");
        setElement(term10571, 3, "ncSPTkhKjO");
        setField(term9826, term9826.getClass(), "row_2_Border", term10571);
        setElement(term10620, 0, "jcWKHRWhyj");
        setElement(term10620, 1, "nrQjODRMLD");
        setElement(term10620, 2, "PNoWXrsFic");
        setElement(term10620, 3, "QZBHZqZope");
        setElement(term10620, 4, "VBUahCvyxC");
        setElement(term10620, 5, "MlzTkzKMCX");
        setElement(term10620, 6, "UqKUbMyPMJ");
        setElement(term10620, 7, "QpYltHAdyY");
        setField(term9826, term9826.getClass(), "row_2_Align_", term10620);
        setField(term9826, term9826.getClass(), "row_3_Border", term10717);
        setElement(term10718, 0, "lbmSGBwIiV");
        setElement(term10718, 1, "DAxyHoTLzZ");
        setElement(term10718, 2, "fhZgTouhCC");
        setElement(term10718, 3, "wrikqJwXvL");
        setField(term9826, term9826.getClass(), "row_3_Align_", term10718);
        setElement(term10767, 0, "UiWhvbypdr");
        setField(term9826, term9826.getClass(), "label_Border", term10767);
        setField(term9826, term9826.getClass(), "label_Align_", term10780);
        setElement(term10781, 0, "CgleElJNje");
        setField(term9826, term9826.getClass(), "data__Border", term10781);
        setElement(term10794, 0, "ZrchvNGMtd");
        setElement(term10794, 1, "WaEcyVlcIx");
        setElement(term10794, 2, "ONcbPCQnHd");
        setElement(term10794, 3, "AobDaplFLl");
        setElement(term10794, 4, "pDkMNnAGgv");
        setField(term9826, term9826.getClass(), "data__Align_", term10794);
        setField(term9826, term9826.getClass(), "sheet_Name", "PaCpFXGzdX");
        setIntElement(term10867, 0, -244121226);
        setIntElement(term10867, 1, -203030934);
        setIntElement(term10867, 2, -1179120542);
        setField(term9826, term9826.getClass(), "column_Width", term10867);
        setElement(term10872, 0, "FftYCNbnks");
        setElement(term10872, 1, "lJoltmsadS");
        setElement(term10871, 0, term10872);
        setElement(term10897, 0, "mvfDtZNEHr");
        setElement(term10897, 1, "bvSgmFUDOU");
        setElement(term10897, 2, "XMHwbfiHRl");
        setElement(term10897, 3, "bucTnYicnp");
        setElement(term10897, 4, "EkgprvqZlM");
        setElement(term10871, 1, term10897);
        setField(term9826, term9826.getClass(), "value_Data", term10871);
        setBooleanField(term9826, term9826.getClass(), "printSetup", false);
        term10959 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.ActualResultsWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10959;
        callMethod(klass, "array", argTypes, term9826, args);
    }

};


