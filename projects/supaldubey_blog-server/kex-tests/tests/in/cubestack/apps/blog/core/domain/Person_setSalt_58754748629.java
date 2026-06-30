package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Person_setSalt_58754748629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17515;

    public Person_setSalt_58754748629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17733 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term17732 = ((Class) term17733).getDeclaredField((String) "ACTIVE");
        ((Field) term17732).setAccessible(true);
        Object enum37 = ((Field) term17732).get((Object) null);
        ArrayList term17634 = new ArrayList();
        Long term17638 = new Long(-8708192233349544946L);
        term17515 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term17640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17655 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17515, term17515.getClass(), "firstName", "DIbeDHICho");
        setField(term17515, term17515.getClass(), "lastName", "dJGPlmSRnz");
        setField(term17515, term17515.getClass(), "email", "DPskuFUobI");
        setField(term17515, term17515.getClass(), "username", "wBGfLpNNiZ");
        setField(term17515, term17515.getClass(), "password", "yUGCjlqgJE");
        setField(term17515, term17515.getClass(), "profileImage", "PXdVZyoJyC");
        setField(term17515, term17515.getClass(), "status", enum37);
        setField(term17515, term17515.getClass(), "phone", "vLerpqavFM");
        setField(term17515, term17515.getClass(), "countryCode", "qnvxzwuGKX");
        setField(term17515, term17515.getClass(), "salt", "EdPAvpluZg");
        setField(term17515, term17515.getClass(), "personRoles", term17634);
        setField(term17515, term17515.getClass(), "id", term17638);
        setIntField(term17641, term17641.getClass(), "year", 2011);
        setShortField(term17641, term17641.getClass(), "month", (short) 8);
        setShortField(term17641, term17641.getClass(), "day", (short) 1);
        setField(term17640, term17640.getClass(), "date", term17641);
        setByteField(term17645, term17645.getClass(), "hour", (byte) 7);
        setByteField(term17645, term17645.getClass(), "minute", (byte) 2);
        setByteField(term17645, term17645.getClass(), "second", (byte) 46);
        setIntField(term17645, term17645.getClass(), "nano", 187178462);
        setField(term17640, term17640.getClass(), "time", term17645);
        setField(term17515, term17515.getClass(), "createdAt", term17640);
        setIntField(term17651, term17651.getClass(), "year", 2020);
        setShortField(term17651, term17651.getClass(), "month", (short) 9);
        setShortField(term17651, term17651.getClass(), "day", (short) 3);
        setField(term17650, term17650.getClass(), "date", term17651);
        setByteField(term17655, term17655.getClass(), "hour", (byte) 10);
        setByteField(term17655, term17655.getClass(), "minute", (byte) 44);
        setByteField(term17655, term17655.getClass(), "second", (byte) 5);
        setIntField(term17655, term17655.getClass(), "nano", 572560230);
        setField(term17650, term17650.getClass(), "time", term17655);
        setField(term17515, term17515.getClass(), "updatedAt", term17650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzHVBMqWtE";
        callMethod(klass, "setSalt", argTypes, term17515, args);
    }

};


