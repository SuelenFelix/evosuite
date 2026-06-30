package in.cubestack.apps.blog.util;

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
import static in.cubestack.apps.blog.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EncryptionHelper_getHash_2275865041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12522;
     Object term12532;

    public EncryptionHelper_getHash_2275865041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12522 = (char[]) newCharArray(9);
        setCharElement(term12522, 0, 'P');
        setCharElement(term12522, 1, 'A');
        setCharElement(term12522, 2, 'E');
        setCharElement(term12522, 3, 'B');
        setCharElement(term12522, 4, 't');
        setCharElement(term12522, 5, 'n');
        setCharElement(term12522, 6, 'Z');
        setCharElement(term12522, 7, 't');
        setCharElement(term12522, 8, 'T');
        term12532 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.EncryptionHelper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term12522;
        args[1] = term12532;
        callMethod(klass, "getHash", argTypes, null, args);
    }

};


