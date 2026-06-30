package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setNameplateId_2122433662171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43868;
     Object term43899;

    public ExternalUserData_setNameplateId_2122433662171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43868 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43868, term43868.getClass(), "accessCode", null);
        setField(term43868, term43868.getClass(), "userName", null);
        setField(term43868, term43868.getClass(), "lastLoginDate", null);
        setBooleanField(term43868, term43868.getClass(), "isWebJoin", false);
        setField(term43868, term43868.getClass(), "webLimitDate", null);
        setIntField(term43868, term43868.getClass(), "level", 0);
        setIntField(term43868, term43868.getClass(), "reincarnationNum", 0);
        setField(term43868, term43868.getClass(), "exp", null);
        setLongField(term43868, term43868.getClass(), "point", 0L);
        setLongField(term43868, term43868.getClass(), "totalPoint", 0L);
        setIntField(term43868, term43868.getClass(), "playCount", 0);
        setIntField(term43868, term43868.getClass(), "multiPlayCount", 0);
        setIntField(term43868, term43868.getClass(), "multiWinCount", 0);
        setIntField(term43868, term43868.getClass(), "requestResCount", 0);
        setIntField(term43868, term43868.getClass(), "acceptResCount", 0);
        setIntField(term43868, term43868.getClass(), "successResCount", 0);
        setIntField(term43868, term43868.getClass(), "playerRating", 0);
        setIntField(term43868, term43868.getClass(), "highestRating", 0);
        setIntField(term43868, term43868.getClass(), "nameplateId", 0);
        setIntField(term43868, term43868.getClass(), "frameId", 0);
        setIntField(term43868, term43868.getClass(), "characterId", 0);
        setIntField(term43868, term43868.getClass(), "trophyId", 0);
        setIntField(term43868, term43868.getClass(), "playedTutorialBit", 0);
        setIntField(term43868, term43868.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43868, term43868.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43868, term43868.getClass(), "totalRepertoireCount", 0);
        setIntField(term43868, term43868.getClass(), "totalMapNum", 0);
        setLongField(term43868, term43868.getClass(), "totalHiScore", 0L);
        setLongField(term43868, term43868.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43868, term43868.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43868, term43868.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43868, term43868.getClass(), "totalMasterHighScore", 0L);
        setField(term43868, term43868.getClass(), "eventWatchedDate", null);
        setIntField(term43868, term43868.getClass(), "friendCount", 0);
        setBooleanField(term43868, term43868.getClass(), "isMaimai", false);
        setField(term43868, term43868.getClass(), "firstGameId", null);
        setField(term43868, term43868.getClass(), "firstRomVersion", null);
        setField(term43868, term43868.getClass(), "firstDataVersion", null);
        setField(term43868, term43868.getClass(), "firstPlayDate", null);
        setField(term43868, term43868.getClass(), "lastGameId", null);
        setField(term43868, term43868.getClass(), "lastRomVersion", null);
        setField(term43868, term43868.getClass(), "lastDataVersion", null);
        setField(term43868, term43868.getClass(), "lastPlayDate", null);
        setIntField(term43868, term43868.getClass(), "lastPlaceId", 0);
        setField(term43868, term43868.getClass(), "lastPlaceName", null);
        setField(term43868, term43868.getClass(), "lastRegionId", null);
        setField(term43868, term43868.getClass(), "lastRegionName", null);
        setField(term43868, term43868.getClass(), "lastAllNetId", null);
        setField(term43868, term43868.getClass(), "lastClientId", null);
        term43899 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43899;
        callMethod(klass, "setNameplateId", argTypes, term43868, args);
    }

};


