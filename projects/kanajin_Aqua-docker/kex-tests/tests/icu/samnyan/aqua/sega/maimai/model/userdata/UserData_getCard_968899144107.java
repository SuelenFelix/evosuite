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

public class UserData_getCard_968899144107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28109;

    public UserData_getCard_968899144107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28109 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28109, term28109.getClass(), "id", 0L);
        setField(term28109, term28109.getClass(), "card", null);
        setIntField(term28109, term28109.getClass(), "lastDataVersion", 0);
        setField(term28109, term28109.getClass(), "userName", null);
        setIntField(term28109, term28109.getClass(), "point", 0);
        setIntField(term28109, term28109.getClass(), "totalPoint", 0);
        setIntField(term28109, term28109.getClass(), "iconId", 0);
        setIntField(term28109, term28109.getClass(), "nameplateId", 0);
        setIntField(term28109, term28109.getClass(), "frameId", 0);
        setIntField(term28109, term28109.getClass(), "trophyId", 0);
        setIntField(term28109, term28109.getClass(), "playCount", 0);
        setIntField(term28109, term28109.getClass(), "playVsCount", 0);
        setIntField(term28109, term28109.getClass(), "playSyncCount", 0);
        setIntField(term28109, term28109.getClass(), "winCount", 0);
        setIntField(term28109, term28109.getClass(), "helpCount", 0);
        setIntField(term28109, term28109.getClass(), "comboCount", 0);
        setIntField(term28109, term28109.getClass(), "feverCount", 0);
        setIntField(term28109, term28109.getClass(), "totalHiScore", 0);
        setIntField(term28109, term28109.getClass(), "totalEasyHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalBasicHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalExpertHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalMasterHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28109, term28109.getClass(), "totalHighSync", 0);
        setIntField(term28109, term28109.getClass(), "totalEasySync", 0);
        setIntField(term28109, term28109.getClass(), "totalBasicSync", 0);
        setIntField(term28109, term28109.getClass(), "totalAdvancedSync", 0);
        setIntField(term28109, term28109.getClass(), "totalExpertSync", 0);
        setIntField(term28109, term28109.getClass(), "totalMasterSync", 0);
        setIntField(term28109, term28109.getClass(), "totalReMasterSync", 0);
        setIntField(term28109, term28109.getClass(), "playerRating", 0);
        setIntField(term28109, term28109.getClass(), "highestRating", 0);
        setIntField(term28109, term28109.getClass(), "rankAuthTailId", 0);
        setField(term28109, term28109.getClass(), "eventWatchedDate", null);
        setField(term28109, term28109.getClass(), "webLimitDate", null);
        setIntField(term28109, term28109.getClass(), "challengeTrackPhase", 0);
        setIntField(term28109, term28109.getClass(), "firstPlayBits", 0);
        setField(term28109, term28109.getClass(), "lastPlayDate", null);
        setIntField(term28109, term28109.getClass(), "lastPlaceId", 0);
        setField(term28109, term28109.getClass(), "lastPlaceName", null);
        setIntField(term28109, term28109.getClass(), "lastRegionId", 0);
        setField(term28109, term28109.getClass(), "lastRegionName", null);
        setField(term28109, term28109.getClass(), "lastClientId", null);
        setField(term28109, term28109.getClass(), "lastCountryCode", null);
        setIntField(term28109, term28109.getClass(), "eventPoint", 0);
        setIntField(term28109, term28109.getClass(), "totalLv", 0);
        setIntField(term28109, term28109.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28109, term28109.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28109, term28109.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term28109, args);
    }

};


