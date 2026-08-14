package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AbilityPokemon_getPokemon_159786892512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public AbilityPokemon_getPokemon_159786892512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term354, term354.getClass(), "isHidden", null);
        setField(term354, term354.getClass(), "slot", null);
        setField(term354, term354.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term354, args);
    }

};


