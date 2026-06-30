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
import java.lang.Long;

public class UserMusicDetail_setId_179996294762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423051;
     Object term423069;

    public UserMusicDetail_setId_179996294762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423051 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423051, term423051.getClass(), "id", 0L);
        setField(term423051, term423051.getClass(), "user", null);
        setIntField(term423051, term423051.getClass(), "musicId", 0);
        setIntField(term423051, term423051.getClass(), "level", 0);
        setIntField(term423051, term423051.getClass(), "playCount", 0);
        setIntField(term423051, term423051.getClass(), "techScoreMax", 0);
        setIntField(term423051, term423051.getClass(), "techScoreRank", 0);
        setIntField(term423051, term423051.getClass(), "battleScoreMax", 0);
        setIntField(term423051, term423051.getClass(), "battleScoreRank", 0);
        setIntField(term423051, term423051.getClass(), "maxComboCount", 0);
        setIntField(term423051, term423051.getClass(), "maxOverKill", 0);
        setIntField(term423051, term423051.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423051, term423051.getClass(), "isFullBell", false);
        setBooleanField(term423051, term423051.getClass(), "isFullCombo", false);
        setBooleanField(term423051, term423051.getClass(), "isAllBreake", false);
        setBooleanField(term423051, term423051.getClass(), "isLock", false);
        setIntField(term423051, term423051.getClass(), "clearStatus", 0);
        setBooleanField(term423051, term423051.getClass(), "isStoryWatched", false);
        term423069 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term423069;
        callMethod(klass, "setId", argTypes, term423051, args);
    }

};


