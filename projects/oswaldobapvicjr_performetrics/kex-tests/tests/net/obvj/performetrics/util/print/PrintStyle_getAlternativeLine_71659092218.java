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

public class PrintStyle_getAlternativeLine_71659092218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91664;

    public PrintStyle_getAlternativeLine_71659092218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91961 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term91960 = ((Class) term91961).getDeclaredField((String) "DETAILED");
        ((Field) term91960).setAccessible(true);
        Object enum309 = ((Field) term91960).get((Object) null);
        Class<? extends Object> term92277 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term92276 = ((Class) term92277).getDeclaredField((String) "LINUX");
        ((Field) term92276).setAccessible(true);
        Object enum310 = ((Field) term92276).get((Object) null);
        Class<? extends Object> term92529 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term92528 = ((Class) term92529).getDeclaredField((String) "USER_TIME");
        ((Field) term92528).setAccessible(true);
        Object enum311 =  ((Field) term92528).get((Object) null);
        ArrayList term91941 = new ArrayList();
        ((ArrayList) term91941).add(enum311);
        ((ArrayList) term91941).add(enum311);
        HashMap term91949 = new HashMap();
        term91664 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term91664, term91664.getClass(), "printFormat", enum309);
        setBooleanField(term91664, term91664.getClass(), "printHeader", false);
        setField(term91664, term91664.getClass(), "headerFormat", "qFGKIJjlmV");
        setBooleanField(term91664, term91664.getClass(), "printTrailer", false);
        setField(term91664, term91664.getClass(), "trailerFormat", "IHqvyhMtuM");
        setField(term91664, term91664.getClass(), "rowFormat", "dAldIGYAXV");
        setField(term91664, term91664.getClass(), "sectionHeaderFormat", "mLwibAPEsa");
        setBooleanField(term91664, term91664.getClass(), "printSectionSummary", false);
        setField(term91664, term91664.getClass(), "sectionSummaryRowFormat", "zsWKWiTFuo");
        setBooleanField(term91664, term91664.getClass(), "printSectionTrailer", false);
        setField(term91664, term91664.getClass(), "sectionTrailerFormat", "UPUbwyHQKN");
        setField(term91664, term91664.getClass(), "durationFormat", enum310);
        setBooleanField(term91664, term91664.getClass(), "printLegend", false);
        setField(term91664, term91664.getClass(), "simpleLine", "lgQkrXANyI");
        setField(term91664, term91664.getClass(), "alternativeLine", "MeTmRZXErV");
        setField(term91664, term91664.getClass(), "excludedTypes", term91941);
        setField(term91664, term91664.getClass(), "customCounterNames", term91949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlternativeLine", argTypes, term91664, args);
    }

};


