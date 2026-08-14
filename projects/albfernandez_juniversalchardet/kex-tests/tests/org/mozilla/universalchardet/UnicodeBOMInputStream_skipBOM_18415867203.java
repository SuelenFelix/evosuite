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

public class UnicodeBOMInputStream_skipBOM_18415867203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385779;

    public UnicodeBOMInputStream_skipBOM_18415867203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385779 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term385780 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term385781 = (byte[]) newByteArray(6);
        Object term385789 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term385790 = (byte[]) newByteArray(2);
        setByteElement(term385781, 0, (byte) 83);
        setByteElement(term385781, 1, (byte) -123);
        setByteElement(term385781, 2, (byte) -76);
        setByteElement(term385781, 3, (byte) -115);
        setByteElement(term385781, 4, (byte) -48);
        setByteElement(term385781, 5, (byte) 126);
        setField(term385780, term385780.getClass(), "buf", term385781);
        setIntField(term385780, term385780.getClass(), "pos", -1498296052);
        setField(term385780, term385780.getClass(), "in", null);
        setField(term385779, term385779.getClass(), "in", term385780);
        setByteElement(term385790, 0, (byte) -2);
        setByteElement(term385790, 1, (byte) 103);
        setField(term385789, term385789.getClass(), "bytes", term385790);
        setField(term385789, term385789.getClass(), "description", "TEParAifyi");
        setField(term385779, term385779.getClass(), "bom", term385789);
        setBooleanField(term385779, term385779.getClass(), "skipped", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipBOM", argTypes, term385779, args);
    }

};


