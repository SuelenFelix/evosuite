package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SunRepository_restoreSun_9752648822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15397;
     Object term15398;

    public SunRepository_restoreSun_9752648822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15397 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.SunRepository"));
        term15398 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term15399 = (byte[]) newByteArray(6);
        char[] term15406 = (char[]) newCharArray(5);
        byte[] term15412 = (byte[]) newByteArray(9);
        char[] term15422 = (char[]) newCharArray(3);
        setByteElement(term15399, 0, (byte) 83);
        setByteElement(term15399, 1, (byte) -123);
        setByteElement(term15399, 2, (byte) -76);
        setByteElement(term15399, 3, (byte) -115);
        setByteElement(term15399, 4, (byte) -48);
        setByteElement(term15399, 5, (byte) 126);
        setField(term15398, term15398.getClass(), "bytearr", term15399);
        setCharElement(term15406, 0, 'Y');
        setCharElement(term15406, 1, 'I');
        setCharElement(term15406, 2, 'r');
        setCharElement(term15406, 3, 'c');
        setCharElement(term15406, 4, 'R');
        setField(term15398, term15398.getClass(), "chararr", term15406);
        setByteElement(term15412, 0, (byte) -2);
        setByteElement(term15412, 1, (byte) 103);
        setByteElement(term15412, 2, (byte) 23);
        setByteElement(term15412, 3, (byte) 96);
        setByteElement(term15412, 4, (byte) -70);
        setByteElement(term15412, 5, (byte) -73);
        setByteElement(term15412, 6, (byte) 1);
        setByteElement(term15412, 7, (byte) 99);
        setByteElement(term15412, 8, (byte) -121);
        setField(term15398, term15398.getClass(), "readBuffer", term15412);
        setCharElement(term15422, 0, 'M');
        setCharElement(term15422, 1, 'F');
        setCharElement(term15422, 2, 'I');
        setField(term15398, term15398.getClass(), "lineBuffer", term15422);
        setField(term15398, term15398.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.SunRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term15398;
        callMethod(klass, "restoreSun", argTypes, term15397, args);
    }

};


