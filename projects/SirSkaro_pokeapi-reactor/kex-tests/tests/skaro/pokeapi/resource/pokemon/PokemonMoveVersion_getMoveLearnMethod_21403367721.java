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

public class PokemonMoveVersion_getMoveLearnMethod_21403367721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16705;

    public PokemonMoveVersion_getMoveLearnMethod_21403367721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16756 = new Integer(802539130);
        term16705 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term16706 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16706, term16706.getClass(), "name", "KKEcpYXNZV");
        setField(term16706, term16706.getClass(), "url", "shLHFznysy");
        setField(term16705, term16705.getClass(), "moveLearnMethod", term16706);
        setField(term16731, term16731.getClass(), "name", "YCKIloBHLj");
        setField(term16731, term16731.getClass(), "url", "qUWDhAeFJY");
        setField(term16705, term16705.getClass(), "versionGroup", term16731);
        setField(term16705, term16705.getClass(), "levelLearnedAt", term16756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveLearnMethod", argTypes, term16705, args);
    }

};


