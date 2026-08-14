package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Generation_getPokemonSpecies_152683659911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788;

    public Generation_getPokemonSpecies_152683659911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term789 = new Integer(-522618178);
        ArrayList term803 = new ArrayList();
        Object term809 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term811 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term809, term809.getClass(), "name", "");
        setField(term811, term811.getClass(), "name", null);
        setField(term811, term811.getClass(), "url", null);
        setField(term809, term809.getClass(), "language", term811);
        Object term812 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term814 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term812, term812.getClass(), "name", "");
        setField(term814, term814.getClass(), "name", null);
        setField(term814, term814.getClass(), "url", null);
        setField(term812, term812.getClass(), "language", term814);
        Object term815 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term817 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term815, term815.getClass(), "name", "");
        setField(term817, term817.getClass(), "name", null);
        setField(term817, term817.getClass(), "url", null);
        setField(term815, term815.getClass(), "language", term817);
        Object term818 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term820 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term818, term818.getClass(), "name", "");
        setField(term820, term820.getClass(), "name", null);
        setField(term820, term820.getClass(), "url", null);
        setField(term818, term818.getClass(), "language", term820);
        Object term821 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term823 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term821, term821.getClass(), "name", "");
        setField(term823, term823.getClass(), "name", null);
        setField(term823, term823.getClass(), "url", null);
        setField(term821, term821.getClass(), "language", term823);
        Object term824 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term826 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term824, term824.getClass(), "name", "");
        setField(term826, term826.getClass(), "name", null);
        setField(term826, term826.getClass(), "url", null);
        setField(term824, term824.getClass(), "language", term826);
        Object term827 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term829 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term827, term827.getClass(), "name", "");
        setField(term829, term829.getClass(), "name", null);
        setField(term829, term829.getClass(), "url", null);
        setField(term827, term827.getClass(), "language", term829);
        Object term830 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term832 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term830, term830.getClass(), "name", "");
        setField(term832, term832.getClass(), "name", null);
        setField(term832, term832.getClass(), "url", null);
        setField(term830, term830.getClass(), "language", term832);
        ArrayList term807 = new ArrayList();
        ((ArrayList) term807).add(term809);
        ((ArrayList) term807).add(term812);
        ((ArrayList) term807).add(term815);
        ((ArrayList) term807).add(term818);
        ((ArrayList) term807).add(term821);
        ((ArrayList) term807).add(term824);
        ((ArrayList) term807).add(term827);
        ((ArrayList) term807).add(term830);
        ArrayList term835 = new ArrayList();
        ArrayList term839 = new ArrayList();
        ArrayList term843 = new ArrayList();
        ArrayList term847 = new ArrayList();
        term788 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term788, term788.getClass(), "id", term789);
        setField(term788, term788.getClass(), "name", "ekxGuOYIwi");
        setField(term788, term788.getClass(), "abilities", term803);
        setField(term788, term788.getClass(), "names", term807);
        setField(term788, term788.getClass(), "moves", term835);
        setField(term788, term788.getClass(), "pokemonSpecies", term839);
        setField(term788, term788.getClass(), "types", term843);
        setField(term788, term788.getClass(), "versionGroups", term847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term788, args);
    }

};


