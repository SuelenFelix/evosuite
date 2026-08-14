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

public class Description_getDescription_20255502001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123793;

    public Description_getDescription_20255502001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123793 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term123806 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term123793, term123793.getClass(), "description", "VeehtfkdmI");
        setField(term123806, term123806.getClass(), "name", "YlRFhXohow");
        setField(term123806, term123806.getClass(), "url", "IUVyGLVtYu");
        setField(term123793, term123793.getClass(), "language", term123806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Description");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term123793, args);
    }

};


