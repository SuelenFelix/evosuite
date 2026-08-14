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

public class Gender_setRequiredForEvolution_19829713018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;
     Object term633;

    public Gender_setRequiredForEvolution_19829713018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term603 = new Integer(-1145578966);
        Integer term620 = new Integer(679763016);
        Object term619 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term622 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term619, term619.getClass(), "rate", term620);
        setField(term622, term622.getClass(), "name", null);
        setField(term622, term622.getClass(), "url", null);
        setField(term619, term619.getClass(), "pokemonSpecies", term622);
        Integer term624 = new Integer(1962444399);
        Object term623 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term623, term623.getClass(), "rate", term624);
        setField(term626, term626.getClass(), "name", null);
        setField(term626, term626.getClass(), "url", null);
        setField(term623, term623.getClass(), "pokemonSpecies", term626);
        ArrayList term617 = new ArrayList();
        ((ArrayList) term617).add(term619);
        ((ArrayList) term617).add(term623);
        ArrayList term629 = new ArrayList();
        term602 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term602, term602.getClass(), "id", term603);
        setField(term602, term602.getClass(), "name", "whBvTVIIlC");
        setField(term602, term602.getClass(), "pokemonSpeciesDetails", term617);
        setField(term602, term602.getClass(), "requiredForEvolution", term629);
        term633 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term633;
        callMethod(klass, "setRequiredForEvolution", argTypes, term602, args);
    }

};


