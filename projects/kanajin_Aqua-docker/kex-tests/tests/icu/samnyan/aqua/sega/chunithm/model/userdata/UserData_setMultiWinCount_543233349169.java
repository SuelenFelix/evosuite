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

public class UserData_setMultiWinCount_543233349169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176631;
     Object term176663;

    public UserData_setMultiWinCount_543233349169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176631 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176631, term176631.getClass(), "id", 0L);
        setField(term176631, term176631.getClass(), "card", null);
        setField(term176631, term176631.getClass(), "userName", null);
        setField(term176631, term176631.getClass(), "lastLoginDate", null);
        setBooleanField(term176631, term176631.getClass(), "isWebJoin", false);
        setField(term176631, term176631.getClass(), "webLimitDate", null);
        setIntField(term176631, term176631.getClass(), "level", 0);
        setIntField(term176631, term176631.getClass(), "reincarnationNum", 0);
        setField(term176631, term176631.getClass(), "exp", null);
        setLongField(term176631, term176631.getClass(), "point", 0L);
        setLongField(term176631, term176631.getClass(), "totalPoint", 0L);
        setIntField(term176631, term176631.getClass(), "playCount", 0);
        setIntField(term176631, term176631.getClass(), "multiPlayCount", 0);
        setIntField(term176631, term176631.getClass(), "multiWinCount", 0);
        setIntField(term176631, term176631.getClass(), "requestResCount", 0);
        setIntField(term176631, term176631.getClass(), "acceptResCount", 0);
        setIntField(term176631, term176631.getClass(), "successResCount", 0);
        setIntField(term176631, term176631.getClass(), "playerRating", 0);
        setIntField(term176631, term176631.getClass(), "highestRating", 0);
        setIntField(term176631, term176631.getClass(), "nameplateId", 0);
        setIntField(term176631, term176631.getClass(), "frameId", 0);
        setIntField(term176631, term176631.getClass(), "characterId", 0);
        setIntField(term176631, term176631.getClass(), "trophyId", 0);
        setIntField(term176631, term176631.getClass(), "playedTutorialBit", 0);
        setIntField(term176631, term176631.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176631, term176631.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176631, term176631.getClass(), "totalRepertoireCount", 0);
        setIntField(term176631, term176631.getClass(), "totalMapNum", 0);
        setLongField(term176631, term176631.getClass(), "totalHiScore", 0L);
        setLongField(term176631, term176631.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176631, term176631.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176631, term176631.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176631, term176631.getClass(), "totalMasterHighScore", 0L);
        setField(term176631, term176631.getClass(), "eventWatchedDate", null);
        setIntField(term176631, term176631.getClass(), "friendCount", 0);
        setBooleanField(term176631, term176631.getClass(), "isMaimai", false);
        setField(term176631, term176631.getClass(), "firstGameId", null);
        setField(term176631, term176631.getClass(), "firstRomVersion", null);
        setField(term176631, term176631.getClass(), "firstDataVersion", null);
        setField(term176631, term176631.getClass(), "firstPlayDate", null);
        setField(term176631, term176631.getClass(), "lastGameId", null);
        setField(term176631, term176631.getClass(), "lastRomVersion", null);
        setField(term176631, term176631.getClass(), "lastDataVersion", null);
        setField(term176631, term176631.getClass(), "lastPlayDate", null);
        setIntField(term176631, term176631.getClass(), "lastPlaceId", 0);
        setField(term176631, term176631.getClass(), "lastPlaceName", null);
        setField(term176631, term176631.getClass(), "lastRegionId", null);
        setField(term176631, term176631.getClass(), "lastRegionName", null);
        setField(term176631, term176631.getClass(), "lastAllNetId", null);
        setField(term176631, term176631.getClass(), "lastClientId", null);
        term176663 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176663;
        callMethod(klass, "setMultiWinCount", argTypes, term176631, args);
    }

};


