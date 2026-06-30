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

public class UserGameOptionEx_equals_65006391145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330211;
     Object term330509;

    public UserGameOptionEx_equals_65006391145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term330217 = new Long(-6481933642917183045L);
        term330211 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term330213 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term330215 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term330231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330329 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330423 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term330211, term330211.getClass(), "id", -6321289617766826299L);
        setLongField(term330213, term330213.getClass(), "id", -7179960800513030576L);
        setLongField(term330215, term330215.getClass(), "id", -7672585496330101619L);
        setField(term330215, term330215.getClass(), "extId", term330217);
        setField(term330215, term330215.getClass(), "luid", "YPIxYibaKU");
        setIntField(term330232, term330232.getClass(), "year", 2020);
        setShortField(term330232, term330232.getClass(), "month", (short) 3);
        setShortField(term330232, term330232.getClass(), "day", (short) 25);
        setField(term330231, term330231.getClass(), "date", term330232);
        setByteField(term330236, term330236.getClass(), "hour", (byte) 23);
        setByteField(term330236, term330236.getClass(), "minute", (byte) 55);
        setByteField(term330236, term330236.getClass(), "second", (byte) 3);
        setIntField(term330236, term330236.getClass(), "nano", 301319715);
        setField(term330231, term330231.getClass(), "time", term330236);
        setField(term330215, term330215.getClass(), "registerTime", term330231);
        setIntField(term330242, term330242.getClass(), "year", 2027);
        setShortField(term330242, term330242.getClass(), "month", (short) 11);
        setShortField(term330242, term330242.getClass(), "day", (short) 9);
        setField(term330241, term330241.getClass(), "date", term330242);
        setByteField(term330246, term330246.getClass(), "hour", (byte) 9);
        setByteField(term330246, term330246.getClass(), "minute", (byte) 14);
        setByteField(term330246, term330246.getClass(), "second", (byte) 1);
        setIntField(term330246, term330246.getClass(), "nano", 609332181);
        setField(term330241, term330241.getClass(), "time", term330246);
        setField(term330215, term330215.getClass(), "accessTime", term330241);
        setField(term330213, term330213.getClass(), "card", term330215);
        setField(term330213, term330213.getClass(), "userName", "hAGyPTyoNh");
        setIntField(term330264, term330264.getClass(), "year", 2027);
        setShortField(term330264, term330264.getClass(), "month", (short) 10);
        setShortField(term330264, term330264.getClass(), "day", (short) 2);
        setField(term330263, term330263.getClass(), "date", term330264);
        setByteField(term330268, term330268.getClass(), "hour", (byte) 5);
        setByteField(term330268, term330268.getClass(), "minute", (byte) 21);
        setByteField(term330268, term330268.getClass(), "second", (byte) 37);
        setIntField(term330268, term330268.getClass(), "nano", 257381085);
        setField(term330263, term330263.getClass(), "time", term330268);
        setField(term330213, term330213.getClass(), "lastLoginDate", term330263);
        setBooleanField(term330213, term330213.getClass(), "isWebJoin", true);
        setField(term330213, term330213.getClass(), "webLimitDate", "WIEdirzVjc");
        setIntField(term330213, term330213.getClass(), "level", 972492496);
        setIntField(term330213, term330213.getClass(), "reincarnationNum", -2143210695);
        setField(term330213, term330213.getClass(), "exp", "jbzOackPUQ");
        setLongField(term330213, term330213.getClass(), "point", 5916186589944818269L);
        setLongField(term330213, term330213.getClass(), "totalPoint", -8277612990946001763L);
        setIntField(term330213, term330213.getClass(), "playCount", -1464463559);
        setIntField(term330213, term330213.getClass(), "multiPlayCount", -1213545995);
        setIntField(term330213, term330213.getClass(), "multiWinCount", 1936424239);
        setIntField(term330213, term330213.getClass(), "requestResCount", 389842212);
        setIntField(term330213, term330213.getClass(), "acceptResCount", 678068437);
        setIntField(term330213, term330213.getClass(), "successResCount", 1454786257);
        setIntField(term330213, term330213.getClass(), "playerRating", 1219101209);
        setIntField(term330213, term330213.getClass(), "highestRating", -339641170);
        setIntField(term330213, term330213.getClass(), "nameplateId", -1456358645);
        setIntField(term330213, term330213.getClass(), "frameId", -58778046);
        setIntField(term330213, term330213.getClass(), "characterId", -1653954813);
        setIntField(term330213, term330213.getClass(), "trophyId", 146680795);
        setIntField(term330213, term330213.getClass(), "playedTutorialBit", 1102033819);
        setIntField(term330213, term330213.getClass(), "firstTutorialCancelNum", -483760060);
        setIntField(term330213, term330213.getClass(), "masterTutorialCancelNum", 1798062324);
        setIntField(term330213, term330213.getClass(), "totalRepertoireCount", 1512303261);
        setIntField(term330213, term330213.getClass(), "totalMapNum", 2115862769);
        setLongField(term330213, term330213.getClass(), "totalHiScore", 5997593072795724897L);
        setLongField(term330213, term330213.getClass(), "totalBasicHighScore", 8596222194900412730L);
        setLongField(term330213, term330213.getClass(), "totalAdvancedHighScore", 2886701952614491778L);
        setLongField(term330213, term330213.getClass(), "totalExpertHighScore", 5991101022744926909L);
        setLongField(term330213, term330213.getClass(), "totalMasterHighScore", -2448299584042846072L);
        setIntField(term330325, term330325.getClass(), "year", 2025);
        setShortField(term330325, term330325.getClass(), "month", (short) 11);
        setShortField(term330325, term330325.getClass(), "day", (short) 17);
        setField(term330324, term330324.getClass(), "date", term330325);
        setByteField(term330329, term330329.getClass(), "hour", (byte) 8);
        setByteField(term330329, term330329.getClass(), "minute", (byte) 24);
        setByteField(term330329, term330329.getClass(), "second", (byte) 16);
        setIntField(term330329, term330329.getClass(), "nano", 461508464);
        setField(term330324, term330324.getClass(), "time", term330329);
        setField(term330213, term330213.getClass(), "eventWatchedDate", term330324);
        setIntField(term330213, term330213.getClass(), "friendCount", 1361584843);
        setBooleanField(term330213, term330213.getClass(), "isMaimai", true);
        setField(term330213, term330213.getClass(), "firstGameId", "FvZbKfGFpg");
        setField(term330213, term330213.getClass(), "firstRomVersion", "aCCYVNLwaa");
        setField(term330213, term330213.getClass(), "firstDataVersion", "dZtrEEgcVE");
        setIntField(term330373, term330373.getClass(), "year", 2021);
        setShortField(term330373, term330373.getClass(), "month", (short) 11);
        setShortField(term330373, term330373.getClass(), "day", (short) 28);
        setField(term330372, term330372.getClass(), "date", term330373);
        setByteField(term330377, term330377.getClass(), "hour", (byte) 13);
        setByteField(term330377, term330377.getClass(), "minute", (byte) 48);
        setByteField(term330377, term330377.getClass(), "second", (byte) 28);
        setIntField(term330377, term330377.getClass(), "nano", 649652577);
        setField(term330372, term330372.getClass(), "time", term330377);
        setField(term330213, term330213.getClass(), "firstPlayDate", term330372);
        setField(term330213, term330213.getClass(), "lastGameId", "qryyzrqVdu");
        setField(term330213, term330213.getClass(), "lastRomVersion", "VmGukvnUdX");
        setField(term330213, term330213.getClass(), "lastDataVersion", "XfKldJGWHB");
        setIntField(term330419, term330419.getClass(), "year", 2024);
        setShortField(term330419, term330419.getClass(), "month", (short) 1);
        setShortField(term330419, term330419.getClass(), "day", (short) 22);
        setField(term330418, term330418.getClass(), "date", term330419);
        setByteField(term330423, term330423.getClass(), "hour", (byte) 16);
        setByteField(term330423, term330423.getClass(), "minute", (byte) 6);
        setByteField(term330423, term330423.getClass(), "second", (byte) 17);
        setIntField(term330423, term330423.getClass(), "nano", 835037287);
        setField(term330418, term330418.getClass(), "time", term330423);
        setField(term330213, term330213.getClass(), "lastPlayDate", term330418);
        setIntField(term330213, term330213.getClass(), "lastPlaceId", -1380535995);
        setField(term330213, term330213.getClass(), "lastPlaceName", "SqsYjPVugJ");
        setField(term330213, term330213.getClass(), "lastRegionId", "nFYNkdURVQ");
        setField(term330213, term330213.getClass(), "lastRegionName", "VaMZGFnePs");
        setField(term330213, term330213.getClass(), "lastAllNetId", "lfngIPCkRz");
        setField(term330213, term330213.getClass(), "lastClientId", "ExFqbygbTc");
        setField(term330211, term330211.getClass(), "user", term330213);
        setIntField(term330211, term330211.getClass(), "ext1", 322765382);
        setIntField(term330211, term330211.getClass(), "ext2", -1849847162);
        setIntField(term330211, term330211.getClass(), "ext3", -964098977);
        setIntField(term330211, term330211.getClass(), "ext4", -1418072409);
        setIntField(term330211, term330211.getClass(), "ext5", -1460855753);
        setIntField(term330211, term330211.getClass(), "ext6", -307197050);
        setIntField(term330211, term330211.getClass(), "ext7", 960424942);
        setIntField(term330211, term330211.getClass(), "ext8", 1894128234);
        setIntField(term330211, term330211.getClass(), "ext9", 201156573);
        setIntField(term330211, term330211.getClass(), "ext10", 308978610);
        setIntField(term330211, term330211.getClass(), "ext11", -1017906723);
        setIntField(term330211, term330211.getClass(), "ext12", -187095556);
        setIntField(term330211, term330211.getClass(), "ext13", -1137660962);
        setIntField(term330211, term330211.getClass(), "ext14", -1432112505);
        setIntField(term330211, term330211.getClass(), "ext15", 1112647263);
        setIntField(term330211, term330211.getClass(), "ext16", 50515119);
        setIntField(term330211, term330211.getClass(), "ext17", -1612007794);
        setIntField(term330211, term330211.getClass(), "ext18", 261769376);
        setIntField(term330211, term330211.getClass(), "ext19", 282224906);
        setIntField(term330211, term330211.getClass(), "ext20", -270015042);
        term330509 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term330509;
        callMethod(klass, "equals", argTypes, term330211, args);
    }

};


