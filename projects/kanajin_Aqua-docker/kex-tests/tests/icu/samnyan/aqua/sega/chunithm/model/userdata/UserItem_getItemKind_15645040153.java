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

public class UserItem_getItemKind_15645040153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122343;

    public UserItem_getItemKind_15645040153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122349 = new Long(-7406618974062419277L);
        term122343 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term122345 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term122347 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122400 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122461 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122509 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122555 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122343, term122343.getClass(), "id", -7024469480394415540L);
        setLongField(term122345, term122345.getClass(), "id", 8192919049584536731L);
        setLongField(term122347, term122347.getClass(), "id", 661658911296323350L);
        setField(term122347, term122347.getClass(), "extId", term122349);
        setField(term122347, term122347.getClass(), "luid", "ziLgjZfcmc");
        setIntField(term122364, term122364.getClass(), "year", 2014);
        setShortField(term122364, term122364.getClass(), "month", (short) 6);
        setShortField(term122364, term122364.getClass(), "day", (short) 4);
        setField(term122363, term122363.getClass(), "date", term122364);
        setByteField(term122368, term122368.getClass(), "hour", (byte) 11);
        setByteField(term122368, term122368.getClass(), "minute", (byte) 47);
        setByteField(term122368, term122368.getClass(), "second", (byte) 18);
        setIntField(term122368, term122368.getClass(), "nano", 119506475);
        setField(term122363, term122363.getClass(), "time", term122368);
        setField(term122347, term122347.getClass(), "registerTime", term122363);
        setIntField(term122374, term122374.getClass(), "year", 2016);
        setShortField(term122374, term122374.getClass(), "month", (short) 2);
        setShortField(term122374, term122374.getClass(), "day", (short) 16);
        setField(term122373, term122373.getClass(), "date", term122374);
        setByteField(term122378, term122378.getClass(), "hour", (byte) 4);
        setByteField(term122378, term122378.getClass(), "minute", (byte) 2);
        setByteField(term122378, term122378.getClass(), "second", (byte) 16);
        setIntField(term122378, term122378.getClass(), "nano", 644071727);
        setField(term122373, term122373.getClass(), "time", term122378);
        setField(term122347, term122347.getClass(), "accessTime", term122373);
        setField(term122345, term122345.getClass(), "card", term122347);
        setField(term122345, term122345.getClass(), "userName", "NpOgFaCXxB");
        setIntField(term122396, term122396.getClass(), "year", 2019);
        setShortField(term122396, term122396.getClass(), "month", (short) 4);
        setShortField(term122396, term122396.getClass(), "day", (short) 16);
        setField(term122395, term122395.getClass(), "date", term122396);
        setByteField(term122400, term122400.getClass(), "hour", (byte) 11);
        setByteField(term122400, term122400.getClass(), "minute", (byte) 11);
        setByteField(term122400, term122400.getClass(), "second", (byte) 50);
        setIntField(term122400, term122400.getClass(), "nano", 334265252);
        setField(term122395, term122395.getClass(), "time", term122400);
        setField(term122345, term122345.getClass(), "lastLoginDate", term122395);
        setBooleanField(term122345, term122345.getClass(), "isWebJoin", true);
        setField(term122345, term122345.getClass(), "webLimitDate", "xAfHHeOBie");
        setIntField(term122345, term122345.getClass(), "level", 1485859505);
        setIntField(term122345, term122345.getClass(), "reincarnationNum", 1422308934);
        setField(term122345, term122345.getClass(), "exp", "NTXawZXYgT");
        setLongField(term122345, term122345.getClass(), "point", 2352206876218352319L);
        setLongField(term122345, term122345.getClass(), "totalPoint", -7692507274255908488L);
        setIntField(term122345, term122345.getClass(), "playCount", -1843770627);
        setIntField(term122345, term122345.getClass(), "multiPlayCount", -1984599794);
        setIntField(term122345, term122345.getClass(), "multiWinCount", 1410893442);
        setIntField(term122345, term122345.getClass(), "requestResCount", -1557544397);
        setIntField(term122345, term122345.getClass(), "acceptResCount", 1050498492);
        setIntField(term122345, term122345.getClass(), "successResCount", -14998881);
        setIntField(term122345, term122345.getClass(), "playerRating", 1913259662);
        setIntField(term122345, term122345.getClass(), "highestRating", -181084778);
        setIntField(term122345, term122345.getClass(), "nameplateId", -558822921);
        setIntField(term122345, term122345.getClass(), "frameId", -445796317);
        setIntField(term122345, term122345.getClass(), "characterId", -75307754);
        setIntField(term122345, term122345.getClass(), "trophyId", 1208875748);
        setIntField(term122345, term122345.getClass(), "playedTutorialBit", -353170573);
        setIntField(term122345, term122345.getClass(), "firstTutorialCancelNum", -1071939679);
        setIntField(term122345, term122345.getClass(), "masterTutorialCancelNum", -1530369051);
        setIntField(term122345, term122345.getClass(), "totalRepertoireCount", -538048936);
        setIntField(term122345, term122345.getClass(), "totalMapNum", 359927439);
        setLongField(term122345, term122345.getClass(), "totalHiScore", 2508296380707148646L);
        setLongField(term122345, term122345.getClass(), "totalBasicHighScore", -471151828695812251L);
        setLongField(term122345, term122345.getClass(), "totalAdvancedHighScore", -7531297671326780727L);
        setLongField(term122345, term122345.getClass(), "totalExpertHighScore", -6655674259185118023L);
        setLongField(term122345, term122345.getClass(), "totalMasterHighScore", 687177988860711911L);
        setIntField(term122457, term122457.getClass(), "year", 2023);
        setShortField(term122457, term122457.getClass(), "month", (short) 11);
        setShortField(term122457, term122457.getClass(), "day", (short) 28);
        setField(term122456, term122456.getClass(), "date", term122457);
        setByteField(term122461, term122461.getClass(), "hour", (byte) 18);
        setByteField(term122461, term122461.getClass(), "minute", (byte) 47);
        setByteField(term122461, term122461.getClass(), "second", (byte) 5);
        setIntField(term122461, term122461.getClass(), "nano", 872817342);
        setField(term122456, term122456.getClass(), "time", term122461);
        setField(term122345, term122345.getClass(), "eventWatchedDate", term122456);
        setIntField(term122345, term122345.getClass(), "friendCount", -671786602);
        setBooleanField(term122345, term122345.getClass(), "isMaimai", true);
        setField(term122345, term122345.getClass(), "firstGameId", "KrNHXyCftn");
        setField(term122345, term122345.getClass(), "firstRomVersion", "qoZIehoMQV");
        setField(term122345, term122345.getClass(), "firstDataVersion", "mUjsuGJONY");
        setIntField(term122505, term122505.getClass(), "year", 2021);
        setShortField(term122505, term122505.getClass(), "month", (short) 1);
        setShortField(term122505, term122505.getClass(), "day", (short) 6);
        setField(term122504, term122504.getClass(), "date", term122505);
        setByteField(term122509, term122509.getClass(), "hour", (byte) 1);
        setByteField(term122509, term122509.getClass(), "minute", (byte) 15);
        setByteField(term122509, term122509.getClass(), "second", (byte) 53);
        setIntField(term122509, term122509.getClass(), "nano", 117304601);
        setField(term122504, term122504.getClass(), "time", term122509);
        setField(term122345, term122345.getClass(), "firstPlayDate", term122504);
        setField(term122345, term122345.getClass(), "lastGameId", "GOumeOeOmE");
        setField(term122345, term122345.getClass(), "lastRomVersion", "tYTspNFBci");
        setField(term122345, term122345.getClass(), "lastDataVersion", "gPqqqLlWBv");
        setIntField(term122551, term122551.getClass(), "year", 2025);
        setShortField(term122551, term122551.getClass(), "month", (short) 6);
        setShortField(term122551, term122551.getClass(), "day", (short) 3);
        setField(term122550, term122550.getClass(), "date", term122551);
        setByteField(term122555, term122555.getClass(), "hour", (byte) 8);
        setByteField(term122555, term122555.getClass(), "minute", (byte) 22);
        setByteField(term122555, term122555.getClass(), "second", (byte) 23);
        setIntField(term122555, term122555.getClass(), "nano", 12025593);
        setField(term122550, term122550.getClass(), "time", term122555);
        setField(term122345, term122345.getClass(), "lastPlayDate", term122550);
        setIntField(term122345, term122345.getClass(), "lastPlaceId", -51390011);
        setField(term122345, term122345.getClass(), "lastPlaceName", "IlWYmbzQQL");
        setField(term122345, term122345.getClass(), "lastRegionId", "pinoPipukP");
        setField(term122345, term122345.getClass(), "lastRegionName", "qqnzeIWFCa");
        setField(term122345, term122345.getClass(), "lastAllNetId", "gOdeBqOhYH");
        setField(term122345, term122345.getClass(), "lastClientId", "EyPdpJTxkZ");
        setField(term122343, term122343.getClass(), "user", term122345);
        setIntField(term122343, term122343.getClass(), "itemKind", 1988464734);
        setIntField(term122343, term122343.getClass(), "itemId", 1205484765);
        setIntField(term122343, term122343.getClass(), "stock", 1);
        setBooleanField(term122343, term122343.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemKind", argTypes, term122343, args);
    }

};


