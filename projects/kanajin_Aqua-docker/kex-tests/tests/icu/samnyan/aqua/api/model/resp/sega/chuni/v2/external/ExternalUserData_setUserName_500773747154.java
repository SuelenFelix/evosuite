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

public class ExternalUserData_setUserName_500773747154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43315;

    public ExternalUserData_setUserName_500773747154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43315 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43315, term43315.getClass(), "accessCode", null);
        setField(term43315, term43315.getClass(), "userName", null);
        setField(term43315, term43315.getClass(), "lastLoginDate", null);
        setBooleanField(term43315, term43315.getClass(), "isWebJoin", false);
        setField(term43315, term43315.getClass(), "webLimitDate", null);
        setIntField(term43315, term43315.getClass(), "level", 0);
        setIntField(term43315, term43315.getClass(), "reincarnationNum", 0);
        setField(term43315, term43315.getClass(), "exp", null);
        setLongField(term43315, term43315.getClass(), "point", 0L);
        setLongField(term43315, term43315.getClass(), "totalPoint", 0L);
        setIntField(term43315, term43315.getClass(), "playCount", 0);
        setIntField(term43315, term43315.getClass(), "multiPlayCount", 0);
        setIntField(term43315, term43315.getClass(), "multiWinCount", 0);
        setIntField(term43315, term43315.getClass(), "requestResCount", 0);
        setIntField(term43315, term43315.getClass(), "acceptResCount", 0);
        setIntField(term43315, term43315.getClass(), "successResCount", 0);
        setIntField(term43315, term43315.getClass(), "playerRating", 0);
        setIntField(term43315, term43315.getClass(), "highestRating", 0);
        setIntField(term43315, term43315.getClass(), "nameplateId", 0);
        setIntField(term43315, term43315.getClass(), "frameId", 0);
        setIntField(term43315, term43315.getClass(), "characterId", 0);
        setIntField(term43315, term43315.getClass(), "trophyId", 0);
        setIntField(term43315, term43315.getClass(), "playedTutorialBit", 0);
        setIntField(term43315, term43315.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43315, term43315.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43315, term43315.getClass(), "totalRepertoireCount", 0);
        setIntField(term43315, term43315.getClass(), "totalMapNum", 0);
        setLongField(term43315, term43315.getClass(), "totalHiScore", 0L);
        setLongField(term43315, term43315.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43315, term43315.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43315, term43315.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43315, term43315.getClass(), "totalMasterHighScore", 0L);
        setField(term43315, term43315.getClass(), "eventWatchedDate", null);
        setIntField(term43315, term43315.getClass(), "friendCount", 0);
        setBooleanField(term43315, term43315.getClass(), "isMaimai", false);
        setField(term43315, term43315.getClass(), "firstGameId", null);
        setField(term43315, term43315.getClass(), "firstRomVersion", null);
        setField(term43315, term43315.getClass(), "firstDataVersion", null);
        setField(term43315, term43315.getClass(), "firstPlayDate", null);
        setField(term43315, term43315.getClass(), "lastGameId", null);
        setField(term43315, term43315.getClass(), "lastRomVersion", null);
        setField(term43315, term43315.getClass(), "lastDataVersion", null);
        setField(term43315, term43315.getClass(), "lastPlayDate", null);
        setIntField(term43315, term43315.getClass(), "lastPlaceId", 0);
        setField(term43315, term43315.getClass(), "lastPlaceName", null);
        setField(term43315, term43315.getClass(), "lastRegionId", null);
        setField(term43315, term43315.getClass(), "lastRegionName", null);
        setField(term43315, term43315.getClass(), "lastAllNetId", null);
        setField(term43315, term43315.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term43315, args);
    }

};


