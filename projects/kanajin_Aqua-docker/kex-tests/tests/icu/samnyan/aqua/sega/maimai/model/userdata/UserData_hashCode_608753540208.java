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

public class UserData_hashCode_608753540208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32433;

    public UserData_hashCode_608753540208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32433, term32433.getClass(), "id", 0L);
        setField(term32433, term32433.getClass(), "card", null);
        setIntField(term32433, term32433.getClass(), "lastDataVersion", 0);
        setField(term32433, term32433.getClass(), "userName", null);
        setIntField(term32433, term32433.getClass(), "point", 0);
        setIntField(term32433, term32433.getClass(), "totalPoint", 0);
        setIntField(term32433, term32433.getClass(), "iconId", 0);
        setIntField(term32433, term32433.getClass(), "nameplateId", 0);
        setIntField(term32433, term32433.getClass(), "frameId", 0);
        setIntField(term32433, term32433.getClass(), "trophyId", 0);
        setIntField(term32433, term32433.getClass(), "playCount", 0);
        setIntField(term32433, term32433.getClass(), "playVsCount", 0);
        setIntField(term32433, term32433.getClass(), "playSyncCount", 0);
        setIntField(term32433, term32433.getClass(), "winCount", 0);
        setIntField(term32433, term32433.getClass(), "helpCount", 0);
        setIntField(term32433, term32433.getClass(), "comboCount", 0);
        setIntField(term32433, term32433.getClass(), "feverCount", 0);
        setIntField(term32433, term32433.getClass(), "totalHiScore", 0);
        setIntField(term32433, term32433.getClass(), "totalEasyHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalBasicHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalExpertHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalMasterHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32433, term32433.getClass(), "totalHighSync", 0);
        setIntField(term32433, term32433.getClass(), "totalEasySync", 0);
        setIntField(term32433, term32433.getClass(), "totalBasicSync", 0);
        setIntField(term32433, term32433.getClass(), "totalAdvancedSync", 0);
        setIntField(term32433, term32433.getClass(), "totalExpertSync", 0);
        setIntField(term32433, term32433.getClass(), "totalMasterSync", 0);
        setIntField(term32433, term32433.getClass(), "totalReMasterSync", 0);
        setIntField(term32433, term32433.getClass(), "playerRating", 0);
        setIntField(term32433, term32433.getClass(), "highestRating", 0);
        setIntField(term32433, term32433.getClass(), "rankAuthTailId", 0);
        setField(term32433, term32433.getClass(), "eventWatchedDate", null);
        setField(term32433, term32433.getClass(), "webLimitDate", null);
        setIntField(term32433, term32433.getClass(), "challengeTrackPhase", 0);
        setIntField(term32433, term32433.getClass(), "firstPlayBits", 0);
        setField(term32433, term32433.getClass(), "lastPlayDate", null);
        setIntField(term32433, term32433.getClass(), "lastPlaceId", 0);
        setField(term32433, term32433.getClass(), "lastPlaceName", null);
        setIntField(term32433, term32433.getClass(), "lastRegionId", 0);
        setField(term32433, term32433.getClass(), "lastRegionName", null);
        setField(term32433, term32433.getClass(), "lastClientId", null);
        setField(term32433, term32433.getClass(), "lastCountryCode", null);
        setIntField(term32433, term32433.getClass(), "eventPoint", 0);
        setIntField(term32433, term32433.getClass(), "totalLv", 0);
        setIntField(term32433, term32433.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32433, term32433.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32433, term32433.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32433, args);
    }

};


