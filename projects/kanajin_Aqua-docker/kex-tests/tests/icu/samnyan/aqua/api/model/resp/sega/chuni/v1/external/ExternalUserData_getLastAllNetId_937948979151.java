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

public class ExternalUserData_getLastAllNetId_937948979151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43222;

    public ExternalUserData_getLastAllNetId_937948979151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43222 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43222, term43222.getClass(), "accessCode", null);
        setField(term43222, term43222.getClass(), "userName", null);
        setField(term43222, term43222.getClass(), "lastLoginDate", null);
        setBooleanField(term43222, term43222.getClass(), "isWebJoin", false);
        setField(term43222, term43222.getClass(), "webLimitDate", null);
        setIntField(term43222, term43222.getClass(), "level", 0);
        setIntField(term43222, term43222.getClass(), "reincarnationNum", 0);
        setField(term43222, term43222.getClass(), "exp", null);
        setLongField(term43222, term43222.getClass(), "point", 0L);
        setLongField(term43222, term43222.getClass(), "totalPoint", 0L);
        setIntField(term43222, term43222.getClass(), "playCount", 0);
        setIntField(term43222, term43222.getClass(), "multiPlayCount", 0);
        setIntField(term43222, term43222.getClass(), "multiWinCount", 0);
        setIntField(term43222, term43222.getClass(), "requestResCount", 0);
        setIntField(term43222, term43222.getClass(), "acceptResCount", 0);
        setIntField(term43222, term43222.getClass(), "successResCount", 0);
        setIntField(term43222, term43222.getClass(), "playerRating", 0);
        setIntField(term43222, term43222.getClass(), "highestRating", 0);
        setIntField(term43222, term43222.getClass(), "nameplateId", 0);
        setIntField(term43222, term43222.getClass(), "frameId", 0);
        setIntField(term43222, term43222.getClass(), "characterId", 0);
        setIntField(term43222, term43222.getClass(), "trophyId", 0);
        setIntField(term43222, term43222.getClass(), "playedTutorialBit", 0);
        setIntField(term43222, term43222.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43222, term43222.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43222, term43222.getClass(), "totalRepertoireCount", 0);
        setIntField(term43222, term43222.getClass(), "totalMapNum", 0);
        setLongField(term43222, term43222.getClass(), "totalHiScore", 0L);
        setLongField(term43222, term43222.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43222, term43222.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43222, term43222.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43222, term43222.getClass(), "totalMasterHighScore", 0L);
        setField(term43222, term43222.getClass(), "eventWatchedDate", null);
        setIntField(term43222, term43222.getClass(), "friendCount", 0);
        setBooleanField(term43222, term43222.getClass(), "isMaimai", false);
        setField(term43222, term43222.getClass(), "firstGameId", null);
        setField(term43222, term43222.getClass(), "firstRomVersion", null);
        setField(term43222, term43222.getClass(), "firstDataVersion", null);
        setField(term43222, term43222.getClass(), "firstPlayDate", null);
        setField(term43222, term43222.getClass(), "lastGameId", null);
        setField(term43222, term43222.getClass(), "lastRomVersion", null);
        setField(term43222, term43222.getClass(), "lastDataVersion", null);
        setField(term43222, term43222.getClass(), "lastPlayDate", null);
        setIntField(term43222, term43222.getClass(), "lastPlaceId", 0);
        setField(term43222, term43222.getClass(), "lastPlaceName", null);
        setField(term43222, term43222.getClass(), "lastRegionId", null);
        setField(term43222, term43222.getClass(), "lastRegionName", null);
        setField(term43222, term43222.getClass(), "lastAllNetId", null);
        setField(term43222, term43222.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term43222, args);
    }

};


