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

public class PrintStyleBuilder_withDurationFormat_80952244020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70239;
     Object enum239;

    public PrintStyleBuilder_withDurationFormat_80952244020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70396 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term70395 = ((Class) term70396).getDeclaredField((String) "SUMMARIZED");
        ((Field) term70395).setAccessible(true);
        Object enum236 = ((Field) term70395).get((Object) null);
        Class<? extends Object> term70718 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term70717 = ((Class) term70718).getDeclaredField((String) "SHORT");
        ((Field) term70717).setAccessible(true);
        Object enum237 = ((Field) term70717).get((Object) null);
        Class<? extends Object> term70970 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term70969 = ((Class) term70970).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term70969).setAccessible(true);
        Object enum238 =  ((Field) term70969).get((Object) null);
        ArrayList term70364 = new ArrayList();
        ((ArrayList) term70364).add(enum238);
        HashMap term70372 = new HashMap();
        term70239 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term70239, term70239.getClass(), "printFormat", enum236);
        setBooleanField(term70239, term70239.getClass(), "printHeader", false);
        setField(term70239, term70239.getClass(), "headerFormat", "UDlkdccCRn");
        setBooleanField(term70239, term70239.getClass(), "printTrailer", true);
        setField(term70239, term70239.getClass(), "trailerFormat", "McpzErOcYb");
        setField(term70239, term70239.getClass(), "rowFormat", "jqrVEUvYEz");
        setField(term70239, term70239.getClass(), "sectionHeaderFormat", "QITgiBrmfj");
        setBooleanField(term70239, term70239.getClass(), "printSectionSummary", false);
        setField(term70239, term70239.getClass(), "sectionSummaryRowFormat", "pXxkiXgQnq");
        setBooleanField(term70239, term70239.getClass(), "printSectionTrailer", false);
        setField(term70239, term70239.getClass(), "sectionTrailerFormat", "tKmrUDURku");
        setField(term70239, term70239.getClass(), "durationFormat", enum237);
        setBooleanField(term70239, term70239.getClass(), "printLegend", true);
        setField(term70239, term70239.getClass(), "simpleLine", "JeZbrwZmsP");
        setField(term70239, term70239.getClass(), "alternativeLine", "bxyfeicqrK");
        setField(term70239, term70239.getClass(), "excludedTypes", term70364);
        setField(term70239, term70239.getClass(), "customCounterNames", term70372);
        Class<? extends Object> term71185 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term71184 = ((Class) term71185).getDeclaredField((String) "ISO_8601");
        ((Field) term71184).setAccessible(true);
        enum239 = ((Field) term71184).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Object[] args = new Object[1];
        args[0] = enum239;
        callMethod(klass, "withDurationFormat", argTypes, term70239, args);
    }

};


