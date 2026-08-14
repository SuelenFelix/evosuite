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

public class PrintStyleBuilder_withoutTypes_59533452620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83669;
     Object term83818;

    public PrintStyleBuilder_withoutTypes_59533452620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83820 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term83819 = ((Class) term83820).getDeclaredField((String) "DETAILED");
        ((Field) term83819).setAccessible(true);
        Object enum282 = ((Field) term83819).get((Object) null);
        Class<? extends Object> term84136 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term84135 = ((Class) term84136).getDeclaredField((String) "ISO_8601");
        ((Field) term84135).setAccessible(true);
        Object enum283 = ((Field) term84135).get((Object) null);
        Class<? extends Object> term84397 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84396 = ((Class) term84397).getDeclaredField((String) "CPU_TIME");
        ((Field) term84396).setAccessible(true);
        Object enum284 =  ((Field) term84396).get((Object) null);
        Class<? extends Object> term84603 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84602 = ((Class) term84603).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term84602).setAccessible(true);
        Object enum285 =  ((Field) term84602).get((Object) null);
        ArrayList term83795 = new ArrayList();
        ((ArrayList) term83795).add(enum284);
        ((ArrayList) term83795).add(enum285);
        ((ArrayList) term83795).add(enum285);
        ((ArrayList) term83795).add(enum285);
        ((ArrayList) term83795).add(enum285);
        ((ArrayList) term83795).add(enum285);
        HashMap term83807 = new HashMap();
        term83669 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term83669, term83669.getClass(), "printFormat", enum282);
        setBooleanField(term83669, term83669.getClass(), "printHeader", false);
        setField(term83669, term83669.getClass(), "headerFormat", "bycpZjxXFn");
        setBooleanField(term83669, term83669.getClass(), "printTrailer", true);
        setField(term83669, term83669.getClass(), "trailerFormat", "jQWttOAiwL");
        setField(term83669, term83669.getClass(), "rowFormat", "DzKFxEuEEC");
        setField(term83669, term83669.getClass(), "sectionHeaderFormat", "CAMnvfDLJL");
        setBooleanField(term83669, term83669.getClass(), "printSectionSummary", true);
        setField(term83669, term83669.getClass(), "sectionSummaryRowFormat", "mfHtgSbdjD");
        setBooleanField(term83669, term83669.getClass(), "printSectionTrailer", false);
        setField(term83669, term83669.getClass(), "sectionTrailerFormat", "cmuaUiHMVL");
        setField(term83669, term83669.getClass(), "durationFormat", enum283);
        setBooleanField(term83669, term83669.getClass(), "printLegend", false);
        setField(term83669, term83669.getClass(), "simpleLine", "xjoSGPWUgu");
        setField(term83669, term83669.getClass(), "alternativeLine", "uzmqjnOUXu");
        setField(term83669, term83669.getClass(), "excludedTypes", term83795);
        setField(term83669, term83669.getClass(), "customCounterNames", term83807);
        term83818 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 1);
        setElement(term83818, 0, enum285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83818;
        callMethod(klass, "withoutTypes", argTypes, term83669, args);
    }

};


