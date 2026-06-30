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

public class UserData_getTotalAdvancedSync_839100940133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29201;

    public UserData_getTotalAdvancedSync_839100940133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29201 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29201, term29201.getClass(), "id", 0L);
        setField(term29201, term29201.getClass(), "card", null);
        setIntField(term29201, term29201.getClass(), "lastDataVersion", 0);
        setField(term29201, term29201.getClass(), "userName", null);
        setIntField(term29201, term29201.getClass(), "point", 0);
        setIntField(term29201, term29201.getClass(), "totalPoint", 0);
        setIntField(term29201, term29201.getClass(), "iconId", 0);
        setIntField(term29201, term29201.getClass(), "nameplateId", 0);
        setIntField(term29201, term29201.getClass(), "frameId", 0);
        setIntField(term29201, term29201.getClass(), "trophyId", 0);
        setIntField(term29201, term29201.getClass(), "playCount", 0);
        setIntField(term29201, term29201.getClass(), "playVsCount", 0);
        setIntField(term29201, term29201.getClass(), "playSyncCount", 0);
        setIntField(term29201, term29201.getClass(), "winCount", 0);
        setIntField(term29201, term29201.getClass(), "helpCount", 0);
        setIntField(term29201, term29201.getClass(), "comboCount", 0);
        setIntField(term29201, term29201.getClass(), "feverCount", 0);
        setIntField(term29201, term29201.getClass(), "totalHiScore", 0);
        setIntField(term29201, term29201.getClass(), "totalEasyHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalBasicHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalExpertHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalMasterHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29201, term29201.getClass(), "totalHighSync", 0);
        setIntField(term29201, term29201.getClass(), "totalEasySync", 0);
        setIntField(term29201, term29201.getClass(), "totalBasicSync", 0);
        setIntField(term29201, term29201.getClass(), "totalAdvancedSync", 0);
        setIntField(term29201, term29201.getClass(), "totalExpertSync", 0);
        setIntField(term29201, term29201.getClass(), "totalMasterSync", 0);
        setIntField(term29201, term29201.getClass(), "totalReMasterSync", 0);
        setIntField(term29201, term29201.getClass(), "playerRating", 0);
        setIntField(term29201, term29201.getClass(), "highestRating", 0);
        setIntField(term29201, term29201.getClass(), "rankAuthTailId", 0);
        setField(term29201, term29201.getClass(), "eventWatchedDate", null);
        setField(term29201, term29201.getClass(), "webLimitDate", null);
        setIntField(term29201, term29201.getClass(), "challengeTrackPhase", 0);
        setIntField(term29201, term29201.getClass(), "firstPlayBits", 0);
        setField(term29201, term29201.getClass(), "lastPlayDate", null);
        setIntField(term29201, term29201.getClass(), "lastPlaceId", 0);
        setField(term29201, term29201.getClass(), "lastPlaceName", null);
        setIntField(term29201, term29201.getClass(), "lastRegionId", 0);
        setField(term29201, term29201.getClass(), "lastRegionName", null);
        setField(term29201, term29201.getClass(), "lastClientId", null);
        setField(term29201, term29201.getClass(), "lastCountryCode", null);
        setIntField(term29201, term29201.getClass(), "eventPoint", 0);
        setIntField(term29201, term29201.getClass(), "totalLv", 0);
        setIntField(term29201, term29201.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29201, term29201.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29201, term29201.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedSync", argTypes, term29201, args);
    }

};


