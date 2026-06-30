package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getLastClientId_657780224149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29873;

    public UserData_getLastClientId_657780224149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29873, term29873.getClass(), "id", 0L);
        setField(term29873, term29873.getClass(), "card", null);
        setIntField(term29873, term29873.getClass(), "lastDataVersion", 0);
        setField(term29873, term29873.getClass(), "userName", null);
        setIntField(term29873, term29873.getClass(), "point", 0);
        setIntField(term29873, term29873.getClass(), "totalPoint", 0);
        setIntField(term29873, term29873.getClass(), "iconId", 0);
        setIntField(term29873, term29873.getClass(), "nameplateId", 0);
        setIntField(term29873, term29873.getClass(), "frameId", 0);
        setIntField(term29873, term29873.getClass(), "trophyId", 0);
        setIntField(term29873, term29873.getClass(), "playCount", 0);
        setIntField(term29873, term29873.getClass(), "playVsCount", 0);
        setIntField(term29873, term29873.getClass(), "playSyncCount", 0);
        setIntField(term29873, term29873.getClass(), "winCount", 0);
        setIntField(term29873, term29873.getClass(), "helpCount", 0);
        setIntField(term29873, term29873.getClass(), "comboCount", 0);
        setIntField(term29873, term29873.getClass(), "feverCount", 0);
        setIntField(term29873, term29873.getClass(), "totalHiScore", 0);
        setIntField(term29873, term29873.getClass(), "totalEasyHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalBasicHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalExpertHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalMasterHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29873, term29873.getClass(), "totalHighSync", 0);
        setIntField(term29873, term29873.getClass(), "totalEasySync", 0);
        setIntField(term29873, term29873.getClass(), "totalBasicSync", 0);
        setIntField(term29873, term29873.getClass(), "totalAdvancedSync", 0);
        setIntField(term29873, term29873.getClass(), "totalExpertSync", 0);
        setIntField(term29873, term29873.getClass(), "totalMasterSync", 0);
        setIntField(term29873, term29873.getClass(), "totalReMasterSync", 0);
        setIntField(term29873, term29873.getClass(), "playerRating", 0);
        setIntField(term29873, term29873.getClass(), "highestRating", 0);
        setIntField(term29873, term29873.getClass(), "rankAuthTailId", 0);
        setField(term29873, term29873.getClass(), "eventWatchedDate", null);
        setField(term29873, term29873.getClass(), "webLimitDate", null);
        setIntField(term29873, term29873.getClass(), "challengeTrackPhase", 0);
        setIntField(term29873, term29873.getClass(), "firstPlayBits", 0);
        setField(term29873, term29873.getClass(), "lastPlayDate", null);
        setIntField(term29873, term29873.getClass(), "lastPlaceId", 0);
        setField(term29873, term29873.getClass(), "lastPlaceName", null);
        setIntField(term29873, term29873.getClass(), "lastRegionId", 0);
        setField(term29873, term29873.getClass(), "lastRegionName", null);
        setField(term29873, term29873.getClass(), "lastClientId", null);
        setField(term29873, term29873.getClass(), "lastCountryCode", null);
        setIntField(term29873, term29873.getClass(), "eventPoint", 0);
        setIntField(term29873, term29873.getClass(), "totalLv", 0);
        setIntField(term29873, term29873.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29873, term29873.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29873, term29873.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term29873, args);
    }

};


