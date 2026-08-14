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

public class PrintStyleBuilder_withLegends_125232057518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81123;

    public PrintStyleBuilder_withLegends_125232057518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81275 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term81274 = ((Class) term81275).getDeclaredField((String) "DETAILED");
        ((Field) term81274).setAccessible(true);
        Object enum273 = ((Field) term81274).get((Object) null);
        Class<? extends Object> term81591 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term81590 = ((Class) term81591).getDeclaredField((String) "ISO_8601");
        ((Field) term81590).setAccessible(true);
        Object enum274 = ((Field) term81590).get((Object) null);
        Class<? extends Object> term81852 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term81851 = ((Class) term81852).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term81851).setAccessible(true);
        Object enum275 =  ((Field) term81851).get((Object) null);
        Class<? extends Object> term82067 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82066 = ((Class) term82067).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term82066).setAccessible(true);
        Object enum276 =  ((Field) term82066).get((Object) null);
        Class<? extends Object> term82294 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82293 = ((Class) term82294).getDeclaredField((String) "CPU_TIME");
        ((Field) term82293).setAccessible(true);
        Object enum277 =  ((Field) term82293).get((Object) null);
        ArrayList term81249 = new ArrayList();
        ((ArrayList) term81249).add(enum275);
        ((ArrayList) term81249).add(enum276);
        ((ArrayList) term81249).add(enum277);
        ((ArrayList) term81249).add(enum277);
        ((ArrayList) term81249).add(enum277);
        HashMap term81265 = new HashMap();
        term81123 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term81123, term81123.getClass(), "printFormat", enum273);
        setBooleanField(term81123, term81123.getClass(), "printHeader", true);
        setField(term81123, term81123.getClass(), "headerFormat", "IlBhdrCvHq");
        setBooleanField(term81123, term81123.getClass(), "printTrailer", true);
        setField(term81123, term81123.getClass(), "trailerFormat", "OirVUQhauU");
        setField(term81123, term81123.getClass(), "rowFormat", "GLbyDfbNZI");
        setField(term81123, term81123.getClass(), "sectionHeaderFormat", "oNLcCYDAsO");
        setBooleanField(term81123, term81123.getClass(), "printSectionSummary", true);
        setField(term81123, term81123.getClass(), "sectionSummaryRowFormat", "CNqMxLvtcJ");
        setBooleanField(term81123, term81123.getClass(), "printSectionTrailer", true);
        setField(term81123, term81123.getClass(), "sectionTrailerFormat", "ktbqerIaKW");
        setField(term81123, term81123.getClass(), "durationFormat", enum274);
        setBooleanField(term81123, term81123.getClass(), "printLegend", true);
        setField(term81123, term81123.getClass(), "simpleLine", "VoghngXfsK");
        setField(term81123, term81123.getClass(), "alternativeLine", "GbahCBMvct");
        setField(term81123, term81123.getClass(), "excludedTypes", term81249);
        setField(term81123, term81123.getClass(), "customCounterNames", term81265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withLegends", argTypes, term81123, args);
    }

};


