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

public class UserData_setMultiPlayCount_1830195349168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176597;
     Object term176629;

    public UserData_setMultiPlayCount_1830195349168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176597 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176597, term176597.getClass(), "id", 0L);
        setField(term176597, term176597.getClass(), "card", null);
        setField(term176597, term176597.getClass(), "userName", null);
        setField(term176597, term176597.getClass(), "lastLoginDate", null);
        setBooleanField(term176597, term176597.getClass(), "isWebJoin", false);
        setField(term176597, term176597.getClass(), "webLimitDate", null);
        setIntField(term176597, term176597.getClass(), "level", 0);
        setIntField(term176597, term176597.getClass(), "reincarnationNum", 0);
        setField(term176597, term176597.getClass(), "exp", null);
        setLongField(term176597, term176597.getClass(), "point", 0L);
        setLongField(term176597, term176597.getClass(), "totalPoint", 0L);
        setIntField(term176597, term176597.getClass(), "playCount", 0);
        setIntField(term176597, term176597.getClass(), "multiPlayCount", 0);
        setIntField(term176597, term176597.getClass(), "multiWinCount", 0);
        setIntField(term176597, term176597.getClass(), "requestResCount", 0);
        setIntField(term176597, term176597.getClass(), "acceptResCount", 0);
        setIntField(term176597, term176597.getClass(), "successResCount", 0);
        setIntField(term176597, term176597.getClass(), "playerRating", 0);
        setIntField(term176597, term176597.getClass(), "highestRating", 0);
        setIntField(term176597, term176597.getClass(), "nameplateId", 0);
        setIntField(term176597, term176597.getClass(), "frameId", 0);
        setIntField(term176597, term176597.getClass(), "characterId", 0);
        setIntField(term176597, term176597.getClass(), "trophyId", 0);
        setIntField(term176597, term176597.getClass(), "playedTutorialBit", 0);
        setIntField(term176597, term176597.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176597, term176597.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176597, term176597.getClass(), "totalRepertoireCount", 0);
        setIntField(term176597, term176597.getClass(), "totalMapNum", 0);
        setLongField(term176597, term176597.getClass(), "totalHiScore", 0L);
        setLongField(term176597, term176597.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176597, term176597.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176597, term176597.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176597, term176597.getClass(), "totalMasterHighScore", 0L);
        setField(term176597, term176597.getClass(), "eventWatchedDate", null);
        setIntField(term176597, term176597.getClass(), "friendCount", 0);
        setBooleanField(term176597, term176597.getClass(), "isMaimai", false);
        setField(term176597, term176597.getClass(), "firstGameId", null);
        setField(term176597, term176597.getClass(), "firstRomVersion", null);
        setField(term176597, term176597.getClass(), "firstDataVersion", null);
        setField(term176597, term176597.getClass(), "firstPlayDate", null);
        setField(term176597, term176597.getClass(), "lastGameId", null);
        setField(term176597, term176597.getClass(), "lastRomVersion", null);
        setField(term176597, term176597.getClass(), "lastDataVersion", null);
        setField(term176597, term176597.getClass(), "lastPlayDate", null);
        setIntField(term176597, term176597.getClass(), "lastPlaceId", 0);
        setField(term176597, term176597.getClass(), "lastPlaceName", null);
        setField(term176597, term176597.getClass(), "lastRegionId", null);
        setField(term176597, term176597.getClass(), "lastRegionName", null);
        setField(term176597, term176597.getClass(), "lastAllNetId", null);
        setField(term176597, term176597.getClass(), "lastClientId", null);
        term176629 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176629;
        callMethod(klass, "setMultiPlayCount", argTypes, term176597, args);
    }

};


