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

public class UserCourse_setLastPlayDate_71441136972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197059;

    public UserCourse_setLastPlayDate_71441136972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197059 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197059, term197059.getClass(), "id", 0L);
        setField(term197059, term197059.getClass(), "user", null);
        setIntField(term197059, term197059.getClass(), "courseId", 0);
        setIntField(term197059, term197059.getClass(), "classId", 0);
        setIntField(term197059, term197059.getClass(), "playCount", 0);
        setIntField(term197059, term197059.getClass(), "scoreMax", 0);
        setBooleanField(term197059, term197059.getClass(), "isFullCombo", false);
        setBooleanField(term197059, term197059.getClass(), "isAllJustice", false);
        setBooleanField(term197059, term197059.getClass(), "isSuccess", false);
        setIntField(term197059, term197059.getClass(), "scoreRank", 0);
        setIntField(term197059, term197059.getClass(), "eventId", 0);
        setField(term197059, term197059.getClass(), "lastPlayDate", null);
        setIntField(term197059, term197059.getClass(), "param1", 0);
        setIntField(term197059, term197059.getClass(), "param2", 0);
        setIntField(term197059, term197059.getClass(), "param3", 0);
        setIntField(term197059, term197059.getClass(), "param4", 0);
        setBooleanField(term197059, term197059.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term197059, args);
    }

};


