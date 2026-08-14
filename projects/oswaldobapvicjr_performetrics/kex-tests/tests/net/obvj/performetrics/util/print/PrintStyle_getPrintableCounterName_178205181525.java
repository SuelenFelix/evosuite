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

public class PrintStyle_getPrintableCounterName_178205181525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48807;
     Object enum167;

    public PrintStyle_getPrintableCounterName_178205181525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48980 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term48979 = ((Class) term48980).getDeclaredField((String) "DETAILED");
        ((Field) term48979).setAccessible(true);
        Object enum164 = ((Field) term48979).get((Object) null);
        Class<? extends Object> term49296 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term49295 = ((Class) term49296).getDeclaredField((String) "SHORTER");
        ((Field) term49295).setAccessible(true);
        Object enum165 = ((Field) term49295).get((Object) null);
        Class<? extends Object> term49554 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term49553 = ((Class) term49554).getDeclaredField((String) "USER_TIME");
        ((Field) term49553).setAccessible(true);
        Object enum166 =  ((Field) term49553).get((Object) null);
        ArrayList term48932 = new ArrayList();
        ((ArrayList) term48932).add(enum166);
        HashMap term48940 = new HashMap();
        term48807 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term48807, term48807.getClass(), "printFormat", enum164);
        setBooleanField(term48807, term48807.getClass(), "printHeader", true);
        setField(term48807, term48807.getClass(), "headerFormat", "DPskuFUobI");
        setBooleanField(term48807, term48807.getClass(), "printTrailer", false);
        setField(term48807, term48807.getClass(), "trailerFormat", "wBGfLpNNiZ");
        setField(term48807, term48807.getClass(), "rowFormat", "yUGCjlqgJE");
        setField(term48807, term48807.getClass(), "sectionHeaderFormat", "PXdVZyoJyC");
        setBooleanField(term48807, term48807.getClass(), "printSectionSummary", true);
        setField(term48807, term48807.getClass(), "sectionSummaryRowFormat", "vLerpqavFM");
        setBooleanField(term48807, term48807.getClass(), "printSectionTrailer", false);
        setField(term48807, term48807.getClass(), "sectionTrailerFormat", "qnvxzwuGKX");
        setField(term48807, term48807.getClass(), "durationFormat", enum165);
        setBooleanField(term48807, term48807.getClass(), "printLegend", false);
        setField(term48807, term48807.getClass(), "simpleLine", "EdPAvpluZg");
        setField(term48807, term48807.getClass(), "alternativeLine", "DzHVBMqWtE");
        setField(term48807, term48807.getClass(), "excludedTypes", term48932);
        setField(term48807, term48807.getClass(), "customCounterNames", term48940);
        Class<? extends Object> term49763 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term49762 = ((Class) term49763).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term49762).setAccessible(true);
        enum167 = ((Field) term49762).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum167;
        callMethod(klass, "getPrintableCounterName", argTypes, term48807, args);
    }

};


