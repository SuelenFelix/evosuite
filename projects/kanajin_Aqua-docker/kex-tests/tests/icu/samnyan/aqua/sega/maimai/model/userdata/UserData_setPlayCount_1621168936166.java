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

public class UserData_setPlayCount_1621168936166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30603;
     Object term30645;

    public UserData_setPlayCount_1621168936166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30603, term30603.getClass(), "id", 0L);
        setField(term30603, term30603.getClass(), "card", null);
        setIntField(term30603, term30603.getClass(), "lastDataVersion", 0);
        setField(term30603, term30603.getClass(), "userName", null);
        setIntField(term30603, term30603.getClass(), "point", 0);
        setIntField(term30603, term30603.getClass(), "totalPoint", 0);
        setIntField(term30603, term30603.getClass(), "iconId", 0);
        setIntField(term30603, term30603.getClass(), "nameplateId", 0);
        setIntField(term30603, term30603.getClass(), "frameId", 0);
        setIntField(term30603, term30603.getClass(), "trophyId", 0);
        setIntField(term30603, term30603.getClass(), "playCount", 0);
        setIntField(term30603, term30603.getClass(), "playVsCount", 0);
        setIntField(term30603, term30603.getClass(), "playSyncCount", 0);
        setIntField(term30603, term30603.getClass(), "winCount", 0);
        setIntField(term30603, term30603.getClass(), "helpCount", 0);
        setIntField(term30603, term30603.getClass(), "comboCount", 0);
        setIntField(term30603, term30603.getClass(), "feverCount", 0);
        setIntField(term30603, term30603.getClass(), "totalHiScore", 0);
        setIntField(term30603, term30603.getClass(), "totalEasyHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalBasicHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalExpertHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalMasterHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30603, term30603.getClass(), "totalHighSync", 0);
        setIntField(term30603, term30603.getClass(), "totalEasySync", 0);
        setIntField(term30603, term30603.getClass(), "totalBasicSync", 0);
        setIntField(term30603, term30603.getClass(), "totalAdvancedSync", 0);
        setIntField(term30603, term30603.getClass(), "totalExpertSync", 0);
        setIntField(term30603, term30603.getClass(), "totalMasterSync", 0);
        setIntField(term30603, term30603.getClass(), "totalReMasterSync", 0);
        setIntField(term30603, term30603.getClass(), "playerRating", 0);
        setIntField(term30603, term30603.getClass(), "highestRating", 0);
        setIntField(term30603, term30603.getClass(), "rankAuthTailId", 0);
        setField(term30603, term30603.getClass(), "eventWatchedDate", null);
        setField(term30603, term30603.getClass(), "webLimitDate", null);
        setIntField(term30603, term30603.getClass(), "challengeTrackPhase", 0);
        setIntField(term30603, term30603.getClass(), "firstPlayBits", 0);
        setField(term30603, term30603.getClass(), "lastPlayDate", null);
        setIntField(term30603, term30603.getClass(), "lastPlaceId", 0);
        setField(term30603, term30603.getClass(), "lastPlaceName", null);
        setIntField(term30603, term30603.getClass(), "lastRegionId", 0);
        setField(term30603, term30603.getClass(), "lastRegionName", null);
        setField(term30603, term30603.getClass(), "lastClientId", null);
        setField(term30603, term30603.getClass(), "lastCountryCode", null);
        setIntField(term30603, term30603.getClass(), "eventPoint", 0);
        setIntField(term30603, term30603.getClass(), "totalLv", 0);
        setIntField(term30603, term30603.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30603, term30603.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30603, term30603.getClass(), "loginBonusLv", 0);
        term30645 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30645;
        callMethod(klass, "setPlayCount", argTypes, term30603, args);
    }

};


