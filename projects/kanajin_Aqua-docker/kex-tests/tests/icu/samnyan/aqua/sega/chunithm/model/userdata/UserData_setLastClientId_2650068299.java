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

public class UserData_setLastClientId_2650068299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171989;

    public UserData_setLastClientId_2650068299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171993 = new Long(-3850323135468805420L);
        term171989 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term171991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term172007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171989, term171989.getClass(), "id", -4915758880704997916L);
        setLongField(term171991, term171991.getClass(), "id", 7912030788557604118L);
        setField(term171991, term171991.getClass(), "extId", term171993);
        setField(term171991, term171991.getClass(), "luid", "vOXulKGXoU");
        setIntField(term172008, term172008.getClass(), "year", 2025);
        setShortField(term172008, term172008.getClass(), "month", (short) 8);
        setShortField(term172008, term172008.getClass(), "day", (short) 13);
        setField(term172007, term172007.getClass(), "date", term172008);
        setByteField(term172012, term172012.getClass(), "hour", (byte) 22);
        setByteField(term172012, term172012.getClass(), "minute", (byte) 36);
        setByteField(term172012, term172012.getClass(), "second", (byte) 20);
        setIntField(term172012, term172012.getClass(), "nano", 762711414);
        setField(term172007, term172007.getClass(), "time", term172012);
        setField(term171991, term171991.getClass(), "registerTime", term172007);
        setIntField(term172018, term172018.getClass(), "year", 2014);
        setShortField(term172018, term172018.getClass(), "month", (short) 12);
        setShortField(term172018, term172018.getClass(), "day", (short) 24);
        setField(term172017, term172017.getClass(), "date", term172018);
        setByteField(term172022, term172022.getClass(), "hour", (byte) 12);
        setByteField(term172022, term172022.getClass(), "minute", (byte) 4);
        setByteField(term172022, term172022.getClass(), "second", (byte) 35);
        setIntField(term172022, term172022.getClass(), "nano", 488126209);
        setField(term172017, term172017.getClass(), "time", term172022);
        setField(term171991, term171991.getClass(), "accessTime", term172017);
        setField(term171989, term171989.getClass(), "card", term171991);
        setField(term171989, term171989.getClass(), "userName", "LztrXeTaAH");
        setIntField(term172040, term172040.getClass(), "year", 2024);
        setShortField(term172040, term172040.getClass(), "month", (short) 8);
        setShortField(term172040, term172040.getClass(), "day", (short) 31);
        setField(term172039, term172039.getClass(), "date", term172040);
        setByteField(term172044, term172044.getClass(), "hour", (byte) 16);
        setByteField(term172044, term172044.getClass(), "minute", (byte) 27);
        setByteField(term172044, term172044.getClass(), "second", (byte) 9);
        setIntField(term172044, term172044.getClass(), "nano", 895213387);
        setField(term172039, term172039.getClass(), "time", term172044);
        setField(term171989, term171989.getClass(), "lastLoginDate", term172039);
        setBooleanField(term171989, term171989.getClass(), "isWebJoin", true);
        setField(term171989, term171989.getClass(), "webLimitDate", "QecEdGoJpa");
        setIntField(term171989, term171989.getClass(), "level", 1531630551);
        setIntField(term171989, term171989.getClass(), "reincarnationNum", -1293247427);
        setField(term171989, term171989.getClass(), "exp", "UgGneVxowB");
        setLongField(term171989, term171989.getClass(), "point", -3761927265698212278L);
        setLongField(term171989, term171989.getClass(), "totalPoint", 1170580072130944655L);
        setIntField(term171989, term171989.getClass(), "playCount", -2110112489);
        setIntField(term171989, term171989.getClass(), "multiPlayCount", 911599446);
        setIntField(term171989, term171989.getClass(), "multiWinCount", -307818529);
        setIntField(term171989, term171989.getClass(), "requestResCount", 700090526);
        setIntField(term171989, term171989.getClass(), "acceptResCount", 8095828);
        setIntField(term171989, term171989.getClass(), "successResCount", 491999819);
        setIntField(term171989, term171989.getClass(), "playerRating", 594900088);
        setIntField(term171989, term171989.getClass(), "highestRating", 1012824901);
        setIntField(term171989, term171989.getClass(), "nameplateId", 953916253);
        setIntField(term171989, term171989.getClass(), "frameId", -972613566);
        setIntField(term171989, term171989.getClass(), "characterId", 423167476);
        setIntField(term171989, term171989.getClass(), "trophyId", -918637899);
        setIntField(term171989, term171989.getClass(), "playedTutorialBit", -47058112);
        setIntField(term171989, term171989.getClass(), "firstTutorialCancelNum", 2073925569);
        setIntField(term171989, term171989.getClass(), "masterTutorialCancelNum", 1903299320);
        setIntField(term171989, term171989.getClass(), "totalRepertoireCount", 496281999);
        setIntField(term171989, term171989.getClass(), "totalMapNum", -129667876);
        setLongField(term171989, term171989.getClass(), "totalHiScore", 4978788793814668080L);
        setLongField(term171989, term171989.getClass(), "totalBasicHighScore", -720349426913581051L);
        setLongField(term171989, term171989.getClass(), "totalAdvancedHighScore", -4642930237593091070L);
        setLongField(term171989, term171989.getClass(), "totalExpertHighScore", 8487537903730003233L);
        setLongField(term171989, term171989.getClass(), "totalMasterHighScore", 2098403151846708507L);
        setIntField(term172101, term172101.getClass(), "year", 2029);
        setShortField(term172101, term172101.getClass(), "month", (short) 9);
        setShortField(term172101, term172101.getClass(), "day", (short) 20);
        setField(term172100, term172100.getClass(), "date", term172101);
        setByteField(term172105, term172105.getClass(), "hour", (byte) 17);
        setByteField(term172105, term172105.getClass(), "minute", (byte) 23);
        setByteField(term172105, term172105.getClass(), "second", (byte) 23);
        setIntField(term172105, term172105.getClass(), "nano", 247716700);
        setField(term172100, term172100.getClass(), "time", term172105);
        setField(term171989, term171989.getClass(), "eventWatchedDate", term172100);
        setIntField(term171989, term171989.getClass(), "friendCount", -1081751617);
        setBooleanField(term171989, term171989.getClass(), "isMaimai", true);
        setField(term171989, term171989.getClass(), "firstGameId", "wOjvNSyyFk");
        setField(term171989, term171989.getClass(), "firstRomVersion", "VISpVdjKtx");
        setField(term171989, term171989.getClass(), "firstDataVersion", "ztJDdQOJaI");
        setIntField(term172149, term172149.getClass(), "year", 2016);
        setShortField(term172149, term172149.getClass(), "month", (short) 7);
        setShortField(term172149, term172149.getClass(), "day", (short) 21);
        setField(term172148, term172148.getClass(), "date", term172149);
        setByteField(term172153, term172153.getClass(), "hour", (byte) 5);
        setByteField(term172153, term172153.getClass(), "minute", (byte) 16);
        setByteField(term172153, term172153.getClass(), "second", (byte) 32);
        setIntField(term172153, term172153.getClass(), "nano", 72950347);
        setField(term172148, term172148.getClass(), "time", term172153);
        setField(term171989, term171989.getClass(), "firstPlayDate", term172148);
        setField(term171989, term171989.getClass(), "lastGameId", "BBYhufonfC");
        setField(term171989, term171989.getClass(), "lastRomVersion", "gONpcfzuaS");
        setField(term171989, term171989.getClass(), "lastDataVersion", "GFIAakuePk");
        setIntField(term172195, term172195.getClass(), "year", 2017);
        setShortField(term172195, term172195.getClass(), "month", (short) 3);
        setShortField(term172195, term172195.getClass(), "day", (short) 3);
        setField(term172194, term172194.getClass(), "date", term172195);
        setByteField(term172199, term172199.getClass(), "hour", (byte) 3);
        setByteField(term172199, term172199.getClass(), "minute", (byte) 47);
        setByteField(term172199, term172199.getClass(), "second", (byte) 45);
        setIntField(term172199, term172199.getClass(), "nano", 454254046);
        setField(term172194, term172194.getClass(), "time", term172199);
        setField(term171989, term171989.getClass(), "lastPlayDate", term172194);
        setIntField(term171989, term171989.getClass(), "lastPlaceId", -1698342837);
        setField(term171989, term171989.getClass(), "lastPlaceName", "hNGAMuzptC");
        setField(term171989, term171989.getClass(), "lastRegionId", "oJkataxIMU");
        setField(term171989, term171989.getClass(), "lastRegionName", "vRLnmEEamN");
        setField(term171989, term171989.getClass(), "lastAllNetId", "NYuTLpktFv");
        setField(term171989, term171989.getClass(), "lastClientId", "FneAhRnndA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KaPVoelwqi";
        callMethod(klass, "setLastClientId", argTypes, term171989, args);
    }

};


