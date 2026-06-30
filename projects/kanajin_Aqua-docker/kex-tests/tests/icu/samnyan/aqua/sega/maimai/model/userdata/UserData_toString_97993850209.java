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

public class UserData_toString_97993850209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32475;

    public UserData_toString_97993850209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32475 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32475, term32475.getClass(), "id", 0L);
        setField(term32475, term32475.getClass(), "card", null);
        setIntField(term32475, term32475.getClass(), "lastDataVersion", 0);
        setField(term32475, term32475.getClass(), "userName", null);
        setIntField(term32475, term32475.getClass(), "point", 0);
        setIntField(term32475, term32475.getClass(), "totalPoint", 0);
        setIntField(term32475, term32475.getClass(), "iconId", 0);
        setIntField(term32475, term32475.getClass(), "nameplateId", 0);
        setIntField(term32475, term32475.getClass(), "frameId", 0);
        setIntField(term32475, term32475.getClass(), "trophyId", 0);
        setIntField(term32475, term32475.getClass(), "playCount", 0);
        setIntField(term32475, term32475.getClass(), "playVsCount", 0);
        setIntField(term32475, term32475.getClass(), "playSyncCount", 0);
        setIntField(term32475, term32475.getClass(), "winCount", 0);
        setIntField(term32475, term32475.getClass(), "helpCount", 0);
        setIntField(term32475, term32475.getClass(), "comboCount", 0);
        setIntField(term32475, term32475.getClass(), "feverCount", 0);
        setIntField(term32475, term32475.getClass(), "totalHiScore", 0);
        setIntField(term32475, term32475.getClass(), "totalEasyHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalBasicHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalExpertHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalMasterHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32475, term32475.getClass(), "totalHighSync", 0);
        setIntField(term32475, term32475.getClass(), "totalEasySync", 0);
        setIntField(term32475, term32475.getClass(), "totalBasicSync", 0);
        setIntField(term32475, term32475.getClass(), "totalAdvancedSync", 0);
        setIntField(term32475, term32475.getClass(), "totalExpertSync", 0);
        setIntField(term32475, term32475.getClass(), "totalMasterSync", 0);
        setIntField(term32475, term32475.getClass(), "totalReMasterSync", 0);
        setIntField(term32475, term32475.getClass(), "playerRating", 0);
        setIntField(term32475, term32475.getClass(), "highestRating", 0);
        setIntField(term32475, term32475.getClass(), "rankAuthTailId", 0);
        setField(term32475, term32475.getClass(), "eventWatchedDate", null);
        setField(term32475, term32475.getClass(), "webLimitDate", null);
        setIntField(term32475, term32475.getClass(), "challengeTrackPhase", 0);
        setIntField(term32475, term32475.getClass(), "firstPlayBits", 0);
        setField(term32475, term32475.getClass(), "lastPlayDate", null);
        setIntField(term32475, term32475.getClass(), "lastPlaceId", 0);
        setField(term32475, term32475.getClass(), "lastPlaceName", null);
        setIntField(term32475, term32475.getClass(), "lastRegionId", 0);
        setField(term32475, term32475.getClass(), "lastRegionName", null);
        setField(term32475, term32475.getClass(), "lastClientId", null);
        setField(term32475, term32475.getClass(), "lastCountryCode", null);
        setIntField(term32475, term32475.getClass(), "eventPoint", 0);
        setIntField(term32475, term32475.getClass(), "totalLv", 0);
        setIntField(term32475, term32475.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32475, term32475.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32475, term32475.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32475, args);
    }

};


