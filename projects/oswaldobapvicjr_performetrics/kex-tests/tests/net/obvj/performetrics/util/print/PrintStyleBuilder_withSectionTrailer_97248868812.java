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

public class PrintStyleBuilder_withSectionTrailer_97248868812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73561;

    public PrintStyleBuilder_withSectionTrailer_97248868812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73722 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term73721 = ((Class) term73722).getDeclaredField((String) "DETAILED");
        ((Field) term73721).setAccessible(true);
        Object enum248 = ((Field) term73721).get((Object) null);
        Class<? extends Object> term74038 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term74037 = ((Class) term74038).getDeclaredField((String) "SHORT");
        ((Field) term74037).setAccessible(true);
        Object enum249 = ((Field) term74037).get((Object) null);
        Class<? extends Object> term74290 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term74289 = ((Class) term74290).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term74289).setAccessible(true);
        Object enum250 =  ((Field) term74289).get((Object) null);
        Class<? extends Object> term74505 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term74504 = ((Class) term74505).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term74504).setAccessible(true);
        Object enum251 =  ((Field) term74504).get((Object) null);
        Class<? extends Object> term74732 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term74731 = ((Class) term74732).getDeclaredField((String) "CPU_TIME");
        ((Field) term74731).setAccessible(true);
        Object enum252 =  ((Field) term74731).get((Object) null);
        ArrayList term73684 = new ArrayList();
        ((ArrayList) term73684).add(enum250);
        ((ArrayList) term73684).add(enum251);
        ((ArrayList) term73684).add(enum251);
        ((ArrayList) term73684).add(enum251);
        ((ArrayList) term73684).add(enum252);
        ((ArrayList) term73684).add(enum252);
        HashMap term73700 = new HashMap();
        term73561 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term73561, term73561.getClass(), "printFormat", enum248);
        setBooleanField(term73561, term73561.getClass(), "printHeader", false);
        setField(term73561, term73561.getClass(), "headerFormat", "WdCiTDUKqn");
        setBooleanField(term73561, term73561.getClass(), "printTrailer", true);
        setField(term73561, term73561.getClass(), "trailerFormat", "PSizQDoxxe");
        setField(term73561, term73561.getClass(), "rowFormat", "mKaHyMybrK");
        setField(term73561, term73561.getClass(), "sectionHeaderFormat", "AyrEXuGrEj");
        setBooleanField(term73561, term73561.getClass(), "printSectionSummary", true);
        setField(term73561, term73561.getClass(), "sectionSummaryRowFormat", "yevIIoVYHq");
        setBooleanField(term73561, term73561.getClass(), "printSectionTrailer", true);
        setField(term73561, term73561.getClass(), "sectionTrailerFormat", "UuYWMTqWTV");
        setField(term73561, term73561.getClass(), "durationFormat", enum249);
        setBooleanField(term73561, term73561.getClass(), "printLegend", false);
        setField(term73561, term73561.getClass(), "simpleLine", "DSFGlcaXUb");
        setField(term73561, term73561.getClass(), "alternativeLine", "sHMXNUzNeM");
        setField(term73561, term73561.getClass(), "excludedTypes", term73684);
        setField(term73561, term73561.getClass(), "customCounterNames", term73700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rwKoAngzCu";
        callMethod(klass, "withSectionTrailer", argTypes, term73561, args);
    }

};


