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

public class PrintStyle_getTrailerFormat_159677508512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83962;

    public PrintStyle_getTrailerFormat_159677508512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84110 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term84109 = ((Class) term84110).getDeclaredField((String) "SUMMARIZED");
        ((Field) term84109).setAccessible(true);
        Object enum282 = ((Field) term84109).get((Object) null);
        Class<? extends Object> term84432 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term84431 = ((Class) term84432).getDeclaredField((String) "FULL");
        ((Field) term84431).setAccessible(true);
        Object enum283 = ((Field) term84431).get((Object) null);
        Class<? extends Object> term84681 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84680 = ((Class) term84681).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term84680).setAccessible(true);
        Object enum284 =  ((Field) term84680).get((Object) null);
        Class<? extends Object> term84908 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84907 = ((Class) term84908).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term84907).setAccessible(true);
        Object enum285 =  ((Field) term84907).get((Object) null);
        ArrayList term84086 = new ArrayList();
        ((ArrayList) term84086).add(enum284);
        ((ArrayList) term84086).add(enum285);
        HashMap term84098 = new HashMap();
        term83962 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term83962, term83962.getClass(), "printFormat", enum282);
        setBooleanField(term83962, term83962.getClass(), "printHeader", false);
        setField(term83962, term83962.getClass(), "headerFormat", "TXZAIPQJHt");
        setBooleanField(term83962, term83962.getClass(), "printTrailer", false);
        setField(term83962, term83962.getClass(), "trailerFormat", "DIbeDHICho");
        setField(term83962, term83962.getClass(), "rowFormat", "dJGPlmSRnz");
        setField(term83962, term83962.getClass(), "sectionHeaderFormat", "DPskuFUobI");
        setBooleanField(term83962, term83962.getClass(), "printSectionSummary", false);
        setField(term83962, term83962.getClass(), "sectionSummaryRowFormat", "wBGfLpNNiZ");
        setBooleanField(term83962, term83962.getClass(), "printSectionTrailer", true);
        setField(term83962, term83962.getClass(), "sectionTrailerFormat", "yUGCjlqgJE");
        setField(term83962, term83962.getClass(), "durationFormat", enum283);
        setBooleanField(term83962, term83962.getClass(), "printLegend", false);
        setField(term83962, term83962.getClass(), "simpleLine", "PXdVZyoJyC");
        setField(term83962, term83962.getClass(), "alternativeLine", "vLerpqavFM");
        setField(term83962, term83962.getClass(), "excludedTypes", term84086);
        setField(term83962, term83962.getClass(), "customCounterNames", term84098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term83962, args);
    }

};


