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

public class PrintStyleBuilder_withoutLegends_178235200322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72348;

    public PrintStyleBuilder_withoutLegends_178235200322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72502 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term72501 = ((Class) term72502).getDeclaredField((String) "SUMMARIZED");
        ((Field) term72501).setAccessible(true);
        Object enum243 = ((Field) term72501).get((Object) null);
        Class<? extends Object> term72824 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term72823 = ((Class) term72824).getDeclaredField((String) "FULL");
        ((Field) term72823).setAccessible(true);
        Object enum244 = ((Field) term72823).get((Object) null);
        Class<? extends Object> term73073 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73072 = ((Class) term73073).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term73072).setAccessible(true);
        Object enum245 =  ((Field) term73072).get((Object) null);
        Class<? extends Object> term73288 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73287 = ((Class) term73288).getDeclaredField((String) "USER_TIME");
        ((Field) term73287).setAccessible(true);
        Object enum246 =  ((Field) term73287).get((Object) null);
        Class<? extends Object> term73497 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73496 = ((Class) term73497).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term73496).setAccessible(true);
        Object enum247 =  ((Field) term73496).get((Object) null);
        Class<? extends Object> term73724 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term73723 = ((Class) term73724).getDeclaredField((String) "CPU_TIME");
        ((Field) term73723).setAccessible(true);
        Object enum248 =  ((Field) term73723).get((Object) null);
        ArrayList term72472 = new ArrayList();
        ((ArrayList) term72472).add(enum245);
        ((ArrayList) term72472).add(enum245);
        ((ArrayList) term72472).add(enum246);
        ((ArrayList) term72472).add(enum245);
        ((ArrayList) term72472).add(enum246);
        ((ArrayList) term72472).add(enum247);
        ((ArrayList) term72472).add(enum248);
        ((ArrayList) term72472).add(enum248);
        ((ArrayList) term72472).add(enum245);
        HashMap term72492 = new HashMap();
        term72348 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term72348, term72348.getClass(), "printFormat", enum243);
        setBooleanField(term72348, term72348.getClass(), "printHeader", false);
        setField(term72348, term72348.getClass(), "headerFormat", "wwAwLLcLPp");
        setBooleanField(term72348, term72348.getClass(), "printTrailer", false);
        setField(term72348, term72348.getClass(), "trailerFormat", "nHpMKOmlpQ");
        setField(term72348, term72348.getClass(), "rowFormat", "fKhrQsJToZ");
        setField(term72348, term72348.getClass(), "sectionHeaderFormat", "wsysQLGFnl");
        setBooleanField(term72348, term72348.getClass(), "printSectionSummary", false);
        setField(term72348, term72348.getClass(), "sectionSummaryRowFormat", "ckQLZGFjMX");
        setBooleanField(term72348, term72348.getClass(), "printSectionTrailer", false);
        setField(term72348, term72348.getClass(), "sectionTrailerFormat", "qphdrqUtNx");
        setField(term72348, term72348.getClass(), "durationFormat", enum244);
        setBooleanField(term72348, term72348.getClass(), "printLegend", false);
        setField(term72348, term72348.getClass(), "simpleLine", "bwlLFAfNWx");
        setField(term72348, term72348.getClass(), "alternativeLine", "JWodNQzjjV");
        setField(term72348, term72348.getClass(), "excludedTypes", term72472);
        setField(term72348, term72348.getClass(), "customCounterNames", term72492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutLegends", argTypes, term72348, args);
    }

};


