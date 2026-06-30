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

public class UserData_setTotalAdvancedSync_477654622183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31351;
     Object term31393;

    public UserData_setTotalAdvancedSync_477654622183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31351 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31351, term31351.getClass(), "id", 0L);
        setField(term31351, term31351.getClass(), "card", null);
        setIntField(term31351, term31351.getClass(), "lastDataVersion", 0);
        setField(term31351, term31351.getClass(), "userName", null);
        setIntField(term31351, term31351.getClass(), "point", 0);
        setIntField(term31351, term31351.getClass(), "totalPoint", 0);
        setIntField(term31351, term31351.getClass(), "iconId", 0);
        setIntField(term31351, term31351.getClass(), "nameplateId", 0);
        setIntField(term31351, term31351.getClass(), "frameId", 0);
        setIntField(term31351, term31351.getClass(), "trophyId", 0);
        setIntField(term31351, term31351.getClass(), "playCount", 0);
        setIntField(term31351, term31351.getClass(), "playVsCount", 0);
        setIntField(term31351, term31351.getClass(), "playSyncCount", 0);
        setIntField(term31351, term31351.getClass(), "winCount", 0);
        setIntField(term31351, term31351.getClass(), "helpCount", 0);
        setIntField(term31351, term31351.getClass(), "comboCount", 0);
        setIntField(term31351, term31351.getClass(), "feverCount", 0);
        setIntField(term31351, term31351.getClass(), "totalHiScore", 0);
        setIntField(term31351, term31351.getClass(), "totalEasyHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalBasicHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalExpertHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalMasterHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31351, term31351.getClass(), "totalHighSync", 0);
        setIntField(term31351, term31351.getClass(), "totalEasySync", 0);
        setIntField(term31351, term31351.getClass(), "totalBasicSync", 0);
        setIntField(term31351, term31351.getClass(), "totalAdvancedSync", 0);
        setIntField(term31351, term31351.getClass(), "totalExpertSync", 0);
        setIntField(term31351, term31351.getClass(), "totalMasterSync", 0);
        setIntField(term31351, term31351.getClass(), "totalReMasterSync", 0);
        setIntField(term31351, term31351.getClass(), "playerRating", 0);
        setIntField(term31351, term31351.getClass(), "highestRating", 0);
        setIntField(term31351, term31351.getClass(), "rankAuthTailId", 0);
        setField(term31351, term31351.getClass(), "eventWatchedDate", null);
        setField(term31351, term31351.getClass(), "webLimitDate", null);
        setIntField(term31351, term31351.getClass(), "challengeTrackPhase", 0);
        setIntField(term31351, term31351.getClass(), "firstPlayBits", 0);
        setField(term31351, term31351.getClass(), "lastPlayDate", null);
        setIntField(term31351, term31351.getClass(), "lastPlaceId", 0);
        setField(term31351, term31351.getClass(), "lastPlaceName", null);
        setIntField(term31351, term31351.getClass(), "lastRegionId", 0);
        setField(term31351, term31351.getClass(), "lastRegionName", null);
        setField(term31351, term31351.getClass(), "lastClientId", null);
        setField(term31351, term31351.getClass(), "lastCountryCode", null);
        setIntField(term31351, term31351.getClass(), "eventPoint", 0);
        setIntField(term31351, term31351.getClass(), "totalLv", 0);
        setIntField(term31351, term31351.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31351, term31351.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31351, term31351.getClass(), "loginBonusLv", 0);
        term31393 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31393;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term31351, args);
    }

};


