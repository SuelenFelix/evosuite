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

public class UserData_setTotalMasterHighScore_1728850467188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177277;
     Object term177309;

    public UserData_setTotalMasterHighScore_1728850467188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177277 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177277, term177277.getClass(), "id", 0L);
        setField(term177277, term177277.getClass(), "card", null);
        setField(term177277, term177277.getClass(), "userName", null);
        setField(term177277, term177277.getClass(), "lastLoginDate", null);
        setBooleanField(term177277, term177277.getClass(), "isWebJoin", false);
        setField(term177277, term177277.getClass(), "webLimitDate", null);
        setIntField(term177277, term177277.getClass(), "level", 0);
        setIntField(term177277, term177277.getClass(), "reincarnationNum", 0);
        setField(term177277, term177277.getClass(), "exp", null);
        setLongField(term177277, term177277.getClass(), "point", 0L);
        setLongField(term177277, term177277.getClass(), "totalPoint", 0L);
        setIntField(term177277, term177277.getClass(), "playCount", 0);
        setIntField(term177277, term177277.getClass(), "multiPlayCount", 0);
        setIntField(term177277, term177277.getClass(), "multiWinCount", 0);
        setIntField(term177277, term177277.getClass(), "requestResCount", 0);
        setIntField(term177277, term177277.getClass(), "acceptResCount", 0);
        setIntField(term177277, term177277.getClass(), "successResCount", 0);
        setIntField(term177277, term177277.getClass(), "playerRating", 0);
        setIntField(term177277, term177277.getClass(), "highestRating", 0);
        setIntField(term177277, term177277.getClass(), "nameplateId", 0);
        setIntField(term177277, term177277.getClass(), "frameId", 0);
        setIntField(term177277, term177277.getClass(), "characterId", 0);
        setIntField(term177277, term177277.getClass(), "trophyId", 0);
        setIntField(term177277, term177277.getClass(), "playedTutorialBit", 0);
        setIntField(term177277, term177277.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177277, term177277.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177277, term177277.getClass(), "totalRepertoireCount", 0);
        setIntField(term177277, term177277.getClass(), "totalMapNum", 0);
        setLongField(term177277, term177277.getClass(), "totalHiScore", 0L);
        setLongField(term177277, term177277.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177277, term177277.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177277, term177277.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177277, term177277.getClass(), "totalMasterHighScore", 0L);
        setField(term177277, term177277.getClass(), "eventWatchedDate", null);
        setIntField(term177277, term177277.getClass(), "friendCount", 0);
        setBooleanField(term177277, term177277.getClass(), "isMaimai", false);
        setField(term177277, term177277.getClass(), "firstGameId", null);
        setField(term177277, term177277.getClass(), "firstRomVersion", null);
        setField(term177277, term177277.getClass(), "firstDataVersion", null);
        setField(term177277, term177277.getClass(), "firstPlayDate", null);
        setField(term177277, term177277.getClass(), "lastGameId", null);
        setField(term177277, term177277.getClass(), "lastRomVersion", null);
        setField(term177277, term177277.getClass(), "lastDataVersion", null);
        setField(term177277, term177277.getClass(), "lastPlayDate", null);
        setIntField(term177277, term177277.getClass(), "lastPlaceId", 0);
        setField(term177277, term177277.getClass(), "lastPlaceName", null);
        setField(term177277, term177277.getClass(), "lastRegionId", null);
        setField(term177277, term177277.getClass(), "lastRegionName", null);
        setField(term177277, term177277.getClass(), "lastAllNetId", null);
        setField(term177277, term177277.getClass(), "lastClientId", null);
        term177309 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177309;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term177277, args);
    }

};


