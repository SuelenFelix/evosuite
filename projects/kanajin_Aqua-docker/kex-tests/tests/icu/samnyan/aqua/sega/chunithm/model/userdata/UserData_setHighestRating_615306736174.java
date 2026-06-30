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
import java.lang.Integer;

public class UserData_setHighestRating_615306736174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176801;
     Object term176833;

    public UserData_setHighestRating_615306736174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176801 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176801, term176801.getClass(), "id", 0L);
        setField(term176801, term176801.getClass(), "card", null);
        setField(term176801, term176801.getClass(), "userName", null);
        setField(term176801, term176801.getClass(), "lastLoginDate", null);
        setBooleanField(term176801, term176801.getClass(), "isWebJoin", false);
        setField(term176801, term176801.getClass(), "webLimitDate", null);
        setIntField(term176801, term176801.getClass(), "level", 0);
        setIntField(term176801, term176801.getClass(), "reincarnationNum", 0);
        setField(term176801, term176801.getClass(), "exp", null);
        setLongField(term176801, term176801.getClass(), "point", 0L);
        setLongField(term176801, term176801.getClass(), "totalPoint", 0L);
        setIntField(term176801, term176801.getClass(), "playCount", 0);
        setIntField(term176801, term176801.getClass(), "multiPlayCount", 0);
        setIntField(term176801, term176801.getClass(), "multiWinCount", 0);
        setIntField(term176801, term176801.getClass(), "requestResCount", 0);
        setIntField(term176801, term176801.getClass(), "acceptResCount", 0);
        setIntField(term176801, term176801.getClass(), "successResCount", 0);
        setIntField(term176801, term176801.getClass(), "playerRating", 0);
        setIntField(term176801, term176801.getClass(), "highestRating", 0);
        setIntField(term176801, term176801.getClass(), "nameplateId", 0);
        setIntField(term176801, term176801.getClass(), "frameId", 0);
        setIntField(term176801, term176801.getClass(), "characterId", 0);
        setIntField(term176801, term176801.getClass(), "trophyId", 0);
        setIntField(term176801, term176801.getClass(), "playedTutorialBit", 0);
        setIntField(term176801, term176801.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176801, term176801.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176801, term176801.getClass(), "totalRepertoireCount", 0);
        setIntField(term176801, term176801.getClass(), "totalMapNum", 0);
        setLongField(term176801, term176801.getClass(), "totalHiScore", 0L);
        setLongField(term176801, term176801.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176801, term176801.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176801, term176801.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176801, term176801.getClass(), "totalMasterHighScore", 0L);
        setField(term176801, term176801.getClass(), "eventWatchedDate", null);
        setIntField(term176801, term176801.getClass(), "friendCount", 0);
        setBooleanField(term176801, term176801.getClass(), "isMaimai", false);
        setField(term176801, term176801.getClass(), "firstGameId", null);
        setField(term176801, term176801.getClass(), "firstRomVersion", null);
        setField(term176801, term176801.getClass(), "firstDataVersion", null);
        setField(term176801, term176801.getClass(), "firstPlayDate", null);
        setField(term176801, term176801.getClass(), "lastGameId", null);
        setField(term176801, term176801.getClass(), "lastRomVersion", null);
        setField(term176801, term176801.getClass(), "lastDataVersion", null);
        setField(term176801, term176801.getClass(), "lastPlayDate", null);
        setIntField(term176801, term176801.getClass(), "lastPlaceId", 0);
        setField(term176801, term176801.getClass(), "lastPlaceName", null);
        setField(term176801, term176801.getClass(), "lastRegionId", null);
        setField(term176801, term176801.getClass(), "lastRegionName", null);
        setField(term176801, term176801.getClass(), "lastAllNetId", null);
        setField(term176801, term176801.getClass(), "lastClientId", null);
        term176833 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176833;
        callMethod(klass, "setHighestRating", argTypes, term176801, args);
    }

};


