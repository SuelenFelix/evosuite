package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonForm_setFormOrder_195157949033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7430;

    public PokemonForm_setFormOrder_195157949033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7430 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        setField(term7430, term7430.getClass(), "id", null);
        setField(term7430, term7430.getClass(), "name", null);
        setField(term7430, term7430.getClass(), "order", null);
        setField(term7430, term7430.getClass(), "formOrder", null);
        setField(term7430, term7430.getClass(), "isDefault", null);
        setField(term7430, term7430.getClass(), "isBattleOnly", null);
        setField(term7430, term7430.getClass(), "formName", null);
        setField(term7430, term7430.getClass(), "pokemon", null);
        setField(term7430, term7430.getClass(), "sprites", null);
        setField(term7430, term7430.getClass(), "versionGroup", null);
        setField(term7430, term7430.getClass(), "names", null);
        setField(term7430, term7430.getClass(), "formNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormOrder", argTypes, term7430, args);
    }

};


