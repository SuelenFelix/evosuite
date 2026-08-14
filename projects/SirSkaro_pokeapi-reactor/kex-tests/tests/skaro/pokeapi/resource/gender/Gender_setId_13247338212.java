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

public class Gender_setId_13247338212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;
     Object term332;

    public Gender_setId_13247338212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term298 = new Integer(-522618178);
        Integer term315 = new Integer(1134449235);
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term314, term314.getClass(), "rate", term315);
        setField(term317, term317.getClass(), "name", null);
        setField(term317, term317.getClass(), "url", null);
        setField(term314, term314.getClass(), "pokemonSpecies", term317);
        Integer term319 = new Integer(-883034806);
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term321 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term318, term318.getClass(), "rate", term319);
        setField(term321, term321.getClass(), "name", null);
        setField(term321, term321.getClass(), "url", null);
        setField(term318, term318.getClass(), "pokemonSpecies", term321);
        Integer term323 = new Integer(1585847225);
        Object term322 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term325 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term322, term322.getClass(), "rate", term323);
        setField(term325, term325.getClass(), "name", null);
        setField(term325, term325.getClass(), "url", null);
        setField(term322, term322.getClass(), "pokemonSpecies", term325);
        ArrayList term312 = new ArrayList();
        ((ArrayList) term312).add(term314);
        ((ArrayList) term312).add(term318);
        ((ArrayList) term312).add(term322);
        ArrayList term328 = new ArrayList();
        term297 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term297, term297.getClass(), "id", term298);
        setField(term297, term297.getClass(), "name", "eZFUvlxvGV");
        setField(term297, term297.getClass(), "pokemonSpeciesDetails", term312);
        setField(term297, term297.getClass(), "requiredForEvolution", term328);
        term332 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term332;
        callMethod(klass, "setId", argTypes, term297, args);
    }

};


