package skaro.pokeapi.resource.pokemonspecies;

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
import static skaro.pokeapi.resource.pokemonspecies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class PokemonSpeciesDexEntry_getEntryNumber_13848423501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587;

    public PokemonSpeciesDexEntry_getEntryNumber_13848423501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term588 = new Integer(568599855);
        term587 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry"));
        Object term590 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term587, term587.getClass(), "entryNumber", term588);
        setField(term590, term590.getClass(), "name", "TEParAifyi");
        setField(term590, term590.getClass(), "url", "OWDIEULEFu");
        setField(term587, term587.getClass(), "pokedex", term590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntryNumber", argTypes, term587, args);
    }

};


