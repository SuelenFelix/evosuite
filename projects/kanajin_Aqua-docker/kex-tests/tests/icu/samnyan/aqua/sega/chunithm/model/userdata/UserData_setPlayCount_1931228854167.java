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

public class UserData_setPlayCount_1931228854167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176563;
     Object term176595;

    public UserData_setPlayCount_1931228854167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176563 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176563, term176563.getClass(), "id", 0L);
        setField(term176563, term176563.getClass(), "card", null);
        setField(term176563, term176563.getClass(), "userName", null);
        setField(term176563, term176563.getClass(), "lastLoginDate", null);
        setBooleanField(term176563, term176563.getClass(), "isWebJoin", false);
        setField(term176563, term176563.getClass(), "webLimitDate", null);
        setIntField(term176563, term176563.getClass(), "level", 0);
        setIntField(term176563, term176563.getClass(), "reincarnationNum", 0);
        setField(term176563, term176563.getClass(), "exp", null);
        setLongField(term176563, term176563.getClass(), "point", 0L);
        setLongField(term176563, term176563.getClass(), "totalPoint", 0L);
        setIntField(term176563, term176563.getClass(), "playCount", 0);
        setIntField(term176563, term176563.getClass(), "multiPlayCount", 0);
        setIntField(term176563, term176563.getClass(), "multiWinCount", 0);
        setIntField(term176563, term176563.getClass(), "requestResCount", 0);
        setIntField(term176563, term176563.getClass(), "acceptResCount", 0);
        setIntField(term176563, term176563.getClass(), "successResCount", 0);
        setIntField(term176563, term176563.getClass(), "playerRating", 0);
        setIntField(term176563, term176563.getClass(), "highestRating", 0);
        setIntField(term176563, term176563.getClass(), "nameplateId", 0);
        setIntField(term176563, term176563.getClass(), "frameId", 0);
        setIntField(term176563, term176563.getClass(), "characterId", 0);
        setIntField(term176563, term176563.getClass(), "trophyId", 0);
        setIntField(term176563, term176563.getClass(), "playedTutorialBit", 0);
        setIntField(term176563, term176563.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176563, term176563.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176563, term176563.getClass(), "totalRepertoireCount", 0);
        setIntField(term176563, term176563.getClass(), "totalMapNum", 0);
        setLongField(term176563, term176563.getClass(), "totalHiScore", 0L);
        setLongField(term176563, term176563.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176563, term176563.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176563, term176563.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176563, term176563.getClass(), "totalMasterHighScore", 0L);
        setField(term176563, term176563.getClass(), "eventWatchedDate", null);
        setIntField(term176563, term176563.getClass(), "friendCount", 0);
        setBooleanField(term176563, term176563.getClass(), "isMaimai", false);
        setField(term176563, term176563.getClass(), "firstGameId", null);
        setField(term176563, term176563.getClass(), "firstRomVersion", null);
        setField(term176563, term176563.getClass(), "firstDataVersion", null);
        setField(term176563, term176563.getClass(), "firstPlayDate", null);
        setField(term176563, term176563.getClass(), "lastGameId", null);
        setField(term176563, term176563.getClass(), "lastRomVersion", null);
        setField(term176563, term176563.getClass(), "lastDataVersion", null);
        setField(term176563, term176563.getClass(), "lastPlayDate", null);
        setIntField(term176563, term176563.getClass(), "lastPlaceId", 0);
        setField(term176563, term176563.getClass(), "lastPlaceName", null);
        setField(term176563, term176563.getClass(), "lastRegionId", null);
        setField(term176563, term176563.getClass(), "lastRegionName", null);
        setField(term176563, term176563.getClass(), "lastAllNetId", null);
        setField(term176563, term176563.getClass(), "lastClientId", null);
        term176595 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176595;
        callMethod(klass, "setPlayCount", argTypes, term176563, args);
    }

};


