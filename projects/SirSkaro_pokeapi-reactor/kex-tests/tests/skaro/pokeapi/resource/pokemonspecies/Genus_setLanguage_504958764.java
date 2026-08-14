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

public class Genus_setLanguage_504958764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;
     Object term508;

    public Genus_setLanguage_504958764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus"));
        Object term483 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term470, term470.getClass(), "genus", "xOEqzGAmDU");
        setField(term483, term483.getClass(), "name", "eZFUvlxvGV");
        setField(term483, term483.getClass(), "url", "BYqFIqCKAV");
        setField(term470, term470.getClass(), "language", term483);
        term508 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term508, term508.getClass(), "name", "OclPbYPkcH");
        setField(term508, term508.getClass(), "url", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term508;
        callMethod(klass, "setLanguage", argTypes, term470, args);
    }

};


