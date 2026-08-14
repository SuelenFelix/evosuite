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

public class PokemonMoveVersion_getVersionGroup_5965242293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16936;

    public PokemonMoveVersion_getVersionGroup_5965242293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16987 = new Integer(-862415480);
        term16936 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term16937 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16962 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16937, term16937.getClass(), "name", "FiqETbKjpv");
        setField(term16937, term16937.getClass(), "url", "FxXtdhhXyS");
        setField(term16936, term16936.getClass(), "moveLearnMethod", term16937);
        setField(term16962, term16962.getClass(), "name", "HxCEzaCcgj");
        setField(term16962, term16962.getClass(), "url", "PDYPOQncAB");
        setField(term16936, term16936.getClass(), "versionGroup", term16962);
        setField(term16936, term16936.getClass(), "levelLearnedAt", term16987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term16936, args);
    }

};


