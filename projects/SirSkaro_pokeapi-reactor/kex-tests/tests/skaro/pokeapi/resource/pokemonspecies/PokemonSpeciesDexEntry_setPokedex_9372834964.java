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

public class PokemonSpeciesDexEntry_setPokedex_9372834964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term761;

    public PokemonSpeciesDexEntry_setPokedex_9372834964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term734 = new Integer(-1922583790);
        term733 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry"));
        Object term736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term733, term733.getClass(), "entryNumber", term734);
        setField(term736, term736.getClass(), "name", "Ghbwtircqb");
        setField(term736, term736.getClass(), "url", "xrwlQZdwCp");
        setField(term733, term733.getClass(), "pokedex", term736);
        term761 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term761, term761.getClass(), "name", "aKnKipADSo");
        setField(term761, term761.getClass(), "url", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term761;
        callMethod(klass, "setPokedex", argTypes, term733, args);
    }

};


