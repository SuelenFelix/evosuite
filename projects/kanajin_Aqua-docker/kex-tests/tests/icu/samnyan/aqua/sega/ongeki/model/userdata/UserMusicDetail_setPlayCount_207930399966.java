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
import java.lang.Integer;

public class UserMusicDetail_setPlayCount_207930399966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423129;
     Object term423147;

    public UserMusicDetail_setPlayCount_207930399966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423129 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423129, term423129.getClass(), "id", 0L);
        setField(term423129, term423129.getClass(), "user", null);
        setIntField(term423129, term423129.getClass(), "musicId", 0);
        setIntField(term423129, term423129.getClass(), "level", 0);
        setIntField(term423129, term423129.getClass(), "playCount", 0);
        setIntField(term423129, term423129.getClass(), "techScoreMax", 0);
        setIntField(term423129, term423129.getClass(), "techScoreRank", 0);
        setIntField(term423129, term423129.getClass(), "battleScoreMax", 0);
        setIntField(term423129, term423129.getClass(), "battleScoreRank", 0);
        setIntField(term423129, term423129.getClass(), "maxComboCount", 0);
        setIntField(term423129, term423129.getClass(), "maxOverKill", 0);
        setIntField(term423129, term423129.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423129, term423129.getClass(), "isFullBell", false);
        setBooleanField(term423129, term423129.getClass(), "isFullCombo", false);
        setBooleanField(term423129, term423129.getClass(), "isAllBreake", false);
        setBooleanField(term423129, term423129.getClass(), "isLock", false);
        setIntField(term423129, term423129.getClass(), "clearStatus", 0);
        setBooleanField(term423129, term423129.getClass(), "isStoryWatched", false);
        term423147 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term423147;
        callMethod(klass, "setPlayCount", argTypes, term423129, args);
    }

};


