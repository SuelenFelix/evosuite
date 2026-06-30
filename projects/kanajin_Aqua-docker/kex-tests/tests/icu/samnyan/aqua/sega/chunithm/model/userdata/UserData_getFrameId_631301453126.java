package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getFrameId_631301453126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175239;

    public UserData_getFrameId_631301453126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175239 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175239, term175239.getClass(), "id", 0L);
        setField(term175239, term175239.getClass(), "card", null);
        setField(term175239, term175239.getClass(), "userName", null);
        setField(term175239, term175239.getClass(), "lastLoginDate", null);
        setBooleanField(term175239, term175239.getClass(), "isWebJoin", false);
        setField(term175239, term175239.getClass(), "webLimitDate", null);
        setIntField(term175239, term175239.getClass(), "level", 0);
        setIntField(term175239, term175239.getClass(), "reincarnationNum", 0);
        setField(term175239, term175239.getClass(), "exp", null);
        setLongField(term175239, term175239.getClass(), "point", 0L);
        setLongField(term175239, term175239.getClass(), "totalPoint", 0L);
        setIntField(term175239, term175239.getClass(), "playCount", 0);
        setIntField(term175239, term175239.getClass(), "multiPlayCount", 0);
        setIntField(term175239, term175239.getClass(), "multiWinCount", 0);
        setIntField(term175239, term175239.getClass(), "requestResCount", 0);
        setIntField(term175239, term175239.getClass(), "acceptResCount", 0);
        setIntField(term175239, term175239.getClass(), "successResCount", 0);
        setIntField(term175239, term175239.getClass(), "playerRating", 0);
        setIntField(term175239, term175239.getClass(), "highestRating", 0);
        setIntField(term175239, term175239.getClass(), "nameplateId", 0);
        setIntField(term175239, term175239.getClass(), "frameId", 0);
        setIntField(term175239, term175239.getClass(), "characterId", 0);
        setIntField(term175239, term175239.getClass(), "trophyId", 0);
        setIntField(term175239, term175239.getClass(), "playedTutorialBit", 0);
        setIntField(term175239, term175239.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175239, term175239.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175239, term175239.getClass(), "totalRepertoireCount", 0);
        setIntField(term175239, term175239.getClass(), "totalMapNum", 0);
        setLongField(term175239, term175239.getClass(), "totalHiScore", 0L);
        setLongField(term175239, term175239.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175239, term175239.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175239, term175239.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175239, term175239.getClass(), "totalMasterHighScore", 0L);
        setField(term175239, term175239.getClass(), "eventWatchedDate", null);
        setIntField(term175239, term175239.getClass(), "friendCount", 0);
        setBooleanField(term175239, term175239.getClass(), "isMaimai", false);
        setField(term175239, term175239.getClass(), "firstGameId", null);
        setField(term175239, term175239.getClass(), "firstRomVersion", null);
        setField(term175239, term175239.getClass(), "firstDataVersion", null);
        setField(term175239, term175239.getClass(), "firstPlayDate", null);
        setField(term175239, term175239.getClass(), "lastGameId", null);
        setField(term175239, term175239.getClass(), "lastRomVersion", null);
        setField(term175239, term175239.getClass(), "lastDataVersion", null);
        setField(term175239, term175239.getClass(), "lastPlayDate", null);
        setIntField(term175239, term175239.getClass(), "lastPlaceId", 0);
        setField(term175239, term175239.getClass(), "lastPlaceName", null);
        setField(term175239, term175239.getClass(), "lastRegionId", null);
        setField(term175239, term175239.getClass(), "lastRegionName", null);
        setField(term175239, term175239.getClass(), "lastAllNetId", null);
        setField(term175239, term175239.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term175239, args);
    }

};


