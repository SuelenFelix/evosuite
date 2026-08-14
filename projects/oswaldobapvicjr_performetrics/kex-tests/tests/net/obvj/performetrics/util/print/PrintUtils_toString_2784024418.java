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

public class PrintUtils_toString_2784024418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17906;

    public PrintUtils_toString_2784024418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18059 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term18058 = ((Class) term18059).getDeclaredField((String) "SUMMARIZED");
        ((Field) term18058).setAccessible(true);
        Object enum56 = ((Field) term18058).get((Object) null);
        Class<? extends Object> term18381 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term18380 = ((Class) term18381).getDeclaredField((String) "SHORTER");
        ((Field) term18380).setAccessible(true);
        Object enum57 = ((Field) term18380).get((Object) null);
        Class<? extends Object> term18639 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term18638 = ((Class) term18639).getDeclaredField((String) "CPU_TIME");
        ((Field) term18638).setAccessible(true);
        Object enum58 =  ((Field) term18638).get((Object) null);
        Class<? extends Object> term18845 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term18844 = ((Class) term18845).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term18844).setAccessible(true);
        Object enum59 =  ((Field) term18844).get((Object) null);
        Class<? extends Object> term19072 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term19071 = ((Class) term19072).getDeclaredField((String) "USER_TIME");
        ((Field) term19071).setAccessible(true);
        Object enum60 =  ((Field) term19071).get((Object) null);
        ArrayList term18033 = new ArrayList();
        ((ArrayList) term18033).add(enum58);
        ((ArrayList) term18033).add(enum58);
        ((ArrayList) term18033).add(enum59);
        ((ArrayList) term18033).add(enum60);
        ((ArrayList) term18033).add(enum60);
        ((ArrayList) term18033).add(enum58);
        ((ArrayList) term18033).add(enum58);
        HashMap term18049 = new HashMap();
        term17906 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term17906, term17906.getClass(), "printFormat", enum56);
        setBooleanField(term17906, term17906.getClass(), "printHeader", false);
        setField(term17906, term17906.getClass(), "headerFormat", "XPKmummaqg");
        setBooleanField(term17906, term17906.getClass(), "printTrailer", false);
        setField(term17906, term17906.getClass(), "trailerFormat", "BKLfkLiZTH");
        setField(term17906, term17906.getClass(), "rowFormat", "SPpkrGcPRr");
        setField(term17906, term17906.getClass(), "sectionHeaderFormat", "sEccwbJKYE");
        setBooleanField(term17906, term17906.getClass(), "printSectionSummary", false);
        setField(term17906, term17906.getClass(), "sectionSummaryRowFormat", "AWRooQKkdW");
        setBooleanField(term17906, term17906.getClass(), "printSectionTrailer", false);
        setField(term17906, term17906.getClass(), "sectionTrailerFormat", "vjxIhXHxGR");
        setField(term17906, term17906.getClass(), "durationFormat", enum57);
        setBooleanField(term17906, term17906.getClass(), "printLegend", false);
        setField(term17906, term17906.getClass(), "simpleLine", "QXzGXbEXMu");
        setField(term17906, term17906.getClass(), "alternativeLine", "qxSDVejjiY");
        setField(term17906, term17906.getClass(), "excludedTypes", term18033);
        setField(term17906, term17906.getClass(), "customCounterNames", term18049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17906;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


