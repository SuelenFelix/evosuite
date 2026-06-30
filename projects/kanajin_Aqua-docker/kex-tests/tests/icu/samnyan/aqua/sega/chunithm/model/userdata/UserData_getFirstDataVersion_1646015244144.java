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

public class UserData_getFirstDataVersion_1646015244144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175815;

    public UserData_getFirstDataVersion_1646015244144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175815 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175815, term175815.getClass(), "id", 0L);
        setField(term175815, term175815.getClass(), "card", null);
        setField(term175815, term175815.getClass(), "userName", null);
        setField(term175815, term175815.getClass(), "lastLoginDate", null);
        setBooleanField(term175815, term175815.getClass(), "isWebJoin", false);
        setField(term175815, term175815.getClass(), "webLimitDate", null);
        setIntField(term175815, term175815.getClass(), "level", 0);
        setIntField(term175815, term175815.getClass(), "reincarnationNum", 0);
        setField(term175815, term175815.getClass(), "exp", null);
        setLongField(term175815, term175815.getClass(), "point", 0L);
        setLongField(term175815, term175815.getClass(), "totalPoint", 0L);
        setIntField(term175815, term175815.getClass(), "playCount", 0);
        setIntField(term175815, term175815.getClass(), "multiPlayCount", 0);
        setIntField(term175815, term175815.getClass(), "multiWinCount", 0);
        setIntField(term175815, term175815.getClass(), "requestResCount", 0);
        setIntField(term175815, term175815.getClass(), "acceptResCount", 0);
        setIntField(term175815, term175815.getClass(), "successResCount", 0);
        setIntField(term175815, term175815.getClass(), "playerRating", 0);
        setIntField(term175815, term175815.getClass(), "highestRating", 0);
        setIntField(term175815, term175815.getClass(), "nameplateId", 0);
        setIntField(term175815, term175815.getClass(), "frameId", 0);
        setIntField(term175815, term175815.getClass(), "characterId", 0);
        setIntField(term175815, term175815.getClass(), "trophyId", 0);
        setIntField(term175815, term175815.getClass(), "playedTutorialBit", 0);
        setIntField(term175815, term175815.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175815, term175815.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175815, term175815.getClass(), "totalRepertoireCount", 0);
        setIntField(term175815, term175815.getClass(), "totalMapNum", 0);
        setLongField(term175815, term175815.getClass(), "totalHiScore", 0L);
        setLongField(term175815, term175815.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175815, term175815.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175815, term175815.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175815, term175815.getClass(), "totalMasterHighScore", 0L);
        setField(term175815, term175815.getClass(), "eventWatchedDate", null);
        setIntField(term175815, term175815.getClass(), "friendCount", 0);
        setBooleanField(term175815, term175815.getClass(), "isMaimai", false);
        setField(term175815, term175815.getClass(), "firstGameId", null);
        setField(term175815, term175815.getClass(), "firstRomVersion", null);
        setField(term175815, term175815.getClass(), "firstDataVersion", null);
        setField(term175815, term175815.getClass(), "firstPlayDate", null);
        setField(term175815, term175815.getClass(), "lastGameId", null);
        setField(term175815, term175815.getClass(), "lastRomVersion", null);
        setField(term175815, term175815.getClass(), "lastDataVersion", null);
        setField(term175815, term175815.getClass(), "lastPlayDate", null);
        setIntField(term175815, term175815.getClass(), "lastPlaceId", 0);
        setField(term175815, term175815.getClass(), "lastPlaceName", null);
        setField(term175815, term175815.getClass(), "lastRegionId", null);
        setField(term175815, term175815.getClass(), "lastRegionName", null);
        setField(term175815, term175815.getClass(), "lastAllNetId", null);
        setField(term175815, term175815.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term175815, args);
    }

};


