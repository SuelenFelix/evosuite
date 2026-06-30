package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setWebLimitDate_136978077155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152893;

    public UserData_setWebLimitDate_136978077155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152897 = new Long(-6609679920238945303L);
        term152893 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term152895 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152916 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153009 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153057 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153103 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152893, term152893.getClass(), "id", -2609505910844755971L);
        setLongField(term152895, term152895.getClass(), "id", -6795948198960798378L);
        setField(term152895, term152895.getClass(), "extId", term152897);
        setField(term152895, term152895.getClass(), "luid", "gvsjHtWPEw");
        setIntField(term152912, term152912.getClass(), "year", 2025);
        setShortField(term152912, term152912.getClass(), "month", (short) 3);
        setShortField(term152912, term152912.getClass(), "day", (short) 5);
        setField(term152911, term152911.getClass(), "date", term152912);
        setByteField(term152916, term152916.getClass(), "hour", (byte) 14);
        setByteField(term152916, term152916.getClass(), "minute", (byte) 4);
        setByteField(term152916, term152916.getClass(), "second", (byte) 13);
        setIntField(term152916, term152916.getClass(), "nano", 531309146);
        setField(term152911, term152911.getClass(), "time", term152916);
        setField(term152895, term152895.getClass(), "registerTime", term152911);
        setIntField(term152922, term152922.getClass(), "year", 2013);
        setShortField(term152922, term152922.getClass(), "month", (short) 1);
        setShortField(term152922, term152922.getClass(), "day", (short) 20);
        setField(term152921, term152921.getClass(), "date", term152922);
        setByteField(term152926, term152926.getClass(), "hour", (byte) 9);
        setByteField(term152926, term152926.getClass(), "minute", (byte) 37);
        setByteField(term152926, term152926.getClass(), "second", (byte) 32);
        setIntField(term152926, term152926.getClass(), "nano", 102139039);
        setField(term152921, term152921.getClass(), "time", term152926);
        setField(term152895, term152895.getClass(), "accessTime", term152921);
        setField(term152893, term152893.getClass(), "card", term152895);
        setField(term152893, term152893.getClass(), "userName", "eKayOnVsvF");
        setIntField(term152944, term152944.getClass(), "year", 2029);
        setShortField(term152944, term152944.getClass(), "month", (short) 11);
        setShortField(term152944, term152944.getClass(), "day", (short) 4);
        setField(term152943, term152943.getClass(), "date", term152944);
        setByteField(term152948, term152948.getClass(), "hour", (byte) 19);
        setByteField(term152948, term152948.getClass(), "minute", (byte) 6);
        setByteField(term152948, term152948.getClass(), "second", (byte) 44);
        setIntField(term152948, term152948.getClass(), "nano", 887986029);
        setField(term152943, term152943.getClass(), "time", term152948);
        setField(term152893, term152893.getClass(), "lastLoginDate", term152943);
        setBooleanField(term152893, term152893.getClass(), "isWebJoin", false);
        setField(term152893, term152893.getClass(), "webLimitDate", "SWDyPmvaFP");
        setIntField(term152893, term152893.getClass(), "level", -1757025350);
        setIntField(term152893, term152893.getClass(), "reincarnationNum", 241494222);
        setField(term152893, term152893.getClass(), "exp", "NRIcMTUDMt");
        setLongField(term152893, term152893.getClass(), "point", 4909606338440519591L);
        setLongField(term152893, term152893.getClass(), "totalPoint", 2671288000113702709L);
        setIntField(term152893, term152893.getClass(), "playCount", -1394120293);
        setIntField(term152893, term152893.getClass(), "multiPlayCount", 1365082165);
        setIntField(term152893, term152893.getClass(), "multiWinCount", 237330727);
        setIntField(term152893, term152893.getClass(), "requestResCount", 1865561086);
        setIntField(term152893, term152893.getClass(), "acceptResCount", -1717770104);
        setIntField(term152893, term152893.getClass(), "successResCount", 1002436799);
        setIntField(term152893, term152893.getClass(), "playerRating", 491797710);
        setIntField(term152893, term152893.getClass(), "highestRating", -528313320);
        setIntField(term152893, term152893.getClass(), "nameplateId", 1438707097);
        setIntField(term152893, term152893.getClass(), "frameId", -776758828);
        setIntField(term152893, term152893.getClass(), "characterId", -1084450309);
        setIntField(term152893, term152893.getClass(), "trophyId", -701546274);
        setIntField(term152893, term152893.getClass(), "playedTutorialBit", -875355024);
        setIntField(term152893, term152893.getClass(), "firstTutorialCancelNum", -741514277);
        setIntField(term152893, term152893.getClass(), "masterTutorialCancelNum", 1849014808);
        setIntField(term152893, term152893.getClass(), "totalRepertoireCount", 452254325);
        setIntField(term152893, term152893.getClass(), "totalMapNum", 68487577);
        setLongField(term152893, term152893.getClass(), "totalHiScore", -6039086577198085286L);
        setLongField(term152893, term152893.getClass(), "totalBasicHighScore", 4071217913411314763L);
        setLongField(term152893, term152893.getClass(), "totalAdvancedHighScore", -1949784411261393756L);
        setLongField(term152893, term152893.getClass(), "totalExpertHighScore", 4326906202774797079L);
        setLongField(term152893, term152893.getClass(), "totalMasterHighScore", 1631839905932689139L);
        setIntField(term153005, term153005.getClass(), "year", 2021);
        setShortField(term153005, term153005.getClass(), "month", (short) 9);
        setShortField(term153005, term153005.getClass(), "day", (short) 9);
        setField(term153004, term153004.getClass(), "date", term153005);
        setByteField(term153009, term153009.getClass(), "hour", (byte) 7);
        setByteField(term153009, term153009.getClass(), "minute", (byte) 3);
        setByteField(term153009, term153009.getClass(), "second", (byte) 12);
        setIntField(term153009, term153009.getClass(), "nano", 115204198);
        setField(term153004, term153004.getClass(), "time", term153009);
        setField(term152893, term152893.getClass(), "eventWatchedDate", term153004);
        setIntField(term152893, term152893.getClass(), "friendCount", 225702811);
        setBooleanField(term152893, term152893.getClass(), "isMaimai", false);
        setField(term152893, term152893.getClass(), "firstGameId", "QbaWBJMCRe");
        setField(term152893, term152893.getClass(), "firstRomVersion", "JQpscjYgTt");
        setField(term152893, term152893.getClass(), "firstDataVersion", "RLNPkJhVuK");
        setIntField(term153053, term153053.getClass(), "year", 2013);
        setShortField(term153053, term153053.getClass(), "month", (short) 3);
        setShortField(term153053, term153053.getClass(), "day", (short) 13);
        setField(term153052, term153052.getClass(), "date", term153053);
        setByteField(term153057, term153057.getClass(), "hour", (byte) 22);
        setByteField(term153057, term153057.getClass(), "minute", (byte) 50);
        setByteField(term153057, term153057.getClass(), "second", (byte) 5);
        setIntField(term153057, term153057.getClass(), "nano", 379255376);
        setField(term153052, term153052.getClass(), "time", term153057);
        setField(term152893, term152893.getClass(), "firstPlayDate", term153052);
        setField(term152893, term152893.getClass(), "lastGameId", "KqEJftTXuU");
        setField(term152893, term152893.getClass(), "lastRomVersion", "msSGXFHEfu");
        setField(term152893, term152893.getClass(), "lastDataVersion", "AtdQbyrrjU");
        setIntField(term153099, term153099.getClass(), "year", 2024);
        setShortField(term153099, term153099.getClass(), "month", (short) 10);
        setShortField(term153099, term153099.getClass(), "day", (short) 27);
        setField(term153098, term153098.getClass(), "date", term153099);
        setByteField(term153103, term153103.getClass(), "hour", (byte) 23);
        setByteField(term153103, term153103.getClass(), "minute", (byte) 24);
        setByteField(term153103, term153103.getClass(), "second", (byte) 21);
        setIntField(term153103, term153103.getClass(), "nano", 397779681);
        setField(term153098, term153098.getClass(), "time", term153103);
        setField(term152893, term152893.getClass(), "lastPlayDate", term153098);
        setIntField(term152893, term152893.getClass(), "lastPlaceId", 243703890);
        setField(term152893, term152893.getClass(), "lastPlaceName", "qWfJfYLLPv");
        setField(term152893, term152893.getClass(), "lastRegionId", "VZbUjcRZMe");
        setField(term152893, term152893.getClass(), "lastRegionName", "gDouKwsHFO");
        setField(term152893, term152893.getClass(), "lastAllNetId", "LOXLADrcBI");
        setField(term152893, term152893.getClass(), "lastClientId", "BRVeCzWPKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iVfYVgPFch";
        callMethod(klass, "setWebLimitDate", argTypes, term152893, args);
    }

};


