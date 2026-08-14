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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class PokemonAbility_getIsHidden_6684981121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20385;

    public PokemonAbility_getIsHidden_6684981121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20386 = new Boolean(true);
        Integer term20388 = new Integer(-571931590);
        term20385 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20390 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20385, term20385.getClass(), "isHidden", term20386);
        setField(term20385, term20385.getClass(), "slot", term20388);
        setField(term20390, term20390.getClass(), "name", "CaeIUTuUFo");
        setField(term20390, term20390.getClass(), "url", "rzoDGjHkzG");
        setField(term20385, term20385.getClass(), "ability", term20390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsHidden", argTypes, term20385, args);
    }

};


