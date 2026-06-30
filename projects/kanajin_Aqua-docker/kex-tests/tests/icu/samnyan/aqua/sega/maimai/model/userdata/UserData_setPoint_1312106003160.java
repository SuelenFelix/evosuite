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

public class UserData_setPoint_1312106003160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30339;
     Object term30381;

    public UserData_setPoint_1312106003160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30339, term30339.getClass(), "id", 0L);
        setField(term30339, term30339.getClass(), "card", null);
        setIntField(term30339, term30339.getClass(), "lastDataVersion", 0);
        setField(term30339, term30339.getClass(), "userName", null);
        setIntField(term30339, term30339.getClass(), "point", 0);
        setIntField(term30339, term30339.getClass(), "totalPoint", 0);
        setIntField(term30339, term30339.getClass(), "iconId", 0);
        setIntField(term30339, term30339.getClass(), "nameplateId", 0);
        setIntField(term30339, term30339.getClass(), "frameId", 0);
        setIntField(term30339, term30339.getClass(), "trophyId", 0);
        setIntField(term30339, term30339.getClass(), "playCount", 0);
        setIntField(term30339, term30339.getClass(), "playVsCount", 0);
        setIntField(term30339, term30339.getClass(), "playSyncCount", 0);
        setIntField(term30339, term30339.getClass(), "winCount", 0);
        setIntField(term30339, term30339.getClass(), "helpCount", 0);
        setIntField(term30339, term30339.getClass(), "comboCount", 0);
        setIntField(term30339, term30339.getClass(), "feverCount", 0);
        setIntField(term30339, term30339.getClass(), "totalHiScore", 0);
        setIntField(term30339, term30339.getClass(), "totalEasyHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalBasicHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalExpertHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalMasterHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30339, term30339.getClass(), "totalHighSync", 0);
        setIntField(term30339, term30339.getClass(), "totalEasySync", 0);
        setIntField(term30339, term30339.getClass(), "totalBasicSync", 0);
        setIntField(term30339, term30339.getClass(), "totalAdvancedSync", 0);
        setIntField(term30339, term30339.getClass(), "totalExpertSync", 0);
        setIntField(term30339, term30339.getClass(), "totalMasterSync", 0);
        setIntField(term30339, term30339.getClass(), "totalReMasterSync", 0);
        setIntField(term30339, term30339.getClass(), "playerRating", 0);
        setIntField(term30339, term30339.getClass(), "highestRating", 0);
        setIntField(term30339, term30339.getClass(), "rankAuthTailId", 0);
        setField(term30339, term30339.getClass(), "eventWatchedDate", null);
        setField(term30339, term30339.getClass(), "webLimitDate", null);
        setIntField(term30339, term30339.getClass(), "challengeTrackPhase", 0);
        setIntField(term30339, term30339.getClass(), "firstPlayBits", 0);
        setField(term30339, term30339.getClass(), "lastPlayDate", null);
        setIntField(term30339, term30339.getClass(), "lastPlaceId", 0);
        setField(term30339, term30339.getClass(), "lastPlaceName", null);
        setIntField(term30339, term30339.getClass(), "lastRegionId", 0);
        setField(term30339, term30339.getClass(), "lastRegionName", null);
        setField(term30339, term30339.getClass(), "lastClientId", null);
        setField(term30339, term30339.getClass(), "lastCountryCode", null);
        setIntField(term30339, term30339.getClass(), "eventPoint", 0);
        setIntField(term30339, term30339.getClass(), "totalLv", 0);
        setIntField(term30339, term30339.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30339, term30339.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30339, term30339.getClass(), "loginBonusLv", 0);
        term30381 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30381;
        callMethod(klass, "setPoint", argTypes, term30339, args);
    }

};


