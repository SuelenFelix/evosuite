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

public class UserData_setTotalMasterHighScore_1418791541178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31131;
     Object term31173;

    public UserData_setTotalMasterHighScore_1418791541178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31131, term31131.getClass(), "id", 0L);
        setField(term31131, term31131.getClass(), "card", null);
        setIntField(term31131, term31131.getClass(), "lastDataVersion", 0);
        setField(term31131, term31131.getClass(), "userName", null);
        setIntField(term31131, term31131.getClass(), "point", 0);
        setIntField(term31131, term31131.getClass(), "totalPoint", 0);
        setIntField(term31131, term31131.getClass(), "iconId", 0);
        setIntField(term31131, term31131.getClass(), "nameplateId", 0);
        setIntField(term31131, term31131.getClass(), "frameId", 0);
        setIntField(term31131, term31131.getClass(), "trophyId", 0);
        setIntField(term31131, term31131.getClass(), "playCount", 0);
        setIntField(term31131, term31131.getClass(), "playVsCount", 0);
        setIntField(term31131, term31131.getClass(), "playSyncCount", 0);
        setIntField(term31131, term31131.getClass(), "winCount", 0);
        setIntField(term31131, term31131.getClass(), "helpCount", 0);
        setIntField(term31131, term31131.getClass(), "comboCount", 0);
        setIntField(term31131, term31131.getClass(), "feverCount", 0);
        setIntField(term31131, term31131.getClass(), "totalHiScore", 0);
        setIntField(term31131, term31131.getClass(), "totalEasyHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalBasicHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalExpertHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalMasterHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31131, term31131.getClass(), "totalHighSync", 0);
        setIntField(term31131, term31131.getClass(), "totalEasySync", 0);
        setIntField(term31131, term31131.getClass(), "totalBasicSync", 0);
        setIntField(term31131, term31131.getClass(), "totalAdvancedSync", 0);
        setIntField(term31131, term31131.getClass(), "totalExpertSync", 0);
        setIntField(term31131, term31131.getClass(), "totalMasterSync", 0);
        setIntField(term31131, term31131.getClass(), "totalReMasterSync", 0);
        setIntField(term31131, term31131.getClass(), "playerRating", 0);
        setIntField(term31131, term31131.getClass(), "highestRating", 0);
        setIntField(term31131, term31131.getClass(), "rankAuthTailId", 0);
        setField(term31131, term31131.getClass(), "eventWatchedDate", null);
        setField(term31131, term31131.getClass(), "webLimitDate", null);
        setIntField(term31131, term31131.getClass(), "challengeTrackPhase", 0);
        setIntField(term31131, term31131.getClass(), "firstPlayBits", 0);
        setField(term31131, term31131.getClass(), "lastPlayDate", null);
        setIntField(term31131, term31131.getClass(), "lastPlaceId", 0);
        setField(term31131, term31131.getClass(), "lastPlaceName", null);
        setIntField(term31131, term31131.getClass(), "lastRegionId", 0);
        setField(term31131, term31131.getClass(), "lastRegionName", null);
        setField(term31131, term31131.getClass(), "lastClientId", null);
        setField(term31131, term31131.getClass(), "lastCountryCode", null);
        setIntField(term31131, term31131.getClass(), "eventPoint", 0);
        setIntField(term31131, term31131.getClass(), "totalLv", 0);
        setIntField(term31131, term31131.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31131, term31131.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31131, term31131.getClass(), "loginBonusLv", 0);
        term31173 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31173;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term31131, args);
    }

};


