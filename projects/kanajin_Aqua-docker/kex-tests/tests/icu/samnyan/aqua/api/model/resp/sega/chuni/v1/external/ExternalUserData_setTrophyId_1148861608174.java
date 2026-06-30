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

public class ExternalUserData_setTrophyId_1148861608174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43967;
     Object term43998;

    public ExternalUserData_setTrophyId_1148861608174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43967 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43967, term43967.getClass(), "accessCode", null);
        setField(term43967, term43967.getClass(), "userName", null);
        setField(term43967, term43967.getClass(), "lastLoginDate", null);
        setBooleanField(term43967, term43967.getClass(), "isWebJoin", false);
        setField(term43967, term43967.getClass(), "webLimitDate", null);
        setIntField(term43967, term43967.getClass(), "level", 0);
        setIntField(term43967, term43967.getClass(), "reincarnationNum", 0);
        setField(term43967, term43967.getClass(), "exp", null);
        setLongField(term43967, term43967.getClass(), "point", 0L);
        setLongField(term43967, term43967.getClass(), "totalPoint", 0L);
        setIntField(term43967, term43967.getClass(), "playCount", 0);
        setIntField(term43967, term43967.getClass(), "multiPlayCount", 0);
        setIntField(term43967, term43967.getClass(), "multiWinCount", 0);
        setIntField(term43967, term43967.getClass(), "requestResCount", 0);
        setIntField(term43967, term43967.getClass(), "acceptResCount", 0);
        setIntField(term43967, term43967.getClass(), "successResCount", 0);
        setIntField(term43967, term43967.getClass(), "playerRating", 0);
        setIntField(term43967, term43967.getClass(), "highestRating", 0);
        setIntField(term43967, term43967.getClass(), "nameplateId", 0);
        setIntField(term43967, term43967.getClass(), "frameId", 0);
        setIntField(term43967, term43967.getClass(), "characterId", 0);
        setIntField(term43967, term43967.getClass(), "trophyId", 0);
        setIntField(term43967, term43967.getClass(), "playedTutorialBit", 0);
        setIntField(term43967, term43967.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43967, term43967.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43967, term43967.getClass(), "totalRepertoireCount", 0);
        setIntField(term43967, term43967.getClass(), "totalMapNum", 0);
        setLongField(term43967, term43967.getClass(), "totalHiScore", 0L);
        setLongField(term43967, term43967.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43967, term43967.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43967, term43967.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43967, term43967.getClass(), "totalMasterHighScore", 0L);
        setField(term43967, term43967.getClass(), "eventWatchedDate", null);
        setIntField(term43967, term43967.getClass(), "friendCount", 0);
        setBooleanField(term43967, term43967.getClass(), "isMaimai", false);
        setField(term43967, term43967.getClass(), "firstGameId", null);
        setField(term43967, term43967.getClass(), "firstRomVersion", null);
        setField(term43967, term43967.getClass(), "firstDataVersion", null);
        setField(term43967, term43967.getClass(), "firstPlayDate", null);
        setField(term43967, term43967.getClass(), "lastGameId", null);
        setField(term43967, term43967.getClass(), "lastRomVersion", null);
        setField(term43967, term43967.getClass(), "lastDataVersion", null);
        setField(term43967, term43967.getClass(), "lastPlayDate", null);
        setIntField(term43967, term43967.getClass(), "lastPlaceId", 0);
        setField(term43967, term43967.getClass(), "lastPlaceName", null);
        setField(term43967, term43967.getClass(), "lastRegionId", null);
        setField(term43967, term43967.getClass(), "lastRegionName", null);
        setField(term43967, term43967.getClass(), "lastAllNetId", null);
        setField(term43967, term43967.getClass(), "lastClientId", null);
        term43998 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43998;
        callMethod(klass, "setTrophyId", argTypes, term43967, args);
    }

};


