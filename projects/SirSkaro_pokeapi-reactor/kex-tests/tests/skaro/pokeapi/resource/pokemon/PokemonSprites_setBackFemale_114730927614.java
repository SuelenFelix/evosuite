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

public class PokemonSprites_setBackFemale_114730927614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19794;

    public PokemonSprites_setBackFemale_114730927614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19794 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term19794, term19794.getClass(), "frontDefault", "VoKhXiLAaW");
        setField(term19794, term19794.getClass(), "frontShiny", "CaalXzRXQI");
        setField(term19794, term19794.getClass(), "frontFemale", "eRBnKPjyVg");
        setField(term19794, term19794.getClass(), "frontShinyFemale", "svPqsHBvrm");
        setField(term19794, term19794.getClass(), "backDefault", "sRzUJLYMmB");
        setField(term19794, term19794.getClass(), "backShiny", "XxILklSDwz");
        setField(term19794, term19794.getClass(), "backFemale", "TLjhFZbwKO");
        setField(term19794, term19794.getClass(), "backShinyFemale", "nxEbLIApFc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zzsdNZhejE";
        callMethod(klass, "setBackFemale", argTypes, term19794, args);
    }

};


