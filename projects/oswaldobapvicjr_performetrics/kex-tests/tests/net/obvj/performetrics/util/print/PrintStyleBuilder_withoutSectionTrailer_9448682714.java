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

public class PrintStyleBuilder_withoutSectionTrailer_9448682714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62885;

    public PrintStyleBuilder_withoutSectionTrailer_9448682714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63188 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term63187 = ((Class) term63188).getDeclaredField((String) "DETAILED");
        ((Field) term63187).setAccessible(true);
        Object enum211 = ((Field) term63187).get((Object) null);
        Class<? extends Object> term63504 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term63503 = ((Class) term63504).getDeclaredField((String) "LINUX");
        ((Field) term63503).setAccessible(true);
        Object enum212 = ((Field) term63503).get((Object) null);
        Class<? extends Object> term63756 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term63755 = ((Class) term63756).getDeclaredField((String) "USER_TIME");
        ((Field) term63755).setAccessible(true);
        Object enum213 =  ((Field) term63755).get((Object) null);
        Class<? extends Object> term63965 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term63964 = ((Class) term63965).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term63964).setAccessible(true);
        Object enum214 =  ((Field) term63964).get((Object) null);
        Class<? extends Object> term64180 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term64179 = ((Class) term64180).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term64179).setAccessible(true);
        Object enum215 =  ((Field) term64179).get((Object) null);
        ArrayList term63162 = new ArrayList();
        ((ArrayList) term63162).add(enum213);
        ((ArrayList) term63162).add(enum214);
        ((ArrayList) term63162).add(enum215);
        ((ArrayList) term63162).add(enum213);
        ((ArrayList) term63162).add(enum215);
        HashMap term63178 = new HashMap();
        term62885 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term62885, term62885.getClass(), "printFormat", enum211);
        setBooleanField(term62885, term62885.getClass(), "printHeader", true);
        setField(term62885, term62885.getClass(), "headerFormat", "zjZYTddemL");
        setBooleanField(term62885, term62885.getClass(), "printTrailer", true);
        setField(term62885, term62885.getClass(), "trailerFormat", "QtrylgCLiF");
        setField(term62885, term62885.getClass(), "rowFormat", "orEuhCStGM");
        setField(term62885, term62885.getClass(), "sectionHeaderFormat", "HhEaSXWvrY");
        setBooleanField(term62885, term62885.getClass(), "printSectionSummary", true);
        setField(term62885, term62885.getClass(), "sectionSummaryRowFormat", "CVRGEomOth");
        setBooleanField(term62885, term62885.getClass(), "printSectionTrailer", true);
        setField(term62885, term62885.getClass(), "sectionTrailerFormat", "vSeruUyNWX");
        setField(term62885, term62885.getClass(), "durationFormat", enum212);
        setBooleanField(term62885, term62885.getClass(), "printLegend", true);
        setField(term62885, term62885.getClass(), "simpleLine", "UkKvaeJfEC");
        setField(term62885, term62885.getClass(), "alternativeLine", "WPxXsahPRq");
        setField(term62885, term62885.getClass(), "excludedTypes", term63162);
        setField(term62885, term62885.getClass(), "customCounterNames", term63178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutSectionTrailer", argTypes, term62885, args);
    }

};


