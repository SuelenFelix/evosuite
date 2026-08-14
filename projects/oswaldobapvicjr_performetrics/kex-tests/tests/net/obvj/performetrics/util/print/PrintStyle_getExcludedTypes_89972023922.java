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

public class PrintStyle_getExcludedTypes_89972023922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44500;

    public PrintStyle_getExcludedTypes_89972023922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44653 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term44652 = ((Class) term44653).getDeclaredField((String) "DETAILED");
        ((Field) term44652).setAccessible(true);
        Object enum148 = ((Field) term44652).get((Object) null);
        Class<? extends Object> term44969 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term44968 = ((Class) term44969).getDeclaredField((String) "SHORT");
        ((Field) term44968).setAccessible(true);
        Object enum149 = ((Field) term44968).get((Object) null);
        Class<? extends Object> term45221 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45220 = ((Class) term45221).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term45220).setAccessible(true);
        Object enum150 =  ((Field) term45220).get((Object) null);
        Class<? extends Object> term45448 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45447 = ((Class) term45448).getDeclaredField((String) "USER_TIME");
        ((Field) term45447).setAccessible(true);
        Object enum151 =  ((Field) term45447).get((Object) null);
        Class<? extends Object> term45657 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45656 = ((Class) term45657).getDeclaredField((String) "CPU_TIME");
        ((Field) term45656).setAccessible(true);
        Object enum152 =  ((Field) term45656).get((Object) null);
        Class<? extends Object> term45863 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term45862 = ((Class) term45863).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term45862).setAccessible(true);
        Object enum153 =  ((Field) term45862).get((Object) null);
        ArrayList term44623 = new ArrayList();
        ((ArrayList) term44623).add(enum150);
        ((ArrayList) term44623).add(enum151);
        ((ArrayList) term44623).add(enum152);
        ((ArrayList) term44623).add(enum151);
        ((ArrayList) term44623).add(enum152);
        ((ArrayList) term44623).add(enum150);
        ((ArrayList) term44623).add(enum153);
        HashMap term44643 = new HashMap();
        term44500 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term44500, term44500.getClass(), "printFormat", enum148);
        setBooleanField(term44500, term44500.getClass(), "printHeader", true);
        setField(term44500, term44500.getClass(), "headerFormat", "jDmhBrIoDa");
        setBooleanField(term44500, term44500.getClass(), "printTrailer", true);
        setField(term44500, term44500.getClass(), "trailerFormat", "SPtPatHeOm");
        setField(term44500, term44500.getClass(), "rowFormat", "ywmcuThdfL");
        setField(term44500, term44500.getClass(), "sectionHeaderFormat", "GBOEuByOfr");
        setBooleanField(term44500, term44500.getClass(), "printSectionSummary", false);
        setField(term44500, term44500.getClass(), "sectionSummaryRowFormat", "NHbOFFjyVK");
        setBooleanField(term44500, term44500.getClass(), "printSectionTrailer", true);
        setField(term44500, term44500.getClass(), "sectionTrailerFormat", "zaloBqlrSo");
        setField(term44500, term44500.getClass(), "durationFormat", enum149);
        setBooleanField(term44500, term44500.getClass(), "printLegend", true);
        setField(term44500, term44500.getClass(), "simpleLine", "vvoLrMGCoN");
        setField(term44500, term44500.getClass(), "alternativeLine", "pXdglvyrQe");
        setField(term44500, term44500.getClass(), "excludedTypes", term44623);
        setField(term44500, term44500.getClass(), "customCounterNames", term44643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term44500, args);
    }

};


