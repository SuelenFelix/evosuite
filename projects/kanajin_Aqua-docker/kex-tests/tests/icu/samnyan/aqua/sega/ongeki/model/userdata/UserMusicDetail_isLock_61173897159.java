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

public class UserMusicDetail_isLock_61173897159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422997;

    public UserMusicDetail_isLock_61173897159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422997 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term422997, term422997.getClass(), "id", 0L);
        setField(term422997, term422997.getClass(), "user", null);
        setIntField(term422997, term422997.getClass(), "musicId", 0);
        setIntField(term422997, term422997.getClass(), "level", 0);
        setIntField(term422997, term422997.getClass(), "playCount", 0);
        setIntField(term422997, term422997.getClass(), "techScoreMax", 0);
        setIntField(term422997, term422997.getClass(), "techScoreRank", 0);
        setIntField(term422997, term422997.getClass(), "battleScoreMax", 0);
        setIntField(term422997, term422997.getClass(), "battleScoreRank", 0);
        setIntField(term422997, term422997.getClass(), "maxComboCount", 0);
        setIntField(term422997, term422997.getClass(), "maxOverKill", 0);
        setIntField(term422997, term422997.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term422997, term422997.getClass(), "isFullBell", false);
        setBooleanField(term422997, term422997.getClass(), "isFullCombo", false);
        setBooleanField(term422997, term422997.getClass(), "isAllBreake", false);
        setBooleanField(term422997, term422997.getClass(), "isLock", false);
        setIntField(term422997, term422997.getClass(), "clearStatus", 0);
        setBooleanField(term422997, term422997.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLock", argTypes, term422997, args);
    }

};


