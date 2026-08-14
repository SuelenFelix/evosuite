package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EncounterVersionDetails_getRate_15910636436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;

    public EncounterVersionDetails_getRate_15910636436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term972 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        setField(term972, term972.getClass(), "rate", null);
        setField(term972, term972.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term972, args);
    }

};


