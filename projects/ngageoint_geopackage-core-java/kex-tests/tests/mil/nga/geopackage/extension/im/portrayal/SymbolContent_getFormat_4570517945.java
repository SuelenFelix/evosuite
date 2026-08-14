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

public class SymbolContent_getFormat_4570517945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275;

    public SymbolContent_getFormat_4570517945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1275 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1289 = (byte[]) newByteArray(1);
        setLongField(term1275, term1275.getClass(), "id", -8892586408602479513L);
        setField(term1275, term1275.getClass(), "format", "IDCWpPLRkE");
        setByteElement(term1289, 0, (byte) -54);
        setField(term1275, term1275.getClass(), "content", term1289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term1275, args);
    }

};


