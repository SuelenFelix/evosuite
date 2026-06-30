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
import java.lang.Object;
import java.lang.Integer;

public class ExternalUserData_setPlayerRating_187117842665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26186;
     Object term26437;

    public ExternalUserData_setPlayerRating_187117842665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26186 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term26211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26371 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26186, term26186.getClass(), "accessCode", "gSAtqakaLY");
        setField(term26186, term26186.getClass(), "userName", "taPBiMFNEZ");
        setIntField(term26212, term26212.getClass(), "year", 2011);
        setShortField(term26212, term26212.getClass(), "month", (short) 8);
        setShortField(term26212, term26212.getClass(), "day", (short) 29);
        setField(term26211, term26211.getClass(), "date", term26212);
        setByteField(term26216, term26216.getClass(), "hour", (byte) 10);
        setByteField(term26216, term26216.getClass(), "minute", (byte) 15);
        setByteField(term26216, term26216.getClass(), "second", (byte) 18);
        setIntField(term26216, term26216.getClass(), "nano", 171360352);
        setField(term26211, term26211.getClass(), "time", term26216);
        setField(term26186, term26186.getClass(), "lastLoginDate", term26211);
        setBooleanField(term26186, term26186.getClass(), "isWebJoin", false);
        setField(term26186, term26186.getClass(), "webLimitDate", "NoAFAfGyYL");
        setIntField(term26186, term26186.getClass(), "level", -1268483887);
        setIntField(term26186, term26186.getClass(), "reincarnationNum", -1929689681);
        setField(term26186, term26186.getClass(), "exp", "MFtfkBMyOD");
        setLongField(term26186, term26186.getClass(), "point", -599981502351912419L);
        setLongField(term26186, term26186.getClass(), "totalPoint", 8171709541116491249L);
        setIntField(term26186, term26186.getClass(), "playCount", -91240911);
        setIntField(term26186, term26186.getClass(), "multiPlayCount", -321227954);
        setIntField(term26186, term26186.getClass(), "multiWinCount", 373810833);
        setIntField(term26186, term26186.getClass(), "requestResCount", -215979293);
        setIntField(term26186, term26186.getClass(), "acceptResCount", -19567889);
        setIntField(term26186, term26186.getClass(), "successResCount", 693500318);
        setIntField(term26186, term26186.getClass(), "playerRating", 1702404702);
        setIntField(term26186, term26186.getClass(), "highestRating", 1141592999);
        setIntField(term26186, term26186.getClass(), "nameplateId", 848113442);
        setIntField(term26186, term26186.getClass(), "frameId", 793974213);
        setIntField(term26186, term26186.getClass(), "characterId", 722546287);
        setIntField(term26186, term26186.getClass(), "trophyId", -2060284160);
        setIntField(term26186, term26186.getClass(), "playedTutorialBit", -568450686);
        setIntField(term26186, term26186.getClass(), "firstTutorialCancelNum", 1314660281);
        setIntField(term26186, term26186.getClass(), "masterTutorialCancelNum", -126399768);
        setIntField(term26186, term26186.getClass(), "totalRepertoireCount", 318982923);
        setIntField(term26186, term26186.getClass(), "totalMapNum", -154210001);
        setLongField(term26186, term26186.getClass(), "totalHiScore", 1867943942587005261L);
        setLongField(term26186, term26186.getClass(), "totalBasicHighScore", -9168517519350392654L);
        setLongField(term26186, term26186.getClass(), "totalAdvancedHighScore", 4828755228445882127L);
        setLongField(term26186, term26186.getClass(), "totalExpertHighScore", 970120292495348028L);
        setLongField(term26186, term26186.getClass(), "totalMasterHighScore", 77619432202128806L);
        setIntField(term26273, term26273.getClass(), "year", 2019);
        setShortField(term26273, term26273.getClass(), "month", (short) 5);
        setShortField(term26273, term26273.getClass(), "day", (short) 16);
        setField(term26272, term26272.getClass(), "date", term26273);
        setByteField(term26277, term26277.getClass(), "hour", (byte) 3);
        setByteField(term26277, term26277.getClass(), "minute", (byte) 12);
        setByteField(term26277, term26277.getClass(), "second", (byte) 27);
        setIntField(term26277, term26277.getClass(), "nano", 775737832);
        setField(term26272, term26272.getClass(), "time", term26277);
        setField(term26186, term26186.getClass(), "eventWatchedDate", term26272);
        setIntField(term26186, term26186.getClass(), "friendCount", 621910137);
        setBooleanField(term26186, term26186.getClass(), "isMaimai", false);
        setField(term26186, term26186.getClass(), "firstGameId", "rdiIyXfRtL");
        setField(term26186, term26186.getClass(), "firstRomVersion", "douzkltmiI");
        setField(term26186, term26186.getClass(), "firstDataVersion", "MFKjhvLtpe");
        setIntField(term26321, term26321.getClass(), "year", 2016);
        setShortField(term26321, term26321.getClass(), "month", (short) 12);
        setShortField(term26321, term26321.getClass(), "day", (short) 2);
        setField(term26320, term26320.getClass(), "date", term26321);
        setByteField(term26325, term26325.getClass(), "hour", (byte) 7);
        setByteField(term26325, term26325.getClass(), "minute", (byte) 38);
        setByteField(term26325, term26325.getClass(), "second", (byte) 49);
        setIntField(term26325, term26325.getClass(), "nano", 415044053);
        setField(term26320, term26320.getClass(), "time", term26325);
        setField(term26186, term26186.getClass(), "firstPlayDate", term26320);
        setField(term26186, term26186.getClass(), "lastGameId", "xpbLKEsput");
        setField(term26186, term26186.getClass(), "lastRomVersion", "urlyLwPBVn");
        setField(term26186, term26186.getClass(), "lastDataVersion", "SPQVzOlOzZ");
        setIntField(term26367, term26367.getClass(), "year", 2029);
        setShortField(term26367, term26367.getClass(), "month", (short) 1);
        setShortField(term26367, term26367.getClass(), "day", (short) 21);
        setField(term26366, term26366.getClass(), "date", term26367);
        setByteField(term26371, term26371.getClass(), "hour", (byte) 9);
        setByteField(term26371, term26371.getClass(), "minute", (byte) 46);
        setByteField(term26371, term26371.getClass(), "second", (byte) 1);
        setIntField(term26371, term26371.getClass(), "nano", 276350652);
        setField(term26366, term26366.getClass(), "time", term26371);
        setField(term26186, term26186.getClass(), "lastPlayDate", term26366);
        setIntField(term26186, term26186.getClass(), "lastPlaceId", 241533020);
        setField(term26186, term26186.getClass(), "lastPlaceName", "bOUAgAptAI");
        setField(term26186, term26186.getClass(), "lastRegionId", "KSZfGbvzPE");
        setField(term26186, term26186.getClass(), "lastRegionName", "YfgYGgzYER");
        setField(term26186, term26186.getClass(), "lastAllNetId", "IDClvDZuqE");
        setField(term26186, term26186.getClass(), "lastClientId", "cMvKxpZOvg");
        term26437 = new Integer(2081679151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26437;
        callMethod(klass, "setPlayerRating", argTypes, term26186, args);
    }

};


