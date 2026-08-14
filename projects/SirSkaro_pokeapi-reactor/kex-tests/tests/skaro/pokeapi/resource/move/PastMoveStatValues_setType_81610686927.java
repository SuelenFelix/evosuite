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

public class PastMoveStatValues_setType_81610686927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;

    public PastMoveStatValues_setType_81610686927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1743 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        setField(term1743, term1743.getClass(), "accuracy", null);
        setField(term1743, term1743.getClass(), "effectChance", null);
        setField(term1743, term1743.getClass(), "power", null);
        setField(term1743, term1743.getClass(), "pp", null);
        setField(term1743, term1743.getClass(), "effectEntries", null);
        setField(term1743, term1743.getClass(), "type", null);
        setField(term1743, term1743.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term1743, args);
    }

};


