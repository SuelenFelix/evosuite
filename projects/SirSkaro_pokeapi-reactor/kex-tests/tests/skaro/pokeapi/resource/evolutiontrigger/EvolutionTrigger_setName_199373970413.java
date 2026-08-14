package skaro.pokeapi.resource.evolutiontrigger;

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
import static skaro.pokeapi.resource.evolutiontrigger.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EvolutionTrigger_setName_199373970413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;

    public EvolutionTrigger_setName_199373970413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379 = newInstance(Class.forName("skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger"));
        setField(term379, term379.getClass(), "id", null);
        setField(term379, term379.getClass(), "name", null);
        setField(term379, term379.getClass(), "names", null);
        setField(term379, term379.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term379, args);
    }

};


