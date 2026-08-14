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
import java.lang.Long;

public class SymbolContent_setId_19764763394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1240;
     Object term1259;

    public SymbolContent_setId_19764763394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1240 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent"));
        byte[] term1254 = (byte[]) newByteArray(4);
        setLongField(term1240, term1240.getClass(), "id", -8471550651709805183L);
        setField(term1240, term1240.getClass(), "format", "xrwlQZdwCp");
        setByteElement(term1254, 0, (byte) 83);
        setByteElement(term1254, 1, (byte) 74);
        setByteElement(term1254, 2, (byte) -71);
        setByteElement(term1254, 3, (byte) 49);
        setField(term1240, term1240.getClass(), "content", term1254);
        term1259 = new Long(-948292411727204525L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1259;
        callMethod(klass, "setId", argTypes, term1240, args);
    }

};


