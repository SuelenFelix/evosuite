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

public class UserData_getMultiWinCount_1466894255119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175015;

    public UserData_getMultiWinCount_1466894255119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175015 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175015, term175015.getClass(), "id", 0L);
        setField(term175015, term175015.getClass(), "card", null);
        setField(term175015, term175015.getClass(), "userName", null);
        setField(term175015, term175015.getClass(), "lastLoginDate", null);
        setBooleanField(term175015, term175015.getClass(), "isWebJoin", false);
        setField(term175015, term175015.getClass(), "webLimitDate", null);
        setIntField(term175015, term175015.getClass(), "level", 0);
        setIntField(term175015, term175015.getClass(), "reincarnationNum", 0);
        setField(term175015, term175015.getClass(), "exp", null);
        setLongField(term175015, term175015.getClass(), "point", 0L);
        setLongField(term175015, term175015.getClass(), "totalPoint", 0L);
        setIntField(term175015, term175015.getClass(), "playCount", 0);
        setIntField(term175015, term175015.getClass(), "multiPlayCount", 0);
        setIntField(term175015, term175015.getClass(), "multiWinCount", 0);
        setIntField(term175015, term175015.getClass(), "requestResCount", 0);
        setIntField(term175015, term175015.getClass(), "acceptResCount", 0);
        setIntField(term175015, term175015.getClass(), "successResCount", 0);
        setIntField(term175015, term175015.getClass(), "playerRating", 0);
        setIntField(term175015, term175015.getClass(), "highestRating", 0);
        setIntField(term175015, term175015.getClass(), "nameplateId", 0);
        setIntField(term175015, term175015.getClass(), "frameId", 0);
        setIntField(term175015, term175015.getClass(), "characterId", 0);
        setIntField(term175015, term175015.getClass(), "trophyId", 0);
        setIntField(term175015, term175015.getClass(), "playedTutorialBit", 0);
        setIntField(term175015, term175015.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175015, term175015.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175015, term175015.getClass(), "totalRepertoireCount", 0);
        setIntField(term175015, term175015.getClass(), "totalMapNum", 0);
        setLongField(term175015, term175015.getClass(), "totalHiScore", 0L);
        setLongField(term175015, term175015.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175015, term175015.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175015, term175015.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175015, term175015.getClass(), "totalMasterHighScore", 0L);
        setField(term175015, term175015.getClass(), "eventWatchedDate", null);
        setIntField(term175015, term175015.getClass(), "friendCount", 0);
        setBooleanField(term175015, term175015.getClass(), "isMaimai", false);
        setField(term175015, term175015.getClass(), "firstGameId", null);
        setField(term175015, term175015.getClass(), "firstRomVersion", null);
        setField(term175015, term175015.getClass(), "firstDataVersion", null);
        setField(term175015, term175015.getClass(), "firstPlayDate", null);
        setField(term175015, term175015.getClass(), "lastGameId", null);
        setField(term175015, term175015.getClass(), "lastRomVersion", null);
        setField(term175015, term175015.getClass(), "lastDataVersion", null);
        setField(term175015, term175015.getClass(), "lastPlayDate", null);
        setIntField(term175015, term175015.getClass(), "lastPlaceId", 0);
        setField(term175015, term175015.getClass(), "lastPlaceName", null);
        setField(term175015, term175015.getClass(), "lastRegionId", null);
        setField(term175015, term175015.getClass(), "lastRegionName", null);
        setField(term175015, term175015.getClass(), "lastAllNetId", null);
        setField(term175015, term175015.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiWinCount", argTypes, term175015, args);
    }

};


