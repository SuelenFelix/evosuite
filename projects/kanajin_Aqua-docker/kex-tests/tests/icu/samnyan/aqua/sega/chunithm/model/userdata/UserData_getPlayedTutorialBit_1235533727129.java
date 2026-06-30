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

public class UserData_getPlayedTutorialBit_1235533727129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175335;

    public UserData_getPlayedTutorialBit_1235533727129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175335 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175335, term175335.getClass(), "id", 0L);
        setField(term175335, term175335.getClass(), "card", null);
        setField(term175335, term175335.getClass(), "userName", null);
        setField(term175335, term175335.getClass(), "lastLoginDate", null);
        setBooleanField(term175335, term175335.getClass(), "isWebJoin", false);
        setField(term175335, term175335.getClass(), "webLimitDate", null);
        setIntField(term175335, term175335.getClass(), "level", 0);
        setIntField(term175335, term175335.getClass(), "reincarnationNum", 0);
        setField(term175335, term175335.getClass(), "exp", null);
        setLongField(term175335, term175335.getClass(), "point", 0L);
        setLongField(term175335, term175335.getClass(), "totalPoint", 0L);
        setIntField(term175335, term175335.getClass(), "playCount", 0);
        setIntField(term175335, term175335.getClass(), "multiPlayCount", 0);
        setIntField(term175335, term175335.getClass(), "multiWinCount", 0);
        setIntField(term175335, term175335.getClass(), "requestResCount", 0);
        setIntField(term175335, term175335.getClass(), "acceptResCount", 0);
        setIntField(term175335, term175335.getClass(), "successResCount", 0);
        setIntField(term175335, term175335.getClass(), "playerRating", 0);
        setIntField(term175335, term175335.getClass(), "highestRating", 0);
        setIntField(term175335, term175335.getClass(), "nameplateId", 0);
        setIntField(term175335, term175335.getClass(), "frameId", 0);
        setIntField(term175335, term175335.getClass(), "characterId", 0);
        setIntField(term175335, term175335.getClass(), "trophyId", 0);
        setIntField(term175335, term175335.getClass(), "playedTutorialBit", 0);
        setIntField(term175335, term175335.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175335, term175335.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175335, term175335.getClass(), "totalRepertoireCount", 0);
        setIntField(term175335, term175335.getClass(), "totalMapNum", 0);
        setLongField(term175335, term175335.getClass(), "totalHiScore", 0L);
        setLongField(term175335, term175335.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175335, term175335.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175335, term175335.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175335, term175335.getClass(), "totalMasterHighScore", 0L);
        setField(term175335, term175335.getClass(), "eventWatchedDate", null);
        setIntField(term175335, term175335.getClass(), "friendCount", 0);
        setBooleanField(term175335, term175335.getClass(), "isMaimai", false);
        setField(term175335, term175335.getClass(), "firstGameId", null);
        setField(term175335, term175335.getClass(), "firstRomVersion", null);
        setField(term175335, term175335.getClass(), "firstDataVersion", null);
        setField(term175335, term175335.getClass(), "firstPlayDate", null);
        setField(term175335, term175335.getClass(), "lastGameId", null);
        setField(term175335, term175335.getClass(), "lastRomVersion", null);
        setField(term175335, term175335.getClass(), "lastDataVersion", null);
        setField(term175335, term175335.getClass(), "lastPlayDate", null);
        setIntField(term175335, term175335.getClass(), "lastPlaceId", 0);
        setField(term175335, term175335.getClass(), "lastPlaceName", null);
        setField(term175335, term175335.getClass(), "lastRegionId", null);
        setField(term175335, term175335.getClass(), "lastRegionName", null);
        setField(term175335, term175335.getClass(), "lastAllNetId", null);
        setField(term175335, term175335.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term175335, args);
    }

};


