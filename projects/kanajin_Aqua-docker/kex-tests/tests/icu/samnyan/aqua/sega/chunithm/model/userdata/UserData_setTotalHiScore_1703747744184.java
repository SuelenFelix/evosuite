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

public class UserData_setTotalHiScore_1703747744184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177141;
     Object term177173;

    public UserData_setTotalHiScore_1703747744184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177141 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177141, term177141.getClass(), "id", 0L);
        setField(term177141, term177141.getClass(), "card", null);
        setField(term177141, term177141.getClass(), "userName", null);
        setField(term177141, term177141.getClass(), "lastLoginDate", null);
        setBooleanField(term177141, term177141.getClass(), "isWebJoin", false);
        setField(term177141, term177141.getClass(), "webLimitDate", null);
        setIntField(term177141, term177141.getClass(), "level", 0);
        setIntField(term177141, term177141.getClass(), "reincarnationNum", 0);
        setField(term177141, term177141.getClass(), "exp", null);
        setLongField(term177141, term177141.getClass(), "point", 0L);
        setLongField(term177141, term177141.getClass(), "totalPoint", 0L);
        setIntField(term177141, term177141.getClass(), "playCount", 0);
        setIntField(term177141, term177141.getClass(), "multiPlayCount", 0);
        setIntField(term177141, term177141.getClass(), "multiWinCount", 0);
        setIntField(term177141, term177141.getClass(), "requestResCount", 0);
        setIntField(term177141, term177141.getClass(), "acceptResCount", 0);
        setIntField(term177141, term177141.getClass(), "successResCount", 0);
        setIntField(term177141, term177141.getClass(), "playerRating", 0);
        setIntField(term177141, term177141.getClass(), "highestRating", 0);
        setIntField(term177141, term177141.getClass(), "nameplateId", 0);
        setIntField(term177141, term177141.getClass(), "frameId", 0);
        setIntField(term177141, term177141.getClass(), "characterId", 0);
        setIntField(term177141, term177141.getClass(), "trophyId", 0);
        setIntField(term177141, term177141.getClass(), "playedTutorialBit", 0);
        setIntField(term177141, term177141.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177141, term177141.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177141, term177141.getClass(), "totalRepertoireCount", 0);
        setIntField(term177141, term177141.getClass(), "totalMapNum", 0);
        setLongField(term177141, term177141.getClass(), "totalHiScore", 0L);
        setLongField(term177141, term177141.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177141, term177141.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177141, term177141.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177141, term177141.getClass(), "totalMasterHighScore", 0L);
        setField(term177141, term177141.getClass(), "eventWatchedDate", null);
        setIntField(term177141, term177141.getClass(), "friendCount", 0);
        setBooleanField(term177141, term177141.getClass(), "isMaimai", false);
        setField(term177141, term177141.getClass(), "firstGameId", null);
        setField(term177141, term177141.getClass(), "firstRomVersion", null);
        setField(term177141, term177141.getClass(), "firstDataVersion", null);
        setField(term177141, term177141.getClass(), "firstPlayDate", null);
        setField(term177141, term177141.getClass(), "lastGameId", null);
        setField(term177141, term177141.getClass(), "lastRomVersion", null);
        setField(term177141, term177141.getClass(), "lastDataVersion", null);
        setField(term177141, term177141.getClass(), "lastPlayDate", null);
        setIntField(term177141, term177141.getClass(), "lastPlaceId", 0);
        setField(term177141, term177141.getClass(), "lastPlaceName", null);
        setField(term177141, term177141.getClass(), "lastRegionId", null);
        setField(term177141, term177141.getClass(), "lastRegionName", null);
        setField(term177141, term177141.getClass(), "lastAllNetId", null);
        setField(term177141, term177141.getClass(), "lastClientId", null);
        term177173 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177173;
        callMethod(klass, "setTotalHiScore", argTypes, term177141, args);
    }

};


