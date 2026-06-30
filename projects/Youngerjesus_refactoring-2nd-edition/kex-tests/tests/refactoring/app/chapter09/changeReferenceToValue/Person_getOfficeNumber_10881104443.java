package refactoring.app.chapter09.changeReferenceToValue;

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
import static refactoring.app.chapter09.changeReferenceToValue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Person_getOfficeNumber_10881104443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public Person_getOfficeNumber_10881104443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person"));
        Object term296 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.TelephoneNumber"));
        setField(term296, term296.getClass(), "areaCode", "LQFpaHEwXR");
        setField(term296, term296.getClass(), "number", "oVcInYnLWB");
        setField(term295, term295.getClass(), "telephoneNumber", term296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOfficeNumber", argTypes, term295, args);
    }

};


