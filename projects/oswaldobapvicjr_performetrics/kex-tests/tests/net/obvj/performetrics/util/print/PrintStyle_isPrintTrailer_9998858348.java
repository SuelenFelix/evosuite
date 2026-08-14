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

public class PrintStyle_isPrintTrailer_9998858348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40485;

    public PrintStyle_isPrintTrailer_9998858348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40640 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term40639 = ((Class) term40640).getDeclaredField((String) "SUMMARIZED");
        ((Field) term40639).setAccessible(true);
        Object enum135 = ((Field) term40639).get((Object) null);
        Class<? extends Object> term40962 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term40961 = ((Class) term40962).getDeclaredField((String) "SHORT");
        ((Field) term40961).setAccessible(true);
        Object enum136 = ((Field) term40961).get((Object) null);
        Class<? extends Object> term41214 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41213 = ((Class) term41214).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term41213).setAccessible(true);
        Object enum137 =  ((Field) term41213).get((Object) null);
        Class<? extends Object> term41429 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41428 = ((Class) term41429).getDeclaredField((String) "CPU_TIME");
        ((Field) term41428).setAccessible(true);
        Object enum138 =  ((Field) term41428).get((Object) null);
        Class<? extends Object> term41635 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41634 = ((Class) term41635).getDeclaredField((String) "USER_TIME");
        ((Field) term41634).setAccessible(true);
        Object enum139 =  ((Field) term41634).get((Object) null);
        Class<? extends Object> term41844 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41843 = ((Class) term41844).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term41843).setAccessible(true);
        Object enum140 =  ((Field) term41843).get((Object) null);
        ArrayList term40610 = new ArrayList();
        ((ArrayList) term40610).add(enum137);
        ((ArrayList) term40610).add(enum138);
        ((ArrayList) term40610).add(enum139);
        ((ArrayList) term40610).add(enum138);
        ((ArrayList) term40610).add(enum140);
        ((ArrayList) term40610).add(enum140);
        ((ArrayList) term40610).add(enum137);
        ((ArrayList) term40610).add(enum139);
        HashMap term40630 = new HashMap();
        term40485 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term40485, term40485.getClass(), "printFormat", enum135);
        setBooleanField(term40485, term40485.getClass(), "printHeader", false);
        setField(term40485, term40485.getClass(), "headerFormat", "AZdLeSugwv");
        setBooleanField(term40485, term40485.getClass(), "printTrailer", false);
        setField(term40485, term40485.getClass(), "trailerFormat", "RMsXuyzKJV");
        setField(term40485, term40485.getClass(), "rowFormat", "FwPbDZcHmB");
        setField(term40485, term40485.getClass(), "sectionHeaderFormat", "hOncybyCAH");
        setBooleanField(term40485, term40485.getClass(), "printSectionSummary", false);
        setField(term40485, term40485.getClass(), "sectionSummaryRowFormat", "QduALnDSVo");
        setBooleanField(term40485, term40485.getClass(), "printSectionTrailer", true);
        setField(term40485, term40485.getClass(), "sectionTrailerFormat", "izPpKDErnQ");
        setField(term40485, term40485.getClass(), "durationFormat", enum136);
        setBooleanField(term40485, term40485.getClass(), "printLegend", false);
        setField(term40485, term40485.getClass(), "simpleLine", "NnpwZBUTvx");
        setField(term40485, term40485.getClass(), "alternativeLine", "tlQSNgTkQX");
        setField(term40485, term40485.getClass(), "excludedTypes", term40610);
        setField(term40485, term40485.getClass(), "customCounterNames", term40630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintTrailer", argTypes, term40485, args);
    }

};


