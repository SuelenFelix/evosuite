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

public class PrintStyle_getHeaderFormat_16276176712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44377;

    public PrintStyle_getHeaderFormat_16276176712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44529 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term44528 = ((Class) term44529).getDeclaredField((String) "DETAILED");
        ((Field) term44528).setAccessible(true);
        Object enum149 = ((Field) term44528).get((Object) null);
        Class<? extends Object> term44845 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term44844 = ((Class) term44845).getDeclaredField((String) "ISO_8601");
        ((Field) term44844).setAccessible(true);
        Object enum150 = ((Field) term44844).get((Object) null);
        Class<? extends Object> term45106 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45105 = ((Class) term45106).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term45105).setAccessible(true);
        Object enum151 =  ((Field) term45105).get((Object) null);
        Class<? extends Object> term45321 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45320 = ((Class) term45321).getDeclaredField((String) "USER_TIME");
        ((Field) term45320).setAccessible(true);
        Object enum152 =  ((Field) term45320).get((Object) null);
        Class<? extends Object> term45530 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45529 = ((Class) term45530).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term45529).setAccessible(true);
        Object enum153 =  ((Field) term45529).get((Object) null);
        ArrayList term44503 = new ArrayList();
        ((ArrayList) term44503).add(enum151);
        ((ArrayList) term44503).add(enum152);
        ((ArrayList) term44503).add(enum153);
        ((ArrayList) term44503).add(enum153);
        ((ArrayList) term44503).add(enum151);
        ((ArrayList) term44503).add(enum153);
        ((ArrayList) term44503).add(enum152);
        HashMap term44519 = new HashMap();
        term44377 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term44377, term44377.getClass(), "printFormat", enum149);
        setBooleanField(term44377, term44377.getClass(), "printHeader", true);
        setField(term44377, term44377.getClass(), "headerFormat", "OcJCIDNIXA");
        setBooleanField(term44377, term44377.getClass(), "printTrailer", true);
        setField(term44377, term44377.getClass(), "trailerFormat", "XfRABIFVEp");
        setField(term44377, term44377.getClass(), "rowFormat", "MHGKyEnwKc");
        setField(term44377, term44377.getClass(), "sectionHeaderFormat", "ShIELyuULw");
        setBooleanField(term44377, term44377.getClass(), "printSectionSummary", true);
        setField(term44377, term44377.getClass(), "sectionSummaryRowFormat", "IpQuOGMgmj");
        setBooleanField(term44377, term44377.getClass(), "printSectionTrailer", false);
        setField(term44377, term44377.getClass(), "sectionTrailerFormat", "pJbnHTYrxn");
        setField(term44377, term44377.getClass(), "durationFormat", enum150);
        setBooleanField(term44377, term44377.getClass(), "printLegend", true);
        setField(term44377, term44377.getClass(), "simpleLine", "iIRsCSYqXH");
        setField(term44377, term44377.getClass(), "alternativeLine", "nghfqDXyCG");
        setField(term44377, term44377.getClass(), "excludedTypes", term44503);
        setField(term44377, term44377.getClass(), "customCounterNames", term44519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderFormat", argTypes, term44377, args);
    }

};


