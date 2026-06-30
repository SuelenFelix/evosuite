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

public class ExternalUserData_getFirstDataVersion_29302649337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14838;

    public ExternalUserData_getFirstDataVersion_29302649337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14838 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term14863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14838, term14838.getClass(), "accessCode", "QpYltHAdyY");
        setField(term14838, term14838.getClass(), "userName", "lbmSGBwIiV");
        setIntField(term14864, term14864.getClass(), "year", 2018);
        setShortField(term14864, term14864.getClass(), "month", (short) 9);
        setShortField(term14864, term14864.getClass(), "day", (short) 3);
        setField(term14863, term14863.getClass(), "date", term14864);
        setByteField(term14868, term14868.getClass(), "hour", (byte) 16);
        setByteField(term14868, term14868.getClass(), "minute", (byte) 48);
        setByteField(term14868, term14868.getClass(), "second", (byte) 45);
        setIntField(term14868, term14868.getClass(), "nano", 919694917);
        setField(term14863, term14863.getClass(), "time", term14868);
        setField(term14838, term14838.getClass(), "lastLoginDate", term14863);
        setBooleanField(term14838, term14838.getClass(), "isWebJoin", false);
        setField(term14838, term14838.getClass(), "webLimitDate", "DAxyHoTLzZ");
        setIntField(term14838, term14838.getClass(), "level", -675283917);
        setIntField(term14838, term14838.getClass(), "reincarnationNum", -2093862988);
        setField(term14838, term14838.getClass(), "exp", "fhZgTouhCC");
        setLongField(term14838, term14838.getClass(), "point", -2187638136407967948L);
        setLongField(term14838, term14838.getClass(), "totalPoint", 8708846223293804408L);
        setIntField(term14838, term14838.getClass(), "playCount", 1337828646);
        setIntField(term14838, term14838.getClass(), "multiPlayCount", 532666604);
        setIntField(term14838, term14838.getClass(), "multiWinCount", -13725716);
        setIntField(term14838, term14838.getClass(), "requestResCount", -1695750603);
        setIntField(term14838, term14838.getClass(), "acceptResCount", 63677360);
        setIntField(term14838, term14838.getClass(), "successResCount", 1478914037);
        setIntField(term14838, term14838.getClass(), "playerRating", 1630231519);
        setIntField(term14838, term14838.getClass(), "highestRating", 1460702778);
        setIntField(term14838, term14838.getClass(), "nameplateId", -1398142433);
        setIntField(term14838, term14838.getClass(), "frameId", -1112119058);
        setIntField(term14838, term14838.getClass(), "characterId", 2073858334);
        setIntField(term14838, term14838.getClass(), "trophyId", -1693535639);
        setIntField(term14838, term14838.getClass(), "playedTutorialBit", 1344744036);
        setIntField(term14838, term14838.getClass(), "firstTutorialCancelNum", -98060427);
        setIntField(term14838, term14838.getClass(), "masterTutorialCancelNum", -1272268399);
        setIntField(term14838, term14838.getClass(), "totalRepertoireCount", 1120271104);
        setIntField(term14838, term14838.getClass(), "totalMapNum", -128435804);
        setLongField(term14838, term14838.getClass(), "totalHiScore", -2986201902216133814L);
        setLongField(term14838, term14838.getClass(), "totalBasicHighScore", 4255811647459029682L);
        setLongField(term14838, term14838.getClass(), "totalAdvancedHighScore", 8000844860910174690L);
        setLongField(term14838, term14838.getClass(), "totalExpertHighScore", 2209808079059619773L);
        setLongField(term14838, term14838.getClass(), "totalMasterHighScore", 8403492202041709902L);
        setIntField(term14925, term14925.getClass(), "year", 2021);
        setShortField(term14925, term14925.getClass(), "month", (short) 8);
        setShortField(term14925, term14925.getClass(), "day", (short) 23);
        setField(term14924, term14924.getClass(), "date", term14925);
        setByteField(term14929, term14929.getClass(), "hour", (byte) 15);
        setByteField(term14929, term14929.getClass(), "minute", (byte) 43);
        setByteField(term14929, term14929.getClass(), "second", (byte) 10);
        setIntField(term14929, term14929.getClass(), "nano", 893504165);
        setField(term14924, term14924.getClass(), "time", term14929);
        setField(term14838, term14838.getClass(), "eventWatchedDate", term14924);
        setIntField(term14838, term14838.getClass(), "friendCount", 2136158480);
        setBooleanField(term14838, term14838.getClass(), "isMaimai", false);
        setField(term14838, term14838.getClass(), "firstGameId", "wrikqJwXvL");
        setField(term14838, term14838.getClass(), "firstRomVersion", "UiWhvbypdr");
        setField(term14838, term14838.getClass(), "firstDataVersion", "CgleElJNje");
        setIntField(term14973, term14973.getClass(), "year", 2015);
        setShortField(term14973, term14973.getClass(), "month", (short) 2);
        setShortField(term14973, term14973.getClass(), "day", (short) 1);
        setField(term14972, term14972.getClass(), "date", term14973);
        setByteField(term14977, term14977.getClass(), "hour", (byte) 11);
        setByteField(term14977, term14977.getClass(), "minute", (byte) 31);
        setByteField(term14977, term14977.getClass(), "second", (byte) 24);
        setIntField(term14977, term14977.getClass(), "nano", 461437823);
        setField(term14972, term14972.getClass(), "time", term14977);
        setField(term14838, term14838.getClass(), "firstPlayDate", term14972);
        setField(term14838, term14838.getClass(), "lastGameId", "ZrchvNGMtd");
        setField(term14838, term14838.getClass(), "lastRomVersion", "WaEcyVlcIx");
        setField(term14838, term14838.getClass(), "lastDataVersion", "ONcbPCQnHd");
        setIntField(term15019, term15019.getClass(), "year", 2012);
        setShortField(term15019, term15019.getClass(), "month", (short) 3);
        setShortField(term15019, term15019.getClass(), "day", (short) 12);
        setField(term15018, term15018.getClass(), "date", term15019);
        setByteField(term15023, term15023.getClass(), "hour", (byte) 0);
        setByteField(term15023, term15023.getClass(), "minute", (byte) 32);
        setByteField(term15023, term15023.getClass(), "second", (byte) 14);
        setIntField(term15023, term15023.getClass(), "nano", 342342345);
        setField(term15018, term15018.getClass(), "time", term15023);
        setField(term14838, term14838.getClass(), "lastPlayDate", term15018);
        setIntField(term14838, term14838.getClass(), "lastPlaceId", 2118747457);
        setField(term14838, term14838.getClass(), "lastPlaceName", "AobDaplFLl");
        setField(term14838, term14838.getClass(), "lastRegionId", "pDkMNnAGgv");
        setField(term14838, term14838.getClass(), "lastRegionName", "PaCpFXGzdX");
        setField(term14838, term14838.getClass(), "lastAllNetId", "FftYCNbnks");
        setField(term14838, term14838.getClass(), "lastClientId", "lJoltmsadS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term14838, args);
    }

};


