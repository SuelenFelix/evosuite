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

public class ExternalUserData_getLastRomVersion_1852638371144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43005;

    public ExternalUserData_getLastRomVersion_1852638371144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43005 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43005, term43005.getClass(), "accessCode", null);
        setField(term43005, term43005.getClass(), "userName", null);
        setField(term43005, term43005.getClass(), "lastLoginDate", null);
        setBooleanField(term43005, term43005.getClass(), "isWebJoin", false);
        setField(term43005, term43005.getClass(), "webLimitDate", null);
        setIntField(term43005, term43005.getClass(), "level", 0);
        setIntField(term43005, term43005.getClass(), "reincarnationNum", 0);
        setField(term43005, term43005.getClass(), "exp", null);
        setLongField(term43005, term43005.getClass(), "point", 0L);
        setLongField(term43005, term43005.getClass(), "totalPoint", 0L);
        setIntField(term43005, term43005.getClass(), "playCount", 0);
        setIntField(term43005, term43005.getClass(), "multiPlayCount", 0);
        setIntField(term43005, term43005.getClass(), "multiWinCount", 0);
        setIntField(term43005, term43005.getClass(), "requestResCount", 0);
        setIntField(term43005, term43005.getClass(), "acceptResCount", 0);
        setIntField(term43005, term43005.getClass(), "successResCount", 0);
        setIntField(term43005, term43005.getClass(), "playerRating", 0);
        setIntField(term43005, term43005.getClass(), "highestRating", 0);
        setIntField(term43005, term43005.getClass(), "nameplateId", 0);
        setIntField(term43005, term43005.getClass(), "frameId", 0);
        setIntField(term43005, term43005.getClass(), "characterId", 0);
        setIntField(term43005, term43005.getClass(), "trophyId", 0);
        setIntField(term43005, term43005.getClass(), "playedTutorialBit", 0);
        setIntField(term43005, term43005.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43005, term43005.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43005, term43005.getClass(), "totalRepertoireCount", 0);
        setIntField(term43005, term43005.getClass(), "totalMapNum", 0);
        setLongField(term43005, term43005.getClass(), "totalHiScore", 0L);
        setLongField(term43005, term43005.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43005, term43005.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43005, term43005.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43005, term43005.getClass(), "totalMasterHighScore", 0L);
        setField(term43005, term43005.getClass(), "eventWatchedDate", null);
        setIntField(term43005, term43005.getClass(), "friendCount", 0);
        setBooleanField(term43005, term43005.getClass(), "isMaimai", false);
        setField(term43005, term43005.getClass(), "firstGameId", null);
        setField(term43005, term43005.getClass(), "firstRomVersion", null);
        setField(term43005, term43005.getClass(), "firstDataVersion", null);
        setField(term43005, term43005.getClass(), "firstPlayDate", null);
        setField(term43005, term43005.getClass(), "lastGameId", null);
        setField(term43005, term43005.getClass(), "lastRomVersion", null);
        setField(term43005, term43005.getClass(), "lastDataVersion", null);
        setField(term43005, term43005.getClass(), "lastPlayDate", null);
        setIntField(term43005, term43005.getClass(), "lastPlaceId", 0);
        setField(term43005, term43005.getClass(), "lastPlaceName", null);
        setField(term43005, term43005.getClass(), "lastRegionId", null);
        setField(term43005, term43005.getClass(), "lastRegionName", null);
        setField(term43005, term43005.getClass(), "lastAllNetId", null);
        setField(term43005, term43005.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term43005, args);
    }

};


