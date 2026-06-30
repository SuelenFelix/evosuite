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

public class UserData_getLastPlaceName_422121850151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176039;

    public UserData_getLastPlaceName_422121850151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176039 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176039, term176039.getClass(), "id", 0L);
        setField(term176039, term176039.getClass(), "card", null);
        setField(term176039, term176039.getClass(), "userName", null);
        setField(term176039, term176039.getClass(), "lastLoginDate", null);
        setBooleanField(term176039, term176039.getClass(), "isWebJoin", false);
        setField(term176039, term176039.getClass(), "webLimitDate", null);
        setIntField(term176039, term176039.getClass(), "level", 0);
        setIntField(term176039, term176039.getClass(), "reincarnationNum", 0);
        setField(term176039, term176039.getClass(), "exp", null);
        setLongField(term176039, term176039.getClass(), "point", 0L);
        setLongField(term176039, term176039.getClass(), "totalPoint", 0L);
        setIntField(term176039, term176039.getClass(), "playCount", 0);
        setIntField(term176039, term176039.getClass(), "multiPlayCount", 0);
        setIntField(term176039, term176039.getClass(), "multiWinCount", 0);
        setIntField(term176039, term176039.getClass(), "requestResCount", 0);
        setIntField(term176039, term176039.getClass(), "acceptResCount", 0);
        setIntField(term176039, term176039.getClass(), "successResCount", 0);
        setIntField(term176039, term176039.getClass(), "playerRating", 0);
        setIntField(term176039, term176039.getClass(), "highestRating", 0);
        setIntField(term176039, term176039.getClass(), "nameplateId", 0);
        setIntField(term176039, term176039.getClass(), "frameId", 0);
        setIntField(term176039, term176039.getClass(), "characterId", 0);
        setIntField(term176039, term176039.getClass(), "trophyId", 0);
        setIntField(term176039, term176039.getClass(), "playedTutorialBit", 0);
        setIntField(term176039, term176039.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176039, term176039.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176039, term176039.getClass(), "totalRepertoireCount", 0);
        setIntField(term176039, term176039.getClass(), "totalMapNum", 0);
        setLongField(term176039, term176039.getClass(), "totalHiScore", 0L);
        setLongField(term176039, term176039.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176039, term176039.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176039, term176039.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176039, term176039.getClass(), "totalMasterHighScore", 0L);
        setField(term176039, term176039.getClass(), "eventWatchedDate", null);
        setIntField(term176039, term176039.getClass(), "friendCount", 0);
        setBooleanField(term176039, term176039.getClass(), "isMaimai", false);
        setField(term176039, term176039.getClass(), "firstGameId", null);
        setField(term176039, term176039.getClass(), "firstRomVersion", null);
        setField(term176039, term176039.getClass(), "firstDataVersion", null);
        setField(term176039, term176039.getClass(), "firstPlayDate", null);
        setField(term176039, term176039.getClass(), "lastGameId", null);
        setField(term176039, term176039.getClass(), "lastRomVersion", null);
        setField(term176039, term176039.getClass(), "lastDataVersion", null);
        setField(term176039, term176039.getClass(), "lastPlayDate", null);
        setIntField(term176039, term176039.getClass(), "lastPlaceId", 0);
        setField(term176039, term176039.getClass(), "lastPlaceName", null);
        setField(term176039, term176039.getClass(), "lastRegionId", null);
        setField(term176039, term176039.getClass(), "lastRegionName", null);
        setField(term176039, term176039.getClass(), "lastAllNetId", null);
        setField(term176039, term176039.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term176039, args);
    }

};


