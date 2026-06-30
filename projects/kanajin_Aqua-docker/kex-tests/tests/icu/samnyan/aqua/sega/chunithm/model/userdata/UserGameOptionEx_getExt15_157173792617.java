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

public class UserGameOptionEx_getExt15_157173792617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317199;

    public UserGameOptionEx_getExt15_157173792617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317205 = new Long(-8697239524885136781L);
        term317199 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term317201 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term317203 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term317219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317234 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317411 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term317199, term317199.getClass(), "id", -5690880664136761489L);
        setLongField(term317201, term317201.getClass(), "id", -4753867420073453718L);
        setLongField(term317203, term317203.getClass(), "id", 171443579884259369L);
        setField(term317203, term317203.getClass(), "extId", term317205);
        setField(term317203, term317203.getClass(), "luid", "QcmKptYrXb");
        setIntField(term317220, term317220.getClass(), "year", 2012);
        setShortField(term317220, term317220.getClass(), "month", (short) 7);
        setShortField(term317220, term317220.getClass(), "day", (short) 18);
        setField(term317219, term317219.getClass(), "date", term317220);
        setByteField(term317224, term317224.getClass(), "hour", (byte) 2);
        setByteField(term317224, term317224.getClass(), "minute", (byte) 52);
        setByteField(term317224, term317224.getClass(), "second", (byte) 9);
        setIntField(term317224, term317224.getClass(), "nano", 789054430);
        setField(term317219, term317219.getClass(), "time", term317224);
        setField(term317203, term317203.getClass(), "registerTime", term317219);
        setIntField(term317230, term317230.getClass(), "year", 2017);
        setShortField(term317230, term317230.getClass(), "month", (short) 3);
        setShortField(term317230, term317230.getClass(), "day", (short) 20);
        setField(term317229, term317229.getClass(), "date", term317230);
        setByteField(term317234, term317234.getClass(), "hour", (byte) 10);
        setByteField(term317234, term317234.getClass(), "minute", (byte) 26);
        setByteField(term317234, term317234.getClass(), "second", (byte) 45);
        setIntField(term317234, term317234.getClass(), "nano", 578488816);
        setField(term317229, term317229.getClass(), "time", term317234);
        setField(term317203, term317203.getClass(), "accessTime", term317229);
        setField(term317201, term317201.getClass(), "card", term317203);
        setField(term317201, term317201.getClass(), "userName", "KMNJwsKaEB");
        setIntField(term317252, term317252.getClass(), "year", 2026);
        setShortField(term317252, term317252.getClass(), "month", (short) 9);
        setShortField(term317252, term317252.getClass(), "day", (short) 25);
        setField(term317251, term317251.getClass(), "date", term317252);
        setByteField(term317256, term317256.getClass(), "hour", (byte) 16);
        setByteField(term317256, term317256.getClass(), "minute", (byte) 11);
        setByteField(term317256, term317256.getClass(), "second", (byte) 21);
        setIntField(term317256, term317256.getClass(), "nano", 281415461);
        setField(term317251, term317251.getClass(), "time", term317256);
        setField(term317201, term317201.getClass(), "lastLoginDate", term317251);
        setBooleanField(term317201, term317201.getClass(), "isWebJoin", true);
        setField(term317201, term317201.getClass(), "webLimitDate", "lUahSCHKNx");
        setIntField(term317201, term317201.getClass(), "level", -671716918);
        setIntField(term317201, term317201.getClass(), "reincarnationNum", 831156253);
        setField(term317201, term317201.getClass(), "exp", "LElfnxAXwr");
        setLongField(term317201, term317201.getClass(), "point", -901797601509378536L);
        setLongField(term317201, term317201.getClass(), "totalPoint", -2240986930373678636L);
        setIntField(term317201, term317201.getClass(), "playCount", -900204543);
        setIntField(term317201, term317201.getClass(), "multiPlayCount", 1669939159);
        setIntField(term317201, term317201.getClass(), "multiWinCount", 1109628092);
        setIntField(term317201, term317201.getClass(), "requestResCount", -168830883);
        setIntField(term317201, term317201.getClass(), "acceptResCount", -334577229);
        setIntField(term317201, term317201.getClass(), "successResCount", -1229414028);
        setIntField(term317201, term317201.getClass(), "playerRating", 331712720);
        setIntField(term317201, term317201.getClass(), "highestRating", -820459569);
        setIntField(term317201, term317201.getClass(), "nameplateId", -1328851730);
        setIntField(term317201, term317201.getClass(), "frameId", -752678424);
        setIntField(term317201, term317201.getClass(), "characterId", 70725694);
        setIntField(term317201, term317201.getClass(), "trophyId", 1571437956);
        setIntField(term317201, term317201.getClass(), "playedTutorialBit", -146442067);
        setIntField(term317201, term317201.getClass(), "firstTutorialCancelNum", -1025692540);
        setIntField(term317201, term317201.getClass(), "masterTutorialCancelNum", 1743947701);
        setIntField(term317201, term317201.getClass(), "totalRepertoireCount", 78670837);
        setIntField(term317201, term317201.getClass(), "totalMapNum", -1549526395);
        setLongField(term317201, term317201.getClass(), "totalHiScore", 2133592839428936035L);
        setLongField(term317201, term317201.getClass(), "totalBasicHighScore", -2418391248513817762L);
        setLongField(term317201, term317201.getClass(), "totalAdvancedHighScore", -4714635200532185455L);
        setLongField(term317201, term317201.getClass(), "totalExpertHighScore", 5833833394744830629L);
        setLongField(term317201, term317201.getClass(), "totalMasterHighScore", -7573479995177479483L);
        setIntField(term317313, term317313.getClass(), "year", 2015);
        setShortField(term317313, term317313.getClass(), "month", (short) 10);
        setShortField(term317313, term317313.getClass(), "day", (short) 12);
        setField(term317312, term317312.getClass(), "date", term317313);
        setByteField(term317317, term317317.getClass(), "hour", (byte) 20);
        setByteField(term317317, term317317.getClass(), "minute", (byte) 19);
        setByteField(term317317, term317317.getClass(), "second", (byte) 35);
        setIntField(term317317, term317317.getClass(), "nano", 754122973);
        setField(term317312, term317312.getClass(), "time", term317317);
        setField(term317201, term317201.getClass(), "eventWatchedDate", term317312);
        setIntField(term317201, term317201.getClass(), "friendCount", -1175843203);
        setBooleanField(term317201, term317201.getClass(), "isMaimai", true);
        setField(term317201, term317201.getClass(), "firstGameId", "hlySbLstOL");
        setField(term317201, term317201.getClass(), "firstRomVersion", "BrhgoDPjVB");
        setField(term317201, term317201.getClass(), "firstDataVersion", "KtxsyuscWG");
        setIntField(term317361, term317361.getClass(), "year", 2016);
        setShortField(term317361, term317361.getClass(), "month", (short) 4);
        setShortField(term317361, term317361.getClass(), "day", (short) 27);
        setField(term317360, term317360.getClass(), "date", term317361);
        setByteField(term317365, term317365.getClass(), "hour", (byte) 9);
        setByteField(term317365, term317365.getClass(), "minute", (byte) 43);
        setByteField(term317365, term317365.getClass(), "second", (byte) 50);
        setIntField(term317365, term317365.getClass(), "nano", 984325819);
        setField(term317360, term317360.getClass(), "time", term317365);
        setField(term317201, term317201.getClass(), "firstPlayDate", term317360);
        setField(term317201, term317201.getClass(), "lastGameId", "CBimniZbgp");
        setField(term317201, term317201.getClass(), "lastRomVersion", "FeoAVnPhfg");
        setField(term317201, term317201.getClass(), "lastDataVersion", "fTlWYYPrKH");
        setIntField(term317407, term317407.getClass(), "year", 2025);
        setShortField(term317407, term317407.getClass(), "month", (short) 4);
        setShortField(term317407, term317407.getClass(), "day", (short) 30);
        setField(term317406, term317406.getClass(), "date", term317407);
        setByteField(term317411, term317411.getClass(), "hour", (byte) 5);
        setByteField(term317411, term317411.getClass(), "minute", (byte) 42);
        setByteField(term317411, term317411.getClass(), "second", (byte) 13);
        setIntField(term317411, term317411.getClass(), "nano", 922120534);
        setField(term317406, term317406.getClass(), "time", term317411);
        setField(term317201, term317201.getClass(), "lastPlayDate", term317406);
        setIntField(term317201, term317201.getClass(), "lastPlaceId", -146651029);
        setField(term317201, term317201.getClass(), "lastPlaceName", "mfXnrMabia");
        setField(term317201, term317201.getClass(), "lastRegionId", "YelxRvGqHR");
        setField(term317201, term317201.getClass(), "lastRegionName", "XBkEFwWfkh");
        setField(term317201, term317201.getClass(), "lastAllNetId", "ozxxbmxRCe");
        setField(term317201, term317201.getClass(), "lastClientId", "GjUBsfBQMd");
        setField(term317199, term317199.getClass(), "user", term317201);
        setIntField(term317199, term317199.getClass(), "ext1", 1149377423);
        setIntField(term317199, term317199.getClass(), "ext2", -427763498);
        setIntField(term317199, term317199.getClass(), "ext3", 14128917);
        setIntField(term317199, term317199.getClass(), "ext4", 1973133173);
        setIntField(term317199, term317199.getClass(), "ext5", 1880699249);
        setIntField(term317199, term317199.getClass(), "ext6", 828210237);
        setIntField(term317199, term317199.getClass(), "ext7", 617709052);
        setIntField(term317199, term317199.getClass(), "ext8", -1475639720);
        setIntField(term317199, term317199.getClass(), "ext9", -676962701);
        setIntField(term317199, term317199.getClass(), "ext10", -697101236);
        setIntField(term317199, term317199.getClass(), "ext11", -1534444558);
        setIntField(term317199, term317199.getClass(), "ext12", 1271435487);
        setIntField(term317199, term317199.getClass(), "ext13", 1526872682);
        setIntField(term317199, term317199.getClass(), "ext14", 470395773);
        setIntField(term317199, term317199.getClass(), "ext15", 1966072241);
        setIntField(term317199, term317199.getClass(), "ext16", 2108900398);
        setIntField(term317199, term317199.getClass(), "ext17", 1744719785);
        setIntField(term317199, term317199.getClass(), "ext18", 1795343970);
        setIntField(term317199, term317199.getClass(), "ext19", -1650657014);
        setIntField(term317199, term317199.getClass(), "ext20", 2107394839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt15", argTypes, term317199, args);
    }

};


