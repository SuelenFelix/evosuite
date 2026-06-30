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

public class ExternalUserData_getLastRegionId_2121739548149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43160;

    public ExternalUserData_getLastRegionId_2121739548149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43160 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43160, term43160.getClass(), "accessCode", null);
        setField(term43160, term43160.getClass(), "userName", null);
        setField(term43160, term43160.getClass(), "lastLoginDate", null);
        setBooleanField(term43160, term43160.getClass(), "isWebJoin", false);
        setField(term43160, term43160.getClass(), "webLimitDate", null);
        setIntField(term43160, term43160.getClass(), "level", 0);
        setIntField(term43160, term43160.getClass(), "reincarnationNum", 0);
        setField(term43160, term43160.getClass(), "exp", null);
        setLongField(term43160, term43160.getClass(), "point", 0L);
        setLongField(term43160, term43160.getClass(), "totalPoint", 0L);
        setIntField(term43160, term43160.getClass(), "playCount", 0);
        setIntField(term43160, term43160.getClass(), "multiPlayCount", 0);
        setIntField(term43160, term43160.getClass(), "multiWinCount", 0);
        setIntField(term43160, term43160.getClass(), "requestResCount", 0);
        setIntField(term43160, term43160.getClass(), "acceptResCount", 0);
        setIntField(term43160, term43160.getClass(), "successResCount", 0);
        setIntField(term43160, term43160.getClass(), "playerRating", 0);
        setIntField(term43160, term43160.getClass(), "highestRating", 0);
        setIntField(term43160, term43160.getClass(), "nameplateId", 0);
        setIntField(term43160, term43160.getClass(), "frameId", 0);
        setIntField(term43160, term43160.getClass(), "characterId", 0);
        setIntField(term43160, term43160.getClass(), "trophyId", 0);
        setIntField(term43160, term43160.getClass(), "playedTutorialBit", 0);
        setIntField(term43160, term43160.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43160, term43160.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43160, term43160.getClass(), "totalRepertoireCount", 0);
        setIntField(term43160, term43160.getClass(), "totalMapNum", 0);
        setLongField(term43160, term43160.getClass(), "totalHiScore", 0L);
        setLongField(term43160, term43160.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43160, term43160.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43160, term43160.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43160, term43160.getClass(), "totalMasterHighScore", 0L);
        setField(term43160, term43160.getClass(), "eventWatchedDate", null);
        setIntField(term43160, term43160.getClass(), "friendCount", 0);
        setBooleanField(term43160, term43160.getClass(), "isMaimai", false);
        setField(term43160, term43160.getClass(), "firstGameId", null);
        setField(term43160, term43160.getClass(), "firstRomVersion", null);
        setField(term43160, term43160.getClass(), "firstDataVersion", null);
        setField(term43160, term43160.getClass(), "firstPlayDate", null);
        setField(term43160, term43160.getClass(), "lastGameId", null);
        setField(term43160, term43160.getClass(), "lastRomVersion", null);
        setField(term43160, term43160.getClass(), "lastDataVersion", null);
        setField(term43160, term43160.getClass(), "lastPlayDate", null);
        setIntField(term43160, term43160.getClass(), "lastPlaceId", 0);
        setField(term43160, term43160.getClass(), "lastPlaceName", null);
        setField(term43160, term43160.getClass(), "lastRegionId", null);
        setField(term43160, term43160.getClass(), "lastRegionName", null);
        setField(term43160, term43160.getClass(), "lastAllNetId", null);
        setField(term43160, term43160.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term43160, args);
    }

};


