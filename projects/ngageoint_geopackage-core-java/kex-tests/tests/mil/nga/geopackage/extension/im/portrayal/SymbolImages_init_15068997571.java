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

public class SymbolImages_init_15068997571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;
     Object term7;
     Object term9;
     Object term11;
     Object term13;
     Object term15;

    public SymbolImages_init_15068997571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term3 = new Long(6375119433582206027L);
        term5 = new Long(-8257434502486459194L);
        term7 = new Long(-8400487765614892086L);
        term9 = new Long(5270370404989704783L);
        term11 = new Long(7411271909051562686L);
        term13 = new Long(4872422362414183754L);
        term15 = new Long(6811161968424632369L);
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
        args[0] = term1;
        args[1] = term3;
        args[2] = term5;
        args[3] = term7;
        args[4] = term9;
        args[5] = term11;
        args[6] = term13;
        args[7] = term15;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


