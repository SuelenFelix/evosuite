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

public class UserData_setLastRegionName_1487633565203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177765;

    public UserData_setLastRegionName_1487633565203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177765 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177765, term177765.getClass(), "id", 0L);
        setField(term177765, term177765.getClass(), "card", null);
        setField(term177765, term177765.getClass(), "userName", null);
        setField(term177765, term177765.getClass(), "lastLoginDate", null);
        setBooleanField(term177765, term177765.getClass(), "isWebJoin", false);
        setField(term177765, term177765.getClass(), "webLimitDate", null);
        setIntField(term177765, term177765.getClass(), "level", 0);
        setIntField(term177765, term177765.getClass(), "reincarnationNum", 0);
        setField(term177765, term177765.getClass(), "exp", null);
        setLongField(term177765, term177765.getClass(), "point", 0L);
        setLongField(term177765, term177765.getClass(), "totalPoint", 0L);
        setIntField(term177765, term177765.getClass(), "playCount", 0);
        setIntField(term177765, term177765.getClass(), "multiPlayCount", 0);
        setIntField(term177765, term177765.getClass(), "multiWinCount", 0);
        setIntField(term177765, term177765.getClass(), "requestResCount", 0);
        setIntField(term177765, term177765.getClass(), "acceptResCount", 0);
        setIntField(term177765, term177765.getClass(), "successResCount", 0);
        setIntField(term177765, term177765.getClass(), "playerRating", 0);
        setIntField(term177765, term177765.getClass(), "highestRating", 0);
        setIntField(term177765, term177765.getClass(), "nameplateId", 0);
        setIntField(term177765, term177765.getClass(), "frameId", 0);
        setIntField(term177765, term177765.getClass(), "characterId", 0);
        setIntField(term177765, term177765.getClass(), "trophyId", 0);
        setIntField(term177765, term177765.getClass(), "playedTutorialBit", 0);
        setIntField(term177765, term177765.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177765, term177765.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177765, term177765.getClass(), "totalRepertoireCount", 0);
        setIntField(term177765, term177765.getClass(), "totalMapNum", 0);
        setLongField(term177765, term177765.getClass(), "totalHiScore", 0L);
        setLongField(term177765, term177765.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177765, term177765.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177765, term177765.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177765, term177765.getClass(), "totalMasterHighScore", 0L);
        setField(term177765, term177765.getClass(), "eventWatchedDate", null);
        setIntField(term177765, term177765.getClass(), "friendCount", 0);
        setBooleanField(term177765, term177765.getClass(), "isMaimai", false);
        setField(term177765, term177765.getClass(), "firstGameId", null);
        setField(term177765, term177765.getClass(), "firstRomVersion", null);
        setField(term177765, term177765.getClass(), "firstDataVersion", null);
        setField(term177765, term177765.getClass(), "firstPlayDate", null);
        setField(term177765, term177765.getClass(), "lastGameId", null);
        setField(term177765, term177765.getClass(), "lastRomVersion", null);
        setField(term177765, term177765.getClass(), "lastDataVersion", null);
        setField(term177765, term177765.getClass(), "lastPlayDate", null);
        setIntField(term177765, term177765.getClass(), "lastPlaceId", 0);
        setField(term177765, term177765.getClass(), "lastPlaceName", null);
        setField(term177765, term177765.getClass(), "lastRegionId", null);
        setField(term177765, term177765.getClass(), "lastRegionName", null);
        setField(term177765, term177765.getClass(), "lastAllNetId", null);
        setField(term177765, term177765.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRegionName", argTypes, term177765, args);
    }

};


