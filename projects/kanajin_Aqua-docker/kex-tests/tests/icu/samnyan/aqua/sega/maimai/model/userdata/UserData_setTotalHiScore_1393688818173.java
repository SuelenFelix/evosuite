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
import java.lang.Integer;

public class UserData_setTotalHiScore_1393688818173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30911;
     Object term30953;

    public UserData_setTotalHiScore_1393688818173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30911, term30911.getClass(), "id", 0L);
        setField(term30911, term30911.getClass(), "card", null);
        setIntField(term30911, term30911.getClass(), "lastDataVersion", 0);
        setField(term30911, term30911.getClass(), "userName", null);
        setIntField(term30911, term30911.getClass(), "point", 0);
        setIntField(term30911, term30911.getClass(), "totalPoint", 0);
        setIntField(term30911, term30911.getClass(), "iconId", 0);
        setIntField(term30911, term30911.getClass(), "nameplateId", 0);
        setIntField(term30911, term30911.getClass(), "frameId", 0);
        setIntField(term30911, term30911.getClass(), "trophyId", 0);
        setIntField(term30911, term30911.getClass(), "playCount", 0);
        setIntField(term30911, term30911.getClass(), "playVsCount", 0);
        setIntField(term30911, term30911.getClass(), "playSyncCount", 0);
        setIntField(term30911, term30911.getClass(), "winCount", 0);
        setIntField(term30911, term30911.getClass(), "helpCount", 0);
        setIntField(term30911, term30911.getClass(), "comboCount", 0);
        setIntField(term30911, term30911.getClass(), "feverCount", 0);
        setIntField(term30911, term30911.getClass(), "totalHiScore", 0);
        setIntField(term30911, term30911.getClass(), "totalEasyHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalBasicHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalExpertHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalMasterHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30911, term30911.getClass(), "totalHighSync", 0);
        setIntField(term30911, term30911.getClass(), "totalEasySync", 0);
        setIntField(term30911, term30911.getClass(), "totalBasicSync", 0);
        setIntField(term30911, term30911.getClass(), "totalAdvancedSync", 0);
        setIntField(term30911, term30911.getClass(), "totalExpertSync", 0);
        setIntField(term30911, term30911.getClass(), "totalMasterSync", 0);
        setIntField(term30911, term30911.getClass(), "totalReMasterSync", 0);
        setIntField(term30911, term30911.getClass(), "playerRating", 0);
        setIntField(term30911, term30911.getClass(), "highestRating", 0);
        setIntField(term30911, term30911.getClass(), "rankAuthTailId", 0);
        setField(term30911, term30911.getClass(), "eventWatchedDate", null);
        setField(term30911, term30911.getClass(), "webLimitDate", null);
        setIntField(term30911, term30911.getClass(), "challengeTrackPhase", 0);
        setIntField(term30911, term30911.getClass(), "firstPlayBits", 0);
        setField(term30911, term30911.getClass(), "lastPlayDate", null);
        setIntField(term30911, term30911.getClass(), "lastPlaceId", 0);
        setField(term30911, term30911.getClass(), "lastPlaceName", null);
        setIntField(term30911, term30911.getClass(), "lastRegionId", 0);
        setField(term30911, term30911.getClass(), "lastRegionName", null);
        setField(term30911, term30911.getClass(), "lastClientId", null);
        setField(term30911, term30911.getClass(), "lastCountryCode", null);
        setIntField(term30911, term30911.getClass(), "eventPoint", 0);
        setIntField(term30911, term30911.getClass(), "totalLv", 0);
        setIntField(term30911, term30911.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30911, term30911.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30911, term30911.getClass(), "loginBonusLv", 0);
        term30953 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30953;
        callMethod(klass, "setTotalHiScore", argTypes, term30911, args);
    }

};


