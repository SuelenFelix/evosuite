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
import java.lang.Integer;
import java.lang.Object;

public class PokemonType_setType_8064395694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078;
     Object term1106;

    public PokemonType_setType_8064395694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1079 = new Integer(-157887805);
        term1078 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term1081 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1078, term1078.getClass(), "slot", term1079);
        setField(term1081, term1081.getClass(), "name", "PHvxnGHptP");
        setField(term1081, term1081.getClass(), "url", "TimdotUuNC");
        setField(term1078, term1078.getClass(), "type", term1081);
        term1106 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1106, term1106.getClass(), "name", "swZVeJAxjt");
        setField(term1106, term1106.getClass(), "url", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1106;
        callMethod(klass, "setType", argTypes, term1078, args);
    }

};


