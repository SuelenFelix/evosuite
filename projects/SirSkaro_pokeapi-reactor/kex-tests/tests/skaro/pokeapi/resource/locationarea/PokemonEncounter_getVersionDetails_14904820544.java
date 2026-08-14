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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class PokemonEncounter_getVersionDetails_14904820544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public PokemonEncounter_getVersionDetails_14904820544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term571 = new Integer(1328271830);
        ArrayList term573 = new ArrayList();
        ((ArrayList) term573).add((Object)null);
        ((ArrayList) term573).add((Object)null);
        ((ArrayList) term573).add((Object)null);
        Object term569 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term570, term570.getClass(), "name", null);
        setField(term570, term570.getClass(), "url", null);
        setField(term569, term569.getClass(), "version", term570);
        setField(term569, term569.getClass(), "maxChance", term571);
        setField(term569, term569.getClass(), "encounterDetails", term573);
        Integer term578 = new Integer(933028652);
        ArrayList term580 = new ArrayList();
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        ((ArrayList) term580).add((Object)null);
        Object term576 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term577, term577.getClass(), "name", null);
        setField(term577, term577.getClass(), "url", null);
        setField(term576, term576.getClass(), "version", term577);
        setField(term576, term576.getClass(), "maxChance", term578);
        setField(term576, term576.getClass(), "encounterDetails", term580);
        ArrayList term567 = new ArrayList();
        ((ArrayList) term567).add(term569);
        ((ArrayList) term567).add(term576);
        term541 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term542 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term542, term542.getClass(), "name", "OWKQODBLzb");
        setField(term542, term542.getClass(), "url", "wGmYcqUkgE");
        setField(term541, term541.getClass(), "pokemon", term542);
        setField(term541, term541.getClass(), "versionDetails", term567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionDetails", argTypes, term541, args);
    }

};


