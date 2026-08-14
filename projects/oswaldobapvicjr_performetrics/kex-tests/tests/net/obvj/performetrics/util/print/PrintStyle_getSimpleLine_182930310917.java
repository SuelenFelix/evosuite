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

public class PrintStyle_getSimpleLine_182930310917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90354;

    public PrintStyle_getSimpleLine_182930310917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90655 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term90654 = ((Class) term90655).getDeclaredField((String) "DETAILED");
        ((Field) term90654).setAccessible(true);
        Object enum305 = ((Field) term90654).get((Object) null);
        Class<? extends Object> term90971 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term90970 = ((Class) term90971).getDeclaredField((String) "LINUX");
        ((Field) term90970).setAccessible(true);
        Object enum306 = ((Field) term90970).get((Object) null);
        Class<? extends Object> term91223 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91222 = ((Class) term91223).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term91222).setAccessible(true);
        Object enum307 =  ((Field) term91222).get((Object) null);
        Class<? extends Object> term91450 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91449 = ((Class) term91450).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term91449).setAccessible(true);
        Object enum308 =  ((Field) term91449).get((Object) null);
        ArrayList term90631 = new ArrayList();
        ((ArrayList) term90631).add(enum307);
        ((ArrayList) term90631).add(enum308);
        ((ArrayList) term90631).add(enum307);
        HashMap term90643 = new HashMap();
        term90354 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term90354, term90354.getClass(), "printFormat", enum305);
        setBooleanField(term90354, term90354.getClass(), "printHeader", false);
        setField(term90354, term90354.getClass(), "headerFormat", "JeZFtaqkzW");
        setBooleanField(term90354, term90354.getClass(), "printTrailer", true);
        setField(term90354, term90354.getClass(), "trailerFormat", "vOVuNSCCLe");
        setField(term90354, term90354.getClass(), "rowFormat", "fzeqPnzpnt");
        setField(term90354, term90354.getClass(), "sectionHeaderFormat", "RxbhrFBjkO");
        setBooleanField(term90354, term90354.getClass(), "printSectionSummary", true);
        setField(term90354, term90354.getClass(), "sectionSummaryRowFormat", "aanyiAOJCl");
        setBooleanField(term90354, term90354.getClass(), "printSectionTrailer", true);
        setField(term90354, term90354.getClass(), "sectionTrailerFormat", "VDokbsCuqq");
        setField(term90354, term90354.getClass(), "durationFormat", enum306);
        setBooleanField(term90354, term90354.getClass(), "printLegend", true);
        setField(term90354, term90354.getClass(), "simpleLine", "xClUIcPECX");
        setField(term90354, term90354.getClass(), "alternativeLine", "avhRaGZaBF");
        setField(term90354, term90354.getClass(), "excludedTypes", term90631);
        setField(term90354, term90354.getClass(), "customCounterNames", term90643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleLine", argTypes, term90354, args);
    }

};


