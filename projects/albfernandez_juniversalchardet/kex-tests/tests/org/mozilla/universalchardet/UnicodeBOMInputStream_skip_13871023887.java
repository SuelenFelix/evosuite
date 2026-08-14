package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UnicodeBOMInputStream_skip_13871023887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386013;
     Object term386039;

    public UnicodeBOMInputStream_skip_13871023887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386013 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term386014 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term386015 = (byte[]) newByteArray(2);
        Object term386019 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term386020 = (byte[]) newByteArray(5);
        setByteElement(term386015, 0, (byte) -125);
        setByteElement(term386015, 1, (byte) 100);
        setField(term386014, term386014.getClass(), "buf", term386015);
        setIntField(term386014, term386014.getClass(), "pos", 1953277050);
        setField(term386014, term386014.getClass(), "in", null);
        setField(term386013, term386013.getClass(), "in", term386014);
        setByteElement(term386020, 0, (byte) -1);
        setByteElement(term386020, 1, (byte) -127);
        setByteElement(term386020, 2, (byte) -118);
        setByteElement(term386020, 3, (byte) 69);
        setByteElement(term386020, 4, (byte) 112);
        setField(term386019, term386019.getClass(), "bytes", term386020);
        setField(term386019, term386019.getClass(), "description", "SbAoxhfrkn");
        setField(term386013, term386013.getClass(), "bom", term386019);
        setBooleanField(term386013, term386013.getClass(), "skipped", false);
        term386039 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term386039;
        callMethod(klass, "skip", argTypes, term386013, args);
    }

};


