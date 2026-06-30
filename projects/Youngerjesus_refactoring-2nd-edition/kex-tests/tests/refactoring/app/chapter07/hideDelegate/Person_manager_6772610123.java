package refactoring.app.chapter07.hideDelegate;

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
import static refactoring.app.chapter07.hideDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Person_manager_6772610123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;

    public Person_manager_6772610123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term169 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term171 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term184 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term186 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        setField(term156, term156.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term169, term169.getClass(), "chargeCode", 597278769);
        setField(term171, term171.getClass(), "name", "tbcdzjIfER");
        setIntField(term184, term184.getClass(), "chargeCode", -1685132342);
        setField(term186, term186.getClass(), "name", null);
        setField(term186, term186.getClass(), "department", null);
        setField(term184, term184.getClass(), "manager", term186);
        setField(term171, term171.getClass(), "department", term184);
        setField(term169, term169.getClass(), "manager", term171);
        setField(term156, term156.getClass(), "department", term169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "manager", argTypes, term156, args);
    }

};


