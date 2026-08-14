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

public class CreatePreferenceVector_convert_9952053798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8367;
     Object term8384;

    public CreatePreferenceVector_convert_9952053798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8367 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8367, term8367.getClass(), "lastId", -1435639144971145612L);
        setField(term8367, term8367.getClass(), "preferenceIterator", null);
        setField(term8367, term8367.getClass(), "preferenceIds", null);
        setDoubleField(term8367, term8367.getClass(), "defaultPreferenceValue", 0.33871772875627537);
        setField(term8367, term8367.getClass(), "nextPreferenceName", "lHfTrWKMPk");
        setLongField(term8367, term8367.getClass(), "recordsProcessed", -921066654455496205L);
        setLongField(term8367, term8367.getClass(), "preferenceNamesFound", 7622401904339010124L);
        term8384 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term8386 = (byte[]) newByteArray(6);
        byte[] term8393 = (byte[]) newByteArray(9);
        Object term8404 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8384, term8384.getClass(), "written", 477625804);
        setByteElement(term8386, 0, (byte) 83);
        setByteElement(term8386, 1, (byte) 74);
        setByteElement(term8386, 2, (byte) -71);
        setByteElement(term8386, 3, (byte) 49);
        setByteElement(term8386, 4, (byte) -54);
        setByteElement(term8386, 5, (byte) 67);
        setField(term8384, term8384.getClass(), "bytearr", term8386);
        setByteElement(term8393, 0, (byte) 78);
        setByteElement(term8393, 1, (byte) 87);
        setByteElement(term8393, 2, (byte) 121);
        setByteElement(term8393, 3, (byte) -99);
        setByteElement(term8393, 4, (byte) -2);
        setByteElement(term8393, 5, (byte) -16);
        setByteElement(term8393, 6, (byte) -112);
        setByteElement(term8393, 7, (byte) -111);
        setByteElement(term8393, 8, (byte) 23);
        setField(term8384, term8384.getClass(), "writeBuffer", term8393);
        setField(term8384, term8384.getClass(), "out", null);
        setBooleanField(term8384, term8384.getClass(), "closed", true);
        setField(term8384, term8384.getClass(), "closeLock", term8404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        argTypes[1] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8384;
        callMethod(klass, "convert", argTypes, term8367, args);
    }

};


