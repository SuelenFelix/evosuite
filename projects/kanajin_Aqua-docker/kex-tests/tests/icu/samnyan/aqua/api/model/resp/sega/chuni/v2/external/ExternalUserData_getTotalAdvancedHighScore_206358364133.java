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

public class ExternalUserData_getTotalAdvancedHighScore_206358364133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42664;

    public ExternalUserData_getTotalAdvancedHighScore_206358364133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42664 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42664, term42664.getClass(), "accessCode", null);
        setField(term42664, term42664.getClass(), "userName", null);
        setField(term42664, term42664.getClass(), "lastLoginDate", null);
        setBooleanField(term42664, term42664.getClass(), "isWebJoin", false);
        setField(term42664, term42664.getClass(), "webLimitDate", null);
        setIntField(term42664, term42664.getClass(), "level", 0);
        setIntField(term42664, term42664.getClass(), "reincarnationNum", 0);
        setField(term42664, term42664.getClass(), "exp", null);
        setLongField(term42664, term42664.getClass(), "point", 0L);
        setLongField(term42664, term42664.getClass(), "totalPoint", 0L);
        setIntField(term42664, term42664.getClass(), "playCount", 0);
        setIntField(term42664, term42664.getClass(), "multiPlayCount", 0);
        setIntField(term42664, term42664.getClass(), "multiWinCount", 0);
        setIntField(term42664, term42664.getClass(), "requestResCount", 0);
        setIntField(term42664, term42664.getClass(), "acceptResCount", 0);
        setIntField(term42664, term42664.getClass(), "successResCount", 0);
        setIntField(term42664, term42664.getClass(), "playerRating", 0);
        setIntField(term42664, term42664.getClass(), "highestRating", 0);
        setIntField(term42664, term42664.getClass(), "nameplateId", 0);
        setIntField(term42664, term42664.getClass(), "frameId", 0);
        setIntField(term42664, term42664.getClass(), "characterId", 0);
        setIntField(term42664, term42664.getClass(), "trophyId", 0);
        setIntField(term42664, term42664.getClass(), "playedTutorialBit", 0);
        setIntField(term42664, term42664.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42664, term42664.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42664, term42664.getClass(), "totalRepertoireCount", 0);
        setIntField(term42664, term42664.getClass(), "totalMapNum", 0);
        setLongField(term42664, term42664.getClass(), "totalHiScore", 0L);
        setLongField(term42664, term42664.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42664, term42664.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42664, term42664.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42664, term42664.getClass(), "totalMasterHighScore", 0L);
        setField(term42664, term42664.getClass(), "eventWatchedDate", null);
        setIntField(term42664, term42664.getClass(), "friendCount", 0);
        setBooleanField(term42664, term42664.getClass(), "isMaimai", false);
        setField(term42664, term42664.getClass(), "firstGameId", null);
        setField(term42664, term42664.getClass(), "firstRomVersion", null);
        setField(term42664, term42664.getClass(), "firstDataVersion", null);
        setField(term42664, term42664.getClass(), "firstPlayDate", null);
        setField(term42664, term42664.getClass(), "lastGameId", null);
        setField(term42664, term42664.getClass(), "lastRomVersion", null);
        setField(term42664, term42664.getClass(), "lastDataVersion", null);
        setField(term42664, term42664.getClass(), "lastPlayDate", null);
        setIntField(term42664, term42664.getClass(), "lastPlaceId", 0);
        setField(term42664, term42664.getClass(), "lastPlaceName", null);
        setField(term42664, term42664.getClass(), "lastRegionId", null);
        setField(term42664, term42664.getClass(), "lastRegionName", null);
        setField(term42664, term42664.getClass(), "lastAllNetId", null);
        setField(term42664, term42664.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term42664, args);
    }

};


