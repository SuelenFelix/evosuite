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

public class ExternalUserData_setWebLimitDate_986144788157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43410;

    public ExternalUserData_setWebLimitDate_986144788157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43410 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43410, term43410.getClass(), "accessCode", null);
        setField(term43410, term43410.getClass(), "userName", null);
        setField(term43410, term43410.getClass(), "lastLoginDate", null);
        setBooleanField(term43410, term43410.getClass(), "isWebJoin", false);
        setField(term43410, term43410.getClass(), "webLimitDate", null);
        setIntField(term43410, term43410.getClass(), "level", 0);
        setIntField(term43410, term43410.getClass(), "reincarnationNum", 0);
        setField(term43410, term43410.getClass(), "exp", null);
        setLongField(term43410, term43410.getClass(), "point", 0L);
        setLongField(term43410, term43410.getClass(), "totalPoint", 0L);
        setIntField(term43410, term43410.getClass(), "playCount", 0);
        setIntField(term43410, term43410.getClass(), "multiPlayCount", 0);
        setIntField(term43410, term43410.getClass(), "multiWinCount", 0);
        setIntField(term43410, term43410.getClass(), "requestResCount", 0);
        setIntField(term43410, term43410.getClass(), "acceptResCount", 0);
        setIntField(term43410, term43410.getClass(), "successResCount", 0);
        setIntField(term43410, term43410.getClass(), "playerRating", 0);
        setIntField(term43410, term43410.getClass(), "highestRating", 0);
        setIntField(term43410, term43410.getClass(), "nameplateId", 0);
        setIntField(term43410, term43410.getClass(), "frameId", 0);
        setIntField(term43410, term43410.getClass(), "characterId", 0);
        setIntField(term43410, term43410.getClass(), "trophyId", 0);
        setIntField(term43410, term43410.getClass(), "playedTutorialBit", 0);
        setIntField(term43410, term43410.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43410, term43410.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43410, term43410.getClass(), "totalRepertoireCount", 0);
        setIntField(term43410, term43410.getClass(), "totalMapNum", 0);
        setLongField(term43410, term43410.getClass(), "totalHiScore", 0L);
        setLongField(term43410, term43410.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43410, term43410.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43410, term43410.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43410, term43410.getClass(), "totalMasterHighScore", 0L);
        setField(term43410, term43410.getClass(), "eventWatchedDate", null);
        setIntField(term43410, term43410.getClass(), "friendCount", 0);
        setBooleanField(term43410, term43410.getClass(), "isMaimai", false);
        setField(term43410, term43410.getClass(), "firstGameId", null);
        setField(term43410, term43410.getClass(), "firstRomVersion", null);
        setField(term43410, term43410.getClass(), "firstDataVersion", null);
        setField(term43410, term43410.getClass(), "firstPlayDate", null);
        setField(term43410, term43410.getClass(), "lastGameId", null);
        setField(term43410, term43410.getClass(), "lastRomVersion", null);
        setField(term43410, term43410.getClass(), "lastDataVersion", null);
        setField(term43410, term43410.getClass(), "lastPlayDate", null);
        setIntField(term43410, term43410.getClass(), "lastPlaceId", 0);
        setField(term43410, term43410.getClass(), "lastPlaceName", null);
        setField(term43410, term43410.getClass(), "lastRegionId", null);
        setField(term43410, term43410.getClass(), "lastRegionName", null);
        setField(term43410, term43410.getClass(), "lastAllNetId", null);
        setField(term43410, term43410.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWebLimitDate", argTypes, term43410, args);
    }

};


