package refactoring.app.chapter07.encapsulateCollection;

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
import static refactoring.app.chapter07.encapsulateCollection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Course_isAdvanced_3105195762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;

    public Course_isAdvanced_3105195762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term290, term290.getClass(), "name", "flxyYxBRtu");
        setBooleanField(term290, term290.getClass(), "isAdvanced", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.encapsulateCollection.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAdvanced", argTypes, term290, args);
    }

};


