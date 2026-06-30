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
import java.lang.Integer;

public class ExternalUserData_setMultiWinCount_1650544933165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43670;
     Object term43701;

    public ExternalUserData_setMultiWinCount_1650544933165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43670 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43670, term43670.getClass(), "accessCode", null);
        setField(term43670, term43670.getClass(), "userName", null);
        setField(term43670, term43670.getClass(), "lastLoginDate", null);
        setBooleanField(term43670, term43670.getClass(), "isWebJoin", false);
        setField(term43670, term43670.getClass(), "webLimitDate", null);
        setIntField(term43670, term43670.getClass(), "level", 0);
        setIntField(term43670, term43670.getClass(), "reincarnationNum", 0);
        setField(term43670, term43670.getClass(), "exp", null);
        setLongField(term43670, term43670.getClass(), "point", 0L);
        setLongField(term43670, term43670.getClass(), "totalPoint", 0L);
        setIntField(term43670, term43670.getClass(), "playCount", 0);
        setIntField(term43670, term43670.getClass(), "multiPlayCount", 0);
        setIntField(term43670, term43670.getClass(), "multiWinCount", 0);
        setIntField(term43670, term43670.getClass(), "requestResCount", 0);
        setIntField(term43670, term43670.getClass(), "acceptResCount", 0);
        setIntField(term43670, term43670.getClass(), "successResCount", 0);
        setIntField(term43670, term43670.getClass(), "playerRating", 0);
        setIntField(term43670, term43670.getClass(), "highestRating", 0);
        setIntField(term43670, term43670.getClass(), "nameplateId", 0);
        setIntField(term43670, term43670.getClass(), "frameId", 0);
        setIntField(term43670, term43670.getClass(), "characterId", 0);
        setIntField(term43670, term43670.getClass(), "trophyId", 0);
        setIntField(term43670, term43670.getClass(), "playedTutorialBit", 0);
        setIntField(term43670, term43670.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43670, term43670.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43670, term43670.getClass(), "totalRepertoireCount", 0);
        setIntField(term43670, term43670.getClass(), "totalMapNum", 0);
        setLongField(term43670, term43670.getClass(), "totalHiScore", 0L);
        setLongField(term43670, term43670.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43670, term43670.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43670, term43670.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43670, term43670.getClass(), "totalMasterHighScore", 0L);
        setField(term43670, term43670.getClass(), "eventWatchedDate", null);
        setIntField(term43670, term43670.getClass(), "friendCount", 0);
        setBooleanField(term43670, term43670.getClass(), "isMaimai", false);
        setField(term43670, term43670.getClass(), "firstGameId", null);
        setField(term43670, term43670.getClass(), "firstRomVersion", null);
        setField(term43670, term43670.getClass(), "firstDataVersion", null);
        setField(term43670, term43670.getClass(), "firstPlayDate", null);
        setField(term43670, term43670.getClass(), "lastGameId", null);
        setField(term43670, term43670.getClass(), "lastRomVersion", null);
        setField(term43670, term43670.getClass(), "lastDataVersion", null);
        setField(term43670, term43670.getClass(), "lastPlayDate", null);
        setIntField(term43670, term43670.getClass(), "lastPlaceId", 0);
        setField(term43670, term43670.getClass(), "lastPlaceName", null);
        setField(term43670, term43670.getClass(), "lastRegionId", null);
        setField(term43670, term43670.getClass(), "lastRegionName", null);
        setField(term43670, term43670.getClass(), "lastAllNetId", null);
        setField(term43670, term43670.getClass(), "lastClientId", null);
        term43701 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43701;
        callMethod(klass, "setMultiWinCount", argTypes, term43670, args);
    }

};


