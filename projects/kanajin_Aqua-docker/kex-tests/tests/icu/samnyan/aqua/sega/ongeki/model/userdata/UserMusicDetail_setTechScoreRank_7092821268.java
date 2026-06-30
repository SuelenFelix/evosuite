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

public class UserMusicDetail_setTechScoreRank_7092821268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423169;
     Object term423187;

    public UserMusicDetail_setTechScoreRank_7092821268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423169 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        setLongField(term423169, term423169.getClass(), "id", 0L);
        setField(term423169, term423169.getClass(), "user", null);
        setIntField(term423169, term423169.getClass(), "musicId", 0);
        setIntField(term423169, term423169.getClass(), "level", 0);
        setIntField(term423169, term423169.getClass(), "playCount", 0);
        setIntField(term423169, term423169.getClass(), "techScoreMax", 0);
        setIntField(term423169, term423169.getClass(), "techScoreRank", 0);
        setIntField(term423169, term423169.getClass(), "battleScoreMax", 0);
        setIntField(term423169, term423169.getClass(), "battleScoreRank", 0);
        setIntField(term423169, term423169.getClass(), "maxComboCount", 0);
        setIntField(term423169, term423169.getClass(), "maxOverKill", 0);
        setIntField(term423169, term423169.getClass(), "maxTeamOverKill", 0);
        setBooleanField(term423169, term423169.getClass(), "isFullBell", false);
        setBooleanField(term423169, term423169.getClass(), "isFullCombo", false);
        setBooleanField(term423169, term423169.getClass(), "isAllBreake", false);
        setBooleanField(term423169, term423169.getClass(), "isLock", false);
        setIntField(term423169, term423169.getClass(), "clearStatus", 0);
        setBooleanField(term423169, term423169.getClass(), "isStoryWatched", false);
        term423187 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term423187;
        callMethod(klass, "setTechScoreRank", argTypes, term423169, args);
    }

};


