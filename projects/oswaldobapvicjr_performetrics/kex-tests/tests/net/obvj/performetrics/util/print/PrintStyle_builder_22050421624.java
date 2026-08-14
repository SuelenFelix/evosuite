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

public class PrintStyle_builder_22050421624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97738;

    public PrintStyle_builder_22050421624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97738 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term97738, term97738.getClass(), "printFormat", null);
        setBooleanField(term97738, term97738.getClass(), "printHeader", false);
        setField(term97738, term97738.getClass(), "headerFormat", null);
        setBooleanField(term97738, term97738.getClass(), "printTrailer", false);
        setField(term97738, term97738.getClass(), "trailerFormat", null);
        setField(term97738, term97738.getClass(), "rowFormat", null);
        setField(term97738, term97738.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term97738, term97738.getClass(), "printSectionSummary", false);
        setField(term97738, term97738.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term97738, term97738.getClass(), "printSectionTrailer", false);
        setField(term97738, term97738.getClass(), "sectionTrailerFormat", null);
        setField(term97738, term97738.getClass(), "durationFormat", null);
        setBooleanField(term97738, term97738.getClass(), "printLegend", false);
        setField(term97738, term97738.getClass(), "simpleLine", null);
        setField(term97738, term97738.getClass(), "alternativeLine", null);
        setField(term97738, term97738.getClass(), "excludedTypes", null);
        setField(term97738, term97738.getClass(), "customCounterNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "builder", argTypes, term97738, args);
    }

};


