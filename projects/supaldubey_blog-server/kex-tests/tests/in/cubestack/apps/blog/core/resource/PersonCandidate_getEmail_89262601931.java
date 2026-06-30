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

public class PersonCandidate_getEmail_89262601931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9547;

    public PersonCandidate_getEmail_89262601931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9547 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        setLongField(term9547, term9547.getClass(), "id", 0L);
        setField(term9547, term9547.getClass(), "firstName", null);
        setField(term9547, term9547.getClass(), "lastName", null);
        setField(term9547, term9547.getClass(), "email", null);
        setField(term9547, term9547.getClass(), "username", null);
        setField(term9547, term9547.getClass(), "password", null);
        setField(term9547, term9547.getClass(), "phone", null);
        setField(term9547, term9547.getClass(), "status", null);
        setField(term9547, term9547.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term9547, args);
    }

};


