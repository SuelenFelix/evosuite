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

public class UserData_setPlayerRating_242196607187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31527;
     Object term31569;

    public UserData_setPlayerRating_242196607187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31527 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31527, term31527.getClass(), "id", 0L);
        setField(term31527, term31527.getClass(), "card", null);
        setIntField(term31527, term31527.getClass(), "lastDataVersion", 0);
        setField(term31527, term31527.getClass(), "userName", null);
        setIntField(term31527, term31527.getClass(), "point", 0);
        setIntField(term31527, term31527.getClass(), "totalPoint", 0);
        setIntField(term31527, term31527.getClass(), "iconId", 0);
        setIntField(term31527, term31527.getClass(), "nameplateId", 0);
        setIntField(term31527, term31527.getClass(), "frameId", 0);
        setIntField(term31527, term31527.getClass(), "trophyId", 0);
        setIntField(term31527, term31527.getClass(), "playCount", 0);
        setIntField(term31527, term31527.getClass(), "playVsCount", 0);
        setIntField(term31527, term31527.getClass(), "playSyncCount", 0);
        setIntField(term31527, term31527.getClass(), "winCount", 0);
        setIntField(term31527, term31527.getClass(), "helpCount", 0);
        setIntField(term31527, term31527.getClass(), "comboCount", 0);
        setIntField(term31527, term31527.getClass(), "feverCount", 0);
        setIntField(term31527, term31527.getClass(), "totalHiScore", 0);
        setIntField(term31527, term31527.getClass(), "totalEasyHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalBasicHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalExpertHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalMasterHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31527, term31527.getClass(), "totalHighSync", 0);
        setIntField(term31527, term31527.getClass(), "totalEasySync", 0);
        setIntField(term31527, term31527.getClass(), "totalBasicSync", 0);
        setIntField(term31527, term31527.getClass(), "totalAdvancedSync", 0);
        setIntField(term31527, term31527.getClass(), "totalExpertSync", 0);
        setIntField(term31527, term31527.getClass(), "totalMasterSync", 0);
        setIntField(term31527, term31527.getClass(), "totalReMasterSync", 0);
        setIntField(term31527, term31527.getClass(), "playerRating", 0);
        setIntField(term31527, term31527.getClass(), "highestRating", 0);
        setIntField(term31527, term31527.getClass(), "rankAuthTailId", 0);
        setField(term31527, term31527.getClass(), "eventWatchedDate", null);
        setField(term31527, term31527.getClass(), "webLimitDate", null);
        setIntField(term31527, term31527.getClass(), "challengeTrackPhase", 0);
        setIntField(term31527, term31527.getClass(), "firstPlayBits", 0);
        setField(term31527, term31527.getClass(), "lastPlayDate", null);
        setIntField(term31527, term31527.getClass(), "lastPlaceId", 0);
        setField(term31527, term31527.getClass(), "lastPlaceName", null);
        setIntField(term31527, term31527.getClass(), "lastRegionId", 0);
        setField(term31527, term31527.getClass(), "lastRegionName", null);
        setField(term31527, term31527.getClass(), "lastClientId", null);
        setField(term31527, term31527.getClass(), "lastCountryCode", null);
        setIntField(term31527, term31527.getClass(), "eventPoint", 0);
        setIntField(term31527, term31527.getClass(), "totalLv", 0);
        setIntField(term31527, term31527.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31527, term31527.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31527, term31527.getClass(), "loginBonusLv", 0);
        term31569 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31569;
        callMethod(klass, "setPlayerRating", argTypes, term31527, args);
    }

};


