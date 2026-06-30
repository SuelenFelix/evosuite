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

public class UserData_setTotalEasySync_308829378181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31263;
     Object term31305;

    public UserData_setTotalEasySync_308829378181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31263 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31263, term31263.getClass(), "id", 0L);
        setField(term31263, term31263.getClass(), "card", null);
        setIntField(term31263, term31263.getClass(), "lastDataVersion", 0);
        setField(term31263, term31263.getClass(), "userName", null);
        setIntField(term31263, term31263.getClass(), "point", 0);
        setIntField(term31263, term31263.getClass(), "totalPoint", 0);
        setIntField(term31263, term31263.getClass(), "iconId", 0);
        setIntField(term31263, term31263.getClass(), "nameplateId", 0);
        setIntField(term31263, term31263.getClass(), "frameId", 0);
        setIntField(term31263, term31263.getClass(), "trophyId", 0);
        setIntField(term31263, term31263.getClass(), "playCount", 0);
        setIntField(term31263, term31263.getClass(), "playVsCount", 0);
        setIntField(term31263, term31263.getClass(), "playSyncCount", 0);
        setIntField(term31263, term31263.getClass(), "winCount", 0);
        setIntField(term31263, term31263.getClass(), "helpCount", 0);
        setIntField(term31263, term31263.getClass(), "comboCount", 0);
        setIntField(term31263, term31263.getClass(), "feverCount", 0);
        setIntField(term31263, term31263.getClass(), "totalHiScore", 0);
        setIntField(term31263, term31263.getClass(), "totalEasyHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalBasicHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalExpertHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalMasterHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31263, term31263.getClass(), "totalHighSync", 0);
        setIntField(term31263, term31263.getClass(), "totalEasySync", 0);
        setIntField(term31263, term31263.getClass(), "totalBasicSync", 0);
        setIntField(term31263, term31263.getClass(), "totalAdvancedSync", 0);
        setIntField(term31263, term31263.getClass(), "totalExpertSync", 0);
        setIntField(term31263, term31263.getClass(), "totalMasterSync", 0);
        setIntField(term31263, term31263.getClass(), "totalReMasterSync", 0);
        setIntField(term31263, term31263.getClass(), "playerRating", 0);
        setIntField(term31263, term31263.getClass(), "highestRating", 0);
        setIntField(term31263, term31263.getClass(), "rankAuthTailId", 0);
        setField(term31263, term31263.getClass(), "eventWatchedDate", null);
        setField(term31263, term31263.getClass(), "webLimitDate", null);
        setIntField(term31263, term31263.getClass(), "challengeTrackPhase", 0);
        setIntField(term31263, term31263.getClass(), "firstPlayBits", 0);
        setField(term31263, term31263.getClass(), "lastPlayDate", null);
        setIntField(term31263, term31263.getClass(), "lastPlaceId", 0);
        setField(term31263, term31263.getClass(), "lastPlaceName", null);
        setIntField(term31263, term31263.getClass(), "lastRegionId", 0);
        setField(term31263, term31263.getClass(), "lastRegionName", null);
        setField(term31263, term31263.getClass(), "lastClientId", null);
        setField(term31263, term31263.getClass(), "lastCountryCode", null);
        setIntField(term31263, term31263.getClass(), "eventPoint", 0);
        setIntField(term31263, term31263.getClass(), "totalLv", 0);
        setIntField(term31263, term31263.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31263, term31263.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31263, term31263.getClass(), "loginBonusLv", 0);
        term31305 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31305;
        callMethod(klass, "setTotalEasySync", argTypes, term31263, args);
    }

};


