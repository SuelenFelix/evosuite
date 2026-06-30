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

public class UserData_getTotalLv_180938783152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29999;

    public UserData_getTotalLv_180938783152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29999 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29999, term29999.getClass(), "id", 0L);
        setField(term29999, term29999.getClass(), "card", null);
        setIntField(term29999, term29999.getClass(), "lastDataVersion", 0);
        setField(term29999, term29999.getClass(), "userName", null);
        setIntField(term29999, term29999.getClass(), "point", 0);
        setIntField(term29999, term29999.getClass(), "totalPoint", 0);
        setIntField(term29999, term29999.getClass(), "iconId", 0);
        setIntField(term29999, term29999.getClass(), "nameplateId", 0);
        setIntField(term29999, term29999.getClass(), "frameId", 0);
        setIntField(term29999, term29999.getClass(), "trophyId", 0);
        setIntField(term29999, term29999.getClass(), "playCount", 0);
        setIntField(term29999, term29999.getClass(), "playVsCount", 0);
        setIntField(term29999, term29999.getClass(), "playSyncCount", 0);
        setIntField(term29999, term29999.getClass(), "winCount", 0);
        setIntField(term29999, term29999.getClass(), "helpCount", 0);
        setIntField(term29999, term29999.getClass(), "comboCount", 0);
        setIntField(term29999, term29999.getClass(), "feverCount", 0);
        setIntField(term29999, term29999.getClass(), "totalHiScore", 0);
        setIntField(term29999, term29999.getClass(), "totalEasyHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalBasicHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalExpertHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalMasterHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29999, term29999.getClass(), "totalHighSync", 0);
        setIntField(term29999, term29999.getClass(), "totalEasySync", 0);
        setIntField(term29999, term29999.getClass(), "totalBasicSync", 0);
        setIntField(term29999, term29999.getClass(), "totalAdvancedSync", 0);
        setIntField(term29999, term29999.getClass(), "totalExpertSync", 0);
        setIntField(term29999, term29999.getClass(), "totalMasterSync", 0);
        setIntField(term29999, term29999.getClass(), "totalReMasterSync", 0);
        setIntField(term29999, term29999.getClass(), "playerRating", 0);
        setIntField(term29999, term29999.getClass(), "highestRating", 0);
        setIntField(term29999, term29999.getClass(), "rankAuthTailId", 0);
        setField(term29999, term29999.getClass(), "eventWatchedDate", null);
        setField(term29999, term29999.getClass(), "webLimitDate", null);
        setIntField(term29999, term29999.getClass(), "challengeTrackPhase", 0);
        setIntField(term29999, term29999.getClass(), "firstPlayBits", 0);
        setField(term29999, term29999.getClass(), "lastPlayDate", null);
        setIntField(term29999, term29999.getClass(), "lastPlaceId", 0);
        setField(term29999, term29999.getClass(), "lastPlaceName", null);
        setIntField(term29999, term29999.getClass(), "lastRegionId", 0);
        setField(term29999, term29999.getClass(), "lastRegionName", null);
        setField(term29999, term29999.getClass(), "lastClientId", null);
        setField(term29999, term29999.getClass(), "lastCountryCode", null);
        setIntField(term29999, term29999.getClass(), "eventPoint", 0);
        setIntField(term29999, term29999.getClass(), "totalLv", 0);
        setIntField(term29999, term29999.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29999, term29999.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29999, term29999.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalLv", argTypes, term29999, args);
    }

};


