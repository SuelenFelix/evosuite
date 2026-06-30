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

public class Person_getOfficeAreaCode_1320334051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public Person_getOfficeAreaCode_1320334051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person"));
        Object term182 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.TelephoneNumber"));
        setField(term182, term182.getClass(), "areaCode", "hRNSzYYIrc");
        setField(term182, term182.getClass(), "number", "RMFIsYGgne");
        setField(term181, term181.getClass(), "telephoneNumber", term182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOfficeAreaCode", argTypes, term181, args);
    }

};


