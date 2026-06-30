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

public class UserData_setTotalAdvancedHighScore_807661725186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177209;
     Object term177241;

    public UserData_setTotalAdvancedHighScore_807661725186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177209, term177209.getClass(), "id", 0L);
        setField(term177209, term177209.getClass(), "card", null);
        setField(term177209, term177209.getClass(), "userName", null);
        setField(term177209, term177209.getClass(), "lastLoginDate", null);
        setBooleanField(term177209, term177209.getClass(), "isWebJoin", false);
        setField(term177209, term177209.getClass(), "webLimitDate", null);
        setIntField(term177209, term177209.getClass(), "level", 0);
        setIntField(term177209, term177209.getClass(), "reincarnationNum", 0);
        setField(term177209, term177209.getClass(), "exp", null);
        setLongField(term177209, term177209.getClass(), "point", 0L);
        setLongField(term177209, term177209.getClass(), "totalPoint", 0L);
        setIntField(term177209, term177209.getClass(), "playCount", 0);
        setIntField(term177209, term177209.getClass(), "multiPlayCount", 0);
        setIntField(term177209, term177209.getClass(), "multiWinCount", 0);
        setIntField(term177209, term177209.getClass(), "requestResCount", 0);
        setIntField(term177209, term177209.getClass(), "acceptResCount", 0);
        setIntField(term177209, term177209.getClass(), "successResCount", 0);
        setIntField(term177209, term177209.getClass(), "playerRating", 0);
        setIntField(term177209, term177209.getClass(), "highestRating", 0);
        setIntField(term177209, term177209.getClass(), "nameplateId", 0);
        setIntField(term177209, term177209.getClass(), "frameId", 0);
        setIntField(term177209, term177209.getClass(), "characterId", 0);
        setIntField(term177209, term177209.getClass(), "trophyId", 0);
        setIntField(term177209, term177209.getClass(), "playedTutorialBit", 0);
        setIntField(term177209, term177209.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177209, term177209.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177209, term177209.getClass(), "totalRepertoireCount", 0);
        setIntField(term177209, term177209.getClass(), "totalMapNum", 0);
        setLongField(term177209, term177209.getClass(), "totalHiScore", 0L);
        setLongField(term177209, term177209.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177209, term177209.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177209, term177209.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177209, term177209.getClass(), "totalMasterHighScore", 0L);
        setField(term177209, term177209.getClass(), "eventWatchedDate", null);
        setIntField(term177209, term177209.getClass(), "friendCount", 0);
        setBooleanField(term177209, term177209.getClass(), "isMaimai", false);
        setField(term177209, term177209.getClass(), "firstGameId", null);
        setField(term177209, term177209.getClass(), "firstRomVersion", null);
        setField(term177209, term177209.getClass(), "firstDataVersion", null);
        setField(term177209, term177209.getClass(), "firstPlayDate", null);
        setField(term177209, term177209.getClass(), "lastGameId", null);
        setField(term177209, term177209.getClass(), "lastRomVersion", null);
        setField(term177209, term177209.getClass(), "lastDataVersion", null);
        setField(term177209, term177209.getClass(), "lastPlayDate", null);
        setIntField(term177209, term177209.getClass(), "lastPlaceId", 0);
        setField(term177209, term177209.getClass(), "lastPlaceName", null);
        setField(term177209, term177209.getClass(), "lastRegionId", null);
        setField(term177209, term177209.getClass(), "lastRegionName", null);
        setField(term177209, term177209.getClass(), "lastAllNetId", null);
        setField(term177209, term177209.getClass(), "lastClientId", null);
        term177241 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177241;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term177209, args);
    }

};


