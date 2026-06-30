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

public class UserMusicDetail_isLock_80891308019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96091;

    public UserMusicDetail_isLock_80891308019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96097 = new Long(-1677189124507026637L);
        term96091 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term96093 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term96095 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96303 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96091, term96091.getClass(), "id", -7592880897361848994L);
        setLongField(term96093, term96093.getClass(), "id", -1132124748716009489L);
        setLongField(term96095, term96095.getClass(), "id", 6417149748828373606L);
        setField(term96095, term96095.getClass(), "extId", term96097);
        setField(term96095, term96095.getClass(), "luid", "vDorZRqjUi");
        setIntField(term96112, term96112.getClass(), "year", 2020);
        setShortField(term96112, term96112.getClass(), "month", (short) 8);
        setShortField(term96112, term96112.getClass(), "day", (short) 1);
        setField(term96111, term96111.getClass(), "date", term96112);
        setByteField(term96116, term96116.getClass(), "hour", (byte) 19);
        setByteField(term96116, term96116.getClass(), "minute", (byte) 47);
        setByteField(term96116, term96116.getClass(), "second", (byte) 48);
        setIntField(term96116, term96116.getClass(), "nano", 301525077);
        setField(term96111, term96111.getClass(), "time", term96116);
        setField(term96095, term96095.getClass(), "registerTime", term96111);
        setIntField(term96122, term96122.getClass(), "year", 2029);
        setShortField(term96122, term96122.getClass(), "month", (short) 9);
        setShortField(term96122, term96122.getClass(), "day", (short) 8);
        setField(term96121, term96121.getClass(), "date", term96122);
        setByteField(term96126, term96126.getClass(), "hour", (byte) 1);
        setByteField(term96126, term96126.getClass(), "minute", (byte) 47);
        setByteField(term96126, term96126.getClass(), "second", (byte) 55);
        setIntField(term96126, term96126.getClass(), "nano", 12248155);
        setField(term96121, term96121.getClass(), "time", term96126);
        setField(term96095, term96095.getClass(), "accessTime", term96121);
        setField(term96093, term96093.getClass(), "card", term96095);
        setField(term96093, term96093.getClass(), "userName", "pTjttMNuyX");
        setIntField(term96144, term96144.getClass(), "year", 2012);
        setShortField(term96144, term96144.getClass(), "month", (short) 4);
        setShortField(term96144, term96144.getClass(), "day", (short) 1);
        setField(term96143, term96143.getClass(), "date", term96144);
        setByteField(term96148, term96148.getClass(), "hour", (byte) 22);
        setByteField(term96148, term96148.getClass(), "minute", (byte) 13);
        setByteField(term96148, term96148.getClass(), "second", (byte) 37);
        setIntField(term96148, term96148.getClass(), "nano", 378844188);
        setField(term96143, term96143.getClass(), "time", term96148);
        setField(term96093, term96093.getClass(), "lastLoginDate", term96143);
        setBooleanField(term96093, term96093.getClass(), "isWebJoin", true);
        setField(term96093, term96093.getClass(), "webLimitDate", "fFPyzrPhJi");
        setIntField(term96093, term96093.getClass(), "level", -336930851);
        setIntField(term96093, term96093.getClass(), "reincarnationNum", 1850349935);
        setField(term96093, term96093.getClass(), "exp", "tiYwzLkwHD");
        setLongField(term96093, term96093.getClass(), "point", -4468743939548166452L);
        setLongField(term96093, term96093.getClass(), "totalPoint", -5290478444594322181L);
        setIntField(term96093, term96093.getClass(), "playCount", -1353579264);
        setIntField(term96093, term96093.getClass(), "multiPlayCount", -1995862281);
        setIntField(term96093, term96093.getClass(), "multiWinCount", -64331464);
        setIntField(term96093, term96093.getClass(), "requestResCount", 1814821269);
        setIntField(term96093, term96093.getClass(), "acceptResCount", -2035330261);
        setIntField(term96093, term96093.getClass(), "successResCount", -839111848);
        setIntField(term96093, term96093.getClass(), "playerRating", 1712179237);
        setIntField(term96093, term96093.getClass(), "highestRating", -2122863540);
        setIntField(term96093, term96093.getClass(), "nameplateId", -811923755);
        setIntField(term96093, term96093.getClass(), "frameId", -353643828);
        setIntField(term96093, term96093.getClass(), "characterId", -632794298);
        setIntField(term96093, term96093.getClass(), "trophyId", -530294126);
        setIntField(term96093, term96093.getClass(), "playedTutorialBit", 798290048);
        setIntField(term96093, term96093.getClass(), "firstTutorialCancelNum", 383365811);
        setIntField(term96093, term96093.getClass(), "masterTutorialCancelNum", 140322430);
        setIntField(term96093, term96093.getClass(), "totalRepertoireCount", -1492719591);
        setIntField(term96093, term96093.getClass(), "totalMapNum", 2077964123);
        setLongField(term96093, term96093.getClass(), "totalHiScore", -113007539486440473L);
        setLongField(term96093, term96093.getClass(), "totalBasicHighScore", -616506848183935936L);
        setLongField(term96093, term96093.getClass(), "totalAdvancedHighScore", 6025328557132642962L);
        setLongField(term96093, term96093.getClass(), "totalExpertHighScore", 7776435893105438545L);
        setLongField(term96093, term96093.getClass(), "totalMasterHighScore", 4661005768418307444L);
        setIntField(term96205, term96205.getClass(), "year", 2025);
        setShortField(term96205, term96205.getClass(), "month", (short) 2);
        setShortField(term96205, term96205.getClass(), "day", (short) 8);
        setField(term96204, term96204.getClass(), "date", term96205);
        setByteField(term96209, term96209.getClass(), "hour", (byte) 9);
        setByteField(term96209, term96209.getClass(), "minute", (byte) 56);
        setByteField(term96209, term96209.getClass(), "second", (byte) 54);
        setIntField(term96209, term96209.getClass(), "nano", 637995977);
        setField(term96204, term96204.getClass(), "time", term96209);
        setField(term96093, term96093.getClass(), "eventWatchedDate", term96204);
        setIntField(term96093, term96093.getClass(), "friendCount", 1694212421);
        setBooleanField(term96093, term96093.getClass(), "isMaimai", false);
        setField(term96093, term96093.getClass(), "firstGameId", "vHPMbWTklV");
        setField(term96093, term96093.getClass(), "firstRomVersion", "phgJprcnjd");
        setField(term96093, term96093.getClass(), "firstDataVersion", "RRjrjGfCoC");
        setIntField(term96253, term96253.getClass(), "year", 2018);
        setShortField(term96253, term96253.getClass(), "month", (short) 6);
        setShortField(term96253, term96253.getClass(), "day", (short) 8);
        setField(term96252, term96252.getClass(), "date", term96253);
        setByteField(term96257, term96257.getClass(), "hour", (byte) 23);
        setByteField(term96257, term96257.getClass(), "minute", (byte) 32);
        setByteField(term96257, term96257.getClass(), "second", (byte) 0);
        setIntField(term96257, term96257.getClass(), "nano", 186364385);
        setField(term96252, term96252.getClass(), "time", term96257);
        setField(term96093, term96093.getClass(), "firstPlayDate", term96252);
        setField(term96093, term96093.getClass(), "lastGameId", "MzbYanIDmI");
        setField(term96093, term96093.getClass(), "lastRomVersion", "RYHcwmdSCF");
        setField(term96093, term96093.getClass(), "lastDataVersion", "PbtJLrRbsa");
        setIntField(term96299, term96299.getClass(), "year", 2015);
        setShortField(term96299, term96299.getClass(), "month", (short) 11);
        setShortField(term96299, term96299.getClass(), "day", (short) 5);
        setField(term96298, term96298.getClass(), "date", term96299);
        setByteField(term96303, term96303.getClass(), "hour", (byte) 22);
        setByteField(term96303, term96303.getClass(), "minute", (byte) 42);
        setByteField(term96303, term96303.getClass(), "second", (byte) 31);
        setIntField(term96303, term96303.getClass(), "nano", 474325990);
        setField(term96298, term96298.getClass(), "time", term96303);
        setField(term96093, term96093.getClass(), "lastPlayDate", term96298);
        setIntField(term96093, term96093.getClass(), "lastPlaceId", 1104915674);
        setField(term96093, term96093.getClass(), "lastPlaceName", "iiDSRMEZEA");
        setField(term96093, term96093.getClass(), "lastRegionId", "wBhcQErbFz");
        setField(term96093, term96093.getClass(), "lastRegionName", "iJLzZkhOlH");
        setField(term96093, term96093.getClass(), "lastAllNetId", "GUDWKmTIil");
        setField(term96093, term96093.getClass(), "lastClientId", "hZnzaYDeRe");
        setField(term96091, term96091.getClass(), "user", term96093);
        setIntField(term96091, term96091.getClass(), "musicId", -44179109);
        setIntField(term96091, term96091.getClass(), "level", 248819653);
        setIntField(term96091, term96091.getClass(), "playCount", -429028411);
        setIntField(term96091, term96091.getClass(), "scoreMax", -337757010);
        setIntField(term96091, term96091.getClass(), "resRequestCount", -1192904975);
        setIntField(term96091, term96091.getClass(), "resAcceptCount", 619419155);
        setIntField(term96091, term96091.getClass(), "resSuccessCount", -607185930);
        setIntField(term96091, term96091.getClass(), "missCount", -108242433);
        setIntField(term96091, term96091.getClass(), "maxComboCount", 2045041189);
        setBooleanField(term96091, term96091.getClass(), "isFullCombo", true);
        setBooleanField(term96091, term96091.getClass(), "isAllJustice", false);
        setBooleanField(term96091, term96091.getClass(), "isSuccess", false);
        setIntField(term96091, term96091.getClass(), "fullChain", 1746055569);
        setIntField(term96091, term96091.getClass(), "maxChain", 2048463054);
        setIntField(term96091, term96091.getClass(), "scoreRank", 1251228448);
        setBooleanField(term96091, term96091.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLock", argTypes, term96091, args);
    }

};


