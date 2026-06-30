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

public class AuthorDto_getEmail_12914184436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3191;

    public AuthorDto_getEmail_12914184436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3192 = new Long(4178434741742309755L);
        term3191 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3191, term3191.getClass(), "id", term3192);
        setField(term3191, term3191.getClass(), "firstName", "dpNsDgfPso");
        setField(term3191, term3191.getClass(), "lastName", "hCWPJQKpdc");
        setField(term3191, term3191.getClass(), "email", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3191, args);
    }

};


