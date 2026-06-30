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

public class UserData_getComboCount_1852755072121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28697;

    public UserData_getComboCount_1852755072121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28697 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28697, term28697.getClass(), "id", 0L);
        setField(term28697, term28697.getClass(), "card", null);
        setIntField(term28697, term28697.getClass(), "lastDataVersion", 0);
        setField(term28697, term28697.getClass(), "userName", null);
        setIntField(term28697, term28697.getClass(), "point", 0);
        setIntField(term28697, term28697.getClass(), "totalPoint", 0);
        setIntField(term28697, term28697.getClass(), "iconId", 0);
        setIntField(term28697, term28697.getClass(), "nameplateId", 0);
        setIntField(term28697, term28697.getClass(), "frameId", 0);
        setIntField(term28697, term28697.getClass(), "trophyId", 0);
        setIntField(term28697, term28697.getClass(), "playCount", 0);
        setIntField(term28697, term28697.getClass(), "playVsCount", 0);
        setIntField(term28697, term28697.getClass(), "playSyncCount", 0);
        setIntField(term28697, term28697.getClass(), "winCount", 0);
        setIntField(term28697, term28697.getClass(), "helpCount", 0);
        setIntField(term28697, term28697.getClass(), "comboCount", 0);
        setIntField(term28697, term28697.getClass(), "feverCount", 0);
        setIntField(term28697, term28697.getClass(), "totalHiScore", 0);
        setIntField(term28697, term28697.getClass(), "totalEasyHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalBasicHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalExpertHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalMasterHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28697, term28697.getClass(), "totalHighSync", 0);
        setIntField(term28697, term28697.getClass(), "totalEasySync", 0);
        setIntField(term28697, term28697.getClass(), "totalBasicSync", 0);
        setIntField(term28697, term28697.getClass(), "totalAdvancedSync", 0);
        setIntField(term28697, term28697.getClass(), "totalExpertSync", 0);
        setIntField(term28697, term28697.getClass(), "totalMasterSync", 0);
        setIntField(term28697, term28697.getClass(), "totalReMasterSync", 0);
        setIntField(term28697, term28697.getClass(), "playerRating", 0);
        setIntField(term28697, term28697.getClass(), "highestRating", 0);
        setIntField(term28697, term28697.getClass(), "rankAuthTailId", 0);
        setField(term28697, term28697.getClass(), "eventWatchedDate", null);
        setField(term28697, term28697.getClass(), "webLimitDate", null);
        setIntField(term28697, term28697.getClass(), "challengeTrackPhase", 0);
        setIntField(term28697, term28697.getClass(), "firstPlayBits", 0);
        setField(term28697, term28697.getClass(), "lastPlayDate", null);
        setIntField(term28697, term28697.getClass(), "lastPlaceId", 0);
        setField(term28697, term28697.getClass(), "lastPlaceName", null);
        setIntField(term28697, term28697.getClass(), "lastRegionId", 0);
        setField(term28697, term28697.getClass(), "lastRegionName", null);
        setField(term28697, term28697.getClass(), "lastClientId", null);
        setField(term28697, term28697.getClass(), "lastCountryCode", null);
        setIntField(term28697, term28697.getClass(), "eventPoint", 0);
        setIntField(term28697, term28697.getClass(), "totalLv", 0);
        setIntField(term28697, term28697.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28697, term28697.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28697, term28697.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term28697, args);
    }

};


