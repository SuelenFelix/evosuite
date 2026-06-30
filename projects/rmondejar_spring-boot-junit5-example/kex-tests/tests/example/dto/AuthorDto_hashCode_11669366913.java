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

public class AuthorDto_hashCode_11669366913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3744;

    public AuthorDto_hashCode_11669366913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3745 = new Long(-4443169559037975007L);
        term3744 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3744, term3744.getClass(), "id", term3745);
        setField(term3744, term3744.getClass(), "firstName", "GgZWSjxjyE");
        setField(term3744, term3744.getClass(), "lastName", "EeBVbzjcCI");
        setField(term3744, term3744.getClass(), "email", "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3744, args);
    }

};


