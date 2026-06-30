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

public class UserData_setLastPlaceName_1552501932196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31917;

    public UserData_setLastPlaceName_1552501932196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31917, term31917.getClass(), "id", 0L);
        setField(term31917, term31917.getClass(), "card", null);
        setIntField(term31917, term31917.getClass(), "lastDataVersion", 0);
        setField(term31917, term31917.getClass(), "userName", null);
        setIntField(term31917, term31917.getClass(), "point", 0);
        setIntField(term31917, term31917.getClass(), "totalPoint", 0);
        setIntField(term31917, term31917.getClass(), "iconId", 0);
        setIntField(term31917, term31917.getClass(), "nameplateId", 0);
        setIntField(term31917, term31917.getClass(), "frameId", 0);
        setIntField(term31917, term31917.getClass(), "trophyId", 0);
        setIntField(term31917, term31917.getClass(), "playCount", 0);
        setIntField(term31917, term31917.getClass(), "playVsCount", 0);
        setIntField(term31917, term31917.getClass(), "playSyncCount", 0);
        setIntField(term31917, term31917.getClass(), "winCount", 0);
        setIntField(term31917, term31917.getClass(), "helpCount", 0);
        setIntField(term31917, term31917.getClass(), "comboCount", 0);
        setIntField(term31917, term31917.getClass(), "feverCount", 0);
        setIntField(term31917, term31917.getClass(), "totalHiScore", 0);
        setIntField(term31917, term31917.getClass(), "totalEasyHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalBasicHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalExpertHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalMasterHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31917, term31917.getClass(), "totalHighSync", 0);
        setIntField(term31917, term31917.getClass(), "totalEasySync", 0);
        setIntField(term31917, term31917.getClass(), "totalBasicSync", 0);
        setIntField(term31917, term31917.getClass(), "totalAdvancedSync", 0);
        setIntField(term31917, term31917.getClass(), "totalExpertSync", 0);
        setIntField(term31917, term31917.getClass(), "totalMasterSync", 0);
        setIntField(term31917, term31917.getClass(), "totalReMasterSync", 0);
        setIntField(term31917, term31917.getClass(), "playerRating", 0);
        setIntField(term31917, term31917.getClass(), "highestRating", 0);
        setIntField(term31917, term31917.getClass(), "rankAuthTailId", 0);
        setField(term31917, term31917.getClass(), "eventWatchedDate", null);
        setField(term31917, term31917.getClass(), "webLimitDate", null);
        setIntField(term31917, term31917.getClass(), "challengeTrackPhase", 0);
        setIntField(term31917, term31917.getClass(), "firstPlayBits", 0);
        setField(term31917, term31917.getClass(), "lastPlayDate", null);
        setIntField(term31917, term31917.getClass(), "lastPlaceId", 0);
        setField(term31917, term31917.getClass(), "lastPlaceName", null);
        setIntField(term31917, term31917.getClass(), "lastRegionId", 0);
        setField(term31917, term31917.getClass(), "lastRegionName", null);
        setField(term31917, term31917.getClass(), "lastClientId", null);
        setField(term31917, term31917.getClass(), "lastCountryCode", null);
        setIntField(term31917, term31917.getClass(), "eventPoint", 0);
        setIntField(term31917, term31917.getClass(), "totalLv", 0);
        setIntField(term31917, term31917.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31917, term31917.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31917, term31917.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlaceName", argTypes, term31917, args);
    }

};


