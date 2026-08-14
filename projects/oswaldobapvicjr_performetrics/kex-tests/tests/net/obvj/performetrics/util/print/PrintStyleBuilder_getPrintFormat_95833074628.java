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

public class PrintStyleBuilder_getPrintFormat_95833074628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81359;

    public PrintStyleBuilder_getPrintFormat_95833074628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81511 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term81510 = ((Class) term81511).getDeclaredField((String) "SUMMARIZED");
        ((Field) term81510).setAccessible(true);
        Object enum275 = ((Field) term81510).get((Object) null);
        Class<? extends Object> term81833 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term81832 = ((Class) term81833).getDeclaredField((String) "ISO_8601");
        ((Field) term81832).setAccessible(true);
        Object enum276 = ((Field) term81832).get((Object) null);
        Class<? extends Object> term82094 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82093 = ((Class) term82094).getDeclaredField((String) "CPU_TIME");
        ((Field) term82093).setAccessible(true);
        Object enum277 =  ((Field) term82093).get((Object) null);
        Class<? extends Object> term82300 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82299 = ((Class) term82300).getDeclaredField((String) "USER_TIME");
        ((Field) term82299).setAccessible(true);
        Object enum278 =  ((Field) term82299).get((Object) null);
        ArrayList term81487 = new ArrayList();
        ((ArrayList) term81487).add(enum277);
        ((ArrayList) term81487).add(enum278);
        ((ArrayList) term81487).add(enum278);
        HashMap term81499 = new HashMap();
        term81359 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term81359, term81359.getClass(), "printFormat", enum275);
        setBooleanField(term81359, term81359.getClass(), "printHeader", false);
        setField(term81359, term81359.getClass(), "headerFormat", "DGRqjjdhzy");
        setBooleanField(term81359, term81359.getClass(), "printTrailer", true);
        setField(term81359, term81359.getClass(), "trailerFormat", "lQFkjJUPAR");
        setField(term81359, term81359.getClass(), "rowFormat", "BsuVlGUUjV");
        setField(term81359, term81359.getClass(), "sectionHeaderFormat", "bHHjfDCntT");
        setBooleanField(term81359, term81359.getClass(), "printSectionSummary", false);
        setField(term81359, term81359.getClass(), "sectionSummaryRowFormat", "sEphiduvkv");
        setBooleanField(term81359, term81359.getClass(), "printSectionTrailer", false);
        setField(term81359, term81359.getClass(), "sectionTrailerFormat", "PbLgCSAHce");
        setField(term81359, term81359.getClass(), "durationFormat", enum276);
        setBooleanField(term81359, term81359.getClass(), "printLegend", true);
        setField(term81359, term81359.getClass(), "simpleLine", "NWldOLAbqk");
        setField(term81359, term81359.getClass(), "alternativeLine", "qnYaYSpDwO");
        setField(term81359, term81359.getClass(), "excludedTypes", term81487);
        setField(term81359, term81359.getClass(), "customCounterNames", term81499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term81359, args);
    }

};


