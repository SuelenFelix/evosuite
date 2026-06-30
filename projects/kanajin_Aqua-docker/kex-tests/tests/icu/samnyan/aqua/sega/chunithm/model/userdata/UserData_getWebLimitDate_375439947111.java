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

public class UserData_getWebLimitDate_375439947111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174759;

    public UserData_getWebLimitDate_375439947111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174759 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174759, term174759.getClass(), "id", 0L);
        setField(term174759, term174759.getClass(), "card", null);
        setField(term174759, term174759.getClass(), "userName", null);
        setField(term174759, term174759.getClass(), "lastLoginDate", null);
        setBooleanField(term174759, term174759.getClass(), "isWebJoin", false);
        setField(term174759, term174759.getClass(), "webLimitDate", null);
        setIntField(term174759, term174759.getClass(), "level", 0);
        setIntField(term174759, term174759.getClass(), "reincarnationNum", 0);
        setField(term174759, term174759.getClass(), "exp", null);
        setLongField(term174759, term174759.getClass(), "point", 0L);
        setLongField(term174759, term174759.getClass(), "totalPoint", 0L);
        setIntField(term174759, term174759.getClass(), "playCount", 0);
        setIntField(term174759, term174759.getClass(), "multiPlayCount", 0);
        setIntField(term174759, term174759.getClass(), "multiWinCount", 0);
        setIntField(term174759, term174759.getClass(), "requestResCount", 0);
        setIntField(term174759, term174759.getClass(), "acceptResCount", 0);
        setIntField(term174759, term174759.getClass(), "successResCount", 0);
        setIntField(term174759, term174759.getClass(), "playerRating", 0);
        setIntField(term174759, term174759.getClass(), "highestRating", 0);
        setIntField(term174759, term174759.getClass(), "nameplateId", 0);
        setIntField(term174759, term174759.getClass(), "frameId", 0);
        setIntField(term174759, term174759.getClass(), "characterId", 0);
        setIntField(term174759, term174759.getClass(), "trophyId", 0);
        setIntField(term174759, term174759.getClass(), "playedTutorialBit", 0);
        setIntField(term174759, term174759.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174759, term174759.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174759, term174759.getClass(), "totalRepertoireCount", 0);
        setIntField(term174759, term174759.getClass(), "totalMapNum", 0);
        setLongField(term174759, term174759.getClass(), "totalHiScore", 0L);
        setLongField(term174759, term174759.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174759, term174759.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174759, term174759.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174759, term174759.getClass(), "totalMasterHighScore", 0L);
        setField(term174759, term174759.getClass(), "eventWatchedDate", null);
        setIntField(term174759, term174759.getClass(), "friendCount", 0);
        setBooleanField(term174759, term174759.getClass(), "isMaimai", false);
        setField(term174759, term174759.getClass(), "firstGameId", null);
        setField(term174759, term174759.getClass(), "firstRomVersion", null);
        setField(term174759, term174759.getClass(), "firstDataVersion", null);
        setField(term174759, term174759.getClass(), "firstPlayDate", null);
        setField(term174759, term174759.getClass(), "lastGameId", null);
        setField(term174759, term174759.getClass(), "lastRomVersion", null);
        setField(term174759, term174759.getClass(), "lastDataVersion", null);
        setField(term174759, term174759.getClass(), "lastPlayDate", null);
        setIntField(term174759, term174759.getClass(), "lastPlaceId", 0);
        setField(term174759, term174759.getClass(), "lastPlaceName", null);
        setField(term174759, term174759.getClass(), "lastRegionId", null);
        setField(term174759, term174759.getClass(), "lastRegionName", null);
        setField(term174759, term174759.getClass(), "lastAllNetId", null);
        setField(term174759, term174759.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebLimitDate", argTypes, term174759, args);
    }

};


