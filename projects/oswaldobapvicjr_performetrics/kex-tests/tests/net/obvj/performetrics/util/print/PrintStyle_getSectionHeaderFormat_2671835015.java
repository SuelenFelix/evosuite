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

public class PrintStyle_getSectionHeaderFormat_2671835015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48622;

    public PrintStyle_getSectionHeaderFormat_2671835015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48767 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term48766 = ((Class) term48767).getDeclaredField((String) "SUMMARIZED");
        ((Field) term48766).setAccessible(true);
        Object enum164 = ((Field) term48766).get((Object) null);
        Class<? extends Object> term49089 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term49088 = ((Class) term49089).getDeclaredField((String) "SHORT");
        ((Field) term49088).setAccessible(true);
        Object enum165 = ((Field) term49088).get((Object) null);
        Class<? extends Object> term49341 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term49340 = ((Class) term49341).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term49340).setAccessible(true);
        Object enum166 =  ((Field) term49340).get((Object) null);
        ArrayList term48747 = new ArrayList();
        ((ArrayList) term48747).add(enum166);
        HashMap term48755 = new HashMap();
        term48622 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term48622, term48622.getClass(), "printFormat", enum164);
        setBooleanField(term48622, term48622.getClass(), "printHeader", true);
        setField(term48622, term48622.getClass(), "headerFormat", "WVbxuoDBcn");
        setBooleanField(term48622, term48622.getClass(), "printTrailer", false);
        setField(term48622, term48622.getClass(), "trailerFormat", "pvDEABOxLt");
        setField(term48622, term48622.getClass(), "rowFormat", "beAMpkroCQ");
        setField(term48622, term48622.getClass(), "sectionHeaderFormat", "uSUvKAyuvd");
        setBooleanField(term48622, term48622.getClass(), "printSectionSummary", false);
        setField(term48622, term48622.getClass(), "sectionSummaryRowFormat", "onQLVONGuf");
        setBooleanField(term48622, term48622.getClass(), "printSectionTrailer", false);
        setField(term48622, term48622.getClass(), "sectionTrailerFormat", "SOrEHbcbmn");
        setField(term48622, term48622.getClass(), "durationFormat", enum165);
        setBooleanField(term48622, term48622.getClass(), "printLegend", true);
        setField(term48622, term48622.getClass(), "simpleLine", "bnsyeQXFdu");
        setField(term48622, term48622.getClass(), "alternativeLine", "BwtdjiefJn");
        setField(term48622, term48622.getClass(), "excludedTypes", term48747);
        setField(term48622, term48622.getClass(), "customCounterNames", term48755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term48622, args);
    }

};


