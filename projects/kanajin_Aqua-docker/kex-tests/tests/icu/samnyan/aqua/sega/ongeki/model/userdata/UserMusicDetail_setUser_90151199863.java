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

public class UserMusicDetail_setUser_90151199863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423071;

    public UserMusicDetail_setUser_90151199863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423071 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423071, term423071.getClass(), "id", 0L);
        setField(term423071, term423071.getClass(), "user", null);
        setIntField(term423071, term423071.getClass(), "musicId", 0);
        setIntField(term423071, term423071.getClass(), "level", 0);
        setIntField(term423071, term423071.getClass(), "playCount", 0);
        setIntField(term423071, term423071.getClass(), "techScoreMax", 0);
        setIntField(term423071, term423071.getClass(), "techScoreRank", 0);
        setIntField(term423071, term423071.getClass(), "battleScoreMax", 0);
        setIntField(term423071, term423071.getClass(), "battleScoreRank", 0);
        setIntField(term423071, term423071.getClass(), "maxComboCount", 0);
        setIntField(term423071, term423071.getClass(), "maxOverKill", 0);
        setIntField(term423071, term423071.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423071, term423071.getClass(), "isFullBell", false);
        setBooleanField(term423071, term423071.getClass(), "isFullCombo", false);
        setBooleanField(term423071, term423071.getClass(), "isAllBreake", false);
        setBooleanField(term423071, term423071.getClass(), "isLock", false);
        setIntField(term423071, term423071.getClass(), "clearStatus", 0);
        setBooleanField(term423071, term423071.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term423071, args);
    }

};


