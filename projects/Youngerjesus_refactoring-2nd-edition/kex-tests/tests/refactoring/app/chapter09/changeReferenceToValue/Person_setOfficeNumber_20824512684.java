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

public class Person_setOfficeNumber_20824512684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public Person_setOfficeNumber_20824512684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person"));
        Object term342 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.TelephoneNumber"));
        setField(term342, term342.getClass(), "areaCode", "aJlieCFVtF");
        setField(term342, term342.getClass(), "number", "ZiaGIbnzTs");
        setField(term341, term341.getClass(), "telephoneNumber", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.changeReferenceToValue.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "setOfficeNumber", argTypes, term341, args);
    }

};


