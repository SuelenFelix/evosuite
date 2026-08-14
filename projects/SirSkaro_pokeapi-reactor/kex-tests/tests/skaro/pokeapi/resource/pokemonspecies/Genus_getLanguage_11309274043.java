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

public class Genus_getLanguage_11309274043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public Genus_getLanguage_11309274043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus"));
        Object term415 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term402, term402.getClass(), "genus", "pCTimMblYc");
        setField(term415, term415.getClass(), "name", "hNxWaHcfhY");
        setField(term415, term415.getClass(), "url", "RkybSrpybU");
        setField(term402, term402.getClass(), "language", term415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term402, args);
    }

};


