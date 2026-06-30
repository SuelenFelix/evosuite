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

public class UserData_setTotalBasicHighScore_176420715185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177175;
     Object term177207;

    public UserData_setTotalBasicHighScore_176420715185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177175 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177175, term177175.getClass(), "id", 0L);
        setField(term177175, term177175.getClass(), "card", null);
        setField(term177175, term177175.getClass(), "userName", null);
        setField(term177175, term177175.getClass(), "lastLoginDate", null);
        setBooleanField(term177175, term177175.getClass(), "isWebJoin", false);
        setField(term177175, term177175.getClass(), "webLimitDate", null);
        setIntField(term177175, term177175.getClass(), "level", 0);
        setIntField(term177175, term177175.getClass(), "reincarnationNum", 0);
        setField(term177175, term177175.getClass(), "exp", null);
        setLongField(term177175, term177175.getClass(), "point", 0L);
        setLongField(term177175, term177175.getClass(), "totalPoint", 0L);
        setIntField(term177175, term177175.getClass(), "playCount", 0);
        setIntField(term177175, term177175.getClass(), "multiPlayCount", 0);
        setIntField(term177175, term177175.getClass(), "multiWinCount", 0);
        setIntField(term177175, term177175.getClass(), "requestResCount", 0);
        setIntField(term177175, term177175.getClass(), "acceptResCount", 0);
        setIntField(term177175, term177175.getClass(), "successResCount", 0);
        setIntField(term177175, term177175.getClass(), "playerRating", 0);
        setIntField(term177175, term177175.getClass(), "highestRating", 0);
        setIntField(term177175, term177175.getClass(), "nameplateId", 0);
        setIntField(term177175, term177175.getClass(), "frameId", 0);
        setIntField(term177175, term177175.getClass(), "characterId", 0);
        setIntField(term177175, term177175.getClass(), "trophyId", 0);
        setIntField(term177175, term177175.getClass(), "playedTutorialBit", 0);
        setIntField(term177175, term177175.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177175, term177175.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177175, term177175.getClass(), "totalRepertoireCount", 0);
        setIntField(term177175, term177175.getClass(), "totalMapNum", 0);
        setLongField(term177175, term177175.getClass(), "totalHiScore", 0L);
        setLongField(term177175, term177175.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177175, term177175.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177175, term177175.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177175, term177175.getClass(), "totalMasterHighScore", 0L);
        setField(term177175, term177175.getClass(), "eventWatchedDate", null);
        setIntField(term177175, term177175.getClass(), "friendCount", 0);
        setBooleanField(term177175, term177175.getClass(), "isMaimai", false);
        setField(term177175, term177175.getClass(), "firstGameId", null);
        setField(term177175, term177175.getClass(), "firstRomVersion", null);
        setField(term177175, term177175.getClass(), "firstDataVersion", null);
        setField(term177175, term177175.getClass(), "firstPlayDate", null);
        setField(term177175, term177175.getClass(), "lastGameId", null);
        setField(term177175, term177175.getClass(), "lastRomVersion", null);
        setField(term177175, term177175.getClass(), "lastDataVersion", null);
        setField(term177175, term177175.getClass(), "lastPlayDate", null);
        setIntField(term177175, term177175.getClass(), "lastPlaceId", 0);
        setField(term177175, term177175.getClass(), "lastPlaceName", null);
        setField(term177175, term177175.getClass(), "lastRegionId", null);
        setField(term177175, term177175.getClass(), "lastRegionName", null);
        setField(term177175, term177175.getClass(), "lastAllNetId", null);
        setField(term177175, term177175.getClass(), "lastClientId", null);
        term177207 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177207;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term177175, args);
    }

};


