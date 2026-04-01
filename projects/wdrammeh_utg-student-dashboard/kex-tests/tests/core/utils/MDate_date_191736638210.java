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

public class MDate_date_191736638210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277528;
     Object term277530;
     Object term277532;
     Object term277534;
     Object term277536;
     Object term277538;

    public MDate_date_191736638210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277528 = new Integer(-1427059961);
        term277530 = new Integer(1120685189);
        term277532 = new Integer(654585209);
        term277534 = new Integer(-1661685401);
        term277536 = new Integer(1427434947);
        term277538 = new Integer(2130990985);
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
        args[0] = term277528;
        args[1] = term277530;
        args[2] = term277532;
        args[3] = term277534;
        args[4] = term277536;
        args[5] = term277538;
        callMethod(klass, "date", argTypes, null, args);
    }

};


