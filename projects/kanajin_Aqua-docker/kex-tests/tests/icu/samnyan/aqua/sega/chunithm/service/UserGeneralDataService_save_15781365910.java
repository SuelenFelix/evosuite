package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralDataService_save_15781365910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9844;

    public UserGeneralDataService_save_15781365910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9850 = new Long(6855071767938501807L);
        term9844 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term9846 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term9848 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9879 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9844, term9844.getClass(), "id", 1463379874413441830L);
        setLongField(term9846, term9846.getClass(), "id", 7998051124369147543L);
        setLongField(term9848, term9848.getClass(), "id", -1481367303699139651L);
        setField(term9848, term9848.getClass(), "extId", term9850);
        setField(term9848, term9848.getClass(), "luid", "IlBhdrCvHq");
        setIntField(term9865, term9865.getClass(), "year", 2012);
        setShortField(term9865, term9865.getClass(), "month", (short) 6);
        setShortField(term9865, term9865.getClass(), "day", (short) 25);
        setField(term9864, term9864.getClass(), "date", term9865);
        setByteField(term9869, term9869.getClass(), "hour", (byte) 2);
        setByteField(term9869, term9869.getClass(), "minute", (byte) 21);
        setByteField(term9869, term9869.getClass(), "second", (byte) 28);
        setIntField(term9869, term9869.getClass(), "nano", 605177282);
        setField(term9864, term9864.getClass(), "time", term9869);
        setField(term9848, term9848.getClass(), "registerTime", term9864);
        setIntField(term9875, term9875.getClass(), "year", 2016);
        setShortField(term9875, term9875.getClass(), "month", (short) 11);
        setShortField(term9875, term9875.getClass(), "day", (short) 20);
        setField(term9874, term9874.getClass(), "date", term9875);
        setByteField(term9879, term9879.getClass(), "hour", (byte) 17);
        setByteField(term9879, term9879.getClass(), "minute", (byte) 20);
        setByteField(term9879, term9879.getClass(), "second", (byte) 21);
        setIntField(term9879, term9879.getClass(), "nano", 340096364);
        setField(term9874, term9874.getClass(), "time", term9879);
        setField(term9848, term9848.getClass(), "accessTime", term9874);
        setField(term9846, term9846.getClass(), "card", term9848);
        setField(term9846, term9846.getClass(), "userName", "OirVUQhauU");
        setIntField(term9897, term9897.getClass(), "year", 2024);
        setShortField(term9897, term9897.getClass(), "month", (short) 10);
        setShortField(term9897, term9897.getClass(), "day", (short) 28);
        setField(term9896, term9896.getClass(), "date", term9897);
        setByteField(term9901, term9901.getClass(), "hour", (byte) 5);
        setByteField(term9901, term9901.getClass(), "minute", (byte) 13);
        setByteField(term9901, term9901.getClass(), "second", (byte) 51);
        setIntField(term9901, term9901.getClass(), "nano", 605693001);
        setField(term9896, term9896.getClass(), "time", term9901);
        setField(term9846, term9846.getClass(), "lastLoginDate", term9896);
        setBooleanField(term9846, term9846.getClass(), "isWebJoin", false);
        setField(term9846, term9846.getClass(), "webLimitDate", "GLbyDfbNZI");
        setIntField(term9846, term9846.getClass(), "level", -2009613557);
        setIntField(term9846, term9846.getClass(), "reincarnationNum", 654195547);
        setField(term9846, term9846.getClass(), "exp", "oNLcCYDAsO");
        setLongField(term9846, term9846.getClass(), "point", -7709317346333670618L);
        setLongField(term9846, term9846.getClass(), "totalPoint", -1964501434345816975L);
        setIntField(term9846, term9846.getClass(), "playCount", 1622857008);
        setIntField(term9846, term9846.getClass(), "multiPlayCount", 934338954);
        setIntField(term9846, term9846.getClass(), "multiWinCount", 598635505);
        setIntField(term9846, term9846.getClass(), "requestResCount", -944986533);
        setIntField(term9846, term9846.getClass(), "acceptResCount", 1894454926);
        setIntField(term9846, term9846.getClass(), "successResCount", 1415142780);
        setIntField(term9846, term9846.getClass(), "playerRating", -574105759);
        setIntField(term9846, term9846.getClass(), "highestRating", -1165271567);
        setIntField(term9846, term9846.getClass(), "nameplateId", 376834234);
        setIntField(term9846, term9846.getClass(), "frameId", -1911972560);
        setIntField(term9846, term9846.getClass(), "characterId", -642716895);
        setIntField(term9846, term9846.getClass(), "trophyId", 1743398246);
        setIntField(term9846, term9846.getClass(), "playedTutorialBit", -934658823);
        setIntField(term9846, term9846.getClass(), "firstTutorialCancelNum", 1632177303);
        setIntField(term9846, term9846.getClass(), "masterTutorialCancelNum", -802592348);
        setIntField(term9846, term9846.getClass(), "totalRepertoireCount", -1576584269);
        setIntField(term9846, term9846.getClass(), "totalMapNum", 1474899591);
        setLongField(term9846, term9846.getClass(), "totalHiScore", 4689907154423223972L);
        setLongField(term9846, term9846.getClass(), "totalBasicHighScore", 8512025621149521819L);
        setLongField(term9846, term9846.getClass(), "totalAdvancedHighScore", 2022482096970820459L);
        setLongField(term9846, term9846.getClass(), "totalExpertHighScore", 6315101499811179240L);
        setLongField(term9846, term9846.getClass(), "totalMasterHighScore", -3033337370154155851L);
        setIntField(term9958, term9958.getClass(), "year", 2029);
        setShortField(term9958, term9958.getClass(), "month", (short) 7);
        setShortField(term9958, term9958.getClass(), "day", (short) 19);
        setField(term9957, term9957.getClass(), "date", term9958);
        setByteField(term9962, term9962.getClass(), "hour", (byte) 4);
        setByteField(term9962, term9962.getClass(), "minute", (byte) 38);
        setByteField(term9962, term9962.getClass(), "second", (byte) 15);
        setIntField(term9962, term9962.getClass(), "nano", 260833456);
        setField(term9957, term9957.getClass(), "time", term9962);
        setField(term9846, term9846.getClass(), "eventWatchedDate", term9957);
        setIntField(term9846, term9846.getClass(), "friendCount", 297582552);
        setBooleanField(term9846, term9846.getClass(), "isMaimai", false);
        setField(term9846, term9846.getClass(), "firstGameId", "CNqMxLvtcJ");
        setField(term9846, term9846.getClass(), "firstRomVersion", "ktbqerIaKW");
        setField(term9846, term9846.getClass(), "firstDataVersion", "VoghngXfsK");
        setIntField(term10006, term10006.getClass(), "year", 2019);
        setShortField(term10006, term10006.getClass(), "month", (short) 12);
        setShortField(term10006, term10006.getClass(), "day", (short) 13);
        setField(term10005, term10005.getClass(), "date", term10006);
        setByteField(term10010, term10010.getClass(), "hour", (byte) 17);
        setByteField(term10010, term10010.getClass(), "minute", (byte) 38);
        setByteField(term10010, term10010.getClass(), "second", (byte) 43);
        setIntField(term10010, term10010.getClass(), "nano", 435007801);
        setField(term10005, term10005.getClass(), "time", term10010);
        setField(term9846, term9846.getClass(), "firstPlayDate", term10005);
        setField(term9846, term9846.getClass(), "lastGameId", "GbahCBMvct");
        setField(term9846, term9846.getClass(), "lastRomVersion", "iiHBhsNFgk");
        setField(term9846, term9846.getClass(), "lastDataVersion", "HknsTajwxJ");
        setIntField(term10052, term10052.getClass(), "year", 2017);
        setShortField(term10052, term10052.getClass(), "month", (short) 8);
        setShortField(term10052, term10052.getClass(), "day", (short) 6);
        setField(term10051, term10051.getClass(), "date", term10052);
        setByteField(term10056, term10056.getClass(), "hour", (byte) 22);
        setByteField(term10056, term10056.getClass(), "minute", (byte) 46);
        setByteField(term10056, term10056.getClass(), "second", (byte) 47);
        setIntField(term10056, term10056.getClass(), "nano", 782967389);
        setField(term10051, term10051.getClass(), "time", term10056);
        setField(term9846, term9846.getClass(), "lastPlayDate", term10051);
        setIntField(term9846, term9846.getClass(), "lastPlaceId", -1485916498);
        setField(term9846, term9846.getClass(), "lastPlaceName", "XtiurrVYKw");
        setField(term9846, term9846.getClass(), "lastRegionId", "rsumfoDNHa");
        setField(term9846, term9846.getClass(), "lastRegionName", "ceCWHUTQUM");
        setField(term9846, term9846.getClass(), "lastAllNetId", "LrqwfrKKtS");
        setField(term9846, term9846.getClass(), "lastClientId", "ZUdnQXfzCI");
        setField(term9844, term9844.getClass(), "user", term9846);
        setField(term9844, term9844.getClass(), "propertyKey", "EULDrUNQvw");
        setField(term9844, term9844.getClass(), "propertyValue", "BtvAvsJSei");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGeneralDataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Object[] args = new Object[1];
        args[0] = term9844;
        callMethod(klass, "save", argTypes, null, args);
    }

};


