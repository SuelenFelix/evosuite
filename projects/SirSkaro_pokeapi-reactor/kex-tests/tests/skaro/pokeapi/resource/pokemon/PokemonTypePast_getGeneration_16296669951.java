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
import java.util.ArrayList;
import java.lang.Integer;

public class PokemonTypePast_getGeneration_16296669951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16334;

    public PokemonTypePast_getGeneration_16296669951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16363 = new Integer(-432054743);
        Object term16362 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16365 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16362, term16362.getClass(), "slot", term16363);
        setField(term16365, term16365.getClass(), "name", null);
        setField(term16365, term16365.getClass(), "url", null);
        setField(term16362, term16362.getClass(), "type", term16365);
        Integer term16367 = new Integer(-859726380);
        Object term16366 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16369 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16366, term16366.getClass(), "slot", term16367);
        setField(term16369, term16369.getClass(), "name", null);
        setField(term16369, term16369.getClass(), "url", null);
        setField(term16366, term16366.getClass(), "type", term16369);
        Integer term16371 = new Integer(-1498422654);
        Object term16370 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16373 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16370, term16370.getClass(), "slot", term16371);
        setField(term16373, term16373.getClass(), "name", null);
        setField(term16373, term16373.getClass(), "url", null);
        setField(term16370, term16370.getClass(), "type", term16373);
        Integer term16375 = new Integer(-1499829233);
        Object term16374 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16374, term16374.getClass(), "slot", term16375);
        setField(term16377, term16377.getClass(), "name", null);
        setField(term16377, term16377.getClass(), "url", null);
        setField(term16374, term16374.getClass(), "type", term16377);
        Integer term16379 = new Integer(-888855662);
        Object term16378 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16381 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16378, term16378.getClass(), "slot", term16379);
        setField(term16381, term16381.getClass(), "name", null);
        setField(term16381, term16381.getClass(), "url", null);
        setField(term16378, term16378.getClass(), "type", term16381);
        ArrayList term16360 = new ArrayList();
        ((ArrayList) term16360).add(term16362);
        ((ArrayList) term16360).add(term16366);
        ((ArrayList) term16360).add(term16370);
        ((ArrayList) term16360).add(term16374);
        ((ArrayList) term16360).add(term16378);
        term16334 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast"));
        Object term16335 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16335, term16335.getClass(), "name", "RldCZqgRbO");
        setField(term16335, term16335.getClass(), "url", "LOVugCAgJs");
        setField(term16334, term16334.getClass(), "generation", term16335);
        setField(term16334, term16334.getClass(), "types", term16360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term16334, args);
    }

};


