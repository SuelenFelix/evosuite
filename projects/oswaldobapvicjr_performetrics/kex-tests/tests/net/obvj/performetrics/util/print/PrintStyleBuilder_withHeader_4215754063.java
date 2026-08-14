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

public class PrintStyleBuilder_withHeader_4215754063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52004;

    public PrintStyleBuilder_withHeader_4215754063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52307 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term52306 = ((Class) term52307).getDeclaredField((String) "DETAILED");
        ((Field) term52306).setAccessible(true);
        Object enum174 = ((Field) term52306).get((Object) null);
        Class<? extends Object> term52623 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term52622 = ((Class) term52623).getDeclaredField((String) "LINUX");
        ((Field) term52622).setAccessible(true);
        Object enum175 = ((Field) term52622).get((Object) null);
        Class<? extends Object> term52875 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term52874 = ((Class) term52875).getDeclaredField((String) "USER_TIME");
        ((Field) term52874).setAccessible(true);
        Object enum176 =  ((Field) term52874).get((Object) null);
        Class<? extends Object> term53084 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term53083 = ((Class) term53084).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term53083).setAccessible(true);
        Object enum177 =  ((Field) term53083).get((Object) null);
        Class<? extends Object> term53299 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term53298 = ((Class) term53299).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term53298).setAccessible(true);
        Object enum178 =  ((Field) term53298).get((Object) null);
        ArrayList term52281 = new ArrayList();
        ((ArrayList) term52281).add(enum176);
        ((ArrayList) term52281).add(enum177);
        ((ArrayList) term52281).add(enum178);
        ((ArrayList) term52281).add(enum177);
        ((ArrayList) term52281).add(enum176);
        ((ArrayList) term52281).add(enum178);
        HashMap term52297 = new HashMap();
        term52004 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term52004, term52004.getClass(), "printFormat", enum174);
        setBooleanField(term52004, term52004.getClass(), "printHeader", true);
        setField(term52004, term52004.getClass(), "headerFormat", "pumvwBWvpy");
        setBooleanField(term52004, term52004.getClass(), "printTrailer", true);
        setField(term52004, term52004.getClass(), "trailerFormat", "HwLHeGLyhe");
        setField(term52004, term52004.getClass(), "rowFormat", "RDnkgWkcbz");
        setField(term52004, term52004.getClass(), "sectionHeaderFormat", "IBpaxltauX");
        setBooleanField(term52004, term52004.getClass(), "printSectionSummary", false);
        setField(term52004, term52004.getClass(), "sectionSummaryRowFormat", "hePqROaplw");
        setBooleanField(term52004, term52004.getClass(), "printSectionTrailer", true);
        setField(term52004, term52004.getClass(), "sectionTrailerFormat", "PJcSNDruWd");
        setField(term52004, term52004.getClass(), "durationFormat", enum175);
        setBooleanField(term52004, term52004.getClass(), "printLegend", false);
        setField(term52004, term52004.getClass(), "simpleLine", "VVNNlAePXF");
        setField(term52004, term52004.getClass(), "alternativeLine", "jnwVnmKAFv");
        setField(term52004, term52004.getClass(), "excludedTypes", term52281);
        setField(term52004, term52004.getClass(), "customCounterNames", term52297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withHeader", argTypes, term52004, args);
    }

};


