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
import java.lang.Integer;

public class UnicodeBOMInputStream_read_14203319096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385951;
     Object term385980;
     Object term385985;
     Object term385987;

    public UnicodeBOMInputStream_read_14203319096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385951 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term385952 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term385953 = (byte[]) newByteArray(7);
        Object term385962 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term385963 = (byte[]) newByteArray(3);
        setByteElement(term385953, 0, (byte) 122);
        setByteElement(term385953, 1, (byte) 84);
        setByteElement(term385953, 2, (byte) -36);
        setByteElement(term385953, 3, (byte) 103);
        setByteElement(term385953, 4, (byte) -63);
        setByteElement(term385953, 5, (byte) 39);
        setByteElement(term385953, 6, (byte) -54);
        setField(term385952, term385952.getClass(), "buf", term385953);
        setIntField(term385952, term385952.getClass(), "pos", 1830648570);
        setField(term385952, term385952.getClass(), "in", null);
        setField(term385951, term385951.getClass(), "in", term385952);
        setByteElement(term385963, 0, (byte) 9);
        setByteElement(term385963, 1, (byte) 19);
        setByteElement(term385963, 2, (byte) -103);
        setField(term385962, term385962.getClass(), "bytes", term385963);
        setField(term385962, term385962.getClass(), "description", "AijpHYOFuy");
        setField(term385951, term385951.getClass(), "bom", term385962);
        setBooleanField(term385951, term385951.getClass(), "skipped", false);
        term385980 = (byte[]) newByteArray(4);
        setByteElement(term385980, 0, (byte) 61);
        setByteElement(term385980, 1, (byte) -90);
        setByteElement(term385980, 2, (byte) -27);
        setByteElement(term385980, 3, (byte) 119);
        term385985 = new Integer(-227365013);
        term385987 = new Integer(11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term385980;
        args[1] = term385985;
        args[2] = term385987;
        callMethod(klass, "read", argTypes, term385951, args);
    }

};


