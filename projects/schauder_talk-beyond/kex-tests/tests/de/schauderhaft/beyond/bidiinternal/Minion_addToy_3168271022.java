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

public class Minion_addToy_3168271022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;
     Object term240;

    public Minion_addToy_3168271022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215 = new Long(7411271909051562686L);
        HashMap term230 = new HashMap();
        Set<Object> term285 =  ((Map) term230).keySet();
        HashSet term229 = new HashSet((Collection<? extends Object>) term285);
        term214 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term214, term214.getClass(), "id", term215);
        setField(term214, term214.getClass(), "name", "HyxfbSQYBe");
        setField(term214, term214.getClass(), "toys", term229);
        Long term254 = new Long(-2813493605142626659L);
        HashMap term269 = new HashMap();
        Set<Object> term306 =  ((Map) term269).keySet();
        HashSet term268 = new HashSet((Collection<? extends Object>) term306);
        term240 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Toy"));
        Object term253 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term240, term240.getClass(), "name", "SbAoxhfrkn");
        setField(term253, term253.getClass(), "id", term254);
        setField(term253, term253.getClass(), "name", "kuTXqwMtDB");
        setField(term253, term253.getClass(), "toys", term268);
        setField(term240, term240.getClass(), "minion", term253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Minion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.schauderhaft.beyond.bidiinternal.Toy");
        Object[] args = new Object[1];
        args[0] = term240;
        callMethod(klass, "addToy", argTypes, term214, args);
    }

};


