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
import java.lang.Boolean;

public class ExternalUserData_setWebJoin_2119976362156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43377;
     Object term43408;

    public ExternalUserData_setWebJoin_2119976362156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43377 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43377, term43377.getClass(), "accessCode", null);
        setField(term43377, term43377.getClass(), "userName", null);
        setField(term43377, term43377.getClass(), "lastLoginDate", null);
        setBooleanField(term43377, term43377.getClass(), "isWebJoin", false);
        setField(term43377, term43377.getClass(), "webLimitDate", null);
        setIntField(term43377, term43377.getClass(), "level", 0);
        setIntField(term43377, term43377.getClass(), "reincarnationNum", 0);
        setField(term43377, term43377.getClass(), "exp", null);
        setLongField(term43377, term43377.getClass(), "point", 0L);
        setLongField(term43377, term43377.getClass(), "totalPoint", 0L);
        setIntField(term43377, term43377.getClass(), "playCount", 0);
        setIntField(term43377, term43377.getClass(), "multiPlayCount", 0);
        setIntField(term43377, term43377.getClass(), "multiWinCount", 0);
        setIntField(term43377, term43377.getClass(), "requestResCount", 0);
        setIntField(term43377, term43377.getClass(), "acceptResCount", 0);
        setIntField(term43377, term43377.getClass(), "successResCount", 0);
        setIntField(term43377, term43377.getClass(), "playerRating", 0);
        setIntField(term43377, term43377.getClass(), "highestRating", 0);
        setIntField(term43377, term43377.getClass(), "nameplateId", 0);
        setIntField(term43377, term43377.getClass(), "frameId", 0);
        setIntField(term43377, term43377.getClass(), "characterId", 0);
        setIntField(term43377, term43377.getClass(), "trophyId", 0);
        setIntField(term43377, term43377.getClass(), "playedTutorialBit", 0);
        setIntField(term43377, term43377.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43377, term43377.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43377, term43377.getClass(), "totalRepertoireCount", 0);
        setIntField(term43377, term43377.getClass(), "totalMapNum", 0);
        setLongField(term43377, term43377.getClass(), "totalHiScore", 0L);
        setLongField(term43377, term43377.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43377, term43377.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43377, term43377.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43377, term43377.getClass(), "totalMasterHighScore", 0L);
        setField(term43377, term43377.getClass(), "eventWatchedDate", null);
        setIntField(term43377, term43377.getClass(), "friendCount", 0);
        setBooleanField(term43377, term43377.getClass(), "isMaimai", false);
        setField(term43377, term43377.getClass(), "firstGameId", null);
        setField(term43377, term43377.getClass(), "firstRomVersion", null);
        setField(term43377, term43377.getClass(), "firstDataVersion", null);
        setField(term43377, term43377.getClass(), "firstPlayDate", null);
        setField(term43377, term43377.getClass(), "lastGameId", null);
        setField(term43377, term43377.getClass(), "lastRomVersion", null);
        setField(term43377, term43377.getClass(), "lastDataVersion", null);
        setField(term43377, term43377.getClass(), "lastPlayDate", null);
        setIntField(term43377, term43377.getClass(), "lastPlaceId", 0);
        setField(term43377, term43377.getClass(), "lastPlaceName", null);
        setField(term43377, term43377.getClass(), "lastRegionId", null);
        setField(term43377, term43377.getClass(), "lastRegionName", null);
        setField(term43377, term43377.getClass(), "lastAllNetId", null);
        setField(term43377, term43377.getClass(), "lastClientId", null);
        term43408 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term43408;
        callMethod(klass, "setWebJoin", argTypes, term43377, args);
    }

};


