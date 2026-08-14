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
     Object term8314;
     Object term8331;

    public CreatePreferenceVector_write_15239164127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8314 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8314, term8314.getClass(), "lastId", -1855660992126411308L);
        setField(term8314, term8314.getClass(), "preferenceIterator", null);
        setField(term8314, term8314.getClass(), "preferenceIds", null);
        setDoubleField(term8314, term8314.getClass(), "defaultPreferenceValue", 0.5010337159337968);
        setField(term8314, term8314.getClass(), "nextPreferenceName", "AdxvLJhNLe");
        setLongField(term8314, term8314.getClass(), "recordsProcessed", -6435676296015352817L);
        setLongField(term8314, term8314.getClass(), "preferenceNamesFound", -3817606000638396608L);
        term8331 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term8333 = (byte[]) newByteArray(3);
        byte[] term8337 = (byte[]) newByteArray(7);
        Object term8346 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8331, term8331.getClass(), "written", -209654048);
        setByteElement(term8333, 0, (byte) 89);
        setByteElement(term8333, 1, (byte) 75);
        setByteElement(term8333, 2, (byte) 18);
        setField(term8331, term8331.getClass(), "bytearr", term8333);
        setByteElement(term8337, 0, (byte) -58);
        setByteElement(term8337, 1, (byte) -29);
        setByteElement(term8337, 2, (byte) -54);
        setByteElement(term8337, 3, (byte) -10);
        setByteElement(term8337, 4, (byte) 79);
        setByteElement(term8337, 5, (byte) -119);
        setByteElement(term8337, 6, (byte) -66);
        setField(term8331, term8331.getClass(), "writeBuffer", term8337);
        setField(term8331, term8331.getClass(), "out", null);
        setBooleanField(term8331, term8331.getClass(), "closed", true);
        setField(term8331, term8331.getClass(), "closeLock", term8346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term8331;
        callMethod(klass, "write", argTypes, term8314, args);
    }

};


