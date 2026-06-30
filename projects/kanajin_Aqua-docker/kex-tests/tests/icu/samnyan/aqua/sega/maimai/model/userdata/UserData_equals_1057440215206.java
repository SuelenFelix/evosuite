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

public class UserData_equals_1057440215206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32349;

    public UserData_equals_1057440215206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32349 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32349, term32349.getClass(), "id", 0L);
        setField(term32349, term32349.getClass(), "card", null);
        setIntField(term32349, term32349.getClass(), "lastDataVersion", 0);
        setField(term32349, term32349.getClass(), "userName", null);
        setIntField(term32349, term32349.getClass(), "point", 0);
        setIntField(term32349, term32349.getClass(), "totalPoint", 0);
        setIntField(term32349, term32349.getClass(), "iconId", 0);
        setIntField(term32349, term32349.getClass(), "nameplateId", 0);
        setIntField(term32349, term32349.getClass(), "frameId", 0);
        setIntField(term32349, term32349.getClass(), "trophyId", 0);
        setIntField(term32349, term32349.getClass(), "playCount", 0);
        setIntField(term32349, term32349.getClass(), "playVsCount", 0);
        setIntField(term32349, term32349.getClass(), "playSyncCount", 0);
        setIntField(term32349, term32349.getClass(), "winCount", 0);
        setIntField(term32349, term32349.getClass(), "helpCount", 0);
        setIntField(term32349, term32349.getClass(), "comboCount", 0);
        setIntField(term32349, term32349.getClass(), "feverCount", 0);
        setIntField(term32349, term32349.getClass(), "totalHiScore", 0);
        setIntField(term32349, term32349.getClass(), "totalEasyHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalBasicHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalExpertHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalMasterHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32349, term32349.getClass(), "totalHighSync", 0);
        setIntField(term32349, term32349.getClass(), "totalEasySync", 0);
        setIntField(term32349, term32349.getClass(), "totalBasicSync", 0);
        setIntField(term32349, term32349.getClass(), "totalAdvancedSync", 0);
        setIntField(term32349, term32349.getClass(), "totalExpertSync", 0);
        setIntField(term32349, term32349.getClass(), "totalMasterSync", 0);
        setIntField(term32349, term32349.getClass(), "totalReMasterSync", 0);
        setIntField(term32349, term32349.getClass(), "playerRating", 0);
        setIntField(term32349, term32349.getClass(), "highestRating", 0);
        setIntField(term32349, term32349.getClass(), "rankAuthTailId", 0);
        setField(term32349, term32349.getClass(), "eventWatchedDate", null);
        setField(term32349, term32349.getClass(), "webLimitDate", null);
        setIntField(term32349, term32349.getClass(), "challengeTrackPhase", 0);
        setIntField(term32349, term32349.getClass(), "firstPlayBits", 0);
        setField(term32349, term32349.getClass(), "lastPlayDate", null);
        setIntField(term32349, term32349.getClass(), "lastPlaceId", 0);
        setField(term32349, term32349.getClass(), "lastPlaceName", null);
        setIntField(term32349, term32349.getClass(), "lastRegionId", 0);
        setField(term32349, term32349.getClass(), "lastRegionName", null);
        setField(term32349, term32349.getClass(), "lastClientId", null);
        setField(term32349, term32349.getClass(), "lastCountryCode", null);
        setIntField(term32349, term32349.getClass(), "eventPoint", 0);
        setIntField(term32349, term32349.getClass(), "totalLv", 0);
        setIntField(term32349, term32349.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32349, term32349.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32349, term32349.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term32349, args);
    }

};


