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

public class PrintStyleBuilder_build_123002688427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79762;

    public PrintStyleBuilder_build_123002688427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79920 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term79919 = ((Class) term79920).getDeclaredField((String) "SUMMARIZED");
        ((Field) term79919).setAccessible(true);
        Object enum269 = ((Field) term79919).get((Object) null);
        Class<? extends Object> term80242 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term80241 = ((Class) term80242).getDeclaredField((String) "ISO_8601");
        ((Field) term80241).setAccessible(true);
        Object enum270 = ((Field) term80241).get((Object) null);
        Class<? extends Object> term80503 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80502 = ((Class) term80503).getDeclaredField((String) "CPU_TIME");
        ((Field) term80502).setAccessible(true);
        Object enum271 =  ((Field) term80502).get((Object) null);
        Class<? extends Object> term80709 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80708 = ((Class) term80709).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term80708).setAccessible(true);
        Object enum272 =  ((Field) term80708).get((Object) null);
        Class<? extends Object> term80936 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term80935 = ((Class) term80936).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term80935).setAccessible(true);
        Object enum273 =  ((Field) term80935).get((Object) null);
        Class<? extends Object> term81151 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term81150 = ((Class) term81151).getDeclaredField((String) "USER_TIME");
        ((Field) term81150).setAccessible(true);
        Object enum274 =  ((Field) term81150).get((Object) null);
        ArrayList term79890 = new ArrayList();
        ((ArrayList) term79890).add(enum271);
        ((ArrayList) term79890).add(enum272);
        ((ArrayList) term79890).add(enum273);
        ((ArrayList) term79890).add(enum274);
        ((ArrayList) term79890).add(enum271);
        ((ArrayList) term79890).add(enum274);
        HashMap term79910 = new HashMap();
        term79762 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term79762, term79762.getClass(), "printFormat", enum269);
        setBooleanField(term79762, term79762.getClass(), "printHeader", false);
        setField(term79762, term79762.getClass(), "headerFormat", "bycpZjxXFn");
        setBooleanField(term79762, term79762.getClass(), "printTrailer", true);
        setField(term79762, term79762.getClass(), "trailerFormat", "jQWttOAiwL");
        setField(term79762, term79762.getClass(), "rowFormat", "DzKFxEuEEC");
        setField(term79762, term79762.getClass(), "sectionHeaderFormat", "CAMnvfDLJL");
        setBooleanField(term79762, term79762.getClass(), "printSectionSummary", true);
        setField(term79762, term79762.getClass(), "sectionSummaryRowFormat", "mfHtgSbdjD");
        setBooleanField(term79762, term79762.getClass(), "printSectionTrailer", true);
        setField(term79762, term79762.getClass(), "sectionTrailerFormat", "cmuaUiHMVL");
        setField(term79762, term79762.getClass(), "durationFormat", enum270);
        setBooleanField(term79762, term79762.getClass(), "printLegend", true);
        setField(term79762, term79762.getClass(), "simpleLine", "xjoSGPWUgu");
        setField(term79762, term79762.getClass(), "alternativeLine", "uzmqjnOUXu");
        setField(term79762, term79762.getClass(), "excludedTypes", term79890);
        setField(term79762, term79762.getClass(), "customCounterNames", term79910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term79762, args);
    }

};


