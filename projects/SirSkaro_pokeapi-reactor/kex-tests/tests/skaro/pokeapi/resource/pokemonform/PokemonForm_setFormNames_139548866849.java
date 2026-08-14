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

public class PokemonForm_setFormNames_139548866849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7446;

    public PokemonForm_setFormNames_139548866849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7446 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        setField(term7446, term7446.getClass(), "id", null);
        setField(term7446, term7446.getClass(), "name", null);
        setField(term7446, term7446.getClass(), "order", null);
        setField(term7446, term7446.getClass(), "formOrder", null);
        setField(term7446, term7446.getClass(), "isDefault", null);
        setField(term7446, term7446.getClass(), "isBattleOnly", null);
        setField(term7446, term7446.getClass(), "formName", null);
        setField(term7446, term7446.getClass(), "pokemon", null);
        setField(term7446, term7446.getClass(), "sprites", null);
        setField(term7446, term7446.getClass(), "versionGroup", null);
        setField(term7446, term7446.getClass(), "names", null);
        setField(term7446, term7446.getClass(), "formNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormNames", argTypes, term7446, args);
    }

};


