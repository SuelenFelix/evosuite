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

public class PrintStyleBuilder_withDurationFormat_80952244017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79322;
     Object enum272;

    public PrintStyleBuilder_withDurationFormat_80952244017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79661 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term79660 = ((Class) term79661).getDeclaredField((String) "SUMMARIZED");
        ((Field) term79660).setAccessible(true);
        Object enum267 = ((Field) term79660).get((Object) null);
        Class<? extends Object> term79983 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term79982 = ((Class) term79983).getDeclaredField((String) "ISO_8601");
        ((Field) term79982).setAccessible(true);
        Object enum268 = ((Field) term79982).get((Object) null);
        Class<? extends Object> term80244 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80243 = ((Class) term80244).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term80243).setAccessible(true);
        Object enum269 =  ((Field) term80243).get((Object) null);
        Class<? extends Object> term80459 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80458 = ((Class) term80459).getDeclaredField((String) "CPU_TIME");
        ((Field) term80458).setAccessible(true);
        Object enum270 =  ((Field) term80458).get((Object) null);
        Class<? extends Object> term80665 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80664 = ((Class) term80665).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term80664).setAccessible(true);
        Object enum271 =  ((Field) term80664).get((Object) null);
        ArrayList term79450 = new ArrayList();
        ((ArrayList) term79450).add(enum269);
        ((ArrayList) term79450).add(enum270);
        ((ArrayList) term79450).add(enum271);
        ((ArrayList) term79450).add(enum269);
        ((ArrayList) term79450).add(enum269);
        ((ArrayList) term79450).add(enum271);
        HashMap term79466 = new HashMap();
        term79322 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term79322, term79322.getClass(), "printFormat", enum267);
        setBooleanField(term79322, term79322.getClass(), "printHeader", false);
        setField(term79322, term79322.getClass(), "headerFormat", "FiYYLuailz");
        setBooleanField(term79322, term79322.getClass(), "printTrailer", false);
        setField(term79322, term79322.getClass(), "trailerFormat", "XebAeSnCKZ");
        setField(term79322, term79322.getClass(), "rowFormat", "GeddnXjHGy");
        setField(term79322, term79322.getClass(), "sectionHeaderFormat", "vLTbaoAxBm");
        setBooleanField(term79322, term79322.getClass(), "printSectionSummary", true);
        setField(term79322, term79322.getClass(), "sectionSummaryRowFormat", "BXTjEyEZxD");
        setBooleanField(term79322, term79322.getClass(), "printSectionTrailer", true);
        setField(term79322, term79322.getClass(), "sectionTrailerFormat", "oKhVzOKUFW");
        setField(term79322, term79322.getClass(), "durationFormat", enum268);
        setBooleanField(term79322, term79322.getClass(), "printLegend", false);
        setField(term79322, term79322.getClass(), "simpleLine", "mNHyqmOAFy");
        setField(term79322, term79322.getClass(), "alternativeLine", "UxgSdhxPCH");
        setField(term79322, term79322.getClass(), "excludedTypes", term79450);
        setField(term79322, term79322.getClass(), "customCounterNames", term79466);
        Class<? extends Object> term80892 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term80891 = ((Class) term80892).getDeclaredField((String) "LINUX");
        ((Field) term80891).setAccessible(true);
        enum272 = ((Field) term80891).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Object[] args = new Object[1];
        args[0] = enum272;
        callMethod(klass, "withDurationFormat", argTypes, term79322, args);
    }

};


