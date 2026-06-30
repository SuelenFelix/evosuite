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

public class UserData_getTotalHiScore_457163252123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28781;

    public UserData_getTotalHiScore_457163252123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28781, term28781.getClass(), "id", 0L);
        setField(term28781, term28781.getClass(), "card", null);
        setIntField(term28781, term28781.getClass(), "lastDataVersion", 0);
        setField(term28781, term28781.getClass(), "userName", null);
        setIntField(term28781, term28781.getClass(), "point", 0);
        setIntField(term28781, term28781.getClass(), "totalPoint", 0);
        setIntField(term28781, term28781.getClass(), "iconId", 0);
        setIntField(term28781, term28781.getClass(), "nameplateId", 0);
        setIntField(term28781, term28781.getClass(), "frameId", 0);
        setIntField(term28781, term28781.getClass(), "trophyId", 0);
        setIntField(term28781, term28781.getClass(), "playCount", 0);
        setIntField(term28781, term28781.getClass(), "playVsCount", 0);
        setIntField(term28781, term28781.getClass(), "playSyncCount", 0);
        setIntField(term28781, term28781.getClass(), "winCount", 0);
        setIntField(term28781, term28781.getClass(), "helpCount", 0);
        setIntField(term28781, term28781.getClass(), "comboCount", 0);
        setIntField(term28781, term28781.getClass(), "feverCount", 0);
        setIntField(term28781, term28781.getClass(), "totalHiScore", 0);
        setIntField(term28781, term28781.getClass(), "totalEasyHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalBasicHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalExpertHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalMasterHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28781, term28781.getClass(), "totalHighSync", 0);
        setIntField(term28781, term28781.getClass(), "totalEasySync", 0);
        setIntField(term28781, term28781.getClass(), "totalBasicSync", 0);
        setIntField(term28781, term28781.getClass(), "totalAdvancedSync", 0);
        setIntField(term28781, term28781.getClass(), "totalExpertSync", 0);
        setIntField(term28781, term28781.getClass(), "totalMasterSync", 0);
        setIntField(term28781, term28781.getClass(), "totalReMasterSync", 0);
        setIntField(term28781, term28781.getClass(), "playerRating", 0);
        setIntField(term28781, term28781.getClass(), "highestRating", 0);
        setIntField(term28781, term28781.getClass(), "rankAuthTailId", 0);
        setField(term28781, term28781.getClass(), "eventWatchedDate", null);
        setField(term28781, term28781.getClass(), "webLimitDate", null);
        setIntField(term28781, term28781.getClass(), "challengeTrackPhase", 0);
        setIntField(term28781, term28781.getClass(), "firstPlayBits", 0);
        setField(term28781, term28781.getClass(), "lastPlayDate", null);
        setIntField(term28781, term28781.getClass(), "lastPlaceId", 0);
        setField(term28781, term28781.getClass(), "lastPlaceName", null);
        setIntField(term28781, term28781.getClass(), "lastRegionId", 0);
        setField(term28781, term28781.getClass(), "lastRegionName", null);
        setField(term28781, term28781.getClass(), "lastClientId", null);
        setField(term28781, term28781.getClass(), "lastCountryCode", null);
        setIntField(term28781, term28781.getClass(), "eventPoint", 0);
        setIntField(term28781, term28781.getClass(), "totalLv", 0);
        setIntField(term28781, term28781.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28781, term28781.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28781, term28781.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term28781, args);
    }

};


