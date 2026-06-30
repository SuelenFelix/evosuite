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

public class UserMusicDetail_setMusicId_174450467664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423089;
     Object term423107;

    public UserMusicDetail_setMusicId_174450467664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423089 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423089, term423089.getClass(), "id", 0L);
        setField(term423089, term423089.getClass(), "user", null);
        setIntField(term423089, term423089.getClass(), "musicId", 0);
        setIntField(term423089, term423089.getClass(), "level", 0);
        setIntField(term423089, term423089.getClass(), "playCount", 0);
        setIntField(term423089, term423089.getClass(), "techScoreMax", 0);
        setIntField(term423089, term423089.getClass(), "techScoreRank", 0);
        setIntField(term423089, term423089.getClass(), "battleScoreMax", 0);
        setIntField(term423089, term423089.getClass(), "battleScoreRank", 0);
        setIntField(term423089, term423089.getClass(), "maxComboCount", 0);
        setIntField(term423089, term423089.getClass(), "maxOverKill", 0);
        setIntField(term423089, term423089.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423089, term423089.getClass(), "isFullBell", false);
        setBooleanField(term423089, term423089.getClass(), "isFullCombo", false);
        setBooleanField(term423089, term423089.getClass(), "isAllBreake", false);
        setBooleanField(term423089, term423089.getClass(), "isLock", false);
        setIntField(term423089, term423089.getClass(), "clearStatus", 0);
        setBooleanField(term423089, term423089.getClass(), "isStoryWatched", false);
        term423107 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term423107;
        callMethod(klass, "setMusicId", argTypes, term423089, args);
    }

};


