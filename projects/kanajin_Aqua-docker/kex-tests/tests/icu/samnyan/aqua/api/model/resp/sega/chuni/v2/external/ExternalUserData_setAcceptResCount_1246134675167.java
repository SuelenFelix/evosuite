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

public class ExternalUserData_setAcceptResCount_1246134675167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43736;
     Object term43767;

    public ExternalUserData_setAcceptResCount_1246134675167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43736 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43736, term43736.getClass(), "accessCode", null);
        setField(term43736, term43736.getClass(), "userName", null);
        setField(term43736, term43736.getClass(), "lastLoginDate", null);
        setBooleanField(term43736, term43736.getClass(), "isWebJoin", false);
        setField(term43736, term43736.getClass(), "webLimitDate", null);
        setIntField(term43736, term43736.getClass(), "level", 0);
        setIntField(term43736, term43736.getClass(), "reincarnationNum", 0);
        setField(term43736, term43736.getClass(), "exp", null);
        setLongField(term43736, term43736.getClass(), "point", 0L);
        setLongField(term43736, term43736.getClass(), "totalPoint", 0L);
        setIntField(term43736, term43736.getClass(), "playCount", 0);
        setIntField(term43736, term43736.getClass(), "multiPlayCount", 0);
        setIntField(term43736, term43736.getClass(), "multiWinCount", 0);
        setIntField(term43736, term43736.getClass(), "requestResCount", 0);
        setIntField(term43736, term43736.getClass(), "acceptResCount", 0);
        setIntField(term43736, term43736.getClass(), "successResCount", 0);
        setIntField(term43736, term43736.getClass(), "playerRating", 0);
        setIntField(term43736, term43736.getClass(), "highestRating", 0);
        setIntField(term43736, term43736.getClass(), "nameplateId", 0);
        setIntField(term43736, term43736.getClass(), "frameId", 0);
        setIntField(term43736, term43736.getClass(), "characterId", 0);
        setIntField(term43736, term43736.getClass(), "trophyId", 0);
        setIntField(term43736, term43736.getClass(), "playedTutorialBit", 0);
        setIntField(term43736, term43736.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43736, term43736.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43736, term43736.getClass(), "totalRepertoireCount", 0);
        setIntField(term43736, term43736.getClass(), "totalMapNum", 0);
        setLongField(term43736, term43736.getClass(), "totalHiScore", 0L);
        setLongField(term43736, term43736.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43736, term43736.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43736, term43736.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43736, term43736.getClass(), "totalMasterHighScore", 0L);
        setField(term43736, term43736.getClass(), "eventWatchedDate", null);
        setIntField(term43736, term43736.getClass(), "friendCount", 0);
        setBooleanField(term43736, term43736.getClass(), "isMaimai", false);
        setField(term43736, term43736.getClass(), "firstGameId", null);
        setField(term43736, term43736.getClass(), "firstRomVersion", null);
        setField(term43736, term43736.getClass(), "firstDataVersion", null);
        setField(term43736, term43736.getClass(), "firstPlayDate", null);
        setField(term43736, term43736.getClass(), "lastGameId", null);
        setField(term43736, term43736.getClass(), "lastRomVersion", null);
        setField(term43736, term43736.getClass(), "lastDataVersion", null);
        setField(term43736, term43736.getClass(), "lastPlayDate", null);
        setIntField(term43736, term43736.getClass(), "lastPlaceId", 0);
        setField(term43736, term43736.getClass(), "lastPlaceName", null);
        setField(term43736, term43736.getClass(), "lastRegionId", null);
        setField(term43736, term43736.getClass(), "lastRegionName", null);
        setField(term43736, term43736.getClass(), "lastAllNetId", null);
        setField(term43736, term43736.getClass(), "lastClientId", null);
        term43767 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43767;
        callMethod(klass, "setAcceptResCount", argTypes, term43736, args);
    }

};


