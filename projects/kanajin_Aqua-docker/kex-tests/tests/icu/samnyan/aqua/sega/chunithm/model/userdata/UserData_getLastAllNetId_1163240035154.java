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

public class UserData_getLastAllNetId_1163240035154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176135;

    public UserData_getLastAllNetId_1163240035154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176135 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176135, term176135.getClass(), "id", 0L);
        setField(term176135, term176135.getClass(), "card", null);
        setField(term176135, term176135.getClass(), "userName", null);
        setField(term176135, term176135.getClass(), "lastLoginDate", null);
        setBooleanField(term176135, term176135.getClass(), "isWebJoin", false);
        setField(term176135, term176135.getClass(), "webLimitDate", null);
        setIntField(term176135, term176135.getClass(), "level", 0);
        setIntField(term176135, term176135.getClass(), "reincarnationNum", 0);
        setField(term176135, term176135.getClass(), "exp", null);
        setLongField(term176135, term176135.getClass(), "point", 0L);
        setLongField(term176135, term176135.getClass(), "totalPoint", 0L);
        setIntField(term176135, term176135.getClass(), "playCount", 0);
        setIntField(term176135, term176135.getClass(), "multiPlayCount", 0);
        setIntField(term176135, term176135.getClass(), "multiWinCount", 0);
        setIntField(term176135, term176135.getClass(), "requestResCount", 0);
        setIntField(term176135, term176135.getClass(), "acceptResCount", 0);
        setIntField(term176135, term176135.getClass(), "successResCount", 0);
        setIntField(term176135, term176135.getClass(), "playerRating", 0);
        setIntField(term176135, term176135.getClass(), "highestRating", 0);
        setIntField(term176135, term176135.getClass(), "nameplateId", 0);
        setIntField(term176135, term176135.getClass(), "frameId", 0);
        setIntField(term176135, term176135.getClass(), "characterId", 0);
        setIntField(term176135, term176135.getClass(), "trophyId", 0);
        setIntField(term176135, term176135.getClass(), "playedTutorialBit", 0);
        setIntField(term176135, term176135.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176135, term176135.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176135, term176135.getClass(), "totalRepertoireCount", 0);
        setIntField(term176135, term176135.getClass(), "totalMapNum", 0);
        setLongField(term176135, term176135.getClass(), "totalHiScore", 0L);
        setLongField(term176135, term176135.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176135, term176135.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176135, term176135.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176135, term176135.getClass(), "totalMasterHighScore", 0L);
        setField(term176135, term176135.getClass(), "eventWatchedDate", null);
        setIntField(term176135, term176135.getClass(), "friendCount", 0);
        setBooleanField(term176135, term176135.getClass(), "isMaimai", false);
        setField(term176135, term176135.getClass(), "firstGameId", null);
        setField(term176135, term176135.getClass(), "firstRomVersion", null);
        setField(term176135, term176135.getClass(), "firstDataVersion", null);
        setField(term176135, term176135.getClass(), "firstPlayDate", null);
        setField(term176135, term176135.getClass(), "lastGameId", null);
        setField(term176135, term176135.getClass(), "lastRomVersion", null);
        setField(term176135, term176135.getClass(), "lastDataVersion", null);
        setField(term176135, term176135.getClass(), "lastPlayDate", null);
        setIntField(term176135, term176135.getClass(), "lastPlaceId", 0);
        setField(term176135, term176135.getClass(), "lastPlaceName", null);
        setField(term176135, term176135.getClass(), "lastRegionId", null);
        setField(term176135, term176135.getClass(), "lastRegionName", null);
        setField(term176135, term176135.getClass(), "lastAllNetId", null);
        setField(term176135, term176135.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term176135, args);
    }

};


