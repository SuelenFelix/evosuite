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

public class UserData_getLastPlaceId_1024190223150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176007;

    public UserData_getLastPlaceId_1024190223150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176007 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176007, term176007.getClass(), "id", 0L);
        setField(term176007, term176007.getClass(), "card", null);
        setField(term176007, term176007.getClass(), "userName", null);
        setField(term176007, term176007.getClass(), "lastLoginDate", null);
        setBooleanField(term176007, term176007.getClass(), "isWebJoin", false);
        setField(term176007, term176007.getClass(), "webLimitDate", null);
        setIntField(term176007, term176007.getClass(), "level", 0);
        setIntField(term176007, term176007.getClass(), "reincarnationNum", 0);
        setField(term176007, term176007.getClass(), "exp", null);
        setLongField(term176007, term176007.getClass(), "point", 0L);
        setLongField(term176007, term176007.getClass(), "totalPoint", 0L);
        setIntField(term176007, term176007.getClass(), "playCount", 0);
        setIntField(term176007, term176007.getClass(), "multiPlayCount", 0);
        setIntField(term176007, term176007.getClass(), "multiWinCount", 0);
        setIntField(term176007, term176007.getClass(), "requestResCount", 0);
        setIntField(term176007, term176007.getClass(), "acceptResCount", 0);
        setIntField(term176007, term176007.getClass(), "successResCount", 0);
        setIntField(term176007, term176007.getClass(), "playerRating", 0);
        setIntField(term176007, term176007.getClass(), "highestRating", 0);
        setIntField(term176007, term176007.getClass(), "nameplateId", 0);
        setIntField(term176007, term176007.getClass(), "frameId", 0);
        setIntField(term176007, term176007.getClass(), "characterId", 0);
        setIntField(term176007, term176007.getClass(), "trophyId", 0);
        setIntField(term176007, term176007.getClass(), "playedTutorialBit", 0);
        setIntField(term176007, term176007.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176007, term176007.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176007, term176007.getClass(), "totalRepertoireCount", 0);
        setIntField(term176007, term176007.getClass(), "totalMapNum", 0);
        setLongField(term176007, term176007.getClass(), "totalHiScore", 0L);
        setLongField(term176007, term176007.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176007, term176007.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176007, term176007.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176007, term176007.getClass(), "totalMasterHighScore", 0L);
        setField(term176007, term176007.getClass(), "eventWatchedDate", null);
        setIntField(term176007, term176007.getClass(), "friendCount", 0);
        setBooleanField(term176007, term176007.getClass(), "isMaimai", false);
        setField(term176007, term176007.getClass(), "firstGameId", null);
        setField(term176007, term176007.getClass(), "firstRomVersion", null);
        setField(term176007, term176007.getClass(), "firstDataVersion", null);
        setField(term176007, term176007.getClass(), "firstPlayDate", null);
        setField(term176007, term176007.getClass(), "lastGameId", null);
        setField(term176007, term176007.getClass(), "lastRomVersion", null);
        setField(term176007, term176007.getClass(), "lastDataVersion", null);
        setField(term176007, term176007.getClass(), "lastPlayDate", null);
        setIntField(term176007, term176007.getClass(), "lastPlaceId", 0);
        setField(term176007, term176007.getClass(), "lastPlaceName", null);
        setField(term176007, term176007.getClass(), "lastRegionId", null);
        setField(term176007, term176007.getClass(), "lastRegionName", null);
        setField(term176007, term176007.getClass(), "lastAllNetId", null);
        setField(term176007, term176007.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term176007, args);
    }

};


