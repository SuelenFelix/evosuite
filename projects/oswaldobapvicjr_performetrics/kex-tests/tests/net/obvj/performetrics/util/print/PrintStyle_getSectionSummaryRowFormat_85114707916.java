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

public class PrintStyle_getSectionSummaryRowFormat_85114707916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49567;

    public PrintStyle_getSectionSummaryRowFormat_85114707916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49721 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term49720 = ((Class) term49721).getDeclaredField((String) "SUMMARIZED");
        ((Field) term49720).setAccessible(true);
        Object enum167 = ((Field) term49720).get((Object) null);
        Class<? extends Object> term50043 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term50042 = ((Class) term50043).getDeclaredField((String) "FULL");
        ((Field) term50042).setAccessible(true);
        Object enum168 = ((Field) term50042).get((Object) null);
        Class<? extends Object> term50292 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term50291 = ((Class) term50292).getDeclaredField((String) "USER_TIME");
        ((Field) term50291).setAccessible(true);
        Object enum169 =  ((Field) term50291).get((Object) null);
        Class<? extends Object> term50501 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term50500 = ((Class) term50501).getDeclaredField((String) "CPU_TIME");
        ((Field) term50500).setAccessible(true);
        Object enum170 =  ((Field) term50500).get((Object) null);
        Class<? extends Object> term50707 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term50706 = ((Class) term50707).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term50706).setAccessible(true);
        Object enum171 =  ((Field) term50706).get((Object) null);
        Class<? extends Object> term50922 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term50921 = ((Class) term50922).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term50921).setAccessible(true);
        Object enum172 =  ((Field) term50921).get((Object) null);
        ArrayList term49691 = new ArrayList();
        ((ArrayList) term49691).add(enum169);
        ((ArrayList) term49691).add(enum170);
        ((ArrayList) term49691).add(enum170);
        ((ArrayList) term49691).add(enum170);
        ((ArrayList) term49691).add(enum171);
        ((ArrayList) term49691).add(enum172);
        HashMap term49711 = new HashMap();
        term49567 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term49567, term49567.getClass(), "printFormat", enum167);
        setBooleanField(term49567, term49567.getClass(), "printHeader", false);
        setField(term49567, term49567.getClass(), "headerFormat", "SPtPatHeOm");
        setBooleanField(term49567, term49567.getClass(), "printTrailer", false);
        setField(term49567, term49567.getClass(), "trailerFormat", "ywmcuThdfL");
        setField(term49567, term49567.getClass(), "rowFormat", "GBOEuByOfr");
        setField(term49567, term49567.getClass(), "sectionHeaderFormat", "NHbOFFjyVK");
        setBooleanField(term49567, term49567.getClass(), "printSectionSummary", false);
        setField(term49567, term49567.getClass(), "sectionSummaryRowFormat", "zaloBqlrSo");
        setBooleanField(term49567, term49567.getClass(), "printSectionTrailer", true);
        setField(term49567, term49567.getClass(), "sectionTrailerFormat", "vvoLrMGCoN");
        setField(term49567, term49567.getClass(), "durationFormat", enum168);
        setBooleanField(term49567, term49567.getClass(), "printLegend", false);
        setField(term49567, term49567.getClass(), "simpleLine", "pXdglvyrQe");
        setField(term49567, term49567.getClass(), "alternativeLine", "OcfNzHYdki");
        setField(term49567, term49567.getClass(), "excludedTypes", term49691);
        setField(term49567, term49567.getClass(), "customCounterNames", term49711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionSummaryRowFormat", argTypes, term49567, args);
    }

};


