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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class AbilityPokemon_getPokemon_15978689255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public AbilityPokemon_getPokemon_15978689255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term206 = new Boolean(true);
        Integer term208 = new Integer(-616727354);
        term205 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        Object term210 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term205, term205.getClass(), "isHidden", term206);
        setField(term205, term205.getClass(), "slot", term208);
        setField(term210, term210.getClass(), "name", "hRNSzYYIrc");
        setField(term210, term210.getClass(), "url", "RMFIsYGgne");
        setField(term205, term205.getClass(), "pokemon", term210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term205, args);
    }

};


