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

public class PrintStyle_getAlternativeLine_71659092221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43125;

    public PrintStyle_getAlternativeLine_71659092221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43276 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term43275 = ((Class) term43276).getDeclaredField((String) "DETAILED");
        ((Field) term43275).setAccessible(true);
        Object enum143 = ((Field) term43275).get((Object) null);
        Class<? extends Object> term43592 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term43591 = ((Class) term43592).getDeclaredField((String) "SHORTER");
        ((Field) term43591).setAccessible(true);
        Object enum144 = ((Field) term43591).get((Object) null);
        Class<? extends Object> term43850 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term43849 = ((Class) term43850).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term43849).setAccessible(true);
        Object enum145 =  ((Field) term43849).get((Object) null);
        Class<? extends Object> term44077 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term44076 = ((Class) term44077).getDeclaredField((String) "USER_TIME");
        ((Field) term44076).setAccessible(true);
        Object enum146 =  ((Field) term44076).get((Object) null);
        Class<? extends Object> term44286 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term44285 = ((Class) term44286).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term44285).setAccessible(true);
        Object enum147 =  ((Field) term44285).get((Object) null);
        ArrayList term43250 = new ArrayList();
        ((ArrayList) term43250).add(enum145);
        ((ArrayList) term43250).add(enum146);
        ((ArrayList) term43250).add(enum145);
        ((ArrayList) term43250).add(enum147);
        ((ArrayList) term43250).add(enum145);
        ((ArrayList) term43250).add(enum146);
        ((ArrayList) term43250).add(enum146);
        HashMap term43266 = new HashMap();
        term43125 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term43125, term43125.getClass(), "printFormat", enum143);
        setBooleanField(term43125, term43125.getClass(), "printHeader", false);
        setField(term43125, term43125.getClass(), "headerFormat", "ZKMLioamsY");
        setBooleanField(term43125, term43125.getClass(), "printTrailer", false);
        setField(term43125, term43125.getClass(), "trailerFormat", "WVbxuoDBcn");
        setField(term43125, term43125.getClass(), "rowFormat", "pvDEABOxLt");
        setField(term43125, term43125.getClass(), "sectionHeaderFormat", "beAMpkroCQ");
        setBooleanField(term43125, term43125.getClass(), "printSectionSummary", true);
        setField(term43125, term43125.getClass(), "sectionSummaryRowFormat", "uSUvKAyuvd");
        setBooleanField(term43125, term43125.getClass(), "printSectionTrailer", false);
        setField(term43125, term43125.getClass(), "sectionTrailerFormat", "onQLVONGuf");
        setField(term43125, term43125.getClass(), "durationFormat", enum144);
        setBooleanField(term43125, term43125.getClass(), "printLegend", false);
        setField(term43125, term43125.getClass(), "simpleLine", "SOrEHbcbmn");
        setField(term43125, term43125.getClass(), "alternativeLine", "bnsyeQXFdu");
        setField(term43125, term43125.getClass(), "excludedTypes", term43250);
        setField(term43125, term43125.getClass(), "customCounterNames", term43266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlternativeLine", argTypes, term43125, args);
    }

};


