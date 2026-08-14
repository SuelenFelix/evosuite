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

public class LocationArea_setPokemonEncounters_29163289329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3056;

    public LocationArea_setPokemonEncounters_29163289329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3056 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        setField(term3056, term3056.getClass(), "Id", null);
        setField(term3056, term3056.getClass(), "name", null);
        setField(term3056, term3056.getClass(), "gameIndex", null);
        setField(term3056, term3056.getClass(), "encoutnerMethodRates", null);
        setField(term3056, term3056.getClass(), "location", null);
        setField(term3056, term3056.getClass(), "names", null);
        setField(term3056, term3056.getClass(), "pokemonEncounters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokemonEncounters", argTypes, term3056, args);
    }

};


