package skaro.pokeapi.resource.gender;

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
import static skaro.pokeapi.resource.gender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Gender_getPokemonSpeciesDetails_11446710775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444;

    public Gender_getPokemonSpeciesDetails_11446710775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term445 = new Integer(-6029667);
        Integer term462 = new Integer(-2068769794);
        Object term461 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term464 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term461, term461.getClass(), "rate", term462);
        setField(term464, term464.getClass(), "name", null);
        setField(term464, term464.getClass(), "url", null);
        setField(term461, term461.getClass(), "pokemonSpecies", term464);
        Integer term466 = new Integer(-117576464);
        Object term465 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term468 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term465, term465.getClass(), "rate", term466);
        setField(term468, term468.getClass(), "name", null);
        setField(term468, term468.getClass(), "url", null);
        setField(term465, term465.getClass(), "pokemonSpecies", term468);
        Integer term470 = new Integer(-1007160944);
        Object term469 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term472 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term469, term469.getClass(), "rate", term470);
        setField(term472, term472.getClass(), "name", null);
        setField(term472, term472.getClass(), "url", null);
        setField(term469, term469.getClass(), "pokemonSpecies", term472);
        Integer term474 = new Integer(1135664017);
        Object term473 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term476 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term473, term473.getClass(), "rate", term474);
        setField(term476, term476.getClass(), "name", null);
        setField(term476, term476.getClass(), "url", null);
        setField(term473, term473.getClass(), "pokemonSpecies", term476);
        Integer term478 = new Integer(590364439);
        Object term477 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term480 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term477, term477.getClass(), "rate", term478);
        setField(term480, term480.getClass(), "name", null);
        setField(term480, term480.getClass(), "url", null);
        setField(term477, term477.getClass(), "pokemonSpecies", term480);
        Integer term482 = new Integer(865208305);
        Object term481 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term484 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term481, term481.getClass(), "rate", term482);
        setField(term484, term484.getClass(), "name", null);
        setField(term484, term484.getClass(), "url", null);
        setField(term481, term481.getClass(), "pokemonSpecies", term484);
        Integer term486 = new Integer(-1275173084);
        Object term485 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term485, term485.getClass(), "rate", term486);
        setField(term488, term488.getClass(), "name", null);
        setField(term488, term488.getClass(), "url", null);
        setField(term485, term485.getClass(), "pokemonSpecies", term488);
        ArrayList term459 = new ArrayList();
        ((ArrayList) term459).add(term461);
        ((ArrayList) term459).add(term465);
        ((ArrayList) term459).add(term469);
        ((ArrayList) term459).add(term473);
        ((ArrayList) term459).add(term477);
        ((ArrayList) term459).add(term481);
        ((ArrayList) term459).add(term485);
        ArrayList term491 = new ArrayList();
        term444 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term444, term444.getClass(), "id", term445);
        setField(term444, term444.getClass(), "name", "aKnKipADSo");
        setField(term444, term444.getClass(), "pokemonSpeciesDetails", term459);
        setField(term444, term444.getClass(), "requiredForEvolution", term491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpeciesDetails", argTypes, term444, args);
    }

};


