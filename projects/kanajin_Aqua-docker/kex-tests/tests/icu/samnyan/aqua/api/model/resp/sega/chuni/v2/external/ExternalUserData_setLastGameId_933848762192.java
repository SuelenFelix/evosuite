package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setLastGameId_933848762192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44551;

    public ExternalUserData_setLastGameId_933848762192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44551 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44551, term44551.getClass(), "accessCode", null);
        setField(term44551, term44551.getClass(), "userName", null);
        setField(term44551, term44551.getClass(), "lastLoginDate", null);
        setBooleanField(term44551, term44551.getClass(), "isWebJoin", false);
        setField(term44551, term44551.getClass(), "webLimitDate", null);
        setIntField(term44551, term44551.getClass(), "level", 0);
        setIntField(term44551, term44551.getClass(), "reincarnationNum", 0);
        setField(term44551, term44551.getClass(), "exp", null);
        setLongField(term44551, term44551.getClass(), "point", 0L);
        setLongField(term44551, term44551.getClass(), "totalPoint", 0L);
        setIntField(term44551, term44551.getClass(), "playCount", 0);
        setIntField(term44551, term44551.getClass(), "multiPlayCount", 0);
        setIntField(term44551, term44551.getClass(), "multiWinCount", 0);
        setIntField(term44551, term44551.getClass(), "requestResCount", 0);
        setIntField(term44551, term44551.getClass(), "acceptResCount", 0);
        setIntField(term44551, term44551.getClass(), "successResCount", 0);
        setIntField(term44551, term44551.getClass(), "playerRating", 0);
        setIntField(term44551, term44551.getClass(), "highestRating", 0);
        setIntField(term44551, term44551.getClass(), "nameplateId", 0);
        setIntField(term44551, term44551.getClass(), "frameId", 0);
        setIntField(term44551, term44551.getClass(), "characterId", 0);
        setIntField(term44551, term44551.getClass(), "trophyId", 0);
        setIntField(term44551, term44551.getClass(), "playedTutorialBit", 0);
        setIntField(term44551, term44551.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44551, term44551.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44551, term44551.getClass(), "totalRepertoireCount", 0);
        setIntField(term44551, term44551.getClass(), "totalMapNum", 0);
        setLongField(term44551, term44551.getClass(), "totalHiScore", 0L);
        setLongField(term44551, term44551.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44551, term44551.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44551, term44551.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44551, term44551.getClass(), "totalMasterHighScore", 0L);
        setField(term44551, term44551.getClass(), "eventWatchedDate", null);
        setIntField(term44551, term44551.getClass(), "friendCount", 0);
        setBooleanField(term44551, term44551.getClass(), "isMaimai", false);
        setField(term44551, term44551.getClass(), "firstGameId", null);
        setField(term44551, term44551.getClass(), "firstRomVersion", null);
        setField(term44551, term44551.getClass(), "firstDataVersion", null);
        setField(term44551, term44551.getClass(), "firstPlayDate", null);
        setField(term44551, term44551.getClass(), "lastGameId", null);
        setField(term44551, term44551.getClass(), "lastRomVersion", null);
        setField(term44551, term44551.getClass(), "lastDataVersion", null);
        setField(term44551, term44551.getClass(), "lastPlayDate", null);
        setIntField(term44551, term44551.getClass(), "lastPlaceId", 0);
        setField(term44551, term44551.getClass(), "lastPlaceName", null);
        setField(term44551, term44551.getClass(), "lastRegionId", null);
        setField(term44551, term44551.getClass(), "lastRegionName", null);
        setField(term44551, term44551.getClass(), "lastAllNetId", null);
        setField(term44551, term44551.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term44551, args);
    }

};


