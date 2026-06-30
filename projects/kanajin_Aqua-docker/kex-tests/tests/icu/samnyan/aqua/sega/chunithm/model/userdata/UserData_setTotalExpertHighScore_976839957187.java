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
import java.lang.Long;

public class UserData_setTotalExpertHighScore_976839957187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177243;
     Object term177275;

    public UserData_setTotalExpertHighScore_976839957187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177243 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177243, term177243.getClass(), "id", 0L);
        setField(term177243, term177243.getClass(), "card", null);
        setField(term177243, term177243.getClass(), "userName", null);
        setField(term177243, term177243.getClass(), "lastLoginDate", null);
        setBooleanField(term177243, term177243.getClass(), "isWebJoin", false);
        setField(term177243, term177243.getClass(), "webLimitDate", null);
        setIntField(term177243, term177243.getClass(), "level", 0);
        setIntField(term177243, term177243.getClass(), "reincarnationNum", 0);
        setField(term177243, term177243.getClass(), "exp", null);
        setLongField(term177243, term177243.getClass(), "point", 0L);
        setLongField(term177243, term177243.getClass(), "totalPoint", 0L);
        setIntField(term177243, term177243.getClass(), "playCount", 0);
        setIntField(term177243, term177243.getClass(), "multiPlayCount", 0);
        setIntField(term177243, term177243.getClass(), "multiWinCount", 0);
        setIntField(term177243, term177243.getClass(), "requestResCount", 0);
        setIntField(term177243, term177243.getClass(), "acceptResCount", 0);
        setIntField(term177243, term177243.getClass(), "successResCount", 0);
        setIntField(term177243, term177243.getClass(), "playerRating", 0);
        setIntField(term177243, term177243.getClass(), "highestRating", 0);
        setIntField(term177243, term177243.getClass(), "nameplateId", 0);
        setIntField(term177243, term177243.getClass(), "frameId", 0);
        setIntField(term177243, term177243.getClass(), "characterId", 0);
        setIntField(term177243, term177243.getClass(), "trophyId", 0);
        setIntField(term177243, term177243.getClass(), "playedTutorialBit", 0);
        setIntField(term177243, term177243.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177243, term177243.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177243, term177243.getClass(), "totalRepertoireCount", 0);
        setIntField(term177243, term177243.getClass(), "totalMapNum", 0);
        setLongField(term177243, term177243.getClass(), "totalHiScore", 0L);
        setLongField(term177243, term177243.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177243, term177243.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177243, term177243.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177243, term177243.getClass(), "totalMasterHighScore", 0L);
        setField(term177243, term177243.getClass(), "eventWatchedDate", null);
        setIntField(term177243, term177243.getClass(), "friendCount", 0);
        setBooleanField(term177243, term177243.getClass(), "isMaimai", false);
        setField(term177243, term177243.getClass(), "firstGameId", null);
        setField(term177243, term177243.getClass(), "firstRomVersion", null);
        setField(term177243, term177243.getClass(), "firstDataVersion", null);
        setField(term177243, term177243.getClass(), "firstPlayDate", null);
        setField(term177243, term177243.getClass(), "lastGameId", null);
        setField(term177243, term177243.getClass(), "lastRomVersion", null);
        setField(term177243, term177243.getClass(), "lastDataVersion", null);
        setField(term177243, term177243.getClass(), "lastPlayDate", null);
        setIntField(term177243, term177243.getClass(), "lastPlaceId", 0);
        setField(term177243, term177243.getClass(), "lastPlaceName", null);
        setField(term177243, term177243.getClass(), "lastRegionId", null);
        setField(term177243, term177243.getClass(), "lastRegionName", null);
        setField(term177243, term177243.getClass(), "lastAllNetId", null);
        setField(term177243, term177243.getClass(), "lastClientId", null);
        term177275 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177275;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term177243, args);
    }

};


