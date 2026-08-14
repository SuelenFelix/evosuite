package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Description_setDescription_21286010162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123861;

    public Description_setDescription_21286010162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123861 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term123874 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term123861, term123861.getClass(), "description", "chYBjNzAQl");
        setField(term123874, term123874.getClass(), "name", "AElRurGdMB");
        setField(term123874, term123874.getClass(), "url", "CVNhSKlfyU");
        setField(term123861, term123861.getClass(), "language", term123874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Description");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rgEMHBXZze";
        callMethod(klass, "setDescription", argTypes, term123861, args);
    }

};


