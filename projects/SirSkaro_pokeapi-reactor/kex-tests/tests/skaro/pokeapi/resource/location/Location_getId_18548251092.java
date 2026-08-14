package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_getId_18548251092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125950;

    public Location_getId_18548251092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125950 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        setField(term125950, term125950.getClass(), "id", null);
        setField(term125950, term125950.getClass(), "name", null);
        setField(term125950, term125950.getClass(), "region", null);
        setField(term125950, term125950.getClass(), "names", null);
        setField(term125950, term125950.getClass(), "gameIndices", null);
        setField(term125950, term125950.getClass(), "areas", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term125950, args);
    }

};


