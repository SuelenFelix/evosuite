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

public class UserMusicDetail_getMaxTeamOverKill_201137345955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422925;

    public UserMusicDetail_getMaxTeamOverKill_201137345955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422925 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term422925, term422925.getClass(), "id", 0L);
        setField(term422925, term422925.getClass(), "user", null);
        setIntField(term422925, term422925.getClass(), "musicId", 0);
        setIntField(term422925, term422925.getClass(), "level", 0);
        setIntField(term422925, term422925.getClass(), "playCount", 0);
        setIntField(term422925, term422925.getClass(), "techScoreMax", 0);
        setIntField(term422925, term422925.getClass(), "techScoreRank", 0);
        setIntField(term422925, term422925.getClass(), "battleScoreMax", 0);
        setIntField(term422925, term422925.getClass(), "battleScoreRank", 0);
        setIntField(term422925, term422925.getClass(), "maxComboCount", 0);
        setIntField(term422925, term422925.getClass(), "maxOverKill", 0);
        setIntField(term422925, term422925.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term422925, term422925.getClass(), "isFullBell", false);
        setBooleanField(term422925, term422925.getClass(), "isFullCombo", false);
        setBooleanField(term422925, term422925.getClass(), "isAllBreake", false);
        setBooleanField(term422925, term422925.getClass(), "isLock", false);
        setIntField(term422925, term422925.getClass(), "clearStatus", 0);
        setBooleanField(term422925, term422925.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTeamOverKill", argTypes, term422925, args);
    }

};


