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

public class UserData_setLastLoginDate_1775110081159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176297;

    public UserData_setLastLoginDate_1775110081159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176297 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176297, term176297.getClass(), "id", 0L);
        setField(term176297, term176297.getClass(), "card", null);
        setField(term176297, term176297.getClass(), "userName", null);
        setField(term176297, term176297.getClass(), "lastLoginDate", null);
        setBooleanField(term176297, term176297.getClass(), "isWebJoin", false);
        setField(term176297, term176297.getClass(), "webLimitDate", null);
        setIntField(term176297, term176297.getClass(), "level", 0);
        setIntField(term176297, term176297.getClass(), "reincarnationNum", 0);
        setField(term176297, term176297.getClass(), "exp", null);
        setLongField(term176297, term176297.getClass(), "point", 0L);
        setLongField(term176297, term176297.getClass(), "totalPoint", 0L);
        setIntField(term176297, term176297.getClass(), "playCount", 0);
        setIntField(term176297, term176297.getClass(), "multiPlayCount", 0);
        setIntField(term176297, term176297.getClass(), "multiWinCount", 0);
        setIntField(term176297, term176297.getClass(), "requestResCount", 0);
        setIntField(term176297, term176297.getClass(), "acceptResCount", 0);
        setIntField(term176297, term176297.getClass(), "successResCount", 0);
        setIntField(term176297, term176297.getClass(), "playerRating", 0);
        setIntField(term176297, term176297.getClass(), "highestRating", 0);
        setIntField(term176297, term176297.getClass(), "nameplateId", 0);
        setIntField(term176297, term176297.getClass(), "frameId", 0);
        setIntField(term176297, term176297.getClass(), "characterId", 0);
        setIntField(term176297, term176297.getClass(), "trophyId", 0);
        setIntField(term176297, term176297.getClass(), "playedTutorialBit", 0);
        setIntField(term176297, term176297.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176297, term176297.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176297, term176297.getClass(), "totalRepertoireCount", 0);
        setIntField(term176297, term176297.getClass(), "totalMapNum", 0);
        setLongField(term176297, term176297.getClass(), "totalHiScore", 0L);
        setLongField(term176297, term176297.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176297, term176297.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176297, term176297.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176297, term176297.getClass(), "totalMasterHighScore", 0L);
        setField(term176297, term176297.getClass(), "eventWatchedDate", null);
        setIntField(term176297, term176297.getClass(), "friendCount", 0);
        setBooleanField(term176297, term176297.getClass(), "isMaimai", false);
        setField(term176297, term176297.getClass(), "firstGameId", null);
        setField(term176297, term176297.getClass(), "firstRomVersion", null);
        setField(term176297, term176297.getClass(), "firstDataVersion", null);
        setField(term176297, term176297.getClass(), "firstPlayDate", null);
        setField(term176297, term176297.getClass(), "lastGameId", null);
        setField(term176297, term176297.getClass(), "lastRomVersion", null);
        setField(term176297, term176297.getClass(), "lastDataVersion", null);
        setField(term176297, term176297.getClass(), "lastPlayDate", null);
        setIntField(term176297, term176297.getClass(), "lastPlaceId", 0);
        setField(term176297, term176297.getClass(), "lastPlaceName", null);
        setField(term176297, term176297.getClass(), "lastRegionId", null);
        setField(term176297, term176297.getClass(), "lastRegionName", null);
        setField(term176297, term176297.getClass(), "lastAllNetId", null);
        setField(term176297, term176297.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastLoginDate", argTypes, term176297, args);
    }

};


