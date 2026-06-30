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

public class UserData_getTotalReMasterSync_56104455136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29327;

    public UserData_getTotalReMasterSync_56104455136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29327, term29327.getClass(), "id", 0L);
        setField(term29327, term29327.getClass(), "card", null);
        setIntField(term29327, term29327.getClass(), "lastDataVersion", 0);
        setField(term29327, term29327.getClass(), "userName", null);
        setIntField(term29327, term29327.getClass(), "point", 0);
        setIntField(term29327, term29327.getClass(), "totalPoint", 0);
        setIntField(term29327, term29327.getClass(), "iconId", 0);
        setIntField(term29327, term29327.getClass(), "nameplateId", 0);
        setIntField(term29327, term29327.getClass(), "frameId", 0);
        setIntField(term29327, term29327.getClass(), "trophyId", 0);
        setIntField(term29327, term29327.getClass(), "playCount", 0);
        setIntField(term29327, term29327.getClass(), "playVsCount", 0);
        setIntField(term29327, term29327.getClass(), "playSyncCount", 0);
        setIntField(term29327, term29327.getClass(), "winCount", 0);
        setIntField(term29327, term29327.getClass(), "helpCount", 0);
        setIntField(term29327, term29327.getClass(), "comboCount", 0);
        setIntField(term29327, term29327.getClass(), "feverCount", 0);
        setIntField(term29327, term29327.getClass(), "totalHiScore", 0);
        setIntField(term29327, term29327.getClass(), "totalEasyHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalBasicHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalExpertHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalMasterHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29327, term29327.getClass(), "totalHighSync", 0);
        setIntField(term29327, term29327.getClass(), "totalEasySync", 0);
        setIntField(term29327, term29327.getClass(), "totalBasicSync", 0);
        setIntField(term29327, term29327.getClass(), "totalAdvancedSync", 0);
        setIntField(term29327, term29327.getClass(), "totalExpertSync", 0);
        setIntField(term29327, term29327.getClass(), "totalMasterSync", 0);
        setIntField(term29327, term29327.getClass(), "totalReMasterSync", 0);
        setIntField(term29327, term29327.getClass(), "playerRating", 0);
        setIntField(term29327, term29327.getClass(), "highestRating", 0);
        setIntField(term29327, term29327.getClass(), "rankAuthTailId", 0);
        setField(term29327, term29327.getClass(), "eventWatchedDate", null);
        setField(term29327, term29327.getClass(), "webLimitDate", null);
        setIntField(term29327, term29327.getClass(), "challengeTrackPhase", 0);
        setIntField(term29327, term29327.getClass(), "firstPlayBits", 0);
        setField(term29327, term29327.getClass(), "lastPlayDate", null);
        setIntField(term29327, term29327.getClass(), "lastPlaceId", 0);
        setField(term29327, term29327.getClass(), "lastPlaceName", null);
        setIntField(term29327, term29327.getClass(), "lastRegionId", 0);
        setField(term29327, term29327.getClass(), "lastRegionName", null);
        setField(term29327, term29327.getClass(), "lastClientId", null);
        setField(term29327, term29327.getClass(), "lastCountryCode", null);
        setIntField(term29327, term29327.getClass(), "eventPoint", 0);
        setIntField(term29327, term29327.getClass(), "totalLv", 0);
        setIntField(term29327, term29327.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29327, term29327.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29327, term29327.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term29327, args);
    }

};


