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

public class ExternalUserData_getPlayerRating_148726330416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6417;

    public ExternalUserData_getPlayerRating_148726330416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6417 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term6442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6602 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6417, term6417.getClass(), "accessCode", "iIRsCSYqXH");
        setField(term6417, term6417.getClass(), "userName", "nghfqDXyCG");
        setIntField(term6443, term6443.getClass(), "year", 2028);
        setShortField(term6443, term6443.getClass(), "month", (short) 1);
        setShortField(term6443, term6443.getClass(), "day", (short) 18);
        setField(term6442, term6442.getClass(), "date", term6443);
        setByteField(term6447, term6447.getClass(), "hour", (byte) 12);
        setByteField(term6447, term6447.getClass(), "minute", (byte) 4);
        setByteField(term6447, term6447.getClass(), "second", (byte) 39);
        setIntField(term6447, term6447.getClass(), "nano", 651287093);
        setField(term6442, term6442.getClass(), "time", term6447);
        setField(term6417, term6417.getClass(), "lastLoginDate", term6442);
        setBooleanField(term6417, term6417.getClass(), "isWebJoin", true);
        setField(term6417, term6417.getClass(), "webLimitDate", "WBAOTqErtm");
        setIntField(term6417, term6417.getClass(), "level", -2070466617);
        setIntField(term6417, term6417.getClass(), "reincarnationNum", -1127721881);
        setField(term6417, term6417.getClass(), "exp", "PqtVXXZMqK");
        setLongField(term6417, term6417.getClass(), "point", -6950146046121430355L);
        setLongField(term6417, term6417.getClass(), "totalPoint", 1667122142089513324L);
        setIntField(term6417, term6417.getClass(), "playCount", 1074848808);
        setIntField(term6417, term6417.getClass(), "multiPlayCount", -146054762);
        setIntField(term6417, term6417.getClass(), "multiWinCount", 798043553);
        setIntField(term6417, term6417.getClass(), "requestResCount", 533197381);
        setIntField(term6417, term6417.getClass(), "acceptResCount", 1048271679);
        setIntField(term6417, term6417.getClass(), "successResCount", -1529797673);
        setIntField(term6417, term6417.getClass(), "playerRating", -868676396);
        setIntField(term6417, term6417.getClass(), "highestRating", 1922684808);
        setIntField(term6417, term6417.getClass(), "nameplateId", -2005784375);
        setIntField(term6417, term6417.getClass(), "frameId", -288604325);
        setIntField(term6417, term6417.getClass(), "characterId", -1268314569);
        setIntField(term6417, term6417.getClass(), "trophyId", 877649659);
        setIntField(term6417, term6417.getClass(), "playedTutorialBit", -1332748804);
        setIntField(term6417, term6417.getClass(), "firstTutorialCancelNum", 1774507971);
        setIntField(term6417, term6417.getClass(), "masterTutorialCancelNum", -1420269858);
        setIntField(term6417, term6417.getClass(), "totalRepertoireCount", -2119545015);
        setIntField(term6417, term6417.getClass(), "totalMapNum", 1272542218);
        setLongField(term6417, term6417.getClass(), "totalHiScore", -6342139649364011743L);
        setLongField(term6417, term6417.getClass(), "totalBasicHighScore", -4924950707540628022L);
        setLongField(term6417, term6417.getClass(), "totalAdvancedHighScore", -4393710401270724527L);
        setLongField(term6417, term6417.getClass(), "totalExpertHighScore", -4822736661741380518L);
        setLongField(term6417, term6417.getClass(), "totalMasterHighScore", -5386201758403679145L);
        setIntField(term6504, term6504.getClass(), "year", 2027);
        setShortField(term6504, term6504.getClass(), "month", (short) 7);
        setShortField(term6504, term6504.getClass(), "day", (short) 23);
        setField(term6503, term6503.getClass(), "date", term6504);
        setByteField(term6508, term6508.getClass(), "hour", (byte) 12);
        setByteField(term6508, term6508.getClass(), "minute", (byte) 6);
        setByteField(term6508, term6508.getClass(), "second", (byte) 19);
        setIntField(term6508, term6508.getClass(), "nano", 8025683);
        setField(term6503, term6503.getClass(), "time", term6508);
        setField(term6417, term6417.getClass(), "eventWatchedDate", term6503);
        setIntField(term6417, term6417.getClass(), "friendCount", 1209799204);
        setBooleanField(term6417, term6417.getClass(), "isMaimai", true);
        setField(term6417, term6417.getClass(), "firstGameId", "rYbtIDVdnd");
        setField(term6417, term6417.getClass(), "firstRomVersion", "UKAReurpHG");
        setField(term6417, term6417.getClass(), "firstDataVersion", "WVRMUmrljA");
        setIntField(term6552, term6552.getClass(), "year", 2018);
        setShortField(term6552, term6552.getClass(), "month", (short) 2);
        setShortField(term6552, term6552.getClass(), "day", (short) 14);
        setField(term6551, term6551.getClass(), "date", term6552);
        setByteField(term6556, term6556.getClass(), "hour", (byte) 2);
        setByteField(term6556, term6556.getClass(), "minute", (byte) 40);
        setByteField(term6556, term6556.getClass(), "second", (byte) 48);
        setIntField(term6556, term6556.getClass(), "nano", 371006728);
        setField(term6551, term6551.getClass(), "time", term6556);
        setField(term6417, term6417.getClass(), "firstPlayDate", term6551);
        setField(term6417, term6417.getClass(), "lastGameId", "NTlKJDDWlk");
        setField(term6417, term6417.getClass(), "lastRomVersion", "vOuMEpOQAg");
        setField(term6417, term6417.getClass(), "lastDataVersion", "SIODFGaQhr");
        setIntField(term6598, term6598.getClass(), "year", 2025);
        setShortField(term6598, term6598.getClass(), "month", (short) 8);
        setShortField(term6598, term6598.getClass(), "day", (short) 22);
        setField(term6597, term6597.getClass(), "date", term6598);
        setByteField(term6602, term6602.getClass(), "hour", (byte) 6);
        setByteField(term6602, term6602.getClass(), "minute", (byte) 48);
        setByteField(term6602, term6602.getClass(), "second", (byte) 49);
        setIntField(term6602, term6602.getClass(), "nano", 46400229);
        setField(term6597, term6597.getClass(), "time", term6602);
        setField(term6417, term6417.getClass(), "lastPlayDate", term6597);
        setIntField(term6417, term6417.getClass(), "lastPlaceId", 1094107751);
        setField(term6417, term6417.getClass(), "lastPlaceName", "qYzsiuXOgS");
        setField(term6417, term6417.getClass(), "lastRegionId", "bxrCBbrrct");
        setField(term6417, term6417.getClass(), "lastRegionName", "CKWpJaaaxX");
        setField(term6417, term6417.getClass(), "lastAllNetId", "UBRmXJmfrt");
        setField(term6417, term6417.getClass(), "lastClientId", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term6417, args);
    }

};


