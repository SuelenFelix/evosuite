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

public class UserData_getTotalPoint_1877061341116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174919;

    public UserData_getTotalPoint_1877061341116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174919 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174919, term174919.getClass(), "id", 0L);
        setField(term174919, term174919.getClass(), "card", null);
        setField(term174919, term174919.getClass(), "userName", null);
        setField(term174919, term174919.getClass(), "lastLoginDate", null);
        setBooleanField(term174919, term174919.getClass(), "isWebJoin", false);
        setField(term174919, term174919.getClass(), "webLimitDate", null);
        setIntField(term174919, term174919.getClass(), "level", 0);
        setIntField(term174919, term174919.getClass(), "reincarnationNum", 0);
        setField(term174919, term174919.getClass(), "exp", null);
        setLongField(term174919, term174919.getClass(), "point", 0L);
        setLongField(term174919, term174919.getClass(), "totalPoint", 0L);
        setIntField(term174919, term174919.getClass(), "playCount", 0);
        setIntField(term174919, term174919.getClass(), "multiPlayCount", 0);
        setIntField(term174919, term174919.getClass(), "multiWinCount", 0);
        setIntField(term174919, term174919.getClass(), "requestResCount", 0);
        setIntField(term174919, term174919.getClass(), "acceptResCount", 0);
        setIntField(term174919, term174919.getClass(), "successResCount", 0);
        setIntField(term174919, term174919.getClass(), "playerRating", 0);
        setIntField(term174919, term174919.getClass(), "highestRating", 0);
        setIntField(term174919, term174919.getClass(), "nameplateId", 0);
        setIntField(term174919, term174919.getClass(), "frameId", 0);
        setIntField(term174919, term174919.getClass(), "characterId", 0);
        setIntField(term174919, term174919.getClass(), "trophyId", 0);
        setIntField(term174919, term174919.getClass(), "playedTutorialBit", 0);
        setIntField(term174919, term174919.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174919, term174919.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174919, term174919.getClass(), "totalRepertoireCount", 0);
        setIntField(term174919, term174919.getClass(), "totalMapNum", 0);
        setLongField(term174919, term174919.getClass(), "totalHiScore", 0L);
        setLongField(term174919, term174919.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174919, term174919.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174919, term174919.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174919, term174919.getClass(), "totalMasterHighScore", 0L);
        setField(term174919, term174919.getClass(), "eventWatchedDate", null);
        setIntField(term174919, term174919.getClass(), "friendCount", 0);
        setBooleanField(term174919, term174919.getClass(), "isMaimai", false);
        setField(term174919, term174919.getClass(), "firstGameId", null);
        setField(term174919, term174919.getClass(), "firstRomVersion", null);
        setField(term174919, term174919.getClass(), "firstDataVersion", null);
        setField(term174919, term174919.getClass(), "firstPlayDate", null);
        setField(term174919, term174919.getClass(), "lastGameId", null);
        setField(term174919, term174919.getClass(), "lastRomVersion", null);
        setField(term174919, term174919.getClass(), "lastDataVersion", null);
        setField(term174919, term174919.getClass(), "lastPlayDate", null);
        setIntField(term174919, term174919.getClass(), "lastPlaceId", 0);
        setField(term174919, term174919.getClass(), "lastPlaceName", null);
        setField(term174919, term174919.getClass(), "lastRegionId", null);
        setField(term174919, term174919.getClass(), "lastRegionName", null);
        setField(term174919, term174919.getClass(), "lastAllNetId", null);
        setField(term174919, term174919.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term174919, args);
    }

};


