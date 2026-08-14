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

public class PrintStyleBuilder_getExcludedTypes_60303964840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109980;

    public PrintStyleBuilder_getExcludedTypes_60303964840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110125 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term110124 = ((Class) term110125).getDeclaredField((String) "SUMMARIZED");
        ((Field) term110124).setAccessible(true);
        Object enum375 = ((Field) term110124).get((Object) null);
        Class<? extends Object> term110447 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term110446 = ((Class) term110447).getDeclaredField((String) "SHORT");
        ((Field) term110446).setAccessible(true);
        Object enum376 = ((Field) term110446).get((Object) null);
        Class<? extends Object> term110699 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term110698 = ((Class) term110699).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term110698).setAccessible(true);
        Object enum377 =  ((Field) term110698).get((Object) null);
        ArrayList term110105 = new ArrayList();
        ((ArrayList) term110105).add(enum377);
        ((ArrayList) term110105).add(enum377);
        HashMap term110113 = new HashMap();
        term109980 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term109980, term109980.getClass(), "printFormat", enum375);
        setBooleanField(term109980, term109980.getClass(), "printHeader", false);
        setField(term109980, term109980.getClass(), "headerFormat", "ANHjlWPmZG");
        setBooleanField(term109980, term109980.getClass(), "printTrailer", false);
        setField(term109980, term109980.getClass(), "trailerFormat", "SibzENsyyy");
        setField(term109980, term109980.getClass(), "rowFormat", "mrqGHotaef");
        setField(term109980, term109980.getClass(), "sectionHeaderFormat", "UbZGBpQZQW");
        setBooleanField(term109980, term109980.getClass(), "printSectionSummary", false);
        setField(term109980, term109980.getClass(), "sectionSummaryRowFormat", "SvGTualQPa");
        setBooleanField(term109980, term109980.getClass(), "printSectionTrailer", false);
        setField(term109980, term109980.getClass(), "sectionTrailerFormat", "mdxcgZwsaP");
        setField(term109980, term109980.getClass(), "durationFormat", enum376);
        setBooleanField(term109980, term109980.getClass(), "printLegend", false);
        setField(term109980, term109980.getClass(), "simpleLine", "XildIRoZHG");
        setField(term109980, term109980.getClass(), "alternativeLine", "lEcrFlxJXH");
        setField(term109980, term109980.getClass(), "excludedTypes", term110105);
        setField(term109980, term109980.getClass(), "customCounterNames", term110113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term109980, args);
    }

};


