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

public class PrintStyle_isPrintSectionTrailer_114852126910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81669;

    public PrintStyle_isPrintSectionTrailer_114852126910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81820 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term81819 = ((Class) term81820).getDeclaredField((String) "DETAILED");
        ((Field) term81819).setAccessible(true);
        Object enum274 = ((Field) term81819).get((Object) null);
        Class<? extends Object> term82136 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term82135 = ((Class) term82136).getDeclaredField((String) "SHORTER");
        ((Field) term82135).setAccessible(true);
        Object enum275 = ((Field) term82135).get((Object) null);
        Class<? extends Object> term82394 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82393 = ((Class) term82394).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term82393).setAccessible(true);
        Object enum276 =  ((Field) term82393).get((Object) null);
        Class<? extends Object> term82621 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82620 = ((Class) term82621).getDeclaredField((String) "CPU_TIME");
        ((Field) term82620).setAccessible(true);
        Object enum277 =  ((Field) term82620).get((Object) null);
        Class<? extends Object> term82827 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term82826 = ((Class) term82827).getDeclaredField((String) "USER_TIME");
        ((Field) term82826).setAccessible(true);
        Object enum278 =  ((Field) term82826).get((Object) null);
        ArrayList term81794 = new ArrayList();
        ((ArrayList) term81794).add(enum276);
        ((ArrayList) term81794).add(enum277);
        ((ArrayList) term81794).add(enum278);
        ((ArrayList) term81794).add(enum278);
        ((ArrayList) term81794).add(enum278);
        HashMap term81810 = new HashMap();
        term81669 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term81669, term81669.getClass(), "printFormat", enum274);
        setBooleanField(term81669, term81669.getClass(), "printHeader", false);
        setField(term81669, term81669.getClass(), "headerFormat", "vvoLrMGCoN");
        setBooleanField(term81669, term81669.getClass(), "printTrailer", true);
        setField(term81669, term81669.getClass(), "trailerFormat", "pXdglvyrQe");
        setField(term81669, term81669.getClass(), "rowFormat", "OcfNzHYdki");
        setField(term81669, term81669.getClass(), "sectionHeaderFormat", "uPuCVuZYOI");
        setBooleanField(term81669, term81669.getClass(), "printSectionSummary", true);
        setField(term81669, term81669.getClass(), "sectionSummaryRowFormat", "TweMFhxNdj");
        setBooleanField(term81669, term81669.getClass(), "printSectionTrailer", false);
        setField(term81669, term81669.getClass(), "sectionTrailerFormat", "NBrvVzvQHe");
        setField(term81669, term81669.getClass(), "durationFormat", enum275);
        setBooleanField(term81669, term81669.getClass(), "printLegend", true);
        setField(term81669, term81669.getClass(), "simpleLine", "FjOiNAfBOc");
        setField(term81669, term81669.getClass(), "alternativeLine", "iCCsaLHohG");
        setField(term81669, term81669.getClass(), "excludedTypes", term81794);
        setField(term81669, term81669.getClass(), "customCounterNames", term81810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term81669, args);
    }

};


