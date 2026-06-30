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

public class UserCharacter_setId_178757020512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113278;
     Object term113565;

    public UserCharacter_setId_178757020512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113284 = new Long(1993646237353405740L);
        term113278 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term113280 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term113282 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term113298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113313 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113490 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term113278, term113278.getClass(), "id", 9164839186810859146L);
        setLongField(term113280, term113280.getClass(), "id", -3178643500157507028L);
        setLongField(term113282, term113282.getClass(), "id", -595230351619160986L);
        setField(term113282, term113282.getClass(), "extId", term113284);
        setField(term113282, term113282.getClass(), "luid", "QrXzPOoTMM");
        setIntField(term113299, term113299.getClass(), "year", 2012);
        setShortField(term113299, term113299.getClass(), "month", (short) 4);
        setShortField(term113299, term113299.getClass(), "day", (short) 11);
        setField(term113298, term113298.getClass(), "date", term113299);
        setByteField(term113303, term113303.getClass(), "hour", (byte) 12);
        setByteField(term113303, term113303.getClass(), "minute", (byte) 23);
        setByteField(term113303, term113303.getClass(), "second", (byte) 5);
        setIntField(term113303, term113303.getClass(), "nano", 470048900);
        setField(term113298, term113298.getClass(), "time", term113303);
        setField(term113282, term113282.getClass(), "registerTime", term113298);
        setIntField(term113309, term113309.getClass(), "year", 2012);
        setShortField(term113309, term113309.getClass(), "month", (short) 1);
        setShortField(term113309, term113309.getClass(), "day", (short) 3);
        setField(term113308, term113308.getClass(), "date", term113309);
        setByteField(term113313, term113313.getClass(), "hour", (byte) 7);
        setByteField(term113313, term113313.getClass(), "minute", (byte) 42);
        setByteField(term113313, term113313.getClass(), "second", (byte) 5);
        setIntField(term113313, term113313.getClass(), "nano", 100875675);
        setField(term113308, term113308.getClass(), "time", term113313);
        setField(term113282, term113282.getClass(), "accessTime", term113308);
        setField(term113280, term113280.getClass(), "card", term113282);
        setField(term113280, term113280.getClass(), "userName", "ovDeGFzsPr");
        setIntField(term113331, term113331.getClass(), "year", 2024);
        setShortField(term113331, term113331.getClass(), "month", (short) 5);
        setShortField(term113331, term113331.getClass(), "day", (short) 5);
        setField(term113330, term113330.getClass(), "date", term113331);
        setByteField(term113335, term113335.getClass(), "hour", (byte) 2);
        setByteField(term113335, term113335.getClass(), "minute", (byte) 34);
        setByteField(term113335, term113335.getClass(), "second", (byte) 19);
        setIntField(term113335, term113335.getClass(), "nano", 765186349);
        setField(term113330, term113330.getClass(), "time", term113335);
        setField(term113280, term113280.getClass(), "lastLoginDate", term113330);
        setBooleanField(term113280, term113280.getClass(), "isWebJoin", true);
        setField(term113280, term113280.getClass(), "webLimitDate", "MetUQYZAvL");
        setIntField(term113280, term113280.getClass(), "level", 375888422);
        setIntField(term113280, term113280.getClass(), "reincarnationNum", 1548760361);
        setField(term113280, term113280.getClass(), "exp", "TfZIVTqpIe");
        setLongField(term113280, term113280.getClass(), "point", -5444968106400021040L);
        setLongField(term113280, term113280.getClass(), "totalPoint", 2514186329283267145L);
        setIntField(term113280, term113280.getClass(), "playCount", 558749477);
        setIntField(term113280, term113280.getClass(), "multiPlayCount", -1670336590);
        setIntField(term113280, term113280.getClass(), "multiWinCount", 403038510);
        setIntField(term113280, term113280.getClass(), "requestResCount", 1412304335);
        setIntField(term113280, term113280.getClass(), "acceptResCount", 2118050444);
        setIntField(term113280, term113280.getClass(), "successResCount", -1079036443);
        setIntField(term113280, term113280.getClass(), "playerRating", -1417718040);
        setIntField(term113280, term113280.getClass(), "highestRating", 18353300);
        setIntField(term113280, term113280.getClass(), "nameplateId", 1452754173);
        setIntField(term113280, term113280.getClass(), "frameId", 1189377206);
        setIntField(term113280, term113280.getClass(), "characterId", -748230577);
        setIntField(term113280, term113280.getClass(), "trophyId", 1467449226);
        setIntField(term113280, term113280.getClass(), "playedTutorialBit", 1200062192);
        setIntField(term113280, term113280.getClass(), "firstTutorialCancelNum", -380394398);
        setIntField(term113280, term113280.getClass(), "masterTutorialCancelNum", -1610784102);
        setIntField(term113280, term113280.getClass(), "totalRepertoireCount", -1370330753);
        setIntField(term113280, term113280.getClass(), "totalMapNum", 344676776);
        setLongField(term113280, term113280.getClass(), "totalHiScore", 38977818512796233L);
        setLongField(term113280, term113280.getClass(), "totalBasicHighScore", 672879829116719924L);
        setLongField(term113280, term113280.getClass(), "totalAdvancedHighScore", -6133230556162838255L);
        setLongField(term113280, term113280.getClass(), "totalExpertHighScore", -4333639116826995110L);
        setLongField(term113280, term113280.getClass(), "totalMasterHighScore", -7617231570937544003L);
        setIntField(term113392, term113392.getClass(), "year", 2029);
        setShortField(term113392, term113392.getClass(), "month", (short) 4);
        setShortField(term113392, term113392.getClass(), "day", (short) 8);
        setField(term113391, term113391.getClass(), "date", term113392);
        setByteField(term113396, term113396.getClass(), "hour", (byte) 17);
        setByteField(term113396, term113396.getClass(), "minute", (byte) 10);
        setByteField(term113396, term113396.getClass(), "second", (byte) 59);
        setIntField(term113396, term113396.getClass(), "nano", 199292846);
        setField(term113391, term113391.getClass(), "time", term113396);
        setField(term113280, term113280.getClass(), "eventWatchedDate", term113391);
        setIntField(term113280, term113280.getClass(), "friendCount", -1435671539);
        setBooleanField(term113280, term113280.getClass(), "isMaimai", false);
        setField(term113280, term113280.getClass(), "firstGameId", "DAYFgLtcSK");
        setField(term113280, term113280.getClass(), "firstRomVersion", "yYSkqbbdqk");
        setField(term113280, term113280.getClass(), "firstDataVersion", "pZqOHvYzUt");
        setIntField(term113440, term113440.getClass(), "year", 2019);
        setShortField(term113440, term113440.getClass(), "month", (short) 12);
        setShortField(term113440, term113440.getClass(), "day", (short) 14);
        setField(term113439, term113439.getClass(), "date", term113440);
        setByteField(term113444, term113444.getClass(), "hour", (byte) 15);
        setByteField(term113444, term113444.getClass(), "minute", (byte) 10);
        setByteField(term113444, term113444.getClass(), "second", (byte) 29);
        setIntField(term113444, term113444.getClass(), "nano", 825840251);
        setField(term113439, term113439.getClass(), "time", term113444);
        setField(term113280, term113280.getClass(), "firstPlayDate", term113439);
        setField(term113280, term113280.getClass(), "lastGameId", "DtSvRdcfBd");
        setField(term113280, term113280.getClass(), "lastRomVersion", "rfJbISvNQS");
        setField(term113280, term113280.getClass(), "lastDataVersion", "SoQIwZITjf");
        setIntField(term113486, term113486.getClass(), "year", 2020);
        setShortField(term113486, term113486.getClass(), "month", (short) 4);
        setShortField(term113486, term113486.getClass(), "day", (short) 9);
        setField(term113485, term113485.getClass(), "date", term113486);
        setByteField(term113490, term113490.getClass(), "hour", (byte) 13);
        setByteField(term113490, term113490.getClass(), "minute", (byte) 29);
        setByteField(term113490, term113490.getClass(), "second", (byte) 48);
        setIntField(term113490, term113490.getClass(), "nano", 753514542);
        setField(term113485, term113485.getClass(), "time", term113490);
        setField(term113280, term113280.getClass(), "lastPlayDate", term113485);
        setIntField(term113280, term113280.getClass(), "lastPlaceId", 1697936302);
        setField(term113280, term113280.getClass(), "lastPlaceName", "MuFCHnASsR");
        setField(term113280, term113280.getClass(), "lastRegionId", "lTGjdlngGR");
        setField(term113280, term113280.getClass(), "lastRegionName", "VXtvOjnEqD");
        setField(term113280, term113280.getClass(), "lastAllNetId", "CvLRyPNOVI");
        setField(term113280, term113280.getClass(), "lastClientId", "kGkLTNoGnp");
        setField(term113278, term113278.getClass(), "user", term113280);
        setIntField(term113278, term113278.getClass(), "characterId", 1944775515);
        setIntField(term113278, term113278.getClass(), "playCount", -1473667383);
        setIntField(term113278, term113278.getClass(), "level", 1);
        setIntField(term113278, term113278.getClass(), "skillId", -19932223);
        setIntField(term113278, term113278.getClass(), "friendshipExp", 1845280212);
        setBooleanField(term113278, term113278.getClass(), "isValid", true);
        setBooleanField(term113278, term113278.getClass(), "isNewMark", true);
        setIntField(term113278, term113278.getClass(), "param1", -308191283);
        setIntField(term113278, term113278.getClass(), "param2", -1623247571);
        term113565 = new Long(2030200770029836292L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term113565;
        callMethod(klass, "setId", argTypes, term113278, args);
    }

};


