package example.dto;

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
import static example.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AuthorDto_equals_33199300611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3604;
     Object term3643;

    public AuthorDto_equals_33199300611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3605 = new Long(-2170847986967241072L);
        term3604 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3604, term3604.getClass(), "id", term3605);
        setField(term3604, term3604.getClass(), "firstName", "PznxWXsZME");
        setField(term3604, term3604.getClass(), "lastName", "ZzIujlwVsw");
        setField(term3604, term3604.getClass(), "email", "LWyEaeIyAo");
        term3643 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3643;
        callMethod(klass, "equals", argTypes, term3604, args);
    }

};


