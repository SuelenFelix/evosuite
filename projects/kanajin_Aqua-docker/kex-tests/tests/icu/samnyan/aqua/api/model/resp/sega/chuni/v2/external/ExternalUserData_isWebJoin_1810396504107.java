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

public class ExternalUserData_isWebJoin_1810396504107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41858;

    public ExternalUserData_isWebJoin_1810396504107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41858 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term41858, term41858.getClass(), "accessCode", null);
        setField(term41858, term41858.getClass(), "userName", null);
        setField(term41858, term41858.getClass(), "lastLoginDate", null);
        setBooleanField(term41858, term41858.getClass(), "isWebJoin", false);
        setField(term41858, term41858.getClass(), "webLimitDate", null);
        setIntField(term41858, term41858.getClass(), "level", 0);
        setIntField(term41858, term41858.getClass(), "reincarnationNum", 0);
        setField(term41858, term41858.getClass(), "exp", null);
        setLongField(term41858, term41858.getClass(), "point", 0L);
        setLongField(term41858, term41858.getClass(), "totalPoint", 0L);
        setIntField(term41858, term41858.getClass(), "playCount", 0);
        setIntField(term41858, term41858.getClass(), "multiPlayCount", 0);
        setIntField(term41858, term41858.getClass(), "multiWinCount", 0);
        setIntField(term41858, term41858.getClass(), "requestResCount", 0);
        setIntField(term41858, term41858.getClass(), "acceptResCount", 0);
        setIntField(term41858, term41858.getClass(), "successResCount", 0);
        setIntField(term41858, term41858.getClass(), "playerRating", 0);
        setIntField(term41858, term41858.getClass(), "highestRating", 0);
        setIntField(term41858, term41858.getClass(), "nameplateId", 0);
        setIntField(term41858, term41858.getClass(), "frameId", 0);
        setIntField(term41858, term41858.getClass(), "characterId", 0);
        setIntField(term41858, term41858.getClass(), "trophyId", 0);
        setIntField(term41858, term41858.getClass(), "playedTutorialBit", 0);
        setIntField(term41858, term41858.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term41858, term41858.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term41858, term41858.getClass(), "totalRepertoireCount", 0);
        setIntField(term41858, term41858.getClass(), "totalMapNum", 0);
        setLongField(term41858, term41858.getClass(), "totalHiScore", 0L);
        setLongField(term41858, term41858.getClass(), "totalBasicHighScore", 0L);
        setLongField(term41858, term41858.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term41858, term41858.getClass(), "totalExpertHighScore", 0L);
        setLongField(term41858, term41858.getClass(), "totalMasterHighScore", 0L);
        setField(term41858, term41858.getClass(), "eventWatchedDate", null);
        setIntField(term41858, term41858.getClass(), "friendCount", 0);
        setBooleanField(term41858, term41858.getClass(), "isMaimai", false);
        setField(term41858, term41858.getClass(), "firstGameId", null);
        setField(term41858, term41858.getClass(), "firstRomVersion", null);
        setField(term41858, term41858.getClass(), "firstDataVersion", null);
        setField(term41858, term41858.getClass(), "firstPlayDate", null);
        setField(term41858, term41858.getClass(), "lastGameId", null);
        setField(term41858, term41858.getClass(), "lastRomVersion", null);
        setField(term41858, term41858.getClass(), "lastDataVersion", null);
        setField(term41858, term41858.getClass(), "lastPlayDate", null);
        setIntField(term41858, term41858.getClass(), "lastPlaceId", 0);
        setField(term41858, term41858.getClass(), "lastPlaceName", null);
        setField(term41858, term41858.getClass(), "lastRegionId", null);
        setField(term41858, term41858.getClass(), "lastRegionName", null);
        setField(term41858, term41858.getClass(), "lastAllNetId", null);
        setField(term41858, term41858.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWebJoin", argTypes, term41858, args);
    }

};


