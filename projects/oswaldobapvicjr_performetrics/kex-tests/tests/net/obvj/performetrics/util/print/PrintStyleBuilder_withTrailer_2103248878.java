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

public class PrintStyleBuilder_withTrailer_2103248878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56454;

    public PrintStyleBuilder_withTrailer_2103248878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56617 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term56616 = ((Class) term56617).getDeclaredField((String) "SUMMARIZED");
        ((Field) term56616).setAccessible(true);
        Object enum189 = ((Field) term56616).get((Object) null);
        Class<? extends Object> term56939 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term56938 = ((Class) term56939).getDeclaredField((String) "SHORT");
        ((Field) term56938).setAccessible(true);
        Object enum190 = ((Field) term56938).get((Object) null);
        Class<? extends Object> term57191 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term57190 = ((Class) term57191).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term57190).setAccessible(true);
        Object enum191 =  ((Field) term57190).get((Object) null);
        Class<? extends Object> term57418 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term57417 = ((Class) term57418).getDeclaredField((String) "CPU_TIME");
        ((Field) term57417).setAccessible(true);
        Object enum192 =  ((Field) term57417).get((Object) null);
        Class<? extends Object> term57624 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term57623 = ((Class) term57624).getDeclaredField((String) "USER_TIME");
        ((Field) term57623).setAccessible(true);
        Object enum193 =  ((Field) term57623).get((Object) null);
        ArrayList term56579 = new ArrayList();
        ((ArrayList) term56579).add(enum191);
        ((ArrayList) term56579).add(enum192);
        ((ArrayList) term56579).add(enum193);
        ((ArrayList) term56579).add(enum192);
        HashMap term56595 = new HashMap();
        term56454 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term56454, term56454.getClass(), "printFormat", enum189);
        setBooleanField(term56454, term56454.getClass(), "printHeader", true);
        setField(term56454, term56454.getClass(), "headerFormat", "UPUbwyHQKN");
        setBooleanField(term56454, term56454.getClass(), "printTrailer", true);
        setField(term56454, term56454.getClass(), "trailerFormat", "lgQkrXANyI");
        setField(term56454, term56454.getClass(), "rowFormat", "MeTmRZXErV");
        setField(term56454, term56454.getClass(), "sectionHeaderFormat", "jNxbVmoZgq");
        setBooleanField(term56454, term56454.getClass(), "printSectionSummary", false);
        setField(term56454, term56454.getClass(), "sectionSummaryRowFormat", "PvmBHIXaMY");
        setBooleanField(term56454, term56454.getClass(), "printSectionTrailer", false);
        setField(term56454, term56454.getClass(), "sectionTrailerFormat", "hulYxtowxw");
        setField(term56454, term56454.getClass(), "durationFormat", enum190);
        setBooleanField(term56454, term56454.getClass(), "printLegend", true);
        setField(term56454, term56454.getClass(), "simpleLine", "GNEmuHPNcU");
        setField(term56454, term56454.getClass(), "alternativeLine", "IoSfuKDFRe");
        setField(term56454, term56454.getClass(), "excludedTypes", term56579);
        setField(term56454, term56454.getClass(), "customCounterNames", term56595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ITRRYiuDwH";
        callMethod(klass, "withTrailer", argTypes, term56454, args);
    }

};


