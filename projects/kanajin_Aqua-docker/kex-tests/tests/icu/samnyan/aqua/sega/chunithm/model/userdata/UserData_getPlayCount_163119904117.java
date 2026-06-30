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

public class UserData_getPlayCount_163119904117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174951;

    public UserData_getPlayCount_163119904117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174951 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174951, term174951.getClass(), "id", 0L);
        setField(term174951, term174951.getClass(), "card", null);
        setField(term174951, term174951.getClass(), "userName", null);
        setField(term174951, term174951.getClass(), "lastLoginDate", null);
        setBooleanField(term174951, term174951.getClass(), "isWebJoin", false);
        setField(term174951, term174951.getClass(), "webLimitDate", null);
        setIntField(term174951, term174951.getClass(), "level", 0);
        setIntField(term174951, term174951.getClass(), "reincarnationNum", 0);
        setField(term174951, term174951.getClass(), "exp", null);
        setLongField(term174951, term174951.getClass(), "point", 0L);
        setLongField(term174951, term174951.getClass(), "totalPoint", 0L);
        setIntField(term174951, term174951.getClass(), "playCount", 0);
        setIntField(term174951, term174951.getClass(), "multiPlayCount", 0);
        setIntField(term174951, term174951.getClass(), "multiWinCount", 0);
        setIntField(term174951, term174951.getClass(), "requestResCount", 0);
        setIntField(term174951, term174951.getClass(), "acceptResCount", 0);
        setIntField(term174951, term174951.getClass(), "successResCount", 0);
        setIntField(term174951, term174951.getClass(), "playerRating", 0);
        setIntField(term174951, term174951.getClass(), "highestRating", 0);
        setIntField(term174951, term174951.getClass(), "nameplateId", 0);
        setIntField(term174951, term174951.getClass(), "frameId", 0);
        setIntField(term174951, term174951.getClass(), "characterId", 0);
        setIntField(term174951, term174951.getClass(), "trophyId", 0);
        setIntField(term174951, term174951.getClass(), "playedTutorialBit", 0);
        setIntField(term174951, term174951.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174951, term174951.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174951, term174951.getClass(), "totalRepertoireCount", 0);
        setIntField(term174951, term174951.getClass(), "totalMapNum", 0);
        setLongField(term174951, term174951.getClass(), "totalHiScore", 0L);
        setLongField(term174951, term174951.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174951, term174951.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174951, term174951.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174951, term174951.getClass(), "totalMasterHighScore", 0L);
        setField(term174951, term174951.getClass(), "eventWatchedDate", null);
        setIntField(term174951, term174951.getClass(), "friendCount", 0);
        setBooleanField(term174951, term174951.getClass(), "isMaimai", false);
        setField(term174951, term174951.getClass(), "firstGameId", null);
        setField(term174951, term174951.getClass(), "firstRomVersion", null);
        setField(term174951, term174951.getClass(), "firstDataVersion", null);
        setField(term174951, term174951.getClass(), "firstPlayDate", null);
        setField(term174951, term174951.getClass(), "lastGameId", null);
        setField(term174951, term174951.getClass(), "lastRomVersion", null);
        setField(term174951, term174951.getClass(), "lastDataVersion", null);
        setField(term174951, term174951.getClass(), "lastPlayDate", null);
        setIntField(term174951, term174951.getClass(), "lastPlaceId", 0);
        setField(term174951, term174951.getClass(), "lastPlaceName", null);
        setField(term174951, term174951.getClass(), "lastRegionId", null);
        setField(term174951, term174951.getClass(), "lastRegionName", null);
        setField(term174951, term174951.getClass(), "lastAllNetId", null);
        setField(term174951, term174951.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term174951, args);
    }

};


