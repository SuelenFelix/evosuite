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

public class UserData_getWebLimitDate_685499865141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29537;

    public UserData_getWebLimitDate_685499865141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29537 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29537, term29537.getClass(), "id", 0L);
        setField(term29537, term29537.getClass(), "card", null);
        setIntField(term29537, term29537.getClass(), "lastDataVersion", 0);
        setField(term29537, term29537.getClass(), "userName", null);
        setIntField(term29537, term29537.getClass(), "point", 0);
        setIntField(term29537, term29537.getClass(), "totalPoint", 0);
        setIntField(term29537, term29537.getClass(), "iconId", 0);
        setIntField(term29537, term29537.getClass(), "nameplateId", 0);
        setIntField(term29537, term29537.getClass(), "frameId", 0);
        setIntField(term29537, term29537.getClass(), "trophyId", 0);
        setIntField(term29537, term29537.getClass(), "playCount", 0);
        setIntField(term29537, term29537.getClass(), "playVsCount", 0);
        setIntField(term29537, term29537.getClass(), "playSyncCount", 0);
        setIntField(term29537, term29537.getClass(), "winCount", 0);
        setIntField(term29537, term29537.getClass(), "helpCount", 0);
        setIntField(term29537, term29537.getClass(), "comboCount", 0);
        setIntField(term29537, term29537.getClass(), "feverCount", 0);
        setIntField(term29537, term29537.getClass(), "totalHiScore", 0);
        setIntField(term29537, term29537.getClass(), "totalEasyHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalBasicHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalExpertHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalMasterHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29537, term29537.getClass(), "totalHighSync", 0);
        setIntField(term29537, term29537.getClass(), "totalEasySync", 0);
        setIntField(term29537, term29537.getClass(), "totalBasicSync", 0);
        setIntField(term29537, term29537.getClass(), "totalAdvancedSync", 0);
        setIntField(term29537, term29537.getClass(), "totalExpertSync", 0);
        setIntField(term29537, term29537.getClass(), "totalMasterSync", 0);
        setIntField(term29537, term29537.getClass(), "totalReMasterSync", 0);
        setIntField(term29537, term29537.getClass(), "playerRating", 0);
        setIntField(term29537, term29537.getClass(), "highestRating", 0);
        setIntField(term29537, term29537.getClass(), "rankAuthTailId", 0);
        setField(term29537, term29537.getClass(), "eventWatchedDate", null);
        setField(term29537, term29537.getClass(), "webLimitDate", null);
        setIntField(term29537, term29537.getClass(), "challengeTrackPhase", 0);
        setIntField(term29537, term29537.getClass(), "firstPlayBits", 0);
        setField(term29537, term29537.getClass(), "lastPlayDate", null);
        setIntField(term29537, term29537.getClass(), "lastPlaceId", 0);
        setField(term29537, term29537.getClass(), "lastPlaceName", null);
        setIntField(term29537, term29537.getClass(), "lastRegionId", 0);
        setField(term29537, term29537.getClass(), "lastRegionName", null);
        setField(term29537, term29537.getClass(), "lastClientId", null);
        setField(term29537, term29537.getClass(), "lastCountryCode", null);
        setIntField(term29537, term29537.getClass(), "eventPoint", 0);
        setIntField(term29537, term29537.getClass(), "totalLv", 0);
        setIntField(term29537, term29537.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29537, term29537.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29537, term29537.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebLimitDate", argTypes, term29537, args);
    }

};


