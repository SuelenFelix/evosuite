package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PastMoveStatValues_setVersionGroup_204397429629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1745;

    public PastMoveStatValues_setVersionGroup_204397429629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1745 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        setField(term1745, term1745.getClass(), "accuracy", null);
        setField(term1745, term1745.getClass(), "effectChance", null);
        setField(term1745, term1745.getClass(), "power", null);
        setField(term1745, term1745.getClass(), "pp", null);
        setField(term1745, term1745.getClass(), "effectEntries", null);
        setField(term1745, term1745.getClass(), "type", null);
        setField(term1745, term1745.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersionGroup", argTypes, term1745, args);
    }

};


