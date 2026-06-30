package pdev.com.agenda.client.response;

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
import static pdev.com.agenda.client.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BeerResponse_equals_42367256926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777;

    public BeerResponse_equals_42367256926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term777, term777.getClass(), "id", null);
        setField(term777, term777.getClass(), "name", null);
        setField(term777, term777.getClass(), "description", null);
        setField(term777, term777.getClass(), "abv", null);
        setField(term777, term777.getClass(), "ibu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term777, args);
    }

};


