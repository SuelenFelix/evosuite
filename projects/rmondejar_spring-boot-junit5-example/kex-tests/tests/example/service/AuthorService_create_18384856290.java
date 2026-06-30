package example.service;

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
import static example.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AuthorService_create_18384856290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AuthorService_create_18384856290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "firstName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "lastName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "email", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.service.AuthorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.dto.AuthorDto");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "create", argTypes, null, args);
    }

};


