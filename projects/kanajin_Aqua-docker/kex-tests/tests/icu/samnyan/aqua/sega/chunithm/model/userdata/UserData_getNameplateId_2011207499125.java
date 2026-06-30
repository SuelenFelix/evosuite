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

public class UserData_getNameplateId_2011207499125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175207;

    public UserData_getNameplateId_2011207499125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175207, term175207.getClass(), "id", 0L);
        setField(term175207, term175207.getClass(), "card", null);
        setField(term175207, term175207.getClass(), "userName", null);
        setField(term175207, term175207.getClass(), "lastLoginDate", null);
        setBooleanField(term175207, term175207.getClass(), "isWebJoin", false);
        setField(term175207, term175207.getClass(), "webLimitDate", null);
        setIntField(term175207, term175207.getClass(), "level", 0);
        setIntField(term175207, term175207.getClass(), "reincarnationNum", 0);
        setField(term175207, term175207.getClass(), "exp", null);
        setLongField(term175207, term175207.getClass(), "point", 0L);
        setLongField(term175207, term175207.getClass(), "totalPoint", 0L);
        setIntField(term175207, term175207.getClass(), "playCount", 0);
        setIntField(term175207, term175207.getClass(), "multiPlayCount", 0);
        setIntField(term175207, term175207.getClass(), "multiWinCount", 0);
        setIntField(term175207, term175207.getClass(), "requestResCount", 0);
        setIntField(term175207, term175207.getClass(), "acceptResCount", 0);
        setIntField(term175207, term175207.getClass(), "successResCount", 0);
        setIntField(term175207, term175207.getClass(), "playerRating", 0);
        setIntField(term175207, term175207.getClass(), "highestRating", 0);
        setIntField(term175207, term175207.getClass(), "nameplateId", 0);
        setIntField(term175207, term175207.getClass(), "frameId", 0);
        setIntField(term175207, term175207.getClass(), "characterId", 0);
        setIntField(term175207, term175207.getClass(), "trophyId", 0);
        setIntField(term175207, term175207.getClass(), "playedTutorialBit", 0);
        setIntField(term175207, term175207.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175207, term175207.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175207, term175207.getClass(), "totalRepertoireCount", 0);
        setIntField(term175207, term175207.getClass(), "totalMapNum", 0);
        setLongField(term175207, term175207.getClass(), "totalHiScore", 0L);
        setLongField(term175207, term175207.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175207, term175207.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175207, term175207.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175207, term175207.getClass(), "totalMasterHighScore", 0L);
        setField(term175207, term175207.getClass(), "eventWatchedDate", null);
        setIntField(term175207, term175207.getClass(), "friendCount", 0);
        setBooleanField(term175207, term175207.getClass(), "isMaimai", false);
        setField(term175207, term175207.getClass(), "firstGameId", null);
        setField(term175207, term175207.getClass(), "firstRomVersion", null);
        setField(term175207, term175207.getClass(), "firstDataVersion", null);
        setField(term175207, term175207.getClass(), "firstPlayDate", null);
        setField(term175207, term175207.getClass(), "lastGameId", null);
        setField(term175207, term175207.getClass(), "lastRomVersion", null);
        setField(term175207, term175207.getClass(), "lastDataVersion", null);
        setField(term175207, term175207.getClass(), "lastPlayDate", null);
        setIntField(term175207, term175207.getClass(), "lastPlaceId", 0);
        setField(term175207, term175207.getClass(), "lastPlaceName", null);
        setField(term175207, term175207.getClass(), "lastRegionId", null);
        setField(term175207, term175207.getClass(), "lastRegionName", null);
        setField(term175207, term175207.getClass(), "lastAllNetId", null);
        setField(term175207, term175207.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term175207, args);
    }

};


