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

public class PokemonMoveVersion_setLevelLearnedAt_2429367416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17260;
     Object term17313;

    public PokemonMoveVersion_setLevelLearnedAt_2429367416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17311 = new Integer(-477355193);
        term17260 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term17261 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17286 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17261, term17261.getClass(), "name", "qvykDllgpT");
        setField(term17261, term17261.getClass(), "url", "hzdUbcLZhZ");
        setField(term17260, term17260.getClass(), "moveLearnMethod", term17261);
        setField(term17286, term17286.getClass(), "name", "GlxnEJvYeC");
        setField(term17286, term17286.getClass(), "url", "SLdOGaqmNv");
        setField(term17260, term17260.getClass(), "versionGroup", term17286);
        setField(term17260, term17260.getClass(), "levelLearnedAt", term17311);
        term17313 = new Integer(168425089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term17313;
        callMethod(klass, "setLevelLearnedAt", argTypes, term17260, args);
    }

};


