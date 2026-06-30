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

public class UserData_getTotalEasySync_1232490284131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29117;

    public UserData_getTotalEasySync_1232490284131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29117 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29117, term29117.getClass(), "id", 0L);
        setField(term29117, term29117.getClass(), "card", null);
        setIntField(term29117, term29117.getClass(), "lastDataVersion", 0);
        setField(term29117, term29117.getClass(), "userName", null);
        setIntField(term29117, term29117.getClass(), "point", 0);
        setIntField(term29117, term29117.getClass(), "totalPoint", 0);
        setIntField(term29117, term29117.getClass(), "iconId", 0);
        setIntField(term29117, term29117.getClass(), "nameplateId", 0);
        setIntField(term29117, term29117.getClass(), "frameId", 0);
        setIntField(term29117, term29117.getClass(), "trophyId", 0);
        setIntField(term29117, term29117.getClass(), "playCount", 0);
        setIntField(term29117, term29117.getClass(), "playVsCount", 0);
        setIntField(term29117, term29117.getClass(), "playSyncCount", 0);
        setIntField(term29117, term29117.getClass(), "winCount", 0);
        setIntField(term29117, term29117.getClass(), "helpCount", 0);
        setIntField(term29117, term29117.getClass(), "comboCount", 0);
        setIntField(term29117, term29117.getClass(), "feverCount", 0);
        setIntField(term29117, term29117.getClass(), "totalHiScore", 0);
        setIntField(term29117, term29117.getClass(), "totalEasyHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalBasicHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalExpertHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalMasterHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29117, term29117.getClass(), "totalHighSync", 0);
        setIntField(term29117, term29117.getClass(), "totalEasySync", 0);
        setIntField(term29117, term29117.getClass(), "totalBasicSync", 0);
        setIntField(term29117, term29117.getClass(), "totalAdvancedSync", 0);
        setIntField(term29117, term29117.getClass(), "totalExpertSync", 0);
        setIntField(term29117, term29117.getClass(), "totalMasterSync", 0);
        setIntField(term29117, term29117.getClass(), "totalReMasterSync", 0);
        setIntField(term29117, term29117.getClass(), "playerRating", 0);
        setIntField(term29117, term29117.getClass(), "highestRating", 0);
        setIntField(term29117, term29117.getClass(), "rankAuthTailId", 0);
        setField(term29117, term29117.getClass(), "eventWatchedDate", null);
        setField(term29117, term29117.getClass(), "webLimitDate", null);
        setIntField(term29117, term29117.getClass(), "challengeTrackPhase", 0);
        setIntField(term29117, term29117.getClass(), "firstPlayBits", 0);
        setField(term29117, term29117.getClass(), "lastPlayDate", null);
        setIntField(term29117, term29117.getClass(), "lastPlaceId", 0);
        setField(term29117, term29117.getClass(), "lastPlaceName", null);
        setIntField(term29117, term29117.getClass(), "lastRegionId", 0);
        setField(term29117, term29117.getClass(), "lastRegionName", null);
        setField(term29117, term29117.getClass(), "lastClientId", null);
        setField(term29117, term29117.getClass(), "lastCountryCode", null);
        setIntField(term29117, term29117.getClass(), "eventPoint", 0);
        setIntField(term29117, term29117.getClass(), "totalLv", 0);
        setIntField(term29117, term29117.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29117, term29117.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29117, term29117.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalEasySync", argTypes, term29117, args);
    }

};


