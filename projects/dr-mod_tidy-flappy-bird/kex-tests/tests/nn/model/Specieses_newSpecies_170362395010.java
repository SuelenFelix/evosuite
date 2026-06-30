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

public class Specieses_newSpecies_170362395010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3364;

    public Specieses_newSpecies_170362395010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3364 = newInstance(Class.forName("nn.model.Specieses"));
        setField(term3364, term3364.getClass(), "specieses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Specieses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newSpecies", argTypes, term3364, args);
    }

};


