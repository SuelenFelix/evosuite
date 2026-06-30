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

public class UserData_getLastPlayDate_1379562374149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175975;

    public UserData_getLastPlayDate_1379562374149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175975 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175975, term175975.getClass(), "id", 0L);
        setField(term175975, term175975.getClass(), "card", null);
        setField(term175975, term175975.getClass(), "userName", null);
        setField(term175975, term175975.getClass(), "lastLoginDate", null);
        setBooleanField(term175975, term175975.getClass(), "isWebJoin", false);
        setField(term175975, term175975.getClass(), "webLimitDate", null);
        setIntField(term175975, term175975.getClass(), "level", 0);
        setIntField(term175975, term175975.getClass(), "reincarnationNum", 0);
        setField(term175975, term175975.getClass(), "exp", null);
        setLongField(term175975, term175975.getClass(), "point", 0L);
        setLongField(term175975, term175975.getClass(), "totalPoint", 0L);
        setIntField(term175975, term175975.getClass(), "playCount", 0);
        setIntField(term175975, term175975.getClass(), "multiPlayCount", 0);
        setIntField(term175975, term175975.getClass(), "multiWinCount", 0);
        setIntField(term175975, term175975.getClass(), "requestResCount", 0);
        setIntField(term175975, term175975.getClass(), "acceptResCount", 0);
        setIntField(term175975, term175975.getClass(), "successResCount", 0);
        setIntField(term175975, term175975.getClass(), "playerRating", 0);
        setIntField(term175975, term175975.getClass(), "highestRating", 0);
        setIntField(term175975, term175975.getClass(), "nameplateId", 0);
        setIntField(term175975, term175975.getClass(), "frameId", 0);
        setIntField(term175975, term175975.getClass(), "characterId", 0);
        setIntField(term175975, term175975.getClass(), "trophyId", 0);
        setIntField(term175975, term175975.getClass(), "playedTutorialBit", 0);
        setIntField(term175975, term175975.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175975, term175975.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175975, term175975.getClass(), "totalRepertoireCount", 0);
        setIntField(term175975, term175975.getClass(), "totalMapNum", 0);
        setLongField(term175975, term175975.getClass(), "totalHiScore", 0L);
        setLongField(term175975, term175975.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175975, term175975.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175975, term175975.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175975, term175975.getClass(), "totalMasterHighScore", 0L);
        setField(term175975, term175975.getClass(), "eventWatchedDate", null);
        setIntField(term175975, term175975.getClass(), "friendCount", 0);
        setBooleanField(term175975, term175975.getClass(), "isMaimai", false);
        setField(term175975, term175975.getClass(), "firstGameId", null);
        setField(term175975, term175975.getClass(), "firstRomVersion", null);
        setField(term175975, term175975.getClass(), "firstDataVersion", null);
        setField(term175975, term175975.getClass(), "firstPlayDate", null);
        setField(term175975, term175975.getClass(), "lastGameId", null);
        setField(term175975, term175975.getClass(), "lastRomVersion", null);
        setField(term175975, term175975.getClass(), "lastDataVersion", null);
        setField(term175975, term175975.getClass(), "lastPlayDate", null);
        setIntField(term175975, term175975.getClass(), "lastPlaceId", 0);
        setField(term175975, term175975.getClass(), "lastPlaceName", null);
        setField(term175975, term175975.getClass(), "lastRegionId", null);
        setField(term175975, term175975.getClass(), "lastRegionName", null);
        setField(term175975, term175975.getClass(), "lastAllNetId", null);
        setField(term175975, term175975.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term175975, args);
    }

};


