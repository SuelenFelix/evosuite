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

public class Author_canEqual_73472489215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2598;
     Object term2641;

    public Author_canEqual_73472489215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2599 = new Long(-1497280900081695731L);
        ArrayList term2637 = new ArrayList();
        term2598 = newInstance(Class.forName("example.model.Author"));
        setField(term2598, term2598.getClass(), "id", term2599);
        setField(term2598, term2598.getClass(), "firstName", "MXLsVQWrwc");
        setField(term2598, term2598.getClass(), "lastName", "lRaSlqzqNY");
        setField(term2598, term2598.getClass(), "email", "TiEyxWXsra");
        setField(term2598, term2598.getClass(), "books", term2637);
        term2641 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2641;
        callMethod(klass, "canEqual", argTypes, term2598, args);
    }

};


