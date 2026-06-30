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

public class ExternalUserData_setLastLoginDate_163931656155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43346;

    public ExternalUserData_setLastLoginDate_163931656155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43346 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43346, term43346.getClass(), "accessCode", null);
        setField(term43346, term43346.getClass(), "userName", null);
        setField(term43346, term43346.getClass(), "lastLoginDate", null);
        setBooleanField(term43346, term43346.getClass(), "isWebJoin", false);
        setField(term43346, term43346.getClass(), "webLimitDate", null);
        setIntField(term43346, term43346.getClass(), "level", 0);
        setIntField(term43346, term43346.getClass(), "reincarnationNum", 0);
        setField(term43346, term43346.getClass(), "exp", null);
        setLongField(term43346, term43346.getClass(), "point", 0L);
        setLongField(term43346, term43346.getClass(), "totalPoint", 0L);
        setIntField(term43346, term43346.getClass(), "playCount", 0);
        setIntField(term43346, term43346.getClass(), "multiPlayCount", 0);
        setIntField(term43346, term43346.getClass(), "multiWinCount", 0);
        setIntField(term43346, term43346.getClass(), "requestResCount", 0);
        setIntField(term43346, term43346.getClass(), "acceptResCount", 0);
        setIntField(term43346, term43346.getClass(), "successResCount", 0);
        setIntField(term43346, term43346.getClass(), "playerRating", 0);
        setIntField(term43346, term43346.getClass(), "highestRating", 0);
        setIntField(term43346, term43346.getClass(), "nameplateId", 0);
        setIntField(term43346, term43346.getClass(), "frameId", 0);
        setIntField(term43346, term43346.getClass(), "characterId", 0);
        setIntField(term43346, term43346.getClass(), "trophyId", 0);
        setIntField(term43346, term43346.getClass(), "playedTutorialBit", 0);
        setIntField(term43346, term43346.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43346, term43346.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43346, term43346.getClass(), "totalRepertoireCount", 0);
        setIntField(term43346, term43346.getClass(), "totalMapNum", 0);
        setLongField(term43346, term43346.getClass(), "totalHiScore", 0L);
        setLongField(term43346, term43346.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43346, term43346.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43346, term43346.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43346, term43346.getClass(), "totalMasterHighScore", 0L);
        setField(term43346, term43346.getClass(), "eventWatchedDate", null);
        setIntField(term43346, term43346.getClass(), "friendCount", 0);
        setBooleanField(term43346, term43346.getClass(), "isMaimai", false);
        setField(term43346, term43346.getClass(), "firstGameId", null);
        setField(term43346, term43346.getClass(), "firstRomVersion", null);
        setField(term43346, term43346.getClass(), "firstDataVersion", null);
        setField(term43346, term43346.getClass(), "firstPlayDate", null);
        setField(term43346, term43346.getClass(), "lastGameId", null);
        setField(term43346, term43346.getClass(), "lastRomVersion", null);
        setField(term43346, term43346.getClass(), "lastDataVersion", null);
        setField(term43346, term43346.getClass(), "lastPlayDate", null);
        setIntField(term43346, term43346.getClass(), "lastPlaceId", 0);
        setField(term43346, term43346.getClass(), "lastPlaceName", null);
        setField(term43346, term43346.getClass(), "lastRegionId", null);
        setField(term43346, term43346.getClass(), "lastRegionName", null);
        setField(term43346, term43346.getClass(), "lastAllNetId", null);
        setField(term43346, term43346.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastLoginDate", argTypes, term43346, args);
    }

};


