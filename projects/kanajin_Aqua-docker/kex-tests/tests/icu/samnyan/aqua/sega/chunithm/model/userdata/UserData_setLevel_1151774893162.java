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
import java.lang.Integer;

public class UserData_setLevel_1151774893162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176395;
     Object term176427;

    public UserData_setLevel_1151774893162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176395 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176395, term176395.getClass(), "id", 0L);
        setField(term176395, term176395.getClass(), "card", null);
        setField(term176395, term176395.getClass(), "userName", null);
        setField(term176395, term176395.getClass(), "lastLoginDate", null);
        setBooleanField(term176395, term176395.getClass(), "isWebJoin", false);
        setField(term176395, term176395.getClass(), "webLimitDate", null);
        setIntField(term176395, term176395.getClass(), "level", 0);
        setIntField(term176395, term176395.getClass(), "reincarnationNum", 0);
        setField(term176395, term176395.getClass(), "exp", null);
        setLongField(term176395, term176395.getClass(), "point", 0L);
        setLongField(term176395, term176395.getClass(), "totalPoint", 0L);
        setIntField(term176395, term176395.getClass(), "playCount", 0);
        setIntField(term176395, term176395.getClass(), "multiPlayCount", 0);
        setIntField(term176395, term176395.getClass(), "multiWinCount", 0);
        setIntField(term176395, term176395.getClass(), "requestResCount", 0);
        setIntField(term176395, term176395.getClass(), "acceptResCount", 0);
        setIntField(term176395, term176395.getClass(), "successResCount", 0);
        setIntField(term176395, term176395.getClass(), "playerRating", 0);
        setIntField(term176395, term176395.getClass(), "highestRating", 0);
        setIntField(term176395, term176395.getClass(), "nameplateId", 0);
        setIntField(term176395, term176395.getClass(), "frameId", 0);
        setIntField(term176395, term176395.getClass(), "characterId", 0);
        setIntField(term176395, term176395.getClass(), "trophyId", 0);
        setIntField(term176395, term176395.getClass(), "playedTutorialBit", 0);
        setIntField(term176395, term176395.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176395, term176395.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176395, term176395.getClass(), "totalRepertoireCount", 0);
        setIntField(term176395, term176395.getClass(), "totalMapNum", 0);
        setLongField(term176395, term176395.getClass(), "totalHiScore", 0L);
        setLongField(term176395, term176395.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176395, term176395.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176395, term176395.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176395, term176395.getClass(), "totalMasterHighScore", 0L);
        setField(term176395, term176395.getClass(), "eventWatchedDate", null);
        setIntField(term176395, term176395.getClass(), "friendCount", 0);
        setBooleanField(term176395, term176395.getClass(), "isMaimai", false);
        setField(term176395, term176395.getClass(), "firstGameId", null);
        setField(term176395, term176395.getClass(), "firstRomVersion", null);
        setField(term176395, term176395.getClass(), "firstDataVersion", null);
        setField(term176395, term176395.getClass(), "firstPlayDate", null);
        setField(term176395, term176395.getClass(), "lastGameId", null);
        setField(term176395, term176395.getClass(), "lastRomVersion", null);
        setField(term176395, term176395.getClass(), "lastDataVersion", null);
        setField(term176395, term176395.getClass(), "lastPlayDate", null);
        setIntField(term176395, term176395.getClass(), "lastPlaceId", 0);
        setField(term176395, term176395.getClass(), "lastPlaceName", null);
        setField(term176395, term176395.getClass(), "lastRegionId", null);
        setField(term176395, term176395.getClass(), "lastRegionName", null);
        setField(term176395, term176395.getClass(), "lastAllNetId", null);
        setField(term176395, term176395.getClass(), "lastClientId", null);
        term176427 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176427;
        callMethod(klass, "setLevel", argTypes, term176395, args);
    }

};


