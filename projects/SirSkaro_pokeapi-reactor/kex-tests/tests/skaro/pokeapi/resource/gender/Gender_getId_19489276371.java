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

public class Gender_getId_19489276371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public Gender_getId_19489276371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term245 = new Integer(-616727354);
        Integer term262 = new Integer(-1955890973);
        Object term261 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term261, term261.getClass(), "rate", term262);
        setField(term264, term264.getClass(), "name", null);
        setField(term264, term264.getClass(), "url", null);
        setField(term261, term261.getClass(), "pokemonSpecies", term264);
        Integer term266 = new Integer(-2038273078);
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term268 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term265, term265.getClass(), "rate", term266);
        setField(term268, term268.getClass(), "name", null);
        setField(term268, term268.getClass(), "url", null);
        setField(term265, term265.getClass(), "pokemonSpecies", term268);
        Integer term270 = new Integer(1227103734);
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term269, term269.getClass(), "rate", term270);
        setField(term272, term272.getClass(), "name", null);
        setField(term272, term272.getClass(), "url", null);
        setField(term269, term269.getClass(), "pokemonSpecies", term272);
        Integer term274 = new Integer(-1339778481);
        Object term273 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term273, term273.getClass(), "rate", term274);
        setField(term276, term276.getClass(), "name", null);
        setField(term276, term276.getClass(), "url", null);
        setField(term273, term273.getClass(), "pokemonSpecies", term276);
        Integer term278 = new Integer(1725571209);
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term277, term277.getClass(), "rate", term278);
        setField(term280, term280.getClass(), "name", null);
        setField(term280, term280.getClass(), "url", null);
        setField(term277, term277.getClass(), "pokemonSpecies", term280);
        ArrayList term259 = new ArrayList();
        ((ArrayList) term259).add(term261);
        ((ArrayList) term259).add(term265);
        ((ArrayList) term259).add(term269);
        ((ArrayList) term259).add(term273);
        ((ArrayList) term259).add(term277);
        ArrayList term283 = new ArrayList();
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term244, term244.getClass(), "id", term245);
        setField(term244, term244.getClass(), "name", "MxlszYVzRf");
        setField(term244, term244.getClass(), "pokemonSpeciesDetails", term259);
        setField(term244, term244.getClass(), "requiredForEvolution", term283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term244, args);
    }

};


