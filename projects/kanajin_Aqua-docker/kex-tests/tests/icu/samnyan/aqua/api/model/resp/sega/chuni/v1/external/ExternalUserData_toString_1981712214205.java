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

public class ExternalUserData_toString_1981712214205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44956;

    public ExternalUserData_toString_1981712214205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44956 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44956, term44956.getClass(), "accessCode", null);
        setField(term44956, term44956.getClass(), "userName", null);
        setField(term44956, term44956.getClass(), "lastLoginDate", null);
        setBooleanField(term44956, term44956.getClass(), "isWebJoin", false);
        setField(term44956, term44956.getClass(), "webLimitDate", null);
        setIntField(term44956, term44956.getClass(), "level", 0);
        setIntField(term44956, term44956.getClass(), "reincarnationNum", 0);
        setField(term44956, term44956.getClass(), "exp", null);
        setLongField(term44956, term44956.getClass(), "point", 0L);
        setLongField(term44956, term44956.getClass(), "totalPoint", 0L);
        setIntField(term44956, term44956.getClass(), "playCount", 0);
        setIntField(term44956, term44956.getClass(), "multiPlayCount", 0);
        setIntField(term44956, term44956.getClass(), "multiWinCount", 0);
        setIntField(term44956, term44956.getClass(), "requestResCount", 0);
        setIntField(term44956, term44956.getClass(), "acceptResCount", 0);
        setIntField(term44956, term44956.getClass(), "successResCount", 0);
        setIntField(term44956, term44956.getClass(), "playerRating", 0);
        setIntField(term44956, term44956.getClass(), "highestRating", 0);
        setIntField(term44956, term44956.getClass(), "nameplateId", 0);
        setIntField(term44956, term44956.getClass(), "frameId", 0);
        setIntField(term44956, term44956.getClass(), "characterId", 0);
        setIntField(term44956, term44956.getClass(), "trophyId", 0);
        setIntField(term44956, term44956.getClass(), "playedTutorialBit", 0);
        setIntField(term44956, term44956.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44956, term44956.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44956, term44956.getClass(), "totalRepertoireCount", 0);
        setIntField(term44956, term44956.getClass(), "totalMapNum", 0);
        setLongField(term44956, term44956.getClass(), "totalHiScore", 0L);
        setLongField(term44956, term44956.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44956, term44956.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44956, term44956.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44956, term44956.getClass(), "totalMasterHighScore", 0L);
        setField(term44956, term44956.getClass(), "eventWatchedDate", null);
        setIntField(term44956, term44956.getClass(), "friendCount", 0);
        setBooleanField(term44956, term44956.getClass(), "isMaimai", false);
        setField(term44956, term44956.getClass(), "firstGameId", null);
        setField(term44956, term44956.getClass(), "firstRomVersion", null);
        setField(term44956, term44956.getClass(), "firstDataVersion", null);
        setField(term44956, term44956.getClass(), "firstPlayDate", null);
        setField(term44956, term44956.getClass(), "lastGameId", null);
        setField(term44956, term44956.getClass(), "lastRomVersion", null);
        setField(term44956, term44956.getClass(), "lastDataVersion", null);
        setField(term44956, term44956.getClass(), "lastPlayDate", null);
        setIntField(term44956, term44956.getClass(), "lastPlaceId", 0);
        setField(term44956, term44956.getClass(), "lastPlaceName", null);
        setField(term44956, term44956.getClass(), "lastRegionId", null);
        setField(term44956, term44956.getClass(), "lastRegionName", null);
        setField(term44956, term44956.getClass(), "lastAllNetId", null);
        setField(term44956, term44956.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term44956, args);
    }

};


