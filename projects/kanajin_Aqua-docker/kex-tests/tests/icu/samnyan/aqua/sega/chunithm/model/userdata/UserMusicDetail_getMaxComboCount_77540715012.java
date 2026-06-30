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

public class UserMusicDetail_getMaxComboCount_77540715012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92983;

    public UserMusicDetail_getMaxComboCount_77540715012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92989 = new Long(-5447369594017685765L);
        term92983 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term92985 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term92987 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93040 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93195 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92983, term92983.getClass(), "id", -2412920067936514032L);
        setLongField(term92985, term92985.getClass(), "id", -1760891577100845054L);
        setLongField(term92987, term92987.getClass(), "id", 2614185242023314675L);
        setField(term92987, term92987.getClass(), "extId", term92989);
        setField(term92987, term92987.getClass(), "luid", "POLJqDqHhk");
        setIntField(term93004, term93004.getClass(), "year", 2013);
        setShortField(term93004, term93004.getClass(), "month", (short) 2);
        setShortField(term93004, term93004.getClass(), "day", (short) 28);
        setField(term93003, term93003.getClass(), "date", term93004);
        setByteField(term93008, term93008.getClass(), "hour", (byte) 15);
        setByteField(term93008, term93008.getClass(), "minute", (byte) 22);
        setByteField(term93008, term93008.getClass(), "second", (byte) 42);
        setIntField(term93008, term93008.getClass(), "nano", 337740978);
        setField(term93003, term93003.getClass(), "time", term93008);
        setField(term92987, term92987.getClass(), "registerTime", term93003);
        setIntField(term93014, term93014.getClass(), "year", 2014);
        setShortField(term93014, term93014.getClass(), "month", (short) 1);
        setShortField(term93014, term93014.getClass(), "day", (short) 2);
        setField(term93013, term93013.getClass(), "date", term93014);
        setByteField(term93018, term93018.getClass(), "hour", (byte) 21);
        setByteField(term93018, term93018.getClass(), "minute", (byte) 53);
        setByteField(term93018, term93018.getClass(), "second", (byte) 5);
        setIntField(term93018, term93018.getClass(), "nano", 277705791);
        setField(term93013, term93013.getClass(), "time", term93018);
        setField(term92987, term92987.getClass(), "accessTime", term93013);
        setField(term92985, term92985.getClass(), "card", term92987);
        setField(term92985, term92985.getClass(), "userName", "eXlhmImRUd");
        setIntField(term93036, term93036.getClass(), "year", 2027);
        setShortField(term93036, term93036.getClass(), "month", (short) 12);
        setShortField(term93036, term93036.getClass(), "day", (short) 28);
        setField(term93035, term93035.getClass(), "date", term93036);
        setByteField(term93040, term93040.getClass(), "hour", (byte) 21);
        setByteField(term93040, term93040.getClass(), "minute", (byte) 39);
        setByteField(term93040, term93040.getClass(), "second", (byte) 50);
        setIntField(term93040, term93040.getClass(), "nano", 376843919);
        setField(term93035, term93035.getClass(), "time", term93040);
        setField(term92985, term92985.getClass(), "lastLoginDate", term93035);
        setBooleanField(term92985, term92985.getClass(), "isWebJoin", false);
        setField(term92985, term92985.getClass(), "webLimitDate", "pNjJQBsfBv");
        setIntField(term92985, term92985.getClass(), "level", 1772604053);
        setIntField(term92985, term92985.getClass(), "reincarnationNum", 704647579);
        setField(term92985, term92985.getClass(), "exp", "AeoFWTVnXE");
        setLongField(term92985, term92985.getClass(), "point", 178361842517537670L);
        setLongField(term92985, term92985.getClass(), "totalPoint", 8420774984276198981L);
        setIntField(term92985, term92985.getClass(), "playCount", -3495334);
        setIntField(term92985, term92985.getClass(), "multiPlayCount", 745336129);
        setIntField(term92985, term92985.getClass(), "multiWinCount", -1700296410);
        setIntField(term92985, term92985.getClass(), "requestResCount", -1568191258);
        setIntField(term92985, term92985.getClass(), "acceptResCount", 1561855050);
        setIntField(term92985, term92985.getClass(), "successResCount", -2098601979);
        setIntField(term92985, term92985.getClass(), "playerRating", 1900897223);
        setIntField(term92985, term92985.getClass(), "highestRating", -1269934000);
        setIntField(term92985, term92985.getClass(), "nameplateId", -565153319);
        setIntField(term92985, term92985.getClass(), "frameId", 769522534);
        setIntField(term92985, term92985.getClass(), "characterId", -1587006706);
        setIntField(term92985, term92985.getClass(), "trophyId", -1232437615);
        setIntField(term92985, term92985.getClass(), "playedTutorialBit", -19383762);
        setIntField(term92985, term92985.getClass(), "firstTutorialCancelNum", 1225890361);
        setIntField(term92985, term92985.getClass(), "masterTutorialCancelNum", 629422211);
        setIntField(term92985, term92985.getClass(), "totalRepertoireCount", 59956966);
        setIntField(term92985, term92985.getClass(), "totalMapNum", -841682366);
        setLongField(term92985, term92985.getClass(), "totalHiScore", 8962086662826420449L);
        setLongField(term92985, term92985.getClass(), "totalBasicHighScore", 4633683327243391760L);
        setLongField(term92985, term92985.getClass(), "totalAdvancedHighScore", -5857237775500629566L);
        setLongField(term92985, term92985.getClass(), "totalExpertHighScore", 6921894188357771660L);
        setLongField(term92985, term92985.getClass(), "totalMasterHighScore", -6433492565384127622L);
        setIntField(term93097, term93097.getClass(), "year", 2023);
        setShortField(term93097, term93097.getClass(), "month", (short) 10);
        setShortField(term93097, term93097.getClass(), "day", (short) 24);
        setField(term93096, term93096.getClass(), "date", term93097);
        setByteField(term93101, term93101.getClass(), "hour", (byte) 23);
        setByteField(term93101, term93101.getClass(), "minute", (byte) 56);
        setByteField(term93101, term93101.getClass(), "second", (byte) 20);
        setIntField(term93101, term93101.getClass(), "nano", 199732424);
        setField(term93096, term93096.getClass(), "time", term93101);
        setField(term92985, term92985.getClass(), "eventWatchedDate", term93096);
        setIntField(term92985, term92985.getClass(), "friendCount", 974285842);
        setBooleanField(term92985, term92985.getClass(), "isMaimai", true);
        setField(term92985, term92985.getClass(), "firstGameId", "KNodpPTOen");
        setField(term92985, term92985.getClass(), "firstRomVersion", "HLdVSdPKUm");
        setField(term92985, term92985.getClass(), "firstDataVersion", "cKqYMrtneQ");
        setIntField(term93145, term93145.getClass(), "year", 2010);
        setShortField(term93145, term93145.getClass(), "month", (short) 11);
        setShortField(term93145, term93145.getClass(), "day", (short) 17);
        setField(term93144, term93144.getClass(), "date", term93145);
        setByteField(term93149, term93149.getClass(), "hour", (byte) 6);
        setByteField(term93149, term93149.getClass(), "minute", (byte) 22);
        setByteField(term93149, term93149.getClass(), "second", (byte) 8);
        setIntField(term93149, term93149.getClass(), "nano", 287083432);
        setField(term93144, term93144.getClass(), "time", term93149);
        setField(term92985, term92985.getClass(), "firstPlayDate", term93144);
        setField(term92985, term92985.getClass(), "lastGameId", "CgvYDHvQnF");
        setField(term92985, term92985.getClass(), "lastRomVersion", "wzvrwvpSgi");
        setField(term92985, term92985.getClass(), "lastDataVersion", "qwrZBRPuHr");
        setIntField(term93191, term93191.getClass(), "year", 2026);
        setShortField(term93191, term93191.getClass(), "month", (short) 1);
        setShortField(term93191, term93191.getClass(), "day", (short) 22);
        setField(term93190, term93190.getClass(), "date", term93191);
        setByteField(term93195, term93195.getClass(), "hour", (byte) 11);
        setByteField(term93195, term93195.getClass(), "minute", (byte) 58);
        setByteField(term93195, term93195.getClass(), "second", (byte) 44);
        setIntField(term93195, term93195.getClass(), "nano", 573755699);
        setField(term93190, term93190.getClass(), "time", term93195);
        setField(term92985, term92985.getClass(), "lastPlayDate", term93190);
        setIntField(term92985, term92985.getClass(), "lastPlaceId", 104380458);
        setField(term92985, term92985.getClass(), "lastPlaceName", "ZlmkgzeZIu");
        setField(term92985, term92985.getClass(), "lastRegionId", "SFuBQQfwki");
        setField(term92985, term92985.getClass(), "lastRegionName", "ryTUTfVgWx");
        setField(term92985, term92985.getClass(), "lastAllNetId", "ImdGsYOHJc");
        setField(term92985, term92985.getClass(), "lastClientId", "MBkxidzets");
        setField(term92983, term92983.getClass(), "user", term92985);
        setIntField(term92983, term92983.getClass(), "musicId", 2035665173);
        setIntField(term92983, term92983.getClass(), "level", 1551975054);
        setIntField(term92983, term92983.getClass(), "playCount", 1198414570);
        setIntField(term92983, term92983.getClass(), "scoreMax", -1816324255);
        setIntField(term92983, term92983.getClass(), "resRequestCount", 989418926);
        setIntField(term92983, term92983.getClass(), "resAcceptCount", -821373946);
        setIntField(term92983, term92983.getClass(), "resSuccessCount", 855942907);
        setIntField(term92983, term92983.getClass(), "missCount", 1739625708);
        setIntField(term92983, term92983.getClass(), "maxComboCount", -323567982);
        setBooleanField(term92983, term92983.getClass(), "isFullCombo", false);
        setBooleanField(term92983, term92983.getClass(), "isAllJustice", false);
        setBooleanField(term92983, term92983.getClass(), "isSuccess", true);
        setIntField(term92983, term92983.getClass(), "fullChain", -64120763);
        setIntField(term92983, term92983.getClass(), "maxChain", 1509055726);
        setIntField(term92983, term92983.getClass(), "scoreRank", -1877152178);
        setBooleanField(term92983, term92983.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxComboCount", argTypes, term92983, args);
    }

};


