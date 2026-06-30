package io.basquiat.interfacebbuljit.noodle.web;

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
import static io.basquiat.interfacebbuljit.noodle.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class NoodleRestController_noodle_8421649460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;

    public NoodleRestController_noodle_8421649460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.web.NoodleRestController"));
        Object term2 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService"));
        setField(term1, term1.getClass(), "noodleService", term2);
        Class<? extends Object> term55 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term54 = ((Class) term55).getDeclaredField((String) "ADD");
        ((Field) term54).setAccessible(true);
        Object enum0 = ((Field) term54).get((Object) null);
        Class<? extends Object> term316 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term315 = ((Class) term316).getDeclaredField((String) "NOT");
        ((Field) term315).setAccessible(true);
        Object enum1 = ((Field) term315).get((Object) null);
        term15 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term15, term15.getClass(), "egg", enum0);
        setField(term15, term15.getClass(), "rice", enum0);
        setField(term15, term15.getClass(), "garlicFlake", enum0);
        setField(term15, term15.getClass(), "peanutButter", enum0);
        setField(term15, term15.getClass(), "spicySource", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.web.NoodleRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term15;
        callMethod(klass, "noodle", argTypes, term1, args);
    }

};


