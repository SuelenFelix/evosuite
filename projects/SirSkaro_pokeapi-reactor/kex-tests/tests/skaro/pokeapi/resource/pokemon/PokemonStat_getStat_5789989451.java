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

public class PokemonStat_getStat_5789989451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PokemonStat_getStat_5789989451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27 = new Integer(568599855);
        Integer term29 = new Integer(1162663216);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat"));
        Object term2 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "url", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "stat", term2);
        setField(term1, term1.getClass(), "effort", term27);
        setField(term1, term1.getClass(), "baseStat", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term1, args);
    }

};


