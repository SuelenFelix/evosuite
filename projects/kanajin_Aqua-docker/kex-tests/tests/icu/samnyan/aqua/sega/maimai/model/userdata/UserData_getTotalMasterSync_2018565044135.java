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

public class UserData_getTotalMasterSync_2018565044135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29285;

    public UserData_getTotalMasterSync_2018565044135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29285 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29285, term29285.getClass(), "id", 0L);
        setField(term29285, term29285.getClass(), "card", null);
        setIntField(term29285, term29285.getClass(), "lastDataVersion", 0);
        setField(term29285, term29285.getClass(), "userName", null);
        setIntField(term29285, term29285.getClass(), "point", 0);
        setIntField(term29285, term29285.getClass(), "totalPoint", 0);
        setIntField(term29285, term29285.getClass(), "iconId", 0);
        setIntField(term29285, term29285.getClass(), "nameplateId", 0);
        setIntField(term29285, term29285.getClass(), "frameId", 0);
        setIntField(term29285, term29285.getClass(), "trophyId", 0);
        setIntField(term29285, term29285.getClass(), "playCount", 0);
        setIntField(term29285, term29285.getClass(), "playVsCount", 0);
        setIntField(term29285, term29285.getClass(), "playSyncCount", 0);
        setIntField(term29285, term29285.getClass(), "winCount", 0);
        setIntField(term29285, term29285.getClass(), "helpCount", 0);
        setIntField(term29285, term29285.getClass(), "comboCount", 0);
        setIntField(term29285, term29285.getClass(), "feverCount", 0);
        setIntField(term29285, term29285.getClass(), "totalHiScore", 0);
        setIntField(term29285, term29285.getClass(), "totalEasyHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalBasicHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalExpertHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalMasterHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29285, term29285.getClass(), "totalHighSync", 0);
        setIntField(term29285, term29285.getClass(), "totalEasySync", 0);
        setIntField(term29285, term29285.getClass(), "totalBasicSync", 0);
        setIntField(term29285, term29285.getClass(), "totalAdvancedSync", 0);
        setIntField(term29285, term29285.getClass(), "totalExpertSync", 0);
        setIntField(term29285, term29285.getClass(), "totalMasterSync", 0);
        setIntField(term29285, term29285.getClass(), "totalReMasterSync", 0);
        setIntField(term29285, term29285.getClass(), "playerRating", 0);
        setIntField(term29285, term29285.getClass(), "highestRating", 0);
        setIntField(term29285, term29285.getClass(), "rankAuthTailId", 0);
        setField(term29285, term29285.getClass(), "eventWatchedDate", null);
        setField(term29285, term29285.getClass(), "webLimitDate", null);
        setIntField(term29285, term29285.getClass(), "challengeTrackPhase", 0);
        setIntField(term29285, term29285.getClass(), "firstPlayBits", 0);
        setField(term29285, term29285.getClass(), "lastPlayDate", null);
        setIntField(term29285, term29285.getClass(), "lastPlaceId", 0);
        setField(term29285, term29285.getClass(), "lastPlaceName", null);
        setIntField(term29285, term29285.getClass(), "lastRegionId", 0);
        setField(term29285, term29285.getClass(), "lastRegionName", null);
        setField(term29285, term29285.getClass(), "lastClientId", null);
        setField(term29285, term29285.getClass(), "lastCountryCode", null);
        setIntField(term29285, term29285.getClass(), "eventPoint", 0);
        setIntField(term29285, term29285.getClass(), "totalLv", 0);
        setIntField(term29285, term29285.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29285, term29285.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29285, term29285.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term29285, args);
    }

};


