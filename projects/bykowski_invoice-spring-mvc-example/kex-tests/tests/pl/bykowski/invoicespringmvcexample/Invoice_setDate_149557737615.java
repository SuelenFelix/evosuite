package pl.bykowski.invoicespringmvcexample;

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
import static pl.bykowski.invoicespringmvcexample.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Invoice_setDate_149557737615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811;

    public Invoice_setDate_149557737615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        setField(term811, term811.getClass(), "id", null);
        setField(term811, term811.getClass(), "price", null);
        setField(term811, term811.getClass(), "date", null);
        setField(term811, term811.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDate", argTypes, term811, args);
    }

};


