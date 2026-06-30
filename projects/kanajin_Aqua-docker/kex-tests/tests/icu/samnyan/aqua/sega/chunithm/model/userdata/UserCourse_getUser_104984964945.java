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

public class UserCourse_getUser_104984964945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196607;

    public UserCourse_getUser_104984964945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196607 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196607, term196607.getClass(), "id", 0L);
        setField(term196607, term196607.getClass(), "user", null);
        setIntField(term196607, term196607.getClass(), "courseId", 0);
        setIntField(term196607, term196607.getClass(), "classId", 0);
        setIntField(term196607, term196607.getClass(), "playCount", 0);
        setIntField(term196607, term196607.getClass(), "scoreMax", 0);
        setBooleanField(term196607, term196607.getClass(), "isFullCombo", false);
        setBooleanField(term196607, term196607.getClass(), "isAllJustice", false);
        setBooleanField(term196607, term196607.getClass(), "isSuccess", false);
        setIntField(term196607, term196607.getClass(), "scoreRank", 0);
        setIntField(term196607, term196607.getClass(), "eventId", 0);
        setField(term196607, term196607.getClass(), "lastPlayDate", null);
        setIntField(term196607, term196607.getClass(), "param1", 0);
        setIntField(term196607, term196607.getClass(), "param2", 0);
        setIntField(term196607, term196607.getClass(), "param3", 0);
        setIntField(term196607, term196607.getClass(), "param4", 0);
        setBooleanField(term196607, term196607.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term196607, args);
    }

};


