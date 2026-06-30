package com.folksdev.movie.dto;

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
import static com.folksdev.movie.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CreateFolksdevRequest_copy_9286470899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;
     Object term675;

    public CreateFolksdevRequest_copy_9286470899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = newInstance(Class.forName("com.folksdev.movie.dto.CreateFolksdevRequest"));
        setField(term613, term613.getClass(), "id", "OclPbYPkcH");
        setField(term613, term613.getClass(), "name", "IoAlmYsBwc");
        setIntField(term613, term613.getClass(), "age", -1339778481);
        setField(term613, term613.getClass(), "email", "TEParAifyi");
        term675 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.CreateFolksdevRequest");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "OWDIEULEFu";
        args[1] = "dWRymuLBtr";
        args[2] = term675;
        args[3] = "AijpHYOFuy";
        callMethod(klass, "copy", argTypes, term613, args);
    }

};


