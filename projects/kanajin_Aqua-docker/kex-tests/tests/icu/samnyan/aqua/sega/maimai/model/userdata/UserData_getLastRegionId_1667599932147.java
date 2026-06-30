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

public class UserData_getLastRegionId_1667599932147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29789;

    public UserData_getLastRegionId_1667599932147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29789 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29789, term29789.getClass(), "id", 0L);
        setField(term29789, term29789.getClass(), "card", null);
        setIntField(term29789, term29789.getClass(), "lastDataVersion", 0);
        setField(term29789, term29789.getClass(), "userName", null);
        setIntField(term29789, term29789.getClass(), "point", 0);
        setIntField(term29789, term29789.getClass(), "totalPoint", 0);
        setIntField(term29789, term29789.getClass(), "iconId", 0);
        setIntField(term29789, term29789.getClass(), "nameplateId", 0);
        setIntField(term29789, term29789.getClass(), "frameId", 0);
        setIntField(term29789, term29789.getClass(), "trophyId", 0);
        setIntField(term29789, term29789.getClass(), "playCount", 0);
        setIntField(term29789, term29789.getClass(), "playVsCount", 0);
        setIntField(term29789, term29789.getClass(), "playSyncCount", 0);
        setIntField(term29789, term29789.getClass(), "winCount", 0);
        setIntField(term29789, term29789.getClass(), "helpCount", 0);
        setIntField(term29789, term29789.getClass(), "comboCount", 0);
        setIntField(term29789, term29789.getClass(), "feverCount", 0);
        setIntField(term29789, term29789.getClass(), "totalHiScore", 0);
        setIntField(term29789, term29789.getClass(), "totalEasyHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalBasicHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalExpertHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalMasterHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29789, term29789.getClass(), "totalHighSync", 0);
        setIntField(term29789, term29789.getClass(), "totalEasySync", 0);
        setIntField(term29789, term29789.getClass(), "totalBasicSync", 0);
        setIntField(term29789, term29789.getClass(), "totalAdvancedSync", 0);
        setIntField(term29789, term29789.getClass(), "totalExpertSync", 0);
        setIntField(term29789, term29789.getClass(), "totalMasterSync", 0);
        setIntField(term29789, term29789.getClass(), "totalReMasterSync", 0);
        setIntField(term29789, term29789.getClass(), "playerRating", 0);
        setIntField(term29789, term29789.getClass(), "highestRating", 0);
        setIntField(term29789, term29789.getClass(), "rankAuthTailId", 0);
        setField(term29789, term29789.getClass(), "eventWatchedDate", null);
        setField(term29789, term29789.getClass(), "webLimitDate", null);
        setIntField(term29789, term29789.getClass(), "challengeTrackPhase", 0);
        setIntField(term29789, term29789.getClass(), "firstPlayBits", 0);
        setField(term29789, term29789.getClass(), "lastPlayDate", null);
        setIntField(term29789, term29789.getClass(), "lastPlaceId", 0);
        setField(term29789, term29789.getClass(), "lastPlaceName", null);
        setIntField(term29789, term29789.getClass(), "lastRegionId", 0);
        setField(term29789, term29789.getClass(), "lastRegionName", null);
        setField(term29789, term29789.getClass(), "lastClientId", null);
        setField(term29789, term29789.getClass(), "lastCountryCode", null);
        setIntField(term29789, term29789.getClass(), "eventPoint", 0);
        setIntField(term29789, term29789.getClass(), "totalLv", 0);
        setIntField(term29789, term29789.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29789, term29789.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29789, term29789.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term29789, args);
    }

};


