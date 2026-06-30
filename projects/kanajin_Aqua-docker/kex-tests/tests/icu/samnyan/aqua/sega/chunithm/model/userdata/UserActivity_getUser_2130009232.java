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

public class UserActivity_getUser_2130009232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292268;

    public UserActivity_getUser_2130009232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term292274 = new Long(800893933628130392L);
        term292268 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term292270 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term292272 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term292288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292386 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292434 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term292268, term292268.getClass(), "id", -2322836104787041994L);
        setLongField(term292270, term292270.getClass(), "id", -3184087865960753750L);
        setLongField(term292272, term292272.getClass(), "id", 1368967421869882287L);
        setField(term292272, term292272.getClass(), "extId", term292274);
        setField(term292272, term292272.getClass(), "luid", "AbzkZFggJr");
        setIntField(term292289, term292289.getClass(), "year", 2028);
        setShortField(term292289, term292289.getClass(), "month", (short) 7);
        setShortField(term292289, term292289.getClass(), "day", (short) 4);
        setField(term292288, term292288.getClass(), "date", term292289);
        setByteField(term292293, term292293.getClass(), "hour", (byte) 15);
        setByteField(term292293, term292293.getClass(), "minute", (byte) 40);
        setByteField(term292293, term292293.getClass(), "second", (byte) 27);
        setIntField(term292293, term292293.getClass(), "nano", 731236623);
        setField(term292288, term292288.getClass(), "time", term292293);
        setField(term292272, term292272.getClass(), "registerTime", term292288);
        setIntField(term292299, term292299.getClass(), "year", 2021);
        setShortField(term292299, term292299.getClass(), "month", (short) 9);
        setShortField(term292299, term292299.getClass(), "day", (short) 4);
        setField(term292298, term292298.getClass(), "date", term292299);
        setByteField(term292303, term292303.getClass(), "hour", (byte) 10);
        setByteField(term292303, term292303.getClass(), "minute", (byte) 3);
        setByteField(term292303, term292303.getClass(), "second", (byte) 2);
        setIntField(term292303, term292303.getClass(), "nano", 843741657);
        setField(term292298, term292298.getClass(), "time", term292303);
        setField(term292272, term292272.getClass(), "accessTime", term292298);
        setField(term292270, term292270.getClass(), "card", term292272);
        setField(term292270, term292270.getClass(), "userName", "tslhBSOQwF");
        setIntField(term292321, term292321.getClass(), "year", 2024);
        setShortField(term292321, term292321.getClass(), "month", (short) 10);
        setShortField(term292321, term292321.getClass(), "day", (short) 5);
        setField(term292320, term292320.getClass(), "date", term292321);
        setByteField(term292325, term292325.getClass(), "hour", (byte) 14);
        setByteField(term292325, term292325.getClass(), "minute", (byte) 58);
        setByteField(term292325, term292325.getClass(), "second", (byte) 48);
        setIntField(term292325, term292325.getClass(), "nano", 469204754);
        setField(term292320, term292320.getClass(), "time", term292325);
        setField(term292270, term292270.getClass(), "lastLoginDate", term292320);
        setBooleanField(term292270, term292270.getClass(), "isWebJoin", false);
        setField(term292270, term292270.getClass(), "webLimitDate", "aodFIcJOBQ");
        setIntField(term292270, term292270.getClass(), "level", 907155632);
        setIntField(term292270, term292270.getClass(), "reincarnationNum", 1020668073);
        setField(term292270, term292270.getClass(), "exp", "sTtkOgTFht");
        setLongField(term292270, term292270.getClass(), "point", -4353084055559864019L);
        setLongField(term292270, term292270.getClass(), "totalPoint", -8799574851656203932L);
        setIntField(term292270, term292270.getClass(), "playCount", -455157694);
        setIntField(term292270, term292270.getClass(), "multiPlayCount", 1944477395);
        setIntField(term292270, term292270.getClass(), "multiWinCount", -273262792);
        setIntField(term292270, term292270.getClass(), "requestResCount", -468983435);
        setIntField(term292270, term292270.getClass(), "acceptResCount", -1977167838);
        setIntField(term292270, term292270.getClass(), "successResCount", -214374321);
        setIntField(term292270, term292270.getClass(), "playerRating", 1267044964);
        setIntField(term292270, term292270.getClass(), "highestRating", 1483717887);
        setIntField(term292270, term292270.getClass(), "nameplateId", 424625087);
        setIntField(term292270, term292270.getClass(), "frameId", 884358038);
        setIntField(term292270, term292270.getClass(), "characterId", -1115805891);
        setIntField(term292270, term292270.getClass(), "trophyId", 72821177);
        setIntField(term292270, term292270.getClass(), "playedTutorialBit", 132004149);
        setIntField(term292270, term292270.getClass(), "firstTutorialCancelNum", 1607634065);
        setIntField(term292270, term292270.getClass(), "masterTutorialCancelNum", -844027507);
        setIntField(term292270, term292270.getClass(), "totalRepertoireCount", -35125797);
        setIntField(term292270, term292270.getClass(), "totalMapNum", 732051554);
        setLongField(term292270, term292270.getClass(), "totalHiScore", 9119196902802481035L);
        setLongField(term292270, term292270.getClass(), "totalBasicHighScore", 4931009322006466376L);
        setLongField(term292270, term292270.getClass(), "totalAdvancedHighScore", -8335387959910631302L);
        setLongField(term292270, term292270.getClass(), "totalExpertHighScore", 4470484728975762932L);
        setLongField(term292270, term292270.getClass(), "totalMasterHighScore", -5400620616344659195L);
        setIntField(term292382, term292382.getClass(), "year", 2014);
        setShortField(term292382, term292382.getClass(), "month", (short) 3);
        setShortField(term292382, term292382.getClass(), "day", (short) 2);
        setField(term292381, term292381.getClass(), "date", term292382);
        setByteField(term292386, term292386.getClass(), "hour", (byte) 15);
        setByteField(term292386, term292386.getClass(), "minute", (byte) 38);
        setByteField(term292386, term292386.getClass(), "second", (byte) 1);
        setIntField(term292386, term292386.getClass(), "nano", 887124291);
        setField(term292381, term292381.getClass(), "time", term292386);
        setField(term292270, term292270.getClass(), "eventWatchedDate", term292381);
        setIntField(term292270, term292270.getClass(), "friendCount", -252331317);
        setBooleanField(term292270, term292270.getClass(), "isMaimai", false);
        setField(term292270, term292270.getClass(), "firstGameId", "rlGSusXzPG");
        setField(term292270, term292270.getClass(), "firstRomVersion", "whEcuYLKhg");
        setField(term292270, term292270.getClass(), "firstDataVersion", "gQBDWeRxHb");
        setIntField(term292430, term292430.getClass(), "year", 2013);
        setShortField(term292430, term292430.getClass(), "month", (short) 12);
        setShortField(term292430, term292430.getClass(), "day", (short) 16);
        setField(term292429, term292429.getClass(), "date", term292430);
        setByteField(term292434, term292434.getClass(), "hour", (byte) 6);
        setByteField(term292434, term292434.getClass(), "minute", (byte) 0);
        setByteField(term292434, term292434.getClass(), "second", (byte) 10);
        setIntField(term292434, term292434.getClass(), "nano", 839033189);
        setField(term292429, term292429.getClass(), "time", term292434);
        setField(term292270, term292270.getClass(), "firstPlayDate", term292429);
        setField(term292270, term292270.getClass(), "lastGameId", "yaQlsOUqsP");
        setField(term292270, term292270.getClass(), "lastRomVersion", "YGhgJpKqvy");
        setField(term292270, term292270.getClass(), "lastDataVersion", "wmQJCThqui");
        setIntField(term292476, term292476.getClass(), "year", 2028);
        setShortField(term292476, term292476.getClass(), "month", (short) 10);
        setShortField(term292476, term292476.getClass(), "day", (short) 18);
        setField(term292475, term292475.getClass(), "date", term292476);
        setByteField(term292480, term292480.getClass(), "hour", (byte) 7);
        setByteField(term292480, term292480.getClass(), "minute", (byte) 31);
        setByteField(term292480, term292480.getClass(), "second", (byte) 59);
        setIntField(term292480, term292480.getClass(), "nano", 153815063);
        setField(term292475, term292475.getClass(), "time", term292480);
        setField(term292270, term292270.getClass(), "lastPlayDate", term292475);
        setIntField(term292270, term292270.getClass(), "lastPlaceId", 1228310197);
        setField(term292270, term292270.getClass(), "lastPlaceName", "LPKxpcUvxv");
        setField(term292270, term292270.getClass(), "lastRegionId", "nRWGYtemZz");
        setField(term292270, term292270.getClass(), "lastRegionName", "iRcITsMQmk");
        setField(term292270, term292270.getClass(), "lastAllNetId", "KNlBfmVqJG");
        setField(term292270, term292270.getClass(), "lastClientId", "UEwBYiCmKK");
        setField(term292268, term292268.getClass(), "user", term292270);
        setIntField(term292268, term292268.getClass(), "kind", 700836778);
        setIntField(term292268, term292268.getClass(), "activityId", 2008079324);
        setIntField(term292268, term292268.getClass(), "sortNumber", 554320212);
        setIntField(term292268, term292268.getClass(), "param1", -1547697731);
        setIntField(term292268, term292268.getClass(), "param2", -1886290435);
        setIntField(term292268, term292268.getClass(), "param3", 1460206884);
        setIntField(term292268, term292268.getClass(), "param4", 137412840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term292268, args);
    }

};


