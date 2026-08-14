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

public class PrintStyle_getRowFormat_133967667814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47037;

    public PrintStyle_getRowFormat_133967667814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47192 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term47191 = ((Class) term47192).getDeclaredField((String) "DETAILED");
        ((Field) term47191).setAccessible(true);
        Object enum158 = ((Field) term47191).get((Object) null);
        Class<? extends Object> term47508 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term47507 = ((Class) term47508).getDeclaredField((String) "SHORTER");
        ((Field) term47507).setAccessible(true);
        Object enum159 = ((Field) term47507).get((Object) null);
        Class<? extends Object> term47766 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term47765 = ((Class) term47766).getDeclaredField((String) "USER_TIME");
        ((Field) term47765).setAccessible(true);
        Object enum160 =  ((Field) term47765).get((Object) null);
        Class<? extends Object> term47975 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term47974 = ((Class) term47975).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term47974).setAccessible(true);
        Object enum161 =  ((Field) term47974).get((Object) null);
        Class<? extends Object> term48202 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term48201 = ((Class) term48202).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term48201).setAccessible(true);
        Object enum162 =  ((Field) term48201).get((Object) null);
        Class<? extends Object> term48417 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term48416 = ((Class) term48417).getDeclaredField((String) "CPU_TIME");
        ((Field) term48416).setAccessible(true);
        Object enum163 =  ((Field) term48416).get((Object) null);
        ArrayList term47162 = new ArrayList();
        ((ArrayList) term47162).add(enum160);
        ((ArrayList) term47162).add(enum161);
        ((ArrayList) term47162).add(enum161);
        ((ArrayList) term47162).add(enum162);
        ((ArrayList) term47162).add(enum163);
        ((ArrayList) term47162).add(enum161);
        ((ArrayList) term47162).add(enum161);
        ((ArrayList) term47162).add(enum162);
        HashMap term47182 = new HashMap();
        term47037 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term47037, term47037.getClass(), "printFormat", enum158);
        setBooleanField(term47037, term47037.getClass(), "printHeader", false);
        setField(term47037, term47037.getClass(), "headerFormat", "CKWpJaaaxX");
        setBooleanField(term47037, term47037.getClass(), "printTrailer", true);
        setField(term47037, term47037.getClass(), "trailerFormat", "UBRmXJmfrt");
        setField(term47037, term47037.getClass(), "rowFormat", "WZzvmIHhzZ");
        setField(term47037, term47037.getClass(), "sectionHeaderFormat", "doQLHkjpNm");
        setBooleanField(term47037, term47037.getClass(), "printSectionSummary", true);
        setField(term47037, term47037.getClass(), "sectionSummaryRowFormat", "lCyLIcSuom");
        setBooleanField(term47037, term47037.getClass(), "printSectionTrailer", false);
        setField(term47037, term47037.getClass(), "sectionTrailerFormat", "CGOpQSZZwI");
        setField(term47037, term47037.getClass(), "durationFormat", enum159);
        setBooleanField(term47037, term47037.getClass(), "printLegend", true);
        setField(term47037, term47037.getClass(), "simpleLine", "ypEdrstygY");
        setField(term47037, term47037.getClass(), "alternativeLine", "sNQFlATEeQ");
        setField(term47037, term47037.getClass(), "excludedTypes", term47162);
        setField(term47037, term47037.getClass(), "customCounterNames", term47182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term47037, args);
    }

};


