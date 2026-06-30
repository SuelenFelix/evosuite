package de.schauderhaft.beyond.bidiinternal;

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
import static de.schauderhaft.beyond.bidiinternal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Toy_sayHello_2306797991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public Toy_sayHello_2306797991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149 = new Long(2442117782898005296L);
        HashMap term164 = new HashMap();
        Set<Object> term190 =  ((Map) term164).keySet();
        HashSet term163 = new HashSet((Collection<? extends Object>) term190);
        term135 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Toy"));
        Object term148 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term135, term135.getClass(), "name", "SzjVpOQTyS");
        setField(term148, term148.getClass(), "id", term149);
        setField(term148, term148.getClass(), "name", "MjGYSRKTNF");
        setField(term148, term148.getClass(), "toys", term163);
        setField(term135, term135.getClass(), "minion", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Toy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sayHello", argTypes, term135, args);
    }

};


