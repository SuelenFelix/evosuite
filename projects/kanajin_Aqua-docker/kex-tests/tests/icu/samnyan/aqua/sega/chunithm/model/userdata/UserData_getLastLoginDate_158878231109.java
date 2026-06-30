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

public class UserData_getLastLoginDate_158878231109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174695;

    public UserData_getLastLoginDate_158878231109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174695 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174695, term174695.getClass(), "id", 0L);
        setField(term174695, term174695.getClass(), "card", null);
        setField(term174695, term174695.getClass(), "userName", null);
        setField(term174695, term174695.getClass(), "lastLoginDate", null);
        setBooleanField(term174695, term174695.getClass(), "isWebJoin", false);
        setField(term174695, term174695.getClass(), "webLimitDate", null);
        setIntField(term174695, term174695.getClass(), "level", 0);
        setIntField(term174695, term174695.getClass(), "reincarnationNum", 0);
        setField(term174695, term174695.getClass(), "exp", null);
        setLongField(term174695, term174695.getClass(), "point", 0L);
        setLongField(term174695, term174695.getClass(), "totalPoint", 0L);
        setIntField(term174695, term174695.getClass(), "playCount", 0);
        setIntField(term174695, term174695.getClass(), "multiPlayCount", 0);
        setIntField(term174695, term174695.getClass(), "multiWinCount", 0);
        setIntField(term174695, term174695.getClass(), "requestResCount", 0);
        setIntField(term174695, term174695.getClass(), "acceptResCount", 0);
        setIntField(term174695, term174695.getClass(), "successResCount", 0);
        setIntField(term174695, term174695.getClass(), "playerRating", 0);
        setIntField(term174695, term174695.getClass(), "highestRating", 0);
        setIntField(term174695, term174695.getClass(), "nameplateId", 0);
        setIntField(term174695, term174695.getClass(), "frameId", 0);
        setIntField(term174695, term174695.getClass(), "characterId", 0);
        setIntField(term174695, term174695.getClass(), "trophyId", 0);
        setIntField(term174695, term174695.getClass(), "playedTutorialBit", 0);
        setIntField(term174695, term174695.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174695, term174695.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174695, term174695.getClass(), "totalRepertoireCount", 0);
        setIntField(term174695, term174695.getClass(), "totalMapNum", 0);
        setLongField(term174695, term174695.getClass(), "totalHiScore", 0L);
        setLongField(term174695, term174695.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174695, term174695.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174695, term174695.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174695, term174695.getClass(), "totalMasterHighScore", 0L);
        setField(term174695, term174695.getClass(), "eventWatchedDate", null);
        setIntField(term174695, term174695.getClass(), "friendCount", 0);
        setBooleanField(term174695, term174695.getClass(), "isMaimai", false);
        setField(term174695, term174695.getClass(), "firstGameId", null);
        setField(term174695, term174695.getClass(), "firstRomVersion", null);
        setField(term174695, term174695.getClass(), "firstDataVersion", null);
        setField(term174695, term174695.getClass(), "firstPlayDate", null);
        setField(term174695, term174695.getClass(), "lastGameId", null);
        setField(term174695, term174695.getClass(), "lastRomVersion", null);
        setField(term174695, term174695.getClass(), "lastDataVersion", null);
        setField(term174695, term174695.getClass(), "lastPlayDate", null);
        setIntField(term174695, term174695.getClass(), "lastPlaceId", 0);
        setField(term174695, term174695.getClass(), "lastPlaceName", null);
        setField(term174695, term174695.getClass(), "lastRegionId", null);
        setField(term174695, term174695.getClass(), "lastRegionName", null);
        setField(term174695, term174695.getClass(), "lastAllNetId", null);
        setField(term174695, term174695.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term174695, args);
    }

};


