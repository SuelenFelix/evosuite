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
     Object term40705;
     Object term41360;

    public WorkSheet_rowFormat_4063062313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40705 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term40706 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40739 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40772 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40805 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40838 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40871 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40904 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40937 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40970 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41003 = (Object[]) newArray("java.lang.String", 8);
        int[] term41048 = (int[]) newIntArray(4);
        Object[] term41053 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term41054 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41151 = (Object[]) newArray("java.lang.String", 7);
        Object[] term41236 = (Object[]) newArray("java.lang.String", 5);
        Object[] term41297 = (Object[]) newArray("java.lang.String", 5);
        setElement(term40706, 0, "  ");
        setElement(term40706, 1, "  ");
        setElement(term40706, 2, "  ");
        setElement(term40706, 3, "  ");
        setElement(term40706, 4, "  ");
        setElement(term40706, 5, "  ");
        setElement(term40706, 6, "  ");
        setElement(term40706, 7, "  ");
        setField(term40705, term40705.getClass(), "row_1_Border", term40706);
        setElement(term40739, 0, "  ");
        setElement(term40739, 1, "  ");
        setElement(term40739, 2, "  ");
        setElement(term40739, 3, "  ");
        setElement(term40739, 4, "  ");
        setElement(term40739, 5, "  ");
        setElement(term40739, 6, "  ");
        setElement(term40739, 7, "  ");
        setField(term40705, term40705.getClass(), "row_1_Align_", term40739);
        setElement(term40772, 0, "  ");
        setElement(term40772, 1, "  ");
        setElement(term40772, 2, "  ");
        setElement(term40772, 3, "  ");
        setElement(term40772, 4, "  ");
        setElement(term40772, 5, "  ");
        setElement(term40772, 6, "  ");
        setElement(term40772, 7, "  ");
        setField(term40705, term40705.getClass(), "row_2_Border", term40772);
        setElement(term40805, 0, "  ");
        setElement(term40805, 1, "  ");
        setElement(term40805, 2, "  ");
        setElement(term40805, 3, "  ");
        setElement(term40805, 4, "  ");
        setElement(term40805, 5, "  ");
        setElement(term40805, 6, "  ");
        setElement(term40805, 7, "  ");
        setField(term40705, term40705.getClass(), "row_2_Align_", term40805);
        setElement(term40838, 0, "  ");
        setElement(term40838, 1, "  ");
        setElement(term40838, 2, "  ");
        setElement(term40838, 3, "  ");
        setElement(term40838, 4, "  ");
        setElement(term40838, 5, "  ");
        setElement(term40838, 6, "  ");
        setElement(term40838, 7, "  ");
        setField(term40705, term40705.getClass(), "row_3_Border", term40838);
        setElement(term40871, 0, "  ");
        setElement(term40871, 1, "  ");
        setElement(term40871, 2, "  ");
        setElement(term40871, 3, "  ");
        setElement(term40871, 4, "  ");
        setElement(term40871, 5, "  ");
        setElement(term40871, 6, "  ");
        setElement(term40871, 7, "  ");
        setField(term40705, term40705.getClass(), "row_3_Align_", term40871);
        setElement(term40904, 0, "  ");
        setElement(term40904, 1, "  ");
        setElement(term40904, 2, "  ");
        setElement(term40904, 3, "  ");
        setElement(term40904, 4, "  ");
        setElement(term40904, 5, "  ");
        setElement(term40904, 6, "  ");
        setElement(term40904, 7, "  ");
        setField(term40705, term40705.getClass(), "label_Border", term40904);
        setElement(term40937, 0, "  ");
        setElement(term40937, 1, "  ");
        setElement(term40937, 2, "  ");
        setElement(term40937, 3, "  ");
        setElement(term40937, 4, "  ");
        setElement(term40937, 5, "  ");
        setElement(term40937, 6, "  ");
        setElement(term40937, 7, "  ");
        setField(term40705, term40705.getClass(), "label_Align_", term40937);
        setElement(term40970, 0, "  ");
        setElement(term40970, 1, "  ");
        setElement(term40970, 2, "  ");
        setElement(term40970, 3, "  ");
        setElement(term40970, 4, "  ");
        setElement(term40970, 5, "  ");
        setElement(term40970, 6, "  ");
        setElement(term40970, 7, "  ");
        setField(term40705, term40705.getClass(), "data__Border", term40970);
        setElement(term41003, 0, "  ");
        setElement(term41003, 1, "  ");
        setElement(term41003, 2, "  ");
        setElement(term41003, 3, "  ");
        setElement(term41003, 4, "  ");
        setElement(term41003, 5, "  ");
        setElement(term41003, 6, "  ");
        setElement(term41003, 7, "  ");
        setField(term40705, term40705.getClass(), "data__Align_", term41003);
        setField(term40705, term40705.getClass(), "sheet_Name", "ZwjARhAtHC");
        setIntElement(term41048, 0, 991356662);
        setIntElement(term41048, 1, -506958186);
        setIntElement(term41048, 2, -507387516);
        setIntElement(term41048, 3, -1970452551);
        setField(term40705, term40705.getClass(), "column_Width", term41048);
        setElement(term41054, 0, "XXvscsYBWv");
        setElement(term41054, 1, "uePedtiAfL");
        setElement(term41054, 2, "AdSHvysxQB");
        setElement(term41054, 3, "jlraKkBWFA");
        setElement(term41054, 4, "mRBtFTxVdE");
        setElement(term41054, 5, "IVacFDAZcj");
        setElement(term41054, 6, "EEYmuwyVDP");
        setElement(term41054, 7, "EWFbEDAVrE");
        setElement(term41053, 0, term41054);
        setElement(term41151, 0, "EMiMtYgfvr");
        setElement(term41151, 1, "OyYyYYnJuF");
        setElement(term41151, 2, "aYLvcxZohT");
        setElement(term41151, 3, "mnHyQbMyld");
        setElement(term41151, 4, "KHtaDOIcJZ");
        setElement(term41151, 5, "vgdwrCZczl");
        setElement(term41151, 6, "gKMNrpKBpu");
        setElement(term41053, 1, term41151);
        setElement(term41236, 0, "ZbHJVEqcoa");
        setElement(term41236, 1, "awDQVEVIKi");
        setElement(term41236, 2, "HJwNgUzZZR");
        setElement(term41236, 3, "FvUCZgTXhq");
        setElement(term41236, 4, "wWWidPCHzx");
        setElement(term41053, 2, term41236);
        setElement(term41297, 0, "OwPIiBRuKK");
        setElement(term41297, 1, "sgfGySMODT");
        setElement(term41297, 2, "ndAITnOsny");
        setElement(term41297, 3, "CVZnTiJucs");
        setElement(term41297, 4, "ecHEQufXoq");
        setElement(term41053, 3, term41297);
        setField(term40705, term40705.getClass(), "value_Data", term41053);
        setIntField(term40705, term40705.getClass(), "print_Scale", 100);
        setBooleanField(term40705, term40705.getClass(), "printSetup", false);
        term41360 = new Integer(-1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41360;
        callMethod(klass, "row_Format", argTypes, term40705, args);
    }

};


