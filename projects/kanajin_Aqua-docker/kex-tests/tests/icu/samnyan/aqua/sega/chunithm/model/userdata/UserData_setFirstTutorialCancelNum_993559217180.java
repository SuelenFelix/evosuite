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
import java.lang.Integer;

public class UserData_setFirstTutorialCancelNum_993559217180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177005;
     Object term177037;

    public UserData_setFirstTutorialCancelNum_993559217180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177005 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177005, term177005.getClass(), "id", 0L);
        setField(term177005, term177005.getClass(), "card", null);
        setField(term177005, term177005.getClass(), "userName", null);
        setField(term177005, term177005.getClass(), "lastLoginDate", null);
        setBooleanField(term177005, term177005.getClass(), "isWebJoin", false);
        setField(term177005, term177005.getClass(), "webLimitDate", null);
        setIntField(term177005, term177005.getClass(), "level", 0);
        setIntField(term177005, term177005.getClass(), "reincarnationNum", 0);
        setField(term177005, term177005.getClass(), "exp", null);
        setLongField(term177005, term177005.getClass(), "point", 0L);
        setLongField(term177005, term177005.getClass(), "totalPoint", 0L);
        setIntField(term177005, term177005.getClass(), "playCount", 0);
        setIntField(term177005, term177005.getClass(), "multiPlayCount", 0);
        setIntField(term177005, term177005.getClass(), "multiWinCount", 0);
        setIntField(term177005, term177005.getClass(), "requestResCount", 0);
        setIntField(term177005, term177005.getClass(), "acceptResCount", 0);
        setIntField(term177005, term177005.getClass(), "successResCount", 0);
        setIntField(term177005, term177005.getClass(), "playerRating", 0);
        setIntField(term177005, term177005.getClass(), "highestRating", 0);
        setIntField(term177005, term177005.getClass(), "nameplateId", 0);
        setIntField(term177005, term177005.getClass(), "frameId", 0);
        setIntField(term177005, term177005.getClass(), "characterId", 0);
        setIntField(term177005, term177005.getClass(), "trophyId", 0);
        setIntField(term177005, term177005.getClass(), "playedTutorialBit", 0);
        setIntField(term177005, term177005.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177005, term177005.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177005, term177005.getClass(), "totalRepertoireCount", 0);
        setIntField(term177005, term177005.getClass(), "totalMapNum", 0);
        setLongField(term177005, term177005.getClass(), "totalHiScore", 0L);
        setLongField(term177005, term177005.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177005, term177005.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177005, term177005.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177005, term177005.getClass(), "totalMasterHighScore", 0L);
        setField(term177005, term177005.getClass(), "eventWatchedDate", null);
        setIntField(term177005, term177005.getClass(), "friendCount", 0);
        setBooleanField(term177005, term177005.getClass(), "isMaimai", false);
        setField(term177005, term177005.getClass(), "firstGameId", null);
        setField(term177005, term177005.getClass(), "firstRomVersion", null);
        setField(term177005, term177005.getClass(), "firstDataVersion", null);
        setField(term177005, term177005.getClass(), "firstPlayDate", null);
        setField(term177005, term177005.getClass(), "lastGameId", null);
        setField(term177005, term177005.getClass(), "lastRomVersion", null);
        setField(term177005, term177005.getClass(), "lastDataVersion", null);
        setField(term177005, term177005.getClass(), "lastPlayDate", null);
        setIntField(term177005, term177005.getClass(), "lastPlaceId", 0);
        setField(term177005, term177005.getClass(), "lastPlaceName", null);
        setField(term177005, term177005.getClass(), "lastRegionId", null);
        setField(term177005, term177005.getClass(), "lastRegionName", null);
        setField(term177005, term177005.getClass(), "lastAllNetId", null);
        setField(term177005, term177005.getClass(), "lastClientId", null);
        term177037 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177037;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term177005, args);
    }

};


