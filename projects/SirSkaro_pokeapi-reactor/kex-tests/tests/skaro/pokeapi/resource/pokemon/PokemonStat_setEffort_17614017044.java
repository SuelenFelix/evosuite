package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PokemonStat_setEffort_17614017044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term226;

    public PokemonStat_setEffort_17614017044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term222 = new Integer(-1955890973);
        Integer term224 = new Integer(-2038273078);
        term196 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat"));
        Object term197 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term197, term197.getClass(), "name", "NRdvgJlhkX");
        setField(term197, term197.getClass(), "url", "uuaPigETmJ");
        setField(term196, term196.getClass(), "stat", term197);
        setField(term196, term196.getClass(), "effort", term222);
        setField(term196, term196.getClass(), "baseStat", term224);
        term226 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term226;
        callMethod(klass, "setEffort", argTypes, term196, args);
    }

};


