package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCourse_equals_195440576878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197165;

    public UserCourse_equals_195440576878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197165 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197165, term197165.getClass(), "id", 0L);
        setField(term197165, term197165.getClass(), "user", null);
        setIntField(term197165, term197165.getClass(), "courseId", 0);
        setIntField(term197165, term197165.getClass(), "classId", 0);
        setIntField(term197165, term197165.getClass(), "playCount", 0);
        setIntField(term197165, term197165.getClass(), "scoreMax", 0);
        setBooleanField(term197165, term197165.getClass(), "isFullCombo", false);
        setBooleanField(term197165, term197165.getClass(), "isAllJustice", false);
        setBooleanField(term197165, term197165.getClass(), "isSuccess", false);
        setIntField(term197165, term197165.getClass(), "scoreRank", 0);
        setIntField(term197165, term197165.getClass(), "eventId", 0);
        setField(term197165, term197165.getClass(), "lastPlayDate", null);
        setIntField(term197165, term197165.getClass(), "param1", 0);
        setIntField(term197165, term197165.getClass(), "param2", 0);
        setIntField(term197165, term197165.getClass(), "param3", 0);
        setIntField(term197165, term197165.getClass(), "param4", 0);
        setBooleanField(term197165, term197165.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term197165, args);
    }

};


