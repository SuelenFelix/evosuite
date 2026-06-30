package io.basquiat.interfacebbuljit.noodle.domain.vo;

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
import static io.basquiat.interfacebbuljit.noodle.domain.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Topping_hashCode_9417090027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3506;

    public Topping_hashCode_9417090027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3522 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3521 = ((Class) term3522).getDeclaredField((String) "NOT");
        ((Field) term3521).setAccessible(true);
        Object enum13 = ((Field) term3521).get((Object) null);
        Class<? extends Object> term3783 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term3782 = ((Class) term3783).getDeclaredField((String) "ADD");
        ((Field) term3782).setAccessible(true);
        Object enum14 = ((Field) term3782).get((Object) null);
        term3506 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term3506, term3506.getClass(), "egg", enum13);
        setField(term3506, term3506.getClass(), "rice", enum13);
        setField(term3506, term3506.getClass(), "garlicFlake", enum13);
        setField(term3506, term3506.getClass(), "peanutButter", enum13);
        setField(term3506, term3506.getClass(), "spicySource", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3506, args);
    }

};


