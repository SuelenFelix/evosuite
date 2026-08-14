package skaro.pokeapi.resource.movelearnmethod;

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
import static skaro.pokeapi.resource.movelearnmethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveLearnMethod_getName_77774802214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;

    public MoveLearnMethod_getName_77774802214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term627, term627.getClass(), "id", null);
        setField(term627, term627.getClass(), "name", null);
        setField(term627, term627.getClass(), "descriptions", null);
        setField(term627, term627.getClass(), "names", null);
        setField(term627, term627.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term627, args);
    }

};


