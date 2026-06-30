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

public class ExternalUserData_setPlayerRating_2125914971169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43802;
     Object term43833;

    public ExternalUserData_setPlayerRating_2125914971169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43802 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43802, term43802.getClass(), "accessCode", null);
        setField(term43802, term43802.getClass(), "userName", null);
        setField(term43802, term43802.getClass(), "lastLoginDate", null);
        setBooleanField(term43802, term43802.getClass(), "isWebJoin", false);
        setField(term43802, term43802.getClass(), "webLimitDate", null);
        setIntField(term43802, term43802.getClass(), "level", 0);
        setIntField(term43802, term43802.getClass(), "reincarnationNum", 0);
        setField(term43802, term43802.getClass(), "exp", null);
        setLongField(term43802, term43802.getClass(), "point", 0L);
        setLongField(term43802, term43802.getClass(), "totalPoint", 0L);
        setIntField(term43802, term43802.getClass(), "playCount", 0);
        setIntField(term43802, term43802.getClass(), "multiPlayCount", 0);
        setIntField(term43802, term43802.getClass(), "multiWinCount", 0);
        setIntField(term43802, term43802.getClass(), "requestResCount", 0);
        setIntField(term43802, term43802.getClass(), "acceptResCount", 0);
        setIntField(term43802, term43802.getClass(), "successResCount", 0);
        setIntField(term43802, term43802.getClass(), "playerRating", 0);
        setIntField(term43802, term43802.getClass(), "highestRating", 0);
        setIntField(term43802, term43802.getClass(), "nameplateId", 0);
        setIntField(term43802, term43802.getClass(), "frameId", 0);
        setIntField(term43802, term43802.getClass(), "characterId", 0);
        setIntField(term43802, term43802.getClass(), "trophyId", 0);
        setIntField(term43802, term43802.getClass(), "playedTutorialBit", 0);
        setIntField(term43802, term43802.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43802, term43802.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43802, term43802.getClass(), "totalRepertoireCount", 0);
        setIntField(term43802, term43802.getClass(), "totalMapNum", 0);
        setLongField(term43802, term43802.getClass(), "totalHiScore", 0L);
        setLongField(term43802, term43802.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43802, term43802.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43802, term43802.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43802, term43802.getClass(), "totalMasterHighScore", 0L);
        setField(term43802, term43802.getClass(), "eventWatchedDate", null);
        setIntField(term43802, term43802.getClass(), "friendCount", 0);
        setBooleanField(term43802, term43802.getClass(), "isMaimai", false);
        setField(term43802, term43802.getClass(), "firstGameId", null);
        setField(term43802, term43802.getClass(), "firstRomVersion", null);
        setField(term43802, term43802.getClass(), "firstDataVersion", null);
        setField(term43802, term43802.getClass(), "firstPlayDate", null);
        setField(term43802, term43802.getClass(), "lastGameId", null);
        setField(term43802, term43802.getClass(), "lastRomVersion", null);
        setField(term43802, term43802.getClass(), "lastDataVersion", null);
        setField(term43802, term43802.getClass(), "lastPlayDate", null);
        setIntField(term43802, term43802.getClass(), "lastPlaceId", 0);
        setField(term43802, term43802.getClass(), "lastPlaceName", null);
        setField(term43802, term43802.getClass(), "lastRegionId", null);
        setField(term43802, term43802.getClass(), "lastRegionName", null);
        setField(term43802, term43802.getClass(), "lastAllNetId", null);
        setField(term43802, term43802.getClass(), "lastClientId", null);
        term43833 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43833;
        callMethod(klass, "setPlayerRating", argTypes, term43802, args);
    }

};


