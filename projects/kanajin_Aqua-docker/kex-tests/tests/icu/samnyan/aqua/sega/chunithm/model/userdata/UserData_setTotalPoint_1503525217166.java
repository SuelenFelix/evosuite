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

public class UserData_setTotalPoint_1503525217166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176529;
     Object term176561;

    public UserData_setTotalPoint_1503525217166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176529 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176529, term176529.getClass(), "id", 0L);
        setField(term176529, term176529.getClass(), "card", null);
        setField(term176529, term176529.getClass(), "userName", null);
        setField(term176529, term176529.getClass(), "lastLoginDate", null);
        setBooleanField(term176529, term176529.getClass(), "isWebJoin", false);
        setField(term176529, term176529.getClass(), "webLimitDate", null);
        setIntField(term176529, term176529.getClass(), "level", 0);
        setIntField(term176529, term176529.getClass(), "reincarnationNum", 0);
        setField(term176529, term176529.getClass(), "exp", null);
        setLongField(term176529, term176529.getClass(), "point", 0L);
        setLongField(term176529, term176529.getClass(), "totalPoint", 0L);
        setIntField(term176529, term176529.getClass(), "playCount", 0);
        setIntField(term176529, term176529.getClass(), "multiPlayCount", 0);
        setIntField(term176529, term176529.getClass(), "multiWinCount", 0);
        setIntField(term176529, term176529.getClass(), "requestResCount", 0);
        setIntField(term176529, term176529.getClass(), "acceptResCount", 0);
        setIntField(term176529, term176529.getClass(), "successResCount", 0);
        setIntField(term176529, term176529.getClass(), "playerRating", 0);
        setIntField(term176529, term176529.getClass(), "highestRating", 0);
        setIntField(term176529, term176529.getClass(), "nameplateId", 0);
        setIntField(term176529, term176529.getClass(), "frameId", 0);
        setIntField(term176529, term176529.getClass(), "characterId", 0);
        setIntField(term176529, term176529.getClass(), "trophyId", 0);
        setIntField(term176529, term176529.getClass(), "playedTutorialBit", 0);
        setIntField(term176529, term176529.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176529, term176529.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176529, term176529.getClass(), "totalRepertoireCount", 0);
        setIntField(term176529, term176529.getClass(), "totalMapNum", 0);
        setLongField(term176529, term176529.getClass(), "totalHiScore", 0L);
        setLongField(term176529, term176529.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176529, term176529.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176529, term176529.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176529, term176529.getClass(), "totalMasterHighScore", 0L);
        setField(term176529, term176529.getClass(), "eventWatchedDate", null);
        setIntField(term176529, term176529.getClass(), "friendCount", 0);
        setBooleanField(term176529, term176529.getClass(), "isMaimai", false);
        setField(term176529, term176529.getClass(), "firstGameId", null);
        setField(term176529, term176529.getClass(), "firstRomVersion", null);
        setField(term176529, term176529.getClass(), "firstDataVersion", null);
        setField(term176529, term176529.getClass(), "firstPlayDate", null);
        setField(term176529, term176529.getClass(), "lastGameId", null);
        setField(term176529, term176529.getClass(), "lastRomVersion", null);
        setField(term176529, term176529.getClass(), "lastDataVersion", null);
        setField(term176529, term176529.getClass(), "lastPlayDate", null);
        setIntField(term176529, term176529.getClass(), "lastPlaceId", 0);
        setField(term176529, term176529.getClass(), "lastPlaceName", null);
        setField(term176529, term176529.getClass(), "lastRegionId", null);
        setField(term176529, term176529.getClass(), "lastRegionName", null);
        setField(term176529, term176529.getClass(), "lastAllNetId", null);
        setField(term176529, term176529.getClass(), "lastClientId", null);
        term176561 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term176561;
        callMethod(klass, "setTotalPoint", argTypes, term176529, args);
    }

};


