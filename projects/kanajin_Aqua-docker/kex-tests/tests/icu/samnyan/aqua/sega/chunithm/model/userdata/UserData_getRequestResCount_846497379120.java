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

public class UserData_getRequestResCount_846497379120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175047;

    public UserData_getRequestResCount_846497379120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175047 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175047, term175047.getClass(), "id", 0L);
        setField(term175047, term175047.getClass(), "card", null);
        setField(term175047, term175047.getClass(), "userName", null);
        setField(term175047, term175047.getClass(), "lastLoginDate", null);
        setBooleanField(term175047, term175047.getClass(), "isWebJoin", false);
        setField(term175047, term175047.getClass(), "webLimitDate", null);
        setIntField(term175047, term175047.getClass(), "level", 0);
        setIntField(term175047, term175047.getClass(), "reincarnationNum", 0);
        setField(term175047, term175047.getClass(), "exp", null);
        setLongField(term175047, term175047.getClass(), "point", 0L);
        setLongField(term175047, term175047.getClass(), "totalPoint", 0L);
        setIntField(term175047, term175047.getClass(), "playCount", 0);
        setIntField(term175047, term175047.getClass(), "multiPlayCount", 0);
        setIntField(term175047, term175047.getClass(), "multiWinCount", 0);
        setIntField(term175047, term175047.getClass(), "requestResCount", 0);
        setIntField(term175047, term175047.getClass(), "acceptResCount", 0);
        setIntField(term175047, term175047.getClass(), "successResCount", 0);
        setIntField(term175047, term175047.getClass(), "playerRating", 0);
        setIntField(term175047, term175047.getClass(), "highestRating", 0);
        setIntField(term175047, term175047.getClass(), "nameplateId", 0);
        setIntField(term175047, term175047.getClass(), "frameId", 0);
        setIntField(term175047, term175047.getClass(), "characterId", 0);
        setIntField(term175047, term175047.getClass(), "trophyId", 0);
        setIntField(term175047, term175047.getClass(), "playedTutorialBit", 0);
        setIntField(term175047, term175047.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175047, term175047.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175047, term175047.getClass(), "totalRepertoireCount", 0);
        setIntField(term175047, term175047.getClass(), "totalMapNum", 0);
        setLongField(term175047, term175047.getClass(), "totalHiScore", 0L);
        setLongField(term175047, term175047.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175047, term175047.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175047, term175047.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175047, term175047.getClass(), "totalMasterHighScore", 0L);
        setField(term175047, term175047.getClass(), "eventWatchedDate", null);
        setIntField(term175047, term175047.getClass(), "friendCount", 0);
        setBooleanField(term175047, term175047.getClass(), "isMaimai", false);
        setField(term175047, term175047.getClass(), "firstGameId", null);
        setField(term175047, term175047.getClass(), "firstRomVersion", null);
        setField(term175047, term175047.getClass(), "firstDataVersion", null);
        setField(term175047, term175047.getClass(), "firstPlayDate", null);
        setField(term175047, term175047.getClass(), "lastGameId", null);
        setField(term175047, term175047.getClass(), "lastRomVersion", null);
        setField(term175047, term175047.getClass(), "lastDataVersion", null);
        setField(term175047, term175047.getClass(), "lastPlayDate", null);
        setIntField(term175047, term175047.getClass(), "lastPlaceId", 0);
        setField(term175047, term175047.getClass(), "lastPlaceName", null);
        setField(term175047, term175047.getClass(), "lastRegionId", null);
        setField(term175047, term175047.getClass(), "lastRegionName", null);
        setField(term175047, term175047.getClass(), "lastAllNetId", null);
        setField(term175047, term175047.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestResCount", argTypes, term175047, args);
    }

};


