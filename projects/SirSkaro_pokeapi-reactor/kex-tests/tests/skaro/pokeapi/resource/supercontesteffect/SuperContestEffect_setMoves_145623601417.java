package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SuperContestEffect_setMoves_145623601417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;

    public SuperContestEffect_setMoves_145623601417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term224, term224.getClass(), "id", null);
        setField(term224, term224.getClass(), "appeal", null);
        setField(term224, term224.getClass(), "flavorTextEntries", null);
        setField(term224, term224.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMoves", argTypes, term224, args);
    }

};


