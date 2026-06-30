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

public class UserData_getIconId_1745814035112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28319;

    public UserData_getIconId_1745814035112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28319 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28319, term28319.getClass(), "id", 0L);
        setField(term28319, term28319.getClass(), "card", null);
        setIntField(term28319, term28319.getClass(), "lastDataVersion", 0);
        setField(term28319, term28319.getClass(), "userName", null);
        setIntField(term28319, term28319.getClass(), "point", 0);
        setIntField(term28319, term28319.getClass(), "totalPoint", 0);
        setIntField(term28319, term28319.getClass(), "iconId", 0);
        setIntField(term28319, term28319.getClass(), "nameplateId", 0);
        setIntField(term28319, term28319.getClass(), "frameId", 0);
        setIntField(term28319, term28319.getClass(), "trophyId", 0);
        setIntField(term28319, term28319.getClass(), "playCount", 0);
        setIntField(term28319, term28319.getClass(), "playVsCount", 0);
        setIntField(term28319, term28319.getClass(), "playSyncCount", 0);
        setIntField(term28319, term28319.getClass(), "winCount", 0);
        setIntField(term28319, term28319.getClass(), "helpCount", 0);
        setIntField(term28319, term28319.getClass(), "comboCount", 0);
        setIntField(term28319, term28319.getClass(), "feverCount", 0);
        setIntField(term28319, term28319.getClass(), "totalHiScore", 0);
        setIntField(term28319, term28319.getClass(), "totalEasyHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalBasicHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalExpertHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalMasterHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28319, term28319.getClass(), "totalHighSync", 0);
        setIntField(term28319, term28319.getClass(), "totalEasySync", 0);
        setIntField(term28319, term28319.getClass(), "totalBasicSync", 0);
        setIntField(term28319, term28319.getClass(), "totalAdvancedSync", 0);
        setIntField(term28319, term28319.getClass(), "totalExpertSync", 0);
        setIntField(term28319, term28319.getClass(), "totalMasterSync", 0);
        setIntField(term28319, term28319.getClass(), "totalReMasterSync", 0);
        setIntField(term28319, term28319.getClass(), "playerRating", 0);
        setIntField(term28319, term28319.getClass(), "highestRating", 0);
        setIntField(term28319, term28319.getClass(), "rankAuthTailId", 0);
        setField(term28319, term28319.getClass(), "eventWatchedDate", null);
        setField(term28319, term28319.getClass(), "webLimitDate", null);
        setIntField(term28319, term28319.getClass(), "challengeTrackPhase", 0);
        setIntField(term28319, term28319.getClass(), "firstPlayBits", 0);
        setField(term28319, term28319.getClass(), "lastPlayDate", null);
        setIntField(term28319, term28319.getClass(), "lastPlaceId", 0);
        setField(term28319, term28319.getClass(), "lastPlaceName", null);
        setIntField(term28319, term28319.getClass(), "lastRegionId", 0);
        setField(term28319, term28319.getClass(), "lastRegionName", null);
        setField(term28319, term28319.getClass(), "lastClientId", null);
        setField(term28319, term28319.getClass(), "lastCountryCode", null);
        setIntField(term28319, term28319.getClass(), "eventPoint", 0);
        setIntField(term28319, term28319.getClass(), "totalLv", 0);
        setIntField(term28319, term28319.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28319, term28319.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28319, term28319.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term28319, args);
    }

};


