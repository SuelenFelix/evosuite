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

public class UserData_getTotalHighSync_743345548130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29075;

    public UserData_getTotalHighSync_743345548130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29075 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29075, term29075.getClass(), "id", 0L);
        setField(term29075, term29075.getClass(), "card", null);
        setIntField(term29075, term29075.getClass(), "lastDataVersion", 0);
        setField(term29075, term29075.getClass(), "userName", null);
        setIntField(term29075, term29075.getClass(), "point", 0);
        setIntField(term29075, term29075.getClass(), "totalPoint", 0);
        setIntField(term29075, term29075.getClass(), "iconId", 0);
        setIntField(term29075, term29075.getClass(), "nameplateId", 0);
        setIntField(term29075, term29075.getClass(), "frameId", 0);
        setIntField(term29075, term29075.getClass(), "trophyId", 0);
        setIntField(term29075, term29075.getClass(), "playCount", 0);
        setIntField(term29075, term29075.getClass(), "playVsCount", 0);
        setIntField(term29075, term29075.getClass(), "playSyncCount", 0);
        setIntField(term29075, term29075.getClass(), "winCount", 0);
        setIntField(term29075, term29075.getClass(), "helpCount", 0);
        setIntField(term29075, term29075.getClass(), "comboCount", 0);
        setIntField(term29075, term29075.getClass(), "feverCount", 0);
        setIntField(term29075, term29075.getClass(), "totalHiScore", 0);
        setIntField(term29075, term29075.getClass(), "totalEasyHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalBasicHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalExpertHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalMasterHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29075, term29075.getClass(), "totalHighSync", 0);
        setIntField(term29075, term29075.getClass(), "totalEasySync", 0);
        setIntField(term29075, term29075.getClass(), "totalBasicSync", 0);
        setIntField(term29075, term29075.getClass(), "totalAdvancedSync", 0);
        setIntField(term29075, term29075.getClass(), "totalExpertSync", 0);
        setIntField(term29075, term29075.getClass(), "totalMasterSync", 0);
        setIntField(term29075, term29075.getClass(), "totalReMasterSync", 0);
        setIntField(term29075, term29075.getClass(), "playerRating", 0);
        setIntField(term29075, term29075.getClass(), "highestRating", 0);
        setIntField(term29075, term29075.getClass(), "rankAuthTailId", 0);
        setField(term29075, term29075.getClass(), "eventWatchedDate", null);
        setField(term29075, term29075.getClass(), "webLimitDate", null);
        setIntField(term29075, term29075.getClass(), "challengeTrackPhase", 0);
        setIntField(term29075, term29075.getClass(), "firstPlayBits", 0);
        setField(term29075, term29075.getClass(), "lastPlayDate", null);
        setIntField(term29075, term29075.getClass(), "lastPlaceId", 0);
        setField(term29075, term29075.getClass(), "lastPlaceName", null);
        setIntField(term29075, term29075.getClass(), "lastRegionId", 0);
        setField(term29075, term29075.getClass(), "lastRegionName", null);
        setField(term29075, term29075.getClass(), "lastClientId", null);
        setField(term29075, term29075.getClass(), "lastCountryCode", null);
        setIntField(term29075, term29075.getClass(), "eventPoint", 0);
        setIntField(term29075, term29075.getClass(), "totalLv", 0);
        setIntField(term29075, term29075.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29075, term29075.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29075, term29075.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHighSync", argTypes, term29075, args);
    }

};


