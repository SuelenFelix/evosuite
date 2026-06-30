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
import java.lang.Long;

public class UserData_setId_2084397390156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176199;
     Object term176231;

    public UserData_setId_2084397390156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176199 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176199, term176199.getClass(), "id", 0L);
        setField(term176199, term176199.getClass(), "card", null);
        setField(term176199, term176199.getClass(), "userName", null);
        setField(term176199, term176199.getClass(), "lastLoginDate", null);
        setBooleanField(term176199, term176199.getClass(), "isWebJoin", false);
        setField(term176199, term176199.getClass(), "webLimitDate", null);
        setIntField(term176199, term176199.getClass(), "level", 0);
        setIntField(term176199, term176199.getClass(), "reincarnationNum", 0);
        setField(term176199, term176199.getClass(), "exp", null);
        setLongField(term176199, term176199.getClass(), "point", 0L);
        setLongField(term176199, term176199.getClass(), "totalPoint", 0L);
        setIntField(term176199, term176199.getClass(), "playCount", 0);
        setIntField(term176199, term176199.getClass(), "multiPlayCount", 0);
        setIntField(term176199, term176199.getClass(), "multiWinCount", 0);
        setIntField(term176199, term176199.getClass(), "requestResCount", 0);
        setIntField(term176199, term176199.getClass(), "acceptResCount", 0);
        setIntField(term176199, term176199.getClass(), "successResCount", 0);
        setIntField(term176199, term176199.getClass(), "playerRating", 0);
        setIntField(term176199, term176199.getClass(), "highestRating", 0);
        setIntField(term176199, term176199.getClass(), "nameplateId", 0);
        setIntField(term176199, term176199.getClass(), "frameId", 0);
        setIntField(term176199, term176199.getClass(), "characterId", 0);
        setIntField(term176199, term176199.getClass(), "trophyId", 0);
        setIntField(term176199, term176199.getClass(), "playedTutorialBit", 0);
        setIntField(term176199, term176199.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176199, term176199.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176199, term176199.getClass(), "totalRepertoireCount", 0);
        setIntField(term176199, term176199.getClass(), "totalMapNum", 0);
        setLongField(term176199, term176199.getClass(), "totalHiScore", 0L);
        setLongField(term176199, term176199.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176199, term176199.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176199, term176199.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176199, term176199.getClass(), "totalMasterHighScore", 0L);
        setField(term176199, term176199.getClass(), "eventWatchedDate", null);
        setIntField(term176199, term176199.getClass(), "friendCount", 0);
        setBooleanField(term176199, term176199.getClass(), "isMaimai", false);
        setField(term176199, term176199.getClass(), "firstGameId", null);
        setField(term176199, term176199.getClass(), "firstRomVersion", null);
        setField(term176199, term176199.getClass(), "firstDataVersion", null);
        setField(term176199, term176199.getClass(), "firstPlayDate", null);
        setField(term176199, term176199.getClass(), "lastGameId", null);
        setField(term176199, term176199.getClass(), "lastRomVersion", null);
        setField(term176199, term176199.getClass(), "lastDataVersion", null);
        setField(term176199, term176199.getClass(), "lastPlayDate", null);
        setIntField(term176199, term176199.getClass(), "lastPlaceId", 0);
        setField(term176199, term176199.getClass(), "lastPlaceName", null);
        setField(term176199, term176199.getClass(), "lastRegionId", null);
        setField(term176199, term176199.getClass(), "lastRegionName", null);
        setField(term176199, term176199.getClass(), "lastAllNetId", null);
        setField(term176199, term176199.getClass(), "lastClientId", null);
        term176231 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term176231;
        callMethod(klass, "setId", argTypes, term176199, args);
    }

};


