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
     Object term7971;
     Object term7988;

    public CreatePreferenceVector_convert_9952053798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7971 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7971, term7971.getClass(), "lastId", -1435639144971145612L);
        setField(term7971, term7971.getClass(), "preferenceIterator", null);
        setField(term7971, term7971.getClass(), "preferenceIds", null);
        setDoubleField(term7971, term7971.getClass(), "defaultPreferenceValue", 0.33871772875627537);
        setField(term7971, term7971.getClass(), "nextPreferenceName", "sEnIVFtZuQ");
        setLongField(term7971, term7971.getClass(), "recordsProcessed", -921066654455496205L);
        setLongField(term7971, term7971.getClass(), "preferenceNamesFound", 7622401904339010124L);
        term7988 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term7990 = (byte[]) newByteArray(6);
        byte[] term7997 = (byte[]) newByteArray(9);
        Object term8008 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term7988, term7988.getClass(), "written", 477625804);
        setByteElement(term7990, 0, (byte) 83);
        setByteElement(term7990, 1, (byte) 74);
        setByteElement(term7990, 2, (byte) -71);
        setByteElement(term7990, 3, (byte) 49);
        setByteElement(term7990, 4, (byte) -54);
        setByteElement(term7990, 5, (byte) 67);
        setField(term7988, term7988.getClass(), "bytearr", term7990);
        setByteElement(term7997, 0, (byte) 78);
        setByteElement(term7997, 1, (byte) 87);
        setByteElement(term7997, 2, (byte) 121);
        setByteElement(term7997, 3, (byte) -99);
        setByteElement(term7997, 4, (byte) -2);
        setByteElement(term7997, 5, (byte) -16);
        setByteElement(term7997, 6, (byte) -112);
        setByteElement(term7997, 7, (byte) -111);
        setByteElement(term7997, 8, (byte) 23);
        setField(term7988, term7988.getClass(), "writeBuffer", term7997);
        setField(term7988, term7988.getClass(), "out", null);
        setBooleanField(term7988, term7988.getClass(), "closed", true);
        setField(term7988, term7988.getClass(), "closeLock", term8008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        argTypes[1] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7988;
        callMethod(klass, "convert", argTypes, term7971, args);
    }

};


