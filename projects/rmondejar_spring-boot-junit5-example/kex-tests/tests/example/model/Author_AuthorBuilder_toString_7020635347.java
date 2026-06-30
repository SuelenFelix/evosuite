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

public class Author_AuthorBuilder_toString_7020635347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785;

    public Author_AuthorBuilder_toString_7020635347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term786 = new Long(-5216789073301458893L);
        ArrayList term824 = new ArrayList();
        term785 = newInstance(Class.forName("example.model.Author$AuthorBuilder"));
        setField(term785, term785.getClass(), "id", term786);
        setField(term785, term785.getClass(), "firstName", "vLerpqavFM");
        setField(term785, term785.getClass(), "lastName", "qnvxzwuGKX");
        setField(term785, term785.getClass(), "email", "EdPAvpluZg");
        setField(term785, term785.getClass(), "books", term824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author$AuthorBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term785, args);
    }

};


