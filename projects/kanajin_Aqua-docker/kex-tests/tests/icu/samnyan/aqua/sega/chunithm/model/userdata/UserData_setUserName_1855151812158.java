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

public class UserData_setUserName_1855151812158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176265;

    public UserData_setUserName_1855151812158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176265 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176265, term176265.getClass(), "id", 0L);
        setField(term176265, term176265.getClass(), "card", null);
        setField(term176265, term176265.getClass(), "userName", null);
        setField(term176265, term176265.getClass(), "lastLoginDate", null);
        setBooleanField(term176265, term176265.getClass(), "isWebJoin", false);
        setField(term176265, term176265.getClass(), "webLimitDate", null);
        setIntField(term176265, term176265.getClass(), "level", 0);
        setIntField(term176265, term176265.getClass(), "reincarnationNum", 0);
        setField(term176265, term176265.getClass(), "exp", null);
        setLongField(term176265, term176265.getClass(), "point", 0L);
        setLongField(term176265, term176265.getClass(), "totalPoint", 0L);
        setIntField(term176265, term176265.getClass(), "playCount", 0);
        setIntField(term176265, term176265.getClass(), "multiPlayCount", 0);
        setIntField(term176265, term176265.getClass(), "multiWinCount", 0);
        setIntField(term176265, term176265.getClass(), "requestResCount", 0);
        setIntField(term176265, term176265.getClass(), "acceptResCount", 0);
        setIntField(term176265, term176265.getClass(), "successResCount", 0);
        setIntField(term176265, term176265.getClass(), "playerRating", 0);
        setIntField(term176265, term176265.getClass(), "highestRating", 0);
        setIntField(term176265, term176265.getClass(), "nameplateId", 0);
        setIntField(term176265, term176265.getClass(), "frameId", 0);
        setIntField(term176265, term176265.getClass(), "characterId", 0);
        setIntField(term176265, term176265.getClass(), "trophyId", 0);
        setIntField(term176265, term176265.getClass(), "playedTutorialBit", 0);
        setIntField(term176265, term176265.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176265, term176265.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176265, term176265.getClass(), "totalRepertoireCount", 0);
        setIntField(term176265, term176265.getClass(), "totalMapNum", 0);
        setLongField(term176265, term176265.getClass(), "totalHiScore", 0L);
        setLongField(term176265, term176265.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176265, term176265.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176265, term176265.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176265, term176265.getClass(), "totalMasterHighScore", 0L);
        setField(term176265, term176265.getClass(), "eventWatchedDate", null);
        setIntField(term176265, term176265.getClass(), "friendCount", 0);
        setBooleanField(term176265, term176265.getClass(), "isMaimai", false);
        setField(term176265, term176265.getClass(), "firstGameId", null);
        setField(term176265, term176265.getClass(), "firstRomVersion", null);
        setField(term176265, term176265.getClass(), "firstDataVersion", null);
        setField(term176265, term176265.getClass(), "firstPlayDate", null);
        setField(term176265, term176265.getClass(), "lastGameId", null);
        setField(term176265, term176265.getClass(), "lastRomVersion", null);
        setField(term176265, term176265.getClass(), "lastDataVersion", null);
        setField(term176265, term176265.getClass(), "lastPlayDate", null);
        setIntField(term176265, term176265.getClass(), "lastPlaceId", 0);
        setField(term176265, term176265.getClass(), "lastPlaceName", null);
        setField(term176265, term176265.getClass(), "lastRegionId", null);
        setField(term176265, term176265.getClass(), "lastRegionName", null);
        setField(term176265, term176265.getClass(), "lastAllNetId", null);
        setField(term176265, term176265.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term176265, args);
    }

};


