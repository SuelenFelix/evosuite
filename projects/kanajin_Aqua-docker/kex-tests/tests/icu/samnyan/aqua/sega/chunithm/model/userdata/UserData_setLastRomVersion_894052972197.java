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

public class UserData_setLastRomVersion_894052972197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177571;

    public UserData_setLastRomVersion_894052972197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177571 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177571, term177571.getClass(), "id", 0L);
        setField(term177571, term177571.getClass(), "card", null);
        setField(term177571, term177571.getClass(), "userName", null);
        setField(term177571, term177571.getClass(), "lastLoginDate", null);
        setBooleanField(term177571, term177571.getClass(), "isWebJoin", false);
        setField(term177571, term177571.getClass(), "webLimitDate", null);
        setIntField(term177571, term177571.getClass(), "level", 0);
        setIntField(term177571, term177571.getClass(), "reincarnationNum", 0);
        setField(term177571, term177571.getClass(), "exp", null);
        setLongField(term177571, term177571.getClass(), "point", 0L);
        setLongField(term177571, term177571.getClass(), "totalPoint", 0L);
        setIntField(term177571, term177571.getClass(), "playCount", 0);
        setIntField(term177571, term177571.getClass(), "multiPlayCount", 0);
        setIntField(term177571, term177571.getClass(), "multiWinCount", 0);
        setIntField(term177571, term177571.getClass(), "requestResCount", 0);
        setIntField(term177571, term177571.getClass(), "acceptResCount", 0);
        setIntField(term177571, term177571.getClass(), "successResCount", 0);
        setIntField(term177571, term177571.getClass(), "playerRating", 0);
        setIntField(term177571, term177571.getClass(), "highestRating", 0);
        setIntField(term177571, term177571.getClass(), "nameplateId", 0);
        setIntField(term177571, term177571.getClass(), "frameId", 0);
        setIntField(term177571, term177571.getClass(), "characterId", 0);
        setIntField(term177571, term177571.getClass(), "trophyId", 0);
        setIntField(term177571, term177571.getClass(), "playedTutorialBit", 0);
        setIntField(term177571, term177571.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177571, term177571.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177571, term177571.getClass(), "totalRepertoireCount", 0);
        setIntField(term177571, term177571.getClass(), "totalMapNum", 0);
        setLongField(term177571, term177571.getClass(), "totalHiScore", 0L);
        setLongField(term177571, term177571.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177571, term177571.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177571, term177571.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177571, term177571.getClass(), "totalMasterHighScore", 0L);
        setField(term177571, term177571.getClass(), "eventWatchedDate", null);
        setIntField(term177571, term177571.getClass(), "friendCount", 0);
        setBooleanField(term177571, term177571.getClass(), "isMaimai", false);
        setField(term177571, term177571.getClass(), "firstGameId", null);
        setField(term177571, term177571.getClass(), "firstRomVersion", null);
        setField(term177571, term177571.getClass(), "firstDataVersion", null);
        setField(term177571, term177571.getClass(), "firstPlayDate", null);
        setField(term177571, term177571.getClass(), "lastGameId", null);
        setField(term177571, term177571.getClass(), "lastRomVersion", null);
        setField(term177571, term177571.getClass(), "lastDataVersion", null);
        setField(term177571, term177571.getClass(), "lastPlayDate", null);
        setIntField(term177571, term177571.getClass(), "lastPlaceId", 0);
        setField(term177571, term177571.getClass(), "lastPlaceName", null);
        setField(term177571, term177571.getClass(), "lastRegionId", null);
        setField(term177571, term177571.getClass(), "lastRegionName", null);
        setField(term177571, term177571.getClass(), "lastAllNetId", null);
        setField(term177571, term177571.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term177571, args);
    }

};


