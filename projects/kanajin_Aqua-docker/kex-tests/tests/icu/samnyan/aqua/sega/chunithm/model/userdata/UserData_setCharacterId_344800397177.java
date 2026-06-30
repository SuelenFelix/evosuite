package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setCharacterId_344800397177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176903;
     Object term176935;

    public UserData_setCharacterId_344800397177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176903 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176903, term176903.getClass(), "id", 0L);
        setField(term176903, term176903.getClass(), "card", null);
        setField(term176903, term176903.getClass(), "userName", null);
        setField(term176903, term176903.getClass(), "lastLoginDate", null);
        setBooleanField(term176903, term176903.getClass(), "isWebJoin", false);
        setField(term176903, term176903.getClass(), "webLimitDate", null);
        setIntField(term176903, term176903.getClass(), "level", 0);
        setIntField(term176903, term176903.getClass(), "reincarnationNum", 0);
        setField(term176903, term176903.getClass(), "exp", null);
        setLongField(term176903, term176903.getClass(), "point", 0L);
        setLongField(term176903, term176903.getClass(), "totalPoint", 0L);
        setIntField(term176903, term176903.getClass(), "playCount", 0);
        setIntField(term176903, term176903.getClass(), "multiPlayCount", 0);
        setIntField(term176903, term176903.getClass(), "multiWinCount", 0);
        setIntField(term176903, term176903.getClass(), "requestResCount", 0);
        setIntField(term176903, term176903.getClass(), "acceptResCount", 0);
        setIntField(term176903, term176903.getClass(), "successResCount", 0);
        setIntField(term176903, term176903.getClass(), "playerRating", 0);
        setIntField(term176903, term176903.getClass(), "highestRating", 0);
        setIntField(term176903, term176903.getClass(), "nameplateId", 0);
        setIntField(term176903, term176903.getClass(), "frameId", 0);
        setIntField(term176903, term176903.getClass(), "characterId", 0);
        setIntField(term176903, term176903.getClass(), "trophyId", 0);
        setIntField(term176903, term176903.getClass(), "playedTutorialBit", 0);
        setIntField(term176903, term176903.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176903, term176903.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176903, term176903.getClass(), "totalRepertoireCount", 0);
        setIntField(term176903, term176903.getClass(), "totalMapNum", 0);
        setLongField(term176903, term176903.getClass(), "totalHiScore", 0L);
        setLongField(term176903, term176903.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176903, term176903.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176903, term176903.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176903, term176903.getClass(), "totalMasterHighScore", 0L);
        setField(term176903, term176903.getClass(), "eventWatchedDate", null);
        setIntField(term176903, term176903.getClass(), "friendCount", 0);
        setBooleanField(term176903, term176903.getClass(), "isMaimai", false);
        setField(term176903, term176903.getClass(), "firstGameId", null);
        setField(term176903, term176903.getClass(), "firstRomVersion", null);
        setField(term176903, term176903.getClass(), "firstDataVersion", null);
        setField(term176903, term176903.getClass(), "firstPlayDate", null);
        setField(term176903, term176903.getClass(), "lastGameId", null);
        setField(term176903, term176903.getClass(), "lastRomVersion", null);
        setField(term176903, term176903.getClass(), "lastDataVersion", null);
        setField(term176903, term176903.getClass(), "lastPlayDate", null);
        setIntField(term176903, term176903.getClass(), "lastPlaceId", 0);
        setField(term176903, term176903.getClass(), "lastPlaceName", null);
        setField(term176903, term176903.getClass(), "lastRegionId", null);
        setField(term176903, term176903.getClass(), "lastRegionName", null);
        setField(term176903, term176903.getClass(), "lastAllNetId", null);
        setField(term176903, term176903.getClass(), "lastClientId", null);
        term176935 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176935;
        callMethod(klass, "setCharacterId", argTypes, term176903, args);
    }

};


