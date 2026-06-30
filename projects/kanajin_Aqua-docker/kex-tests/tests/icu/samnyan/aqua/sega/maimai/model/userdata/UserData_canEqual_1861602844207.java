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

public class UserData_canEqual_1861602844207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32391;

    public UserData_canEqual_1861602844207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32391 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32391, term32391.getClass(), "id", 0L);
        setField(term32391, term32391.getClass(), "card", null);
        setIntField(term32391, term32391.getClass(), "lastDataVersion", 0);
        setField(term32391, term32391.getClass(), "userName", null);
        setIntField(term32391, term32391.getClass(), "point", 0);
        setIntField(term32391, term32391.getClass(), "totalPoint", 0);
        setIntField(term32391, term32391.getClass(), "iconId", 0);
        setIntField(term32391, term32391.getClass(), "nameplateId", 0);
        setIntField(term32391, term32391.getClass(), "frameId", 0);
        setIntField(term32391, term32391.getClass(), "trophyId", 0);
        setIntField(term32391, term32391.getClass(), "playCount", 0);
        setIntField(term32391, term32391.getClass(), "playVsCount", 0);
        setIntField(term32391, term32391.getClass(), "playSyncCount", 0);
        setIntField(term32391, term32391.getClass(), "winCount", 0);
        setIntField(term32391, term32391.getClass(), "helpCount", 0);
        setIntField(term32391, term32391.getClass(), "comboCount", 0);
        setIntField(term32391, term32391.getClass(), "feverCount", 0);
        setIntField(term32391, term32391.getClass(), "totalHiScore", 0);
        setIntField(term32391, term32391.getClass(), "totalEasyHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalBasicHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalExpertHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalMasterHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32391, term32391.getClass(), "totalHighSync", 0);
        setIntField(term32391, term32391.getClass(), "totalEasySync", 0);
        setIntField(term32391, term32391.getClass(), "totalBasicSync", 0);
        setIntField(term32391, term32391.getClass(), "totalAdvancedSync", 0);
        setIntField(term32391, term32391.getClass(), "totalExpertSync", 0);
        setIntField(term32391, term32391.getClass(), "totalMasterSync", 0);
        setIntField(term32391, term32391.getClass(), "totalReMasterSync", 0);
        setIntField(term32391, term32391.getClass(), "playerRating", 0);
        setIntField(term32391, term32391.getClass(), "highestRating", 0);
        setIntField(term32391, term32391.getClass(), "rankAuthTailId", 0);
        setField(term32391, term32391.getClass(), "eventWatchedDate", null);
        setField(term32391, term32391.getClass(), "webLimitDate", null);
        setIntField(term32391, term32391.getClass(), "challengeTrackPhase", 0);
        setIntField(term32391, term32391.getClass(), "firstPlayBits", 0);
        setField(term32391, term32391.getClass(), "lastPlayDate", null);
        setIntField(term32391, term32391.getClass(), "lastPlaceId", 0);
        setField(term32391, term32391.getClass(), "lastPlaceName", null);
        setIntField(term32391, term32391.getClass(), "lastRegionId", 0);
        setField(term32391, term32391.getClass(), "lastRegionName", null);
        setField(term32391, term32391.getClass(), "lastClientId", null);
        setField(term32391, term32391.getClass(), "lastCountryCode", null);
        setIntField(term32391, term32391.getClass(), "eventPoint", 0);
        setIntField(term32391, term32391.getClass(), "totalLv", 0);
        setIntField(term32391, term32391.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32391, term32391.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32391, term32391.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term32391, args);
    }

};


