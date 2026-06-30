package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCourse_setId_213762302350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94113;
     Object term94123;

    public UserCourse_setId_213762302350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94113, term94113.getClass(), "id", 0L);
        setField(term94113, term94113.getClass(), "user", null);
        setIntField(term94113, term94113.getClass(), "courseId", 0);
        setBooleanField(term94113, term94113.getClass(), "isLastClear", false);
        setIntField(term94113, term94113.getClass(), "totalRestlife", 0);
        setIntField(term94113, term94113.getClass(), "totalAchievement", 0);
        setIntField(term94113, term94113.getClass(), "totalDeluxscore", 0);
        setIntField(term94113, term94113.getClass(), "playCount", 0);
        setField(term94113, term94113.getClass(), "clearDate", null);
        setField(term94113, term94113.getClass(), "lastPlayDate", null);
        setIntField(term94113, term94113.getClass(), "bestAchievement", 0);
        setField(term94113, term94113.getClass(), "bestAchievementDate", null);
        setIntField(term94113, term94113.getClass(), "bestDeluxscore", 0);
        setField(term94113, term94113.getClass(), "bestDeluxscoreDate", null);
        term94123 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term94123;
        callMethod(klass, "setId", argTypes, term94113, args);
    }

};


