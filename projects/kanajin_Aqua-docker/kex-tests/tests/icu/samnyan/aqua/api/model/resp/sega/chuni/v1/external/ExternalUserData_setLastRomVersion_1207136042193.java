package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setLastRomVersion_1207136042193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44582;

    public ExternalUserData_setLastRomVersion_1207136042193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44582 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44582, term44582.getClass(), "accessCode", null);
        setField(term44582, term44582.getClass(), "userName", null);
        setField(term44582, term44582.getClass(), "lastLoginDate", null);
        setBooleanField(term44582, term44582.getClass(), "isWebJoin", false);
        setField(term44582, term44582.getClass(), "webLimitDate", null);
        setIntField(term44582, term44582.getClass(), "level", 0);
        setIntField(term44582, term44582.getClass(), "reincarnationNum", 0);
        setField(term44582, term44582.getClass(), "exp", null);
        setLongField(term44582, term44582.getClass(), "point", 0L);
        setLongField(term44582, term44582.getClass(), "totalPoint", 0L);
        setIntField(term44582, term44582.getClass(), "playCount", 0);
        setIntField(term44582, term44582.getClass(), "multiPlayCount", 0);
        setIntField(term44582, term44582.getClass(), "multiWinCount", 0);
        setIntField(term44582, term44582.getClass(), "requestResCount", 0);
        setIntField(term44582, term44582.getClass(), "acceptResCount", 0);
        setIntField(term44582, term44582.getClass(), "successResCount", 0);
        setIntField(term44582, term44582.getClass(), "playerRating", 0);
        setIntField(term44582, term44582.getClass(), "highestRating", 0);
        setIntField(term44582, term44582.getClass(), "nameplateId", 0);
        setIntField(term44582, term44582.getClass(), "frameId", 0);
        setIntField(term44582, term44582.getClass(), "characterId", 0);
        setIntField(term44582, term44582.getClass(), "trophyId", 0);
        setIntField(term44582, term44582.getClass(), "playedTutorialBit", 0);
        setIntField(term44582, term44582.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44582, term44582.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44582, term44582.getClass(), "totalRepertoireCount", 0);
        setIntField(term44582, term44582.getClass(), "totalMapNum", 0);
        setLongField(term44582, term44582.getClass(), "totalHiScore", 0L);
        setLongField(term44582, term44582.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44582, term44582.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44582, term44582.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44582, term44582.getClass(), "totalMasterHighScore", 0L);
        setField(term44582, term44582.getClass(), "eventWatchedDate", null);
        setIntField(term44582, term44582.getClass(), "friendCount", 0);
        setBooleanField(term44582, term44582.getClass(), "isMaimai", false);
        setField(term44582, term44582.getClass(), "firstGameId", null);
        setField(term44582, term44582.getClass(), "firstRomVersion", null);
        setField(term44582, term44582.getClass(), "firstDataVersion", null);
        setField(term44582, term44582.getClass(), "firstPlayDate", null);
        setField(term44582, term44582.getClass(), "lastGameId", null);
        setField(term44582, term44582.getClass(), "lastRomVersion", null);
        setField(term44582, term44582.getClass(), "lastDataVersion", null);
        setField(term44582, term44582.getClass(), "lastPlayDate", null);
        setIntField(term44582, term44582.getClass(), "lastPlaceId", 0);
        setField(term44582, term44582.getClass(), "lastPlaceName", null);
        setField(term44582, term44582.getClass(), "lastRegionId", null);
        setField(term44582, term44582.getClass(), "lastRegionName", null);
        setField(term44582, term44582.getClass(), "lastAllNetId", null);
        setField(term44582, term44582.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term44582, args);
    }

};


