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

public class LocationArea_getNames_180218183417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2587;

    public LocationArea_getNames_180218183417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2587 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        setField(term2587, term2587.getClass(), "Id", null);
        setField(term2587, term2587.getClass(), "name", null);
        setField(term2587, term2587.getClass(), "gameIndex", null);
        setField(term2587, term2587.getClass(), "encoutnerMethodRates", null);
        setField(term2587, term2587.getClass(), "location", null);
        setField(term2587, term2587.getClass(), "names", null);
        setField(term2587, term2587.getClass(), "pokemonEncounters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term2587, args);
    }

};


