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

public class UserCourse_getUser_146948927037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93983;

    public UserCourse_getUser_146948927037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term93983, term93983.getClass(), "id", 0L);
        setField(term93983, term93983.getClass(), "user", null);
        setIntField(term93983, term93983.getClass(), "courseId", 0);
        setBooleanField(term93983, term93983.getClass(), "isLastClear", false);
        setIntField(term93983, term93983.getClass(), "totalRestlife", 0);
        setIntField(term93983, term93983.getClass(), "totalAchievement", 0);
        setIntField(term93983, term93983.getClass(), "totalDeluxscore", 0);
        setIntField(term93983, term93983.getClass(), "playCount", 0);
        setField(term93983, term93983.getClass(), "clearDate", null);
        setField(term93983, term93983.getClass(), "lastPlayDate", null);
        setIntField(term93983, term93983.getClass(), "bestAchievement", 0);
        setField(term93983, term93983.getClass(), "bestAchievementDate", null);
        setIntField(term93983, term93983.getClass(), "bestDeluxscore", 0);
        setField(term93983, term93983.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term93983, args);
    }

};


