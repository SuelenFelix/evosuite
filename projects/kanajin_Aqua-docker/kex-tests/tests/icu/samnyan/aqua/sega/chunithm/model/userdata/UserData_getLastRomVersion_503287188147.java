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

public class UserData_getLastRomVersion_503287188147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175911;

    public UserData_getLastRomVersion_503287188147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175911 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175911, term175911.getClass(), "id", 0L);
        setField(term175911, term175911.getClass(), "card", null);
        setField(term175911, term175911.getClass(), "userName", null);
        setField(term175911, term175911.getClass(), "lastLoginDate", null);
        setBooleanField(term175911, term175911.getClass(), "isWebJoin", false);
        setField(term175911, term175911.getClass(), "webLimitDate", null);
        setIntField(term175911, term175911.getClass(), "level", 0);
        setIntField(term175911, term175911.getClass(), "reincarnationNum", 0);
        setField(term175911, term175911.getClass(), "exp", null);
        setLongField(term175911, term175911.getClass(), "point", 0L);
        setLongField(term175911, term175911.getClass(), "totalPoint", 0L);
        setIntField(term175911, term175911.getClass(), "playCount", 0);
        setIntField(term175911, term175911.getClass(), "multiPlayCount", 0);
        setIntField(term175911, term175911.getClass(), "multiWinCount", 0);
        setIntField(term175911, term175911.getClass(), "requestResCount", 0);
        setIntField(term175911, term175911.getClass(), "acceptResCount", 0);
        setIntField(term175911, term175911.getClass(), "successResCount", 0);
        setIntField(term175911, term175911.getClass(), "playerRating", 0);
        setIntField(term175911, term175911.getClass(), "highestRating", 0);
        setIntField(term175911, term175911.getClass(), "nameplateId", 0);
        setIntField(term175911, term175911.getClass(), "frameId", 0);
        setIntField(term175911, term175911.getClass(), "characterId", 0);
        setIntField(term175911, term175911.getClass(), "trophyId", 0);
        setIntField(term175911, term175911.getClass(), "playedTutorialBit", 0);
        setIntField(term175911, term175911.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175911, term175911.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175911, term175911.getClass(), "totalRepertoireCount", 0);
        setIntField(term175911, term175911.getClass(), "totalMapNum", 0);
        setLongField(term175911, term175911.getClass(), "totalHiScore", 0L);
        setLongField(term175911, term175911.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175911, term175911.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175911, term175911.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175911, term175911.getClass(), "totalMasterHighScore", 0L);
        setField(term175911, term175911.getClass(), "eventWatchedDate", null);
        setIntField(term175911, term175911.getClass(), "friendCount", 0);
        setBooleanField(term175911, term175911.getClass(), "isMaimai", false);
        setField(term175911, term175911.getClass(), "firstGameId", null);
        setField(term175911, term175911.getClass(), "firstRomVersion", null);
        setField(term175911, term175911.getClass(), "firstDataVersion", null);
        setField(term175911, term175911.getClass(), "firstPlayDate", null);
        setField(term175911, term175911.getClass(), "lastGameId", null);
        setField(term175911, term175911.getClass(), "lastRomVersion", null);
        setField(term175911, term175911.getClass(), "lastDataVersion", null);
        setField(term175911, term175911.getClass(), "lastPlayDate", null);
        setIntField(term175911, term175911.getClass(), "lastPlaceId", 0);
        setField(term175911, term175911.getClass(), "lastPlaceName", null);
        setField(term175911, term175911.getClass(), "lastRegionId", null);
        setField(term175911, term175911.getClass(), "lastRegionName", null);
        setField(term175911, term175911.getClass(), "lastAllNetId", null);
        setField(term175911, term175911.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term175911, args);
    }

};


