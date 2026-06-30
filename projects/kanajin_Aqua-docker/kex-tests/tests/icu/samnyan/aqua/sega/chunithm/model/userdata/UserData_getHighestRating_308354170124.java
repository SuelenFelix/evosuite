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

public class UserData_getHighestRating_308354170124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175175;

    public UserData_getHighestRating_308354170124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175175 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175175, term175175.getClass(), "id", 0L);
        setField(term175175, term175175.getClass(), "card", null);
        setField(term175175, term175175.getClass(), "userName", null);
        setField(term175175, term175175.getClass(), "lastLoginDate", null);
        setBooleanField(term175175, term175175.getClass(), "isWebJoin", false);
        setField(term175175, term175175.getClass(), "webLimitDate", null);
        setIntField(term175175, term175175.getClass(), "level", 0);
        setIntField(term175175, term175175.getClass(), "reincarnationNum", 0);
        setField(term175175, term175175.getClass(), "exp", null);
        setLongField(term175175, term175175.getClass(), "point", 0L);
        setLongField(term175175, term175175.getClass(), "totalPoint", 0L);
        setIntField(term175175, term175175.getClass(), "playCount", 0);
        setIntField(term175175, term175175.getClass(), "multiPlayCount", 0);
        setIntField(term175175, term175175.getClass(), "multiWinCount", 0);
        setIntField(term175175, term175175.getClass(), "requestResCount", 0);
        setIntField(term175175, term175175.getClass(), "acceptResCount", 0);
        setIntField(term175175, term175175.getClass(), "successResCount", 0);
        setIntField(term175175, term175175.getClass(), "playerRating", 0);
        setIntField(term175175, term175175.getClass(), "highestRating", 0);
        setIntField(term175175, term175175.getClass(), "nameplateId", 0);
        setIntField(term175175, term175175.getClass(), "frameId", 0);
        setIntField(term175175, term175175.getClass(), "characterId", 0);
        setIntField(term175175, term175175.getClass(), "trophyId", 0);
        setIntField(term175175, term175175.getClass(), "playedTutorialBit", 0);
        setIntField(term175175, term175175.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175175, term175175.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175175, term175175.getClass(), "totalRepertoireCount", 0);
        setIntField(term175175, term175175.getClass(), "totalMapNum", 0);
        setLongField(term175175, term175175.getClass(), "totalHiScore", 0L);
        setLongField(term175175, term175175.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175175, term175175.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175175, term175175.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175175, term175175.getClass(), "totalMasterHighScore", 0L);
        setField(term175175, term175175.getClass(), "eventWatchedDate", null);
        setIntField(term175175, term175175.getClass(), "friendCount", 0);
        setBooleanField(term175175, term175175.getClass(), "isMaimai", false);
        setField(term175175, term175175.getClass(), "firstGameId", null);
        setField(term175175, term175175.getClass(), "firstRomVersion", null);
        setField(term175175, term175175.getClass(), "firstDataVersion", null);
        setField(term175175, term175175.getClass(), "firstPlayDate", null);
        setField(term175175, term175175.getClass(), "lastGameId", null);
        setField(term175175, term175175.getClass(), "lastRomVersion", null);
        setField(term175175, term175175.getClass(), "lastDataVersion", null);
        setField(term175175, term175175.getClass(), "lastPlayDate", null);
        setIntField(term175175, term175175.getClass(), "lastPlaceId", 0);
        setField(term175175, term175175.getClass(), "lastPlaceName", null);
        setField(term175175, term175175.getClass(), "lastRegionId", null);
        setField(term175175, term175175.getClass(), "lastRegionName", null);
        setField(term175175, term175175.getClass(), "lastAllNetId", null);
        setField(term175175, term175175.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term175175, args);
    }

};


