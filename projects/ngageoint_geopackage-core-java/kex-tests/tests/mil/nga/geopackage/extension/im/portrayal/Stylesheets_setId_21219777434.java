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

public class Stylesheets_setId_21219777434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;
     Object term1598;

    public Stylesheets_setId_21219777434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1592 = (byte[]) newByteArray(5);
        setLongField(term1577, term1577.getClass(), "id", 4699157009689333952L);
        setLongField(term1577, term1577.getClass(), "style_id", -78240609295693193L);
        setField(term1577, term1577.getClass(), "format", "GzFkzHGYFt");
        setByteElement(term1592, 0, (byte) -23);
        setByteElement(term1592, 1, (byte) 100);
        setByteElement(term1592, 2, (byte) 106);
        setByteElement(term1592, 3, (byte) -57);
        setByteElement(term1592, 4, (byte) -103);
        setField(term1577, term1577.getClass(), "stylesheet", term1592);
        term1598 = new Long(3090901538358721367L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1598;
        callMethod(klass, "setId", argTypes, term1577, args);
    }

};


