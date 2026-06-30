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

public class UserData_getHelpCount_1805689793120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28655;

    public UserData_getHelpCount_1805689793120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28655 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28655, term28655.getClass(), "id", 0L);
        setField(term28655, term28655.getClass(), "card", null);
        setIntField(term28655, term28655.getClass(), "lastDataVersion", 0);
        setField(term28655, term28655.getClass(), "userName", null);
        setIntField(term28655, term28655.getClass(), "point", 0);
        setIntField(term28655, term28655.getClass(), "totalPoint", 0);
        setIntField(term28655, term28655.getClass(), "iconId", 0);
        setIntField(term28655, term28655.getClass(), "nameplateId", 0);
        setIntField(term28655, term28655.getClass(), "frameId", 0);
        setIntField(term28655, term28655.getClass(), "trophyId", 0);
        setIntField(term28655, term28655.getClass(), "playCount", 0);
        setIntField(term28655, term28655.getClass(), "playVsCount", 0);
        setIntField(term28655, term28655.getClass(), "playSyncCount", 0);
        setIntField(term28655, term28655.getClass(), "winCount", 0);
        setIntField(term28655, term28655.getClass(), "helpCount", 0);
        setIntField(term28655, term28655.getClass(), "comboCount", 0);
        setIntField(term28655, term28655.getClass(), "feverCount", 0);
        setIntField(term28655, term28655.getClass(), "totalHiScore", 0);
        setIntField(term28655, term28655.getClass(), "totalEasyHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalBasicHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalExpertHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalMasterHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28655, term28655.getClass(), "totalHighSync", 0);
        setIntField(term28655, term28655.getClass(), "totalEasySync", 0);
        setIntField(term28655, term28655.getClass(), "totalBasicSync", 0);
        setIntField(term28655, term28655.getClass(), "totalAdvancedSync", 0);
        setIntField(term28655, term28655.getClass(), "totalExpertSync", 0);
        setIntField(term28655, term28655.getClass(), "totalMasterSync", 0);
        setIntField(term28655, term28655.getClass(), "totalReMasterSync", 0);
        setIntField(term28655, term28655.getClass(), "playerRating", 0);
        setIntField(term28655, term28655.getClass(), "highestRating", 0);
        setIntField(term28655, term28655.getClass(), "rankAuthTailId", 0);
        setField(term28655, term28655.getClass(), "eventWatchedDate", null);
        setField(term28655, term28655.getClass(), "webLimitDate", null);
        setIntField(term28655, term28655.getClass(), "challengeTrackPhase", 0);
        setIntField(term28655, term28655.getClass(), "firstPlayBits", 0);
        setField(term28655, term28655.getClass(), "lastPlayDate", null);
        setIntField(term28655, term28655.getClass(), "lastPlaceId", 0);
        setField(term28655, term28655.getClass(), "lastPlaceName", null);
        setIntField(term28655, term28655.getClass(), "lastRegionId", 0);
        setField(term28655, term28655.getClass(), "lastRegionName", null);
        setField(term28655, term28655.getClass(), "lastClientId", null);
        setField(term28655, term28655.getClass(), "lastCountryCode", null);
        setIntField(term28655, term28655.getClass(), "eventPoint", 0);
        setIntField(term28655, term28655.getClass(), "totalLv", 0);
        setIntField(term28655, term28655.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28655, term28655.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28655, term28655.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpCount", argTypes, term28655, args);
    }

};


