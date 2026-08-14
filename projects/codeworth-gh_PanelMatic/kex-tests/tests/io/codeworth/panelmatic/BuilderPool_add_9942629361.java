package io.codeworth.panelmatic;

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
import static io.codeworth.panelmatic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class BuilderPool_add_9942629361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public BuilderPool_add_9942629361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term733 = new HashMap();
        Set<Object> term738 =  ((Map) term733).keySet();
        HashSet term732 = new HashSet((Collection<? extends Object>) term738);
        term731 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setField(term731, term731.getClass(), "builders", term732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.BuilderPool");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.PanelBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term731, args);
    }

};


