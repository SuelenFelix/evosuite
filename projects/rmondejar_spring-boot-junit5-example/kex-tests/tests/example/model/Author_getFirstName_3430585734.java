package example.model;

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
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Author_getFirstName_3430585734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;

    public Author_getFirstName_3430585734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1238 = new Long(-1677189124507026637L);
        ArrayList term1276 = new ArrayList();
        term1237 = newInstance(Class.forName("example.model.Author"));
        setField(term1237, term1237.getClass(), "id", term1238);
        setField(term1237, term1237.getClass(), "firstName", "coJPjrBZNe");
        setField(term1237, term1237.getClass(), "lastName", "vMsWjuPTnO");
        setField(term1237, term1237.getClass(), "email", "zHvfKaOstO");
        setField(term1237, term1237.getClass(), "books", term1276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term1237, args);
    }

};


