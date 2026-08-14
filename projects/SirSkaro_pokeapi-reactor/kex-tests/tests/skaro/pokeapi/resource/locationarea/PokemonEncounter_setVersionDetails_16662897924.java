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
import java.util.LinkedList;

public class PokemonEncounter_setVersionDetails_16662897924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84864;
     Object term84940;

    public PokemonEncounter_setVersionDetails_16662897924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term84894 = new Integer(966678407);
        ArrayList term84896 = new ArrayList();
        ((ArrayList) term84896).add((Object)null);
        ((ArrayList) term84896).add((Object)null);
        ((ArrayList) term84896).add((Object)null);
        ((ArrayList) term84896).add((Object)null);
        ((ArrayList) term84896).add((Object)null);
        Object term84892 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84893 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84893, term84893.getClass(), "name", null);
        setField(term84893, term84893.getClass(), "url", null);
        setField(term84892, term84892.getClass(), "version", term84893);
        setField(term84892, term84892.getClass(), "maxChance", term84894);
        setField(term84892, term84892.getClass(), "encounterDetails", term84896);
        Integer term84901 = new Integer(1523196898);
        ArrayList term84903 = new ArrayList();
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        Object term84899 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84900 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84900, term84900.getClass(), "name", null);
        setField(term84900, term84900.getClass(), "url", null);
        setField(term84899, term84899.getClass(), "version", term84900);
        setField(term84899, term84899.getClass(), "maxChance", term84901);
        setField(term84899, term84899.getClass(), "encounterDetails", term84903);
        Integer term84907 = new Integer(835037846);
        ArrayList term84909 = new ArrayList();
        ((ArrayList) term84909).add((Object)null);
        ((ArrayList) term84909).add((Object)null);
        ((ArrayList) term84909).add((Object)null);
        Object term84906 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        setField(term84906, term84906.getClass(), "version", term84893);
        setField(term84906, term84906.getClass(), "maxChance", term84907);
        setField(term84906, term84906.getClass(), "encounterDetails", term84909);
        Integer term84914 = new Integer(1151852495);
        ArrayList term84916 = new ArrayList();
        ((ArrayList) term84916).add((Object)null);
        ((ArrayList) term84916).add((Object)null);
        ((ArrayList) term84916).add((Object)null);
        ((ArrayList) term84916).add((Object)null);
        ((ArrayList) term84916).add((Object)null);
        Object term84912 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84913 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84913, term84913.getClass(), "name", null);
        setField(term84913, term84913.getClass(), "url", null);
        setField(term84912, term84912.getClass(), "version", term84913);
        setField(term84912, term84912.getClass(), "maxChance", term84914);
        setField(term84912, term84912.getClass(), "encounterDetails", term84916);
        Integer term84920 = new Integer(-1258846135);
        ArrayList term84922 = new ArrayList();
        ((ArrayList) term84922).add((Object)null);
        ((ArrayList) term84922).add((Object)null);
        Object term84919 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        setField(term84919, term84919.getClass(), "version", term84900);
        setField(term84919, term84919.getClass(), "maxChance", term84920);
        setField(term84919, term84919.getClass(), "encounterDetails", term84922);
        Integer term84927 = new Integer(-2113882456);
        ArrayList term84929 = new ArrayList();
        ((ArrayList) term84929).add((Object)null);
        ((ArrayList) term84929).add((Object)null);
        Object term84925 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84926 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84926, term84926.getClass(), "name", null);
        setField(term84926, term84926.getClass(), "url", null);
        setField(term84925, term84925.getClass(), "version", term84926);
        setField(term84925, term84925.getClass(), "maxChance", term84927);
        setField(term84925, term84925.getClass(), "encounterDetails", term84929);
        Integer term84933 = new Integer(913224981);
        ArrayList term84935 = new ArrayList();
        ((ArrayList) term84935).add((Object)null);
        ((ArrayList) term84935).add((Object)null);
        ((ArrayList) term84935).add((Object)null);
        ((ArrayList) term84935).add((Object)null);
        ((ArrayList) term84935).add((Object)null);
        ((ArrayList) term84935).add((Object)null);
        Object term84932 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        setField(term84932, term84932.getClass(), "version", term84893);
        setField(term84932, term84932.getClass(), "maxChance", term84933);
        setField(term84932, term84932.getClass(), "encounterDetails", term84935);
        ArrayList term84890 = new ArrayList();
        ((ArrayList) term84890).add(term84892);
        ((ArrayList) term84890).add(term84899);
        ((ArrayList) term84890).add(term84906);
        ((ArrayList) term84890).add(term84912);
        ((ArrayList) term84890).add(term84919);
        ((ArrayList) term84890).add(term84925);
        ((ArrayList) term84890).add(term84932);
        term84864 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term84865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84865, term84865.getClass(), "name", "CBcAPJulAJ");
        setField(term84865, term84865.getClass(), "url", "OvhWHNceRd");
        setField(term84864, term84864.getClass(), "pokemon", term84865);
        setField(term84864, term84864.getClass(), "versionDetails", term84890);
        term84940 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term84940;
        callMethod(klass, "setVersionDetails", argTypes, term84864, args);
    }

};


