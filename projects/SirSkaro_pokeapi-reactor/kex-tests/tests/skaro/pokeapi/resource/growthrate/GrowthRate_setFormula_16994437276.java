package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class GrowthRate_setFormula_16994437276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public GrowthRate_setFormula_16994437276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term467 = new Integer(1876565163);
        Object term495 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term495, term495.getClass(), "description", "");
        setField(term497, term497.getClass(), "name", null);
        setField(term497, term497.getClass(), "url", null);
        setField(term495, term495.getClass(), "language", term497);
        ArrayList term493 = new ArrayList();
        ((ArrayList) term493).add(term495);
        ArrayList term500 = new ArrayList();
        ArrayList term504 = new ArrayList();
        term466 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term466, term466.getClass(), "id", term467);
        setField(term466, term466.getClass(), "name", "hoicvmsovO");
        setField(term466, term466.getClass(), "formula", "eqJfYWRaEL");
        setField(term466, term466.getClass(), "descriptions", term493);
        setField(term466, term466.getClass(), "levels", term500);
        setField(term466, term466.getClass(), "pokemonSpecies", term504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "setFormula", argTypes, term466, args);
    }

};


