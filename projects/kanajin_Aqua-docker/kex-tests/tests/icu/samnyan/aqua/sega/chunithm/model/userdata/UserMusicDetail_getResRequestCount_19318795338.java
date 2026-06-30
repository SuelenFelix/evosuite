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

public class UserMusicDetail_getResRequestCount_19318795338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91207;

    public UserMusicDetail_getResRequestCount_19318795338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91213 = new Long(3427570961451840069L);
        term91207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term91209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term91211 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91207, term91207.getClass(), "id", 8125394137486820640L);
        setLongField(term91209, term91209.getClass(), "id", -3034337124103524360L);
        setLongField(term91211, term91211.getClass(), "id", 7703860081138133014L);
        setField(term91211, term91211.getClass(), "extId", term91213);
        setField(term91211, term91211.getClass(), "luid", "zdrDwRmBqL");
        setIntField(term91228, term91228.getClass(), "year", 2022);
        setShortField(term91228, term91228.getClass(), "month", (short) 6);
        setShortField(term91228, term91228.getClass(), "day", (short) 19);
        setField(term91227, term91227.getClass(), "date", term91228);
        setByteField(term91232, term91232.getClass(), "hour", (byte) 15);
        setByteField(term91232, term91232.getClass(), "minute", (byte) 38);
        setByteField(term91232, term91232.getClass(), "second", (byte) 10);
        setIntField(term91232, term91232.getClass(), "nano", 24107837);
        setField(term91227, term91227.getClass(), "time", term91232);
        setField(term91211, term91211.getClass(), "registerTime", term91227);
        setIntField(term91238, term91238.getClass(), "year", 2025);
        setShortField(term91238, term91238.getClass(), "month", (short) 3);
        setShortField(term91238, term91238.getClass(), "day", (short) 12);
        setField(term91237, term91237.getClass(), "date", term91238);
        setByteField(term91242, term91242.getClass(), "hour", (byte) 23);
        setByteField(term91242, term91242.getClass(), "minute", (byte) 18);
        setByteField(term91242, term91242.getClass(), "second", (byte) 49);
        setIntField(term91242, term91242.getClass(), "nano", 554399902);
        setField(term91237, term91237.getClass(), "time", term91242);
        setField(term91211, term91211.getClass(), "accessTime", term91237);
        setField(term91209, term91209.getClass(), "card", term91211);
        setField(term91209, term91209.getClass(), "userName", "DhSRNlYOFL");
        setIntField(term91260, term91260.getClass(), "year", 2024);
        setShortField(term91260, term91260.getClass(), "month", (short) 12);
        setShortField(term91260, term91260.getClass(), "day", (short) 11);
        setField(term91259, term91259.getClass(), "date", term91260);
        setByteField(term91264, term91264.getClass(), "hour", (byte) 11);
        setByteField(term91264, term91264.getClass(), "minute", (byte) 16);
        setByteField(term91264, term91264.getClass(), "second", (byte) 31);
        setIntField(term91264, term91264.getClass(), "nano", 556735651);
        setField(term91259, term91259.getClass(), "time", term91264);
        setField(term91209, term91209.getClass(), "lastLoginDate", term91259);
        setBooleanField(term91209, term91209.getClass(), "isWebJoin", false);
        setField(term91209, term91209.getClass(), "webLimitDate", "mrmNORhOYE");
        setIntField(term91209, term91209.getClass(), "level", 1982543201);
        setIntField(term91209, term91209.getClass(), "reincarnationNum", 74831560);
        setField(term91209, term91209.getClass(), "exp", "IAlXRzFnsw");
        setLongField(term91209, term91209.getClass(), "point", -5836140469306562215L);
        setLongField(term91209, term91209.getClass(), "totalPoint", -9007332134350463845L);
        setIntField(term91209, term91209.getClass(), "playCount", 1825435825);
        setIntField(term91209, term91209.getClass(), "multiPlayCount", 1481132137);
        setIntField(term91209, term91209.getClass(), "multiWinCount", -781680177);
        setIntField(term91209, term91209.getClass(), "requestResCount", -897834640);
        setIntField(term91209, term91209.getClass(), "acceptResCount", -375611393);
        setIntField(term91209, term91209.getClass(), "successResCount", -1798238449);
        setIntField(term91209, term91209.getClass(), "playerRating", 470207750);
        setIntField(term91209, term91209.getClass(), "highestRating", -1220080582);
        setIntField(term91209, term91209.getClass(), "nameplateId", -607572941);
        setIntField(term91209, term91209.getClass(), "frameId", 684781565);
        setIntField(term91209, term91209.getClass(), "characterId", -1582304993);
        setIntField(term91209, term91209.getClass(), "trophyId", -1728289450);
        setIntField(term91209, term91209.getClass(), "playedTutorialBit", 1143106804);
        setIntField(term91209, term91209.getClass(), "firstTutorialCancelNum", -574562393);
        setIntField(term91209, term91209.getClass(), "masterTutorialCancelNum", 621957704);
        setIntField(term91209, term91209.getClass(), "totalRepertoireCount", 1938454325);
        setIntField(term91209, term91209.getClass(), "totalMapNum", -1406084415);
        setLongField(term91209, term91209.getClass(), "totalHiScore", 8545694832530342054L);
        setLongField(term91209, term91209.getClass(), "totalBasicHighScore", -2935013818936662643L);
        setLongField(term91209, term91209.getClass(), "totalAdvancedHighScore", -8356746197417996521L);
        setLongField(term91209, term91209.getClass(), "totalExpertHighScore", 1588756868689872678L);
        setLongField(term91209, term91209.getClass(), "totalMasterHighScore", 2841025204772034361L);
        setIntField(term91321, term91321.getClass(), "year", 2020);
        setShortField(term91321, term91321.getClass(), "month", (short) 3);
        setShortField(term91321, term91321.getClass(), "day", (short) 23);
        setField(term91320, term91320.getClass(), "date", term91321);
        setByteField(term91325, term91325.getClass(), "hour", (byte) 7);
        setByteField(term91325, term91325.getClass(), "minute", (byte) 43);
        setByteField(term91325, term91325.getClass(), "second", (byte) 28);
        setIntField(term91325, term91325.getClass(), "nano", 970445056);
        setField(term91320, term91320.getClass(), "time", term91325);
        setField(term91209, term91209.getClass(), "eventWatchedDate", term91320);
        setIntField(term91209, term91209.getClass(), "friendCount", 642206554);
        setBooleanField(term91209, term91209.getClass(), "isMaimai", false);
        setField(term91209, term91209.getClass(), "firstGameId", "QGWHwsqzqh");
        setField(term91209, term91209.getClass(), "firstRomVersion", "HToXzWGnjh");
        setField(term91209, term91209.getClass(), "firstDataVersion", "ymGhnCkAFG");
        setIntField(term91369, term91369.getClass(), "year", 2017);
        setShortField(term91369, term91369.getClass(), "month", (short) 1);
        setShortField(term91369, term91369.getClass(), "day", (short) 5);
        setField(term91368, term91368.getClass(), "date", term91369);
        setByteField(term91373, term91373.getClass(), "hour", (byte) 3);
        setByteField(term91373, term91373.getClass(), "minute", (byte) 28);
        setByteField(term91373, term91373.getClass(), "second", (byte) 15);
        setIntField(term91373, term91373.getClass(), "nano", 137685825);
        setField(term91368, term91368.getClass(), "time", term91373);
        setField(term91209, term91209.getClass(), "firstPlayDate", term91368);
        setField(term91209, term91209.getClass(), "lastGameId", "JYQEoThPjD");
        setField(term91209, term91209.getClass(), "lastRomVersion", "uUYeaeRaCx");
        setField(term91209, term91209.getClass(), "lastDataVersion", "oCpxzVdxcV");
        setIntField(term91415, term91415.getClass(), "year", 2012);
        setShortField(term91415, term91415.getClass(), "month", (short) 5);
        setShortField(term91415, term91415.getClass(), "day", (short) 31);
        setField(term91414, term91414.getClass(), "date", term91415);
        setByteField(term91419, term91419.getClass(), "hour", (byte) 7);
        setByteField(term91419, term91419.getClass(), "minute", (byte) 30);
        setByteField(term91419, term91419.getClass(), "second", (byte) 4);
        setIntField(term91419, term91419.getClass(), "nano", 424757551);
        setField(term91414, term91414.getClass(), "time", term91419);
        setField(term91209, term91209.getClass(), "lastPlayDate", term91414);
        setIntField(term91209, term91209.getClass(), "lastPlaceId", 947904287);
        setField(term91209, term91209.getClass(), "lastPlaceName", "PzNtQwCbTD");
        setField(term91209, term91209.getClass(), "lastRegionId", "wQAefimNLh");
        setField(term91209, term91209.getClass(), "lastRegionName", "NDFbtxRRgi");
        setField(term91209, term91209.getClass(), "lastAllNetId", "vasBXGWtux");
        setField(term91209, term91209.getClass(), "lastClientId", "UfUIICYJWk");
        setField(term91207, term91207.getClass(), "user", term91209);
        setIntField(term91207, term91207.getClass(), "musicId", 1008116811);
        setIntField(term91207, term91207.getClass(), "level", -453969559);
        setIntField(term91207, term91207.getClass(), "playCount", -1976851292);
        setIntField(term91207, term91207.getClass(), "scoreMax", 1007436356);
        setIntField(term91207, term91207.getClass(), "resRequestCount", 953383703);
        setIntField(term91207, term91207.getClass(), "resAcceptCount", 379942336);
        setIntField(term91207, term91207.getClass(), "resSuccessCount", -1553154317);
        setIntField(term91207, term91207.getClass(), "missCount", -1016850135);
        setIntField(term91207, term91207.getClass(), "maxComboCount", 475367008);
        setBooleanField(term91207, term91207.getClass(), "isFullCombo", false);
        setBooleanField(term91207, term91207.getClass(), "isAllJustice", false);
        setBooleanField(term91207, term91207.getClass(), "isSuccess", true);
        setIntField(term91207, term91207.getClass(), "fullChain", -1916736881);
        setIntField(term91207, term91207.getClass(), "maxChain", -1918049413);
        setIntField(term91207, term91207.getClass(), "scoreRank", 786449451);
        setBooleanField(term91207, term91207.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResRequestCount", argTypes, term91207, args);
    }

};


