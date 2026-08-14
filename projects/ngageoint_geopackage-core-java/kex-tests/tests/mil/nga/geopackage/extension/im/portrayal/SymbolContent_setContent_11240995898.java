package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SymbolContent_setContent_11240995898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1390;
     Object term1411;

    public SymbolContent_setContent_11240995898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1390 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1404 = (byte[]) newByteArray(6);
        setLongField(term1390, term1390.getClass(), "id", 4502292577098212311L);
        setField(term1390, term1390.getClass(), "format", "UlajhuVLaP");
        setByteElement(term1404, 0, (byte) -111);
        setByteElement(term1404, 1, (byte) 23);
        setByteElement(term1404, 2, (byte) -15);
        setByteElement(term1404, 3, (byte) 36);
        setByteElement(term1404, 4, (byte) 118);
        setByteElement(term1404, 5, (byte) 106);
        setField(term1390, term1390.getClass(), "content", term1404);
        term1411 = (byte[]) newByteArray(7);
        setByteElement(term1411, 0, (byte) 98);
        setByteElement(term1411, 1, (byte) 67);
        setByteElement(term1411, 2, (byte) 66);
        setByteElement(term1411, 3, (byte) -121);
        setByteElement(term1411, 4, (byte) -119);
        setByteElement(term1411, 5, (byte) 71);
        setByteElement(term1411, 6, (byte) 80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1411;
        callMethod(klass, "setContent", argTypes, term1390, args);
    }

};


