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

public class ExternalUserData_getPlayCount_1775921833114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42075;

    public ExternalUserData_getPlayCount_1775921833114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42075 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42075, term42075.getClass(), "accessCode", null);
        setField(term42075, term42075.getClass(), "userName", null);
        setField(term42075, term42075.getClass(), "lastLoginDate", null);
        setBooleanField(term42075, term42075.getClass(), "isWebJoin", false);
        setField(term42075, term42075.getClass(), "webLimitDate", null);
        setIntField(term42075, term42075.getClass(), "level", 0);
        setIntField(term42075, term42075.getClass(), "reincarnationNum", 0);
        setField(term42075, term42075.getClass(), "exp", null);
        setLongField(term42075, term42075.getClass(), "point", 0L);
        setLongField(term42075, term42075.getClass(), "totalPoint", 0L);
        setIntField(term42075, term42075.getClass(), "playCount", 0);
        setIntField(term42075, term42075.getClass(), "multiPlayCount", 0);
        setIntField(term42075, term42075.getClass(), "multiWinCount", 0);
        setIntField(term42075, term42075.getClass(), "requestResCount", 0);
        setIntField(term42075, term42075.getClass(), "acceptResCount", 0);
        setIntField(term42075, term42075.getClass(), "successResCount", 0);
        setIntField(term42075, term42075.getClass(), "playerRating", 0);
        setIntField(term42075, term42075.getClass(), "highestRating", 0);
        setIntField(term42075, term42075.getClass(), "nameplateId", 0);
        setIntField(term42075, term42075.getClass(), "frameId", 0);
        setIntField(term42075, term42075.getClass(), "characterId", 0);
        setIntField(term42075, term42075.getClass(), "trophyId", 0);
        setIntField(term42075, term42075.getClass(), "playedTutorialBit", 0);
        setIntField(term42075, term42075.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42075, term42075.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42075, term42075.getClass(), "totalRepertoireCount", 0);
        setIntField(term42075, term42075.getClass(), "totalMapNum", 0);
        setLongField(term42075, term42075.getClass(), "totalHiScore", 0L);
        setLongField(term42075, term42075.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42075, term42075.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42075, term42075.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42075, term42075.getClass(), "totalMasterHighScore", 0L);
        setField(term42075, term42075.getClass(), "eventWatchedDate", null);
        setIntField(term42075, term42075.getClass(), "friendCount", 0);
        setBooleanField(term42075, term42075.getClass(), "isMaimai", false);
        setField(term42075, term42075.getClass(), "firstGameId", null);
        setField(term42075, term42075.getClass(), "firstRomVersion", null);
        setField(term42075, term42075.getClass(), "firstDataVersion", null);
        setField(term42075, term42075.getClass(), "firstPlayDate", null);
        setField(term42075, term42075.getClass(), "lastGameId", null);
        setField(term42075, term42075.getClass(), "lastRomVersion", null);
        setField(term42075, term42075.getClass(), "lastDataVersion", null);
        setField(term42075, term42075.getClass(), "lastPlayDate", null);
        setIntField(term42075, term42075.getClass(), "lastPlaceId", 0);
        setField(term42075, term42075.getClass(), "lastPlaceName", null);
        setField(term42075, term42075.getClass(), "lastRegionId", null);
        setField(term42075, term42075.getClass(), "lastRegionName", null);
        setField(term42075, term42075.getClass(), "lastAllNetId", null);
        setField(term42075, term42075.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term42075, args);
    }

};


