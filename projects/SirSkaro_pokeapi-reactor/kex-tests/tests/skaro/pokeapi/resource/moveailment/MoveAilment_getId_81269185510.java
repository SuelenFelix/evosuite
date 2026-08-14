package skaro.pokeapi.resource.moveailment;

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
import static skaro.pokeapi.resource.moveailment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveAilment_getId_81269185510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;

    public MoveAilment_getId_81269185510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("skaro.pokeapi.resource.moveailment.MoveAilment"));
        setField(term394, term394.getClass(), "id", null);
        setField(term394, term394.getClass(), "name", null);
        setField(term394, term394.getClass(), "moves", null);
        setField(term394, term394.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.moveailment.MoveAilment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term394, args);
    }

};


