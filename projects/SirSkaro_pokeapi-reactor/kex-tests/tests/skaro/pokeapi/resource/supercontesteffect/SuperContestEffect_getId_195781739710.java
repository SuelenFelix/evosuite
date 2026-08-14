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

public class SuperContestEffect_getId_195781739710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public SuperContestEffect_getId_195781739710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term217, term217.getClass(), "id", null);
        setField(term217, term217.getClass(), "appeal", null);
        setField(term217, term217.getClass(), "flavorTextEntries", null);
        setField(term217, term217.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term217, args);
    }

};


