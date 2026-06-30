package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserMusicDetail_setAchievement_118825279255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188791;
     Object term188803;

    public UserMusicDetail_setAchievement_118825279255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188791, term188791.getClass(), "id", 0L);
        setField(term188791, term188791.getClass(), "user", null);
        setIntField(term188791, term188791.getClass(), "musicId", 0);
        setIntField(term188791, term188791.getClass(), "level", 0);
        setIntField(term188791, term188791.getClass(), "playCount", 0);
        setIntField(term188791, term188791.getClass(), "scoreMax", 0);
        setIntField(term188791, term188791.getClass(), "syncRateMax", 0);
        setBooleanField(term188791, term188791.getClass(), "isAllPerfect", false);
        setIntField(term188791, term188791.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188791, term188791.getClass(), "fullCombo", 0);
        setIntField(term188791, term188791.getClass(), "maxFever", 0);
        setIntField(term188791, term188791.getClass(), "achievement", 0);
        term188803 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term188803;
        callMethod(klass, "setAchievement", argTypes, term188791, args);
    }

};


