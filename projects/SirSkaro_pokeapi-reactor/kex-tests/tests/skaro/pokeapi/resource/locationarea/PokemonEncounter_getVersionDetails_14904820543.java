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

public class PokemonEncounter_getVersionDetails_14904820543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84793;

    public PokemonEncounter_getVersionDetails_14904820543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term84823 = new Integer(260483962);
        ArrayList term84825 = new ArrayList();
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        ((ArrayList) term84825).add((Object)null);
        Object term84821 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84822 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84822, term84822.getClass(), "name", null);
        setField(term84822, term84822.getClass(), "url", null);
        setField(term84821, term84821.getClass(), "version", term84822);
        setField(term84821, term84821.getClass(), "maxChance", term84823);
        setField(term84821, term84821.getClass(), "encounterDetails", term84825);
        Integer term84830 = new Integer(949997254);
        ArrayList term84832 = new ArrayList();
        ((ArrayList) term84832).add((Object)null);
        ((ArrayList) term84832).add((Object)null);
        ((ArrayList) term84832).add((Object)null);
        ((ArrayList) term84832).add((Object)null);
        ((ArrayList) term84832).add((Object)null);
        ((ArrayList) term84832).add((Object)null);
        Object term84828 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84829 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84829, term84829.getClass(), "name", null);
        setField(term84829, term84829.getClass(), "url", null);
        setField(term84828, term84828.getClass(), "version", term84829);
        setField(term84828, term84828.getClass(), "maxChance", term84830);
        setField(term84828, term84828.getClass(), "encounterDetails", term84832);
        Integer term84837 = new Integer(-1865692837);
        ArrayList term84839 = new ArrayList();
        ((ArrayList) term84839).add((Object)null);
        ((ArrayList) term84839).add((Object)null);
        ((ArrayList) term84839).add((Object)null);
        ((ArrayList) term84839).add((Object)null);
        ((ArrayList) term84839).add((Object)null);
        Object term84835 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term84836 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84836, term84836.getClass(), "name", null);
        setField(term84836, term84836.getClass(), "url", null);
        setField(term84835, term84835.getClass(), "version", term84836);
        setField(term84835, term84835.getClass(), "maxChance", term84837);
        setField(term84835, term84835.getClass(), "encounterDetails", term84839);
        ArrayList term84819 = new ArrayList();
        ((ArrayList) term84819).add(term84821);
        ((ArrayList) term84819).add(term84828);
        ((ArrayList) term84819).add(term84835);
        term84793 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term84794 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term84794, term84794.getClass(), "name", "CZZYeaxqjs");
        setField(term84794, term84794.getClass(), "url", "KaNkKUHQsw");
        setField(term84793, term84793.getClass(), "pokemon", term84794);
        setField(term84793, term84793.getClass(), "versionDetails", term84819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionDetails", argTypes, term84793, args);
    }

};


