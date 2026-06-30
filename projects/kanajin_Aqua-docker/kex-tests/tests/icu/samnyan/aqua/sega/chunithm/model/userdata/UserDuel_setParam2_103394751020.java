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

public class UserDuel_setParam2_103394751020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84205;
     Object term84501;

    public UserDuel_setParam2_103394751020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84211 = new Long(-7884871963229073324L);
        term84205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term84207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term84209 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84230 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84371 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84417 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84205, term84205.getClass(), "id", -5089949977716478457L);
        setLongField(term84207, term84207.getClass(), "id", -3603009652560084801L);
        setLongField(term84209, term84209.getClass(), "id", -6386251470690822466L);
        setField(term84209, term84209.getClass(), "extId", term84211);
        setField(term84209, term84209.getClass(), "luid", "tVsPWASlsh");
        setIntField(term84226, term84226.getClass(), "year", 2025);
        setShortField(term84226, term84226.getClass(), "month", (short) 11);
        setShortField(term84226, term84226.getClass(), "day", (short) 28);
        setField(term84225, term84225.getClass(), "date", term84226);
        setByteField(term84230, term84230.getClass(), "hour", (byte) 0);
        setByteField(term84230, term84230.getClass(), "minute", (byte) 44);
        setByteField(term84230, term84230.getClass(), "second", (byte) 24);
        setIntField(term84230, term84230.getClass(), "nano", 379204030);
        setField(term84225, term84225.getClass(), "time", term84230);
        setField(term84209, term84209.getClass(), "registerTime", term84225);
        setIntField(term84236, term84236.getClass(), "year", 2019);
        setShortField(term84236, term84236.getClass(), "month", (short) 11);
        setShortField(term84236, term84236.getClass(), "day", (short) 16);
        setField(term84235, term84235.getClass(), "date", term84236);
        setByteField(term84240, term84240.getClass(), "hour", (byte) 6);
        setByteField(term84240, term84240.getClass(), "minute", (byte) 19);
        setByteField(term84240, term84240.getClass(), "second", (byte) 5);
        setIntField(term84240, term84240.getClass(), "nano", 858000554);
        setField(term84235, term84235.getClass(), "time", term84240);
        setField(term84209, term84209.getClass(), "accessTime", term84235);
        setField(term84207, term84207.getClass(), "card", term84209);
        setField(term84207, term84207.getClass(), "userName", "PjZoebHrvq");
        setIntField(term84258, term84258.getClass(), "year", 2022);
        setShortField(term84258, term84258.getClass(), "month", (short) 6);
        setShortField(term84258, term84258.getClass(), "day", (short) 15);
        setField(term84257, term84257.getClass(), "date", term84258);
        setByteField(term84262, term84262.getClass(), "hour", (byte) 22);
        setByteField(term84262, term84262.getClass(), "minute", (byte) 45);
        setByteField(term84262, term84262.getClass(), "second", (byte) 15);
        setIntField(term84262, term84262.getClass(), "nano", 210438417);
        setField(term84257, term84257.getClass(), "time", term84262);
        setField(term84207, term84207.getClass(), "lastLoginDate", term84257);
        setBooleanField(term84207, term84207.getClass(), "isWebJoin", false);
        setField(term84207, term84207.getClass(), "webLimitDate", "VwpicfUdWr");
        setIntField(term84207, term84207.getClass(), "level", 1108791337);
        setIntField(term84207, term84207.getClass(), "reincarnationNum", -414682663);
        setField(term84207, term84207.getClass(), "exp", "UDKBkeWilS");
        setLongField(term84207, term84207.getClass(), "point", -8340412977479666356L);
        setLongField(term84207, term84207.getClass(), "totalPoint", 5072151233307900881L);
        setIntField(term84207, term84207.getClass(), "playCount", 259051944);
        setIntField(term84207, term84207.getClass(), "multiPlayCount", -958789263);
        setIntField(term84207, term84207.getClass(), "multiWinCount", 120623003);
        setIntField(term84207, term84207.getClass(), "requestResCount", -1236935869);
        setIntField(term84207, term84207.getClass(), "acceptResCount", -1707868253);
        setIntField(term84207, term84207.getClass(), "successResCount", 487083950);
        setIntField(term84207, term84207.getClass(), "playerRating", 33771952);
        setIntField(term84207, term84207.getClass(), "highestRating", -732008756);
        setIntField(term84207, term84207.getClass(), "nameplateId", -1750902922);
        setIntField(term84207, term84207.getClass(), "frameId", -1037994843);
        setIntField(term84207, term84207.getClass(), "characterId", 727200615);
        setIntField(term84207, term84207.getClass(), "trophyId", -308494890);
        setIntField(term84207, term84207.getClass(), "playedTutorialBit", -1113508392);
        setIntField(term84207, term84207.getClass(), "firstTutorialCancelNum", 31876246);
        setIntField(term84207, term84207.getClass(), "masterTutorialCancelNum", 55952895);
        setIntField(term84207, term84207.getClass(), "totalRepertoireCount", -1961513935);
        setIntField(term84207, term84207.getClass(), "totalMapNum", -22602260);
        setLongField(term84207, term84207.getClass(), "totalHiScore", 2250556415549346949L);
        setLongField(term84207, term84207.getClass(), "totalBasicHighScore", -4674840583005034118L);
        setLongField(term84207, term84207.getClass(), "totalAdvancedHighScore", 3952299423271006072L);
        setLongField(term84207, term84207.getClass(), "totalExpertHighScore", 6681879584837155391L);
        setLongField(term84207, term84207.getClass(), "totalMasterHighScore", 5457987117152229930L);
        setIntField(term84319, term84319.getClass(), "year", 2028);
        setShortField(term84319, term84319.getClass(), "month", (short) 5);
        setShortField(term84319, term84319.getClass(), "day", (short) 11);
        setField(term84318, term84318.getClass(), "date", term84319);
        setByteField(term84323, term84323.getClass(), "hour", (byte) 1);
        setByteField(term84323, term84323.getClass(), "minute", (byte) 18);
        setByteField(term84323, term84323.getClass(), "second", (byte) 27);
        setIntField(term84323, term84323.getClass(), "nano", 514067112);
        setField(term84318, term84318.getClass(), "time", term84323);
        setField(term84207, term84207.getClass(), "eventWatchedDate", term84318);
        setIntField(term84207, term84207.getClass(), "friendCount", -1494996615);
        setBooleanField(term84207, term84207.getClass(), "isMaimai", true);
        setField(term84207, term84207.getClass(), "firstGameId", "bNeNAYRdqb");
        setField(term84207, term84207.getClass(), "firstRomVersion", "dcGBEVfYLI");
        setField(term84207, term84207.getClass(), "firstDataVersion", "AbYQkbUCWK");
        setIntField(term84367, term84367.getClass(), "year", 2025);
        setShortField(term84367, term84367.getClass(), "month", (short) 4);
        setShortField(term84367, term84367.getClass(), "day", (short) 11);
        setField(term84366, term84366.getClass(), "date", term84367);
        setByteField(term84371, term84371.getClass(), "hour", (byte) 5);
        setByteField(term84371, term84371.getClass(), "minute", (byte) 16);
        setByteField(term84371, term84371.getClass(), "second", (byte) 25);
        setIntField(term84371, term84371.getClass(), "nano", 178363433);
        setField(term84366, term84366.getClass(), "time", term84371);
        setField(term84207, term84207.getClass(), "firstPlayDate", term84366);
        setField(term84207, term84207.getClass(), "lastGameId", "PjENVjWdrp");
        setField(term84207, term84207.getClass(), "lastRomVersion", "nNjXJbBqnD");
        setField(term84207, term84207.getClass(), "lastDataVersion", "IPIWZFytSS");
        setIntField(term84413, term84413.getClass(), "year", 2025);
        setShortField(term84413, term84413.getClass(), "month", (short) 8);
        setShortField(term84413, term84413.getClass(), "day", (short) 12);
        setField(term84412, term84412.getClass(), "date", term84413);
        setByteField(term84417, term84417.getClass(), "hour", (byte) 13);
        setByteField(term84417, term84417.getClass(), "minute", (byte) 18);
        setByteField(term84417, term84417.getClass(), "second", (byte) 4);
        setIntField(term84417, term84417.getClass(), "nano", 550437598);
        setField(term84412, term84412.getClass(), "time", term84417);
        setField(term84207, term84207.getClass(), "lastPlayDate", term84412);
        setIntField(term84207, term84207.getClass(), "lastPlaceId", -686175319);
        setField(term84207, term84207.getClass(), "lastPlaceName", "BOKRfsJbBj");
        setField(term84207, term84207.getClass(), "lastRegionId", "AbIDnsFOzO");
        setField(term84207, term84207.getClass(), "lastRegionName", "ekTUXbqVGx");
        setField(term84207, term84207.getClass(), "lastAllNetId", "ECPFDcnHIT");
        setField(term84207, term84207.getClass(), "lastClientId", "cgHejOgcDW");
        setField(term84205, term84205.getClass(), "user", term84207);
        setIntField(term84205, term84205.getClass(), "duelId", -489193282);
        setIntField(term84205, term84205.getClass(), "progress", 1790125855);
        setIntField(term84205, term84205.getClass(), "point", 665331267);
        setBooleanField(term84205, term84205.getClass(), "isClear", true);
        setIntField(term84488, term84488.getClass(), "year", 2014);
        setShortField(term84488, term84488.getClass(), "month", (short) 1);
        setShortField(term84488, term84488.getClass(), "day", (short) 7);
        setField(term84487, term84487.getClass(), "date", term84488);
        setByteField(term84492, term84492.getClass(), "hour", (byte) 16);
        setByteField(term84492, term84492.getClass(), "minute", (byte) 12);
        setByteField(term84492, term84492.getClass(), "second", (byte) 5);
        setIntField(term84492, term84492.getClass(), "nano", 977610129);
        setField(term84487, term84487.getClass(), "time", term84492);
        setField(term84205, term84205.getClass(), "lastPlayDate", term84487);
        setIntField(term84205, term84205.getClass(), "param1", -2014999682);
        setIntField(term84205, term84205.getClass(), "param2", 1982258261);
        setIntField(term84205, term84205.getClass(), "param3", -1489112012);
        setIntField(term84205, term84205.getClass(), "param4", -723107224);
        term84501 = new Integer(304541875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84501;
        callMethod(klass, "setParam2", argTypes, term84205, args);
    }

};


