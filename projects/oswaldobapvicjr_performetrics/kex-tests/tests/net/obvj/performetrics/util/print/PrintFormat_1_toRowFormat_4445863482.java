package net.obvj.performetrics.util.print;

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
import static net.obvj.performetrics.util.print.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintFormat_1_toRowFormat_4445863482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum29;
     Object enum30;
     Object term8262;

    public PrintFormat_1_toRowFormat_4445863482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8408 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term8407 = ((Class) term8408).getDeclaredField((String) "SUMMARIZED");
        ((Field) term8407).setAccessible(true);
        enum29 = ((Field) term8407).get((Object) null);
        Class<? extends Object> term8670 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term8669 = ((Class) term8670).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term8669).setAccessible(true);
        enum30 =  ((Field) term8669).get((Object) null);
        Class<? extends Object> term8885 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term8884 = ((Class) term8885).getDeclaredField((String) "DETAILED");
        ((Field) term8884).setAccessible(true);
        Object enum31 = ((Field) term8884).get((Object) null);
        Class<? extends Object> term9201 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term9200 = ((Class) term9201).getDeclaredField((String) "ISO_8601");
        ((Field) term9200).setAccessible(true);
        Object enum32 = ((Field) term9200).get((Object) null);
        Class<? extends Object> term9462 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term9461 = ((Class) term9462).getDeclaredField((String) "USER_TIME");
        ((Field) term9461).setAccessible(true);
        Object enum33 =  ((Field) term9461).get((Object) null);
        ArrayList term8388 = new ArrayList();
        ((ArrayList) term8388).add(enum33);
        ((ArrayList) term8388).add(enum30);
        ((ArrayList) term8388).add(enum30);
        HashMap term8396 = new HashMap();
        term8262 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term8262, term8262.getClass(), "printFormat", enum31);
        setBooleanField(term8262, term8262.getClass(), "printHeader", true);
        setField(term8262, term8262.getClass(), "headerFormat", "hxCBltsObl");
        setBooleanField(term8262, term8262.getClass(), "printTrailer", true);
        setField(term8262, term8262.getClass(), "trailerFormat", "BndsHwAFMv");
        setField(term8262, term8262.getClass(), "rowFormat", "GzFkzHGYFt");
        setField(term8262, term8262.getClass(), "sectionHeaderFormat", "tShwQLRGNe");
        setBooleanField(term8262, term8262.getClass(), "printSectionSummary", true);
        setField(term8262, term8262.getClass(), "sectionSummaryRowFormat", "LvtrsXUliU");
        setBooleanField(term8262, term8262.getClass(), "printSectionTrailer", true);
        setField(term8262, term8262.getClass(), "sectionTrailerFormat", "xLbjWUgOIL");
        setField(term8262, term8262.getClass(), "durationFormat", enum32);
        setBooleanField(term8262, term8262.getClass(), "printLegend", true);
        setField(term8262, term8262.getClass(), "simpleLine", "jDtqGUpnZN");
        setField(term8262, term8262.getClass(), "alternativeLine", "nGKItKLYNC");
        setField(term8262, term8262.getClass(), "excludedTypes", term8388);
        setField(term8262, term8262.getClass(), "customCounterNames", term8396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[2] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum30;
        args[2] = term8262;
        callMethod(klass, "toRowFormat", argTypes, enum29, args);
    }

};


