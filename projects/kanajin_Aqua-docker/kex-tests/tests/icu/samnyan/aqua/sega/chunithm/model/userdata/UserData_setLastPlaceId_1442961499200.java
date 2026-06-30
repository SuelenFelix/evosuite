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

public class UserData_setLastPlaceId_1442961499200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177667;
     Object term177699;

    public UserData_setLastPlaceId_1442961499200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177667 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177667, term177667.getClass(), "id", 0L);
        setField(term177667, term177667.getClass(), "card", null);
        setField(term177667, term177667.getClass(), "userName", null);
        setField(term177667, term177667.getClass(), "lastLoginDate", null);
        setBooleanField(term177667, term177667.getClass(), "isWebJoin", false);
        setField(term177667, term177667.getClass(), "webLimitDate", null);
        setIntField(term177667, term177667.getClass(), "level", 0);
        setIntField(term177667, term177667.getClass(), "reincarnationNum", 0);
        setField(term177667, term177667.getClass(), "exp", null);
        setLongField(term177667, term177667.getClass(), "point", 0L);
        setLongField(term177667, term177667.getClass(), "totalPoint", 0L);
        setIntField(term177667, term177667.getClass(), "playCount", 0);
        setIntField(term177667, term177667.getClass(), "multiPlayCount", 0);
        setIntField(term177667, term177667.getClass(), "multiWinCount", 0);
        setIntField(term177667, term177667.getClass(), "requestResCount", 0);
        setIntField(term177667, term177667.getClass(), "acceptResCount", 0);
        setIntField(term177667, term177667.getClass(), "successResCount", 0);
        setIntField(term177667, term177667.getClass(), "playerRating", 0);
        setIntField(term177667, term177667.getClass(), "highestRating", 0);
        setIntField(term177667, term177667.getClass(), "nameplateId", 0);
        setIntField(term177667, term177667.getClass(), "frameId", 0);
        setIntField(term177667, term177667.getClass(), "characterId", 0);
        setIntField(term177667, term177667.getClass(), "trophyId", 0);
        setIntField(term177667, term177667.getClass(), "playedTutorialBit", 0);
        setIntField(term177667, term177667.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177667, term177667.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177667, term177667.getClass(), "totalRepertoireCount", 0);
        setIntField(term177667, term177667.getClass(), "totalMapNum", 0);
        setLongField(term177667, term177667.getClass(), "totalHiScore", 0L);
        setLongField(term177667, term177667.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177667, term177667.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177667, term177667.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177667, term177667.getClass(), "totalMasterHighScore", 0L);
        setField(term177667, term177667.getClass(), "eventWatchedDate", null);
        setIntField(term177667, term177667.getClass(), "friendCount", 0);
        setBooleanField(term177667, term177667.getClass(), "isMaimai", false);
        setField(term177667, term177667.getClass(), "firstGameId", null);
        setField(term177667, term177667.getClass(), "firstRomVersion", null);
        setField(term177667, term177667.getClass(), "firstDataVersion", null);
        setField(term177667, term177667.getClass(), "firstPlayDate", null);
        setField(term177667, term177667.getClass(), "lastGameId", null);
        setField(term177667, term177667.getClass(), "lastRomVersion", null);
        setField(term177667, term177667.getClass(), "lastDataVersion", null);
        setField(term177667, term177667.getClass(), "lastPlayDate", null);
        setIntField(term177667, term177667.getClass(), "lastPlaceId", 0);
        setField(term177667, term177667.getClass(), "lastPlaceName", null);
        setField(term177667, term177667.getClass(), "lastRegionId", null);
        setField(term177667, term177667.getClass(), "lastRegionName", null);
        setField(term177667, term177667.getClass(), "lastAllNetId", null);
        setField(term177667, term177667.getClass(), "lastClientId", null);
        term177699 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177699;
        callMethod(klass, "setLastPlaceId", argTypes, term177667, args);
    }

};


