package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ClearSet_setExcellent_11377014627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501465;
     Object term1501470;

    public ClearSet_setExcellent_11377014627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501465 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term1501465, term1501465.getClass(), "clear", 0);
        setIntField(term1501465, term1501465.getClass(), "great", 0);
        setIntField(term1501465, term1501465.getClass(), "excellent", 0);
        setIntField(term1501465, term1501465.getClass(), "perfect", 0);
        term1501470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1501470;
        callMethod(klass, "setExcellent", argTypes, term1501465, args);
    }

};


