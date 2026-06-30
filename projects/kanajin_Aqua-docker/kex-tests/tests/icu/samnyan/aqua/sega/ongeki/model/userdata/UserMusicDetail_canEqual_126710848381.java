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

public class UserMusicDetail_canEqual_126710848381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423427;

    public UserMusicDetail_canEqual_126710848381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423427 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423427, term423427.getClass(), "id", 0L);
        setField(term423427, term423427.getClass(), "user", null);
        setIntField(term423427, term423427.getClass(), "musicId", 0);
        setIntField(term423427, term423427.getClass(), "level", 0);
        setIntField(term423427, term423427.getClass(), "playCount", 0);
        setIntField(term423427, term423427.getClass(), "techScoreMax", 0);
        setIntField(term423427, term423427.getClass(), "techScoreRank", 0);
        setIntField(term423427, term423427.getClass(), "battleScoreMax", 0);
        setIntField(term423427, term423427.getClass(), "battleScoreRank", 0);
        setIntField(term423427, term423427.getClass(), "maxComboCount", 0);
        setIntField(term423427, term423427.getClass(), "maxOverKill", 0);
        setIntField(term423427, term423427.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423427, term423427.getClass(), "isFullBell", false);
        setBooleanField(term423427, term423427.getClass(), "isFullCombo", false);
        setBooleanField(term423427, term423427.getClass(), "isAllBreake", false);
        setBooleanField(term423427, term423427.getClass(), "isLock", false);
        setIntField(term423427, term423427.getClass(), "clearStatus", 0);
        setBooleanField(term423427, term423427.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term423427, args);
    }

};


