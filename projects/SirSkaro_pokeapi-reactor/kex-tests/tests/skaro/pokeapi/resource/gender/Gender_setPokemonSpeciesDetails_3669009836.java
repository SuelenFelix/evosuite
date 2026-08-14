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
import java.util.LinkedList;

public class Gender_setPokemonSpeciesDetails_3669009836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505;
     Object term552;

    public Gender_setPokemonSpeciesDetails_3669009836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term506 = new Integer(-244121226);
        Integer term523 = new Integer(-203030934);
        Object term522 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term525 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term522, term522.getClass(), "rate", term523);
        setField(term525, term525.getClass(), "name", null);
        setField(term525, term525.getClass(), "url", null);
        setField(term522, term522.getClass(), "pokemonSpecies", term525);
        Integer term527 = new Integer(-1179120542);
        Object term526 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term529 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term526, term526.getClass(), "rate", term527);
        setField(term529, term529.getClass(), "name", null);
        setField(term529, term529.getClass(), "url", null);
        setField(term526, term526.getClass(), "pokemonSpecies", term529);
        Integer term531 = new Integer(-73683645);
        Object term530 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term533 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term530, term530.getClass(), "rate", term531);
        setField(term533, term533.getClass(), "name", null);
        setField(term533, term533.getClass(), "url", null);
        setField(term530, term530.getClass(), "pokemonSpecies", term533);
        Integer term535 = new Integer(-226514366);
        Object term534 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term537 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term534, term534.getClass(), "rate", term535);
        setField(term537, term537.getClass(), "name", null);
        setField(term537, term537.getClass(), "url", null);
        setField(term534, term534.getClass(), "pokemonSpecies", term537);
        Integer term539 = new Integer(1193880199);
        Object term538 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term541 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term538, term538.getClass(), "rate", term539);
        setField(term541, term541.getClass(), "name", null);
        setField(term541, term541.getClass(), "url", null);
        setField(term538, term538.getClass(), "pokemonSpecies", term541);
        Integer term543 = new Integer(-1087774327);
        Object term542 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term545 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term542, term542.getClass(), "rate", term543);
        setField(term545, term545.getClass(), "name", null);
        setField(term545, term545.getClass(), "url", null);
        setField(term542, term542.getClass(), "pokemonSpecies", term545);
        ArrayList term520 = new ArrayList();
        ((ArrayList) term520).add(term522);
        ((ArrayList) term520).add(term526);
        ((ArrayList) term520).add(term530);
        ((ArrayList) term520).add(term534);
        ((ArrayList) term520).add(term538);
        ((ArrayList) term520).add(term542);
        ArrayList term548 = new ArrayList();
        term505 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term505, term505.getClass(), "id", term506);
        setField(term505, term505.getClass(), "name", "onpbIeEKoi");
        setField(term505, term505.getClass(), "pokemonSpeciesDetails", term520);
        setField(term505, term505.getClass(), "requiredForEvolution", term548);
        term552 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term552;
        callMethod(klass, "setPokemonSpeciesDetails", argTypes, term505, args);
    }

};


