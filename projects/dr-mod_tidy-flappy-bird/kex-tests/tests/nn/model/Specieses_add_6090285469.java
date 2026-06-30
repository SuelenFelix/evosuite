package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Specieses_add_6090285469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3363;

    public Specieses_add_6090285469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3363 = newInstance(Class.forName("nn.model.Specieses"));
        setField(term3363, term3363.getClass(), "specieses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Specieses");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        argTypes[1] = Class.forName("nn.model.Species");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "add", argTypes, term3363, args);
    }

};


