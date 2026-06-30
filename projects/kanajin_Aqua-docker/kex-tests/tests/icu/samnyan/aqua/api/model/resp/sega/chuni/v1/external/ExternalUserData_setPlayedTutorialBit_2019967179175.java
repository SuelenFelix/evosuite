package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setPlayedTutorialBit_2019967179175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44000;
     Object term44031;

    public ExternalUserData_setPlayedTutorialBit_2019967179175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44000 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44000, term44000.getClass(), "accessCode", null);
        setField(term44000, term44000.getClass(), "userName", null);
        setField(term44000, term44000.getClass(), "lastLoginDate", null);
        setBooleanField(term44000, term44000.getClass(), "isWebJoin", false);
        setField(term44000, term44000.getClass(), "webLimitDate", null);
        setIntField(term44000, term44000.getClass(), "level", 0);
        setIntField(term44000, term44000.getClass(), "reincarnationNum", 0);
        setField(term44000, term44000.getClass(), "exp", null);
        setLongField(term44000, term44000.getClass(), "point", 0L);
        setLongField(term44000, term44000.getClass(), "totalPoint", 0L);
        setIntField(term44000, term44000.getClass(), "playCount", 0);
        setIntField(term44000, term44000.getClass(), "multiPlayCount", 0);
        setIntField(term44000, term44000.getClass(), "multiWinCount", 0);
        setIntField(term44000, term44000.getClass(), "requestResCount", 0);
        setIntField(term44000, term44000.getClass(), "acceptResCount", 0);
        setIntField(term44000, term44000.getClass(), "successResCount", 0);
        setIntField(term44000, term44000.getClass(), "playerRating", 0);
        setIntField(term44000, term44000.getClass(), "highestRating", 0);
        setIntField(term44000, term44000.getClass(), "nameplateId", 0);
        setIntField(term44000, term44000.getClass(), "frameId", 0);
        setIntField(term44000, term44000.getClass(), "characterId", 0);
        setIntField(term44000, term44000.getClass(), "trophyId", 0);
        setIntField(term44000, term44000.getClass(), "playedTutorialBit", 0);
        setIntField(term44000, term44000.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44000, term44000.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44000, term44000.getClass(), "totalRepertoireCount", 0);
        setIntField(term44000, term44000.getClass(), "totalMapNum", 0);
        setLongField(term44000, term44000.getClass(), "totalHiScore", 0L);
        setLongField(term44000, term44000.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44000, term44000.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44000, term44000.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44000, term44000.getClass(), "totalMasterHighScore", 0L);
        setField(term44000, term44000.getClass(), "eventWatchedDate", null);
        setIntField(term44000, term44000.getClass(), "friendCount", 0);
        setBooleanField(term44000, term44000.getClass(), "isMaimai", false);
        setField(term44000, term44000.getClass(), "firstGameId", null);
        setField(term44000, term44000.getClass(), "firstRomVersion", null);
        setField(term44000, term44000.getClass(), "firstDataVersion", null);
        setField(term44000, term44000.getClass(), "firstPlayDate", null);
        setField(term44000, term44000.getClass(), "lastGameId", null);
        setField(term44000, term44000.getClass(), "lastRomVersion", null);
        setField(term44000, term44000.getClass(), "lastDataVersion", null);
        setField(term44000, term44000.getClass(), "lastPlayDate", null);
        setIntField(term44000, term44000.getClass(), "lastPlaceId", 0);
        setField(term44000, term44000.getClass(), "lastPlaceName", null);
        setField(term44000, term44000.getClass(), "lastRegionId", null);
        setField(term44000, term44000.getClass(), "lastRegionName", null);
        setField(term44000, term44000.getClass(), "lastAllNetId", null);
        setField(term44000, term44000.getClass(), "lastClientId", null);
        term44031 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44031;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term44000, args);
    }

};


