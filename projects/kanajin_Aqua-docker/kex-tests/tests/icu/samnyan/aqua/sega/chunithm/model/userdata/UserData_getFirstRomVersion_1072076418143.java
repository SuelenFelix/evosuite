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

public class UserData_getFirstRomVersion_1072076418143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175783;

    public UserData_getFirstRomVersion_1072076418143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175783 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175783, term175783.getClass(), "id", 0L);
        setField(term175783, term175783.getClass(), "card", null);
        setField(term175783, term175783.getClass(), "userName", null);
        setField(term175783, term175783.getClass(), "lastLoginDate", null);
        setBooleanField(term175783, term175783.getClass(), "isWebJoin", false);
        setField(term175783, term175783.getClass(), "webLimitDate", null);
        setIntField(term175783, term175783.getClass(), "level", 0);
        setIntField(term175783, term175783.getClass(), "reincarnationNum", 0);
        setField(term175783, term175783.getClass(), "exp", null);
        setLongField(term175783, term175783.getClass(), "point", 0L);
        setLongField(term175783, term175783.getClass(), "totalPoint", 0L);
        setIntField(term175783, term175783.getClass(), "playCount", 0);
        setIntField(term175783, term175783.getClass(), "multiPlayCount", 0);
        setIntField(term175783, term175783.getClass(), "multiWinCount", 0);
        setIntField(term175783, term175783.getClass(), "requestResCount", 0);
        setIntField(term175783, term175783.getClass(), "acceptResCount", 0);
        setIntField(term175783, term175783.getClass(), "successResCount", 0);
        setIntField(term175783, term175783.getClass(), "playerRating", 0);
        setIntField(term175783, term175783.getClass(), "highestRating", 0);
        setIntField(term175783, term175783.getClass(), "nameplateId", 0);
        setIntField(term175783, term175783.getClass(), "frameId", 0);
        setIntField(term175783, term175783.getClass(), "characterId", 0);
        setIntField(term175783, term175783.getClass(), "trophyId", 0);
        setIntField(term175783, term175783.getClass(), "playedTutorialBit", 0);
        setIntField(term175783, term175783.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175783, term175783.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175783, term175783.getClass(), "totalRepertoireCount", 0);
        setIntField(term175783, term175783.getClass(), "totalMapNum", 0);
        setLongField(term175783, term175783.getClass(), "totalHiScore", 0L);
        setLongField(term175783, term175783.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175783, term175783.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175783, term175783.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175783, term175783.getClass(), "totalMasterHighScore", 0L);
        setField(term175783, term175783.getClass(), "eventWatchedDate", null);
        setIntField(term175783, term175783.getClass(), "friendCount", 0);
        setBooleanField(term175783, term175783.getClass(), "isMaimai", false);
        setField(term175783, term175783.getClass(), "firstGameId", null);
        setField(term175783, term175783.getClass(), "firstRomVersion", null);
        setField(term175783, term175783.getClass(), "firstDataVersion", null);
        setField(term175783, term175783.getClass(), "firstPlayDate", null);
        setField(term175783, term175783.getClass(), "lastGameId", null);
        setField(term175783, term175783.getClass(), "lastRomVersion", null);
        setField(term175783, term175783.getClass(), "lastDataVersion", null);
        setField(term175783, term175783.getClass(), "lastPlayDate", null);
        setIntField(term175783, term175783.getClass(), "lastPlaceId", 0);
        setField(term175783, term175783.getClass(), "lastPlaceName", null);
        setField(term175783, term175783.getClass(), "lastRegionId", null);
        setField(term175783, term175783.getClass(), "lastRegionName", null);
        setField(term175783, term175783.getClass(), "lastAllNetId", null);
        setField(term175783, term175783.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term175783, args);
    }

};


