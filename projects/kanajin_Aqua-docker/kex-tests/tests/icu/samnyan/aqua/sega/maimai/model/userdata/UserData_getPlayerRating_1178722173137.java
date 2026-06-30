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

public class UserData_getPlayerRating_1178722173137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29369;

    public UserData_getPlayerRating_1178722173137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29369 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29369, term29369.getClass(), "id", 0L);
        setField(term29369, term29369.getClass(), "card", null);
        setIntField(term29369, term29369.getClass(), "lastDataVersion", 0);
        setField(term29369, term29369.getClass(), "userName", null);
        setIntField(term29369, term29369.getClass(), "point", 0);
        setIntField(term29369, term29369.getClass(), "totalPoint", 0);
        setIntField(term29369, term29369.getClass(), "iconId", 0);
        setIntField(term29369, term29369.getClass(), "nameplateId", 0);
        setIntField(term29369, term29369.getClass(), "frameId", 0);
        setIntField(term29369, term29369.getClass(), "trophyId", 0);
        setIntField(term29369, term29369.getClass(), "playCount", 0);
        setIntField(term29369, term29369.getClass(), "playVsCount", 0);
        setIntField(term29369, term29369.getClass(), "playSyncCount", 0);
        setIntField(term29369, term29369.getClass(), "winCount", 0);
        setIntField(term29369, term29369.getClass(), "helpCount", 0);
        setIntField(term29369, term29369.getClass(), "comboCount", 0);
        setIntField(term29369, term29369.getClass(), "feverCount", 0);
        setIntField(term29369, term29369.getClass(), "totalHiScore", 0);
        setIntField(term29369, term29369.getClass(), "totalEasyHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalBasicHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalExpertHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalMasterHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29369, term29369.getClass(), "totalHighSync", 0);
        setIntField(term29369, term29369.getClass(), "totalEasySync", 0);
        setIntField(term29369, term29369.getClass(), "totalBasicSync", 0);
        setIntField(term29369, term29369.getClass(), "totalAdvancedSync", 0);
        setIntField(term29369, term29369.getClass(), "totalExpertSync", 0);
        setIntField(term29369, term29369.getClass(), "totalMasterSync", 0);
        setIntField(term29369, term29369.getClass(), "totalReMasterSync", 0);
        setIntField(term29369, term29369.getClass(), "playerRating", 0);
        setIntField(term29369, term29369.getClass(), "highestRating", 0);
        setIntField(term29369, term29369.getClass(), "rankAuthTailId", 0);
        setField(term29369, term29369.getClass(), "eventWatchedDate", null);
        setField(term29369, term29369.getClass(), "webLimitDate", null);
        setIntField(term29369, term29369.getClass(), "challengeTrackPhase", 0);
        setIntField(term29369, term29369.getClass(), "firstPlayBits", 0);
        setField(term29369, term29369.getClass(), "lastPlayDate", null);
        setIntField(term29369, term29369.getClass(), "lastPlaceId", 0);
        setField(term29369, term29369.getClass(), "lastPlaceName", null);
        setIntField(term29369, term29369.getClass(), "lastRegionId", 0);
        setField(term29369, term29369.getClass(), "lastRegionName", null);
        setField(term29369, term29369.getClass(), "lastClientId", null);
        setField(term29369, term29369.getClass(), "lastCountryCode", null);
        setIntField(term29369, term29369.getClass(), "eventPoint", 0);
        setIntField(term29369, term29369.getClass(), "totalLv", 0);
        setIntField(term29369, term29369.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29369, term29369.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29369, term29369.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term29369, args);
    }

};


