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
     Object term9681;
     Object term9682;
     Object term9684;
     Object term9686;
     Object term9688;
     Object term9690;
     Object term9692;

    public MDate_date_191736638231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9681 = newInstance(Class.forName("core.utils.MDate"));
        term9682 = new Integer(0);
        term9684 = new Integer(0);
        term9686 = new Integer(0);
        term9688 = new Integer(0);
        term9690 = new Integer(0);
        term9692 = new Integer(0);
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
        args[0] = term9682;
        args[1] = term9684;
        args[2] = term9686;
        args[3] = term9688;
        args[4] = term9690;
        args[5] = term9692;
        callMethod(klass, "date", argTypes, term9681, args);
    }

};


