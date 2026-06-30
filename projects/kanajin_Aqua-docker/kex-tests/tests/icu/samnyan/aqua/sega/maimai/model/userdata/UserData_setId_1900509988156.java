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
import java.lang.Long;

public class UserData_setId_1900509988156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30167;
     Object term30209;

    public UserData_setId_1900509988156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30167 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30167, term30167.getClass(), "id", 0L);
        setField(term30167, term30167.getClass(), "card", null);
        setIntField(term30167, term30167.getClass(), "lastDataVersion", 0);
        setField(term30167, term30167.getClass(), "userName", null);
        setIntField(term30167, term30167.getClass(), "point", 0);
        setIntField(term30167, term30167.getClass(), "totalPoint", 0);
        setIntField(term30167, term30167.getClass(), "iconId", 0);
        setIntField(term30167, term30167.getClass(), "nameplateId", 0);
        setIntField(term30167, term30167.getClass(), "frameId", 0);
        setIntField(term30167, term30167.getClass(), "trophyId", 0);
        setIntField(term30167, term30167.getClass(), "playCount", 0);
        setIntField(term30167, term30167.getClass(), "playVsCount", 0);
        setIntField(term30167, term30167.getClass(), "playSyncCount", 0);
        setIntField(term30167, term30167.getClass(), "winCount", 0);
        setIntField(term30167, term30167.getClass(), "helpCount", 0);
        setIntField(term30167, term30167.getClass(), "comboCount", 0);
        setIntField(term30167, term30167.getClass(), "feverCount", 0);
        setIntField(term30167, term30167.getClass(), "totalHiScore", 0);
        setIntField(term30167, term30167.getClass(), "totalEasyHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalBasicHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalExpertHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalMasterHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30167, term30167.getClass(), "totalHighSync", 0);
        setIntField(term30167, term30167.getClass(), "totalEasySync", 0);
        setIntField(term30167, term30167.getClass(), "totalBasicSync", 0);
        setIntField(term30167, term30167.getClass(), "totalAdvancedSync", 0);
        setIntField(term30167, term30167.getClass(), "totalExpertSync", 0);
        setIntField(term30167, term30167.getClass(), "totalMasterSync", 0);
        setIntField(term30167, term30167.getClass(), "totalReMasterSync", 0);
        setIntField(term30167, term30167.getClass(), "playerRating", 0);
        setIntField(term30167, term30167.getClass(), "highestRating", 0);
        setIntField(term30167, term30167.getClass(), "rankAuthTailId", 0);
        setField(term30167, term30167.getClass(), "eventWatchedDate", null);
        setField(term30167, term30167.getClass(), "webLimitDate", null);
        setIntField(term30167, term30167.getClass(), "challengeTrackPhase", 0);
        setIntField(term30167, term30167.getClass(), "firstPlayBits", 0);
        setField(term30167, term30167.getClass(), "lastPlayDate", null);
        setIntField(term30167, term30167.getClass(), "lastPlaceId", 0);
        setField(term30167, term30167.getClass(), "lastPlaceName", null);
        setIntField(term30167, term30167.getClass(), "lastRegionId", 0);
        setField(term30167, term30167.getClass(), "lastRegionName", null);
        setField(term30167, term30167.getClass(), "lastClientId", null);
        setField(term30167, term30167.getClass(), "lastCountryCode", null);
        setIntField(term30167, term30167.getClass(), "eventPoint", 0);
        setIntField(term30167, term30167.getClass(), "totalLv", 0);
        setIntField(term30167, term30167.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30167, term30167.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30167, term30167.getClass(), "loginBonusLv", 0);
        term30209 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term30209;
        callMethod(klass, "setId", argTypes, term30167, args);
    }

};


