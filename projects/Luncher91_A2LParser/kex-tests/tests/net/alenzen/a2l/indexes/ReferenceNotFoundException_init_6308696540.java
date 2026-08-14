package net.alenzen.a2l.indexes;

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
import static net.alenzen.a2l.indexes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class ReferenceNotFoundException_init_6308696540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;

    public ReferenceNotFoundException_init_6308696540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1259 = new LinkedList();
        ((LinkedList) term1259).add("tShwQLRGNe");
        ((LinkedList) term1259).add("LvtrsXUliU");
        ((LinkedList) term1259).add("");
        ((LinkedList) term1259).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceNotFoundException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "GzFkzHGYFt";
        args[1] = null;
        args[2] = term1259;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


