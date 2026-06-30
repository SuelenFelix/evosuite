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

public class UserMusicDetail_hashCode_1425917982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423445;

    public UserMusicDetail_hashCode_1425917982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423445 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423445, term423445.getClass(), "id", 0L);
        setField(term423445, term423445.getClass(), "user", null);
        setIntField(term423445, term423445.getClass(), "musicId", 0);
        setIntField(term423445, term423445.getClass(), "level", 0);
        setIntField(term423445, term423445.getClass(), "playCount", 0);
        setIntField(term423445, term423445.getClass(), "techScoreMax", 0);
        setIntField(term423445, term423445.getClass(), "techScoreRank", 0);
        setIntField(term423445, term423445.getClass(), "battleScoreMax", 0);
        setIntField(term423445, term423445.getClass(), "battleScoreRank", 0);
        setIntField(term423445, term423445.getClass(), "maxComboCount", 0);
        setIntField(term423445, term423445.getClass(), "maxOverKill", 0);
        setIntField(term423445, term423445.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423445, term423445.getClass(), "isFullBell", false);
        setBooleanField(term423445, term423445.getClass(), "isFullCombo", false);
        setBooleanField(term423445, term423445.getClass(), "isAllBreake", false);
        setBooleanField(term423445, term423445.getClass(), "isLock", false);
        setIntField(term423445, term423445.getClass(), "clearStatus", 0);
        setBooleanField(term423445, term423445.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term423445, args);
    }

};


