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

public class AuthorDto_AuthorDtoBuilder_firstName_19114799452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3966;

    public AuthorDto_AuthorDtoBuilder_firstName_19114799452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3967 = new Long(-1154553077993834885L);
        term3966 = newInstance(Class.forName("example.dto.AuthorDto$AuthorDtoBuilder"));
        setField(term3966, term3966.getClass(), "id", term3967);
        setField(term3966, term3966.getClass(), "firstName", "VYkqXKVlAJ");
        setField(term3966, term3966.getClass(), "lastName", "XkIoWJRNwN");
        setField(term3966, term3966.getClass(), "email", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto$AuthorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHmNoYxIGj";
        callMethod(klass, "firstName", argTypes, term3966, args);
    }

};


