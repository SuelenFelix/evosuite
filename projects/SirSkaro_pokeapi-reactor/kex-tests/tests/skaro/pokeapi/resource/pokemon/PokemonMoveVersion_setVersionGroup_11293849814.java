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
import java.lang.Integer;

public class PokemonMoveVersion_setVersionGroup_11293849814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17029;
     Object term17082;

    public PokemonMoveVersion_setVersionGroup_11293849814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17080 = new Integer(312605349);
        term17029 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term17030 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17055 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17030, term17030.getClass(), "name", "cHqLMqZSmc");
        setField(term17030, term17030.getClass(), "url", "hkWmAkXSOW");
        setField(term17029, term17029.getClass(), "moveLearnMethod", term17030);
        setField(term17055, term17055.getClass(), "name", "DwQmZEKeOp");
        setField(term17055, term17055.getClass(), "url", "DbxrFiyttv");
        setField(term17029, term17029.getClass(), "versionGroup", term17055);
        setField(term17029, term17029.getClass(), "levelLearnedAt", term17080);
        term17082 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17082, term17082.getClass(), "name", "NqQofgWsJd");
        setField(term17082, term17082.getClass(), "url", "ZlVRdHsBMO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term17082;
        callMethod(klass, "setVersionGroup", argTypes, term17029, args);
    }

};


