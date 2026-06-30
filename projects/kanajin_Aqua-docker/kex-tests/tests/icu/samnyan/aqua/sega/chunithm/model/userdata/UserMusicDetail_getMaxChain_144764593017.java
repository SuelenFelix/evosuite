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

public class UserMusicDetail_getMaxChain_144764593017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95203;

    public UserMusicDetail_getMaxChain_144764593017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95209 = new Long(-78240609295693193L);
        term95203 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term95205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term95207 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95203, term95203.getClass(), "id", 1147867669908260197L);
        setLongField(term95205, term95205.getClass(), "id", -4547752041588255808L);
        setLongField(term95207, term95207.getClass(), "id", -3197677601690573647L);
        setField(term95207, term95207.getClass(), "extId", term95209);
        setField(term95207, term95207.getClass(), "luid", "XeHaPiTvPt");
        setIntField(term95224, term95224.getClass(), "year", 2018);
        setShortField(term95224, term95224.getClass(), "month", (short) 6);
        setShortField(term95224, term95224.getClass(), "day", (short) 7);
        setField(term95223, term95223.getClass(), "date", term95224);
        setByteField(term95228, term95228.getClass(), "hour", (byte) 22);
        setByteField(term95228, term95228.getClass(), "minute", (byte) 15);
        setByteField(term95228, term95228.getClass(), "second", (byte) 58);
        setIntField(term95228, term95228.getClass(), "nano", 252673627);
        setField(term95223, term95223.getClass(), "time", term95228);
        setField(term95207, term95207.getClass(), "registerTime", term95223);
        setIntField(term95234, term95234.getClass(), "year", 2011);
        setShortField(term95234, term95234.getClass(), "month", (short) 11);
        setShortField(term95234, term95234.getClass(), "day", (short) 13);
        setField(term95233, term95233.getClass(), "date", term95234);
        setByteField(term95238, term95238.getClass(), "hour", (byte) 10);
        setByteField(term95238, term95238.getClass(), "minute", (byte) 12);
        setByteField(term95238, term95238.getClass(), "second", (byte) 25);
        setIntField(term95238, term95238.getClass(), "nano", 943332183);
        setField(term95233, term95233.getClass(), "time", term95238);
        setField(term95207, term95207.getClass(), "accessTime", term95233);
        setField(term95205, term95205.getClass(), "card", term95207);
        setField(term95205, term95205.getClass(), "userName", "GsyGZIlHgo");
        setIntField(term95256, term95256.getClass(), "year", 2029);
        setShortField(term95256, term95256.getClass(), "month", (short) 3);
        setShortField(term95256, term95256.getClass(), "day", (short) 16);
        setField(term95255, term95255.getClass(), "date", term95256);
        setByteField(term95260, term95260.getClass(), "hour", (byte) 8);
        setByteField(term95260, term95260.getClass(), "minute", (byte) 45);
        setByteField(term95260, term95260.getClass(), "second", (byte) 41);
        setIntField(term95260, term95260.getClass(), "nano", 887752885);
        setField(term95255, term95255.getClass(), "time", term95260);
        setField(term95205, term95205.getClass(), "lastLoginDate", term95255);
        setBooleanField(term95205, term95205.getClass(), "isWebJoin", false);
        setField(term95205, term95205.getClass(), "webLimitDate", "DPTUtDUuOf");
        setIntField(term95205, term95205.getClass(), "level", 1698388280);
        setIntField(term95205, term95205.getClass(), "reincarnationNum", -44060117);
        setField(term95205, term95205.getClass(), "exp", "TwTeGrJqeV");
        setLongField(term95205, term95205.getClass(), "point", 6425336229882388159L);
        setLongField(term95205, term95205.getClass(), "totalPoint", -616423180949048118L);
        setIntField(term95205, term95205.getClass(), "playCount", 1362804360);
        setIntField(term95205, term95205.getClass(), "multiPlayCount", 1614080670);
        setIntField(term95205, term95205.getClass(), "multiWinCount", -757156022);
        setIntField(term95205, term95205.getClass(), "requestResCount", -711624128);
        setIntField(term95205, term95205.getClass(), "acceptResCount", 1920273912);
        setIntField(term95205, term95205.getClass(), "successResCount", -1321346843);
        setIntField(term95205, term95205.getClass(), "playerRating", -1682796364);
        setIntField(term95205, term95205.getClass(), "highestRating", -1747539443);
        setIntField(term95205, term95205.getClass(), "nameplateId", 1907000901);
        setIntField(term95205, term95205.getClass(), "frameId", -1160333442);
        setIntField(term95205, term95205.getClass(), "characterId", 104572719);
        setIntField(term95205, term95205.getClass(), "trophyId", 1999151227);
        setIntField(term95205, term95205.getClass(), "playedTutorialBit", 288964365);
        setIntField(term95205, term95205.getClass(), "firstTutorialCancelNum", -586935630);
        setIntField(term95205, term95205.getClass(), "masterTutorialCancelNum", 833837720);
        setIntField(term95205, term95205.getClass(), "totalRepertoireCount", 640367895);
        setIntField(term95205, term95205.getClass(), "totalMapNum", -1613119246);
        setLongField(term95205, term95205.getClass(), "totalHiScore", -8090281978105887179L);
        setLongField(term95205, term95205.getClass(), "totalBasicHighScore", -5381866975637720642L);
        setLongField(term95205, term95205.getClass(), "totalAdvancedHighScore", -3951751659567091652L);
        setLongField(term95205, term95205.getClass(), "totalExpertHighScore", 3805208480992130216L);
        setLongField(term95205, term95205.getClass(), "totalMasterHighScore", 3075555699272634645L);
        setIntField(term95317, term95317.getClass(), "year", 2022);
        setShortField(term95317, term95317.getClass(), "month", (short) 5);
        setShortField(term95317, term95317.getClass(), "day", (short) 22);
        setField(term95316, term95316.getClass(), "date", term95317);
        setByteField(term95321, term95321.getClass(), "hour", (byte) 5);
        setByteField(term95321, term95321.getClass(), "minute", (byte) 32);
        setByteField(term95321, term95321.getClass(), "second", (byte) 45);
        setIntField(term95321, term95321.getClass(), "nano", 267921436);
        setField(term95316, term95316.getClass(), "time", term95321);
        setField(term95205, term95205.getClass(), "eventWatchedDate", term95316);
        setIntField(term95205, term95205.getClass(), "friendCount", -580412864);
        setBooleanField(term95205, term95205.getClass(), "isMaimai", false);
        setField(term95205, term95205.getClass(), "firstGameId", "EmqjtKbtwp");
        setField(term95205, term95205.getClass(), "firstRomVersion", "BIcjuljzhc");
        setField(term95205, term95205.getClass(), "firstDataVersion", "SQDHGXSyaX");
        setIntField(term95365, term95365.getClass(), "year", 2014);
        setShortField(term95365, term95365.getClass(), "month", (short) 11);
        setShortField(term95365, term95365.getClass(), "day", (short) 17);
        setField(term95364, term95364.getClass(), "date", term95365);
        setByteField(term95369, term95369.getClass(), "hour", (byte) 6);
        setByteField(term95369, term95369.getClass(), "minute", (byte) 54);
        setByteField(term95369, term95369.getClass(), "second", (byte) 9);
        setIntField(term95369, term95369.getClass(), "nano", 835903486);
        setField(term95364, term95364.getClass(), "time", term95369);
        setField(term95205, term95205.getClass(), "firstPlayDate", term95364);
        setField(term95205, term95205.getClass(), "lastGameId", "apdJoJDItV");
        setField(term95205, term95205.getClass(), "lastRomVersion", "UidjRWfqYK");
        setField(term95205, term95205.getClass(), "lastDataVersion", "SrmUNtssfz");
        setIntField(term95411, term95411.getClass(), "year", 2012);
        setShortField(term95411, term95411.getClass(), "month", (short) 6);
        setShortField(term95411, term95411.getClass(), "day", (short) 11);
        setField(term95410, term95410.getClass(), "date", term95411);
        setByteField(term95415, term95415.getClass(), "hour", (byte) 10);
        setByteField(term95415, term95415.getClass(), "minute", (byte) 13);
        setByteField(term95415, term95415.getClass(), "second", (byte) 15);
        setIntField(term95415, term95415.getClass(), "nano", 398872626);
        setField(term95410, term95410.getClass(), "time", term95415);
        setField(term95205, term95205.getClass(), "lastPlayDate", term95410);
        setIntField(term95205, term95205.getClass(), "lastPlaceId", 1286437691);
        setField(term95205, term95205.getClass(), "lastPlaceName", "ARMUeNVaDF");
        setField(term95205, term95205.getClass(), "lastRegionId", "EUduJelZVE");
        setField(term95205, term95205.getClass(), "lastRegionName", "uwfvHKGrlb");
        setField(term95205, term95205.getClass(), "lastAllNetId", "pSLljKyfgK");
        setField(term95205, term95205.getClass(), "lastClientId", "JTQXicvesT");
        setField(term95203, term95203.getClass(), "user", term95205);
        setIntField(term95203, term95203.getClass(), "musicId", -447971579);
        setIntField(term95203, term95203.getClass(), "level", -2040992903);
        setIntField(term95203, term95203.getClass(), "playCount", -366879890);
        setIntField(term95203, term95203.getClass(), "scoreMax", 2127723603);
        setIntField(term95203, term95203.getClass(), "resRequestCount", 1512218420);
        setIntField(term95203, term95203.getClass(), "resAcceptCount", 745526581);
        setIntField(term95203, term95203.getClass(), "resSuccessCount", -699594655);
        setIntField(term95203, term95203.getClass(), "missCount", -1851012399);
        setIntField(term95203, term95203.getClass(), "maxComboCount", -116319790);
        setBooleanField(term95203, term95203.getClass(), "isFullCombo", true);
        setBooleanField(term95203, term95203.getClass(), "isAllJustice", false);
        setBooleanField(term95203, term95203.getClass(), "isSuccess", false);
        setIntField(term95203, term95203.getClass(), "fullChain", -1988687324);
        setIntField(term95203, term95203.getClass(), "maxChain", -57909074);
        setIntField(term95203, term95203.getClass(), "scoreRank", 1592412);
        setBooleanField(term95203, term95203.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term95203, args);
    }

};


