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

public class SymbolContent_setFormat_19920016866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;

    public SymbolContent_setFormat_19920016866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1316 = (byte[]) newByteArray(6);
        setLongField(term1302, term1302.getClass(), "id", 4616440478358528406L);
        setField(term1302, term1302.getClass(), "format", "nyiiPDVjAc");
        setByteElement(term1316, 0, (byte) 67);
        setByteElement(term1316, 1, (byte) 78);
        setByteElement(term1316, 2, (byte) 87);
        setByteElement(term1316, 3, (byte) 121);
        setByteElement(term1316, 4, (byte) -99);
        setByteElement(term1316, 5, (byte) -2);
        setField(term1302, term1302.getClass(), "content", term1316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setFormat", argTypes, term1302, args);
    }

};


