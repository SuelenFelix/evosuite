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

public class UserGameOptionEx_getExt6_8944045868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313167;

    public UserGameOptionEx_getExt6_8944045868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313173 = new Long(-7181112149072926893L);
        term313167 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term313169 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term313171 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term313187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313192 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313333 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313379 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term313167, term313167.getClass(), "id", -6108873462314179567L);
        setLongField(term313169, term313169.getClass(), "id", -5335397754732723832L);
        setLongField(term313171, term313171.getClass(), "id", 5998977952560464623L);
        setField(term313171, term313171.getClass(), "extId", term313173);
        setField(term313171, term313171.getClass(), "luid", "FKHboGOFMY");
        setIntField(term313188, term313188.getClass(), "year", 2013);
        setShortField(term313188, term313188.getClass(), "month", (short) 10);
        setShortField(term313188, term313188.getClass(), "day", (short) 21);
        setField(term313187, term313187.getClass(), "date", term313188);
        setByteField(term313192, term313192.getClass(), "hour", (byte) 10);
        setByteField(term313192, term313192.getClass(), "minute", (byte) 34);
        setByteField(term313192, term313192.getClass(), "second", (byte) 23);
        setIntField(term313192, term313192.getClass(), "nano", 486908797);
        setField(term313187, term313187.getClass(), "time", term313192);
        setField(term313171, term313171.getClass(), "registerTime", term313187);
        setIntField(term313198, term313198.getClass(), "year", 2010);
        setShortField(term313198, term313198.getClass(), "month", (short) 9);
        setShortField(term313198, term313198.getClass(), "day", (short) 6);
        setField(term313197, term313197.getClass(), "date", term313198);
        setByteField(term313202, term313202.getClass(), "hour", (byte) 16);
        setByteField(term313202, term313202.getClass(), "minute", (byte) 36);
        setByteField(term313202, term313202.getClass(), "second", (byte) 25);
        setIntField(term313202, term313202.getClass(), "nano", 711004873);
        setField(term313197, term313197.getClass(), "time", term313202);
        setField(term313171, term313171.getClass(), "accessTime", term313197);
        setField(term313169, term313169.getClass(), "card", term313171);
        setField(term313169, term313169.getClass(), "userName", "JAYIoLDVzT");
        setIntField(term313220, term313220.getClass(), "year", 2024);
        setShortField(term313220, term313220.getClass(), "month", (short) 3);
        setShortField(term313220, term313220.getClass(), "day", (short) 16);
        setField(term313219, term313219.getClass(), "date", term313220);
        setByteField(term313224, term313224.getClass(), "hour", (byte) 4);
        setByteField(term313224, term313224.getClass(), "minute", (byte) 39);
        setByteField(term313224, term313224.getClass(), "second", (byte) 3);
        setIntField(term313224, term313224.getClass(), "nano", 853486323);
        setField(term313219, term313219.getClass(), "time", term313224);
        setField(term313169, term313169.getClass(), "lastLoginDate", term313219);
        setBooleanField(term313169, term313169.getClass(), "isWebJoin", true);
        setField(term313169, term313169.getClass(), "webLimitDate", "nxzYMTIyjg");
        setIntField(term313169, term313169.getClass(), "level", -1684946902);
        setIntField(term313169, term313169.getClass(), "reincarnationNum", -1027686698);
        setField(term313169, term313169.getClass(), "exp", "zOpsVAnrwk");
        setLongField(term313169, term313169.getClass(), "point", -7766913315400720289L);
        setLongField(term313169, term313169.getClass(), "totalPoint", 5173208621189388272L);
        setIntField(term313169, term313169.getClass(), "playCount", 1410590376);
        setIntField(term313169, term313169.getClass(), "multiPlayCount", -1009536873);
        setIntField(term313169, term313169.getClass(), "multiWinCount", -296857349);
        setIntField(term313169, term313169.getClass(), "requestResCount", 68727383);
        setIntField(term313169, term313169.getClass(), "acceptResCount", 541050441);
        setIntField(term313169, term313169.getClass(), "successResCount", 327561187);
        setIntField(term313169, term313169.getClass(), "playerRating", 1458099219);
        setIntField(term313169, term313169.getClass(), "highestRating", -1278539504);
        setIntField(term313169, term313169.getClass(), "nameplateId", 1652135036);
        setIntField(term313169, term313169.getClass(), "frameId", 909871871);
        setIntField(term313169, term313169.getClass(), "characterId", -1483569912);
        setIntField(term313169, term313169.getClass(), "trophyId", -1197582769);
        setIntField(term313169, term313169.getClass(), "playedTutorialBit", -2007225277);
        setIntField(term313169, term313169.getClass(), "firstTutorialCancelNum", -215960445);
        setIntField(term313169, term313169.getClass(), "masterTutorialCancelNum", -2077313277);
        setIntField(term313169, term313169.getClass(), "totalRepertoireCount", 296721446);
        setIntField(term313169, term313169.getClass(), "totalMapNum", -1571698152);
        setLongField(term313169, term313169.getClass(), "totalHiScore", 7541782583121013535L);
        setLongField(term313169, term313169.getClass(), "totalBasicHighScore", 5693574275981501304L);
        setLongField(term313169, term313169.getClass(), "totalAdvancedHighScore", 2300641371993155L);
        setLongField(term313169, term313169.getClass(), "totalExpertHighScore", -1089622132321417847L);
        setLongField(term313169, term313169.getClass(), "totalMasterHighScore", -3177997931491887954L);
        setIntField(term313281, term313281.getClass(), "year", 2011);
        setShortField(term313281, term313281.getClass(), "month", (short) 8);
        setShortField(term313281, term313281.getClass(), "day", (short) 7);
        setField(term313280, term313280.getClass(), "date", term313281);
        setByteField(term313285, term313285.getClass(), "hour", (byte) 22);
        setByteField(term313285, term313285.getClass(), "minute", (byte) 11);
        setByteField(term313285, term313285.getClass(), "second", (byte) 21);
        setIntField(term313285, term313285.getClass(), "nano", 903709604);
        setField(term313280, term313280.getClass(), "time", term313285);
        setField(term313169, term313169.getClass(), "eventWatchedDate", term313280);
        setIntField(term313169, term313169.getClass(), "friendCount", -1823489423);
        setBooleanField(term313169, term313169.getClass(), "isMaimai", true);
        setField(term313169, term313169.getClass(), "firstGameId", "nnUWRbjEHe");
        setField(term313169, term313169.getClass(), "firstRomVersion", "nqnYFZYCst");
        setField(term313169, term313169.getClass(), "firstDataVersion", "cyTSgJMCVE");
        setIntField(term313329, term313329.getClass(), "year", 2010);
        setShortField(term313329, term313329.getClass(), "month", (short) 8);
        setShortField(term313329, term313329.getClass(), "day", (short) 8);
        setField(term313328, term313328.getClass(), "date", term313329);
        setByteField(term313333, term313333.getClass(), "hour", (byte) 10);
        setByteField(term313333, term313333.getClass(), "minute", (byte) 51);
        setByteField(term313333, term313333.getClass(), "second", (byte) 59);
        setIntField(term313333, term313333.getClass(), "nano", 297246756);
        setField(term313328, term313328.getClass(), "time", term313333);
        setField(term313169, term313169.getClass(), "firstPlayDate", term313328);
        setField(term313169, term313169.getClass(), "lastGameId", "yooiSdRAOb");
        setField(term313169, term313169.getClass(), "lastRomVersion", "SoTgnoBFiD");
        setField(term313169, term313169.getClass(), "lastDataVersion", "xkhqTWXZqZ");
        setIntField(term313375, term313375.getClass(), "year", 2020);
        setShortField(term313375, term313375.getClass(), "month", (short) 8);
        setShortField(term313375, term313375.getClass(), "day", (short) 11);
        setField(term313374, term313374.getClass(), "date", term313375);
        setByteField(term313379, term313379.getClass(), "hour", (byte) 11);
        setByteField(term313379, term313379.getClass(), "minute", (byte) 25);
        setByteField(term313379, term313379.getClass(), "second", (byte) 35);
        setIntField(term313379, term313379.getClass(), "nano", 324894582);
        setField(term313374, term313374.getClass(), "time", term313379);
        setField(term313169, term313169.getClass(), "lastPlayDate", term313374);
        setIntField(term313169, term313169.getClass(), "lastPlaceId", 1561760677);
        setField(term313169, term313169.getClass(), "lastPlaceName", "ABldombRYF");
        setField(term313169, term313169.getClass(), "lastRegionId", "LJiniBXnjB");
        setField(term313169, term313169.getClass(), "lastRegionName", "ySvbXaxFVk");
        setField(term313169, term313169.getClass(), "lastAllNetId", "IkBWbcZtiH");
        setField(term313169, term313169.getClass(), "lastClientId", "mItcHoacSH");
        setField(term313167, term313167.getClass(), "user", term313169);
        setIntField(term313167, term313167.getClass(), "ext1", 729377410);
        setIntField(term313167, term313167.getClass(), "ext2", -925745287);
        setIntField(term313167, term313167.getClass(), "ext3", -716933787);
        setIntField(term313167, term313167.getClass(), "ext4", -2061540313);
        setIntField(term313167, term313167.getClass(), "ext5", -1956160644);
        setIntField(term313167, term313167.getClass(), "ext6", 559045287);
        setIntField(term313167, term313167.getClass(), "ext7", -1095401718);
        setIntField(term313167, term313167.getClass(), "ext8", 1264175299);
        setIntField(term313167, term313167.getClass(), "ext9", 1513390318);
        setIntField(term313167, term313167.getClass(), "ext10", -77887831);
        setIntField(term313167, term313167.getClass(), "ext11", 890715088);
        setIntField(term313167, term313167.getClass(), "ext12", -1484619182);
        setIntField(term313167, term313167.getClass(), "ext13", 1078630217);
        setIntField(term313167, term313167.getClass(), "ext14", -533796969);
        setIntField(term313167, term313167.getClass(), "ext15", 941872091);
        setIntField(term313167, term313167.getClass(), "ext16", 1820570166);
        setIntField(term313167, term313167.getClass(), "ext17", -1537142362);
        setIntField(term313167, term313167.getClass(), "ext18", -1681426668);
        setIntField(term313167, term313167.getClass(), "ext19", 1594881854);
        setIntField(term313167, term313167.getClass(), "ext20", -1863338887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt6", argTypes, term313167, args);
    }

};


