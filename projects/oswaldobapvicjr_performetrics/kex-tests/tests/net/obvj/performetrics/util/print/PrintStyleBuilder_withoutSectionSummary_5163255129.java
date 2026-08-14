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

public class PrintStyleBuilder_withoutSectionSummary_5163255129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69851;

    public PrintStyleBuilder_withoutSectionSummary_5163255129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69996 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term69995 = ((Class) term69996).getDeclaredField((String) "DETAILED");
        ((Field) term69995).setAccessible(true);
        Object enum235 = ((Field) term69995).get((Object) null);
        Class<? extends Object> term70312 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term70311 = ((Class) term70312).getDeclaredField((String) "SHORTER");
        ((Field) term70311).setAccessible(true);
        Object enum236 = ((Field) term70311).get((Object) null);
        Class<? extends Object> term70570 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term70569 = ((Class) term70570).getDeclaredField((String) "USER_TIME");
        ((Field) term70569).setAccessible(true);
        Object enum237 =  ((Field) term70569).get((Object) null);
        ArrayList term69976 = new ArrayList();
        ((ArrayList) term69976).add(enum237);
        HashMap term69984 = new HashMap();
        term69851 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term69851, term69851.getClass(), "printFormat", enum235);
        setBooleanField(term69851, term69851.getClass(), "printHeader", true);
        setField(term69851, term69851.getClass(), "headerFormat", "vhKzFyKPOT");
        setBooleanField(term69851, term69851.getClass(), "printTrailer", false);
        setField(term69851, term69851.getClass(), "trailerFormat", "nQhIgWXdRc");
        setField(term69851, term69851.getClass(), "rowFormat", "EusenEbIoF");
        setField(term69851, term69851.getClass(), "sectionHeaderFormat", "SScVQYSvWH");
        setBooleanField(term69851, term69851.getClass(), "printSectionSummary", false);
        setField(term69851, term69851.getClass(), "sectionSummaryRowFormat", "MnovcqFhCl");
        setBooleanField(term69851, term69851.getClass(), "printSectionTrailer", true);
        setField(term69851, term69851.getClass(), "sectionTrailerFormat", "qYtAeLzOhW");
        setField(term69851, term69851.getClass(), "durationFormat", enum236);
        setBooleanField(term69851, term69851.getClass(), "printLegend", false);
        setField(term69851, term69851.getClass(), "simpleLine", "tJzmOfcUnY");
        setField(term69851, term69851.getClass(), "alternativeLine", "TKlccZUpjz");
        setField(term69851, term69851.getClass(), "excludedTypes", term69976);
        setField(term69851, term69851.getClass(), "customCounterNames", term69984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutSectionSummary", argTypes, term69851, args);
    }

};


