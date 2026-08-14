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

public class PrintStyleBuilder_withAlternativeLine_153547444116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78432;

    public PrintStyleBuilder_withAlternativeLine_153547444116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78739 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term78738 = ((Class) term78739).getDeclaredField((String) "SUMMARIZED");
        ((Field) term78738).setAccessible(true);
        Object enum265 = ((Field) term78738).get((Object) null);
        Class<? extends Object> term79061 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term79060 = ((Class) term79061).getDeclaredField((String) "LINUX");
        ((Field) term79060).setAccessible(true);
        Object enum266 = ((Field) term79060).get((Object) null);
        ArrayList term78711 = new ArrayList();
        HashMap term78715 = new HashMap();
        term78432 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term78432, term78432.getClass(), "printFormat", enum265);
        setBooleanField(term78432, term78432.getClass(), "printHeader", false);
        setField(term78432, term78432.getClass(), "headerFormat", "goAoCMhKBu");
        setBooleanField(term78432, term78432.getClass(), "printTrailer", false);
        setField(term78432, term78432.getClass(), "trailerFormat", "BWxJSgKHRT");
        setField(term78432, term78432.getClass(), "rowFormat", "AGXoIndFnm");
        setField(term78432, term78432.getClass(), "sectionHeaderFormat", "mwmFMNEzkK");
        setBooleanField(term78432, term78432.getClass(), "printSectionSummary", false);
        setField(term78432, term78432.getClass(), "sectionSummaryRowFormat", "kVAmKknVln");
        setBooleanField(term78432, term78432.getClass(), "printSectionTrailer", false);
        setField(term78432, term78432.getClass(), "sectionTrailerFormat", "MRFLbEGYKG");
        setField(term78432, term78432.getClass(), "durationFormat", enum266);
        setBooleanField(term78432, term78432.getClass(), "printLegend", false);
        setField(term78432, term78432.getClass(), "simpleLine", "BYrGukTyof");
        setField(term78432, term78432.getClass(), "alternativeLine", "jiCGTTzKGB");
        setField(term78432, term78432.getClass(), "excludedTypes", term78711);
        setField(term78432, term78432.getClass(), "customCounterNames", term78715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YgQvdcBQKw";
        callMethod(klass, "withAlternativeLine", argTypes, term78432, args);
    }

};


