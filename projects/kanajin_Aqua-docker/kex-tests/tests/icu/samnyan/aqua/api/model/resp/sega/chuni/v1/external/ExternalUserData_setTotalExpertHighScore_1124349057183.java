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
import java.lang.Long;

public class ExternalUserData_setTotalExpertHighScore_1124349057183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44264;
     Object term44295;

    public ExternalUserData_setTotalExpertHighScore_1124349057183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44264 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44264, term44264.getClass(), "accessCode", null);
        setField(term44264, term44264.getClass(), "userName", null);
        setField(term44264, term44264.getClass(), "lastLoginDate", null);
        setBooleanField(term44264, term44264.getClass(), "isWebJoin", false);
        setField(term44264, term44264.getClass(), "webLimitDate", null);
        setIntField(term44264, term44264.getClass(), "level", 0);
        setIntField(term44264, term44264.getClass(), "reincarnationNum", 0);
        setField(term44264, term44264.getClass(), "exp", null);
        setLongField(term44264, term44264.getClass(), "point", 0L);
        setLongField(term44264, term44264.getClass(), "totalPoint", 0L);
        setIntField(term44264, term44264.getClass(), "playCount", 0);
        setIntField(term44264, term44264.getClass(), "multiPlayCount", 0);
        setIntField(term44264, term44264.getClass(), "multiWinCount", 0);
        setIntField(term44264, term44264.getClass(), "requestResCount", 0);
        setIntField(term44264, term44264.getClass(), "acceptResCount", 0);
        setIntField(term44264, term44264.getClass(), "successResCount", 0);
        setIntField(term44264, term44264.getClass(), "playerRating", 0);
        setIntField(term44264, term44264.getClass(), "highestRating", 0);
        setIntField(term44264, term44264.getClass(), "nameplateId", 0);
        setIntField(term44264, term44264.getClass(), "frameId", 0);
        setIntField(term44264, term44264.getClass(), "characterId", 0);
        setIntField(term44264, term44264.getClass(), "trophyId", 0);
        setIntField(term44264, term44264.getClass(), "playedTutorialBit", 0);
        setIntField(term44264, term44264.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44264, term44264.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44264, term44264.getClass(), "totalRepertoireCount", 0);
        setIntField(term44264, term44264.getClass(), "totalMapNum", 0);
        setLongField(term44264, term44264.getClass(), "totalHiScore", 0L);
        setLongField(term44264, term44264.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44264, term44264.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44264, term44264.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44264, term44264.getClass(), "totalMasterHighScore", 0L);
        setField(term44264, term44264.getClass(), "eventWatchedDate", null);
        setIntField(term44264, term44264.getClass(), "friendCount", 0);
        setBooleanField(term44264, term44264.getClass(), "isMaimai", false);
        setField(term44264, term44264.getClass(), "firstGameId", null);
        setField(term44264, term44264.getClass(), "firstRomVersion", null);
        setField(term44264, term44264.getClass(), "firstDataVersion", null);
        setField(term44264, term44264.getClass(), "firstPlayDate", null);
        setField(term44264, term44264.getClass(), "lastGameId", null);
        setField(term44264, term44264.getClass(), "lastRomVersion", null);
        setField(term44264, term44264.getClass(), "lastDataVersion", null);
        setField(term44264, term44264.getClass(), "lastPlayDate", null);
        setIntField(term44264, term44264.getClass(), "lastPlaceId", 0);
        setField(term44264, term44264.getClass(), "lastPlaceName", null);
        setField(term44264, term44264.getClass(), "lastRegionId", null);
        setField(term44264, term44264.getClass(), "lastRegionName", null);
        setField(term44264, term44264.getClass(), "lastAllNetId", null);
        setField(term44264, term44264.getClass(), "lastClientId", null);
        term44295 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44295;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term44264, args);
    }

};


