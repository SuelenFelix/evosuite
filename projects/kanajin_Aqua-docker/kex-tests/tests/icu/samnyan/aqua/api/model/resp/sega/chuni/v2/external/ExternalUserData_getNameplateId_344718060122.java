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

public class ExternalUserData_getNameplateId_344718060122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42323;

    public ExternalUserData_getNameplateId_344718060122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42323 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42323, term42323.getClass(), "accessCode", null);
        setField(term42323, term42323.getClass(), "userName", null);
        setField(term42323, term42323.getClass(), "lastLoginDate", null);
        setBooleanField(term42323, term42323.getClass(), "isWebJoin", false);
        setField(term42323, term42323.getClass(), "webLimitDate", null);
        setIntField(term42323, term42323.getClass(), "level", 0);
        setIntField(term42323, term42323.getClass(), "reincarnationNum", 0);
        setField(term42323, term42323.getClass(), "exp", null);
        setLongField(term42323, term42323.getClass(), "point", 0L);
        setLongField(term42323, term42323.getClass(), "totalPoint", 0L);
        setIntField(term42323, term42323.getClass(), "playCount", 0);
        setIntField(term42323, term42323.getClass(), "multiPlayCount", 0);
        setIntField(term42323, term42323.getClass(), "multiWinCount", 0);
        setIntField(term42323, term42323.getClass(), "requestResCount", 0);
        setIntField(term42323, term42323.getClass(), "acceptResCount", 0);
        setIntField(term42323, term42323.getClass(), "successResCount", 0);
        setIntField(term42323, term42323.getClass(), "playerRating", 0);
        setIntField(term42323, term42323.getClass(), "highestRating", 0);
        setIntField(term42323, term42323.getClass(), "nameplateId", 0);
        setIntField(term42323, term42323.getClass(), "frameId", 0);
        setIntField(term42323, term42323.getClass(), "characterId", 0);
        setIntField(term42323, term42323.getClass(), "trophyId", 0);
        setIntField(term42323, term42323.getClass(), "playedTutorialBit", 0);
        setIntField(term42323, term42323.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42323, term42323.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42323, term42323.getClass(), "totalRepertoireCount", 0);
        setIntField(term42323, term42323.getClass(), "totalMapNum", 0);
        setLongField(term42323, term42323.getClass(), "totalHiScore", 0L);
        setLongField(term42323, term42323.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42323, term42323.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42323, term42323.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42323, term42323.getClass(), "totalMasterHighScore", 0L);
        setField(term42323, term42323.getClass(), "eventWatchedDate", null);
        setIntField(term42323, term42323.getClass(), "friendCount", 0);
        setBooleanField(term42323, term42323.getClass(), "isMaimai", false);
        setField(term42323, term42323.getClass(), "firstGameId", null);
        setField(term42323, term42323.getClass(), "firstRomVersion", null);
        setField(term42323, term42323.getClass(), "firstDataVersion", null);
        setField(term42323, term42323.getClass(), "firstPlayDate", null);
        setField(term42323, term42323.getClass(), "lastGameId", null);
        setField(term42323, term42323.getClass(), "lastRomVersion", null);
        setField(term42323, term42323.getClass(), "lastDataVersion", null);
        setField(term42323, term42323.getClass(), "lastPlayDate", null);
        setIntField(term42323, term42323.getClass(), "lastPlaceId", 0);
        setField(term42323, term42323.getClass(), "lastPlaceName", null);
        setField(term42323, term42323.getClass(), "lastRegionId", null);
        setField(term42323, term42323.getClass(), "lastRegionName", null);
        setField(term42323, term42323.getClass(), "lastAllNetId", null);
        setField(term42323, term42323.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term42323, args);
    }

};


