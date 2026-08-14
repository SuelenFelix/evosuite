package skaro.pokeapi.resource.pokemonshape;

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
import static skaro.pokeapi.resource.pokemonshape.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AwesomeName_getAwesomeName_8875012111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;

    public AwesomeName_getAwesomeName_8875012111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term648 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term635, term635.getClass(), "awesomeName", "xvkbvaEGYd");
        setField(term648, term648.getClass(), "name", "HBGNxdNURv");
        setField(term648, term648.getClass(), "url", "mfCpTPPQQm");
        setField(term635, term635.getClass(), "language", term648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwesomeName", argTypes, term635, args);
    }

};


