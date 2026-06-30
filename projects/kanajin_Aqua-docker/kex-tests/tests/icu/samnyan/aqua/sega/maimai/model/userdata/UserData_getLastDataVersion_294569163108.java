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

public class UserData_getLastDataVersion_294569163108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28151;

    public UserData_getLastDataVersion_294569163108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28151, term28151.getClass(), "id", 0L);
        setField(term28151, term28151.getClass(), "card", null);
        setIntField(term28151, term28151.getClass(), "lastDataVersion", 0);
        setField(term28151, term28151.getClass(), "userName", null);
        setIntField(term28151, term28151.getClass(), "point", 0);
        setIntField(term28151, term28151.getClass(), "totalPoint", 0);
        setIntField(term28151, term28151.getClass(), "iconId", 0);
        setIntField(term28151, term28151.getClass(), "nameplateId", 0);
        setIntField(term28151, term28151.getClass(), "frameId", 0);
        setIntField(term28151, term28151.getClass(), "trophyId", 0);
        setIntField(term28151, term28151.getClass(), "playCount", 0);
        setIntField(term28151, term28151.getClass(), "playVsCount", 0);
        setIntField(term28151, term28151.getClass(), "playSyncCount", 0);
        setIntField(term28151, term28151.getClass(), "winCount", 0);
        setIntField(term28151, term28151.getClass(), "helpCount", 0);
        setIntField(term28151, term28151.getClass(), "comboCount", 0);
        setIntField(term28151, term28151.getClass(), "feverCount", 0);
        setIntField(term28151, term28151.getClass(), "totalHiScore", 0);
        setIntField(term28151, term28151.getClass(), "totalEasyHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalBasicHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalExpertHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalMasterHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28151, term28151.getClass(), "totalHighSync", 0);
        setIntField(term28151, term28151.getClass(), "totalEasySync", 0);
        setIntField(term28151, term28151.getClass(), "totalBasicSync", 0);
        setIntField(term28151, term28151.getClass(), "totalAdvancedSync", 0);
        setIntField(term28151, term28151.getClass(), "totalExpertSync", 0);
        setIntField(term28151, term28151.getClass(), "totalMasterSync", 0);
        setIntField(term28151, term28151.getClass(), "totalReMasterSync", 0);
        setIntField(term28151, term28151.getClass(), "playerRating", 0);
        setIntField(term28151, term28151.getClass(), "highestRating", 0);
        setIntField(term28151, term28151.getClass(), "rankAuthTailId", 0);
        setField(term28151, term28151.getClass(), "eventWatchedDate", null);
        setField(term28151, term28151.getClass(), "webLimitDate", null);
        setIntField(term28151, term28151.getClass(), "challengeTrackPhase", 0);
        setIntField(term28151, term28151.getClass(), "firstPlayBits", 0);
        setField(term28151, term28151.getClass(), "lastPlayDate", null);
        setIntField(term28151, term28151.getClass(), "lastPlaceId", 0);
        setField(term28151, term28151.getClass(), "lastPlaceName", null);
        setIntField(term28151, term28151.getClass(), "lastRegionId", 0);
        setField(term28151, term28151.getClass(), "lastRegionName", null);
        setField(term28151, term28151.getClass(), "lastClientId", null);
        setField(term28151, term28151.getClass(), "lastCountryCode", null);
        setIntField(term28151, term28151.getClass(), "eventPoint", 0);
        setIntField(term28151, term28151.getClass(), "totalLv", 0);
        setIntField(term28151, term28151.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28151, term28151.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28151, term28151.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term28151, args);
    }

};


