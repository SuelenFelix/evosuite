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

public class UserData_setLastDataVersion_312726987158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30253;
     Object term30295;

    public UserData_setLastDataVersion_312726987158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30253, term30253.getClass(), "id", 0L);
        setField(term30253, term30253.getClass(), "card", null);
        setIntField(term30253, term30253.getClass(), "lastDataVersion", 0);
        setField(term30253, term30253.getClass(), "userName", null);
        setIntField(term30253, term30253.getClass(), "point", 0);
        setIntField(term30253, term30253.getClass(), "totalPoint", 0);
        setIntField(term30253, term30253.getClass(), "iconId", 0);
        setIntField(term30253, term30253.getClass(), "nameplateId", 0);
        setIntField(term30253, term30253.getClass(), "frameId", 0);
        setIntField(term30253, term30253.getClass(), "trophyId", 0);
        setIntField(term30253, term30253.getClass(), "playCount", 0);
        setIntField(term30253, term30253.getClass(), "playVsCount", 0);
        setIntField(term30253, term30253.getClass(), "playSyncCount", 0);
        setIntField(term30253, term30253.getClass(), "winCount", 0);
        setIntField(term30253, term30253.getClass(), "helpCount", 0);
        setIntField(term30253, term30253.getClass(), "comboCount", 0);
        setIntField(term30253, term30253.getClass(), "feverCount", 0);
        setIntField(term30253, term30253.getClass(), "totalHiScore", 0);
        setIntField(term30253, term30253.getClass(), "totalEasyHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalBasicHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalExpertHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalMasterHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30253, term30253.getClass(), "totalHighSync", 0);
        setIntField(term30253, term30253.getClass(), "totalEasySync", 0);
        setIntField(term30253, term30253.getClass(), "totalBasicSync", 0);
        setIntField(term30253, term30253.getClass(), "totalAdvancedSync", 0);
        setIntField(term30253, term30253.getClass(), "totalExpertSync", 0);
        setIntField(term30253, term30253.getClass(), "totalMasterSync", 0);
        setIntField(term30253, term30253.getClass(), "totalReMasterSync", 0);
        setIntField(term30253, term30253.getClass(), "playerRating", 0);
        setIntField(term30253, term30253.getClass(), "highestRating", 0);
        setIntField(term30253, term30253.getClass(), "rankAuthTailId", 0);
        setField(term30253, term30253.getClass(), "eventWatchedDate", null);
        setField(term30253, term30253.getClass(), "webLimitDate", null);
        setIntField(term30253, term30253.getClass(), "challengeTrackPhase", 0);
        setIntField(term30253, term30253.getClass(), "firstPlayBits", 0);
        setField(term30253, term30253.getClass(), "lastPlayDate", null);
        setIntField(term30253, term30253.getClass(), "lastPlaceId", 0);
        setField(term30253, term30253.getClass(), "lastPlaceName", null);
        setIntField(term30253, term30253.getClass(), "lastRegionId", 0);
        setField(term30253, term30253.getClass(), "lastRegionName", null);
        setField(term30253, term30253.getClass(), "lastClientId", null);
        setField(term30253, term30253.getClass(), "lastCountryCode", null);
        setIntField(term30253, term30253.getClass(), "eventPoint", 0);
        setIntField(term30253, term30253.getClass(), "totalLv", 0);
        setIntField(term30253, term30253.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30253, term30253.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30253, term30253.getClass(), "loginBonusLv", 0);
        term30295 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30295;
        callMethod(klass, "setLastDataVersion", argTypes, term30253, args);
    }

};


