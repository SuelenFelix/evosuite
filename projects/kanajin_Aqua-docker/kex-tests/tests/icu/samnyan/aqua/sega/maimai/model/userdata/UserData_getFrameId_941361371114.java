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

public class UserData_getFrameId_941361371114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28403;

    public UserData_getFrameId_941361371114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28403, term28403.getClass(), "id", 0L);
        setField(term28403, term28403.getClass(), "card", null);
        setIntField(term28403, term28403.getClass(), "lastDataVersion", 0);
        setField(term28403, term28403.getClass(), "userName", null);
        setIntField(term28403, term28403.getClass(), "point", 0);
        setIntField(term28403, term28403.getClass(), "totalPoint", 0);
        setIntField(term28403, term28403.getClass(), "iconId", 0);
        setIntField(term28403, term28403.getClass(), "nameplateId", 0);
        setIntField(term28403, term28403.getClass(), "frameId", 0);
        setIntField(term28403, term28403.getClass(), "trophyId", 0);
        setIntField(term28403, term28403.getClass(), "playCount", 0);
        setIntField(term28403, term28403.getClass(), "playVsCount", 0);
        setIntField(term28403, term28403.getClass(), "playSyncCount", 0);
        setIntField(term28403, term28403.getClass(), "winCount", 0);
        setIntField(term28403, term28403.getClass(), "helpCount", 0);
        setIntField(term28403, term28403.getClass(), "comboCount", 0);
        setIntField(term28403, term28403.getClass(), "feverCount", 0);
        setIntField(term28403, term28403.getClass(), "totalHiScore", 0);
        setIntField(term28403, term28403.getClass(), "totalEasyHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalBasicHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalExpertHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalMasterHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28403, term28403.getClass(), "totalHighSync", 0);
        setIntField(term28403, term28403.getClass(), "totalEasySync", 0);
        setIntField(term28403, term28403.getClass(), "totalBasicSync", 0);
        setIntField(term28403, term28403.getClass(), "totalAdvancedSync", 0);
        setIntField(term28403, term28403.getClass(), "totalExpertSync", 0);
        setIntField(term28403, term28403.getClass(), "totalMasterSync", 0);
        setIntField(term28403, term28403.getClass(), "totalReMasterSync", 0);
        setIntField(term28403, term28403.getClass(), "playerRating", 0);
        setIntField(term28403, term28403.getClass(), "highestRating", 0);
        setIntField(term28403, term28403.getClass(), "rankAuthTailId", 0);
        setField(term28403, term28403.getClass(), "eventWatchedDate", null);
        setField(term28403, term28403.getClass(), "webLimitDate", null);
        setIntField(term28403, term28403.getClass(), "challengeTrackPhase", 0);
        setIntField(term28403, term28403.getClass(), "firstPlayBits", 0);
        setField(term28403, term28403.getClass(), "lastPlayDate", null);
        setIntField(term28403, term28403.getClass(), "lastPlaceId", 0);
        setField(term28403, term28403.getClass(), "lastPlaceName", null);
        setIntField(term28403, term28403.getClass(), "lastRegionId", 0);
        setField(term28403, term28403.getClass(), "lastRegionName", null);
        setField(term28403, term28403.getClass(), "lastClientId", null);
        setField(term28403, term28403.getClass(), "lastCountryCode", null);
        setIntField(term28403, term28403.getClass(), "eventPoint", 0);
        setIntField(term28403, term28403.getClass(), "totalLv", 0);
        setIntField(term28403, term28403.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28403, term28403.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28403, term28403.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term28403, args);
    }

};


