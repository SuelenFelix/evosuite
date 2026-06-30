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

public class UserMusicDetail_getTechScoreMax_160441045049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422817;

    public UserMusicDetail_getTechScoreMax_160441045049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422817 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term422817, term422817.getClass(), "id", 0L);
        setField(term422817, term422817.getClass(), "user", null);
        setIntField(term422817, term422817.getClass(), "musicId", 0);
        setIntField(term422817, term422817.getClass(), "level", 0);
        setIntField(term422817, term422817.getClass(), "playCount", 0);
        setIntField(term422817, term422817.getClass(), "techScoreMax", 0);
        setIntField(term422817, term422817.getClass(), "techScoreRank", 0);
        setIntField(term422817, term422817.getClass(), "battleScoreMax", 0);
        setIntField(term422817, term422817.getClass(), "battleScoreRank", 0);
        setIntField(term422817, term422817.getClass(), "maxComboCount", 0);
        setIntField(term422817, term422817.getClass(), "maxOverKill", 0);
        setIntField(term422817, term422817.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term422817, term422817.getClass(), "isFullBell", false);
        setBooleanField(term422817, term422817.getClass(), "isFullCombo", false);
        setBooleanField(term422817, term422817.getClass(), "isAllBreake", false);
        setBooleanField(term422817, term422817.getClass(), "isLock", false);
        setIntField(term422817, term422817.getClass(), "clearStatus", 0);
        setBooleanField(term422817, term422817.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScoreMax", argTypes, term422817, args);
    }

};


