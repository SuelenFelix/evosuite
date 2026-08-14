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

public class SymbolContent_getContent_4285195737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;

    public SymbolContent_getContent_4285195737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1361 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1375 = (byte[]) newByteArray(2);
        setLongField(term1361, term1361.getClass(), "id", 3427570961451840069L);
        setField(term1361, term1361.getClass(), "format", "wSQxaModmm");
        setByteElement(term1375, 0, (byte) -16);
        setByteElement(term1375, 1, (byte) -112);
        setField(term1361, term1361.getClass(), "content", term1375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term1361, args);
    }

};


