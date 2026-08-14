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

public class PrintStyle_isPrintTrailer_99988583411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29364;

    public PrintStyle_isPrintTrailer_99988583411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29659 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term29658 = ((Class) term29659).getDeclaredField((String) "SUMMARIZED");
        ((Field) term29658).setAccessible(true);
        Object enum96 = ((Field) term29658).get((Object) null);
        Class<? extends Object> term29981 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term29980 = ((Class) term29981).getDeclaredField((String) "LINUX");
        ((Field) term29980).setAccessible(true);
        Object enum97 = ((Field) term29980).get((Object) null);
        ArrayList term29643 = new ArrayList();
        HashMap term29647 = new HashMap();
        term29364 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term29364, term29364.getClass(), "printFormat", enum96);
        setBooleanField(term29364, term29364.getClass(), "printHeader", true);
        setField(term29364, term29364.getClass(), "headerFormat", "sQvGcVjdEx");
        setBooleanField(term29364, term29364.getClass(), "printTrailer", true);
        setField(term29364, term29364.getClass(), "trailerFormat", "rLHAoqXgPh");
        setField(term29364, term29364.getClass(), "rowFormat", "zUlRdimJtU");
        setField(term29364, term29364.getClass(), "sectionHeaderFormat", "vwbEQQNQrx");
        setBooleanField(term29364, term29364.getClass(), "printSectionSummary", false);
        setField(term29364, term29364.getClass(), "sectionSummaryRowFormat", "xtftXXMbem");
        setBooleanField(term29364, term29364.getClass(), "printSectionTrailer", true);
        setField(term29364, term29364.getClass(), "sectionTrailerFormat", "cudZvLMQon");
        setField(term29364, term29364.getClass(), "durationFormat", enum97);
        setBooleanField(term29364, term29364.getClass(), "printLegend", false);
        setField(term29364, term29364.getClass(), "simpleLine", "lihXWlGDxk");
        setField(term29364, term29364.getClass(), "alternativeLine", "JmcmxoGhIK");
        setField(term29364, term29364.getClass(), "excludedTypes", term29643);
        setField(term29364, term29364.getClass(), "customCounterNames", term29647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintTrailer", argTypes, term29364, args);
    }

};


