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

public class UserData_getNameplateId_1973699879113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28361;

    public UserData_getNameplateId_1973699879113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28361, term28361.getClass(), "id", 0L);
        setField(term28361, term28361.getClass(), "card", null);
        setIntField(term28361, term28361.getClass(), "lastDataVersion", 0);
        setField(term28361, term28361.getClass(), "userName", null);
        setIntField(term28361, term28361.getClass(), "point", 0);
        setIntField(term28361, term28361.getClass(), "totalPoint", 0);
        setIntField(term28361, term28361.getClass(), "iconId", 0);
        setIntField(term28361, term28361.getClass(), "nameplateId", 0);
        setIntField(term28361, term28361.getClass(), "frameId", 0);
        setIntField(term28361, term28361.getClass(), "trophyId", 0);
        setIntField(term28361, term28361.getClass(), "playCount", 0);
        setIntField(term28361, term28361.getClass(), "playVsCount", 0);
        setIntField(term28361, term28361.getClass(), "playSyncCount", 0);
        setIntField(term28361, term28361.getClass(), "winCount", 0);
        setIntField(term28361, term28361.getClass(), "helpCount", 0);
        setIntField(term28361, term28361.getClass(), "comboCount", 0);
        setIntField(term28361, term28361.getClass(), "feverCount", 0);
        setIntField(term28361, term28361.getClass(), "totalHiScore", 0);
        setIntField(term28361, term28361.getClass(), "totalEasyHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalBasicHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalExpertHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalMasterHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28361, term28361.getClass(), "totalHighSync", 0);
        setIntField(term28361, term28361.getClass(), "totalEasySync", 0);
        setIntField(term28361, term28361.getClass(), "totalBasicSync", 0);
        setIntField(term28361, term28361.getClass(), "totalAdvancedSync", 0);
        setIntField(term28361, term28361.getClass(), "totalExpertSync", 0);
        setIntField(term28361, term28361.getClass(), "totalMasterSync", 0);
        setIntField(term28361, term28361.getClass(), "totalReMasterSync", 0);
        setIntField(term28361, term28361.getClass(), "playerRating", 0);
        setIntField(term28361, term28361.getClass(), "highestRating", 0);
        setIntField(term28361, term28361.getClass(), "rankAuthTailId", 0);
        setField(term28361, term28361.getClass(), "eventWatchedDate", null);
        setField(term28361, term28361.getClass(), "webLimitDate", null);
        setIntField(term28361, term28361.getClass(), "challengeTrackPhase", 0);
        setIntField(term28361, term28361.getClass(), "firstPlayBits", 0);
        setField(term28361, term28361.getClass(), "lastPlayDate", null);
        setIntField(term28361, term28361.getClass(), "lastPlaceId", 0);
        setField(term28361, term28361.getClass(), "lastPlaceName", null);
        setIntField(term28361, term28361.getClass(), "lastRegionId", 0);
        setField(term28361, term28361.getClass(), "lastRegionName", null);
        setField(term28361, term28361.getClass(), "lastClientId", null);
        setField(term28361, term28361.getClass(), "lastCountryCode", null);
        setIntField(term28361, term28361.getClass(), "eventPoint", 0);
        setIntField(term28361, term28361.getClass(), "totalLv", 0);
        setIntField(term28361, term28361.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28361, term28361.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28361, term28361.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term28361, args);
    }

};


