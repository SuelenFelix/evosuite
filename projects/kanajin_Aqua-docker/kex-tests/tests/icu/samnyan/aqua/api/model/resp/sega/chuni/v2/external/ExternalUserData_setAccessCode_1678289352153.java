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

public class ExternalUserData_setAccessCode_1678289352153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43284;

    public ExternalUserData_setAccessCode_1678289352153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43284 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43284, term43284.getClass(), "accessCode", null);
        setField(term43284, term43284.getClass(), "userName", null);
        setField(term43284, term43284.getClass(), "lastLoginDate", null);
        setBooleanField(term43284, term43284.getClass(), "isWebJoin", false);
        setField(term43284, term43284.getClass(), "webLimitDate", null);
        setIntField(term43284, term43284.getClass(), "level", 0);
        setIntField(term43284, term43284.getClass(), "reincarnationNum", 0);
        setField(term43284, term43284.getClass(), "exp", null);
        setLongField(term43284, term43284.getClass(), "point", 0L);
        setLongField(term43284, term43284.getClass(), "totalPoint", 0L);
        setIntField(term43284, term43284.getClass(), "playCount", 0);
        setIntField(term43284, term43284.getClass(), "multiPlayCount", 0);
        setIntField(term43284, term43284.getClass(), "multiWinCount", 0);
        setIntField(term43284, term43284.getClass(), "requestResCount", 0);
        setIntField(term43284, term43284.getClass(), "acceptResCount", 0);
        setIntField(term43284, term43284.getClass(), "successResCount", 0);
        setIntField(term43284, term43284.getClass(), "playerRating", 0);
        setIntField(term43284, term43284.getClass(), "highestRating", 0);
        setIntField(term43284, term43284.getClass(), "nameplateId", 0);
        setIntField(term43284, term43284.getClass(), "frameId", 0);
        setIntField(term43284, term43284.getClass(), "characterId", 0);
        setIntField(term43284, term43284.getClass(), "trophyId", 0);
        setIntField(term43284, term43284.getClass(), "playedTutorialBit", 0);
        setIntField(term43284, term43284.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43284, term43284.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43284, term43284.getClass(), "totalRepertoireCount", 0);
        setIntField(term43284, term43284.getClass(), "totalMapNum", 0);
        setLongField(term43284, term43284.getClass(), "totalHiScore", 0L);
        setLongField(term43284, term43284.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43284, term43284.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43284, term43284.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43284, term43284.getClass(), "totalMasterHighScore", 0L);
        setField(term43284, term43284.getClass(), "eventWatchedDate", null);
        setIntField(term43284, term43284.getClass(), "friendCount", 0);
        setBooleanField(term43284, term43284.getClass(), "isMaimai", false);
        setField(term43284, term43284.getClass(), "firstGameId", null);
        setField(term43284, term43284.getClass(), "firstRomVersion", null);
        setField(term43284, term43284.getClass(), "firstDataVersion", null);
        setField(term43284, term43284.getClass(), "firstPlayDate", null);
        setField(term43284, term43284.getClass(), "lastGameId", null);
        setField(term43284, term43284.getClass(), "lastRomVersion", null);
        setField(term43284, term43284.getClass(), "lastDataVersion", null);
        setField(term43284, term43284.getClass(), "lastPlayDate", null);
        setIntField(term43284, term43284.getClass(), "lastPlaceId", 0);
        setField(term43284, term43284.getClass(), "lastPlaceName", null);
        setField(term43284, term43284.getClass(), "lastRegionId", null);
        setField(term43284, term43284.getClass(), "lastRegionName", null);
        setField(term43284, term43284.getClass(), "lastAllNetId", null);
        setField(term43284, term43284.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAccessCode", argTypes, term43284, args);
    }

};


