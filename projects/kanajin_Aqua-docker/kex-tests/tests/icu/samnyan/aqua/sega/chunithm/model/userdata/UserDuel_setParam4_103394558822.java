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
import java.lang.Integer;

public class UserDuel_setParam4_103394558822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85101;
     Object term85397;

    public UserDuel_setParam4_103394558822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85107 = new Long(-7278883608542636188L);
        term85101 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term85103 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term85105 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85219 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85313 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85388 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85101, term85101.getClass(), "id", -5687439958444660557L);
        setLongField(term85103, term85103.getClass(), "id", 643414393920888432L);
        setLongField(term85105, term85105.getClass(), "id", -3982367954172699860L);
        setField(term85105, term85105.getClass(), "extId", term85107);
        setField(term85105, term85105.getClass(), "luid", "MgjVPQNbcu");
        setIntField(term85122, term85122.getClass(), "year", 2022);
        setShortField(term85122, term85122.getClass(), "month", (short) 3);
        setShortField(term85122, term85122.getClass(), "day", (short) 7);
        setField(term85121, term85121.getClass(), "date", term85122);
        setByteField(term85126, term85126.getClass(), "hour", (byte) 12);
        setByteField(term85126, term85126.getClass(), "minute", (byte) 16);
        setByteField(term85126, term85126.getClass(), "second", (byte) 2);
        setIntField(term85126, term85126.getClass(), "nano", 451612574);
        setField(term85121, term85121.getClass(), "time", term85126);
        setField(term85105, term85105.getClass(), "registerTime", term85121);
        setIntField(term85132, term85132.getClass(), "year", 2024);
        setShortField(term85132, term85132.getClass(), "month", (short) 11);
        setShortField(term85132, term85132.getClass(), "day", (short) 20);
        setField(term85131, term85131.getClass(), "date", term85132);
        setByteField(term85136, term85136.getClass(), "hour", (byte) 8);
        setByteField(term85136, term85136.getClass(), "minute", (byte) 8);
        setByteField(term85136, term85136.getClass(), "second", (byte) 34);
        setIntField(term85136, term85136.getClass(), "nano", 291120784);
        setField(term85131, term85131.getClass(), "time", term85136);
        setField(term85105, term85105.getClass(), "accessTime", term85131);
        setField(term85103, term85103.getClass(), "card", term85105);
        setField(term85103, term85103.getClass(), "userName", "QNYLGZGxNy");
        setIntField(term85154, term85154.getClass(), "year", 2027);
        setShortField(term85154, term85154.getClass(), "month", (short) 12);
        setShortField(term85154, term85154.getClass(), "day", (short) 16);
        setField(term85153, term85153.getClass(), "date", term85154);
        setByteField(term85158, term85158.getClass(), "hour", (byte) 10);
        setByteField(term85158, term85158.getClass(), "minute", (byte) 23);
        setByteField(term85158, term85158.getClass(), "second", (byte) 56);
        setIntField(term85158, term85158.getClass(), "nano", 246046035);
        setField(term85153, term85153.getClass(), "time", term85158);
        setField(term85103, term85103.getClass(), "lastLoginDate", term85153);
        setBooleanField(term85103, term85103.getClass(), "isWebJoin", true);
        setField(term85103, term85103.getClass(), "webLimitDate", "BrECRdedgj");
        setIntField(term85103, term85103.getClass(), "level", 562568318);
        setIntField(term85103, term85103.getClass(), "reincarnationNum", 297158063);
        setField(term85103, term85103.getClass(), "exp", "lktYSRAAkX");
        setLongField(term85103, term85103.getClass(), "point", 7153115868701511726L);
        setLongField(term85103, term85103.getClass(), "totalPoint", 3042394513611697851L);
        setIntField(term85103, term85103.getClass(), "playCount", -38995653);
        setIntField(term85103, term85103.getClass(), "multiPlayCount", -1893842770);
        setIntField(term85103, term85103.getClass(), "multiWinCount", 2048873968);
        setIntField(term85103, term85103.getClass(), "requestResCount", -1447906264);
        setIntField(term85103, term85103.getClass(), "acceptResCount", 1527786708);
        setIntField(term85103, term85103.getClass(), "successResCount", -360741897);
        setIntField(term85103, term85103.getClass(), "playerRating", 1762652682);
        setIntField(term85103, term85103.getClass(), "highestRating", 1760408647);
        setIntField(term85103, term85103.getClass(), "nameplateId", -1334125536);
        setIntField(term85103, term85103.getClass(), "frameId", -385542140);
        setIntField(term85103, term85103.getClass(), "characterId", -1652323059);
        setIntField(term85103, term85103.getClass(), "trophyId", -1928764789);
        setIntField(term85103, term85103.getClass(), "playedTutorialBit", -673697686);
        setIntField(term85103, term85103.getClass(), "firstTutorialCancelNum", -757914190);
        setIntField(term85103, term85103.getClass(), "masterTutorialCancelNum", 991323397);
        setIntField(term85103, term85103.getClass(), "totalRepertoireCount", -791114332);
        setIntField(term85103, term85103.getClass(), "totalMapNum", 350325506);
        setLongField(term85103, term85103.getClass(), "totalHiScore", 4021900249730695810L);
        setLongField(term85103, term85103.getClass(), "totalBasicHighScore", 3053042769254952980L);
        setLongField(term85103, term85103.getClass(), "totalAdvancedHighScore", -1613345286663863879L);
        setLongField(term85103, term85103.getClass(), "totalExpertHighScore", -8834993911974447264L);
        setLongField(term85103, term85103.getClass(), "totalMasterHighScore", 2641309860463903358L);
        setIntField(term85215, term85215.getClass(), "year", 2019);
        setShortField(term85215, term85215.getClass(), "month", (short) 5);
        setShortField(term85215, term85215.getClass(), "day", (short) 20);
        setField(term85214, term85214.getClass(), "date", term85215);
        setByteField(term85219, term85219.getClass(), "hour", (byte) 15);
        setByteField(term85219, term85219.getClass(), "minute", (byte) 28);
        setByteField(term85219, term85219.getClass(), "second", (byte) 36);
        setIntField(term85219, term85219.getClass(), "nano", 872266428);
        setField(term85214, term85214.getClass(), "time", term85219);
        setField(term85103, term85103.getClass(), "eventWatchedDate", term85214);
        setIntField(term85103, term85103.getClass(), "friendCount", -283849179);
        setBooleanField(term85103, term85103.getClass(), "isMaimai", true);
        setField(term85103, term85103.getClass(), "firstGameId", "KmbCndAIRO");
        setField(term85103, term85103.getClass(), "firstRomVersion", "LfLWkWgTGE");
        setField(term85103, term85103.getClass(), "firstDataVersion", "uleoYrEbgk");
        setIntField(term85263, term85263.getClass(), "year", 2015);
        setShortField(term85263, term85263.getClass(), "month", (short) 5);
        setShortField(term85263, term85263.getClass(), "day", (short) 3);
        setField(term85262, term85262.getClass(), "date", term85263);
        setByteField(term85267, term85267.getClass(), "hour", (byte) 15);
        setByteField(term85267, term85267.getClass(), "minute", (byte) 13);
        setByteField(term85267, term85267.getClass(), "second", (byte) 30);
        setIntField(term85267, term85267.getClass(), "nano", 724073253);
        setField(term85262, term85262.getClass(), "time", term85267);
        setField(term85103, term85103.getClass(), "firstPlayDate", term85262);
        setField(term85103, term85103.getClass(), "lastGameId", "JINAWGBEol");
        setField(term85103, term85103.getClass(), "lastRomVersion", "HZRzxVDGhV");
        setField(term85103, term85103.getClass(), "lastDataVersion", "wOWOSBOjln");
        setIntField(term85309, term85309.getClass(), "year", 2026);
        setShortField(term85309, term85309.getClass(), "month", (short) 2);
        setShortField(term85309, term85309.getClass(), "day", (short) 4);
        setField(term85308, term85308.getClass(), "date", term85309);
        setByteField(term85313, term85313.getClass(), "hour", (byte) 23);
        setByteField(term85313, term85313.getClass(), "minute", (byte) 53);
        setByteField(term85313, term85313.getClass(), "second", (byte) 24);
        setIntField(term85313, term85313.getClass(), "nano", 653800614);
        setField(term85308, term85308.getClass(), "time", term85313);
        setField(term85103, term85103.getClass(), "lastPlayDate", term85308);
        setIntField(term85103, term85103.getClass(), "lastPlaceId", -966646503);
        setField(term85103, term85103.getClass(), "lastPlaceName", "iVXUeGctUB");
        setField(term85103, term85103.getClass(), "lastRegionId", "bmLiVLNmZC");
        setField(term85103, term85103.getClass(), "lastRegionName", "ORExcUfatr");
        setField(term85103, term85103.getClass(), "lastAllNetId", "cUonKmQWCB");
        setField(term85103, term85103.getClass(), "lastClientId", "CvbqWuRute");
        setField(term85101, term85101.getClass(), "user", term85103);
        setIntField(term85101, term85101.getClass(), "duelId", 529842485);
        setIntField(term85101, term85101.getClass(), "progress", -713215300);
        setIntField(term85101, term85101.getClass(), "point", -82690767);
        setBooleanField(term85101, term85101.getClass(), "isClear", false);
        setIntField(term85384, term85384.getClass(), "year", 2020);
        setShortField(term85384, term85384.getClass(), "month", (short) 12);
        setShortField(term85384, term85384.getClass(), "day", (short) 16);
        setField(term85383, term85383.getClass(), "date", term85384);
        setByteField(term85388, term85388.getClass(), "hour", (byte) 16);
        setByteField(term85388, term85388.getClass(), "minute", (byte) 53);
        setByteField(term85388, term85388.getClass(), "second", (byte) 36);
        setIntField(term85388, term85388.getClass(), "nano", 274961864);
        setField(term85383, term85383.getClass(), "time", term85388);
        setField(term85101, term85101.getClass(), "lastPlayDate", term85383);
        setIntField(term85101, term85101.getClass(), "param1", 1511625253);
        setIntField(term85101, term85101.getClass(), "param2", 2133047515);
        setIntField(term85101, term85101.getClass(), "param3", 1448469662);
        setIntField(term85101, term85101.getClass(), "param4", -391447045);
        term85397 = new Integer(-396759931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term85397;
        callMethod(klass, "setParam4", argTypes, term85101, args);
    }

};


