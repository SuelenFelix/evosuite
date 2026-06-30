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

public class ExternalUserData_setPlayCount_262549428163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43604;
     Object term43635;

    public ExternalUserData_setPlayCount_262549428163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43604 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43604, term43604.getClass(), "accessCode", null);
        setField(term43604, term43604.getClass(), "userName", null);
        setField(term43604, term43604.getClass(), "lastLoginDate", null);
        setBooleanField(term43604, term43604.getClass(), "isWebJoin", false);
        setField(term43604, term43604.getClass(), "webLimitDate", null);
        setIntField(term43604, term43604.getClass(), "level", 0);
        setIntField(term43604, term43604.getClass(), "reincarnationNum", 0);
        setField(term43604, term43604.getClass(), "exp", null);
        setLongField(term43604, term43604.getClass(), "point", 0L);
        setLongField(term43604, term43604.getClass(), "totalPoint", 0L);
        setIntField(term43604, term43604.getClass(), "playCount", 0);
        setIntField(term43604, term43604.getClass(), "multiPlayCount", 0);
        setIntField(term43604, term43604.getClass(), "multiWinCount", 0);
        setIntField(term43604, term43604.getClass(), "requestResCount", 0);
        setIntField(term43604, term43604.getClass(), "acceptResCount", 0);
        setIntField(term43604, term43604.getClass(), "successResCount", 0);
        setIntField(term43604, term43604.getClass(), "playerRating", 0);
        setIntField(term43604, term43604.getClass(), "highestRating", 0);
        setIntField(term43604, term43604.getClass(), "nameplateId", 0);
        setIntField(term43604, term43604.getClass(), "frameId", 0);
        setIntField(term43604, term43604.getClass(), "characterId", 0);
        setIntField(term43604, term43604.getClass(), "trophyId", 0);
        setIntField(term43604, term43604.getClass(), "playedTutorialBit", 0);
        setIntField(term43604, term43604.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43604, term43604.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43604, term43604.getClass(), "totalRepertoireCount", 0);
        setIntField(term43604, term43604.getClass(), "totalMapNum", 0);
        setLongField(term43604, term43604.getClass(), "totalHiScore", 0L);
        setLongField(term43604, term43604.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43604, term43604.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43604, term43604.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43604, term43604.getClass(), "totalMasterHighScore", 0L);
        setField(term43604, term43604.getClass(), "eventWatchedDate", null);
        setIntField(term43604, term43604.getClass(), "friendCount", 0);
        setBooleanField(term43604, term43604.getClass(), "isMaimai", false);
        setField(term43604, term43604.getClass(), "firstGameId", null);
        setField(term43604, term43604.getClass(), "firstRomVersion", null);
        setField(term43604, term43604.getClass(), "firstDataVersion", null);
        setField(term43604, term43604.getClass(), "firstPlayDate", null);
        setField(term43604, term43604.getClass(), "lastGameId", null);
        setField(term43604, term43604.getClass(), "lastRomVersion", null);
        setField(term43604, term43604.getClass(), "lastDataVersion", null);
        setField(term43604, term43604.getClass(), "lastPlayDate", null);
        setIntField(term43604, term43604.getClass(), "lastPlaceId", 0);
        setField(term43604, term43604.getClass(), "lastPlaceName", null);
        setField(term43604, term43604.getClass(), "lastRegionId", null);
        setField(term43604, term43604.getClass(), "lastRegionName", null);
        setField(term43604, term43604.getClass(), "lastAllNetId", null);
        setField(term43604, term43604.getClass(), "lastClientId", null);
        term43635 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43635;
        callMethod(klass, "setPlayCount", argTypes, term43604, args);
    }

};


