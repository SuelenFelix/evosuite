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

public class SymbolImages_init_150689975720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term188;
     Object term190;
     Object term192;
     Object term194;
     Object term196;
     Object term198;
     Object term200;

    public SymbolImages_init_150689975720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186 = new Long(0L);
        term188 = new Long(0L);
        term190 = new Long(0L);
        term192 = new Long(0L);
        term194 = new Long(0L);
        term196 = new Long(0L);
        term198 = new Long(0L);
        term200 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        argTypes[5] = long.class;
        argTypes[6] = long.class;
        argTypes[7] = long.class;
        Object[] args = new Object[8];
        args[0] = term186;
        args[1] = term188;
        args[2] = term190;
        args[3] = term192;
        args[4] = term194;
        args[5] = term196;
        args[6] = term198;
        args[7] = term200;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


