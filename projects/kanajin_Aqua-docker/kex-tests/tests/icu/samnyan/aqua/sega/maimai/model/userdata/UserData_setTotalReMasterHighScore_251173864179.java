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

public class UserData_setTotalReMasterHighScore_251173864179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31175;
     Object term31217;

    public UserData_setTotalReMasterHighScore_251173864179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31175 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31175, term31175.getClass(), "id", 0L);
        setField(term31175, term31175.getClass(), "card", null);
        setIntField(term31175, term31175.getClass(), "lastDataVersion", 0);
        setField(term31175, term31175.getClass(), "userName", null);
        setIntField(term31175, term31175.getClass(), "point", 0);
        setIntField(term31175, term31175.getClass(), "totalPoint", 0);
        setIntField(term31175, term31175.getClass(), "iconId", 0);
        setIntField(term31175, term31175.getClass(), "nameplateId", 0);
        setIntField(term31175, term31175.getClass(), "frameId", 0);
        setIntField(term31175, term31175.getClass(), "trophyId", 0);
        setIntField(term31175, term31175.getClass(), "playCount", 0);
        setIntField(term31175, term31175.getClass(), "playVsCount", 0);
        setIntField(term31175, term31175.getClass(), "playSyncCount", 0);
        setIntField(term31175, term31175.getClass(), "winCount", 0);
        setIntField(term31175, term31175.getClass(), "helpCount", 0);
        setIntField(term31175, term31175.getClass(), "comboCount", 0);
        setIntField(term31175, term31175.getClass(), "feverCount", 0);
        setIntField(term31175, term31175.getClass(), "totalHiScore", 0);
        setIntField(term31175, term31175.getClass(), "totalEasyHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalBasicHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalExpertHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalMasterHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31175, term31175.getClass(), "totalHighSync", 0);
        setIntField(term31175, term31175.getClass(), "totalEasySync", 0);
        setIntField(term31175, term31175.getClass(), "totalBasicSync", 0);
        setIntField(term31175, term31175.getClass(), "totalAdvancedSync", 0);
        setIntField(term31175, term31175.getClass(), "totalExpertSync", 0);
        setIntField(term31175, term31175.getClass(), "totalMasterSync", 0);
        setIntField(term31175, term31175.getClass(), "totalReMasterSync", 0);
        setIntField(term31175, term31175.getClass(), "playerRating", 0);
        setIntField(term31175, term31175.getClass(), "highestRating", 0);
        setIntField(term31175, term31175.getClass(), "rankAuthTailId", 0);
        setField(term31175, term31175.getClass(), "eventWatchedDate", null);
        setField(term31175, term31175.getClass(), "webLimitDate", null);
        setIntField(term31175, term31175.getClass(), "challengeTrackPhase", 0);
        setIntField(term31175, term31175.getClass(), "firstPlayBits", 0);
        setField(term31175, term31175.getClass(), "lastPlayDate", null);
        setIntField(term31175, term31175.getClass(), "lastPlaceId", 0);
        setField(term31175, term31175.getClass(), "lastPlaceName", null);
        setIntField(term31175, term31175.getClass(), "lastRegionId", 0);
        setField(term31175, term31175.getClass(), "lastRegionName", null);
        setField(term31175, term31175.getClass(), "lastClientId", null);
        setField(term31175, term31175.getClass(), "lastCountryCode", null);
        setIntField(term31175, term31175.getClass(), "eventPoint", 0);
        setIntField(term31175, term31175.getClass(), "totalLv", 0);
        setIntField(term31175, term31175.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31175, term31175.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31175, term31175.getClass(), "loginBonusLv", 0);
        term31217 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31217;
        callMethod(klass, "setTotalReMasterHighScore", argTypes, term31175, args);
    }

};


