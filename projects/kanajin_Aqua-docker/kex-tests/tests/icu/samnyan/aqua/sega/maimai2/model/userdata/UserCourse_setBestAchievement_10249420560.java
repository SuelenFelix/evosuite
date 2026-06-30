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
import java.lang.Integer;

public class UserCourse_setBestAchievement_10249420560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94227;
     Object term94237;

    public UserCourse_setBestAchievement_10249420560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94227 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94227, term94227.getClass(), "id", 0L);
        setField(term94227, term94227.getClass(), "user", null);
        setIntField(term94227, term94227.getClass(), "courseId", 0);
        setBooleanField(term94227, term94227.getClass(), "isLastClear", false);
        setIntField(term94227, term94227.getClass(), "totalRestlife", 0);
        setIntField(term94227, term94227.getClass(), "totalAchievement", 0);
        setIntField(term94227, term94227.getClass(), "totalDeluxscore", 0);
        setIntField(term94227, term94227.getClass(), "playCount", 0);
        setField(term94227, term94227.getClass(), "clearDate", null);
        setField(term94227, term94227.getClass(), "lastPlayDate", null);
        setIntField(term94227, term94227.getClass(), "bestAchievement", 0);
        setField(term94227, term94227.getClass(), "bestAchievementDate", null);
        setIntField(term94227, term94227.getClass(), "bestDeluxscore", 0);
        setField(term94227, term94227.getClass(), "bestDeluxscoreDate", null);
        term94237 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94237;
        callMethod(klass, "setBestAchievement", argTypes, term94227, args);
    }

};


