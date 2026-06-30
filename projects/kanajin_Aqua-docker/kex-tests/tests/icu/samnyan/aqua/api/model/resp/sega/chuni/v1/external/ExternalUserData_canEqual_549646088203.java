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

public class ExternalUserData_canEqual_549646088203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44894;

    public ExternalUserData_canEqual_549646088203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44894 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44894, term44894.getClass(), "accessCode", null);
        setField(term44894, term44894.getClass(), "userName", null);
        setField(term44894, term44894.getClass(), "lastLoginDate", null);
        setBooleanField(term44894, term44894.getClass(), "isWebJoin", false);
        setField(term44894, term44894.getClass(), "webLimitDate", null);
        setIntField(term44894, term44894.getClass(), "level", 0);
        setIntField(term44894, term44894.getClass(), "reincarnationNum", 0);
        setField(term44894, term44894.getClass(), "exp", null);
        setLongField(term44894, term44894.getClass(), "point", 0L);
        setLongField(term44894, term44894.getClass(), "totalPoint", 0L);
        setIntField(term44894, term44894.getClass(), "playCount", 0);
        setIntField(term44894, term44894.getClass(), "multiPlayCount", 0);
        setIntField(term44894, term44894.getClass(), "multiWinCount", 0);
        setIntField(term44894, term44894.getClass(), "requestResCount", 0);
        setIntField(term44894, term44894.getClass(), "acceptResCount", 0);
        setIntField(term44894, term44894.getClass(), "successResCount", 0);
        setIntField(term44894, term44894.getClass(), "playerRating", 0);
        setIntField(term44894, term44894.getClass(), "highestRating", 0);
        setIntField(term44894, term44894.getClass(), "nameplateId", 0);
        setIntField(term44894, term44894.getClass(), "frameId", 0);
        setIntField(term44894, term44894.getClass(), "characterId", 0);
        setIntField(term44894, term44894.getClass(), "trophyId", 0);
        setIntField(term44894, term44894.getClass(), "playedTutorialBit", 0);
        setIntField(term44894, term44894.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44894, term44894.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44894, term44894.getClass(), "totalRepertoireCount", 0);
        setIntField(term44894, term44894.getClass(), "totalMapNum", 0);
        setLongField(term44894, term44894.getClass(), "totalHiScore", 0L);
        setLongField(term44894, term44894.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44894, term44894.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44894, term44894.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44894, term44894.getClass(), "totalMasterHighScore", 0L);
        setField(term44894, term44894.getClass(), "eventWatchedDate", null);
        setIntField(term44894, term44894.getClass(), "friendCount", 0);
        setBooleanField(term44894, term44894.getClass(), "isMaimai", false);
        setField(term44894, term44894.getClass(), "firstGameId", null);
        setField(term44894, term44894.getClass(), "firstRomVersion", null);
        setField(term44894, term44894.getClass(), "firstDataVersion", null);
        setField(term44894, term44894.getClass(), "firstPlayDate", null);
        setField(term44894, term44894.getClass(), "lastGameId", null);
        setField(term44894, term44894.getClass(), "lastRomVersion", null);
        setField(term44894, term44894.getClass(), "lastDataVersion", null);
        setField(term44894, term44894.getClass(), "lastPlayDate", null);
        setIntField(term44894, term44894.getClass(), "lastPlaceId", 0);
        setField(term44894, term44894.getClass(), "lastPlaceName", null);
        setField(term44894, term44894.getClass(), "lastRegionId", null);
        setField(term44894, term44894.getClass(), "lastRegionName", null);
        setField(term44894, term44894.getClass(), "lastAllNetId", null);
        setField(term44894, term44894.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term44894, args);
    }

};


