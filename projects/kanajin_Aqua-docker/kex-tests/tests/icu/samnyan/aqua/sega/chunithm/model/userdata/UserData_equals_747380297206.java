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

public class UserData_equals_747380297206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177861;

    public UserData_equals_747380297206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177861 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177861, term177861.getClass(), "id", 0L);
        setField(term177861, term177861.getClass(), "card", null);
        setField(term177861, term177861.getClass(), "userName", null);
        setField(term177861, term177861.getClass(), "lastLoginDate", null);
        setBooleanField(term177861, term177861.getClass(), "isWebJoin", false);
        setField(term177861, term177861.getClass(), "webLimitDate", null);
        setIntField(term177861, term177861.getClass(), "level", 0);
        setIntField(term177861, term177861.getClass(), "reincarnationNum", 0);
        setField(term177861, term177861.getClass(), "exp", null);
        setLongField(term177861, term177861.getClass(), "point", 0L);
        setLongField(term177861, term177861.getClass(), "totalPoint", 0L);
        setIntField(term177861, term177861.getClass(), "playCount", 0);
        setIntField(term177861, term177861.getClass(), "multiPlayCount", 0);
        setIntField(term177861, term177861.getClass(), "multiWinCount", 0);
        setIntField(term177861, term177861.getClass(), "requestResCount", 0);
        setIntField(term177861, term177861.getClass(), "acceptResCount", 0);
        setIntField(term177861, term177861.getClass(), "successResCount", 0);
        setIntField(term177861, term177861.getClass(), "playerRating", 0);
        setIntField(term177861, term177861.getClass(), "highestRating", 0);
        setIntField(term177861, term177861.getClass(), "nameplateId", 0);
        setIntField(term177861, term177861.getClass(), "frameId", 0);
        setIntField(term177861, term177861.getClass(), "characterId", 0);
        setIntField(term177861, term177861.getClass(), "trophyId", 0);
        setIntField(term177861, term177861.getClass(), "playedTutorialBit", 0);
        setIntField(term177861, term177861.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177861, term177861.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177861, term177861.getClass(), "totalRepertoireCount", 0);
        setIntField(term177861, term177861.getClass(), "totalMapNum", 0);
        setLongField(term177861, term177861.getClass(), "totalHiScore", 0L);
        setLongField(term177861, term177861.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177861, term177861.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177861, term177861.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177861, term177861.getClass(), "totalMasterHighScore", 0L);
        setField(term177861, term177861.getClass(), "eventWatchedDate", null);
        setIntField(term177861, term177861.getClass(), "friendCount", 0);
        setBooleanField(term177861, term177861.getClass(), "isMaimai", false);
        setField(term177861, term177861.getClass(), "firstGameId", null);
        setField(term177861, term177861.getClass(), "firstRomVersion", null);
        setField(term177861, term177861.getClass(), "firstDataVersion", null);
        setField(term177861, term177861.getClass(), "firstPlayDate", null);
        setField(term177861, term177861.getClass(), "lastGameId", null);
        setField(term177861, term177861.getClass(), "lastRomVersion", null);
        setField(term177861, term177861.getClass(), "lastDataVersion", null);
        setField(term177861, term177861.getClass(), "lastPlayDate", null);
        setIntField(term177861, term177861.getClass(), "lastPlaceId", 0);
        setField(term177861, term177861.getClass(), "lastPlaceName", null);
        setField(term177861, term177861.getClass(), "lastRegionId", null);
        setField(term177861, term177861.getClass(), "lastRegionName", null);
        setField(term177861, term177861.getClass(), "lastAllNetId", null);
        setField(term177861, term177861.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term177861, args);
    }

};


