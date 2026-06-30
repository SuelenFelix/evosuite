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

public class UserData_setLastPlayDate_370786708194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31831;

    public UserData_setLastPlayDate_370786708194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31831 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31831, term31831.getClass(), "id", 0L);
        setField(term31831, term31831.getClass(), "card", null);
        setIntField(term31831, term31831.getClass(), "lastDataVersion", 0);
        setField(term31831, term31831.getClass(), "userName", null);
        setIntField(term31831, term31831.getClass(), "point", 0);
        setIntField(term31831, term31831.getClass(), "totalPoint", 0);
        setIntField(term31831, term31831.getClass(), "iconId", 0);
        setIntField(term31831, term31831.getClass(), "nameplateId", 0);
        setIntField(term31831, term31831.getClass(), "frameId", 0);
        setIntField(term31831, term31831.getClass(), "trophyId", 0);
        setIntField(term31831, term31831.getClass(), "playCount", 0);
        setIntField(term31831, term31831.getClass(), "playVsCount", 0);
        setIntField(term31831, term31831.getClass(), "playSyncCount", 0);
        setIntField(term31831, term31831.getClass(), "winCount", 0);
        setIntField(term31831, term31831.getClass(), "helpCount", 0);
        setIntField(term31831, term31831.getClass(), "comboCount", 0);
        setIntField(term31831, term31831.getClass(), "feverCount", 0);
        setIntField(term31831, term31831.getClass(), "totalHiScore", 0);
        setIntField(term31831, term31831.getClass(), "totalEasyHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalBasicHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalExpertHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalMasterHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31831, term31831.getClass(), "totalHighSync", 0);
        setIntField(term31831, term31831.getClass(), "totalEasySync", 0);
        setIntField(term31831, term31831.getClass(), "totalBasicSync", 0);
        setIntField(term31831, term31831.getClass(), "totalAdvancedSync", 0);
        setIntField(term31831, term31831.getClass(), "totalExpertSync", 0);
        setIntField(term31831, term31831.getClass(), "totalMasterSync", 0);
        setIntField(term31831, term31831.getClass(), "totalReMasterSync", 0);
        setIntField(term31831, term31831.getClass(), "playerRating", 0);
        setIntField(term31831, term31831.getClass(), "highestRating", 0);
        setIntField(term31831, term31831.getClass(), "rankAuthTailId", 0);
        setField(term31831, term31831.getClass(), "eventWatchedDate", null);
        setField(term31831, term31831.getClass(), "webLimitDate", null);
        setIntField(term31831, term31831.getClass(), "challengeTrackPhase", 0);
        setIntField(term31831, term31831.getClass(), "firstPlayBits", 0);
        setField(term31831, term31831.getClass(), "lastPlayDate", null);
        setIntField(term31831, term31831.getClass(), "lastPlaceId", 0);
        setField(term31831, term31831.getClass(), "lastPlaceName", null);
        setIntField(term31831, term31831.getClass(), "lastRegionId", 0);
        setField(term31831, term31831.getClass(), "lastRegionName", null);
        setField(term31831, term31831.getClass(), "lastClientId", null);
        setField(term31831, term31831.getClass(), "lastCountryCode", null);
        setIntField(term31831, term31831.getClass(), "eventPoint", 0);
        setIntField(term31831, term31831.getClass(), "totalLv", 0);
        setIntField(term31831, term31831.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31831, term31831.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31831, term31831.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term31831, args);
    }

};


