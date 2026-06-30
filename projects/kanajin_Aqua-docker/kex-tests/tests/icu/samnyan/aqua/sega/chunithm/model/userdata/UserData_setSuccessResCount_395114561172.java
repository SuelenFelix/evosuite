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

public class UserData_setSuccessResCount_395114561172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176733;
     Object term176765;

    public UserData_setSuccessResCount_395114561172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176733 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176733, term176733.getClass(), "id", 0L);
        setField(term176733, term176733.getClass(), "card", null);
        setField(term176733, term176733.getClass(), "userName", null);
        setField(term176733, term176733.getClass(), "lastLoginDate", null);
        setBooleanField(term176733, term176733.getClass(), "isWebJoin", false);
        setField(term176733, term176733.getClass(), "webLimitDate", null);
        setIntField(term176733, term176733.getClass(), "level", 0);
        setIntField(term176733, term176733.getClass(), "reincarnationNum", 0);
        setField(term176733, term176733.getClass(), "exp", null);
        setLongField(term176733, term176733.getClass(), "point", 0L);
        setLongField(term176733, term176733.getClass(), "totalPoint", 0L);
        setIntField(term176733, term176733.getClass(), "playCount", 0);
        setIntField(term176733, term176733.getClass(), "multiPlayCount", 0);
        setIntField(term176733, term176733.getClass(), "multiWinCount", 0);
        setIntField(term176733, term176733.getClass(), "requestResCount", 0);
        setIntField(term176733, term176733.getClass(), "acceptResCount", 0);
        setIntField(term176733, term176733.getClass(), "successResCount", 0);
        setIntField(term176733, term176733.getClass(), "playerRating", 0);
        setIntField(term176733, term176733.getClass(), "highestRating", 0);
        setIntField(term176733, term176733.getClass(), "nameplateId", 0);
        setIntField(term176733, term176733.getClass(), "frameId", 0);
        setIntField(term176733, term176733.getClass(), "characterId", 0);
        setIntField(term176733, term176733.getClass(), "trophyId", 0);
        setIntField(term176733, term176733.getClass(), "playedTutorialBit", 0);
        setIntField(term176733, term176733.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176733, term176733.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176733, term176733.getClass(), "totalRepertoireCount", 0);
        setIntField(term176733, term176733.getClass(), "totalMapNum", 0);
        setLongField(term176733, term176733.getClass(), "totalHiScore", 0L);
        setLongField(term176733, term176733.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176733, term176733.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176733, term176733.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176733, term176733.getClass(), "totalMasterHighScore", 0L);
        setField(term176733, term176733.getClass(), "eventWatchedDate", null);
        setIntField(term176733, term176733.getClass(), "friendCount", 0);
        setBooleanField(term176733, term176733.getClass(), "isMaimai", false);
        setField(term176733, term176733.getClass(), "firstGameId", null);
        setField(term176733, term176733.getClass(), "firstRomVersion", null);
        setField(term176733, term176733.getClass(), "firstDataVersion", null);
        setField(term176733, term176733.getClass(), "firstPlayDate", null);
        setField(term176733, term176733.getClass(), "lastGameId", null);
        setField(term176733, term176733.getClass(), "lastRomVersion", null);
        setField(term176733, term176733.getClass(), "lastDataVersion", null);
        setField(term176733, term176733.getClass(), "lastPlayDate", null);
        setIntField(term176733, term176733.getClass(), "lastPlaceId", 0);
        setField(term176733, term176733.getClass(), "lastPlaceName", null);
        setField(term176733, term176733.getClass(), "lastRegionId", null);
        setField(term176733, term176733.getClass(), "lastRegionName", null);
        setField(term176733, term176733.getClass(), "lastAllNetId", null);
        setField(term176733, term176733.getClass(), "lastClientId", null);
        term176765 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176765;
        callMethod(klass, "setSuccessResCount", argTypes, term176733, args);
    }

};


