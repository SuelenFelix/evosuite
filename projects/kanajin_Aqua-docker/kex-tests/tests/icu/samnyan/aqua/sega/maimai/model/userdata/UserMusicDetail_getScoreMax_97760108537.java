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

public class UserMusicDetail_getScoreMax_97760108537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188555;

    public UserMusicDetail_getScoreMax_97760108537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188555 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188555, term188555.getClass(), "id", 0L);
        setField(term188555, term188555.getClass(), "user", null);
        setIntField(term188555, term188555.getClass(), "musicId", 0);
        setIntField(term188555, term188555.getClass(), "level", 0);
        setIntField(term188555, term188555.getClass(), "playCount", 0);
        setIntField(term188555, term188555.getClass(), "scoreMax", 0);
        setIntField(term188555, term188555.getClass(), "syncRateMax", 0);
        setBooleanField(term188555, term188555.getClass(), "isAllPerfect", false);
        setIntField(term188555, term188555.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188555, term188555.getClass(), "fullCombo", 0);
        setIntField(term188555, term188555.getClass(), "maxFever", 0);
        setIntField(term188555, term188555.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term188555, args);
    }

};


