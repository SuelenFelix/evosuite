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

public class UserMusicDetail_setFullCombo_150371491575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423309;
     Object term423327;

    public UserMusicDetail_setFullCombo_150371491575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423309 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423309, term423309.getClass(), "id", 0L);
        setField(term423309, term423309.getClass(), "user", null);
        setIntField(term423309, term423309.getClass(), "musicId", 0);
        setIntField(term423309, term423309.getClass(), "level", 0);
        setIntField(term423309, term423309.getClass(), "playCount", 0);
        setIntField(term423309, term423309.getClass(), "techScoreMax", 0);
        setIntField(term423309, term423309.getClass(), "techScoreRank", 0);
        setIntField(term423309, term423309.getClass(), "battleScoreMax", 0);
        setIntField(term423309, term423309.getClass(), "battleScoreRank", 0);
        setIntField(term423309, term423309.getClass(), "maxComboCount", 0);
        setIntField(term423309, term423309.getClass(), "maxOverKill", 0);
        setIntField(term423309, term423309.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423309, term423309.getClass(), "isFullBell", false);
        setBooleanField(term423309, term423309.getClass(), "isFullCombo", false);
        setBooleanField(term423309, term423309.getClass(), "isAllBreake", false);
        setBooleanField(term423309, term423309.getClass(), "isLock", false);
        setIntField(term423309, term423309.getClass(), "clearStatus", 0);
        setBooleanField(term423309, term423309.getClass(), "isStoryWatched", false);
        term423327 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term423327;
        callMethod(klass, "setFullCombo", argTypes, term423309, args);
    }

};


