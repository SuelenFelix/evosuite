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

public class ExternalUserData_setMultiPlayCount_525730210164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43637;
     Object term43668;

    public ExternalUserData_setMultiPlayCount_525730210164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43637 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43637, term43637.getClass(), "accessCode", null);
        setField(term43637, term43637.getClass(), "userName", null);
        setField(term43637, term43637.getClass(), "lastLoginDate", null);
        setBooleanField(term43637, term43637.getClass(), "isWebJoin", false);
        setField(term43637, term43637.getClass(), "webLimitDate", null);
        setIntField(term43637, term43637.getClass(), "level", 0);
        setIntField(term43637, term43637.getClass(), "reincarnationNum", 0);
        setField(term43637, term43637.getClass(), "exp", null);
        setLongField(term43637, term43637.getClass(), "point", 0L);
        setLongField(term43637, term43637.getClass(), "totalPoint", 0L);
        setIntField(term43637, term43637.getClass(), "playCount", 0);
        setIntField(term43637, term43637.getClass(), "multiPlayCount", 0);
        setIntField(term43637, term43637.getClass(), "multiWinCount", 0);
        setIntField(term43637, term43637.getClass(), "requestResCount", 0);
        setIntField(term43637, term43637.getClass(), "acceptResCount", 0);
        setIntField(term43637, term43637.getClass(), "successResCount", 0);
        setIntField(term43637, term43637.getClass(), "playerRating", 0);
        setIntField(term43637, term43637.getClass(), "highestRating", 0);
        setIntField(term43637, term43637.getClass(), "nameplateId", 0);
        setIntField(term43637, term43637.getClass(), "frameId", 0);
        setIntField(term43637, term43637.getClass(), "characterId", 0);
        setIntField(term43637, term43637.getClass(), "trophyId", 0);
        setIntField(term43637, term43637.getClass(), "playedTutorialBit", 0);
        setIntField(term43637, term43637.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43637, term43637.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43637, term43637.getClass(), "totalRepertoireCount", 0);
        setIntField(term43637, term43637.getClass(), "totalMapNum", 0);
        setLongField(term43637, term43637.getClass(), "totalHiScore", 0L);
        setLongField(term43637, term43637.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43637, term43637.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43637, term43637.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43637, term43637.getClass(), "totalMasterHighScore", 0L);
        setField(term43637, term43637.getClass(), "eventWatchedDate", null);
        setIntField(term43637, term43637.getClass(), "friendCount", 0);
        setBooleanField(term43637, term43637.getClass(), "isMaimai", false);
        setField(term43637, term43637.getClass(), "firstGameId", null);
        setField(term43637, term43637.getClass(), "firstRomVersion", null);
        setField(term43637, term43637.getClass(), "firstDataVersion", null);
        setField(term43637, term43637.getClass(), "firstPlayDate", null);
        setField(term43637, term43637.getClass(), "lastGameId", null);
        setField(term43637, term43637.getClass(), "lastRomVersion", null);
        setField(term43637, term43637.getClass(), "lastDataVersion", null);
        setField(term43637, term43637.getClass(), "lastPlayDate", null);
        setIntField(term43637, term43637.getClass(), "lastPlaceId", 0);
        setField(term43637, term43637.getClass(), "lastPlaceName", null);
        setField(term43637, term43637.getClass(), "lastRegionId", null);
        setField(term43637, term43637.getClass(), "lastRegionName", null);
        setField(term43637, term43637.getClass(), "lastAllNetId", null);
        setField(term43637, term43637.getClass(), "lastClientId", null);
        term43668 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43668;
        callMethod(klass, "setMultiPlayCount", argTypes, term43637, args);
    }

};


