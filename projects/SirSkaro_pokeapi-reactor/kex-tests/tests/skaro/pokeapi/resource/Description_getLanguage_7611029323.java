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

public class Description_getLanguage_7611029323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123951;

    public Description_getLanguage_7611029323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123951 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term123964 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term123951, term123951.getClass(), "description", "mevOTbfLnB");
        setField(term123964, term123964.getClass(), "name", "XHOdaKTtCU");
        setField(term123964, term123964.getClass(), "url", "mafsjmSKMe");
        setField(term123951, term123951.getClass(), "language", term123964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Description");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term123951, args);
    }

};


