package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonEncounter_getPokemon_4527665787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86184;

    public PokemonEncounter_getPokemon_4527665787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86184 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term86184, term86184.getClass(), "pokemon", null);
        setField(term86184, term86184.getClass(), "versionDetails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term86184, args);
    }

};


