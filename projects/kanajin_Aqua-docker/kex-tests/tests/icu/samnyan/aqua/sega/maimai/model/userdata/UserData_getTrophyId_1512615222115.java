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

public class UserData_getTrophyId_1512615222115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28445;

    public UserData_getTrophyId_1512615222115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28445, term28445.getClass(), "id", 0L);
        setField(term28445, term28445.getClass(), "card", null);
        setIntField(term28445, term28445.getClass(), "lastDataVersion", 0);
        setField(term28445, term28445.getClass(), "userName", null);
        setIntField(term28445, term28445.getClass(), "point", 0);
        setIntField(term28445, term28445.getClass(), "totalPoint", 0);
        setIntField(term28445, term28445.getClass(), "iconId", 0);
        setIntField(term28445, term28445.getClass(), "nameplateId", 0);
        setIntField(term28445, term28445.getClass(), "frameId", 0);
        setIntField(term28445, term28445.getClass(), "trophyId", 0);
        setIntField(term28445, term28445.getClass(), "playCount", 0);
        setIntField(term28445, term28445.getClass(), "playVsCount", 0);
        setIntField(term28445, term28445.getClass(), "playSyncCount", 0);
        setIntField(term28445, term28445.getClass(), "winCount", 0);
        setIntField(term28445, term28445.getClass(), "helpCount", 0);
        setIntField(term28445, term28445.getClass(), "comboCount", 0);
        setIntField(term28445, term28445.getClass(), "feverCount", 0);
        setIntField(term28445, term28445.getClass(), "totalHiScore", 0);
        setIntField(term28445, term28445.getClass(), "totalEasyHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalBasicHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalExpertHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalMasterHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28445, term28445.getClass(), "totalHighSync", 0);
        setIntField(term28445, term28445.getClass(), "totalEasySync", 0);
        setIntField(term28445, term28445.getClass(), "totalBasicSync", 0);
        setIntField(term28445, term28445.getClass(), "totalAdvancedSync", 0);
        setIntField(term28445, term28445.getClass(), "totalExpertSync", 0);
        setIntField(term28445, term28445.getClass(), "totalMasterSync", 0);
        setIntField(term28445, term28445.getClass(), "totalReMasterSync", 0);
        setIntField(term28445, term28445.getClass(), "playerRating", 0);
        setIntField(term28445, term28445.getClass(), "highestRating", 0);
        setIntField(term28445, term28445.getClass(), "rankAuthTailId", 0);
        setField(term28445, term28445.getClass(), "eventWatchedDate", null);
        setField(term28445, term28445.getClass(), "webLimitDate", null);
        setIntField(term28445, term28445.getClass(), "challengeTrackPhase", 0);
        setIntField(term28445, term28445.getClass(), "firstPlayBits", 0);
        setField(term28445, term28445.getClass(), "lastPlayDate", null);
        setIntField(term28445, term28445.getClass(), "lastPlaceId", 0);
        setField(term28445, term28445.getClass(), "lastPlaceName", null);
        setIntField(term28445, term28445.getClass(), "lastRegionId", 0);
        setField(term28445, term28445.getClass(), "lastRegionName", null);
        setField(term28445, term28445.getClass(), "lastClientId", null);
        setField(term28445, term28445.getClass(), "lastCountryCode", null);
        setIntField(term28445, term28445.getClass(), "eventPoint", 0);
        setIntField(term28445, term28445.getClass(), "totalLv", 0);
        setIntField(term28445, term28445.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28445, term28445.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28445, term28445.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term28445, args);
    }

};


