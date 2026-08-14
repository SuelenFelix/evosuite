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

public class Stylesheets_setStyleid_7534775976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645;
     Object term1664;

    public Stylesheets_setStyleid_7534775976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1645 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1660 = (byte[]) newByteArray(3);
        setLongField(term1645, term1645.getClass(), "id", -4030863184426321096L);
        setLongField(term1645, term1645.getClass(), "style_id", -8010214112439224349L);
        setField(term1645, term1645.getClass(), "format", "LvtrsXUliU");
        setByteElement(term1660, 0, (byte) 61);
        setByteElement(term1660, 1, (byte) -92);
        setByteElement(term1660, 2, (byte) -42);
        setField(term1645, term1645.getClass(), "stylesheet", term1660);
        term1664 = new Long(-6673920710396545553L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1664;
        callMethod(klass, "setStyle_id", argTypes, term1645, args);
    }

};


