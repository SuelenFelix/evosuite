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

public class PokemonType_getSlot_9067446821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932;

    public PokemonType_getSlot_9067446821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term933 = new Integer(679763016);
        term932 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term935 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term932, term932.getClass(), "slot", term933);
        setField(term935, term935.getClass(), "name", "idgaQsnJpQ");
        setField(term935, term935.getClass(), "url", "VgZnGoIFwQ");
        setField(term932, term932.getClass(), "type", term935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlot", argTypes, term932, args);
    }

};


