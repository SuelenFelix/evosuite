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

public class PrintStyleBuilder_getAlternativeLine_207561648742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101426;

    public PrintStyleBuilder_getAlternativeLine_207561648742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101731 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term101730 = ((Class) term101731).getDeclaredField((String) "SUMMARIZED");
        ((Field) term101730).setAccessible(true);
        Object enum348 = ((Field) term101730).get((Object) null);
        Class<? extends Object> term102053 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term102052 = ((Class) term102053).getDeclaredField((String) "LINUX");
        ((Field) term102052).setAccessible(true);
        Object enum349 = ((Field) term102052).get((Object) null);
        Class<? extends Object> term102305 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term102304 = ((Class) term102305).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term102304).setAccessible(true);
        Object enum350 =  ((Field) term102304).get((Object) null);
        Class<? extends Object> term102532 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term102531 = ((Class) term102532).getDeclaredField((String) "CPU_TIME");
        ((Field) term102531).setAccessible(true);
        Object enum351 =  ((Field) term102531).get((Object) null);
        Class<? extends Object> term102738 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term102737 = ((Class) term102738).getDeclaredField((String) "USER_TIME");
        ((Field) term102737).setAccessible(true);
        Object enum352 =  ((Field) term102737).get((Object) null);
        ArrayList term101705 = new ArrayList();
        ((ArrayList) term101705).add(enum350);
        ((ArrayList) term101705).add(enum351);
        ((ArrayList) term101705).add(enum352);
        ((ArrayList) term101705).add(enum350);
        ((ArrayList) term101705).add(enum351);
        HashMap term101721 = new HashMap();
        term101426 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term101426, term101426.getClass(), "printFormat", enum348);
        setBooleanField(term101426, term101426.getClass(), "printHeader", false);
        setField(term101426, term101426.getClass(), "headerFormat", "IiNCZfdouL");
        setBooleanField(term101426, term101426.getClass(), "printTrailer", false);
        setField(term101426, term101426.getClass(), "trailerFormat", "AhOHzCsHKW");
        setField(term101426, term101426.getClass(), "rowFormat", "UqgLPaaAHi");
        setField(term101426, term101426.getClass(), "sectionHeaderFormat", "xypryEkUPF");
        setBooleanField(term101426, term101426.getClass(), "printSectionSummary", true);
        setField(term101426, term101426.getClass(), "sectionSummaryRowFormat", "zyZTzHNjQr");
        setBooleanField(term101426, term101426.getClass(), "printSectionTrailer", true);
        setField(term101426, term101426.getClass(), "sectionTrailerFormat", "YSrFKQQwXE");
        setField(term101426, term101426.getClass(), "durationFormat", enum349);
        setBooleanField(term101426, term101426.getClass(), "printLegend", true);
        setField(term101426, term101426.getClass(), "simpleLine", "qxhOsmyyjm");
        setField(term101426, term101426.getClass(), "alternativeLine", "DuKcNfVVYR");
        setField(term101426, term101426.getClass(), "excludedTypes", term101705);
        setField(term101426, term101426.getClass(), "customCounterNames", term101721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlternativeLine", argTypes, term101426, args);
    }

};


