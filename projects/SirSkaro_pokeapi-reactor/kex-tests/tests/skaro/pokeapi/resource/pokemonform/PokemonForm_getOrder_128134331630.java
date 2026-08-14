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

public class PokemonForm_getOrder_128134331630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7427;

    public PokemonForm_getOrder_128134331630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7427 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        setField(term7427, term7427.getClass(), "id", null);
        setField(term7427, term7427.getClass(), "name", null);
        setField(term7427, term7427.getClass(), "order", null);
        setField(term7427, term7427.getClass(), "formOrder", null);
        setField(term7427, term7427.getClass(), "isDefault", null);
        setField(term7427, term7427.getClass(), "isBattleOnly", null);
        setField(term7427, term7427.getClass(), "formName", null);
        setField(term7427, term7427.getClass(), "pokemon", null);
        setField(term7427, term7427.getClass(), "sprites", null);
        setField(term7427, term7427.getClass(), "versionGroup", null);
        setField(term7427, term7427.getClass(), "names", null);
        setField(term7427, term7427.getClass(), "formNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term7427, args);
    }

};


