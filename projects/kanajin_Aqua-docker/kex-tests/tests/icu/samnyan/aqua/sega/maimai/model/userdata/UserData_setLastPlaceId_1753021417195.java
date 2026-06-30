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

public class UserData_setLastPlaceId_1753021417195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31873;
     Object term31915;

    public UserData_setLastPlaceId_1753021417195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31873, term31873.getClass(), "id", 0L);
        setField(term31873, term31873.getClass(), "card", null);
        setIntField(term31873, term31873.getClass(), "lastDataVersion", 0);
        setField(term31873, term31873.getClass(), "userName", null);
        setIntField(term31873, term31873.getClass(), "point", 0);
        setIntField(term31873, term31873.getClass(), "totalPoint", 0);
        setIntField(term31873, term31873.getClass(), "iconId", 0);
        setIntField(term31873, term31873.getClass(), "nameplateId", 0);
        setIntField(term31873, term31873.getClass(), "frameId", 0);
        setIntField(term31873, term31873.getClass(), "trophyId", 0);
        setIntField(term31873, term31873.getClass(), "playCount", 0);
        setIntField(term31873, term31873.getClass(), "playVsCount", 0);
        setIntField(term31873, term31873.getClass(), "playSyncCount", 0);
        setIntField(term31873, term31873.getClass(), "winCount", 0);
        setIntField(term31873, term31873.getClass(), "helpCount", 0);
        setIntField(term31873, term31873.getClass(), "comboCount", 0);
        setIntField(term31873, term31873.getClass(), "feverCount", 0);
        setIntField(term31873, term31873.getClass(), "totalHiScore", 0);
        setIntField(term31873, term31873.getClass(), "totalEasyHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalBasicHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalExpertHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalMasterHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31873, term31873.getClass(), "totalHighSync", 0);
        setIntField(term31873, term31873.getClass(), "totalEasySync", 0);
        setIntField(term31873, term31873.getClass(), "totalBasicSync", 0);
        setIntField(term31873, term31873.getClass(), "totalAdvancedSync", 0);
        setIntField(term31873, term31873.getClass(), "totalExpertSync", 0);
        setIntField(term31873, term31873.getClass(), "totalMasterSync", 0);
        setIntField(term31873, term31873.getClass(), "totalReMasterSync", 0);
        setIntField(term31873, term31873.getClass(), "playerRating", 0);
        setIntField(term31873, term31873.getClass(), "highestRating", 0);
        setIntField(term31873, term31873.getClass(), "rankAuthTailId", 0);
        setField(term31873, term31873.getClass(), "eventWatchedDate", null);
        setField(term31873, term31873.getClass(), "webLimitDate", null);
        setIntField(term31873, term31873.getClass(), "challengeTrackPhase", 0);
        setIntField(term31873, term31873.getClass(), "firstPlayBits", 0);
        setField(term31873, term31873.getClass(), "lastPlayDate", null);
        setIntField(term31873, term31873.getClass(), "lastPlaceId", 0);
        setField(term31873, term31873.getClass(), "lastPlaceName", null);
        setIntField(term31873, term31873.getClass(), "lastRegionId", 0);
        setField(term31873, term31873.getClass(), "lastRegionName", null);
        setField(term31873, term31873.getClass(), "lastClientId", null);
        setField(term31873, term31873.getClass(), "lastCountryCode", null);
        setIntField(term31873, term31873.getClass(), "eventPoint", 0);
        setIntField(term31873, term31873.getClass(), "totalLv", 0);
        setIntField(term31873, term31873.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31873, term31873.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31873, term31873.getClass(), "loginBonusLv", 0);
        term31915 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31915;
        callMethod(klass, "setLastPlaceId", argTypes, term31873, args);
    }

};


