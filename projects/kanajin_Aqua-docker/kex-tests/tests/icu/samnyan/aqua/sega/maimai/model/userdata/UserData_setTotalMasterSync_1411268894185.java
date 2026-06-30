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

public class UserData_setTotalMasterSync_1411268894185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31439;
     Object term31481;

    public UserData_setTotalMasterSync_1411268894185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31439 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31439, term31439.getClass(), "id", 0L);
        setField(term31439, term31439.getClass(), "card", null);
        setIntField(term31439, term31439.getClass(), "lastDataVersion", 0);
        setField(term31439, term31439.getClass(), "userName", null);
        setIntField(term31439, term31439.getClass(), "point", 0);
        setIntField(term31439, term31439.getClass(), "totalPoint", 0);
        setIntField(term31439, term31439.getClass(), "iconId", 0);
        setIntField(term31439, term31439.getClass(), "nameplateId", 0);
        setIntField(term31439, term31439.getClass(), "frameId", 0);
        setIntField(term31439, term31439.getClass(), "trophyId", 0);
        setIntField(term31439, term31439.getClass(), "playCount", 0);
        setIntField(term31439, term31439.getClass(), "playVsCount", 0);
        setIntField(term31439, term31439.getClass(), "playSyncCount", 0);
        setIntField(term31439, term31439.getClass(), "winCount", 0);
        setIntField(term31439, term31439.getClass(), "helpCount", 0);
        setIntField(term31439, term31439.getClass(), "comboCount", 0);
        setIntField(term31439, term31439.getClass(), "feverCount", 0);
        setIntField(term31439, term31439.getClass(), "totalHiScore", 0);
        setIntField(term31439, term31439.getClass(), "totalEasyHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalBasicHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalExpertHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalMasterHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31439, term31439.getClass(), "totalHighSync", 0);
        setIntField(term31439, term31439.getClass(), "totalEasySync", 0);
        setIntField(term31439, term31439.getClass(), "totalBasicSync", 0);
        setIntField(term31439, term31439.getClass(), "totalAdvancedSync", 0);
        setIntField(term31439, term31439.getClass(), "totalExpertSync", 0);
        setIntField(term31439, term31439.getClass(), "totalMasterSync", 0);
        setIntField(term31439, term31439.getClass(), "totalReMasterSync", 0);
        setIntField(term31439, term31439.getClass(), "playerRating", 0);
        setIntField(term31439, term31439.getClass(), "highestRating", 0);
        setIntField(term31439, term31439.getClass(), "rankAuthTailId", 0);
        setField(term31439, term31439.getClass(), "eventWatchedDate", null);
        setField(term31439, term31439.getClass(), "webLimitDate", null);
        setIntField(term31439, term31439.getClass(), "challengeTrackPhase", 0);
        setIntField(term31439, term31439.getClass(), "firstPlayBits", 0);
        setField(term31439, term31439.getClass(), "lastPlayDate", null);
        setIntField(term31439, term31439.getClass(), "lastPlaceId", 0);
        setField(term31439, term31439.getClass(), "lastPlaceName", null);
        setIntField(term31439, term31439.getClass(), "lastRegionId", 0);
        setField(term31439, term31439.getClass(), "lastRegionName", null);
        setField(term31439, term31439.getClass(), "lastClientId", null);
        setField(term31439, term31439.getClass(), "lastCountryCode", null);
        setIntField(term31439, term31439.getClass(), "eventPoint", 0);
        setIntField(term31439, term31439.getClass(), "totalLv", 0);
        setIntField(term31439, term31439.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31439, term31439.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31439, term31439.getClass(), "loginBonusLv", 0);
        term31481 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31481;
        callMethod(klass, "setTotalMasterSync", argTypes, term31439, args);
    }

};


