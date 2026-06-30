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
import java.lang.Integer;

public class UserData_setLastSurvivalBonusDay_481554674204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32261;
     Object term32303;

    public UserData_setLastSurvivalBonusDay_481554674204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32261 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32261, term32261.getClass(), "id", 0L);
        setField(term32261, term32261.getClass(), "card", null);
        setIntField(term32261, term32261.getClass(), "lastDataVersion", 0);
        setField(term32261, term32261.getClass(), "userName", null);
        setIntField(term32261, term32261.getClass(), "point", 0);
        setIntField(term32261, term32261.getClass(), "totalPoint", 0);
        setIntField(term32261, term32261.getClass(), "iconId", 0);
        setIntField(term32261, term32261.getClass(), "nameplateId", 0);
        setIntField(term32261, term32261.getClass(), "frameId", 0);
        setIntField(term32261, term32261.getClass(), "trophyId", 0);
        setIntField(term32261, term32261.getClass(), "playCount", 0);
        setIntField(term32261, term32261.getClass(), "playVsCount", 0);
        setIntField(term32261, term32261.getClass(), "playSyncCount", 0);
        setIntField(term32261, term32261.getClass(), "winCount", 0);
        setIntField(term32261, term32261.getClass(), "helpCount", 0);
        setIntField(term32261, term32261.getClass(), "comboCount", 0);
        setIntField(term32261, term32261.getClass(), "feverCount", 0);
        setIntField(term32261, term32261.getClass(), "totalHiScore", 0);
        setIntField(term32261, term32261.getClass(), "totalEasyHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalBasicHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalExpertHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalMasterHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32261, term32261.getClass(), "totalHighSync", 0);
        setIntField(term32261, term32261.getClass(), "totalEasySync", 0);
        setIntField(term32261, term32261.getClass(), "totalBasicSync", 0);
        setIntField(term32261, term32261.getClass(), "totalAdvancedSync", 0);
        setIntField(term32261, term32261.getClass(), "totalExpertSync", 0);
        setIntField(term32261, term32261.getClass(), "totalMasterSync", 0);
        setIntField(term32261, term32261.getClass(), "totalReMasterSync", 0);
        setIntField(term32261, term32261.getClass(), "playerRating", 0);
        setIntField(term32261, term32261.getClass(), "highestRating", 0);
        setIntField(term32261, term32261.getClass(), "rankAuthTailId", 0);
        setField(term32261, term32261.getClass(), "eventWatchedDate", null);
        setField(term32261, term32261.getClass(), "webLimitDate", null);
        setIntField(term32261, term32261.getClass(), "challengeTrackPhase", 0);
        setIntField(term32261, term32261.getClass(), "firstPlayBits", 0);
        setField(term32261, term32261.getClass(), "lastPlayDate", null);
        setIntField(term32261, term32261.getClass(), "lastPlaceId", 0);
        setField(term32261, term32261.getClass(), "lastPlaceName", null);
        setIntField(term32261, term32261.getClass(), "lastRegionId", 0);
        setField(term32261, term32261.getClass(), "lastRegionName", null);
        setField(term32261, term32261.getClass(), "lastClientId", null);
        setField(term32261, term32261.getClass(), "lastCountryCode", null);
        setIntField(term32261, term32261.getClass(), "eventPoint", 0);
        setIntField(term32261, term32261.getClass(), "totalLv", 0);
        setIntField(term32261, term32261.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32261, term32261.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32261, term32261.getClass(), "loginBonusLv", 0);
        term32303 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32303;
        callMethod(klass, "setLastSurvivalBonusDay", argTypes, term32261, args);
    }

};


