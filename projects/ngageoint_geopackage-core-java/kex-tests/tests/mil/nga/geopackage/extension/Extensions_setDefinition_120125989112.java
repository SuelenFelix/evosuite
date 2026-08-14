package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Extensions_setDefinition_120125989112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16093;

    public Extensions_setDefinition_120125989112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16093 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term16093, term16093.getClass(), "tableName", "SPtPatHeOm");
        setField(term16093, term16093.getClass(), "columnName", "ywmcuThdfL");
        setField(term16093, term16093.getClass(), "extensionName", "GBOEuByOfr");
        setField(term16093, term16093.getClass(), "definition", "NHbOFFjyVK");
        setField(term16093, term16093.getClass(), "scope", "zaloBqlrSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vvoLrMGCoN";
        callMethod(klass, "setDefinition", argTypes, term16093, args);
    }

};


