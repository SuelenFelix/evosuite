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

public class UserData_setEventPoint_840252873201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32129;
     Object term32171;

    public UserData_setEventPoint_840252873201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32129 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32129, term32129.getClass(), "id", 0L);
        setField(term32129, term32129.getClass(), "card", null);
        setIntField(term32129, term32129.getClass(), "lastDataVersion", 0);
        setField(term32129, term32129.getClass(), "userName", null);
        setIntField(term32129, term32129.getClass(), "point", 0);
        setIntField(term32129, term32129.getClass(), "totalPoint", 0);
        setIntField(term32129, term32129.getClass(), "iconId", 0);
        setIntField(term32129, term32129.getClass(), "nameplateId", 0);
        setIntField(term32129, term32129.getClass(), "frameId", 0);
        setIntField(term32129, term32129.getClass(), "trophyId", 0);
        setIntField(term32129, term32129.getClass(), "playCount", 0);
        setIntField(term32129, term32129.getClass(), "playVsCount", 0);
        setIntField(term32129, term32129.getClass(), "playSyncCount", 0);
        setIntField(term32129, term32129.getClass(), "winCount", 0);
        setIntField(term32129, term32129.getClass(), "helpCount", 0);
        setIntField(term32129, term32129.getClass(), "comboCount", 0);
        setIntField(term32129, term32129.getClass(), "feverCount", 0);
        setIntField(term32129, term32129.getClass(), "totalHiScore", 0);
        setIntField(term32129, term32129.getClass(), "totalEasyHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalBasicHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalExpertHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalMasterHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32129, term32129.getClass(), "totalHighSync", 0);
        setIntField(term32129, term32129.getClass(), "totalEasySync", 0);
        setIntField(term32129, term32129.getClass(), "totalBasicSync", 0);
        setIntField(term32129, term32129.getClass(), "totalAdvancedSync", 0);
        setIntField(term32129, term32129.getClass(), "totalExpertSync", 0);
        setIntField(term32129, term32129.getClass(), "totalMasterSync", 0);
        setIntField(term32129, term32129.getClass(), "totalReMasterSync", 0);
        setIntField(term32129, term32129.getClass(), "playerRating", 0);
        setIntField(term32129, term32129.getClass(), "highestRating", 0);
        setIntField(term32129, term32129.getClass(), "rankAuthTailId", 0);
        setField(term32129, term32129.getClass(), "eventWatchedDate", null);
        setField(term32129, term32129.getClass(), "webLimitDate", null);
        setIntField(term32129, term32129.getClass(), "challengeTrackPhase", 0);
        setIntField(term32129, term32129.getClass(), "firstPlayBits", 0);
        setField(term32129, term32129.getClass(), "lastPlayDate", null);
        setIntField(term32129, term32129.getClass(), "lastPlaceId", 0);
        setField(term32129, term32129.getClass(), "lastPlaceName", null);
        setIntField(term32129, term32129.getClass(), "lastRegionId", 0);
        setField(term32129, term32129.getClass(), "lastRegionName", null);
        setField(term32129, term32129.getClass(), "lastClientId", null);
        setField(term32129, term32129.getClass(), "lastCountryCode", null);
        setIntField(term32129, term32129.getClass(), "eventPoint", 0);
        setIntField(term32129, term32129.getClass(), "totalLv", 0);
        setIntField(term32129, term32129.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32129, term32129.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32129, term32129.getClass(), "loginBonusLv", 0);
        term32171 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32171;
        callMethod(klass, "setEventPoint", argTypes, term32129, args);
    }

};


