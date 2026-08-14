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

public class NamedApiResource_getUrl_11603707883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81082;

    public NamedApiResource_getUrl_11603707883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81082 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term81082, term81082.getClass(), "name", "aaAOXoTImC");
        setField(term81082, term81082.getClass(), "url", "utpjeiiGQI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term81082, args);
    }

};


