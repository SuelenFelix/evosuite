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

public class UserMusicDetail_setClearStatus_174149405178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423369;
     Object term423387;

    public UserMusicDetail_setClearStatus_174149405178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423369 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423369, term423369.getClass(), "id", 0L);
        setField(term423369, term423369.getClass(), "user", null);
        setIntField(term423369, term423369.getClass(), "musicId", 0);
        setIntField(term423369, term423369.getClass(), "level", 0);
        setIntField(term423369, term423369.getClass(), "playCount", 0);
        setIntField(term423369, term423369.getClass(), "techScoreMax", 0);
        setIntField(term423369, term423369.getClass(), "techScoreRank", 0);
        setIntField(term423369, term423369.getClass(), "battleScoreMax", 0);
        setIntField(term423369, term423369.getClass(), "battleScoreRank", 0);
        setIntField(term423369, term423369.getClass(), "maxComboCount", 0);
        setIntField(term423369, term423369.getClass(), "maxOverKill", 0);
        setIntField(term423369, term423369.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423369, term423369.getClass(), "isFullBell", false);
        setBooleanField(term423369, term423369.getClass(), "isFullCombo", false);
        setBooleanField(term423369, term423369.getClass(), "isAllBreake", false);
        setBooleanField(term423369, term423369.getClass(), "isLock", false);
        setIntField(term423369, term423369.getClass(), "clearStatus", 0);
        setBooleanField(term423369, term423369.getClass(), "isStoryWatched", false);
        term423387 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term423387;
        callMethod(klass, "setClearStatus", argTypes, term423369, args);
    }

};


