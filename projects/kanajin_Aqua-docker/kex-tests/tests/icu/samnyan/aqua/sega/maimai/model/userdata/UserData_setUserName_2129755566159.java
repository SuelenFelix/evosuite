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

public class UserData_setUserName_2129755566159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30297;

    public UserData_setUserName_2129755566159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30297, term30297.getClass(), "id", 0L);
        setField(term30297, term30297.getClass(), "card", null);
        setIntField(term30297, term30297.getClass(), "lastDataVersion", 0);
        setField(term30297, term30297.getClass(), "userName", null);
        setIntField(term30297, term30297.getClass(), "point", 0);
        setIntField(term30297, term30297.getClass(), "totalPoint", 0);
        setIntField(term30297, term30297.getClass(), "iconId", 0);
        setIntField(term30297, term30297.getClass(), "nameplateId", 0);
        setIntField(term30297, term30297.getClass(), "frameId", 0);
        setIntField(term30297, term30297.getClass(), "trophyId", 0);
        setIntField(term30297, term30297.getClass(), "playCount", 0);
        setIntField(term30297, term30297.getClass(), "playVsCount", 0);
        setIntField(term30297, term30297.getClass(), "playSyncCount", 0);
        setIntField(term30297, term30297.getClass(), "winCount", 0);
        setIntField(term30297, term30297.getClass(), "helpCount", 0);
        setIntField(term30297, term30297.getClass(), "comboCount", 0);
        setIntField(term30297, term30297.getClass(), "feverCount", 0);
        setIntField(term30297, term30297.getClass(), "totalHiScore", 0);
        setIntField(term30297, term30297.getClass(), "totalEasyHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalBasicHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalExpertHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalMasterHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30297, term30297.getClass(), "totalHighSync", 0);
        setIntField(term30297, term30297.getClass(), "totalEasySync", 0);
        setIntField(term30297, term30297.getClass(), "totalBasicSync", 0);
        setIntField(term30297, term30297.getClass(), "totalAdvancedSync", 0);
        setIntField(term30297, term30297.getClass(), "totalExpertSync", 0);
        setIntField(term30297, term30297.getClass(), "totalMasterSync", 0);
        setIntField(term30297, term30297.getClass(), "totalReMasterSync", 0);
        setIntField(term30297, term30297.getClass(), "playerRating", 0);
        setIntField(term30297, term30297.getClass(), "highestRating", 0);
        setIntField(term30297, term30297.getClass(), "rankAuthTailId", 0);
        setField(term30297, term30297.getClass(), "eventWatchedDate", null);
        setField(term30297, term30297.getClass(), "webLimitDate", null);
        setIntField(term30297, term30297.getClass(), "challengeTrackPhase", 0);
        setIntField(term30297, term30297.getClass(), "firstPlayBits", 0);
        setField(term30297, term30297.getClass(), "lastPlayDate", null);
        setIntField(term30297, term30297.getClass(), "lastPlaceId", 0);
        setField(term30297, term30297.getClass(), "lastPlaceName", null);
        setIntField(term30297, term30297.getClass(), "lastRegionId", 0);
        setField(term30297, term30297.getClass(), "lastRegionName", null);
        setField(term30297, term30297.getClass(), "lastClientId", null);
        setField(term30297, term30297.getClass(), "lastCountryCode", null);
        setIntField(term30297, term30297.getClass(), "eventPoint", 0);
        setIntField(term30297, term30297.getClass(), "totalLv", 0);
        setIntField(term30297, term30297.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30297, term30297.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30297, term30297.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term30297, args);
    }

};


