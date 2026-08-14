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

public class PrintStyleBuilder_withRowFormat_8140201852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51069;

    public PrintStyleBuilder_withRowFormat_8140201852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51221 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term51220 = ((Class) term51221).getDeclaredField((String) "DETAILED");
        ((Field) term51220).setAccessible(true);
        Object enum171 = ((Field) term51220).get((Object) null);
        Class<? extends Object> term51537 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term51536 = ((Class) term51537).getDeclaredField((String) "FULL");
        ((Field) term51536).setAccessible(true);
        Object enum172 = ((Field) term51536).get((Object) null);
        Class<? extends Object> term51786 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term51785 = ((Class) term51786).getDeclaredField((String) "USER_TIME");
        ((Field) term51785).setAccessible(true);
        Object enum173 =  ((Field) term51785).get((Object) null);
        ArrayList term51191 = new ArrayList();
        ((ArrayList) term51191).add(enum173);
        HashMap term51199 = new HashMap();
        term51069 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term51069, term51069.getClass(), "printFormat", enum171);
        setBooleanField(term51069, term51069.getClass(), "printHeader", false);
        setField(term51069, term51069.getClass(), "headerFormat", "aQFUvuaYxd");
        setBooleanField(term51069, term51069.getClass(), "printTrailer", false);
        setField(term51069, term51069.getClass(), "trailerFormat", "zNFLXMifnS");
        setField(term51069, term51069.getClass(), "rowFormat", "HHQcYMSBVc");
        setField(term51069, term51069.getClass(), "sectionHeaderFormat", "wdoqITnaAP");
        setBooleanField(term51069, term51069.getClass(), "printSectionSummary", false);
        setField(term51069, term51069.getClass(), "sectionSummaryRowFormat", "rIPMBcrNqB");
        setBooleanField(term51069, term51069.getClass(), "printSectionTrailer", false);
        setField(term51069, term51069.getClass(), "sectionTrailerFormat", "UDaboHZHhz");
        setField(term51069, term51069.getClass(), "durationFormat", enum172);
        setBooleanField(term51069, term51069.getClass(), "printLegend", true);
        setField(term51069, term51069.getClass(), "simpleLine", "nRvKihUSPj");
        setField(term51069, term51069.getClass(), "alternativeLine", "BbNeQJpYPr");
        setField(term51069, term51069.getClass(), "excludedTypes", term51191);
        setField(term51069, term51069.getClass(), "customCounterNames", term51199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YAXkVjQZcV";
        callMethod(klass, "withRowFormat", argTypes, term51069, args);
    }

};


