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

public class Author_setFirstName_1803011339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;

    public Author_setFirstName_1803011339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1828 = new Long(1860789353508856614L);
        ArrayList term1866 = new ArrayList();
        term1827 = newInstance(Class.forName("example.model.Author"));
        setField(term1827, term1827.getClass(), "id", term1828);
        setField(term1827, term1827.getClass(), "firstName", "FlxVmiMYKP");
        setField(term1827, term1827.getClass(), "lastName", "fgOpAWlGYN");
        setField(term1827, term1827.getClass(), "email", "PNzNzzjSXM");
        setField(term1827, term1827.getClass(), "books", term1866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ktKcSZiuGM";
        callMethod(klass, "setFirstName", argTypes, term1827, args);
    }

};


