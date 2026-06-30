package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_equals_35991065925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187103;
     Object term187289;

    public UserMusicDetail_equals_35991065925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187109 = new Long(-6792339614909987294L);
        term187103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term187105 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term187107 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187138 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187103, term187103.getClass(), "id", 3075555699272634645L);
        setLongField(term187105, term187105.getClass(), "id", -7014938412778189699L);
        setLongField(term187107, term187107.getClass(), "id", -5238153807729345644L);
        setField(term187107, term187107.getClass(), "extId", term187109);
        setField(term187107, term187107.getClass(), "luid", "NVbdJpwYOX");
        setIntField(term187124, term187124.getClass(), "year", 2013);
        setShortField(term187124, term187124.getClass(), "month", (short) 2);
        setShortField(term187124, term187124.getClass(), "day", (short) 5);
        setField(term187123, term187123.getClass(), "date", term187124);
        setByteField(term187128, term187128.getClass(), "hour", (byte) 9);
        setByteField(term187128, term187128.getClass(), "minute", (byte) 41);
        setByteField(term187128, term187128.getClass(), "second", (byte) 23);
        setIntField(term187128, term187128.getClass(), "nano", 128082787);
        setField(term187123, term187123.getClass(), "time", term187128);
        setField(term187107, term187107.getClass(), "registerTime", term187123);
        setIntField(term187134, term187134.getClass(), "year", 2028);
        setShortField(term187134, term187134.getClass(), "month", (short) 7);
        setShortField(term187134, term187134.getClass(), "day", (short) 15);
        setField(term187133, term187133.getClass(), "date", term187134);
        setByteField(term187138, term187138.getClass(), "hour", (byte) 2);
        setByteField(term187138, term187138.getClass(), "minute", (byte) 10);
        setByteField(term187138, term187138.getClass(), "second", (byte) 41);
        setIntField(term187138, term187138.getClass(), "nano", 72203883);
        setField(term187133, term187133.getClass(), "time", term187138);
        setField(term187107, term187107.getClass(), "accessTime", term187133);
        setField(term187105, term187105.getClass(), "card", term187107);
        setIntField(term187105, term187105.getClass(), "lastDataVersion", 517297616);
        setField(term187105, term187105.getClass(), "userName", "zDqikHgSHj");
        setIntField(term187105, term187105.getClass(), "point", 707394817);
        setIntField(term187105, term187105.getClass(), "totalPoint", 150740827);
        setIntField(term187105, term187105.getClass(), "iconId", 1814342889);
        setIntField(term187105, term187105.getClass(), "nameplateId", -84407805);
        setIntField(term187105, term187105.getClass(), "frameId", 908432684);
        setIntField(term187105, term187105.getClass(), "trophyId", -1711460389);
        setIntField(term187105, term187105.getClass(), "playCount", -1512364202);
        setIntField(term187105, term187105.getClass(), "playVsCount", -1902545203);
        setIntField(term187105, term187105.getClass(), "playSyncCount", 1140011899);
        setIntField(term187105, term187105.getClass(), "winCount", -456966912);
        setIntField(term187105, term187105.getClass(), "helpCount", 647627686);
        setIntField(term187105, term187105.getClass(), "comboCount", -745139921);
        setIntField(term187105, term187105.getClass(), "feverCount", -1745153304);
        setIntField(term187105, term187105.getClass(), "totalHiScore", -968246568);
        setIntField(term187105, term187105.getClass(), "totalEasyHighScore", -1335969330);
        setIntField(term187105, term187105.getClass(), "totalBasicHighScore", -225280908);
        setIntField(term187105, term187105.getClass(), "totalAdvancedHighScore", 119436095);
        setIntField(term187105, term187105.getClass(), "totalExpertHighScore", 2144217610);
        setIntField(term187105, term187105.getClass(), "totalMasterHighScore", -260970475);
        setIntField(term187105, term187105.getClass(), "totalReMasterHighScore", -1914668834);
        setIntField(term187105, term187105.getClass(), "totalHighSync", -1077375760);
        setIntField(term187105, term187105.getClass(), "totalEasySync", 763912471);
        setIntField(term187105, term187105.getClass(), "totalBasicSync", 543268107);
        setIntField(term187105, term187105.getClass(), "totalAdvancedSync", -277768062);
        setIntField(term187105, term187105.getClass(), "totalExpertSync", 1660579366);
        setIntField(term187105, term187105.getClass(), "totalMasterSync", 1070048738);
        setIntField(term187105, term187105.getClass(), "totalReMasterSync", -1174287174);
        setIntField(term187105, term187105.getClass(), "playerRating", 977657456);
        setIntField(term187105, term187105.getClass(), "highestRating", 1619989783);
        setIntField(term187105, term187105.getClass(), "rankAuthTailId", 285825906);
        setField(term187105, term187105.getClass(), "eventWatchedDate", "JwEjJzczOl");
        setField(term187105, term187105.getClass(), "webLimitDate", "FsIwpRCskv");
        setIntField(term187105, term187105.getClass(), "challengeTrackPhase", -404593381);
        setIntField(term187105, term187105.getClass(), "firstPlayBits", -704467946);
        setField(term187105, term187105.getClass(), "lastPlayDate", "tuIzCHeOzK");
        setIntField(term187105, term187105.getClass(), "lastPlaceId", -269067363);
        setField(term187105, term187105.getClass(), "lastPlaceName", "czPFpmmjeR");
        setIntField(term187105, term187105.getClass(), "lastRegionId", 1101416437);
        setField(term187105, term187105.getClass(), "lastRegionName", "iwjGXKxveT");
        setField(term187105, term187105.getClass(), "lastClientId", "nShYXXfNhZ");
        setField(term187105, term187105.getClass(), "lastCountryCode", "vQjtGUwOfe");
        setIntField(term187105, term187105.getClass(), "eventPoint", 1051571659);
        setIntField(term187105, term187105.getClass(), "totalLv", -549412635);
        setIntField(term187105, term187105.getClass(), "lastLoginBonusDay", 997885957);
        setIntField(term187105, term187105.getClass(), "lastSurvivalBonusDay", -18681);
        setIntField(term187105, term187105.getClass(), "loginBonusLv", -1814487298);
        setField(term187103, term187103.getClass(), "user", term187105);
        setIntField(term187103, term187103.getClass(), "musicId", 786780212);
        setIntField(term187103, term187103.getClass(), "level", -2129815769);
        setIntField(term187103, term187103.getClass(), "playCount", 317062196);
        setIntField(term187103, term187103.getClass(), "scoreMax", 1312635827);
        setIntField(term187103, term187103.getClass(), "syncRateMax", 1623716197);
        setBooleanField(term187103, term187103.getClass(), "isAllPerfect", true);
        setIntField(term187103, term187103.getClass(), "isAllPerfectPlus", 1977127862);
        setIntField(term187103, term187103.getClass(), "fullCombo", 1602623931);
        setIntField(term187103, term187103.getClass(), "maxFever", -1530266839);
        setIntField(term187103, term187103.getClass(), "achievement", 1680764485);
        term187289 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term187289;
        callMethod(klass, "equals", argTypes, term187103, args);
    }

};


