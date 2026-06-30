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

public class UserData_setPlayedTutorialBit_81221835179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176971;
     Object term177003;

    public UserData_setPlayedTutorialBit_81221835179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176971, term176971.getClass(), "id", 0L);
        setField(term176971, term176971.getClass(), "card", null);
        setField(term176971, term176971.getClass(), "userName", null);
        setField(term176971, term176971.getClass(), "lastLoginDate", null);
        setBooleanField(term176971, term176971.getClass(), "isWebJoin", false);
        setField(term176971, term176971.getClass(), "webLimitDate", null);
        setIntField(term176971, term176971.getClass(), "level", 0);
        setIntField(term176971, term176971.getClass(), "reincarnationNum", 0);
        setField(term176971, term176971.getClass(), "exp", null);
        setLongField(term176971, term176971.getClass(), "point", 0L);
        setLongField(term176971, term176971.getClass(), "totalPoint", 0L);
        setIntField(term176971, term176971.getClass(), "playCount", 0);
        setIntField(term176971, term176971.getClass(), "multiPlayCount", 0);
        setIntField(term176971, term176971.getClass(), "multiWinCount", 0);
        setIntField(term176971, term176971.getClass(), "requestResCount", 0);
        setIntField(term176971, term176971.getClass(), "acceptResCount", 0);
        setIntField(term176971, term176971.getClass(), "successResCount", 0);
        setIntField(term176971, term176971.getClass(), "playerRating", 0);
        setIntField(term176971, term176971.getClass(), "highestRating", 0);
        setIntField(term176971, term176971.getClass(), "nameplateId", 0);
        setIntField(term176971, term176971.getClass(), "frameId", 0);
        setIntField(term176971, term176971.getClass(), "characterId", 0);
        setIntField(term176971, term176971.getClass(), "trophyId", 0);
        setIntField(term176971, term176971.getClass(), "playedTutorialBit", 0);
        setIntField(term176971, term176971.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176971, term176971.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176971, term176971.getClass(), "totalRepertoireCount", 0);
        setIntField(term176971, term176971.getClass(), "totalMapNum", 0);
        setLongField(term176971, term176971.getClass(), "totalHiScore", 0L);
        setLongField(term176971, term176971.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176971, term176971.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176971, term176971.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176971, term176971.getClass(), "totalMasterHighScore", 0L);
        setField(term176971, term176971.getClass(), "eventWatchedDate", null);
        setIntField(term176971, term176971.getClass(), "friendCount", 0);
        setBooleanField(term176971, term176971.getClass(), "isMaimai", false);
        setField(term176971, term176971.getClass(), "firstGameId", null);
        setField(term176971, term176971.getClass(), "firstRomVersion", null);
        setField(term176971, term176971.getClass(), "firstDataVersion", null);
        setField(term176971, term176971.getClass(), "firstPlayDate", null);
        setField(term176971, term176971.getClass(), "lastGameId", null);
        setField(term176971, term176971.getClass(), "lastRomVersion", null);
        setField(term176971, term176971.getClass(), "lastDataVersion", null);
        setField(term176971, term176971.getClass(), "lastPlayDate", null);
        setIntField(term176971, term176971.getClass(), "lastPlaceId", 0);
        setField(term176971, term176971.getClass(), "lastPlaceName", null);
        setField(term176971, term176971.getClass(), "lastRegionId", null);
        setField(term176971, term176971.getClass(), "lastRegionName", null);
        setField(term176971, term176971.getClass(), "lastAllNetId", null);
        setField(term176971, term176971.getClass(), "lastClientId", null);
        term177003 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177003;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term176971, args);
    }

};


