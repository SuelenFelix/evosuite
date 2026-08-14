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

public class UnicodeBOMInputStream_getBOM_19165236112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385726;

    public UnicodeBOMInputStream_getBOM_19165236112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385726 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term385727 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term385728 = (byte[]) newByteArray(4);
        Object term385734 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term385735 = (byte[]) newByteArray(8);
        setByteElement(term385728, 0, (byte) 117);
        setByteElement(term385728, 1, (byte) 43);
        setByteElement(term385728, 2, (byte) -27);
        setByteElement(term385728, 3, (byte) 34);
        setField(term385727, term385727.getClass(), "buf", term385728);
        setIntField(term385727, term385727.getClass(), "pos", -1388471422);
        setField(term385727, term385727.getClass(), "in", null);
        setField(term385726, term385726.getClass(), "in", term385727);
        setByteElement(term385735, 0, (byte) -126);
        setByteElement(term385735, 1, (byte) 12);
        setByteElement(term385735, 2, (byte) -75);
        setByteElement(term385735, 3, (byte) 69);
        setByteElement(term385735, 4, (byte) -6);
        setByteElement(term385735, 5, (byte) 107);
        setByteElement(term385735, 6, (byte) -109);
        setByteElement(term385735, 7, (byte) 122);
        setField(term385734, term385734.getClass(), "bytes", term385735);
        setField(term385734, term385734.getClass(), "description", "IoAlmYsBwc");
        setField(term385726, term385726.getClass(), "bom", term385734);
        setBooleanField(term385726, term385726.getClass(), "skipped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBOM", argTypes, term385726, args);
    }

};


