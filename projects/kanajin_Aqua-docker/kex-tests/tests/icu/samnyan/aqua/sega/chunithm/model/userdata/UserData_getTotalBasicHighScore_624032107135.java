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

public class UserData_getTotalBasicHighScore_624032107135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175527;

    public UserData_getTotalBasicHighScore_624032107135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175527 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175527, term175527.getClass(), "id", 0L);
        setField(term175527, term175527.getClass(), "card", null);
        setField(term175527, term175527.getClass(), "userName", null);
        setField(term175527, term175527.getClass(), "lastLoginDate", null);
        setBooleanField(term175527, term175527.getClass(), "isWebJoin", false);
        setField(term175527, term175527.getClass(), "webLimitDate", null);
        setIntField(term175527, term175527.getClass(), "level", 0);
        setIntField(term175527, term175527.getClass(), "reincarnationNum", 0);
        setField(term175527, term175527.getClass(), "exp", null);
        setLongField(term175527, term175527.getClass(), "point", 0L);
        setLongField(term175527, term175527.getClass(), "totalPoint", 0L);
        setIntField(term175527, term175527.getClass(), "playCount", 0);
        setIntField(term175527, term175527.getClass(), "multiPlayCount", 0);
        setIntField(term175527, term175527.getClass(), "multiWinCount", 0);
        setIntField(term175527, term175527.getClass(), "requestResCount", 0);
        setIntField(term175527, term175527.getClass(), "acceptResCount", 0);
        setIntField(term175527, term175527.getClass(), "successResCount", 0);
        setIntField(term175527, term175527.getClass(), "playerRating", 0);
        setIntField(term175527, term175527.getClass(), "highestRating", 0);
        setIntField(term175527, term175527.getClass(), "nameplateId", 0);
        setIntField(term175527, term175527.getClass(), "frameId", 0);
        setIntField(term175527, term175527.getClass(), "characterId", 0);
        setIntField(term175527, term175527.getClass(), "trophyId", 0);
        setIntField(term175527, term175527.getClass(), "playedTutorialBit", 0);
        setIntField(term175527, term175527.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175527, term175527.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175527, term175527.getClass(), "totalRepertoireCount", 0);
        setIntField(term175527, term175527.getClass(), "totalMapNum", 0);
        setLongField(term175527, term175527.getClass(), "totalHiScore", 0L);
        setLongField(term175527, term175527.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175527, term175527.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175527, term175527.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175527, term175527.getClass(), "totalMasterHighScore", 0L);
        setField(term175527, term175527.getClass(), "eventWatchedDate", null);
        setIntField(term175527, term175527.getClass(), "friendCount", 0);
        setBooleanField(term175527, term175527.getClass(), "isMaimai", false);
        setField(term175527, term175527.getClass(), "firstGameId", null);
        setField(term175527, term175527.getClass(), "firstRomVersion", null);
        setField(term175527, term175527.getClass(), "firstDataVersion", null);
        setField(term175527, term175527.getClass(), "firstPlayDate", null);
        setField(term175527, term175527.getClass(), "lastGameId", null);
        setField(term175527, term175527.getClass(), "lastRomVersion", null);
        setField(term175527, term175527.getClass(), "lastDataVersion", null);
        setField(term175527, term175527.getClass(), "lastPlayDate", null);
        setIntField(term175527, term175527.getClass(), "lastPlaceId", 0);
        setField(term175527, term175527.getClass(), "lastPlaceName", null);
        setField(term175527, term175527.getClass(), "lastRegionId", null);
        setField(term175527, term175527.getClass(), "lastRegionName", null);
        setField(term175527, term175527.getClass(), "lastAllNetId", null);
        setField(term175527, term175527.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term175527, args);
    }

};


