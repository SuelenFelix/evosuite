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
import java.lang.Long;

public class ExternalUserData_setTotalAdvancedHighScore_1548263834182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44231;
     Object term44262;

    public ExternalUserData_setTotalAdvancedHighScore_1548263834182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44231 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44231, term44231.getClass(), "accessCode", null);
        setField(term44231, term44231.getClass(), "userName", null);
        setField(term44231, term44231.getClass(), "lastLoginDate", null);
        setBooleanField(term44231, term44231.getClass(), "isWebJoin", false);
        setField(term44231, term44231.getClass(), "webLimitDate", null);
        setIntField(term44231, term44231.getClass(), "level", 0);
        setIntField(term44231, term44231.getClass(), "reincarnationNum", 0);
        setField(term44231, term44231.getClass(), "exp", null);
        setLongField(term44231, term44231.getClass(), "point", 0L);
        setLongField(term44231, term44231.getClass(), "totalPoint", 0L);
        setIntField(term44231, term44231.getClass(), "playCount", 0);
        setIntField(term44231, term44231.getClass(), "multiPlayCount", 0);
        setIntField(term44231, term44231.getClass(), "multiWinCount", 0);
        setIntField(term44231, term44231.getClass(), "requestResCount", 0);
        setIntField(term44231, term44231.getClass(), "acceptResCount", 0);
        setIntField(term44231, term44231.getClass(), "successResCount", 0);
        setIntField(term44231, term44231.getClass(), "playerRating", 0);
        setIntField(term44231, term44231.getClass(), "highestRating", 0);
        setIntField(term44231, term44231.getClass(), "nameplateId", 0);
        setIntField(term44231, term44231.getClass(), "frameId", 0);
        setIntField(term44231, term44231.getClass(), "characterId", 0);
        setIntField(term44231, term44231.getClass(), "trophyId", 0);
        setIntField(term44231, term44231.getClass(), "playedTutorialBit", 0);
        setIntField(term44231, term44231.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44231, term44231.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44231, term44231.getClass(), "totalRepertoireCount", 0);
        setIntField(term44231, term44231.getClass(), "totalMapNum", 0);
        setLongField(term44231, term44231.getClass(), "totalHiScore", 0L);
        setLongField(term44231, term44231.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44231, term44231.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44231, term44231.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44231, term44231.getClass(), "totalMasterHighScore", 0L);
        setField(term44231, term44231.getClass(), "eventWatchedDate", null);
        setIntField(term44231, term44231.getClass(), "friendCount", 0);
        setBooleanField(term44231, term44231.getClass(), "isMaimai", false);
        setField(term44231, term44231.getClass(), "firstGameId", null);
        setField(term44231, term44231.getClass(), "firstRomVersion", null);
        setField(term44231, term44231.getClass(), "firstDataVersion", null);
        setField(term44231, term44231.getClass(), "firstPlayDate", null);
        setField(term44231, term44231.getClass(), "lastGameId", null);
        setField(term44231, term44231.getClass(), "lastRomVersion", null);
        setField(term44231, term44231.getClass(), "lastDataVersion", null);
        setField(term44231, term44231.getClass(), "lastPlayDate", null);
        setIntField(term44231, term44231.getClass(), "lastPlaceId", 0);
        setField(term44231, term44231.getClass(), "lastPlaceName", null);
        setField(term44231, term44231.getClass(), "lastRegionId", null);
        setField(term44231, term44231.getClass(), "lastRegionName", null);
        setField(term44231, term44231.getClass(), "lastAllNetId", null);
        setField(term44231, term44231.getClass(), "lastClientId", null);
        term44262 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44262;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term44231, args);
    }

};


