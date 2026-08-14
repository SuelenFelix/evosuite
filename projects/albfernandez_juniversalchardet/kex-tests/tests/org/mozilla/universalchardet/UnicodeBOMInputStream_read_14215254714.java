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

public class UnicodeBOMInputStream_read_14215254714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385824;

    public UnicodeBOMInputStream_read_14215254714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385824 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream"));
        Object term385825 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term385826 = (byte[]) newByteArray(8);
        Object term385836 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term385837 = (byte[]) newByteArray(3);
        setByteElement(term385826, 0, (byte) 23);
        setByteElement(term385826, 1, (byte) 96);
        setByteElement(term385826, 2, (byte) -70);
        setByteElement(term385826, 3, (byte) -73);
        setByteElement(term385826, 4, (byte) 1);
        setByteElement(term385826, 5, (byte) 99);
        setByteElement(term385826, 6, (byte) -121);
        setByteElement(term385826, 7, (byte) -50);
        setField(term385825, term385825.getClass(), "buf", term385826);
        setIntField(term385825, term385825.getClass(), "pos", 2098647989);
        setField(term385825, term385825.getClass(), "in", null);
        setField(term385824, term385824.getClass(), "in", term385825);
        setByteElement(term385837, 0, (byte) -79);
        setByteElement(term385837, 1, (byte) 110);
        setByteElement(term385837, 2, (byte) -111);
        setField(term385836, term385836.getClass(), "bytes", term385837);
        setField(term385836, term385836.getClass(), "description", "OWDIEULEFu");
        setField(term385824, term385824.getClass(), "bom", term385836);
        setBooleanField(term385824, term385824.getClass(), "skipped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term385824, args);
    }

};


