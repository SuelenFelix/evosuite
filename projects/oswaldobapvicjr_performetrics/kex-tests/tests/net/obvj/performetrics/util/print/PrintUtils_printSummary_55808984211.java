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

public class PrintUtils_printSummary_55808984211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19281;

    public PrintUtils_printSummary_55808984211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19281 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("java.io.PrintStream");
        argTypes[2] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "printSummary", argTypes, term19281, args);
    }

};


