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
import java.lang.Boolean;

public class UserMusicDetail_setFullBell_99939805474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423289;
     Object term423307;

    public UserMusicDetail_setFullBell_99939805474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423289 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423289, term423289.getClass(), "id", 0L);
        setField(term423289, term423289.getClass(), "user", null);
        setIntField(term423289, term423289.getClass(), "musicId", 0);
        setIntField(term423289, term423289.getClass(), "level", 0);
        setIntField(term423289, term423289.getClass(), "playCount", 0);
        setIntField(term423289, term423289.getClass(), "techScoreMax", 0);
        setIntField(term423289, term423289.getClass(), "techScoreRank", 0);
        setIntField(term423289, term423289.getClass(), "battleScoreMax", 0);
        setIntField(term423289, term423289.getClass(), "battleScoreRank", 0);
        setIntField(term423289, term423289.getClass(), "maxComboCount", 0);
        setIntField(term423289, term423289.getClass(), "maxOverKill", 0);
        setIntField(term423289, term423289.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423289, term423289.getClass(), "isFullBell", false);
        setBooleanField(term423289, term423289.getClass(), "isFullCombo", false);
        setBooleanField(term423289, term423289.getClass(), "isAllBreake", false);
        setBooleanField(term423289, term423289.getClass(), "isLock", false);
        setIntField(term423289, term423289.getClass(), "clearStatus", 0);
        setBooleanField(term423289, term423289.getClass(), "isStoryWatched", false);
        term423307 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term423307;
        callMethod(klass, "setFullBell", argTypes, term423289, args);
    }

};


