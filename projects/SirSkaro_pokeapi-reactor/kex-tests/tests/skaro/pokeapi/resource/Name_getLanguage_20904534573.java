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

public class Name_getLanguage_20904534573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4580;

    public Name_getLanguage_20904534573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4580 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4593 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4580, term4580.getClass(), "name", "tThwsqWKcE");
        setField(term4593, term4593.getClass(), "name", "bkSgsDrkCN");
        setField(term4593, term4593.getClass(), "url", "hwjlcimgJH");
        setField(term4580, term4580.getClass(), "language", term4593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Name");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term4580, args);
    }

};


