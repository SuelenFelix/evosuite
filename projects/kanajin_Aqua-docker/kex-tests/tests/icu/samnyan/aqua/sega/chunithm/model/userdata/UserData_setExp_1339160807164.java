package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setExp_1339160807164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176463;

    public UserData_setExp_1339160807164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176463 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176463, term176463.getClass(), "id", 0L);
        setField(term176463, term176463.getClass(), "card", null);
        setField(term176463, term176463.getClass(), "userName", null);
        setField(term176463, term176463.getClass(), "lastLoginDate", null);
        setBooleanField(term176463, term176463.getClass(), "isWebJoin", false);
        setField(term176463, term176463.getClass(), "webLimitDate", null);
        setIntField(term176463, term176463.getClass(), "level", 0);
        setIntField(term176463, term176463.getClass(), "reincarnationNum", 0);
        setField(term176463, term176463.getClass(), "exp", null);
        setLongField(term176463, term176463.getClass(), "point", 0L);
        setLongField(term176463, term176463.getClass(), "totalPoint", 0L);
        setIntField(term176463, term176463.getClass(), "playCount", 0);
        setIntField(term176463, term176463.getClass(), "multiPlayCount", 0);
        setIntField(term176463, term176463.getClass(), "multiWinCount", 0);
        setIntField(term176463, term176463.getClass(), "requestResCount", 0);
        setIntField(term176463, term176463.getClass(), "acceptResCount", 0);
        setIntField(term176463, term176463.getClass(), "successResCount", 0);
        setIntField(term176463, term176463.getClass(), "playerRating", 0);
        setIntField(term176463, term176463.getClass(), "highestRating", 0);
        setIntField(term176463, term176463.getClass(), "nameplateId", 0);
        setIntField(term176463, term176463.getClass(), "frameId", 0);
        setIntField(term176463, term176463.getClass(), "characterId", 0);
        setIntField(term176463, term176463.getClass(), "trophyId", 0);
        setIntField(term176463, term176463.getClass(), "playedTutorialBit", 0);
        setIntField(term176463, term176463.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176463, term176463.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176463, term176463.getClass(), "totalRepertoireCount", 0);
        setIntField(term176463, term176463.getClass(), "totalMapNum", 0);
        setLongField(term176463, term176463.getClass(), "totalHiScore", 0L);
        setLongField(term176463, term176463.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176463, term176463.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176463, term176463.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176463, term176463.getClass(), "totalMasterHighScore", 0L);
        setField(term176463, term176463.getClass(), "eventWatchedDate", null);
        setIntField(term176463, term176463.getClass(), "friendCount", 0);
        setBooleanField(term176463, term176463.getClass(), "isMaimai", false);
        setField(term176463, term176463.getClass(), "firstGameId", null);
        setField(term176463, term176463.getClass(), "firstRomVersion", null);
        setField(term176463, term176463.getClass(), "firstDataVersion", null);
        setField(term176463, term176463.getClass(), "firstPlayDate", null);
        setField(term176463, term176463.getClass(), "lastGameId", null);
        setField(term176463, term176463.getClass(), "lastRomVersion", null);
        setField(term176463, term176463.getClass(), "lastDataVersion", null);
        setField(term176463, term176463.getClass(), "lastPlayDate", null);
        setIntField(term176463, term176463.getClass(), "lastPlaceId", 0);
        setField(term176463, term176463.getClass(), "lastPlaceName", null);
        setField(term176463, term176463.getClass(), "lastRegionId", null);
        setField(term176463, term176463.getClass(), "lastRegionName", null);
        setField(term176463, term176463.getClass(), "lastAllNetId", null);
        setField(term176463, term176463.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExp", argTypes, term176463, args);
    }

};


