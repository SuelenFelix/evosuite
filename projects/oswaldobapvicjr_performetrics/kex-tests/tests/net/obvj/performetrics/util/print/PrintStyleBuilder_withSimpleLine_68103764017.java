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

public class PrintStyleBuilder_withSimpleLine_68103764017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66717;

    public PrintStyleBuilder_withSimpleLine_68103764017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66886 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term66885 = ((Class) term66886).getDeclaredField((String) "SUMMARIZED");
        ((Field) term66885).setAccessible(true);
        Object enum224 = ((Field) term66885).get((Object) null);
        Class<? extends Object> term67208 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term67207 = ((Class) term67208).getDeclaredField((String) "SHORTER");
        ((Field) term67207).setAccessible(true);
        Object enum225 = ((Field) term67207).get((Object) null);
        Class<? extends Object> term67466 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67465 = ((Class) term67466).getDeclaredField((String) "USER_TIME");
        ((Field) term67465).setAccessible(true);
        Object enum226 =  ((Field) term67465).get((Object) null);
        Class<? extends Object> term67675 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67674 = ((Class) term67675).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term67674).setAccessible(true);
        Object enum227 =  ((Field) term67674).get((Object) null);
        Class<? extends Object> term67890 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term67889 = ((Class) term67890).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term67889).setAccessible(true);
        Object enum228 =  ((Field) term67889).get((Object) null);
        Class<? extends Object> term68117 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term68116 = ((Class) term68117).getDeclaredField((String) "CPU_TIME");
        ((Field) term68116).setAccessible(true);
        Object enum229 =  ((Field) term68116).get((Object) null);
        ArrayList term66844 = new ArrayList();
        ((ArrayList) term66844).add(enum226);
        ((ArrayList) term66844).add(enum227);
        ((ArrayList) term66844).add(enum228);
        ((ArrayList) term66844).add(enum229);
        ((ArrayList) term66844).add(enum229);
        HashMap term66864 = new HashMap();
        term66717 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term66717, term66717.getClass(), "printFormat", enum224);
        setBooleanField(term66717, term66717.getClass(), "printHeader", false);
        setField(term66717, term66717.getClass(), "headerFormat", "tIpkeYIezR");
        setBooleanField(term66717, term66717.getClass(), "printTrailer", false);
        setField(term66717, term66717.getClass(), "trailerFormat", "YkZtEtthvz");
        setField(term66717, term66717.getClass(), "rowFormat", "dwlZSxlXOo");
        setField(term66717, term66717.getClass(), "sectionHeaderFormat", "lKrEAkypza");
        setBooleanField(term66717, term66717.getClass(), "printSectionSummary", false);
        setField(term66717, term66717.getClass(), "sectionSummaryRowFormat", "KtuuNAqGCQ");
        setBooleanField(term66717, term66717.getClass(), "printSectionTrailer", false);
        setField(term66717, term66717.getClass(), "sectionTrailerFormat", "OGQsfjmReM");
        setField(term66717, term66717.getClass(), "durationFormat", enum225);
        setBooleanField(term66717, term66717.getClass(), "printLegend", false);
        setField(term66717, term66717.getClass(), "simpleLine", "YsUtbngnRO");
        setField(term66717, term66717.getClass(), "alternativeLine", "JisaWUxcNb");
        setField(term66717, term66717.getClass(), "excludedTypes", term66844);
        setField(term66717, term66717.getClass(), "customCounterNames", term66864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SqjyKmayBx";
        callMethod(klass, "withSimpleLine", argTypes, term66717, args);
    }

};


