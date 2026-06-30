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

public class UserData_getEventWatchedDate_1972291780139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175655;

    public UserData_getEventWatchedDate_1972291780139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175655 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175655, term175655.getClass(), "id", 0L);
        setField(term175655, term175655.getClass(), "card", null);
        setField(term175655, term175655.getClass(), "userName", null);
        setField(term175655, term175655.getClass(), "lastLoginDate", null);
        setBooleanField(term175655, term175655.getClass(), "isWebJoin", false);
        setField(term175655, term175655.getClass(), "webLimitDate", null);
        setIntField(term175655, term175655.getClass(), "level", 0);
        setIntField(term175655, term175655.getClass(), "reincarnationNum", 0);
        setField(term175655, term175655.getClass(), "exp", null);
        setLongField(term175655, term175655.getClass(), "point", 0L);
        setLongField(term175655, term175655.getClass(), "totalPoint", 0L);
        setIntField(term175655, term175655.getClass(), "playCount", 0);
        setIntField(term175655, term175655.getClass(), "multiPlayCount", 0);
        setIntField(term175655, term175655.getClass(), "multiWinCount", 0);
        setIntField(term175655, term175655.getClass(), "requestResCount", 0);
        setIntField(term175655, term175655.getClass(), "acceptResCount", 0);
        setIntField(term175655, term175655.getClass(), "successResCount", 0);
        setIntField(term175655, term175655.getClass(), "playerRating", 0);
        setIntField(term175655, term175655.getClass(), "highestRating", 0);
        setIntField(term175655, term175655.getClass(), "nameplateId", 0);
        setIntField(term175655, term175655.getClass(), "frameId", 0);
        setIntField(term175655, term175655.getClass(), "characterId", 0);
        setIntField(term175655, term175655.getClass(), "trophyId", 0);
        setIntField(term175655, term175655.getClass(), "playedTutorialBit", 0);
        setIntField(term175655, term175655.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175655, term175655.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175655, term175655.getClass(), "totalRepertoireCount", 0);
        setIntField(term175655, term175655.getClass(), "totalMapNum", 0);
        setLongField(term175655, term175655.getClass(), "totalHiScore", 0L);
        setLongField(term175655, term175655.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175655, term175655.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175655, term175655.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175655, term175655.getClass(), "totalMasterHighScore", 0L);
        setField(term175655, term175655.getClass(), "eventWatchedDate", null);
        setIntField(term175655, term175655.getClass(), "friendCount", 0);
        setBooleanField(term175655, term175655.getClass(), "isMaimai", false);
        setField(term175655, term175655.getClass(), "firstGameId", null);
        setField(term175655, term175655.getClass(), "firstRomVersion", null);
        setField(term175655, term175655.getClass(), "firstDataVersion", null);
        setField(term175655, term175655.getClass(), "firstPlayDate", null);
        setField(term175655, term175655.getClass(), "lastGameId", null);
        setField(term175655, term175655.getClass(), "lastRomVersion", null);
        setField(term175655, term175655.getClass(), "lastDataVersion", null);
        setField(term175655, term175655.getClass(), "lastPlayDate", null);
        setIntField(term175655, term175655.getClass(), "lastPlaceId", 0);
        setField(term175655, term175655.getClass(), "lastPlaceName", null);
        setField(term175655, term175655.getClass(), "lastRegionId", null);
        setField(term175655, term175655.getClass(), "lastRegionName", null);
        setField(term175655, term175655.getClass(), "lastAllNetId", null);
        setField(term175655, term175655.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term175655, args);
    }

};


