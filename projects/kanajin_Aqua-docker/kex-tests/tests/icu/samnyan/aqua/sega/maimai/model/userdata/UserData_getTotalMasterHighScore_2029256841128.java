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

public class UserData_getTotalMasterHighScore_2029256841128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28991;

    public UserData_getTotalMasterHighScore_2029256841128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28991 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28991, term28991.getClass(), "id", 0L);
        setField(term28991, term28991.getClass(), "card", null);
        setIntField(term28991, term28991.getClass(), "lastDataVersion", 0);
        setField(term28991, term28991.getClass(), "userName", null);
        setIntField(term28991, term28991.getClass(), "point", 0);
        setIntField(term28991, term28991.getClass(), "totalPoint", 0);
        setIntField(term28991, term28991.getClass(), "iconId", 0);
        setIntField(term28991, term28991.getClass(), "nameplateId", 0);
        setIntField(term28991, term28991.getClass(), "frameId", 0);
        setIntField(term28991, term28991.getClass(), "trophyId", 0);
        setIntField(term28991, term28991.getClass(), "playCount", 0);
        setIntField(term28991, term28991.getClass(), "playVsCount", 0);
        setIntField(term28991, term28991.getClass(), "playSyncCount", 0);
        setIntField(term28991, term28991.getClass(), "winCount", 0);
        setIntField(term28991, term28991.getClass(), "helpCount", 0);
        setIntField(term28991, term28991.getClass(), "comboCount", 0);
        setIntField(term28991, term28991.getClass(), "feverCount", 0);
        setIntField(term28991, term28991.getClass(), "totalHiScore", 0);
        setIntField(term28991, term28991.getClass(), "totalEasyHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalBasicHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalExpertHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalMasterHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28991, term28991.getClass(), "totalHighSync", 0);
        setIntField(term28991, term28991.getClass(), "totalEasySync", 0);
        setIntField(term28991, term28991.getClass(), "totalBasicSync", 0);
        setIntField(term28991, term28991.getClass(), "totalAdvancedSync", 0);
        setIntField(term28991, term28991.getClass(), "totalExpertSync", 0);
        setIntField(term28991, term28991.getClass(), "totalMasterSync", 0);
        setIntField(term28991, term28991.getClass(), "totalReMasterSync", 0);
        setIntField(term28991, term28991.getClass(), "playerRating", 0);
        setIntField(term28991, term28991.getClass(), "highestRating", 0);
        setIntField(term28991, term28991.getClass(), "rankAuthTailId", 0);
        setField(term28991, term28991.getClass(), "eventWatchedDate", null);
        setField(term28991, term28991.getClass(), "webLimitDate", null);
        setIntField(term28991, term28991.getClass(), "challengeTrackPhase", 0);
        setIntField(term28991, term28991.getClass(), "firstPlayBits", 0);
        setField(term28991, term28991.getClass(), "lastPlayDate", null);
        setIntField(term28991, term28991.getClass(), "lastPlaceId", 0);
        setField(term28991, term28991.getClass(), "lastPlaceName", null);
        setIntField(term28991, term28991.getClass(), "lastRegionId", 0);
        setField(term28991, term28991.getClass(), "lastRegionName", null);
        setField(term28991, term28991.getClass(), "lastClientId", null);
        setField(term28991, term28991.getClass(), "lastCountryCode", null);
        setIntField(term28991, term28991.getClass(), "eventPoint", 0);
        setIntField(term28991, term28991.getClass(), "totalLv", 0);
        setIntField(term28991, term28991.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28991, term28991.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28991, term28991.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term28991, args);
    }

};


