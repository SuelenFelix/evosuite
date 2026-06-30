package pdev.com.agenda;

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
import static pdev.com.agenda.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AgendaApplication_main_3067950881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9799;

    public AgendaApplication_main_3067950881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9799 = (Object[]) newArray("java.lang.String", 4);
        setElement(term9799, 0, "YaDWphDOSz");
        setElement(term9799, 1, "nnnmCgFBLw");
        setElement(term9799, 2, "hSSCyNEhyH");
        setElement(term9799, 3, "jDFNSuvZqm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.AgendaApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9799;
        callMethod(klass, "main", argTypes, null, args);
    }

};


