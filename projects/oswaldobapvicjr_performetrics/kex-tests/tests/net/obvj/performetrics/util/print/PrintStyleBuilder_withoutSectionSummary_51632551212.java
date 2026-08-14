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

public class PrintStyleBuilder_withoutSectionSummary_51632551212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60619;

    public PrintStyleBuilder_withoutSectionSummary_51632551212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60914 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term60913 = ((Class) term60914).getDeclaredField((String) "DETAILED");
        ((Field) term60913).setAccessible(true);
        Object enum204 = ((Field) term60913).get((Object) null);
        Class<? extends Object> term61230 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term61229 = ((Class) term61230).getDeclaredField((String) "LINUX");
        ((Field) term61229).setAccessible(true);
        Object enum205 = ((Field) term61229).get((Object) null);
        Class<? extends Object> term61482 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term61481 = ((Class) term61482).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term61481).setAccessible(true);
        Object enum206 =  ((Field) term61481).get((Object) null);
        ArrayList term60896 = new ArrayList();
        ((ArrayList) term60896).add(enum206);
        HashMap term60904 = new HashMap();
        term60619 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term60619, term60619.getClass(), "printFormat", enum204);
        setBooleanField(term60619, term60619.getClass(), "printHeader", true);
        setField(term60619, term60619.getClass(), "headerFormat", "mGRiYhnMcR");
        setBooleanField(term60619, term60619.getClass(), "printTrailer", true);
        setField(term60619, term60619.getClass(), "trailerFormat", "NFlvfJCVPO");
        setField(term60619, term60619.getClass(), "rowFormat", "KarbTXFmUU");
        setField(term60619, term60619.getClass(), "sectionHeaderFormat", "jiUSjqwSIQ");
        setBooleanField(term60619, term60619.getClass(), "printSectionSummary", false);
        setField(term60619, term60619.getClass(), "sectionSummaryRowFormat", "MgLCedQfoj");
        setBooleanField(term60619, term60619.getClass(), "printSectionTrailer", false);
        setField(term60619, term60619.getClass(), "sectionTrailerFormat", "zgKiINdgNu");
        setField(term60619, term60619.getClass(), "durationFormat", enum205);
        setBooleanField(term60619, term60619.getClass(), "printLegend", true);
        setField(term60619, term60619.getClass(), "simpleLine", "zLMTXDQHYH");
        setField(term60619, term60619.getClass(), "alternativeLine", "PqywFWJlpE");
        setField(term60619, term60619.getClass(), "excludedTypes", term60896);
        setField(term60619, term60619.getClass(), "customCounterNames", term60904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutSectionSummary", argTypes, term60619, args);
    }

};


