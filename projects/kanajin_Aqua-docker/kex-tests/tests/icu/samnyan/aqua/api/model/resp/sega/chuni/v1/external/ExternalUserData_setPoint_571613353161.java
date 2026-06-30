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
import java.lang.Long;

public class ExternalUserData_setPoint_571613353161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43538;
     Object term43569;

    public ExternalUserData_setPoint_571613353161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43538 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43538, term43538.getClass(), "accessCode", null);
        setField(term43538, term43538.getClass(), "userName", null);
        setField(term43538, term43538.getClass(), "lastLoginDate", null);
        setBooleanField(term43538, term43538.getClass(), "isWebJoin", false);
        setField(term43538, term43538.getClass(), "webLimitDate", null);
        setIntField(term43538, term43538.getClass(), "level", 0);
        setIntField(term43538, term43538.getClass(), "reincarnationNum", 0);
        setField(term43538, term43538.getClass(), "exp", null);
        setLongField(term43538, term43538.getClass(), "point", 0L);
        setLongField(term43538, term43538.getClass(), "totalPoint", 0L);
        setIntField(term43538, term43538.getClass(), "playCount", 0);
        setIntField(term43538, term43538.getClass(), "multiPlayCount", 0);
        setIntField(term43538, term43538.getClass(), "multiWinCount", 0);
        setIntField(term43538, term43538.getClass(), "requestResCount", 0);
        setIntField(term43538, term43538.getClass(), "acceptResCount", 0);
        setIntField(term43538, term43538.getClass(), "successResCount", 0);
        setIntField(term43538, term43538.getClass(), "playerRating", 0);
        setIntField(term43538, term43538.getClass(), "highestRating", 0);
        setIntField(term43538, term43538.getClass(), "nameplateId", 0);
        setIntField(term43538, term43538.getClass(), "frameId", 0);
        setIntField(term43538, term43538.getClass(), "characterId", 0);
        setIntField(term43538, term43538.getClass(), "trophyId", 0);
        setIntField(term43538, term43538.getClass(), "playedTutorialBit", 0);
        setIntField(term43538, term43538.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43538, term43538.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43538, term43538.getClass(), "totalRepertoireCount", 0);
        setIntField(term43538, term43538.getClass(), "totalMapNum", 0);
        setLongField(term43538, term43538.getClass(), "totalHiScore", 0L);
        setLongField(term43538, term43538.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43538, term43538.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43538, term43538.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43538, term43538.getClass(), "totalMasterHighScore", 0L);
        setField(term43538, term43538.getClass(), "eventWatchedDate", null);
        setIntField(term43538, term43538.getClass(), "friendCount", 0);
        setBooleanField(term43538, term43538.getClass(), "isMaimai", false);
        setField(term43538, term43538.getClass(), "firstGameId", null);
        setField(term43538, term43538.getClass(), "firstRomVersion", null);
        setField(term43538, term43538.getClass(), "firstDataVersion", null);
        setField(term43538, term43538.getClass(), "firstPlayDate", null);
        setField(term43538, term43538.getClass(), "lastGameId", null);
        setField(term43538, term43538.getClass(), "lastRomVersion", null);
        setField(term43538, term43538.getClass(), "lastDataVersion", null);
        setField(term43538, term43538.getClass(), "lastPlayDate", null);
        setIntField(term43538, term43538.getClass(), "lastPlaceId", 0);
        setField(term43538, term43538.getClass(), "lastPlaceName", null);
        setField(term43538, term43538.getClass(), "lastRegionId", null);
        setField(term43538, term43538.getClass(), "lastRegionName", null);
        setField(term43538, term43538.getClass(), "lastAllNetId", null);
        setField(term43538, term43538.getClass(), "lastClientId", null);
        term43569 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term43569;
        callMethod(klass, "setPoint", argTypes, term43538, args);
    }

};


