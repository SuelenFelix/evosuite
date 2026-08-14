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

public class PrintStyleBuilder_withHeader_5738285294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64593;

    public PrintStyleBuilder_withHeader_5738285294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64898 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term64897 = ((Class) term64898).getDeclaredField((String) "DETAILED");
        ((Field) term64897).setAccessible(true);
        Object enum219 = ((Field) term64897).get((Object) null);
        Class<? extends Object> term65214 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term65213 = ((Class) term65214).getDeclaredField((String) "LINUX");
        ((Field) term65213).setAccessible(true);
        Object enum220 = ((Field) term65213).get((Object) null);
        ArrayList term64870 = new ArrayList();
        HashMap term64874 = new HashMap();
        term64593 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term64593, term64593.getClass(), "printFormat", enum219);
        setBooleanField(term64593, term64593.getClass(), "printHeader", true);
        setField(term64593, term64593.getClass(), "headerFormat", "pFAfANnxup");
        setBooleanField(term64593, term64593.getClass(), "printTrailer", false);
        setField(term64593, term64593.getClass(), "trailerFormat", "FbSIUZyBXZ");
        setField(term64593, term64593.getClass(), "rowFormat", "mhQDwIyrRi");
        setField(term64593, term64593.getClass(), "sectionHeaderFormat", "HpZXWDPhlg");
        setBooleanField(term64593, term64593.getClass(), "printSectionSummary", false);
        setField(term64593, term64593.getClass(), "sectionSummaryRowFormat", "lBOokzEPfe");
        setBooleanField(term64593, term64593.getClass(), "printSectionTrailer", true);
        setField(term64593, term64593.getClass(), "sectionTrailerFormat", "dtGZCsKXbW");
        setField(term64593, term64593.getClass(), "durationFormat", enum220);
        setBooleanField(term64593, term64593.getClass(), "printLegend", true);
        setField(term64593, term64593.getClass(), "simpleLine", "bdyhHbDAmJ");
        setField(term64593, term64593.getClass(), "alternativeLine", "BBXiTNHqGE");
        setField(term64593, term64593.getClass(), "excludedTypes", term64870);
        setField(term64593, term64593.getClass(), "customCounterNames", term64874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KSJeYkkvpk";
        callMethod(klass, "withHeader", argTypes, term64593, args);
    }

};


