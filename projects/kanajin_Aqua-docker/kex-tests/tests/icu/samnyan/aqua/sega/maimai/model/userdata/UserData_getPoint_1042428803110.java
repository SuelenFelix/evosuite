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

public class UserData_getPoint_1042428803110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28235;

    public UserData_getPoint_1042428803110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28235, term28235.getClass(), "id", 0L);
        setField(term28235, term28235.getClass(), "card", null);
        setIntField(term28235, term28235.getClass(), "lastDataVersion", 0);
        setField(term28235, term28235.getClass(), "userName", null);
        setIntField(term28235, term28235.getClass(), "point", 0);
        setIntField(term28235, term28235.getClass(), "totalPoint", 0);
        setIntField(term28235, term28235.getClass(), "iconId", 0);
        setIntField(term28235, term28235.getClass(), "nameplateId", 0);
        setIntField(term28235, term28235.getClass(), "frameId", 0);
        setIntField(term28235, term28235.getClass(), "trophyId", 0);
        setIntField(term28235, term28235.getClass(), "playCount", 0);
        setIntField(term28235, term28235.getClass(), "playVsCount", 0);
        setIntField(term28235, term28235.getClass(), "playSyncCount", 0);
        setIntField(term28235, term28235.getClass(), "winCount", 0);
        setIntField(term28235, term28235.getClass(), "helpCount", 0);
        setIntField(term28235, term28235.getClass(), "comboCount", 0);
        setIntField(term28235, term28235.getClass(), "feverCount", 0);
        setIntField(term28235, term28235.getClass(), "totalHiScore", 0);
        setIntField(term28235, term28235.getClass(), "totalEasyHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalBasicHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalExpertHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalMasterHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28235, term28235.getClass(), "totalHighSync", 0);
        setIntField(term28235, term28235.getClass(), "totalEasySync", 0);
        setIntField(term28235, term28235.getClass(), "totalBasicSync", 0);
        setIntField(term28235, term28235.getClass(), "totalAdvancedSync", 0);
        setIntField(term28235, term28235.getClass(), "totalExpertSync", 0);
        setIntField(term28235, term28235.getClass(), "totalMasterSync", 0);
        setIntField(term28235, term28235.getClass(), "totalReMasterSync", 0);
        setIntField(term28235, term28235.getClass(), "playerRating", 0);
        setIntField(term28235, term28235.getClass(), "highestRating", 0);
        setIntField(term28235, term28235.getClass(), "rankAuthTailId", 0);
        setField(term28235, term28235.getClass(), "eventWatchedDate", null);
        setField(term28235, term28235.getClass(), "webLimitDate", null);
        setIntField(term28235, term28235.getClass(), "challengeTrackPhase", 0);
        setIntField(term28235, term28235.getClass(), "firstPlayBits", 0);
        setField(term28235, term28235.getClass(), "lastPlayDate", null);
        setIntField(term28235, term28235.getClass(), "lastPlaceId", 0);
        setField(term28235, term28235.getClass(), "lastPlaceName", null);
        setIntField(term28235, term28235.getClass(), "lastRegionId", 0);
        setField(term28235, term28235.getClass(), "lastRegionName", null);
        setField(term28235, term28235.getClass(), "lastClientId", null);
        setField(term28235, term28235.getClass(), "lastCountryCode", null);
        setIntField(term28235, term28235.getClass(), "eventPoint", 0);
        setIntField(term28235, term28235.getClass(), "totalLv", 0);
        setIntField(term28235, term28235.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28235, term28235.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28235, term28235.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term28235, args);
    }

};


