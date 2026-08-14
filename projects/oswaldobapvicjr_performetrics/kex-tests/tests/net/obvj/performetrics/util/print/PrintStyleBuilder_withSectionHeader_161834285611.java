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

public class PrintStyleBuilder_withSectionHeader_161834285611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59221;

    public PrintStyleBuilder_withSectionHeader_161834285611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59385 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term59384 = ((Class) term59385).getDeclaredField((String) "DETAILED");
        ((Field) term59384).setAccessible(true);
        Object enum199 = ((Field) term59384).get((Object) null);
        Class<? extends Object> term59701 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term59700 = ((Class) term59701).getDeclaredField((String) "ISO_8601");
        ((Field) term59700).setAccessible(true);
        Object enum200 = ((Field) term59700).get((Object) null);
        Class<? extends Object> term59962 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term59961 = ((Class) term59962).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term59961).setAccessible(true);
        Object enum201 =  ((Field) term59961).get((Object) null);
        Class<? extends Object> term60177 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term60176 = ((Class) term60177).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term60176).setAccessible(true);
        Object enum202 =  ((Field) term60176).get((Object) null);
        Class<? extends Object> term60404 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term60403 = ((Class) term60404).getDeclaredField((String) "CPU_TIME");
        ((Field) term60403).setAccessible(true);
        Object enum203 =  ((Field) term60403).get((Object) null);
        ArrayList term59347 = new ArrayList();
        ((ArrayList) term59347).add(enum201);
        ((ArrayList) term59347).add(enum202);
        ((ArrayList) term59347).add(enum203);
        ((ArrayList) term59347).add(enum201);
        HashMap term59363 = new HashMap();
        term59221 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term59221, term59221.getClass(), "printFormat", enum199);
        setBooleanField(term59221, term59221.getClass(), "printHeader", false);
        setField(term59221, term59221.getClass(), "headerFormat", "FbSIUZyBXZ");
        setBooleanField(term59221, term59221.getClass(), "printTrailer", false);
        setField(term59221, term59221.getClass(), "trailerFormat", "mhQDwIyrRi");
        setField(term59221, term59221.getClass(), "rowFormat", "HpZXWDPhlg");
        setField(term59221, term59221.getClass(), "sectionHeaderFormat", "lBOokzEPfe");
        setBooleanField(term59221, term59221.getClass(), "printSectionSummary", false);
        setField(term59221, term59221.getClass(), "sectionSummaryRowFormat", "dtGZCsKXbW");
        setBooleanField(term59221, term59221.getClass(), "printSectionTrailer", true);
        setField(term59221, term59221.getClass(), "sectionTrailerFormat", "bdyhHbDAmJ");
        setField(term59221, term59221.getClass(), "durationFormat", enum200);
        setBooleanField(term59221, term59221.getClass(), "printLegend", true);
        setField(term59221, term59221.getClass(), "simpleLine", "BBXiTNHqGE");
        setField(term59221, term59221.getClass(), "alternativeLine", "IEYhJmgCVd");
        setField(term59221, term59221.getClass(), "excludedTypes", term59347);
        setField(term59221, term59221.getClass(), "customCounterNames", term59363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qUtkFGMNUV";
        callMethod(klass, "withSectionHeader", argTypes, term59221, args);
    }

};


