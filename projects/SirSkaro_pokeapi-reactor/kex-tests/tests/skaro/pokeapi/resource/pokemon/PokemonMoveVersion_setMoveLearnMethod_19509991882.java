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

public class PokemonMoveVersion_setMoveLearnMethod_19509991882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16798;
     Object term16851;

    public PokemonMoveVersion_setMoveLearnMethod_19509991882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16849 = new Integer(2105146188);
        term16798 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term16799 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16824 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16799, term16799.getClass(), "name", "wboNBMhRjP");
        setField(term16799, term16799.getClass(), "url", "HZODpafOGe");
        setField(term16798, term16798.getClass(), "moveLearnMethod", term16799);
        setField(term16824, term16824.getClass(), "name", "dUTYEKtTfQ");
        setField(term16824, term16824.getClass(), "url", "HUtbHklGel");
        setField(term16798, term16798.getClass(), "versionGroup", term16824);
        setField(term16798, term16798.getClass(), "levelLearnedAt", term16849);
        term16851 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16851, term16851.getClass(), "name", "NYSBqIpNlD");
        setField(term16851, term16851.getClass(), "url", "OWglDUWQYb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term16851;
        callMethod(klass, "setMoveLearnMethod", argTypes, term16798, args);
    }

};


