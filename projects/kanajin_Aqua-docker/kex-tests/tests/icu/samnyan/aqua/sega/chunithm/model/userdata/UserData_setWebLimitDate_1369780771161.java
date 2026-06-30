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

public class UserData_setWebLimitDate_1369780771161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176363;

    public UserData_setWebLimitDate_1369780771161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176363 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176363, term176363.getClass(), "id", 0L);
        setField(term176363, term176363.getClass(), "card", null);
        setField(term176363, term176363.getClass(), "userName", null);
        setField(term176363, term176363.getClass(), "lastLoginDate", null);
        setBooleanField(term176363, term176363.getClass(), "isWebJoin", false);
        setField(term176363, term176363.getClass(), "webLimitDate", null);
        setIntField(term176363, term176363.getClass(), "level", 0);
        setIntField(term176363, term176363.getClass(), "reincarnationNum", 0);
        setField(term176363, term176363.getClass(), "exp", null);
        setLongField(term176363, term176363.getClass(), "point", 0L);
        setLongField(term176363, term176363.getClass(), "totalPoint", 0L);
        setIntField(term176363, term176363.getClass(), "playCount", 0);
        setIntField(term176363, term176363.getClass(), "multiPlayCount", 0);
        setIntField(term176363, term176363.getClass(), "multiWinCount", 0);
        setIntField(term176363, term176363.getClass(), "requestResCount", 0);
        setIntField(term176363, term176363.getClass(), "acceptResCount", 0);
        setIntField(term176363, term176363.getClass(), "successResCount", 0);
        setIntField(term176363, term176363.getClass(), "playerRating", 0);
        setIntField(term176363, term176363.getClass(), "highestRating", 0);
        setIntField(term176363, term176363.getClass(), "nameplateId", 0);
        setIntField(term176363, term176363.getClass(), "frameId", 0);
        setIntField(term176363, term176363.getClass(), "characterId", 0);
        setIntField(term176363, term176363.getClass(), "trophyId", 0);
        setIntField(term176363, term176363.getClass(), "playedTutorialBit", 0);
        setIntField(term176363, term176363.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176363, term176363.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176363, term176363.getClass(), "totalRepertoireCount", 0);
        setIntField(term176363, term176363.getClass(), "totalMapNum", 0);
        setLongField(term176363, term176363.getClass(), "totalHiScore", 0L);
        setLongField(term176363, term176363.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176363, term176363.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176363, term176363.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176363, term176363.getClass(), "totalMasterHighScore", 0L);
        setField(term176363, term176363.getClass(), "eventWatchedDate", null);
        setIntField(term176363, term176363.getClass(), "friendCount", 0);
        setBooleanField(term176363, term176363.getClass(), "isMaimai", false);
        setField(term176363, term176363.getClass(), "firstGameId", null);
        setField(term176363, term176363.getClass(), "firstRomVersion", null);
        setField(term176363, term176363.getClass(), "firstDataVersion", null);
        setField(term176363, term176363.getClass(), "firstPlayDate", null);
        setField(term176363, term176363.getClass(), "lastGameId", null);
        setField(term176363, term176363.getClass(), "lastRomVersion", null);
        setField(term176363, term176363.getClass(), "lastDataVersion", null);
        setField(term176363, term176363.getClass(), "lastPlayDate", null);
        setIntField(term176363, term176363.getClass(), "lastPlaceId", 0);
        setField(term176363, term176363.getClass(), "lastPlaceName", null);
        setField(term176363, term176363.getClass(), "lastRegionId", null);
        setField(term176363, term176363.getClass(), "lastRegionName", null);
        setField(term176363, term176363.getClass(), "lastAllNetId", null);
        setField(term176363, term176363.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWebLimitDate", argTypes, term176363, args);
    }

};


