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

public class Stylesheets_getId_582399493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1541;

    public Stylesheets_getId_582399493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1541 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1556 = (byte[]) newByteArray(5);
        setLongField(term1541, term1541.getClass(), "id", -6100012593724108983L);
        setLongField(term1541, term1541.getClass(), "style_id", 5465527210299101732L);
        setField(term1541, term1541.getClass(), "format", "BndsHwAFMv");
        setByteElement(term1556, 0, (byte) -22);
        setByteElement(term1556, 1, (byte) 93);
        setByteElement(term1556, 2, (byte) 69);
        setByteElement(term1556, 3, (byte) -74);
        setByteElement(term1556, 4, (byte) -123);
        setField(term1541, term1541.getClass(), "stylesheet", term1556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1541, args);
    }

};


