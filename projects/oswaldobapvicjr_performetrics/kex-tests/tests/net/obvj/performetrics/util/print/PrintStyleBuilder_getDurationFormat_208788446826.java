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

public class PrintStyleBuilder_getDurationFormat_208788446826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91264;

    public PrintStyleBuilder_getDurationFormat_208788446826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91414 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term91413 = ((Class) term91414).getDeclaredField((String) "SUMMARIZED");
        ((Field) term91413).setAccessible(true);
        Object enum309 = ((Field) term91413).get((Object) null);
        Class<? extends Object> term91736 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term91735 = ((Class) term91736).getDeclaredField((String) "ISO_8601");
        ((Field) term91735).setAccessible(true);
        Object enum310 = ((Field) term91735).get((Object) null);
        Class<? extends Object> term91997 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91996 = ((Class) term91997).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term91996).setAccessible(true);
        Object enum311 =  ((Field) term91996).get((Object) null);
        Class<? extends Object> term92224 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term92223 = ((Class) term92224).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term92223).setAccessible(true);
        Object enum312 =  ((Field) term92223).get((Object) null);
        ArrayList term91392 = new ArrayList();
        ((ArrayList) term91392).add(enum311);
        ((ArrayList) term91392).add(enum312);
        HashMap term91404 = new HashMap();
        term91264 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term91264, term91264.getClass(), "printFormat", enum309);
        setBooleanField(term91264, term91264.getClass(), "printHeader", false);
        setField(term91264, term91264.getClass(), "headerFormat", "PGfCDJTBek");
        setBooleanField(term91264, term91264.getClass(), "printTrailer", false);
        setField(term91264, term91264.getClass(), "trailerFormat", "ZwjARhAtHC");
        setField(term91264, term91264.getClass(), "rowFormat", "XXvscsYBWv");
        setField(term91264, term91264.getClass(), "sectionHeaderFormat", "uePedtiAfL");
        setBooleanField(term91264, term91264.getClass(), "printSectionSummary", true);
        setField(term91264, term91264.getClass(), "sectionSummaryRowFormat", "AdSHvysxQB");
        setBooleanField(term91264, term91264.getClass(), "printSectionTrailer", true);
        setField(term91264, term91264.getClass(), "sectionTrailerFormat", "jlraKkBWFA");
        setField(term91264, term91264.getClass(), "durationFormat", enum310);
        setBooleanField(term91264, term91264.getClass(), "printLegend", false);
        setField(term91264, term91264.getClass(), "simpleLine", "mRBtFTxVdE");
        setField(term91264, term91264.getClass(), "alternativeLine", "IVacFDAZcj");
        setField(term91264, term91264.getClass(), "excludedTypes", term91392);
        setField(term91264, term91264.getClass(), "customCounterNames", term91404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDurationFormat", argTypes, term91264, args);
    }

};


