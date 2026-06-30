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
import java.lang.Long;

public class PersonCandidate_setId_127021767526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9535;
     Object term9537;

    public PersonCandidate_setId_127021767526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9535 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        setLongField(term9535, term9535.getClass(), "id", 0L);
        setField(term9535, term9535.getClass(), "firstName", null);
        setField(term9535, term9535.getClass(), "lastName", null);
        setField(term9535, term9535.getClass(), "email", null);
        setField(term9535, term9535.getClass(), "username", null);
        setField(term9535, term9535.getClass(), "password", null);
        setField(term9535, term9535.getClass(), "phone", null);
        setField(term9535, term9535.getClass(), "status", null);
        setField(term9535, term9535.getClass(), "roles", null);
        term9537 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9537;
        callMethod(klass, "setId", argTypes, term9535, args);
    }

};


