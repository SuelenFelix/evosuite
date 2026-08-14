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

public class LocationArea_setLocation_182388693015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2442;

    public LocationArea_setLocation_182388693015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2442 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        setField(term2442, term2442.getClass(), "Id", null);
        setField(term2442, term2442.getClass(), "name", null);
        setField(term2442, term2442.getClass(), "gameIndex", null);
        setField(term2442, term2442.getClass(), "encoutnerMethodRates", null);
        setField(term2442, term2442.getClass(), "location", null);
        setField(term2442, term2442.getClass(), "names", null);
        setField(term2442, term2442.getClass(), "pokemonEncounters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLocation", argTypes, term2442, args);
    }

};


