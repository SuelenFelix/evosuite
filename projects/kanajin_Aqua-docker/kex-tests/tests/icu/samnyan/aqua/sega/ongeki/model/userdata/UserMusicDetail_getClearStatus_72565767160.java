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

public class UserMusicDetail_getClearStatus_72565767160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423015;

    public UserMusicDetail_getClearStatus_72565767160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423015 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423015, term423015.getClass(), "id", 0L);
        setField(term423015, term423015.getClass(), "user", null);
        setIntField(term423015, term423015.getClass(), "musicId", 0);
        setIntField(term423015, term423015.getClass(), "level", 0);
        setIntField(term423015, term423015.getClass(), "playCount", 0);
        setIntField(term423015, term423015.getClass(), "techScoreMax", 0);
        setIntField(term423015, term423015.getClass(), "techScoreRank", 0);
        setIntField(term423015, term423015.getClass(), "battleScoreMax", 0);
        setIntField(term423015, term423015.getClass(), "battleScoreRank", 0);
        setIntField(term423015, term423015.getClass(), "maxComboCount", 0);
        setIntField(term423015, term423015.getClass(), "maxOverKill", 0);
        setIntField(term423015, term423015.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423015, term423015.getClass(), "isFullBell", false);
        setBooleanField(term423015, term423015.getClass(), "isFullCombo", false);
        setBooleanField(term423015, term423015.getClass(), "isAllBreake", false);
        setBooleanField(term423015, term423015.getClass(), "isLock", false);
        setIntField(term423015, term423015.getClass(), "clearStatus", 0);
        setBooleanField(term423015, term423015.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearStatus", argTypes, term423015, args);
    }

};


