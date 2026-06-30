package refactoring.app.chapter07.extractClass;

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
import static refactoring.app.chapter07.extractClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Person_setOfficeNumber_10770244466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public Person_setOfficeNumber_10770244466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("refactoring.app.chapter07.extractClass.Person"));
        Object term178 = newInstance(Class.forName("refactoring.app.chapter07.extractClass.TelephoneNumber"));
        setField(term165, term165.getClass(), "name", "MjGYSRKTNF");
        setField(term178, term178.getClass(), "areaCode", null);
        setField(term178, term178.getClass(), "number", null);
        setField(term165, term165.getClass(), "telephoneNumber", term178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.extractClass.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setOfficeNumber", argTypes, term165, args);
    }

};


