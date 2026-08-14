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

public class SymbolContent_resetId_20152795502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1176;

    public SymbolContent_resetId_20152795502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1176 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1190 = (byte[]) newByteArray(4);
        setLongField(term1176, term1176.getClass(), "id", -8121849829073967555L);
        setField(term1176, term1176.getClass(), "format", "kuTXqwMtDB");
        setByteElement(term1190, 0, (byte) -58);
        setByteElement(term1190, 1, (byte) -29);
        setByteElement(term1190, 2, (byte) -54);
        setByteElement(term1190, 3, (byte) -10);
        setField(term1176, term1176.getClass(), "content", term1190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term1176, args);
    }

};


