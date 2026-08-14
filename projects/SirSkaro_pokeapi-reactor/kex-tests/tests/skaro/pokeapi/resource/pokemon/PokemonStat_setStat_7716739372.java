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

public class PokemonStat_setStat_7716739372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term81;

    public PokemonStat_setStat_7716739372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term77 = new Integer(1484323161);
        Integer term79 = new Integer(391863371);
        term51 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat"));
        Object term52 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term52, term52.getClass(), "name", "MuLcgQHgqz");
        setField(term52, term52.getClass(), "url", "xxtlPwDYFs");
        setField(term51, term51.getClass(), "stat", term52);
        setField(term51, term51.getClass(), "effort", term77);
        setField(term51, term51.getClass(), "baseStat", term79);
        term81 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term81, term81.getClass(), "name", "SzjVpOQTyS");
        setField(term81, term81.getClass(), "url", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setStat", argTypes, term51, args);
    }

};


