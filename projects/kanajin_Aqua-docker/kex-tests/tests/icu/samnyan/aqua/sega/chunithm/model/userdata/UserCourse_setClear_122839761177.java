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
import java.lang.Boolean;

public class UserCourse_setClear_122839761177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197147;
     Object term197163;

    public UserCourse_setClear_122839761177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197147 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197147, term197147.getClass(), "id", 0L);
        setField(term197147, term197147.getClass(), "user", null);
        setIntField(term197147, term197147.getClass(), "courseId", 0);
        setIntField(term197147, term197147.getClass(), "classId", 0);
        setIntField(term197147, term197147.getClass(), "playCount", 0);
        setIntField(term197147, term197147.getClass(), "scoreMax", 0);
        setBooleanField(term197147, term197147.getClass(), "isFullCombo", false);
        setBooleanField(term197147, term197147.getClass(), "isAllJustice", false);
        setBooleanField(term197147, term197147.getClass(), "isSuccess", false);
        setIntField(term197147, term197147.getClass(), "scoreRank", 0);
        setIntField(term197147, term197147.getClass(), "eventId", 0);
        setField(term197147, term197147.getClass(), "lastPlayDate", null);
        setIntField(term197147, term197147.getClass(), "param1", 0);
        setIntField(term197147, term197147.getClass(), "param2", 0);
        setIntField(term197147, term197147.getClass(), "param3", 0);
        setIntField(term197147, term197147.getClass(), "param4", 0);
        setBooleanField(term197147, term197147.getClass(), "isClear", false);
        term197163 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term197163;
        callMethod(klass, "setClear", argTypes, term197147, args);
    }

};


