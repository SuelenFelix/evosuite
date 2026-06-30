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

public class UserMusicDetail_toString_49650051183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423463;

    public UserMusicDetail_toString_49650051183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423463 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423463, term423463.getClass(), "id", 0L);
        setField(term423463, term423463.getClass(), "user", null);
        setIntField(term423463, term423463.getClass(), "musicId", 0);
        setIntField(term423463, term423463.getClass(), "level", 0);
        setIntField(term423463, term423463.getClass(), "playCount", 0);
        setIntField(term423463, term423463.getClass(), "techScoreMax", 0);
        setIntField(term423463, term423463.getClass(), "techScoreRank", 0);
        setIntField(term423463, term423463.getClass(), "battleScoreMax", 0);
        setIntField(term423463, term423463.getClass(), "battleScoreRank", 0);
        setIntField(term423463, term423463.getClass(), "maxComboCount", 0);
        setIntField(term423463, term423463.getClass(), "maxOverKill", 0);
        setIntField(term423463, term423463.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423463, term423463.getClass(), "isFullBell", false);
        setBooleanField(term423463, term423463.getClass(), "isFullCombo", false);
        setBooleanField(term423463, term423463.getClass(), "isAllBreake", false);
        setBooleanField(term423463, term423463.getClass(), "isLock", false);
        setIntField(term423463, term423463.getClass(), "clearStatus", 0);
        setBooleanField(term423463, term423463.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term423463, args);
    }

};


