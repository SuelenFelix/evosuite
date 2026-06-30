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

public class UserDuel_setProgress_61320728215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81957;
     Object term82253;

    public UserDuel_setProgress_61320728215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term81963 = new Long(-1333707622307134180L);
        term81957 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term81959 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term81961 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term81977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82014 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82075 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82123 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82169 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82244 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term81957, term81957.getClass(), "id", -3159920279724689717L);
        setLongField(term81959, term81959.getClass(), "id", -2357799544049443716L);
        setLongField(term81961, term81961.getClass(), "id", 5316576314473126985L);
        setField(term81961, term81961.getClass(), "extId", term81963);
        setField(term81961, term81961.getClass(), "luid", "zoVKwYYMOI");
        setIntField(term81978, term81978.getClass(), "year", 2028);
        setShortField(term81978, term81978.getClass(), "month", (short) 12);
        setShortField(term81978, term81978.getClass(), "day", (short) 5);
        setField(term81977, term81977.getClass(), "date", term81978);
        setByteField(term81982, term81982.getClass(), "hour", (byte) 0);
        setByteField(term81982, term81982.getClass(), "minute", (byte) 4);
        setByteField(term81982, term81982.getClass(), "second", (byte) 24);
        setIntField(term81982, term81982.getClass(), "nano", 25841507);
        setField(term81977, term81977.getClass(), "time", term81982);
        setField(term81961, term81961.getClass(), "registerTime", term81977);
        setIntField(term81988, term81988.getClass(), "year", 2012);
        setShortField(term81988, term81988.getClass(), "month", (short) 2);
        setShortField(term81988, term81988.getClass(), "day", (short) 25);
        setField(term81987, term81987.getClass(), "date", term81988);
        setByteField(term81992, term81992.getClass(), "hour", (byte) 23);
        setByteField(term81992, term81992.getClass(), "minute", (byte) 35);
        setByteField(term81992, term81992.getClass(), "second", (byte) 51);
        setIntField(term81992, term81992.getClass(), "nano", 181227985);
        setField(term81987, term81987.getClass(), "time", term81992);
        setField(term81961, term81961.getClass(), "accessTime", term81987);
        setField(term81959, term81959.getClass(), "card", term81961);
        setField(term81959, term81959.getClass(), "userName", "DGCeQsmIOU");
        setIntField(term82010, term82010.getClass(), "year", 2019);
        setShortField(term82010, term82010.getClass(), "month", (short) 1);
        setShortField(term82010, term82010.getClass(), "day", (short) 9);
        setField(term82009, term82009.getClass(), "date", term82010);
        setByteField(term82014, term82014.getClass(), "hour", (byte) 16);
        setByteField(term82014, term82014.getClass(), "minute", (byte) 39);
        setByteField(term82014, term82014.getClass(), "second", (byte) 1);
        setIntField(term82014, term82014.getClass(), "nano", 715938448);
        setField(term82009, term82009.getClass(), "time", term82014);
        setField(term81959, term81959.getClass(), "lastLoginDate", term82009);
        setBooleanField(term81959, term81959.getClass(), "isWebJoin", true);
        setField(term81959, term81959.getClass(), "webLimitDate", "otcpSHwkzG");
        setIntField(term81959, term81959.getClass(), "level", 1269448265);
        setIntField(term81959, term81959.getClass(), "reincarnationNum", 1407128598);
        setField(term81959, term81959.getClass(), "exp", "BixZhUjVme");
        setLongField(term81959, term81959.getClass(), "point", 6119456969796759152L);
        setLongField(term81959, term81959.getClass(), "totalPoint", -3359440850156242734L);
        setIntField(term81959, term81959.getClass(), "playCount", -799093829);
        setIntField(term81959, term81959.getClass(), "multiPlayCount", 432526848);
        setIntField(term81959, term81959.getClass(), "multiWinCount", 1875904227);
        setIntField(term81959, term81959.getClass(), "requestResCount", -273652787);
        setIntField(term81959, term81959.getClass(), "acceptResCount", -20800272);
        setIntField(term81959, term81959.getClass(), "successResCount", -2012090266);
        setIntField(term81959, term81959.getClass(), "playerRating", 1298920245);
        setIntField(term81959, term81959.getClass(), "highestRating", 1539128914);
        setIntField(term81959, term81959.getClass(), "nameplateId", 627813167);
        setIntField(term81959, term81959.getClass(), "frameId", -2047312469);
        setIntField(term81959, term81959.getClass(), "characterId", 38231753);
        setIntField(term81959, term81959.getClass(), "trophyId", 1404509429);
        setIntField(term81959, term81959.getClass(), "playedTutorialBit", -438218058);
        setIntField(term81959, term81959.getClass(), "firstTutorialCancelNum", -1026369377);
        setIntField(term81959, term81959.getClass(), "masterTutorialCancelNum", 1373311750);
        setIntField(term81959, term81959.getClass(), "totalRepertoireCount", 1699366);
        setIntField(term81959, term81959.getClass(), "totalMapNum", 692170348);
        setLongField(term81959, term81959.getClass(), "totalHiScore", -8891224677821082964L);
        setLongField(term81959, term81959.getClass(), "totalBasicHighScore", 673942798641120020L);
        setLongField(term81959, term81959.getClass(), "totalAdvancedHighScore", 2453638512947169594L);
        setLongField(term81959, term81959.getClass(), "totalExpertHighScore", -6286554265404073084L);
        setLongField(term81959, term81959.getClass(), "totalMasterHighScore", -1789728735275535628L);
        setIntField(term82071, term82071.getClass(), "year", 2014);
        setShortField(term82071, term82071.getClass(), "month", (short) 8);
        setShortField(term82071, term82071.getClass(), "day", (short) 3);
        setField(term82070, term82070.getClass(), "date", term82071);
        setByteField(term82075, term82075.getClass(), "hour", (byte) 5);
        setByteField(term82075, term82075.getClass(), "minute", (byte) 41);
        setByteField(term82075, term82075.getClass(), "second", (byte) 29);
        setIntField(term82075, term82075.getClass(), "nano", 782499753);
        setField(term82070, term82070.getClass(), "time", term82075);
        setField(term81959, term81959.getClass(), "eventWatchedDate", term82070);
        setIntField(term81959, term81959.getClass(), "friendCount", -1022512329);
        setBooleanField(term81959, term81959.getClass(), "isMaimai", false);
        setField(term81959, term81959.getClass(), "firstGameId", "BmnUezUoWz");
        setField(term81959, term81959.getClass(), "firstRomVersion", "QqeCgeRpIS");
        setField(term81959, term81959.getClass(), "firstDataVersion", "xVwossmLda");
        setIntField(term82119, term82119.getClass(), "year", 2021);
        setShortField(term82119, term82119.getClass(), "month", (short) 3);
        setShortField(term82119, term82119.getClass(), "day", (short) 14);
        setField(term82118, term82118.getClass(), "date", term82119);
        setByteField(term82123, term82123.getClass(), "hour", (byte) 19);
        setByteField(term82123, term82123.getClass(), "minute", (byte) 26);
        setByteField(term82123, term82123.getClass(), "second", (byte) 19);
        setIntField(term82123, term82123.getClass(), "nano", 18560091);
        setField(term82118, term82118.getClass(), "time", term82123);
        setField(term81959, term81959.getClass(), "firstPlayDate", term82118);
        setField(term81959, term81959.getClass(), "lastGameId", "EvSQeALexj");
        setField(term81959, term81959.getClass(), "lastRomVersion", "VuprBjhWdI");
        setField(term81959, term81959.getClass(), "lastDataVersion", "CFGOXMbAUn");
        setIntField(term82165, term82165.getClass(), "year", 2022);
        setShortField(term82165, term82165.getClass(), "month", (short) 7);
        setShortField(term82165, term82165.getClass(), "day", (short) 30);
        setField(term82164, term82164.getClass(), "date", term82165);
        setByteField(term82169, term82169.getClass(), "hour", (byte) 14);
        setByteField(term82169, term82169.getClass(), "minute", (byte) 34);
        setByteField(term82169, term82169.getClass(), "second", (byte) 38);
        setIntField(term82169, term82169.getClass(), "nano", 597227850);
        setField(term82164, term82164.getClass(), "time", term82169);
        setField(term81959, term81959.getClass(), "lastPlayDate", term82164);
        setIntField(term81959, term81959.getClass(), "lastPlaceId", 201236178);
        setField(term81959, term81959.getClass(), "lastPlaceName", "OxlZVhvedR");
        setField(term81959, term81959.getClass(), "lastRegionId", "eoDtSQyUsr");
        setField(term81959, term81959.getClass(), "lastRegionName", "RMTgBohsAX");
        setField(term81959, term81959.getClass(), "lastAllNetId", "kdYeXJnJGG");
        setField(term81959, term81959.getClass(), "lastClientId", "XEdoshuvxD");
        setField(term81957, term81957.getClass(), "user", term81959);
        setIntField(term81957, term81957.getClass(), "duelId", 985775690);
        setIntField(term81957, term81957.getClass(), "progress", 1159262757);
        setIntField(term81957, term81957.getClass(), "point", 967155072);
        setBooleanField(term81957, term81957.getClass(), "isClear", true);
        setIntField(term82240, term82240.getClass(), "year", 2012);
        setShortField(term82240, term82240.getClass(), "month", (short) 10);
        setShortField(term82240, term82240.getClass(), "day", (short) 1);
        setField(term82239, term82239.getClass(), "date", term82240);
        setByteField(term82244, term82244.getClass(), "hour", (byte) 19);
        setByteField(term82244, term82244.getClass(), "minute", (byte) 43);
        setByteField(term82244, term82244.getClass(), "second", (byte) 49);
        setIntField(term82244, term82244.getClass(), "nano", 81513180);
        setField(term82239, term82239.getClass(), "time", term82244);
        setField(term81957, term81957.getClass(), "lastPlayDate", term82239);
        setIntField(term81957, term81957.getClass(), "param1", 1011025023);
        setIntField(term81957, term81957.getClass(), "param2", 921803217);
        setIntField(term81957, term81957.getClass(), "param3", 2011014435);
        setIntField(term81957, term81957.getClass(), "param4", 256804816);
        term82253 = new Integer(-726670877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82253;
        callMethod(klass, "setProgress", argTypes, term81957, args);
    }

};


