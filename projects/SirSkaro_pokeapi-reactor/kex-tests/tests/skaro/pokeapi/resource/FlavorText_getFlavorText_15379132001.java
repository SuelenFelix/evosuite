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

public class FlavorText_getFlavorText_15379132001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14927;

    public FlavorText_getFlavorText_15379132001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14927 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term14940 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14965 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term14927, term14927.getClass(), "flavorText", "grlbPsQxaR");
        setField(term14940, term14940.getClass(), "name", "PeFIZXlxPN");
        setField(term14940, term14940.getClass(), "url", "OIXYYXGdlX");
        setField(term14927, term14927.getClass(), "language", term14940);
        setField(term14965, term14965.getClass(), "name", "VBfWgJrVqV");
        setField(term14965, term14965.getClass(), "url", "BgFpfnZiJG");
        setField(term14927, term14927.getClass(), "version", term14965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.FlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorText", argTypes, term14927, args);
    }

};


