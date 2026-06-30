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

public class ExternalUserData_setLevel_787266844158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43441;
     Object term43472;

    public ExternalUserData_setLevel_787266844158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43441 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43441, term43441.getClass(), "accessCode", null);
        setField(term43441, term43441.getClass(), "userName", null);
        setField(term43441, term43441.getClass(), "lastLoginDate", null);
        setBooleanField(term43441, term43441.getClass(), "isWebJoin", false);
        setField(term43441, term43441.getClass(), "webLimitDate", null);
        setIntField(term43441, term43441.getClass(), "level", 0);
        setIntField(term43441, term43441.getClass(), "reincarnationNum", 0);
        setField(term43441, term43441.getClass(), "exp", null);
        setLongField(term43441, term43441.getClass(), "point", 0L);
        setLongField(term43441, term43441.getClass(), "totalPoint", 0L);
        setIntField(term43441, term43441.getClass(), "playCount", 0);
        setIntField(term43441, term43441.getClass(), "multiPlayCount", 0);
        setIntField(term43441, term43441.getClass(), "multiWinCount", 0);
        setIntField(term43441, term43441.getClass(), "requestResCount", 0);
        setIntField(term43441, term43441.getClass(), "acceptResCount", 0);
        setIntField(term43441, term43441.getClass(), "successResCount", 0);
        setIntField(term43441, term43441.getClass(), "playerRating", 0);
        setIntField(term43441, term43441.getClass(), "highestRating", 0);
        setIntField(term43441, term43441.getClass(), "nameplateId", 0);
        setIntField(term43441, term43441.getClass(), "frameId", 0);
        setIntField(term43441, term43441.getClass(), "characterId", 0);
        setIntField(term43441, term43441.getClass(), "trophyId", 0);
        setIntField(term43441, term43441.getClass(), "playedTutorialBit", 0);
        setIntField(term43441, term43441.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43441, term43441.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43441, term43441.getClass(), "totalRepertoireCount", 0);
        setIntField(term43441, term43441.getClass(), "totalMapNum", 0);
        setLongField(term43441, term43441.getClass(), "totalHiScore", 0L);
        setLongField(term43441, term43441.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43441, term43441.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43441, term43441.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43441, term43441.getClass(), "totalMasterHighScore", 0L);
        setField(term43441, term43441.getClass(), "eventWatchedDate", null);
        setIntField(term43441, term43441.getClass(), "friendCount", 0);
        setBooleanField(term43441, term43441.getClass(), "isMaimai", false);
        setField(term43441, term43441.getClass(), "firstGameId", null);
        setField(term43441, term43441.getClass(), "firstRomVersion", null);
        setField(term43441, term43441.getClass(), "firstDataVersion", null);
        setField(term43441, term43441.getClass(), "firstPlayDate", null);
        setField(term43441, term43441.getClass(), "lastGameId", null);
        setField(term43441, term43441.getClass(), "lastRomVersion", null);
        setField(term43441, term43441.getClass(), "lastDataVersion", null);
        setField(term43441, term43441.getClass(), "lastPlayDate", null);
        setIntField(term43441, term43441.getClass(), "lastPlaceId", 0);
        setField(term43441, term43441.getClass(), "lastPlaceName", null);
        setField(term43441, term43441.getClass(), "lastRegionId", null);
        setField(term43441, term43441.getClass(), "lastRegionName", null);
        setField(term43441, term43441.getClass(), "lastAllNetId", null);
        setField(term43441, term43441.getClass(), "lastClientId", null);
        term43472 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43472;
        callMethod(klass, "setLevel", argTypes, term43441, args);
    }

};


