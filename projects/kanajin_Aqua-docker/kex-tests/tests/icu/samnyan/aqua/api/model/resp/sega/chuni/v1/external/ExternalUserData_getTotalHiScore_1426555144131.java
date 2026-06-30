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

public class ExternalUserData_getTotalHiScore_1426555144131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42602;

    public ExternalUserData_getTotalHiScore_1426555144131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42602 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42602, term42602.getClass(), "accessCode", null);
        setField(term42602, term42602.getClass(), "userName", null);
        setField(term42602, term42602.getClass(), "lastLoginDate", null);
        setBooleanField(term42602, term42602.getClass(), "isWebJoin", false);
        setField(term42602, term42602.getClass(), "webLimitDate", null);
        setIntField(term42602, term42602.getClass(), "level", 0);
        setIntField(term42602, term42602.getClass(), "reincarnationNum", 0);
        setField(term42602, term42602.getClass(), "exp", null);
        setLongField(term42602, term42602.getClass(), "point", 0L);
        setLongField(term42602, term42602.getClass(), "totalPoint", 0L);
        setIntField(term42602, term42602.getClass(), "playCount", 0);
        setIntField(term42602, term42602.getClass(), "multiPlayCount", 0);
        setIntField(term42602, term42602.getClass(), "multiWinCount", 0);
        setIntField(term42602, term42602.getClass(), "requestResCount", 0);
        setIntField(term42602, term42602.getClass(), "acceptResCount", 0);
        setIntField(term42602, term42602.getClass(), "successResCount", 0);
        setIntField(term42602, term42602.getClass(), "playerRating", 0);
        setIntField(term42602, term42602.getClass(), "highestRating", 0);
        setIntField(term42602, term42602.getClass(), "nameplateId", 0);
        setIntField(term42602, term42602.getClass(), "frameId", 0);
        setIntField(term42602, term42602.getClass(), "characterId", 0);
        setIntField(term42602, term42602.getClass(), "trophyId", 0);
        setIntField(term42602, term42602.getClass(), "playedTutorialBit", 0);
        setIntField(term42602, term42602.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42602, term42602.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42602, term42602.getClass(), "totalRepertoireCount", 0);
        setIntField(term42602, term42602.getClass(), "totalMapNum", 0);
        setLongField(term42602, term42602.getClass(), "totalHiScore", 0L);
        setLongField(term42602, term42602.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42602, term42602.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42602, term42602.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42602, term42602.getClass(), "totalMasterHighScore", 0L);
        setField(term42602, term42602.getClass(), "eventWatchedDate", null);
        setIntField(term42602, term42602.getClass(), "friendCount", 0);
        setBooleanField(term42602, term42602.getClass(), "isMaimai", false);
        setField(term42602, term42602.getClass(), "firstGameId", null);
        setField(term42602, term42602.getClass(), "firstRomVersion", null);
        setField(term42602, term42602.getClass(), "firstDataVersion", null);
        setField(term42602, term42602.getClass(), "firstPlayDate", null);
        setField(term42602, term42602.getClass(), "lastGameId", null);
        setField(term42602, term42602.getClass(), "lastRomVersion", null);
        setField(term42602, term42602.getClass(), "lastDataVersion", null);
        setField(term42602, term42602.getClass(), "lastPlayDate", null);
        setIntField(term42602, term42602.getClass(), "lastPlaceId", 0);
        setField(term42602, term42602.getClass(), "lastPlaceName", null);
        setField(term42602, term42602.getClass(), "lastRegionId", null);
        setField(term42602, term42602.getClass(), "lastRegionName", null);
        setField(term42602, term42602.getClass(), "lastAllNetId", null);
        setField(term42602, term42602.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term42602, args);
    }

};


