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

public class PokemonAbility_getAbility_13710948015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20589;

    public PokemonAbility_getAbility_13710948015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20590 = new Boolean(true);
        Integer term20592 = new Integer(27780241);
        term20589 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20594 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20589, term20589.getClass(), "isHidden", term20590);
        setField(term20589, term20589.getClass(), "slot", term20592);
        setField(term20594, term20594.getClass(), "name", "NUqhsZprdZ");
        setField(term20594, term20594.getClass(), "url", "jkzgCqWJrA");
        setField(term20589, term20589.getClass(), "ability", term20594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbility", argTypes, term20589, args);
    }

};


