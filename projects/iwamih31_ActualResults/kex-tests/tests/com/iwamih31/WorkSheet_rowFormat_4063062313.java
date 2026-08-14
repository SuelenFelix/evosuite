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

public class WorkSheet_rowFormat_4063062313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36602;
     Object term37183;

    public WorkSheet_rowFormat_4063062313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36602 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term36603 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36636 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36669 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36702 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36735 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36768 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36801 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36834 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36867 = (Object[]) newArray("java.lang.String", 8);
        Object[] term36900 = (Object[]) newArray("java.lang.String", 8);
        int[] term36945 = (int[]) newIntArray(2);
        Object[] term36948 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term36949 = (Object[]) newArray("java.lang.String", 0);
        Object[] term36950 = (Object[]) newArray("java.lang.String", 6);
        Object[] term37023 = (Object[]) newArray("java.lang.String", 2);
        Object[] term37048 = (Object[]) newArray("java.lang.String", 7);
        Object[] term37133 = (Object[]) newArray("java.lang.String", 4);
        setElement(term36603, 0, "  ");
        setElement(term36603, 1, "  ");
        setElement(term36603, 2, "  ");
        setElement(term36603, 3, "  ");
        setElement(term36603, 4, "  ");
        setElement(term36603, 5, "  ");
        setElement(term36603, 6, "  ");
        setElement(term36603, 7, "  ");
        setField(term36602, term36602.getClass(), "row_1_Border", term36603);
        setElement(term36636, 0, "  ");
        setElement(term36636, 1, "  ");
        setElement(term36636, 2, "  ");
        setElement(term36636, 3, "  ");
        setElement(term36636, 4, "  ");
        setElement(term36636, 5, "  ");
        setElement(term36636, 6, "  ");
        setElement(term36636, 7, "  ");
        setField(term36602, term36602.getClass(), "row_1_Align_", term36636);
        setElement(term36669, 0, "  ");
        setElement(term36669, 1, "  ");
        setElement(term36669, 2, "  ");
        setElement(term36669, 3, "  ");
        setElement(term36669, 4, "  ");
        setElement(term36669, 5, "  ");
        setElement(term36669, 6, "  ");
        setElement(term36669, 7, "  ");
        setField(term36602, term36602.getClass(), "row_2_Border", term36669);
        setElement(term36702, 0, "  ");
        setElement(term36702, 1, "  ");
        setElement(term36702, 2, "  ");
        setElement(term36702, 3, "  ");
        setElement(term36702, 4, "  ");
        setElement(term36702, 5, "  ");
        setElement(term36702, 6, "  ");
        setElement(term36702, 7, "  ");
        setField(term36602, term36602.getClass(), "row_2_Align_", term36702);
        setElement(term36735, 0, "  ");
        setElement(term36735, 1, "  ");
        setElement(term36735, 2, "  ");
        setElement(term36735, 3, "  ");
        setElement(term36735, 4, "  ");
        setElement(term36735, 5, "  ");
        setElement(term36735, 6, "  ");
        setElement(term36735, 7, "  ");
        setField(term36602, term36602.getClass(), "row_3_Border", term36735);
        setElement(term36768, 0, "  ");
        setElement(term36768, 1, "  ");
        setElement(term36768, 2, "  ");
        setElement(term36768, 3, "  ");
        setElement(term36768, 4, "  ");
        setElement(term36768, 5, "  ");
        setElement(term36768, 6, "  ");
        setElement(term36768, 7, "  ");
        setField(term36602, term36602.getClass(), "row_3_Align_", term36768);
        setElement(term36801, 0, "  ");
        setElement(term36801, 1, "  ");
        setElement(term36801, 2, "  ");
        setElement(term36801, 3, "  ");
        setElement(term36801, 4, "  ");
        setElement(term36801, 5, "  ");
        setElement(term36801, 6, "  ");
        setElement(term36801, 7, "  ");
        setField(term36602, term36602.getClass(), "label_Border", term36801);
        setElement(term36834, 0, "  ");
        setElement(term36834, 1, "  ");
        setElement(term36834, 2, "  ");
        setElement(term36834, 3, "  ");
        setElement(term36834, 4, "  ");
        setElement(term36834, 5, "  ");
        setElement(term36834, 6, "  ");
        setElement(term36834, 7, "  ");
        setField(term36602, term36602.getClass(), "label_Align_", term36834);
        setElement(term36867, 0, "  ");
        setElement(term36867, 1, "  ");
        setElement(term36867, 2, "  ");
        setElement(term36867, 3, "  ");
        setElement(term36867, 4, "  ");
        setElement(term36867, 5, "  ");
        setElement(term36867, 6, "  ");
        setElement(term36867, 7, "  ");
        setField(term36602, term36602.getClass(), "data__Border", term36867);
        setElement(term36900, 0, "  ");
        setElement(term36900, 1, "  ");
        setElement(term36900, 2, "  ");
        setElement(term36900, 3, "  ");
        setElement(term36900, 4, "  ");
        setElement(term36900, 5, "  ");
        setElement(term36900, 6, "  ");
        setElement(term36900, 7, "  ");
        setField(term36602, term36602.getClass(), "data__Align_", term36900);
        setField(term36602, term36602.getClass(), "sheet_Name", "EuAshkmbna");
        setIntElement(term36945, 0, -1801760683);
        setIntElement(term36945, 1, 1141317871);
        setField(term36602, term36602.getClass(), "column_Width", term36945);
        setElement(term36948, 0, term36949);
        setElement(term36950, 0, "JwQlbBbGJR");
        setElement(term36950, 1, "HdWLwfVsAM");
        setElement(term36950, 2, "SxeKEdHXSl");
        setElement(term36950, 3, "BCAlJpNjIX");
        setElement(term36950, 4, "PKClfBAwUr");
        setElement(term36950, 5, "JqbKrmVEMy");
        setElement(term36948, 1, term36950);
        setElement(term37023, 0, "VygCEWaefB");
        setElement(term37023, 1, "PqhYfEyDDA");
        setElement(term36948, 2, term37023);
        setElement(term37048, 0, "fSLHLeuNoa");
        setElement(term37048, 1, "IwgPFurObw");
        setElement(term37048, 2, "WLaHlrYQyz");
        setElement(term37048, 3, "CaeIUTuUFo");
        setElement(term37048, 4, "rzoDGjHkzG");
        setElement(term37048, 5, "NsphHxYiuC");
        setElement(term37048, 6, "XYJztkznbY");
        setElement(term36948, 3, term37048);
        setElement(term37133, 0, "NeTiWVoyjZ");
        setElement(term37133, 1, "CGeclMyIOP");
        setElement(term37133, 2, "yyWOYvIBsp");
        setElement(term37133, 3, "mmpgARMYFV");
        setElement(term36948, 4, term37133);
        setField(term36602, term36602.getClass(), "value_Data", term36948);
        setBooleanField(term36602, term36602.getClass(), "printSetup", true);
        term37183 = new Integer(890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37183;
        callMethod(klass, "row_Format", argTypes, term36602, args);
    }

};


