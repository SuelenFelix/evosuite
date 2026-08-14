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

public class PrintStyle_getSimpleLine_182930310919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52739;

    public PrintStyle_getSimpleLine_182930310919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52890 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term52889 = ((Class) term52890).getDeclaredField((String) "DETAILED");
        ((Field) term52889).setAccessible(true);
        Object enum179 = ((Field) term52889).get((Object) null);
        Class<? extends Object> term53206 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term53205 = ((Class) term53206).getDeclaredField((String) "SHORTER");
        ((Field) term53205).setAccessible(true);
        Object enum180 = ((Field) term53205).get((Object) null);
        Class<? extends Object> term53464 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term53463 = ((Class) term53464).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term53463).setAccessible(true);
        Object enum181 =  ((Field) term53463).get((Object) null);
        Class<? extends Object> term53691 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term53690 = ((Class) term53691).getDeclaredField((String) "USER_TIME");
        ((Field) term53690).setAccessible(true);
        Object enum182 =  ((Field) term53690).get((Object) null);
        Class<? extends Object> term53900 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term53899 = ((Class) term53900).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term53899).setAccessible(true);
        Object enum183 =  ((Field) term53899).get((Object) null);
        ArrayList term52864 = new ArrayList();
        ((ArrayList) term52864).add(enum181);
        ((ArrayList) term52864).add(enum182);
        ((ArrayList) term52864).add(enum181);
        ((ArrayList) term52864).add(enum183);
        HashMap term52880 = new HashMap();
        term52739 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term52739, term52739.getClass(), "printFormat", enum179);
        setBooleanField(term52739, term52739.getClass(), "printHeader", true);
        setField(term52739, term52739.getClass(), "headerFormat", "zNdorvdUgu");
        setBooleanField(term52739, term52739.getClass(), "printTrailer", false);
        setField(term52739, term52739.getClass(), "trailerFormat", "oPxuZbkYio");
        setField(term52739, term52739.getClass(), "rowFormat", "vKitydDVnM");
        setField(term52739, term52739.getClass(), "sectionHeaderFormat", "urCiQnUFBM");
        setBooleanField(term52739, term52739.getClass(), "printSectionSummary", false);
        setField(term52739, term52739.getClass(), "sectionSummaryRowFormat", "EKjQdtKxAM");
        setBooleanField(term52739, term52739.getClass(), "printSectionTrailer", true);
        setField(term52739, term52739.getClass(), "sectionTrailerFormat", "TXZAIPQJHt");
        setField(term52739, term52739.getClass(), "durationFormat", enum180);
        setBooleanField(term52739, term52739.getClass(), "printLegend", false);
        setField(term52739, term52739.getClass(), "simpleLine", "DIbeDHICho");
        setField(term52739, term52739.getClass(), "alternativeLine", "dJGPlmSRnz");
        setField(term52739, term52739.getClass(), "excludedTypes", term52864);
        setField(term52739, term52739.getClass(), "customCounterNames", term52880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleLine", argTypes, term52739, args);
    }

};


