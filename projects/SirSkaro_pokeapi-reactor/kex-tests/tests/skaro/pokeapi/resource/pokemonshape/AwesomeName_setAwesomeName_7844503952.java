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

public class AwesomeName_setAwesomeName_7844503952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703;

    public AwesomeName_setAwesomeName_7844503952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term716 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term703, term703.getClass(), "awesomeName", "OcJCIDNIXA");
        setField(term716, term716.getClass(), "name", "XfRABIFVEp");
        setField(term716, term716.getClass(), "url", "MHGKyEnwKc");
        setField(term703, term703.getClass(), "language", term716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setAwesomeName", argTypes, term703, args);
    }

};


