package skaro.pokeapi.resource.pokemonspecies;

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
import static skaro.pokeapi.resource.pokemonspecies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Genus_setGenus_12162171302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;

    public Genus_setGenus_12162171302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus"));
        Object term325 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term312, term312.getClass(), "genus", "aJlieCFVtF");
        setField(term325, term325.getClass(), "name", "ZiaGIbnzTs");
        setField(term325, term325.getClass(), "url", "tbcdzjIfER");
        setField(term312, term312.getClass(), "language", term325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setGenus", argTypes, term312, args);
    }

};


