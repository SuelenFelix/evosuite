package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatePreferenceVector_write_15239164127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7918;
     Object term7935;

    public CreatePreferenceVector_write_15239164127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7918 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7918, term7918.getClass(), "lastId", -1855660992126411308L);
        setField(term7918, term7918.getClass(), "preferenceIterator", null);
        setField(term7918, term7918.getClass(), "preferenceIds", null);
        setDoubleField(term7918, term7918.getClass(), "defaultPreferenceValue", 0.5010337159337968);
        setField(term7918, term7918.getClass(), "nextPreferenceName", "xBsXSDjXYK");
        setLongField(term7918, term7918.getClass(), "recordsProcessed", -6435676296015352817L);
        setLongField(term7918, term7918.getClass(), "preferenceNamesFound", -3817606000638396608L);
        term7935 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term7937 = (byte[]) newByteArray(3);
        byte[] term7941 = (byte[]) newByteArray(7);
        Object term7950 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term7935, term7935.getClass(), "written", -209654048);
        setByteElement(term7937, 0, (byte) 89);
        setByteElement(term7937, 1, (byte) 75);
        setByteElement(term7937, 2, (byte) 18);
        setField(term7935, term7935.getClass(), "bytearr", term7937);
        setByteElement(term7941, 0, (byte) -58);
        setByteElement(term7941, 1, (byte) -29);
        setByteElement(term7941, 2, (byte) -54);
        setByteElement(term7941, 3, (byte) -10);
        setByteElement(term7941, 4, (byte) 79);
        setByteElement(term7941, 5, (byte) -119);
        setByteElement(term7941, 6, (byte) -66);
        setField(term7935, term7935.getClass(), "writeBuffer", term7941);
        setField(term7935, term7935.getClass(), "out", null);
        setBooleanField(term7935, term7935.getClass(), "closed", true);
        setField(term7935, term7935.getClass(), "closeLock", term7950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term7935;
        callMethod(klass, "write", argTypes, term7918, args);
    }

};


