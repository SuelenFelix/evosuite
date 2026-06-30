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

public class UserData_setPoint_1622164929165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176495;
     Object term176527;

    public UserData_setPoint_1622164929165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176495 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176495, term176495.getClass(), "id", 0L);
        setField(term176495, term176495.getClass(), "card", null);
        setField(term176495, term176495.getClass(), "userName", null);
        setField(term176495, term176495.getClass(), "lastLoginDate", null);
        setBooleanField(term176495, term176495.getClass(), "isWebJoin", false);
        setField(term176495, term176495.getClass(), "webLimitDate", null);
        setIntField(term176495, term176495.getClass(), "level", 0);
        setIntField(term176495, term176495.getClass(), "reincarnationNum", 0);
        setField(term176495, term176495.getClass(), "exp", null);
        setLongField(term176495, term176495.getClass(), "point", 0L);
        setLongField(term176495, term176495.getClass(), "totalPoint", 0L);
        setIntField(term176495, term176495.getClass(), "playCount", 0);
        setIntField(term176495, term176495.getClass(), "multiPlayCount", 0);
        setIntField(term176495, term176495.getClass(), "multiWinCount", 0);
        setIntField(term176495, term176495.getClass(), "requestResCount", 0);
        setIntField(term176495, term176495.getClass(), "acceptResCount", 0);
        setIntField(term176495, term176495.getClass(), "successResCount", 0);
        setIntField(term176495, term176495.getClass(), "playerRating", 0);
        setIntField(term176495, term176495.getClass(), "highestRating", 0);
        setIntField(term176495, term176495.getClass(), "nameplateId", 0);
        setIntField(term176495, term176495.getClass(), "frameId", 0);
        setIntField(term176495, term176495.getClass(), "characterId", 0);
        setIntField(term176495, term176495.getClass(), "trophyId", 0);
        setIntField(term176495, term176495.getClass(), "playedTutorialBit", 0);
        setIntField(term176495, term176495.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176495, term176495.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176495, term176495.getClass(), "totalRepertoireCount", 0);
        setIntField(term176495, term176495.getClass(), "totalMapNum", 0);
        setLongField(term176495, term176495.getClass(), "totalHiScore", 0L);
        setLongField(term176495, term176495.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176495, term176495.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176495, term176495.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176495, term176495.getClass(), "totalMasterHighScore", 0L);
        setField(term176495, term176495.getClass(), "eventWatchedDate", null);
        setIntField(term176495, term176495.getClass(), "friendCount", 0);
        setBooleanField(term176495, term176495.getClass(), "isMaimai", false);
        setField(term176495, term176495.getClass(), "firstGameId", null);
        setField(term176495, term176495.getClass(), "firstRomVersion", null);
        setField(term176495, term176495.getClass(), "firstDataVersion", null);
        setField(term176495, term176495.getClass(), "firstPlayDate", null);
        setField(term176495, term176495.getClass(), "lastGameId", null);
        setField(term176495, term176495.getClass(), "lastRomVersion", null);
        setField(term176495, term176495.getClass(), "lastDataVersion", null);
        setField(term176495, term176495.getClass(), "lastPlayDate", null);
        setIntField(term176495, term176495.getClass(), "lastPlaceId", 0);
        setField(term176495, term176495.getClass(), "lastPlaceName", null);
        setField(term176495, term176495.getClass(), "lastRegionId", null);
        setField(term176495, term176495.getClass(), "lastRegionName", null);
        setField(term176495, term176495.getClass(), "lastAllNetId", null);
        setField(term176495, term176495.getClass(), "lastClientId", null);
        term176527 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term176527;
        callMethod(klass, "setPoint", argTypes, term176495, args);
    }

};


