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

public class PokemonStat_getBaseStat_14745842595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public PokemonStat_getBaseStat_14745842595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term274 = new Integer(-1339778481);
        Integer term276 = new Integer(1725571209);
        term248 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat"));
        Object term249 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term249, term249.getClass(), "name", "MxlszYVzRf");
        setField(term249, term249.getClass(), "url", "LQFpaHEwXR");
        setField(term248, term248.getClass(), "stat", term249);
        setField(term248, term248.getClass(), "effort", term274);
        setField(term248, term248.getClass(), "baseStat", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseStat", argTypes, term248, args);
    }

};


