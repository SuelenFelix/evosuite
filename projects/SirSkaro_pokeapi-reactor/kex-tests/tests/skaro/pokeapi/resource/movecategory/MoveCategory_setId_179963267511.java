package skaro.pokeapi.resource.movecategory;

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
import static skaro.pokeapi.resource.movecategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveCategory_setId_179963267511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public MoveCategory_setId_179963267511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395 = newInstance(Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory"));
        setField(term395, term395.getClass(), "id", null);
        setField(term395, term395.getClass(), "name", null);
        setField(term395, term395.getClass(), "moves", null);
        setField(term395, term395.getClass(), "descriptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term395, args);
    }

};


