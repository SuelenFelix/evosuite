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
import java.lang.Boolean;

public class UserCourse_setLastClear_50162439353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94147;
     Object term94157;

    public UserCourse_setLastClear_50162439353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94147 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94147, term94147.getClass(), "id", 0L);
        setField(term94147, term94147.getClass(), "user", null);
        setIntField(term94147, term94147.getClass(), "courseId", 0);
        setBooleanField(term94147, term94147.getClass(), "isLastClear", false);
        setIntField(term94147, term94147.getClass(), "totalRestlife", 0);
        setIntField(term94147, term94147.getClass(), "totalAchievement", 0);
        setIntField(term94147, term94147.getClass(), "totalDeluxscore", 0);
        setIntField(term94147, term94147.getClass(), "playCount", 0);
        setField(term94147, term94147.getClass(), "clearDate", null);
        setField(term94147, term94147.getClass(), "lastPlayDate", null);
        setIntField(term94147, term94147.getClass(), "bestAchievement", 0);
        setField(term94147, term94147.getClass(), "bestAchievementDate", null);
        setIntField(term94147, term94147.getClass(), "bestDeluxscore", 0);
        setField(term94147, term94147.getClass(), "bestDeluxscoreDate", null);
        term94157 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term94157;
        callMethod(klass, "setLastClear", argTypes, term94147, args);
    }

};


