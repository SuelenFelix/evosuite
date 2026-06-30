package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Castle_getId_10426618107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8334;

    public Castle_getId_10426618107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8335 = new Long(3133860696238261492L);
        HashMap term8376 = new HashMap();
        Set<Object> term8411 =  ((Map) term8376).keySet();
        HashSet term8375 = new HashSet((Collection<? extends Object>) term8411);
        term8334 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8334, term8334.getClass(), "id", term8335);
        setField(term8334, term8334.getClass(), "name", "GgZWSjxjyE");
        setField(term8334, term8334.getClass(), "city", "EeBVbzjcCI");
        setField(term8334, term8334.getClass(), "state", "UfQtPRyWRC");
        setDoubleField(term8334, term8334.getClass(), "latitude", 0.6588948704887806);
        setDoubleField(term8334, term8334.getClass(), "longitude", 0.6397214730945112);
        setField(term8334, term8334.getClass(), "knights", term8375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8334, args);
    }

};


