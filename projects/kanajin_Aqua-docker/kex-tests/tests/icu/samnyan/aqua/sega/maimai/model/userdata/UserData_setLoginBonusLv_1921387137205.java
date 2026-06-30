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

public class UserData_setLoginBonusLv_1921387137205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32305;
     Object term32347;

    public UserData_setLoginBonusLv_1921387137205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32305 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32305, term32305.getClass(), "id", 0L);
        setField(term32305, term32305.getClass(), "card", null);
        setIntField(term32305, term32305.getClass(), "lastDataVersion", 0);
        setField(term32305, term32305.getClass(), "userName", null);
        setIntField(term32305, term32305.getClass(), "point", 0);
        setIntField(term32305, term32305.getClass(), "totalPoint", 0);
        setIntField(term32305, term32305.getClass(), "iconId", 0);
        setIntField(term32305, term32305.getClass(), "nameplateId", 0);
        setIntField(term32305, term32305.getClass(), "frameId", 0);
        setIntField(term32305, term32305.getClass(), "trophyId", 0);
        setIntField(term32305, term32305.getClass(), "playCount", 0);
        setIntField(term32305, term32305.getClass(), "playVsCount", 0);
        setIntField(term32305, term32305.getClass(), "playSyncCount", 0);
        setIntField(term32305, term32305.getClass(), "winCount", 0);
        setIntField(term32305, term32305.getClass(), "helpCount", 0);
        setIntField(term32305, term32305.getClass(), "comboCount", 0);
        setIntField(term32305, term32305.getClass(), "feverCount", 0);
        setIntField(term32305, term32305.getClass(), "totalHiScore", 0);
        setIntField(term32305, term32305.getClass(), "totalEasyHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalBasicHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalExpertHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalMasterHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32305, term32305.getClass(), "totalHighSync", 0);
        setIntField(term32305, term32305.getClass(), "totalEasySync", 0);
        setIntField(term32305, term32305.getClass(), "totalBasicSync", 0);
        setIntField(term32305, term32305.getClass(), "totalAdvancedSync", 0);
        setIntField(term32305, term32305.getClass(), "totalExpertSync", 0);
        setIntField(term32305, term32305.getClass(), "totalMasterSync", 0);
        setIntField(term32305, term32305.getClass(), "totalReMasterSync", 0);
        setIntField(term32305, term32305.getClass(), "playerRating", 0);
        setIntField(term32305, term32305.getClass(), "highestRating", 0);
        setIntField(term32305, term32305.getClass(), "rankAuthTailId", 0);
        setField(term32305, term32305.getClass(), "eventWatchedDate", null);
        setField(term32305, term32305.getClass(), "webLimitDate", null);
        setIntField(term32305, term32305.getClass(), "challengeTrackPhase", 0);
        setIntField(term32305, term32305.getClass(), "firstPlayBits", 0);
        setField(term32305, term32305.getClass(), "lastPlayDate", null);
        setIntField(term32305, term32305.getClass(), "lastPlaceId", 0);
        setField(term32305, term32305.getClass(), "lastPlaceName", null);
        setIntField(term32305, term32305.getClass(), "lastRegionId", 0);
        setField(term32305, term32305.getClass(), "lastRegionName", null);
        setField(term32305, term32305.getClass(), "lastClientId", null);
        setField(term32305, term32305.getClass(), "lastCountryCode", null);
        setIntField(term32305, term32305.getClass(), "eventPoint", 0);
        setIntField(term32305, term32305.getClass(), "totalLv", 0);
        setIntField(term32305, term32305.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32305, term32305.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32305, term32305.getClass(), "loginBonusLv", 0);
        term32347 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32347;
        callMethod(klass, "setLoginBonusLv", argTypes, term32305, args);
    }

};


