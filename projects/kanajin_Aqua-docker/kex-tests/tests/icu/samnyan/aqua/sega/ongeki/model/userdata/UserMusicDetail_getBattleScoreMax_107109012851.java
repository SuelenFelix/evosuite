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

public class UserMusicDetail_getBattleScoreMax_107109012851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422853;

    public UserMusicDetail_getBattleScoreMax_107109012851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422853 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term422853, term422853.getClass(), "id", 0L);
        setField(term422853, term422853.getClass(), "user", null);
        setIntField(term422853, term422853.getClass(), "musicId", 0);
        setIntField(term422853, term422853.getClass(), "level", 0);
        setIntField(term422853, term422853.getClass(), "playCount", 0);
        setIntField(term422853, term422853.getClass(), "techScoreMax", 0);
        setIntField(term422853, term422853.getClass(), "techScoreRank", 0);
        setIntField(term422853, term422853.getClass(), "battleScoreMax", 0);
        setIntField(term422853, term422853.getClass(), "battleScoreRank", 0);
        setIntField(term422853, term422853.getClass(), "maxComboCount", 0);
        setIntField(term422853, term422853.getClass(), "maxOverKill", 0);
        setIntField(term422853, term422853.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term422853, term422853.getClass(), "isFullBell", false);
        setBooleanField(term422853, term422853.getClass(), "isFullCombo", false);
        setBooleanField(term422853, term422853.getClass(), "isAllBreake", false);
        setBooleanField(term422853, term422853.getClass(), "isLock", false);
        setIntField(term422853, term422853.getClass(), "clearStatus", 0);
        setBooleanField(term422853, term422853.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleScoreMax", argTypes, term422853, args);
    }

};


