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
import java.lang.Character;
import java.lang.Integer;

public class PrintStyleBuilder_withSimpleLine_83332151516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65788;
     Object term65930;
     Object term65932;

    public PrintStyleBuilder_withSimpleLine_83332151516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65935 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term65934 = ((Class) term65935).getDeclaredField((String) "DETAILED");
        ((Field) term65934).setAccessible(true);
        Object enum221 = ((Field) term65934).get((Object) null);
        Class<? extends Object> term66251 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term66250 = ((Class) term66251).getDeclaredField((String) "SHORT");
        ((Field) term66250).setAccessible(true);
        Object enum222 = ((Field) term66250).get((Object) null);
        Class<? extends Object> term66503 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term66502 = ((Class) term66503).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term66502).setAccessible(true);
        Object enum223 =  ((Field) term66502).get((Object) null);
        ArrayList term65911 = new ArrayList();
        ((ArrayList) term65911).add(enum223);
        HashMap term65919 = new HashMap();
        term65788 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term65788, term65788.getClass(), "printFormat", enum221);
        setBooleanField(term65788, term65788.getClass(), "printHeader", true);
        setField(term65788, term65788.getClass(), "headerFormat", "nQhIgWXdRc");
        setBooleanField(term65788, term65788.getClass(), "printTrailer", false);
        setField(term65788, term65788.getClass(), "trailerFormat", "EusenEbIoF");
        setField(term65788, term65788.getClass(), "rowFormat", "SScVQYSvWH");
        setField(term65788, term65788.getClass(), "sectionHeaderFormat", "MnovcqFhCl");
        setBooleanField(term65788, term65788.getClass(), "printSectionSummary", false);
        setField(term65788, term65788.getClass(), "sectionSummaryRowFormat", "qYtAeLzOhW");
        setBooleanField(term65788, term65788.getClass(), "printSectionTrailer", false);
        setField(term65788, term65788.getClass(), "sectionTrailerFormat", "tJzmOfcUnY");
        setField(term65788, term65788.getClass(), "durationFormat", enum222);
        setBooleanField(term65788, term65788.getClass(), "printLegend", false);
        setField(term65788, term65788.getClass(), "simpleLine", "TKlccZUpjz");
        setField(term65788, term65788.getClass(), "alternativeLine", "GGzwMoHZXC");
        setField(term65788, term65788.getClass(), "excludedTypes", term65911);
        setField(term65788, term65788.getClass(), "customCounterNames", term65919);
        term65930 = new Character('j');
        term65932 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term65930;
        args[1] = term65932;
        callMethod(klass, "withSimpleLine", argTypes, term65788, args);
    }

};


