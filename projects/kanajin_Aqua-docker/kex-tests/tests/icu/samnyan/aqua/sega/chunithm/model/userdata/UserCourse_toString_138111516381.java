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

public class UserCourse_toString_138111516381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197213;

    public UserCourse_toString_138111516381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197213 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197213, term197213.getClass(), "id", 0L);
        setField(term197213, term197213.getClass(), "user", null);
        setIntField(term197213, term197213.getClass(), "courseId", 0);
        setIntField(term197213, term197213.getClass(), "classId", 0);
        setIntField(term197213, term197213.getClass(), "playCount", 0);
        setIntField(term197213, term197213.getClass(), "scoreMax", 0);
        setBooleanField(term197213, term197213.getClass(), "isFullCombo", false);
        setBooleanField(term197213, term197213.getClass(), "isAllJustice", false);
        setBooleanField(term197213, term197213.getClass(), "isSuccess", false);
        setIntField(term197213, term197213.getClass(), "scoreRank", 0);
        setIntField(term197213, term197213.getClass(), "eventId", 0);
        setField(term197213, term197213.getClass(), "lastPlayDate", null);
        setIntField(term197213, term197213.getClass(), "param1", 0);
        setIntField(term197213, term197213.getClass(), "param2", 0);
        setIntField(term197213, term197213.getClass(), "param3", 0);
        setIntField(term197213, term197213.getClass(), "param4", 0);
        setBooleanField(term197213, term197213.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term197213, args);
    }

};


