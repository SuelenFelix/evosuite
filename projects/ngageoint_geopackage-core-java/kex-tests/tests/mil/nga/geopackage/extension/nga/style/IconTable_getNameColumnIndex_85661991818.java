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

public class IconTable_getNameColumnIndex_85661991818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3685;

    public IconTable_getNameColumnIndex_85661991818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3685 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.IconTable"));
        setField(term3685, term3685.getClass(), "relationName", null);
        setField(term3685, term3685.getClass(), "dataType", null);
        setField(term3685, term3685.getClass(), "columns", null);
        setField(term3685, term3685.getClass(), "constraints", null);
        setField(term3685, term3685.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.IconTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameColumnIndex", argTypes, term3685, args);
    }

};


