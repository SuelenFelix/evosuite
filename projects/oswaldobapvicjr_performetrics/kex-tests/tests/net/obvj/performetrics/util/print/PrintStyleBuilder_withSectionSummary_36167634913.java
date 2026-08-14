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

public class PrintStyleBuilder_withSectionSummary_36167634913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61708;

    public PrintStyleBuilder_withSectionSummary_36167634913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61869 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term61868 = ((Class) term61869).getDeclaredField((String) "SUMMARIZED");
        ((Field) term61868).setAccessible(true);
        Object enum207 = ((Field) term61868).get((Object) null);
        Class<? extends Object> term62191 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term62190 = ((Class) term62191).getDeclaredField((String) "SHORT");
        ((Field) term62190).setAccessible(true);
        Object enum208 = ((Field) term62190).get((Object) null);
        Class<? extends Object> term62443 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term62442 = ((Class) term62443).getDeclaredField((String) "CPU_TIME");
        ((Field) term62442).setAccessible(true);
        Object enum209 =  ((Field) term62442).get((Object) null);
        Class<? extends Object> term62649 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term62648 = ((Class) term62649).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term62648).setAccessible(true);
        Object enum210 =  ((Field) term62648).get((Object) null);
        ArrayList term61833 = new ArrayList();
        ((ArrayList) term61833).add(enum209);
        ((ArrayList) term61833).add(enum209);
        ((ArrayList) term61833).add(enum210);
        ((ArrayList) term61833).add(enum210);
        ((ArrayList) term61833).add(enum209);
        ((ArrayList) term61833).add(enum209);
        HashMap term61845 = new HashMap();
        term61708 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term61708, term61708.getClass(), "printFormat", enum207);
        setBooleanField(term61708, term61708.getClass(), "printHeader", false);
        setField(term61708, term61708.getClass(), "headerFormat", "TjWpyghUWN");
        setBooleanField(term61708, term61708.getClass(), "printTrailer", true);
        setField(term61708, term61708.getClass(), "trailerFormat", "dkZFDZxcde");
        setField(term61708, term61708.getClass(), "rowFormat", "WXcZEtUKlI");
        setField(term61708, term61708.getClass(), "sectionHeaderFormat", "IkpjUOuWQU");
        setBooleanField(term61708, term61708.getClass(), "printSectionSummary", true);
        setField(term61708, term61708.getClass(), "sectionSummaryRowFormat", "boSSpezHeU");
        setBooleanField(term61708, term61708.getClass(), "printSectionTrailer", true);
        setField(term61708, term61708.getClass(), "sectionTrailerFormat", "OUeBWNTQDh");
        setField(term61708, term61708.getClass(), "durationFormat", enum208);
        setBooleanField(term61708, term61708.getClass(), "printLegend", false);
        setField(term61708, term61708.getClass(), "simpleLine", "gltJarNuUk");
        setField(term61708, term61708.getClass(), "alternativeLine", "ZwZIDwYcSW");
        setField(term61708, term61708.getClass(), "excludedTypes", term61833);
        setField(term61708, term61708.getClass(), "customCounterNames", term61845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oKwCDqywym";
        callMethod(klass, "withSectionSummary", argTypes, term61708, args);
    }

};


