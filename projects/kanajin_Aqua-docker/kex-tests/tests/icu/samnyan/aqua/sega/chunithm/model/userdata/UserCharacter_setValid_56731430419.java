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
import java.lang.Boolean;

public class UserCharacter_setValid_56731430419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116775;
     Object term117062;

    public UserCharacter_setValid_56731430419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116781 = new Long(-8019730974733786399L);
        term116775 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term116777 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term116779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116987 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116775, term116775.getClass(), "id", -9221881606533616155L);
        setLongField(term116777, term116777.getClass(), "id", -478523971987034249L);
        setLongField(term116779, term116779.getClass(), "id", -1224531332957849467L);
        setField(term116779, term116779.getClass(), "extId", term116781);
        setField(term116779, term116779.getClass(), "luid", "CgnkREXVNP");
        setIntField(term116796, term116796.getClass(), "year", 2021);
        setShortField(term116796, term116796.getClass(), "month", (short) 8);
        setShortField(term116796, term116796.getClass(), "day", (short) 30);
        setField(term116795, term116795.getClass(), "date", term116796);
        setByteField(term116800, term116800.getClass(), "hour", (byte) 7);
        setByteField(term116800, term116800.getClass(), "minute", (byte) 30);
        setByteField(term116800, term116800.getClass(), "second", (byte) 24);
        setIntField(term116800, term116800.getClass(), "nano", 135975029);
        setField(term116795, term116795.getClass(), "time", term116800);
        setField(term116779, term116779.getClass(), "registerTime", term116795);
        setIntField(term116806, term116806.getClass(), "year", 2029);
        setShortField(term116806, term116806.getClass(), "month", (short) 6);
        setShortField(term116806, term116806.getClass(), "day", (short) 29);
        setField(term116805, term116805.getClass(), "date", term116806);
        setByteField(term116810, term116810.getClass(), "hour", (byte) 9);
        setByteField(term116810, term116810.getClass(), "minute", (byte) 30);
        setByteField(term116810, term116810.getClass(), "second", (byte) 16);
        setIntField(term116810, term116810.getClass(), "nano", 591727533);
        setField(term116805, term116805.getClass(), "time", term116810);
        setField(term116779, term116779.getClass(), "accessTime", term116805);
        setField(term116777, term116777.getClass(), "card", term116779);
        setField(term116777, term116777.getClass(), "userName", "mBAKehIGeW");
        setIntField(term116828, term116828.getClass(), "year", 2022);
        setShortField(term116828, term116828.getClass(), "month", (short) 10);
        setShortField(term116828, term116828.getClass(), "day", (short) 14);
        setField(term116827, term116827.getClass(), "date", term116828);
        setByteField(term116832, term116832.getClass(), "hour", (byte) 23);
        setByteField(term116832, term116832.getClass(), "minute", (byte) 2);
        setByteField(term116832, term116832.getClass(), "second", (byte) 20);
        setIntField(term116832, term116832.getClass(), "nano", 37251985);
        setField(term116827, term116827.getClass(), "time", term116832);
        setField(term116777, term116777.getClass(), "lastLoginDate", term116827);
        setBooleanField(term116777, term116777.getClass(), "isWebJoin", false);
        setField(term116777, term116777.getClass(), "webLimitDate", "tmiPUgRXrn");
        setIntField(term116777, term116777.getClass(), "level", -1378850024);
        setIntField(term116777, term116777.getClass(), "reincarnationNum", 1668253019);
        setField(term116777, term116777.getClass(), "exp", "VuZmwqnade");
        setLongField(term116777, term116777.getClass(), "point", -1754875963776707251L);
        setLongField(term116777, term116777.getClass(), "totalPoint", -8762863231523446946L);
        setIntField(term116777, term116777.getClass(), "playCount", 125508778);
        setIntField(term116777, term116777.getClass(), "multiPlayCount", -358007773);
        setIntField(term116777, term116777.getClass(), "multiWinCount", -321103963);
        setIntField(term116777, term116777.getClass(), "requestResCount", 8427599);
        setIntField(term116777, term116777.getClass(), "acceptResCount", 565643760);
        setIntField(term116777, term116777.getClass(), "successResCount", -999329318);
        setIntField(term116777, term116777.getClass(), "playerRating", 1219080873);
        setIntField(term116777, term116777.getClass(), "highestRating", -1369941721);
        setIntField(term116777, term116777.getClass(), "nameplateId", 1986462729);
        setIntField(term116777, term116777.getClass(), "frameId", 1566646372);
        setIntField(term116777, term116777.getClass(), "characterId", 1570723755);
        setIntField(term116777, term116777.getClass(), "trophyId", 1595861707);
        setIntField(term116777, term116777.getClass(), "playedTutorialBit", 2030560074);
        setIntField(term116777, term116777.getClass(), "firstTutorialCancelNum", 961353937);
        setIntField(term116777, term116777.getClass(), "masterTutorialCancelNum", 2105207916);
        setIntField(term116777, term116777.getClass(), "totalRepertoireCount", -1476783213);
        setIntField(term116777, term116777.getClass(), "totalMapNum", -1012030562);
        setLongField(term116777, term116777.getClass(), "totalHiScore", -1440107863491666180L);
        setLongField(term116777, term116777.getClass(), "totalBasicHighScore", -794666317429849604L);
        setLongField(term116777, term116777.getClass(), "totalAdvancedHighScore", 8252743985077808790L);
        setLongField(term116777, term116777.getClass(), "totalExpertHighScore", 7266188540048777915L);
        setLongField(term116777, term116777.getClass(), "totalMasterHighScore", 5879881453700146413L);
        setIntField(term116889, term116889.getClass(), "year", 2027);
        setShortField(term116889, term116889.getClass(), "month", (short) 1);
        setShortField(term116889, term116889.getClass(), "day", (short) 9);
        setField(term116888, term116888.getClass(), "date", term116889);
        setByteField(term116893, term116893.getClass(), "hour", (byte) 15);
        setByteField(term116893, term116893.getClass(), "minute", (byte) 18);
        setByteField(term116893, term116893.getClass(), "second", (byte) 24);
        setIntField(term116893, term116893.getClass(), "nano", 493834528);
        setField(term116888, term116888.getClass(), "time", term116893);
        setField(term116777, term116777.getClass(), "eventWatchedDate", term116888);
        setIntField(term116777, term116777.getClass(), "friendCount", -224086286);
        setBooleanField(term116777, term116777.getClass(), "isMaimai", true);
        setField(term116777, term116777.getClass(), "firstGameId", "ohZrjboUnX");
        setField(term116777, term116777.getClass(), "firstRomVersion", "rwlrpQuNrG");
        setField(term116777, term116777.getClass(), "firstDataVersion", "fctYGLXetS");
        setIntField(term116937, term116937.getClass(), "year", 2017);
        setShortField(term116937, term116937.getClass(), "month", (short) 7);
        setShortField(term116937, term116937.getClass(), "day", (short) 1);
        setField(term116936, term116936.getClass(), "date", term116937);
        setByteField(term116941, term116941.getClass(), "hour", (byte) 10);
        setByteField(term116941, term116941.getClass(), "minute", (byte) 19);
        setByteField(term116941, term116941.getClass(), "second", (byte) 58);
        setIntField(term116941, term116941.getClass(), "nano", 653322054);
        setField(term116936, term116936.getClass(), "time", term116941);
        setField(term116777, term116777.getClass(), "firstPlayDate", term116936);
        setField(term116777, term116777.getClass(), "lastGameId", "UPbgrEUWQD");
        setField(term116777, term116777.getClass(), "lastRomVersion", "HABnTZidNp");
        setField(term116777, term116777.getClass(), "lastDataVersion", "qXysRdBrsg");
        setIntField(term116983, term116983.getClass(), "year", 2017);
        setShortField(term116983, term116983.getClass(), "month", (short) 9);
        setShortField(term116983, term116983.getClass(), "day", (short) 6);
        setField(term116982, term116982.getClass(), "date", term116983);
        setByteField(term116987, term116987.getClass(), "hour", (byte) 2);
        setByteField(term116987, term116987.getClass(), "minute", (byte) 12);
        setByteField(term116987, term116987.getClass(), "second", (byte) 32);
        setIntField(term116987, term116987.getClass(), "nano", 373767065);
        setField(term116982, term116982.getClass(), "time", term116987);
        setField(term116777, term116777.getClass(), "lastPlayDate", term116982);
        setIntField(term116777, term116777.getClass(), "lastPlaceId", -516725720);
        setField(term116777, term116777.getClass(), "lastPlaceName", "hbtKoWkZLU");
        setField(term116777, term116777.getClass(), "lastRegionId", "VCWjXeMQGX");
        setField(term116777, term116777.getClass(), "lastRegionName", "KzrkBfSzqK");
        setField(term116777, term116777.getClass(), "lastAllNetId", "cFNqeNRwhB");
        setField(term116777, term116777.getClass(), "lastClientId", "TQJASDuFUN");
        setField(term116775, term116775.getClass(), "user", term116777);
        setIntField(term116775, term116775.getClass(), "characterId", 2065578304);
        setIntField(term116775, term116775.getClass(), "playCount", 1871438692);
        setIntField(term116775, term116775.getClass(), "level", 1);
        setIntField(term116775, term116775.getClass(), "skillId", 1087029364);
        setIntField(term116775, term116775.getClass(), "friendshipExp", 862581532);
        setBooleanField(term116775, term116775.getClass(), "isValid", true);
        setBooleanField(term116775, term116775.getClass(), "isNewMark", true);
        setIntField(term116775, term116775.getClass(), "param1", -1973508048);
        setIntField(term116775, term116775.getClass(), "param2", 1749871768);
        term117062 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term117062;
        callMethod(klass, "setValid", argTypes, term116775, args);
    }

};


