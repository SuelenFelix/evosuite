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

public class Styles_setStyle_81903517317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1131;

    public Styles_setStyle_81903517317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1131 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Styles"));
        setLongField(term1131, term1131.getClass(), "id", 0L);
        setField(term1131, term1131.getClass(), "style", null);
        setField(term1131, term1131.getClass(), "description", null);
        setField(term1131, term1131.getClass(), "uri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Styles");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStyle", argTypes, term1131, args);
    }

};


