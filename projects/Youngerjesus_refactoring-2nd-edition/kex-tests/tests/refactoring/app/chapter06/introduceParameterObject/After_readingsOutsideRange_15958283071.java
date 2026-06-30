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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class After_readingsOutsideRange_15958283071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term107;
     Object term124;
     Object term126;
     Object term128;

    public After_readingsOutsideRange_15958283071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103 = new ArrayList();
        term89 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.After"));
        Object term90 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.Station"));
        setField(term90, term90.getClass(), "name", "MuLcgQHgqz");
        setField(term90, term90.getClass(), "readings", term103);
        setField(term89, term89.getClass(), "station", term90);
        ArrayList term120 = new ArrayList();
        term107 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.Station"));
        setField(term107, term107.getClass(), "name", "xxtlPwDYFs");
        setField(term107, term107.getClass(), "readings", term120);
        term124 = new Integer(-1339778481);
        term126 = new Integer(1725571209);
        term128 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.NumberRange"));
        setIntField(term128, term128.getClass(), "min", -522618178);
        setIntField(term128, term128.getClass(), "max", 1134449235);
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
        args[0] = term107;
        args[1] = term124;
        args[2] = term126;
        args[3] = term128;
        callMethod(klass, "readingsOutsideRange", argTypes, term89, args);
    }

};


