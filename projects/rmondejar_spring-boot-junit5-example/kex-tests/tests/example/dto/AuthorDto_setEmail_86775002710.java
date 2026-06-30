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

public class AuthorDto_setEmail_86775002710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3513;

    public AuthorDto_setEmail_86775002710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3514 = new Long(-7612550318181586304L);
        term3513 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3513, term3513.getClass(), "id", term3514);
        setField(term3513, term3513.getClass(), "firstName", "gCWtLVKVVe");
        setField(term3513, term3513.getClass(), "lastName", "fWKJoSoCwE");
        setField(term3513, term3513.getClass(), "email", "wfaXBpWAUH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VMeAzAHwZj";
        callMethod(klass, "setEmail", argTypes, term3513, args);
    }

};


