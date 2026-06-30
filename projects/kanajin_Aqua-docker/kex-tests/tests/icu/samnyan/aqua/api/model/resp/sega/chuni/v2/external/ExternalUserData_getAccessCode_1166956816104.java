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

public class ExternalUserData_getAccessCode_1166956816104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41765;

    public ExternalUserData_getAccessCode_1166956816104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41765 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term41765, term41765.getClass(), "accessCode", null);
        setField(term41765, term41765.getClass(), "userName", null);
        setField(term41765, term41765.getClass(), "lastLoginDate", null);
        setBooleanField(term41765, term41765.getClass(), "isWebJoin", false);
        setField(term41765, term41765.getClass(), "webLimitDate", null);
        setIntField(term41765, term41765.getClass(), "level", 0);
        setIntField(term41765, term41765.getClass(), "reincarnationNum", 0);
        setField(term41765, term41765.getClass(), "exp", null);
        setLongField(term41765, term41765.getClass(), "point", 0L);
        setLongField(term41765, term41765.getClass(), "totalPoint", 0L);
        setIntField(term41765, term41765.getClass(), "playCount", 0);
        setIntField(term41765, term41765.getClass(), "multiPlayCount", 0);
        setIntField(term41765, term41765.getClass(), "multiWinCount", 0);
        setIntField(term41765, term41765.getClass(), "requestResCount", 0);
        setIntField(term41765, term41765.getClass(), "acceptResCount", 0);
        setIntField(term41765, term41765.getClass(), "successResCount", 0);
        setIntField(term41765, term41765.getClass(), "playerRating", 0);
        setIntField(term41765, term41765.getClass(), "highestRating", 0);
        setIntField(term41765, term41765.getClass(), "nameplateId", 0);
        setIntField(term41765, term41765.getClass(), "frameId", 0);
        setIntField(term41765, term41765.getClass(), "characterId", 0);
        setIntField(term41765, term41765.getClass(), "trophyId", 0);
        setIntField(term41765, term41765.getClass(), "playedTutorialBit", 0);
        setIntField(term41765, term41765.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term41765, term41765.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term41765, term41765.getClass(), "totalRepertoireCount", 0);
        setIntField(term41765, term41765.getClass(), "totalMapNum", 0);
        setLongField(term41765, term41765.getClass(), "totalHiScore", 0L);
        setLongField(term41765, term41765.getClass(), "totalBasicHighScore", 0L);
        setLongField(term41765, term41765.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term41765, term41765.getClass(), "totalExpertHighScore", 0L);
        setLongField(term41765, term41765.getClass(), "totalMasterHighScore", 0L);
        setField(term41765, term41765.getClass(), "eventWatchedDate", null);
        setIntField(term41765, term41765.getClass(), "friendCount", 0);
        setBooleanField(term41765, term41765.getClass(), "isMaimai", false);
        setField(term41765, term41765.getClass(), "firstGameId", null);
        setField(term41765, term41765.getClass(), "firstRomVersion", null);
        setField(term41765, term41765.getClass(), "firstDataVersion", null);
        setField(term41765, term41765.getClass(), "firstPlayDate", null);
        setField(term41765, term41765.getClass(), "lastGameId", null);
        setField(term41765, term41765.getClass(), "lastRomVersion", null);
        setField(term41765, term41765.getClass(), "lastDataVersion", null);
        setField(term41765, term41765.getClass(), "lastPlayDate", null);
        setIntField(term41765, term41765.getClass(), "lastPlaceId", 0);
        setField(term41765, term41765.getClass(), "lastPlaceName", null);
        setField(term41765, term41765.getClass(), "lastRegionId", null);
        setField(term41765, term41765.getClass(), "lastRegionName", null);
        setField(term41765, term41765.getClass(), "lastAllNetId", null);
        setField(term41765, term41765.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessCode", argTypes, term41765, args);
    }

};


