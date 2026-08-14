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

public class PrintStyle_getHeaderFormat_16276176714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32891;

    public PrintStyle_getHeaderFormat_16276176714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33190 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term33189 = ((Class) term33190).getDeclaredField((String) "DETAILED");
        ((Field) term33189).setAccessible(true);
        Object enum107 = ((Field) term33189).get((Object) null);
        Class<? extends Object> term33506 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term33505 = ((Class) term33506).getDeclaredField((String) "LINUX");
        ((Field) term33505).setAccessible(true);
        Object enum108 = ((Field) term33505).get((Object) null);
        Class<? extends Object> term33758 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term33757 = ((Class) term33758).getDeclaredField((String) "CPU_TIME");
        ((Field) term33757).setAccessible(true);
        Object enum109 =  ((Field) term33757).get((Object) null);
        Class<? extends Object> term33964 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term33963 = ((Class) term33964).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term33963).setAccessible(true);
        Object enum110 =  ((Field) term33963).get((Object) null);
        ArrayList term33168 = new ArrayList();
        ((ArrayList) term33168).add(enum109);
        ((ArrayList) term33168).add(enum110);
        ((ArrayList) term33168).add(enum109);
        ((ArrayList) term33168).add(enum109);
        HashMap term33180 = new HashMap();
        term32891 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term32891, term32891.getClass(), "printFormat", enum107);
        setBooleanField(term32891, term32891.getClass(), "printHeader", false);
        setField(term32891, term32891.getClass(), "headerFormat", "kGMQdqJYyB");
        setBooleanField(term32891, term32891.getClass(), "printTrailer", false);
        setField(term32891, term32891.getClass(), "trailerFormat", "XJJNClzHRf");
        setField(term32891, term32891.getClass(), "rowFormat", "HDaezxQfQR");
        setField(term32891, term32891.getClass(), "sectionHeaderFormat", "iikZEapDlu");
        setBooleanField(term32891, term32891.getClass(), "printSectionSummary", true);
        setField(term32891, term32891.getClass(), "sectionSummaryRowFormat", "nhoHrZfnIN");
        setBooleanField(term32891, term32891.getClass(), "printSectionTrailer", false);
        setField(term32891, term32891.getClass(), "sectionTrailerFormat", "ZkMALXpEAZ");
        setField(term32891, term32891.getClass(), "durationFormat", enum108);
        setBooleanField(term32891, term32891.getClass(), "printLegend", false);
        setField(term32891, term32891.getClass(), "simpleLine", "tXfQjSqDzN");
        setField(term32891, term32891.getClass(), "alternativeLine", "BjugTaMcxJ");
        setField(term32891, term32891.getClass(), "excludedTypes", term33168);
        setField(term32891, term32891.getClass(), "customCounterNames", term33180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderFormat", argTypes, term32891, args);
    }

};


