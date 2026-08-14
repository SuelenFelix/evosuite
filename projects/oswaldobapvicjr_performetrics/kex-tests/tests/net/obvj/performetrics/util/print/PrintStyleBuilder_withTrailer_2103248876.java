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

public class PrintStyleBuilder_withTrailer_2103248876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66418;

    public PrintStyleBuilder_withTrailer_2103248876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66735 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term66734 = ((Class) term66735).getDeclaredField((String) "SUMMARIZED");
        ((Field) term66734).setAccessible(true);
        Object enum224 = ((Field) term66734).get((Object) null);
        Class<? extends Object> term67057 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term67056 = ((Class) term67057).getDeclaredField((String) "LINUX");
        ((Field) term67056).setAccessible(true);
        Object enum225 = ((Field) term67056).get((Object) null);
        Class<? extends Object> term67309 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67308 = ((Class) term67309).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term67308).setAccessible(true);
        Object enum226 =  ((Field) term67308).get((Object) null);
        Class<? extends Object> term67536 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67535 = ((Class) term67536).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term67535).setAccessible(true);
        Object enum227 =  ((Field) term67535).get((Object) null);
        Class<? extends Object> term67751 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67750 = ((Class) term67751).getDeclaredField((String) "USER_TIME");
        ((Field) term67750).setAccessible(true);
        Object enum228 =  ((Field) term67750).get((Object) null);
        ArrayList term66697 = new ArrayList();
        ((ArrayList) term66697).add(enum226);
        ((ArrayList) term66697).add(enum226);
        ((ArrayList) term66697).add(enum227);
        ((ArrayList) term66697).add(enum227);
        ((ArrayList) term66697).add(enum228);
        HashMap term66713 = new HashMap();
        term66418 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term66418, term66418.getClass(), "printFormat", enum224);
        setBooleanField(term66418, term66418.getClass(), "printHeader", true);
        setField(term66418, term66418.getClass(), "headerFormat", "OzXRsFGTIp");
        setBooleanField(term66418, term66418.getClass(), "printTrailer", true);
        setField(term66418, term66418.getClass(), "trailerFormat", "TjWpyghUWN");
        setField(term66418, term66418.getClass(), "rowFormat", "dkZFDZxcde");
        setField(term66418, term66418.getClass(), "sectionHeaderFormat", "WXcZEtUKlI");
        setBooleanField(term66418, term66418.getClass(), "printSectionSummary", true);
        setField(term66418, term66418.getClass(), "sectionSummaryRowFormat", "IkpjUOuWQU");
        setBooleanField(term66418, term66418.getClass(), "printSectionTrailer", false);
        setField(term66418, term66418.getClass(), "sectionTrailerFormat", "boSSpezHeU");
        setField(term66418, term66418.getClass(), "durationFormat", enum225);
        setBooleanField(term66418, term66418.getClass(), "printLegend", false);
        setField(term66418, term66418.getClass(), "simpleLine", "OUeBWNTQDh");
        setField(term66418, term66418.getClass(), "alternativeLine", "gltJarNuUk");
        setField(term66418, term66418.getClass(), "excludedTypes", term66697);
        setField(term66418, term66418.getClass(), "customCounterNames", term66713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sOdkipUKRu";
        callMethod(klass, "withTrailer", argTypes, term66418, args);
    }

};


