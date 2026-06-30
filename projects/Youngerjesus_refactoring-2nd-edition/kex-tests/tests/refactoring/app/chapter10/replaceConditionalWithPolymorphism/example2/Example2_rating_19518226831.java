package refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2;

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
import static refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Example2_rating_19518226831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term114;
     Object term129;

    public Example2_rating_19518226831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2"));
        term114 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        setField(term114, term114.getClass(), "zone", "xxtlPwDYFs");
        setIntField(term114, term114.getClass(), "length", -1955890973);
        setIntField(term114, term114.getClass(), "profit", -2038273078);
        ArrayList term130 = new ArrayList();
        term129 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term129, term129.getClass(), "voyages", term130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage");
        argTypes[1] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History");
        Object[] args = new Object[2];
        args[0] = term114;
        args[1] = term129;
        callMethod(klass, "rating", argTypes, term113, args);
    }

};


