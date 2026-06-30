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

public class UserCourse_isLastClear_149997037939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94003;

    public UserCourse_isLastClear_149997037939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94003 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94003, term94003.getClass(), "id", 0L);
        setField(term94003, term94003.getClass(), "user", null);
        setIntField(term94003, term94003.getClass(), "courseId", 0);
        setBooleanField(term94003, term94003.getClass(), "isLastClear", false);
        setIntField(term94003, term94003.getClass(), "totalRestlife", 0);
        setIntField(term94003, term94003.getClass(), "totalAchievement", 0);
        setIntField(term94003, term94003.getClass(), "totalDeluxscore", 0);
        setIntField(term94003, term94003.getClass(), "playCount", 0);
        setField(term94003, term94003.getClass(), "clearDate", null);
        setField(term94003, term94003.getClass(), "lastPlayDate", null);
        setIntField(term94003, term94003.getClass(), "bestAchievement", 0);
        setField(term94003, term94003.getClass(), "bestAchievementDate", null);
        setIntField(term94003, term94003.getClass(), "bestDeluxscore", 0);
        setField(term94003, term94003.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLastClear", argTypes, term94003, args);
    }

};


