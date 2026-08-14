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

public class MoveLearnMethod_setId_173884007113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626;

    public MoveLearnMethod_setId_173884007113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term626, term626.getClass(), "id", null);
        setField(term626, term626.getClass(), "name", null);
        setField(term626, term626.getClass(), "descriptions", null);
        setField(term626, term626.getClass(), "names", null);
        setField(term626, term626.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term626, args);
    }

};


