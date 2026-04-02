package in.cubestack.apps.blog.core.resource;

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
import static in.cubestack.apps.blog.core.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PersonCandidate_from_149391829924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9534;

    public PersonCandidate_from_149391829924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9534 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        setLongField(term9534, term9534.getClass(), "id", 0L);
        setField(term9534, term9534.getClass(), "firstName", null);
        setField(term9534, term9534.getClass(), "lastName", null);
        setField(term9534, term9534.getClass(), "email", null);
        setField(term9534, term9534.getClass(), "username", null);
        setField(term9534, term9534.getClass(), "password", null);
        setField(term9534, term9534.getClass(), "phone", null);
        setField(term9534, term9534.getClass(), "status", null);
        setField(term9534, term9534.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "from", argTypes, term9534, args);
    }

};


