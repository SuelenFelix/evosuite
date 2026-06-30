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

public class UserMusicDetail_getUser_48917593845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422745;

    public UserMusicDetail_getUser_48917593845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422745 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term422745, term422745.getClass(), "id", 0L);
        setField(term422745, term422745.getClass(), "user", null);
        setIntField(term422745, term422745.getClass(), "musicId", 0);
        setIntField(term422745, term422745.getClass(), "level", 0);
        setIntField(term422745, term422745.getClass(), "playCount", 0);
        setIntField(term422745, term422745.getClass(), "techScoreMax", 0);
        setIntField(term422745, term422745.getClass(), "techScoreRank", 0);
        setIntField(term422745, term422745.getClass(), "battleScoreMax", 0);
        setIntField(term422745, term422745.getClass(), "battleScoreRank", 0);
        setIntField(term422745, term422745.getClass(), "maxComboCount", 0);
        setIntField(term422745, term422745.getClass(), "maxOverKill", 0);
        setIntField(term422745, term422745.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term422745, term422745.getClass(), "isFullBell", false);
        setBooleanField(term422745, term422745.getClass(), "isFullCombo", false);
        setBooleanField(term422745, term422745.getClass(), "isAllBreake", false);
        setBooleanField(term422745, term422745.getClass(), "isLock", false);
        setIntField(term422745, term422745.getClass(), "clearStatus", 0);
        setBooleanField(term422745, term422745.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term422745, args);
    }

};


