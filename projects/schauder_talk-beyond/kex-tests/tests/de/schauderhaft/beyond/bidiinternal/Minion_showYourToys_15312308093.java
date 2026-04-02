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
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Minion_showYourToys_15312308093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;

    public Minion_showYourToys_15312308093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term308 = new Long(5127676408959197577L);
        HashMap term323 = new HashMap();
        Set<Object> term351 =  ((Map) term323).keySet();
        HashSet term322 = new HashSet((Collection<? extends Object>) term351);
        term307 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term307, term307.getClass(), "id", term308);
        setField(term307, term307.getClass(), "name", "LvtrsXUliU");
        setField(term307, term307.getClass(), "toys", term322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Minion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showYourToys", argTypes, term307, args);
    }

};


