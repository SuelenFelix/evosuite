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
import java.lang.Integer;
import java.util.ArrayList;

public class MoveCategory_getDescriptions_14868545977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;

    public MoveCategory_getDescriptions_14868545977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term305 = new Integer(-2038273078);
        ArrayList term319 = new ArrayList();
        ArrayList term323 = new ArrayList();
        term304 = newInstance(Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory"));
        setField(term304, term304.getClass(), "id", term305);
        setField(term304, term304.getClass(), "name", "LvJFtLBaxj");
        setField(term304, term304.getClass(), "moves", term319);
        setField(term304, term304.getClass(), "descriptions", term323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptions", argTypes, term304, args);
    }

};


