package core.utils;

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
import static core.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MDate_date_191736638231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277605;
     Object term277606;
     Object term277608;
     Object term277610;
     Object term277612;
     Object term277614;
     Object term277616;

    public MDate_date_191736638231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277605 = newInstance(Class.forName("core.utils.MDate"));
        term277606 = new Integer(0);
        term277608 = new Integer(0);
        term277610 = new Integer(0);
        term277612 = new Integer(0);
        term277614 = new Integer(0);
        term277616 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MDate");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term277606;
        args[1] = term277608;
        args[2] = term277610;
        args[3] = term277612;
        args[4] = term277614;
        args[5] = term277616;
        callMethod(klass, "date", argTypes, term277605, args);
    }

};


