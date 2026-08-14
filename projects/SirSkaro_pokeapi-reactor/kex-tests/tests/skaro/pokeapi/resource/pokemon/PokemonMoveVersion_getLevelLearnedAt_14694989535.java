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

public class PokemonMoveVersion_getLevelLearnedAt_14694989535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17167;

    public PokemonMoveVersion_getLevelLearnedAt_14694989535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17218 = new Integer(-402072606);
        term17167 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term17168 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17193 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17168, term17168.getClass(), "name", "UMMXkhuqzw");
        setField(term17168, term17168.getClass(), "url", "KyGXZcXJwq");
        setField(term17167, term17167.getClass(), "moveLearnMethod", term17168);
        setField(term17193, term17193.getClass(), "name", "TqiCjeuoWE");
        setField(term17193, term17193.getClass(), "url", "GWWfkXOYLP");
        setField(term17167, term17167.getClass(), "versionGroup", term17193);
        setField(term17167, term17167.getClass(), "levelLearnedAt", term17218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelLearnedAt", argTypes, term17167, args);
    }

};


