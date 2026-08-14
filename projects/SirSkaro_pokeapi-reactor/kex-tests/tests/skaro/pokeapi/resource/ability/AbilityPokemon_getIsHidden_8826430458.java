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

public class AbilityPokemon_getIsHidden_8826430458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;

    public AbilityPokemon_getIsHidden_8826430458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term350, term350.getClass(), "isHidden", null);
        setField(term350, term350.getClass(), "slot", null);
        setField(term350, term350.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsHidden", argTypes, term350, args);
    }

};


