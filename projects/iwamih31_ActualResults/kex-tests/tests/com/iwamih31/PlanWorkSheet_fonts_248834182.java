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

public class PlanWorkSheet_fonts_248834182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45884;

    public PlanWorkSheet_fonts_248834182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45884 = newInstance(Class.forName("com.iwamih31.PlanWorkSheet"));
        Object[] term46215 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46248 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46281 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46314 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46347 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46380 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46413 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46446 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46479 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46512 = (Object[]) newArray("java.lang.String", 8);
        int[] term46557 = (int[]) newIntArray(1);
        Object[] term46559 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term46560 = (Object[]) newArray("java.lang.String", 9);
        Object[] term46669 = (Object[]) newArray("java.lang.String", 8);
        Object[] term46766 = (Object[]) newArray("java.lang.String", 7);
        Object[] term46851 = (Object[]) newArray("java.lang.String", 8);
        setElement(term46215, 0, "  ");
        setElement(term46215, 1, "  ");
        setElement(term46215, 2, "  ");
        setElement(term46215, 3, "  ");
        setElement(term46215, 4, "  ");
        setElement(term46215, 5, "  ");
        setElement(term46215, 6, "  ");
        setElement(term46215, 7, "  ");
        setField(term45884, term45884.getClass(), "row_1_Border", term46215);
        setElement(term46248, 0, "  ");
        setElement(term46248, 1, "  ");
        setElement(term46248, 2, "  ");
        setElement(term46248, 3, "  ");
        setElement(term46248, 4, "  ");
        setElement(term46248, 5, "  ");
        setElement(term46248, 6, "  ");
        setElement(term46248, 7, "  ");
        setField(term45884, term45884.getClass(), "row_1_Align_", term46248);
        setElement(term46281, 0, "  ");
        setElement(term46281, 1, "  ");
        setElement(term46281, 2, "  ");
        setElement(term46281, 3, "  ");
        setElement(term46281, 4, "  ");
        setElement(term46281, 5, "  ");
        setElement(term46281, 6, "  ");
        setElement(term46281, 7, "  ");
        setField(term45884, term45884.getClass(), "row_2_Border", term46281);
        setElement(term46314, 0, "  ");
        setElement(term46314, 1, "  ");
        setElement(term46314, 2, "  ");
        setElement(term46314, 3, "  ");
        setElement(term46314, 4, "  ");
        setElement(term46314, 5, "  ");
        setElement(term46314, 6, "  ");
        setElement(term46314, 7, "  ");
        setField(term45884, term45884.getClass(), "row_2_Align_", term46314);
        setElement(term46347, 0, "  ");
        setElement(term46347, 1, "  ");
        setElement(term46347, 2, "  ");
        setElement(term46347, 3, "  ");
        setElement(term46347, 4, "  ");
        setElement(term46347, 5, "  ");
        setElement(term46347, 6, "  ");
        setElement(term46347, 7, "  ");
        setField(term45884, term45884.getClass(), "row_3_Border", term46347);
        setElement(term46380, 0, "  ");
        setElement(term46380, 1, "  ");
        setElement(term46380, 2, "  ");
        setElement(term46380, 3, "  ");
        setElement(term46380, 4, "  ");
        setElement(term46380, 5, "  ");
        setElement(term46380, 6, "  ");
        setElement(term46380, 7, "  ");
        setField(term45884, term45884.getClass(), "row_3_Align_", term46380);
        setElement(term46413, 0, "  ");
        setElement(term46413, 1, "  ");
        setElement(term46413, 2, "  ");
        setElement(term46413, 3, "  ");
        setElement(term46413, 4, "  ");
        setElement(term46413, 5, "  ");
        setElement(term46413, 6, "  ");
        setElement(term46413, 7, "  ");
        setField(term45884, term45884.getClass(), "label_Border", term46413);
        setElement(term46446, 0, "  ");
        setElement(term46446, 1, "  ");
        setElement(term46446, 2, "  ");
        setElement(term46446, 3, "  ");
        setElement(term46446, 4, "  ");
        setElement(term46446, 5, "  ");
        setElement(term46446, 6, "  ");
        setElement(term46446, 7, "  ");
        setField(term45884, term45884.getClass(), "label_Align_", term46446);
        setElement(term46479, 0, "  ");
        setElement(term46479, 1, "  ");
        setElement(term46479, 2, "  ");
        setElement(term46479, 3, "  ");
        setElement(term46479, 4, "  ");
        setElement(term46479, 5, "  ");
        setElement(term46479, 6, "  ");
        setElement(term46479, 7, "  ");
        setField(term45884, term45884.getClass(), "data__Border", term46479);
        setElement(term46512, 0, "  ");
        setElement(term46512, 1, "  ");
        setElement(term46512, 2, "  ");
        setElement(term46512, 3, "  ");
        setElement(term46512, 4, "  ");
        setElement(term46512, 5, "  ");
        setElement(term46512, 6, "  ");
        setElement(term46512, 7, "  ");
        setField(term45884, term45884.getClass(), "data__Align_", term46512);
        setField(term45884, term45884.getClass(), "sheet_Name", "QLMSDWYwBC");
        setIntElement(term46557, 0, -1697741339);
        setField(term45884, term45884.getClass(), "column_Width", term46557);
        setElement(term46560, 0, "feyxNWUenU");
        setElement(term46560, 1, "qvqwmSUIiP");
        setElement(term46560, 2, "eNOEXYoAtV");
        setElement(term46560, 3, "SNqwfZGLFh");
        setElement(term46560, 4, "sMqpXbgEga");
        setElement(term46560, 5, "nYJlDpoMcL");
        setElement(term46560, 6, "SQnbnBmbcf");
        setElement(term46560, 7, "jaNVteZrZi");
        setElement(term46560, 8, "bMRkDiPUGu");
        setElement(term46559, 0, term46560);
        setElement(term46669, 0, "xjKxECGyLT");
        setElement(term46669, 1, "ffKeJGEXBT");
        setElement(term46669, 2, "rsnXTpfhqf");
        setElement(term46669, 3, "gzvlGZVfnZ");
        setElement(term46669, 4, "rmSqCaXWHi");
        setElement(term46669, 5, "ScztqspySK");
        setElement(term46669, 6, "IvYxGwWoVu");
        setElement(term46669, 7, "XnZHOhTfxL");
        setElement(term46559, 1, term46669);
        setElement(term46766, 0, "oFBhNamtAs");
        setElement(term46766, 1, "YURcpRjwSt");
        setElement(term46766, 2, "SXMdNSGPog");
        setElement(term46766, 3, "vsqwOLpDjj");
        setElement(term46766, 4, "rJgXQRsPCl");
        setElement(term46766, 5, "RgqpoBknjN");
        setElement(term46766, 6, "nUDhadopHE");
        setElement(term46559, 2, term46766);
        setElement(term46851, 0, "vLrTnQTIPg");
        setElement(term46851, 1, "GsXvLZCFtf");
        setElement(term46851, 2, "JqSCTBGSUs");
        setElement(term46851, 3, "bZrrPiMnsr");
        setElement(term46851, 4, "IeromvfDmz");
        setElement(term46851, 5, "xJLHPTRSqe");
        setElement(term46851, 6, "OIFZYdbUZz");
        setElement(term46851, 7, "FPablxseTr");
        setElement(term46559, 3, term46851);
        setField(term45884, term45884.getClass(), "value_Data", term46559);
        setBooleanField(term45884, term45884.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.PlanWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fonts", argTypes, term45884, args);
    }

};


