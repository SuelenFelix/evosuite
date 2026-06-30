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

public class UserData_getPoint_732368917115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174887;

    public UserData_getPoint_732368917115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174887, term174887.getClass(), "id", 0L);
        setField(term174887, term174887.getClass(), "card", null);
        setField(term174887, term174887.getClass(), "userName", null);
        setField(term174887, term174887.getClass(), "lastLoginDate", null);
        setBooleanField(term174887, term174887.getClass(), "isWebJoin", false);
        setField(term174887, term174887.getClass(), "webLimitDate", null);
        setIntField(term174887, term174887.getClass(), "level", 0);
        setIntField(term174887, term174887.getClass(), "reincarnationNum", 0);
        setField(term174887, term174887.getClass(), "exp", null);
        setLongField(term174887, term174887.getClass(), "point", 0L);
        setLongField(term174887, term174887.getClass(), "totalPoint", 0L);
        setIntField(term174887, term174887.getClass(), "playCount", 0);
        setIntField(term174887, term174887.getClass(), "multiPlayCount", 0);
        setIntField(term174887, term174887.getClass(), "multiWinCount", 0);
        setIntField(term174887, term174887.getClass(), "requestResCount", 0);
        setIntField(term174887, term174887.getClass(), "acceptResCount", 0);
        setIntField(term174887, term174887.getClass(), "successResCount", 0);
        setIntField(term174887, term174887.getClass(), "playerRating", 0);
        setIntField(term174887, term174887.getClass(), "highestRating", 0);
        setIntField(term174887, term174887.getClass(), "nameplateId", 0);
        setIntField(term174887, term174887.getClass(), "frameId", 0);
        setIntField(term174887, term174887.getClass(), "characterId", 0);
        setIntField(term174887, term174887.getClass(), "trophyId", 0);
        setIntField(term174887, term174887.getClass(), "playedTutorialBit", 0);
        setIntField(term174887, term174887.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174887, term174887.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174887, term174887.getClass(), "totalRepertoireCount", 0);
        setIntField(term174887, term174887.getClass(), "totalMapNum", 0);
        setLongField(term174887, term174887.getClass(), "totalHiScore", 0L);
        setLongField(term174887, term174887.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174887, term174887.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174887, term174887.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174887, term174887.getClass(), "totalMasterHighScore", 0L);
        setField(term174887, term174887.getClass(), "eventWatchedDate", null);
        setIntField(term174887, term174887.getClass(), "friendCount", 0);
        setBooleanField(term174887, term174887.getClass(), "isMaimai", false);
        setField(term174887, term174887.getClass(), "firstGameId", null);
        setField(term174887, term174887.getClass(), "firstRomVersion", null);
        setField(term174887, term174887.getClass(), "firstDataVersion", null);
        setField(term174887, term174887.getClass(), "firstPlayDate", null);
        setField(term174887, term174887.getClass(), "lastGameId", null);
        setField(term174887, term174887.getClass(), "lastRomVersion", null);
        setField(term174887, term174887.getClass(), "lastDataVersion", null);
        setField(term174887, term174887.getClass(), "lastPlayDate", null);
        setIntField(term174887, term174887.getClass(), "lastPlaceId", 0);
        setField(term174887, term174887.getClass(), "lastPlaceName", null);
        setField(term174887, term174887.getClass(), "lastRegionId", null);
        setField(term174887, term174887.getClass(), "lastRegionName", null);
        setField(term174887, term174887.getClass(), "lastAllNetId", null);
        setField(term174887, term174887.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term174887, args);
    }

};


