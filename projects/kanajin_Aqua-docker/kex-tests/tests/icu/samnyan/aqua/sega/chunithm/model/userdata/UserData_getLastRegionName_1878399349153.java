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

public class UserData_getLastRegionName_1878399349153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176103;

    public UserData_getLastRegionName_1878399349153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176103 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176103, term176103.getClass(), "id", 0L);
        setField(term176103, term176103.getClass(), "card", null);
        setField(term176103, term176103.getClass(), "userName", null);
        setField(term176103, term176103.getClass(), "lastLoginDate", null);
        setBooleanField(term176103, term176103.getClass(), "isWebJoin", false);
        setField(term176103, term176103.getClass(), "webLimitDate", null);
        setIntField(term176103, term176103.getClass(), "level", 0);
        setIntField(term176103, term176103.getClass(), "reincarnationNum", 0);
        setField(term176103, term176103.getClass(), "exp", null);
        setLongField(term176103, term176103.getClass(), "point", 0L);
        setLongField(term176103, term176103.getClass(), "totalPoint", 0L);
        setIntField(term176103, term176103.getClass(), "playCount", 0);
        setIntField(term176103, term176103.getClass(), "multiPlayCount", 0);
        setIntField(term176103, term176103.getClass(), "multiWinCount", 0);
        setIntField(term176103, term176103.getClass(), "requestResCount", 0);
        setIntField(term176103, term176103.getClass(), "acceptResCount", 0);
        setIntField(term176103, term176103.getClass(), "successResCount", 0);
        setIntField(term176103, term176103.getClass(), "playerRating", 0);
        setIntField(term176103, term176103.getClass(), "highestRating", 0);
        setIntField(term176103, term176103.getClass(), "nameplateId", 0);
        setIntField(term176103, term176103.getClass(), "frameId", 0);
        setIntField(term176103, term176103.getClass(), "characterId", 0);
        setIntField(term176103, term176103.getClass(), "trophyId", 0);
        setIntField(term176103, term176103.getClass(), "playedTutorialBit", 0);
        setIntField(term176103, term176103.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176103, term176103.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176103, term176103.getClass(), "totalRepertoireCount", 0);
        setIntField(term176103, term176103.getClass(), "totalMapNum", 0);
        setLongField(term176103, term176103.getClass(), "totalHiScore", 0L);
        setLongField(term176103, term176103.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176103, term176103.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176103, term176103.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176103, term176103.getClass(), "totalMasterHighScore", 0L);
        setField(term176103, term176103.getClass(), "eventWatchedDate", null);
        setIntField(term176103, term176103.getClass(), "friendCount", 0);
        setBooleanField(term176103, term176103.getClass(), "isMaimai", false);
        setField(term176103, term176103.getClass(), "firstGameId", null);
        setField(term176103, term176103.getClass(), "firstRomVersion", null);
        setField(term176103, term176103.getClass(), "firstDataVersion", null);
        setField(term176103, term176103.getClass(), "firstPlayDate", null);
        setField(term176103, term176103.getClass(), "lastGameId", null);
        setField(term176103, term176103.getClass(), "lastRomVersion", null);
        setField(term176103, term176103.getClass(), "lastDataVersion", null);
        setField(term176103, term176103.getClass(), "lastPlayDate", null);
        setIntField(term176103, term176103.getClass(), "lastPlaceId", 0);
        setField(term176103, term176103.getClass(), "lastPlaceName", null);
        setField(term176103, term176103.getClass(), "lastRegionId", null);
        setField(term176103, term176103.getClass(), "lastRegionName", null);
        setField(term176103, term176103.getClass(), "lastAllNetId", null);
        setField(term176103, term176103.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term176103, args);
    }

};


