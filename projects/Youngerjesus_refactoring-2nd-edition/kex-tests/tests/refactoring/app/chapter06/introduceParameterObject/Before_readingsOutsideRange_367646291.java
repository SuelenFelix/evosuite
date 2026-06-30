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

public class Before_readingsOutsideRange_367646291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term39;
     Object term56;
     Object term58;

    public Before_readingsOutsideRange_367646291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35 = new ArrayList();
        term21 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.Before"));
        Object term22 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.Station"));
        setField(term22, term22.getClass(), "name", "PAEBtnZtTD");
        setField(term22, term22.getClass(), "readings", term35);
        setField(term21, term21.getClass(), "station", term22);
        ArrayList term52 = new ArrayList();
        term39 = newInstance(Class.forName("refactoring.app.chapter06.introduceParameterObject.Station"));
        setField(term39, term39.getClass(), "name", "sjlJAEtRrb");
        setField(term39, term39.getClass(), "readings", term52);
        term56 = new Integer(-1955890973);
        term58 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.introduceParameterObject.Before");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter06.introduceParameterObject.Station");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term39;
        args[1] = term56;
        args[2] = term58;
        callMethod(klass, "readingsOutsideRange", argTypes, term21, args);
    }

};


