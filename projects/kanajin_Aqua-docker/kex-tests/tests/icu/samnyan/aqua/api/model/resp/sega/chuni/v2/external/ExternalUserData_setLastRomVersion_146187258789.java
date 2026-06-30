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

public class ExternalUserData_setLastRomVersion_146187258789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35954;

    public ExternalUserData_setLastRomVersion_146187258789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35954 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term35979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36139 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35954, term35954.getClass(), "accessCode", "QwKYpiVQlL");
        setField(term35954, term35954.getClass(), "userName", "kSGsHNQQoW");
        setIntField(term35980, term35980.getClass(), "year", 2015);
        setShortField(term35980, term35980.getClass(), "month", (short) 10);
        setShortField(term35980, term35980.getClass(), "day", (short) 4);
        setField(term35979, term35979.getClass(), "date", term35980);
        setByteField(term35984, term35984.getClass(), "hour", (byte) 1);
        setByteField(term35984, term35984.getClass(), "minute", (byte) 29);
        setByteField(term35984, term35984.getClass(), "second", (byte) 20);
        setIntField(term35984, term35984.getClass(), "nano", 558273892);
        setField(term35979, term35979.getClass(), "time", term35984);
        setField(term35954, term35954.getClass(), "lastLoginDate", term35979);
        setBooleanField(term35954, term35954.getClass(), "isWebJoin", false);
        setField(term35954, term35954.getClass(), "webLimitDate", "MWezlyjdaG");
        setIntField(term35954, term35954.getClass(), "level", 1050420173);
        setIntField(term35954, term35954.getClass(), "reincarnationNum", 994300935);
        setField(term35954, term35954.getClass(), "exp", "drpBJuEKQG");
        setLongField(term35954, term35954.getClass(), "point", 2712394591642260550L);
        setLongField(term35954, term35954.getClass(), "totalPoint", -1211273460223868511L);
        setIntField(term35954, term35954.getClass(), "playCount", 433954476);
        setIntField(term35954, term35954.getClass(), "multiPlayCount", 1780958641);
        setIntField(term35954, term35954.getClass(), "multiWinCount", 1890582085);
        setIntField(term35954, term35954.getClass(), "requestResCount", 2146568808);
        setIntField(term35954, term35954.getClass(), "acceptResCount", 245081679);
        setIntField(term35954, term35954.getClass(), "successResCount", 1199789398);
        setIntField(term35954, term35954.getClass(), "playerRating", -1056402285);
        setIntField(term35954, term35954.getClass(), "highestRating", 1881803912);
        setIntField(term35954, term35954.getClass(), "nameplateId", -188535038);
        setIntField(term35954, term35954.getClass(), "frameId", 254650626);
        setIntField(term35954, term35954.getClass(), "characterId", -1789030917);
        setIntField(term35954, term35954.getClass(), "trophyId", 912208163);
        setIntField(term35954, term35954.getClass(), "playedTutorialBit", 909767683);
        setIntField(term35954, term35954.getClass(), "firstTutorialCancelNum", -639390893);
        setIntField(term35954, term35954.getClass(), "masterTutorialCancelNum", 1176415280);
        setIntField(term35954, term35954.getClass(), "totalRepertoireCount", -1272714687);
        setIntField(term35954, term35954.getClass(), "totalMapNum", -762778853);
        setLongField(term35954, term35954.getClass(), "totalHiScore", -8172564209423941839L);
        setLongField(term35954, term35954.getClass(), "totalBasicHighScore", -4561371668792438386L);
        setLongField(term35954, term35954.getClass(), "totalAdvancedHighScore", 7065003857377879971L);
        setLongField(term35954, term35954.getClass(), "totalExpertHighScore", 2243864141567980599L);
        setLongField(term35954, term35954.getClass(), "totalMasterHighScore", 353705949229610067L);
        setIntField(term36041, term36041.getClass(), "year", 2029);
        setShortField(term36041, term36041.getClass(), "month", (short) 1);
        setShortField(term36041, term36041.getClass(), "day", (short) 15);
        setField(term36040, term36040.getClass(), "date", term36041);
        setByteField(term36045, term36045.getClass(), "hour", (byte) 1);
        setByteField(term36045, term36045.getClass(), "minute", (byte) 39);
        setByteField(term36045, term36045.getClass(), "second", (byte) 40);
        setIntField(term36045, term36045.getClass(), "nano", 99482694);
        setField(term36040, term36040.getClass(), "time", term36045);
        setField(term35954, term35954.getClass(), "eventWatchedDate", term36040);
        setIntField(term35954, term35954.getClass(), "friendCount", 946727239);
        setBooleanField(term35954, term35954.getClass(), "isMaimai", true);
        setField(term35954, term35954.getClass(), "firstGameId", "GGpORnLrOW");
        setField(term35954, term35954.getClass(), "firstRomVersion", "gDGZwlpOZx");
        setField(term35954, term35954.getClass(), "firstDataVersion", "gkDpxkHPDg");
        setIntField(term36089, term36089.getClass(), "year", 2025);
        setShortField(term36089, term36089.getClass(), "month", (short) 2);
        setShortField(term36089, term36089.getClass(), "day", (short) 11);
        setField(term36088, term36088.getClass(), "date", term36089);
        setByteField(term36093, term36093.getClass(), "hour", (byte) 15);
        setByteField(term36093, term36093.getClass(), "minute", (byte) 46);
        setByteField(term36093, term36093.getClass(), "second", (byte) 31);
        setIntField(term36093, term36093.getClass(), "nano", 989587730);
        setField(term36088, term36088.getClass(), "time", term36093);
        setField(term35954, term35954.getClass(), "firstPlayDate", term36088);
        setField(term35954, term35954.getClass(), "lastGameId", "pADwkrWiMW");
        setField(term35954, term35954.getClass(), "lastRomVersion", "FDORDJuAXQ");
        setField(term35954, term35954.getClass(), "lastDataVersion", "yjqoDeLBLg");
        setIntField(term36135, term36135.getClass(), "year", 2024);
        setShortField(term36135, term36135.getClass(), "month", (short) 11);
        setShortField(term36135, term36135.getClass(), "day", (short) 16);
        setField(term36134, term36134.getClass(), "date", term36135);
        setByteField(term36139, term36139.getClass(), "hour", (byte) 23);
        setByteField(term36139, term36139.getClass(), "minute", (byte) 40);
        setByteField(term36139, term36139.getClass(), "second", (byte) 40);
        setIntField(term36139, term36139.getClass(), "nano", 810133212);
        setField(term36134, term36134.getClass(), "time", term36139);
        setField(term35954, term35954.getClass(), "lastPlayDate", term36134);
        setIntField(term35954, term35954.getClass(), "lastPlaceId", 349182490);
        setField(term35954, term35954.getClass(), "lastPlaceName", "DCepDqVwas");
        setField(term35954, term35954.getClass(), "lastRegionId", "wKIBUlfNCx");
        setField(term35954, term35954.getClass(), "lastRegionName", "iGfMUWRvod");
        setField(term35954, term35954.getClass(), "lastAllNetId", "zUXaSvayQe");
        setField(term35954, term35954.getClass(), "lastClientId", "bPVcnnQPSC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PQLyoEKWSa";
        callMethod(klass, "setLastRomVersion", argTypes, term35954, args);
    }

};


