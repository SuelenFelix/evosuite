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

public class ExternalUserData_setTotalHiScore_235293993180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44165;
     Object term44196;

    public ExternalUserData_setTotalHiScore_235293993180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44165 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44165, term44165.getClass(), "accessCode", null);
        setField(term44165, term44165.getClass(), "userName", null);
        setField(term44165, term44165.getClass(), "lastLoginDate", null);
        setBooleanField(term44165, term44165.getClass(), "isWebJoin", false);
        setField(term44165, term44165.getClass(), "webLimitDate", null);
        setIntField(term44165, term44165.getClass(), "level", 0);
        setIntField(term44165, term44165.getClass(), "reincarnationNum", 0);
        setField(term44165, term44165.getClass(), "exp", null);
        setLongField(term44165, term44165.getClass(), "point", 0L);
        setLongField(term44165, term44165.getClass(), "totalPoint", 0L);
        setIntField(term44165, term44165.getClass(), "playCount", 0);
        setIntField(term44165, term44165.getClass(), "multiPlayCount", 0);
        setIntField(term44165, term44165.getClass(), "multiWinCount", 0);
        setIntField(term44165, term44165.getClass(), "requestResCount", 0);
        setIntField(term44165, term44165.getClass(), "acceptResCount", 0);
        setIntField(term44165, term44165.getClass(), "successResCount", 0);
        setIntField(term44165, term44165.getClass(), "playerRating", 0);
        setIntField(term44165, term44165.getClass(), "highestRating", 0);
        setIntField(term44165, term44165.getClass(), "nameplateId", 0);
        setIntField(term44165, term44165.getClass(), "frameId", 0);
        setIntField(term44165, term44165.getClass(), "characterId", 0);
        setIntField(term44165, term44165.getClass(), "trophyId", 0);
        setIntField(term44165, term44165.getClass(), "playedTutorialBit", 0);
        setIntField(term44165, term44165.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44165, term44165.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44165, term44165.getClass(), "totalRepertoireCount", 0);
        setIntField(term44165, term44165.getClass(), "totalMapNum", 0);
        setLongField(term44165, term44165.getClass(), "totalHiScore", 0L);
        setLongField(term44165, term44165.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44165, term44165.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44165, term44165.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44165, term44165.getClass(), "totalMasterHighScore", 0L);
        setField(term44165, term44165.getClass(), "eventWatchedDate", null);
        setIntField(term44165, term44165.getClass(), "friendCount", 0);
        setBooleanField(term44165, term44165.getClass(), "isMaimai", false);
        setField(term44165, term44165.getClass(), "firstGameId", null);
        setField(term44165, term44165.getClass(), "firstRomVersion", null);
        setField(term44165, term44165.getClass(), "firstDataVersion", null);
        setField(term44165, term44165.getClass(), "firstPlayDate", null);
        setField(term44165, term44165.getClass(), "lastGameId", null);
        setField(term44165, term44165.getClass(), "lastRomVersion", null);
        setField(term44165, term44165.getClass(), "lastDataVersion", null);
        setField(term44165, term44165.getClass(), "lastPlayDate", null);
        setIntField(term44165, term44165.getClass(), "lastPlaceId", 0);
        setField(term44165, term44165.getClass(), "lastPlaceName", null);
        setField(term44165, term44165.getClass(), "lastRegionId", null);
        setField(term44165, term44165.getClass(), "lastRegionName", null);
        setField(term44165, term44165.getClass(), "lastAllNetId", null);
        setField(term44165, term44165.getClass(), "lastClientId", null);
        term44196 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44196;
        callMethod(klass, "setTotalHiScore", argTypes, term44165, args);
    }

};


