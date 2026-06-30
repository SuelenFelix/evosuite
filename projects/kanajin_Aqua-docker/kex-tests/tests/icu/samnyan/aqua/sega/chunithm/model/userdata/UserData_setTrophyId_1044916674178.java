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

public class UserData_setTrophyId_1044916674178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176937;
     Object term176969;

    public UserData_setTrophyId_1044916674178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176937 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176937, term176937.getClass(), "id", 0L);
        setField(term176937, term176937.getClass(), "card", null);
        setField(term176937, term176937.getClass(), "userName", null);
        setField(term176937, term176937.getClass(), "lastLoginDate", null);
        setBooleanField(term176937, term176937.getClass(), "isWebJoin", false);
        setField(term176937, term176937.getClass(), "webLimitDate", null);
        setIntField(term176937, term176937.getClass(), "level", 0);
        setIntField(term176937, term176937.getClass(), "reincarnationNum", 0);
        setField(term176937, term176937.getClass(), "exp", null);
        setLongField(term176937, term176937.getClass(), "point", 0L);
        setLongField(term176937, term176937.getClass(), "totalPoint", 0L);
        setIntField(term176937, term176937.getClass(), "playCount", 0);
        setIntField(term176937, term176937.getClass(), "multiPlayCount", 0);
        setIntField(term176937, term176937.getClass(), "multiWinCount", 0);
        setIntField(term176937, term176937.getClass(), "requestResCount", 0);
        setIntField(term176937, term176937.getClass(), "acceptResCount", 0);
        setIntField(term176937, term176937.getClass(), "successResCount", 0);
        setIntField(term176937, term176937.getClass(), "playerRating", 0);
        setIntField(term176937, term176937.getClass(), "highestRating", 0);
        setIntField(term176937, term176937.getClass(), "nameplateId", 0);
        setIntField(term176937, term176937.getClass(), "frameId", 0);
        setIntField(term176937, term176937.getClass(), "characterId", 0);
        setIntField(term176937, term176937.getClass(), "trophyId", 0);
        setIntField(term176937, term176937.getClass(), "playedTutorialBit", 0);
        setIntField(term176937, term176937.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176937, term176937.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176937, term176937.getClass(), "totalRepertoireCount", 0);
        setIntField(term176937, term176937.getClass(), "totalMapNum", 0);
        setLongField(term176937, term176937.getClass(), "totalHiScore", 0L);
        setLongField(term176937, term176937.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176937, term176937.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176937, term176937.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176937, term176937.getClass(), "totalMasterHighScore", 0L);
        setField(term176937, term176937.getClass(), "eventWatchedDate", null);
        setIntField(term176937, term176937.getClass(), "friendCount", 0);
        setBooleanField(term176937, term176937.getClass(), "isMaimai", false);
        setField(term176937, term176937.getClass(), "firstGameId", null);
        setField(term176937, term176937.getClass(), "firstRomVersion", null);
        setField(term176937, term176937.getClass(), "firstDataVersion", null);
        setField(term176937, term176937.getClass(), "firstPlayDate", null);
        setField(term176937, term176937.getClass(), "lastGameId", null);
        setField(term176937, term176937.getClass(), "lastRomVersion", null);
        setField(term176937, term176937.getClass(), "lastDataVersion", null);
        setField(term176937, term176937.getClass(), "lastPlayDate", null);
        setIntField(term176937, term176937.getClass(), "lastPlaceId", 0);
        setField(term176937, term176937.getClass(), "lastPlaceName", null);
        setField(term176937, term176937.getClass(), "lastRegionId", null);
        setField(term176937, term176937.getClass(), "lastRegionName", null);
        setField(term176937, term176937.getClass(), "lastAllNetId", null);
        setField(term176937, term176937.getClass(), "lastClientId", null);
        term176969 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176969;
        callMethod(klass, "setTrophyId", argTypes, term176937, args);
    }

};


