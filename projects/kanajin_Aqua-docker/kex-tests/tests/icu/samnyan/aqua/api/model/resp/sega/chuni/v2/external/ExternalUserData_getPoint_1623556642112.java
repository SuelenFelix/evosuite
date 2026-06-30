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

public class ExternalUserData_getPoint_1623556642112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42013;

    public ExternalUserData_getPoint_1623556642112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42013 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42013, term42013.getClass(), "accessCode", null);
        setField(term42013, term42013.getClass(), "userName", null);
        setField(term42013, term42013.getClass(), "lastLoginDate", null);
        setBooleanField(term42013, term42013.getClass(), "isWebJoin", false);
        setField(term42013, term42013.getClass(), "webLimitDate", null);
        setIntField(term42013, term42013.getClass(), "level", 0);
        setIntField(term42013, term42013.getClass(), "reincarnationNum", 0);
        setField(term42013, term42013.getClass(), "exp", null);
        setLongField(term42013, term42013.getClass(), "point", 0L);
        setLongField(term42013, term42013.getClass(), "totalPoint", 0L);
        setIntField(term42013, term42013.getClass(), "playCount", 0);
        setIntField(term42013, term42013.getClass(), "multiPlayCount", 0);
        setIntField(term42013, term42013.getClass(), "multiWinCount", 0);
        setIntField(term42013, term42013.getClass(), "requestResCount", 0);
        setIntField(term42013, term42013.getClass(), "acceptResCount", 0);
        setIntField(term42013, term42013.getClass(), "successResCount", 0);
        setIntField(term42013, term42013.getClass(), "playerRating", 0);
        setIntField(term42013, term42013.getClass(), "highestRating", 0);
        setIntField(term42013, term42013.getClass(), "nameplateId", 0);
        setIntField(term42013, term42013.getClass(), "frameId", 0);
        setIntField(term42013, term42013.getClass(), "characterId", 0);
        setIntField(term42013, term42013.getClass(), "trophyId", 0);
        setIntField(term42013, term42013.getClass(), "playedTutorialBit", 0);
        setIntField(term42013, term42013.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42013, term42013.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42013, term42013.getClass(), "totalRepertoireCount", 0);
        setIntField(term42013, term42013.getClass(), "totalMapNum", 0);
        setLongField(term42013, term42013.getClass(), "totalHiScore", 0L);
        setLongField(term42013, term42013.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42013, term42013.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42013, term42013.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42013, term42013.getClass(), "totalMasterHighScore", 0L);
        setField(term42013, term42013.getClass(), "eventWatchedDate", null);
        setIntField(term42013, term42013.getClass(), "friendCount", 0);
        setBooleanField(term42013, term42013.getClass(), "isMaimai", false);
        setField(term42013, term42013.getClass(), "firstGameId", null);
        setField(term42013, term42013.getClass(), "firstRomVersion", null);
        setField(term42013, term42013.getClass(), "firstDataVersion", null);
        setField(term42013, term42013.getClass(), "firstPlayDate", null);
        setField(term42013, term42013.getClass(), "lastGameId", null);
        setField(term42013, term42013.getClass(), "lastRomVersion", null);
        setField(term42013, term42013.getClass(), "lastDataVersion", null);
        setField(term42013, term42013.getClass(), "lastPlayDate", null);
        setIntField(term42013, term42013.getClass(), "lastPlaceId", 0);
        setField(term42013, term42013.getClass(), "lastPlaceName", null);
        setField(term42013, term42013.getClass(), "lastRegionId", null);
        setField(term42013, term42013.getClass(), "lastRegionName", null);
        setField(term42013, term42013.getClass(), "lastAllNetId", null);
        setField(term42013, term42013.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term42013, args);
    }

};


