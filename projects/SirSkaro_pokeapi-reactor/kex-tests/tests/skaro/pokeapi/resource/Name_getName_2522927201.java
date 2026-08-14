package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Name_getName_2522927201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4422;

    public Name_getName_2522927201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4422 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4435 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4422, term4422.getClass(), "name", "stVcZLTNpu");
        setField(term4435, term4435.getClass(), "name", "LgXdqWrsLL");
        setField(term4435, term4435.getClass(), "url", "bbHWyibNmy");
        setField(term4422, term4422.getClass(), "language", term4435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Name");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4422, args);
    }

};


