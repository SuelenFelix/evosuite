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

public class Stylesheets_setStyleid_75347759717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1858;
     Object term1861;

    public Stylesheets_setStyleid_75347759717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1858 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        setLongField(term1858, term1858.getClass(), "id", 0L);
        setLongField(term1858, term1858.getClass(), "style_id", 0L);
        setField(term1858, term1858.getClass(), "format", null);
        setField(term1858, term1858.getClass(), "stylesheet", null);
        term1861 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1861;
        callMethod(klass, "setStyle_id", argTypes, term1858, args);
    }

};


