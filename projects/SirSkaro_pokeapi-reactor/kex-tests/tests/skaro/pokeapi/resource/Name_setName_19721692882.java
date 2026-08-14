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

public class Name_setName_19721692882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4490;

    public Name_setName_19721692882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4490 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4503 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4490, term4490.getClass(), "name", "vYYOYhWMWZ");
        setField(term4503, term4503.getClass(), "name", "FLQJOzEXff");
        setField(term4503, term4503.getClass(), "url", "qlaIVJBSfQ");
        setField(term4490, term4490.getClass(), "language", term4503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Name");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lYvIWBFFsq";
        callMethod(klass, "setName", argTypes, term4490, args);
    }

};


