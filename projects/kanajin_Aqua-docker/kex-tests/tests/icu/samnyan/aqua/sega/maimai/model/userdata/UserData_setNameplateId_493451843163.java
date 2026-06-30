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

public class UserData_setNameplateId_493451843163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30471;
     Object term30513;

    public UserData_setNameplateId_493451843163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30471, term30471.getClass(), "id", 0L);
        setField(term30471, term30471.getClass(), "card", null);
        setIntField(term30471, term30471.getClass(), "lastDataVersion", 0);
        setField(term30471, term30471.getClass(), "userName", null);
        setIntField(term30471, term30471.getClass(), "point", 0);
        setIntField(term30471, term30471.getClass(), "totalPoint", 0);
        setIntField(term30471, term30471.getClass(), "iconId", 0);
        setIntField(term30471, term30471.getClass(), "nameplateId", 0);
        setIntField(term30471, term30471.getClass(), "frameId", 0);
        setIntField(term30471, term30471.getClass(), "trophyId", 0);
        setIntField(term30471, term30471.getClass(), "playCount", 0);
        setIntField(term30471, term30471.getClass(), "playVsCount", 0);
        setIntField(term30471, term30471.getClass(), "playSyncCount", 0);
        setIntField(term30471, term30471.getClass(), "winCount", 0);
        setIntField(term30471, term30471.getClass(), "helpCount", 0);
        setIntField(term30471, term30471.getClass(), "comboCount", 0);
        setIntField(term30471, term30471.getClass(), "feverCount", 0);
        setIntField(term30471, term30471.getClass(), "totalHiScore", 0);
        setIntField(term30471, term30471.getClass(), "totalEasyHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalBasicHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalExpertHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalMasterHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30471, term30471.getClass(), "totalHighSync", 0);
        setIntField(term30471, term30471.getClass(), "totalEasySync", 0);
        setIntField(term30471, term30471.getClass(), "totalBasicSync", 0);
        setIntField(term30471, term30471.getClass(), "totalAdvancedSync", 0);
        setIntField(term30471, term30471.getClass(), "totalExpertSync", 0);
        setIntField(term30471, term30471.getClass(), "totalMasterSync", 0);
        setIntField(term30471, term30471.getClass(), "totalReMasterSync", 0);
        setIntField(term30471, term30471.getClass(), "playerRating", 0);
        setIntField(term30471, term30471.getClass(), "highestRating", 0);
        setIntField(term30471, term30471.getClass(), "rankAuthTailId", 0);
        setField(term30471, term30471.getClass(), "eventWatchedDate", null);
        setField(term30471, term30471.getClass(), "webLimitDate", null);
        setIntField(term30471, term30471.getClass(), "challengeTrackPhase", 0);
        setIntField(term30471, term30471.getClass(), "firstPlayBits", 0);
        setField(term30471, term30471.getClass(), "lastPlayDate", null);
        setIntField(term30471, term30471.getClass(), "lastPlaceId", 0);
        setField(term30471, term30471.getClass(), "lastPlaceName", null);
        setIntField(term30471, term30471.getClass(), "lastRegionId", 0);
        setField(term30471, term30471.getClass(), "lastRegionName", null);
        setField(term30471, term30471.getClass(), "lastClientId", null);
        setField(term30471, term30471.getClass(), "lastCountryCode", null);
        setIntField(term30471, term30471.getClass(), "eventPoint", 0);
        setIntField(term30471, term30471.getClass(), "totalLv", 0);
        setIntField(term30471, term30471.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30471, term30471.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30471, term30471.getClass(), "loginBonusLv", 0);
        term30513 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30513;
        callMethod(klass, "setNameplateId", argTypes, term30471, args);
    }

};


