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

public class ExternalUserData_setTotalMapNum_465861081179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44132;
     Object term44163;

    public ExternalUserData_setTotalMapNum_465861081179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44132 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44132, term44132.getClass(), "accessCode", null);
        setField(term44132, term44132.getClass(), "userName", null);
        setField(term44132, term44132.getClass(), "lastLoginDate", null);
        setBooleanField(term44132, term44132.getClass(), "isWebJoin", false);
        setField(term44132, term44132.getClass(), "webLimitDate", null);
        setIntField(term44132, term44132.getClass(), "level", 0);
        setIntField(term44132, term44132.getClass(), "reincarnationNum", 0);
        setField(term44132, term44132.getClass(), "exp", null);
        setLongField(term44132, term44132.getClass(), "point", 0L);
        setLongField(term44132, term44132.getClass(), "totalPoint", 0L);
        setIntField(term44132, term44132.getClass(), "playCount", 0);
        setIntField(term44132, term44132.getClass(), "multiPlayCount", 0);
        setIntField(term44132, term44132.getClass(), "multiWinCount", 0);
        setIntField(term44132, term44132.getClass(), "requestResCount", 0);
        setIntField(term44132, term44132.getClass(), "acceptResCount", 0);
        setIntField(term44132, term44132.getClass(), "successResCount", 0);
        setIntField(term44132, term44132.getClass(), "playerRating", 0);
        setIntField(term44132, term44132.getClass(), "highestRating", 0);
        setIntField(term44132, term44132.getClass(), "nameplateId", 0);
        setIntField(term44132, term44132.getClass(), "frameId", 0);
        setIntField(term44132, term44132.getClass(), "characterId", 0);
        setIntField(term44132, term44132.getClass(), "trophyId", 0);
        setIntField(term44132, term44132.getClass(), "playedTutorialBit", 0);
        setIntField(term44132, term44132.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44132, term44132.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44132, term44132.getClass(), "totalRepertoireCount", 0);
        setIntField(term44132, term44132.getClass(), "totalMapNum", 0);
        setLongField(term44132, term44132.getClass(), "totalHiScore", 0L);
        setLongField(term44132, term44132.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44132, term44132.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44132, term44132.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44132, term44132.getClass(), "totalMasterHighScore", 0L);
        setField(term44132, term44132.getClass(), "eventWatchedDate", null);
        setIntField(term44132, term44132.getClass(), "friendCount", 0);
        setBooleanField(term44132, term44132.getClass(), "isMaimai", false);
        setField(term44132, term44132.getClass(), "firstGameId", null);
        setField(term44132, term44132.getClass(), "firstRomVersion", null);
        setField(term44132, term44132.getClass(), "firstDataVersion", null);
        setField(term44132, term44132.getClass(), "firstPlayDate", null);
        setField(term44132, term44132.getClass(), "lastGameId", null);
        setField(term44132, term44132.getClass(), "lastRomVersion", null);
        setField(term44132, term44132.getClass(), "lastDataVersion", null);
        setField(term44132, term44132.getClass(), "lastPlayDate", null);
        setIntField(term44132, term44132.getClass(), "lastPlaceId", 0);
        setField(term44132, term44132.getClass(), "lastPlaceName", null);
        setField(term44132, term44132.getClass(), "lastRegionId", null);
        setField(term44132, term44132.getClass(), "lastRegionName", null);
        setField(term44132, term44132.getClass(), "lastAllNetId", null);
        setField(term44132, term44132.getClass(), "lastClientId", null);
        term44163 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44163;
        callMethod(klass, "setTotalMapNum", argTypes, term44132, args);
    }

};


