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

public class UserData_getLastLoginBonusDay_1277485693153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30041;

    public UserData_getLastLoginBonusDay_1277485693153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30041 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30041, term30041.getClass(), "id", 0L);
        setField(term30041, term30041.getClass(), "card", null);
        setIntField(term30041, term30041.getClass(), "lastDataVersion", 0);
        setField(term30041, term30041.getClass(), "userName", null);
        setIntField(term30041, term30041.getClass(), "point", 0);
        setIntField(term30041, term30041.getClass(), "totalPoint", 0);
        setIntField(term30041, term30041.getClass(), "iconId", 0);
        setIntField(term30041, term30041.getClass(), "nameplateId", 0);
        setIntField(term30041, term30041.getClass(), "frameId", 0);
        setIntField(term30041, term30041.getClass(), "trophyId", 0);
        setIntField(term30041, term30041.getClass(), "playCount", 0);
        setIntField(term30041, term30041.getClass(), "playVsCount", 0);
        setIntField(term30041, term30041.getClass(), "playSyncCount", 0);
        setIntField(term30041, term30041.getClass(), "winCount", 0);
        setIntField(term30041, term30041.getClass(), "helpCount", 0);
        setIntField(term30041, term30041.getClass(), "comboCount", 0);
        setIntField(term30041, term30041.getClass(), "feverCount", 0);
        setIntField(term30041, term30041.getClass(), "totalHiScore", 0);
        setIntField(term30041, term30041.getClass(), "totalEasyHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalBasicHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalExpertHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalMasterHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30041, term30041.getClass(), "totalHighSync", 0);
        setIntField(term30041, term30041.getClass(), "totalEasySync", 0);
        setIntField(term30041, term30041.getClass(), "totalBasicSync", 0);
        setIntField(term30041, term30041.getClass(), "totalAdvancedSync", 0);
        setIntField(term30041, term30041.getClass(), "totalExpertSync", 0);
        setIntField(term30041, term30041.getClass(), "totalMasterSync", 0);
        setIntField(term30041, term30041.getClass(), "totalReMasterSync", 0);
        setIntField(term30041, term30041.getClass(), "playerRating", 0);
        setIntField(term30041, term30041.getClass(), "highestRating", 0);
        setIntField(term30041, term30041.getClass(), "rankAuthTailId", 0);
        setField(term30041, term30041.getClass(), "eventWatchedDate", null);
        setField(term30041, term30041.getClass(), "webLimitDate", null);
        setIntField(term30041, term30041.getClass(), "challengeTrackPhase", 0);
        setIntField(term30041, term30041.getClass(), "firstPlayBits", 0);
        setField(term30041, term30041.getClass(), "lastPlayDate", null);
        setIntField(term30041, term30041.getClass(), "lastPlaceId", 0);
        setField(term30041, term30041.getClass(), "lastPlaceName", null);
        setIntField(term30041, term30041.getClass(), "lastRegionId", 0);
        setField(term30041, term30041.getClass(), "lastRegionName", null);
        setField(term30041, term30041.getClass(), "lastClientId", null);
        setField(term30041, term30041.getClass(), "lastCountryCode", null);
        setIntField(term30041, term30041.getClass(), "eventPoint", 0);
        setIntField(term30041, term30041.getClass(), "totalLv", 0);
        setIntField(term30041, term30041.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30041, term30041.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30041, term30041.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginBonusDay", argTypes, term30041, args);
    }

};


