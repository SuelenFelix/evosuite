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

public class UserData_setTotalEasyHighScore_2028083349174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30955;
     Object term30997;

    public UserData_setTotalEasyHighScore_2028083349174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30955 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30955, term30955.getClass(), "id", 0L);
        setField(term30955, term30955.getClass(), "card", null);
        setIntField(term30955, term30955.getClass(), "lastDataVersion", 0);
        setField(term30955, term30955.getClass(), "userName", null);
        setIntField(term30955, term30955.getClass(), "point", 0);
        setIntField(term30955, term30955.getClass(), "totalPoint", 0);
        setIntField(term30955, term30955.getClass(), "iconId", 0);
        setIntField(term30955, term30955.getClass(), "nameplateId", 0);
        setIntField(term30955, term30955.getClass(), "frameId", 0);
        setIntField(term30955, term30955.getClass(), "trophyId", 0);
        setIntField(term30955, term30955.getClass(), "playCount", 0);
        setIntField(term30955, term30955.getClass(), "playVsCount", 0);
        setIntField(term30955, term30955.getClass(), "playSyncCount", 0);
        setIntField(term30955, term30955.getClass(), "winCount", 0);
        setIntField(term30955, term30955.getClass(), "helpCount", 0);
        setIntField(term30955, term30955.getClass(), "comboCount", 0);
        setIntField(term30955, term30955.getClass(), "feverCount", 0);
        setIntField(term30955, term30955.getClass(), "totalHiScore", 0);
        setIntField(term30955, term30955.getClass(), "totalEasyHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalBasicHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalExpertHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalMasterHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30955, term30955.getClass(), "totalHighSync", 0);
        setIntField(term30955, term30955.getClass(), "totalEasySync", 0);
        setIntField(term30955, term30955.getClass(), "totalBasicSync", 0);
        setIntField(term30955, term30955.getClass(), "totalAdvancedSync", 0);
        setIntField(term30955, term30955.getClass(), "totalExpertSync", 0);
        setIntField(term30955, term30955.getClass(), "totalMasterSync", 0);
        setIntField(term30955, term30955.getClass(), "totalReMasterSync", 0);
        setIntField(term30955, term30955.getClass(), "playerRating", 0);
        setIntField(term30955, term30955.getClass(), "highestRating", 0);
        setIntField(term30955, term30955.getClass(), "rankAuthTailId", 0);
        setField(term30955, term30955.getClass(), "eventWatchedDate", null);
        setField(term30955, term30955.getClass(), "webLimitDate", null);
        setIntField(term30955, term30955.getClass(), "challengeTrackPhase", 0);
        setIntField(term30955, term30955.getClass(), "firstPlayBits", 0);
        setField(term30955, term30955.getClass(), "lastPlayDate", null);
        setIntField(term30955, term30955.getClass(), "lastPlaceId", 0);
        setField(term30955, term30955.getClass(), "lastPlaceName", null);
        setIntField(term30955, term30955.getClass(), "lastRegionId", 0);
        setField(term30955, term30955.getClass(), "lastRegionName", null);
        setField(term30955, term30955.getClass(), "lastClientId", null);
        setField(term30955, term30955.getClass(), "lastCountryCode", null);
        setIntField(term30955, term30955.getClass(), "eventPoint", 0);
        setIntField(term30955, term30955.getClass(), "totalLv", 0);
        setIntField(term30955, term30955.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30955, term30955.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30955, term30955.getClass(), "loginBonusLv", 0);
        term30997 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30997;
        callMethod(klass, "setTotalEasyHighScore", argTypes, term30955, args);
    }

};


