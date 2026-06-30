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

public class UserData_getHighestRating_1705748138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29411;

    public UserData_getHighestRating_1705748138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29411 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29411, term29411.getClass(), "id", 0L);
        setField(term29411, term29411.getClass(), "card", null);
        setIntField(term29411, term29411.getClass(), "lastDataVersion", 0);
        setField(term29411, term29411.getClass(), "userName", null);
        setIntField(term29411, term29411.getClass(), "point", 0);
        setIntField(term29411, term29411.getClass(), "totalPoint", 0);
        setIntField(term29411, term29411.getClass(), "iconId", 0);
        setIntField(term29411, term29411.getClass(), "nameplateId", 0);
        setIntField(term29411, term29411.getClass(), "frameId", 0);
        setIntField(term29411, term29411.getClass(), "trophyId", 0);
        setIntField(term29411, term29411.getClass(), "playCount", 0);
        setIntField(term29411, term29411.getClass(), "playVsCount", 0);
        setIntField(term29411, term29411.getClass(), "playSyncCount", 0);
        setIntField(term29411, term29411.getClass(), "winCount", 0);
        setIntField(term29411, term29411.getClass(), "helpCount", 0);
        setIntField(term29411, term29411.getClass(), "comboCount", 0);
        setIntField(term29411, term29411.getClass(), "feverCount", 0);
        setIntField(term29411, term29411.getClass(), "totalHiScore", 0);
        setIntField(term29411, term29411.getClass(), "totalEasyHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalBasicHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalExpertHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalMasterHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29411, term29411.getClass(), "totalHighSync", 0);
        setIntField(term29411, term29411.getClass(), "totalEasySync", 0);
        setIntField(term29411, term29411.getClass(), "totalBasicSync", 0);
        setIntField(term29411, term29411.getClass(), "totalAdvancedSync", 0);
        setIntField(term29411, term29411.getClass(), "totalExpertSync", 0);
        setIntField(term29411, term29411.getClass(), "totalMasterSync", 0);
        setIntField(term29411, term29411.getClass(), "totalReMasterSync", 0);
        setIntField(term29411, term29411.getClass(), "playerRating", 0);
        setIntField(term29411, term29411.getClass(), "highestRating", 0);
        setIntField(term29411, term29411.getClass(), "rankAuthTailId", 0);
        setField(term29411, term29411.getClass(), "eventWatchedDate", null);
        setField(term29411, term29411.getClass(), "webLimitDate", null);
        setIntField(term29411, term29411.getClass(), "challengeTrackPhase", 0);
        setIntField(term29411, term29411.getClass(), "firstPlayBits", 0);
        setField(term29411, term29411.getClass(), "lastPlayDate", null);
        setIntField(term29411, term29411.getClass(), "lastPlaceId", 0);
        setField(term29411, term29411.getClass(), "lastPlaceName", null);
        setIntField(term29411, term29411.getClass(), "lastRegionId", 0);
        setField(term29411, term29411.getClass(), "lastRegionName", null);
        setField(term29411, term29411.getClass(), "lastClientId", null);
        setField(term29411, term29411.getClass(), "lastCountryCode", null);
        setIntField(term29411, term29411.getClass(), "eventPoint", 0);
        setIntField(term29411, term29411.getClass(), "totalLv", 0);
        setIntField(term29411, term29411.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29411, term29411.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29411, term29411.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term29411, args);
    }

};


