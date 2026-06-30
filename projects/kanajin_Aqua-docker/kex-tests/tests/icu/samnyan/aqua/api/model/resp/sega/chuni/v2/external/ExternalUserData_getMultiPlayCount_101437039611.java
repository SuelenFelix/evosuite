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

public class ExternalUserData_getMultiPlayCount_101437039611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4412;

    public ExternalUserData_getMultiPlayCount_101437039611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4412 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term4437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4551 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4597 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4412, term4412.getClass(), "accessCode", "PapWxkhEWe");
        setField(term4412, term4412.getClass(), "userName", "smnHEqRFRx");
        setIntField(term4438, term4438.getClass(), "year", 2020);
        setShortField(term4438, term4438.getClass(), "month", (short) 5);
        setShortField(term4438, term4438.getClass(), "day", (short) 18);
        setField(term4437, term4437.getClass(), "date", term4438);
        setByteField(term4442, term4442.getClass(), "hour", (byte) 5);
        setByteField(term4442, term4442.getClass(), "minute", (byte) 46);
        setByteField(term4442, term4442.getClass(), "second", (byte) 13);
        setIntField(term4442, term4442.getClass(), "nano", 45893173);
        setField(term4437, term4437.getClass(), "time", term4442);
        setField(term4412, term4412.getClass(), "lastLoginDate", term4437);
        setBooleanField(term4412, term4412.getClass(), "isWebJoin", true);
        setField(term4412, term4412.getClass(), "webLimitDate", "XYtryyobou");
        setIntField(term4412, term4412.getClass(), "level", -860131894);
        setIntField(term4412, term4412.getClass(), "reincarnationNum", -1022990421);
        setField(term4412, term4412.getClass(), "exp", "OYbzXylRWW");
        setLongField(term4412, term4412.getClass(), "point", 9013624480170062917L);
        setLongField(term4412, term4412.getClass(), "totalPoint", 7862575738391801707L);
        setIntField(term4412, term4412.getClass(), "playCount", 1045547089);
        setIntField(term4412, term4412.getClass(), "multiPlayCount", -1122880881);
        setIntField(term4412, term4412.getClass(), "multiWinCount", -542712742);
        setIntField(term4412, term4412.getClass(), "requestResCount", -1254072822);
        setIntField(term4412, term4412.getClass(), "acceptResCount", -1111249833);
        setIntField(term4412, term4412.getClass(), "successResCount", -1692331299);
        setIntField(term4412, term4412.getClass(), "playerRating", 479531250);
        setIntField(term4412, term4412.getClass(), "highestRating", 1320570890);
        setIntField(term4412, term4412.getClass(), "nameplateId", -130649791);
        setIntField(term4412, term4412.getClass(), "frameId", 534834644);
        setIntField(term4412, term4412.getClass(), "characterId", 1959097203);
        setIntField(term4412, term4412.getClass(), "trophyId", -209654048);
        setIntField(term4412, term4412.getClass(), "playedTutorialBit", 477625804);
        setIntField(term4412, term4412.getClass(), "firstTutorialCancelNum", 252575029);
        setIntField(term4412, term4412.getClass(), "masterTutorialCancelNum", 57189932);
        setIntField(term4412, term4412.getClass(), "totalRepertoireCount", 1460722225);
        setIntField(term4412, term4412.getClass(), "totalMapNum", 1743224434);
        setLongField(term4412, term4412.getClass(), "totalHiScore", 50358265865610362L);
        setLongField(term4412, term4412.getClass(), "totalBasicHighScore", 5510783420697225605L);
        setLongField(term4412, term4412.getClass(), "totalAdvancedHighScore", 6005241913654469005L);
        setLongField(term4412, term4412.getClass(), "totalExpertHighScore", -1983291584002806658L);
        setLongField(term4412, term4412.getClass(), "totalMasterHighScore", 5946780097489996391L);
        setIntField(term4499, term4499.getClass(), "year", 2017);
        setShortField(term4499, term4499.getClass(), "month", (short) 4);
        setShortField(term4499, term4499.getClass(), "day", (short) 3);
        setField(term4498, term4498.getClass(), "date", term4499);
        setByteField(term4503, term4503.getClass(), "hour", (byte) 6);
        setByteField(term4503, term4503.getClass(), "minute", (byte) 51);
        setByteField(term4503, term4503.getClass(), "second", (byte) 10);
        setIntField(term4503, term4503.getClass(), "nano", 316377166);
        setField(term4498, term4498.getClass(), "time", term4503);
        setField(term4412, term4412.getClass(), "eventWatchedDate", term4498);
        setIntField(term4412, term4412.getClass(), "friendCount", 842904495);
        setBooleanField(term4412, term4412.getClass(), "isMaimai", true);
        setField(term4412, term4412.getClass(), "firstGameId", "DSNsTGYXDF");
        setField(term4412, term4412.getClass(), "firstRomVersion", "sQvGcVjdEx");
        setField(term4412, term4412.getClass(), "firstDataVersion", "rLHAoqXgPh");
        setIntField(term4547, term4547.getClass(), "year", 2027);
        setShortField(term4547, term4547.getClass(), "month", (short) 8);
        setShortField(term4547, term4547.getClass(), "day", (short) 23);
        setField(term4546, term4546.getClass(), "date", term4547);
        setByteField(term4551, term4551.getClass(), "hour", (byte) 15);
        setByteField(term4551, term4551.getClass(), "minute", (byte) 12);
        setByteField(term4551, term4551.getClass(), "second", (byte) 6);
        setIntField(term4551, term4551.getClass(), "nano", 541218258);
        setField(term4546, term4546.getClass(), "time", term4551);
        setField(term4412, term4412.getClass(), "firstPlayDate", term4546);
        setField(term4412, term4412.getClass(), "lastGameId", "zUlRdimJtU");
        setField(term4412, term4412.getClass(), "lastRomVersion", "vwbEQQNQrx");
        setField(term4412, term4412.getClass(), "lastDataVersion", "xtftXXMbem");
        setIntField(term4593, term4593.getClass(), "year", 2013);
        setShortField(term4593, term4593.getClass(), "month", (short) 5);
        setShortField(term4593, term4593.getClass(), "day", (short) 26);
        setField(term4592, term4592.getClass(), "date", term4593);
        setByteField(term4597, term4597.getClass(), "hour", (byte) 4);
        setByteField(term4597, term4597.getClass(), "minute", (byte) 39);
        setByteField(term4597, term4597.getClass(), "second", (byte) 5);
        setIntField(term4597, term4597.getClass(), "nano", 392869354);
        setField(term4592, term4592.getClass(), "time", term4597);
        setField(term4412, term4412.getClass(), "lastPlayDate", term4592);
        setIntField(term4412, term4412.getClass(), "lastPlaceId", 1008080511);
        setField(term4412, term4412.getClass(), "lastPlaceName", "cudZvLMQon");
        setField(term4412, term4412.getClass(), "lastRegionId", "lihXWlGDxk");
        setField(term4412, term4412.getClass(), "lastRegionName", "JmcmxoGhIK");
        setField(term4412, term4412.getClass(), "lastAllNetId", "jXzmYyrnnT");
        setField(term4412, term4412.getClass(), "lastClientId", "igCAtimmYB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiPlayCount", argTypes, term4412, args);
    }

};


