package refactoring.app.chapter06.introduceParameterObject;

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
import static refactoring.app.chapter06.introduceParameterObject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class After_readingsOutsideRange_15958283073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term152;
     Object term154;

    public After_readingsOutsideRange_15958283073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.After"));
        setField(term151, term151.getClass(), "station", null);
        term152 = new Integer(0);
        term154 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.introduceParameterObject.After");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("refactoring.app.chapter06.introduceParameterObject.Station");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("refactoring.app.chapter06.introduceParameterObject.NumberRange");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term152;
        args[2] = term154;
        args[3] = null;
        callMethod(klass, "readingsOutsideRange", argTypes, term151, args);
    }

};


