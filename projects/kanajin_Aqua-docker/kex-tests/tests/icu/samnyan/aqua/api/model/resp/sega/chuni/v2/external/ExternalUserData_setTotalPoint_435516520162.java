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
import java.lang.Long;

public class ExternalUserData_setTotalPoint_435516520162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43571;
     Object term43602;

    public ExternalUserData_setTotalPoint_435516520162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43571 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43571, term43571.getClass(), "accessCode", null);
        setField(term43571, term43571.getClass(), "userName", null);
        setField(term43571, term43571.getClass(), "lastLoginDate", null);
        setBooleanField(term43571, term43571.getClass(), "isWebJoin", false);
        setField(term43571, term43571.getClass(), "webLimitDate", null);
        setIntField(term43571, term43571.getClass(), "level", 0);
        setIntField(term43571, term43571.getClass(), "reincarnationNum", 0);
        setField(term43571, term43571.getClass(), "exp", null);
        setLongField(term43571, term43571.getClass(), "point", 0L);
        setLongField(term43571, term43571.getClass(), "totalPoint", 0L);
        setIntField(term43571, term43571.getClass(), "playCount", 0);
        setIntField(term43571, term43571.getClass(), "multiPlayCount", 0);
        setIntField(term43571, term43571.getClass(), "multiWinCount", 0);
        setIntField(term43571, term43571.getClass(), "requestResCount", 0);
        setIntField(term43571, term43571.getClass(), "acceptResCount", 0);
        setIntField(term43571, term43571.getClass(), "successResCount", 0);
        setIntField(term43571, term43571.getClass(), "playerRating", 0);
        setIntField(term43571, term43571.getClass(), "highestRating", 0);
        setIntField(term43571, term43571.getClass(), "nameplateId", 0);
        setIntField(term43571, term43571.getClass(), "frameId", 0);
        setIntField(term43571, term43571.getClass(), "characterId", 0);
        setIntField(term43571, term43571.getClass(), "trophyId", 0);
        setIntField(term43571, term43571.getClass(), "playedTutorialBit", 0);
        setIntField(term43571, term43571.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43571, term43571.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43571, term43571.getClass(), "totalRepertoireCount", 0);
        setIntField(term43571, term43571.getClass(), "totalMapNum", 0);
        setLongField(term43571, term43571.getClass(), "totalHiScore", 0L);
        setLongField(term43571, term43571.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43571, term43571.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43571, term43571.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43571, term43571.getClass(), "totalMasterHighScore", 0L);
        setField(term43571, term43571.getClass(), "eventWatchedDate", null);
        setIntField(term43571, term43571.getClass(), "friendCount", 0);
        setBooleanField(term43571, term43571.getClass(), "isMaimai", false);
        setField(term43571, term43571.getClass(), "firstGameId", null);
        setField(term43571, term43571.getClass(), "firstRomVersion", null);
        setField(term43571, term43571.getClass(), "firstDataVersion", null);
        setField(term43571, term43571.getClass(), "firstPlayDate", null);
        setField(term43571, term43571.getClass(), "lastGameId", null);
        setField(term43571, term43571.getClass(), "lastRomVersion", null);
        setField(term43571, term43571.getClass(), "lastDataVersion", null);
        setField(term43571, term43571.getClass(), "lastPlayDate", null);
        setIntField(term43571, term43571.getClass(), "lastPlaceId", 0);
        setField(term43571, term43571.getClass(), "lastPlaceName", null);
        setField(term43571, term43571.getClass(), "lastRegionId", null);
        setField(term43571, term43571.getClass(), "lastRegionName", null);
        setField(term43571, term43571.getClass(), "lastAllNetId", null);
        setField(term43571, term43571.getClass(), "lastClientId", null);
        term43602 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term43602;
        callMethod(klass, "setTotalPoint", argTypes, term43571, args);
    }

};


