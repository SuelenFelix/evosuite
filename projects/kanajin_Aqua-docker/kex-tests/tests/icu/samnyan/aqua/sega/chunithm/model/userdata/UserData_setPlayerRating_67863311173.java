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

public class UserData_setPlayerRating_67863311173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176767;
     Object term176799;

    public UserData_setPlayerRating_67863311173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176767 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176767, term176767.getClass(), "id", 0L);
        setField(term176767, term176767.getClass(), "card", null);
        setField(term176767, term176767.getClass(), "userName", null);
        setField(term176767, term176767.getClass(), "lastLoginDate", null);
        setBooleanField(term176767, term176767.getClass(), "isWebJoin", false);
        setField(term176767, term176767.getClass(), "webLimitDate", null);
        setIntField(term176767, term176767.getClass(), "level", 0);
        setIntField(term176767, term176767.getClass(), "reincarnationNum", 0);
        setField(term176767, term176767.getClass(), "exp", null);
        setLongField(term176767, term176767.getClass(), "point", 0L);
        setLongField(term176767, term176767.getClass(), "totalPoint", 0L);
        setIntField(term176767, term176767.getClass(), "playCount", 0);
        setIntField(term176767, term176767.getClass(), "multiPlayCount", 0);
        setIntField(term176767, term176767.getClass(), "multiWinCount", 0);
        setIntField(term176767, term176767.getClass(), "requestResCount", 0);
        setIntField(term176767, term176767.getClass(), "acceptResCount", 0);
        setIntField(term176767, term176767.getClass(), "successResCount", 0);
        setIntField(term176767, term176767.getClass(), "playerRating", 0);
        setIntField(term176767, term176767.getClass(), "highestRating", 0);
        setIntField(term176767, term176767.getClass(), "nameplateId", 0);
        setIntField(term176767, term176767.getClass(), "frameId", 0);
        setIntField(term176767, term176767.getClass(), "characterId", 0);
        setIntField(term176767, term176767.getClass(), "trophyId", 0);
        setIntField(term176767, term176767.getClass(), "playedTutorialBit", 0);
        setIntField(term176767, term176767.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176767, term176767.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176767, term176767.getClass(), "totalRepertoireCount", 0);
        setIntField(term176767, term176767.getClass(), "totalMapNum", 0);
        setLongField(term176767, term176767.getClass(), "totalHiScore", 0L);
        setLongField(term176767, term176767.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176767, term176767.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176767, term176767.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176767, term176767.getClass(), "totalMasterHighScore", 0L);
        setField(term176767, term176767.getClass(), "eventWatchedDate", null);
        setIntField(term176767, term176767.getClass(), "friendCount", 0);
        setBooleanField(term176767, term176767.getClass(), "isMaimai", false);
        setField(term176767, term176767.getClass(), "firstGameId", null);
        setField(term176767, term176767.getClass(), "firstRomVersion", null);
        setField(term176767, term176767.getClass(), "firstDataVersion", null);
        setField(term176767, term176767.getClass(), "firstPlayDate", null);
        setField(term176767, term176767.getClass(), "lastGameId", null);
        setField(term176767, term176767.getClass(), "lastRomVersion", null);
        setField(term176767, term176767.getClass(), "lastDataVersion", null);
        setField(term176767, term176767.getClass(), "lastPlayDate", null);
        setIntField(term176767, term176767.getClass(), "lastPlaceId", 0);
        setField(term176767, term176767.getClass(), "lastPlaceName", null);
        setField(term176767, term176767.getClass(), "lastRegionId", null);
        setField(term176767, term176767.getClass(), "lastRegionName", null);
        setField(term176767, term176767.getClass(), "lastAllNetId", null);
        setField(term176767, term176767.getClass(), "lastClientId", null);
        term176799 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176799;
        callMethod(klass, "setPlayerRating", argTypes, term176767, args);
    }

};


