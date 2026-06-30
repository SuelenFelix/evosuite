package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserMusicDetail_setStoryWatched_122679363179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423389;
     Object term423407;

    public UserMusicDetail_setStoryWatched_122679363179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423389 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423389, term423389.getClass(), "id", 0L);
        setField(term423389, term423389.getClass(), "user", null);
        setIntField(term423389, term423389.getClass(), "musicId", 0);
        setIntField(term423389, term423389.getClass(), "level", 0);
        setIntField(term423389, term423389.getClass(), "playCount", 0);
        setIntField(term423389, term423389.getClass(), "techScoreMax", 0);
        setIntField(term423389, term423389.getClass(), "techScoreRank", 0);
        setIntField(term423389, term423389.getClass(), "battleScoreMax", 0);
        setIntField(term423389, term423389.getClass(), "battleScoreRank", 0);
        setIntField(term423389, term423389.getClass(), "maxComboCount", 0);
        setIntField(term423389, term423389.getClass(), "maxOverKill", 0);
        setIntField(term423389, term423389.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423389, term423389.getClass(), "isFullBell", false);
        setBooleanField(term423389, term423389.getClass(), "isFullCombo", false);
        setBooleanField(term423389, term423389.getClass(), "isAllBreake", false);
        setBooleanField(term423389, term423389.getClass(), "isLock", false);
        setIntField(term423389, term423389.getClass(), "clearStatus", 0);
        setBooleanField(term423389, term423389.getClass(), "isStoryWatched", false);
        term423407 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term423407;
        callMethod(klass, "setStoryWatched", argTypes, term423389, args);
    }

};


