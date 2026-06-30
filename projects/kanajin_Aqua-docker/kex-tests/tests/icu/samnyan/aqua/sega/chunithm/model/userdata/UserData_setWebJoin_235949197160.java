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
import java.lang.Boolean;

public class UserData_setWebJoin_235949197160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176329;
     Object term176361;

    public UserData_setWebJoin_235949197160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176329 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176329, term176329.getClass(), "id", 0L);
        setField(term176329, term176329.getClass(), "card", null);
        setField(term176329, term176329.getClass(), "userName", null);
        setField(term176329, term176329.getClass(), "lastLoginDate", null);
        setBooleanField(term176329, term176329.getClass(), "isWebJoin", false);
        setField(term176329, term176329.getClass(), "webLimitDate", null);
        setIntField(term176329, term176329.getClass(), "level", 0);
        setIntField(term176329, term176329.getClass(), "reincarnationNum", 0);
        setField(term176329, term176329.getClass(), "exp", null);
        setLongField(term176329, term176329.getClass(), "point", 0L);
        setLongField(term176329, term176329.getClass(), "totalPoint", 0L);
        setIntField(term176329, term176329.getClass(), "playCount", 0);
        setIntField(term176329, term176329.getClass(), "multiPlayCount", 0);
        setIntField(term176329, term176329.getClass(), "multiWinCount", 0);
        setIntField(term176329, term176329.getClass(), "requestResCount", 0);
        setIntField(term176329, term176329.getClass(), "acceptResCount", 0);
        setIntField(term176329, term176329.getClass(), "successResCount", 0);
        setIntField(term176329, term176329.getClass(), "playerRating", 0);
        setIntField(term176329, term176329.getClass(), "highestRating", 0);
        setIntField(term176329, term176329.getClass(), "nameplateId", 0);
        setIntField(term176329, term176329.getClass(), "frameId", 0);
        setIntField(term176329, term176329.getClass(), "characterId", 0);
        setIntField(term176329, term176329.getClass(), "trophyId", 0);
        setIntField(term176329, term176329.getClass(), "playedTutorialBit", 0);
        setIntField(term176329, term176329.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176329, term176329.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176329, term176329.getClass(), "totalRepertoireCount", 0);
        setIntField(term176329, term176329.getClass(), "totalMapNum", 0);
        setLongField(term176329, term176329.getClass(), "totalHiScore", 0L);
        setLongField(term176329, term176329.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176329, term176329.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176329, term176329.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176329, term176329.getClass(), "totalMasterHighScore", 0L);
        setField(term176329, term176329.getClass(), "eventWatchedDate", null);
        setIntField(term176329, term176329.getClass(), "friendCount", 0);
        setBooleanField(term176329, term176329.getClass(), "isMaimai", false);
        setField(term176329, term176329.getClass(), "firstGameId", null);
        setField(term176329, term176329.getClass(), "firstRomVersion", null);
        setField(term176329, term176329.getClass(), "firstDataVersion", null);
        setField(term176329, term176329.getClass(), "firstPlayDate", null);
        setField(term176329, term176329.getClass(), "lastGameId", null);
        setField(term176329, term176329.getClass(), "lastRomVersion", null);
        setField(term176329, term176329.getClass(), "lastDataVersion", null);
        setField(term176329, term176329.getClass(), "lastPlayDate", null);
        setIntField(term176329, term176329.getClass(), "lastPlaceId", 0);
        setField(term176329, term176329.getClass(), "lastPlaceName", null);
        setField(term176329, term176329.getClass(), "lastRegionId", null);
        setField(term176329, term176329.getClass(), "lastRegionName", null);
        setField(term176329, term176329.getClass(), "lastAllNetId", null);
        setField(term176329, term176329.getClass(), "lastClientId", null);
        term176361 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term176361;
        callMethod(klass, "setWebJoin", argTypes, term176329, args);
    }

};


