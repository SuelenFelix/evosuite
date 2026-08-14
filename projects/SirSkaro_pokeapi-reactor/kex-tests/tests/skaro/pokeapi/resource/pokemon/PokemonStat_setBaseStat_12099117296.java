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

public class PokemonStat_setBaseStat_12099117296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term328;

    public PokemonStat_setBaseStat_12099117296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term324 = new Integer(-522618178);
        Integer term326 = new Integer(1134449235);
        term298 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat"));
        Object term299 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term299, term299.getClass(), "name", "oVcInYnLWB");
        setField(term299, term299.getClass(), "url", "aJlieCFVtF");
        setField(term298, term298.getClass(), "stat", term299);
        setField(term298, term298.getClass(), "effort", term324);
        setField(term298, term298.getClass(), "baseStat", term326);
        term328 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term328;
        callMethod(klass, "setBaseStat", argTypes, term298, args);
    }

};


