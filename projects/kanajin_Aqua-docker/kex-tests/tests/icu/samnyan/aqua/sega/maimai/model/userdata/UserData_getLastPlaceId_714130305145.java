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

public class UserData_getLastPlaceId_714130305145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29705;

    public UserData_getLastPlaceId_714130305145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29705 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29705, term29705.getClass(), "id", 0L);
        setField(term29705, term29705.getClass(), "card", null);
        setIntField(term29705, term29705.getClass(), "lastDataVersion", 0);
        setField(term29705, term29705.getClass(), "userName", null);
        setIntField(term29705, term29705.getClass(), "point", 0);
        setIntField(term29705, term29705.getClass(), "totalPoint", 0);
        setIntField(term29705, term29705.getClass(), "iconId", 0);
        setIntField(term29705, term29705.getClass(), "nameplateId", 0);
        setIntField(term29705, term29705.getClass(), "frameId", 0);
        setIntField(term29705, term29705.getClass(), "trophyId", 0);
        setIntField(term29705, term29705.getClass(), "playCount", 0);
        setIntField(term29705, term29705.getClass(), "playVsCount", 0);
        setIntField(term29705, term29705.getClass(), "playSyncCount", 0);
        setIntField(term29705, term29705.getClass(), "winCount", 0);
        setIntField(term29705, term29705.getClass(), "helpCount", 0);
        setIntField(term29705, term29705.getClass(), "comboCount", 0);
        setIntField(term29705, term29705.getClass(), "feverCount", 0);
        setIntField(term29705, term29705.getClass(), "totalHiScore", 0);
        setIntField(term29705, term29705.getClass(), "totalEasyHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalBasicHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalExpertHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalMasterHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29705, term29705.getClass(), "totalHighSync", 0);
        setIntField(term29705, term29705.getClass(), "totalEasySync", 0);
        setIntField(term29705, term29705.getClass(), "totalBasicSync", 0);
        setIntField(term29705, term29705.getClass(), "totalAdvancedSync", 0);
        setIntField(term29705, term29705.getClass(), "totalExpertSync", 0);
        setIntField(term29705, term29705.getClass(), "totalMasterSync", 0);
        setIntField(term29705, term29705.getClass(), "totalReMasterSync", 0);
        setIntField(term29705, term29705.getClass(), "playerRating", 0);
        setIntField(term29705, term29705.getClass(), "highestRating", 0);
        setIntField(term29705, term29705.getClass(), "rankAuthTailId", 0);
        setField(term29705, term29705.getClass(), "eventWatchedDate", null);
        setField(term29705, term29705.getClass(), "webLimitDate", null);
        setIntField(term29705, term29705.getClass(), "challengeTrackPhase", 0);
        setIntField(term29705, term29705.getClass(), "firstPlayBits", 0);
        setField(term29705, term29705.getClass(), "lastPlayDate", null);
        setIntField(term29705, term29705.getClass(), "lastPlaceId", 0);
        setField(term29705, term29705.getClass(), "lastPlaceName", null);
        setIntField(term29705, term29705.getClass(), "lastRegionId", 0);
        setField(term29705, term29705.getClass(), "lastRegionName", null);
        setField(term29705, term29705.getClass(), "lastClientId", null);
        setField(term29705, term29705.getClass(), "lastCountryCode", null);
        setIntField(term29705, term29705.getClass(), "eventPoint", 0);
        setIntField(term29705, term29705.getClass(), "totalLv", 0);
        setIntField(term29705, term29705.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29705, term29705.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29705, term29705.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term29705, args);
    }

};


