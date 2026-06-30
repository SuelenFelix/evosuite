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

public class UserData_setAcceptResCount_692907062171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176699;
     Object term176731;

    public UserData_setAcceptResCount_692907062171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176699 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176699, term176699.getClass(), "id", 0L);
        setField(term176699, term176699.getClass(), "card", null);
        setField(term176699, term176699.getClass(), "userName", null);
        setField(term176699, term176699.getClass(), "lastLoginDate", null);
        setBooleanField(term176699, term176699.getClass(), "isWebJoin", false);
        setField(term176699, term176699.getClass(), "webLimitDate", null);
        setIntField(term176699, term176699.getClass(), "level", 0);
        setIntField(term176699, term176699.getClass(), "reincarnationNum", 0);
        setField(term176699, term176699.getClass(), "exp", null);
        setLongField(term176699, term176699.getClass(), "point", 0L);
        setLongField(term176699, term176699.getClass(), "totalPoint", 0L);
        setIntField(term176699, term176699.getClass(), "playCount", 0);
        setIntField(term176699, term176699.getClass(), "multiPlayCount", 0);
        setIntField(term176699, term176699.getClass(), "multiWinCount", 0);
        setIntField(term176699, term176699.getClass(), "requestResCount", 0);
        setIntField(term176699, term176699.getClass(), "acceptResCount", 0);
        setIntField(term176699, term176699.getClass(), "successResCount", 0);
        setIntField(term176699, term176699.getClass(), "playerRating", 0);
        setIntField(term176699, term176699.getClass(), "highestRating", 0);
        setIntField(term176699, term176699.getClass(), "nameplateId", 0);
        setIntField(term176699, term176699.getClass(), "frameId", 0);
        setIntField(term176699, term176699.getClass(), "characterId", 0);
        setIntField(term176699, term176699.getClass(), "trophyId", 0);
        setIntField(term176699, term176699.getClass(), "playedTutorialBit", 0);
        setIntField(term176699, term176699.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176699, term176699.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176699, term176699.getClass(), "totalRepertoireCount", 0);
        setIntField(term176699, term176699.getClass(), "totalMapNum", 0);
        setLongField(term176699, term176699.getClass(), "totalHiScore", 0L);
        setLongField(term176699, term176699.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176699, term176699.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176699, term176699.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176699, term176699.getClass(), "totalMasterHighScore", 0L);
        setField(term176699, term176699.getClass(), "eventWatchedDate", null);
        setIntField(term176699, term176699.getClass(), "friendCount", 0);
        setBooleanField(term176699, term176699.getClass(), "isMaimai", false);
        setField(term176699, term176699.getClass(), "firstGameId", null);
        setField(term176699, term176699.getClass(), "firstRomVersion", null);
        setField(term176699, term176699.getClass(), "firstDataVersion", null);
        setField(term176699, term176699.getClass(), "firstPlayDate", null);
        setField(term176699, term176699.getClass(), "lastGameId", null);
        setField(term176699, term176699.getClass(), "lastRomVersion", null);
        setField(term176699, term176699.getClass(), "lastDataVersion", null);
        setField(term176699, term176699.getClass(), "lastPlayDate", null);
        setIntField(term176699, term176699.getClass(), "lastPlaceId", 0);
        setField(term176699, term176699.getClass(), "lastPlaceName", null);
        setField(term176699, term176699.getClass(), "lastRegionId", null);
        setField(term176699, term176699.getClass(), "lastRegionName", null);
        setField(term176699, term176699.getClass(), "lastAllNetId", null);
        setField(term176699, term176699.getClass(), "lastClientId", null);
        term176731 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176731;
        callMethod(klass, "setAcceptResCount", argTypes, term176699, args);
    }

};


