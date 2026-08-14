package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IconTable_getWidthColumnIndex_213100003122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3689;

    public IconTable_getWidthColumnIndex_213100003122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3689 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.IconTable"));
        setField(term3689, term3689.getClass(), "relationName", null);
        setField(term3689, term3689.getClass(), "dataType", null);
        setField(term3689, term3689.getClass(), "columns", null);
        setField(term3689, term3689.getClass(), "constraints", null);
        setField(term3689, term3689.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.IconTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidthColumnIndex", argTypes, term3689, args);
    }

};


