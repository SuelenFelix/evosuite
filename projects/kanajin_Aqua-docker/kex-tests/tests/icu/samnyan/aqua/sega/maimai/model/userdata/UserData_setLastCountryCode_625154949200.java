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

public class UserData_setLastCountryCode_625154949200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32087;

    public UserData_setLastCountryCode_625154949200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32087 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32087, term32087.getClass(), "id", 0L);
        setField(term32087, term32087.getClass(), "card", null);
        setIntField(term32087, term32087.getClass(), "lastDataVersion", 0);
        setField(term32087, term32087.getClass(), "userName", null);
        setIntField(term32087, term32087.getClass(), "point", 0);
        setIntField(term32087, term32087.getClass(), "totalPoint", 0);
        setIntField(term32087, term32087.getClass(), "iconId", 0);
        setIntField(term32087, term32087.getClass(), "nameplateId", 0);
        setIntField(term32087, term32087.getClass(), "frameId", 0);
        setIntField(term32087, term32087.getClass(), "trophyId", 0);
        setIntField(term32087, term32087.getClass(), "playCount", 0);
        setIntField(term32087, term32087.getClass(), "playVsCount", 0);
        setIntField(term32087, term32087.getClass(), "playSyncCount", 0);
        setIntField(term32087, term32087.getClass(), "winCount", 0);
        setIntField(term32087, term32087.getClass(), "helpCount", 0);
        setIntField(term32087, term32087.getClass(), "comboCount", 0);
        setIntField(term32087, term32087.getClass(), "feverCount", 0);
        setIntField(term32087, term32087.getClass(), "totalHiScore", 0);
        setIntField(term32087, term32087.getClass(), "totalEasyHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalBasicHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalExpertHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalMasterHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32087, term32087.getClass(), "totalHighSync", 0);
        setIntField(term32087, term32087.getClass(), "totalEasySync", 0);
        setIntField(term32087, term32087.getClass(), "totalBasicSync", 0);
        setIntField(term32087, term32087.getClass(), "totalAdvancedSync", 0);
        setIntField(term32087, term32087.getClass(), "totalExpertSync", 0);
        setIntField(term32087, term32087.getClass(), "totalMasterSync", 0);
        setIntField(term32087, term32087.getClass(), "totalReMasterSync", 0);
        setIntField(term32087, term32087.getClass(), "playerRating", 0);
        setIntField(term32087, term32087.getClass(), "highestRating", 0);
        setIntField(term32087, term32087.getClass(), "rankAuthTailId", 0);
        setField(term32087, term32087.getClass(), "eventWatchedDate", null);
        setField(term32087, term32087.getClass(), "webLimitDate", null);
        setIntField(term32087, term32087.getClass(), "challengeTrackPhase", 0);
        setIntField(term32087, term32087.getClass(), "firstPlayBits", 0);
        setField(term32087, term32087.getClass(), "lastPlayDate", null);
        setIntField(term32087, term32087.getClass(), "lastPlaceId", 0);
        setField(term32087, term32087.getClass(), "lastPlaceName", null);
        setIntField(term32087, term32087.getClass(), "lastRegionId", 0);
        setField(term32087, term32087.getClass(), "lastRegionName", null);
        setField(term32087, term32087.getClass(), "lastClientId", null);
        setField(term32087, term32087.getClass(), "lastCountryCode", null);
        setIntField(term32087, term32087.getClass(), "eventPoint", 0);
        setIntField(term32087, term32087.getClass(), "totalLv", 0);
        setIntField(term32087, term32087.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32087, term32087.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32087, term32087.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastCountryCode", argTypes, term32087, args);
    }

};


