package refactoring.app.chapter07.removeMiddleMan;

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
import static refactoring.app.chapter07.removeMiddleMan.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Department_getChargeCode_16888208621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Department_getChargeCode_16888208621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term3 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term16 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term18 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term20 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term1, term1.getClass(), "chargeCode", 568599855);
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setIntField(term16, term16.getClass(), "chargeCode", 1162663216);
        setField(term18, term18.getClass(), "name", "");
        setIntField(term20, term20.getClass(), "chargeCode", 1484323161);
        setField(term20, term20.getClass(), "manager", null);
        setField(term18, term18.getClass(), "department", term20);
        setField(term16, term16.getClass(), "manager", term18);
        setField(term3, term3.getClass(), "department", term16);
        setField(term1, term1.getClass(), "manager", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeCode", argTypes, term1, args);
    }

};


