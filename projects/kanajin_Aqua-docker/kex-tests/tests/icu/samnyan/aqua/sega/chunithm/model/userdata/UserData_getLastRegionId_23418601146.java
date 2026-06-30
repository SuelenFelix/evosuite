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

public class UserData_getLastRegionId_23418601146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148977;

    public UserData_getLastRegionId_23418601146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148981 = new Long(4689907154423223972L);
        term148977 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term148979 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149187 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148977, term148977.getClass(), "id", 6920150385523223759L);
        setLongField(term148979, term148979.getClass(), "id", -78405432235699904L);
        setField(term148979, term148979.getClass(), "extId", term148981);
        setField(term148979, term148979.getClass(), "luid", "rttNPStAfM");
        setIntField(term148996, term148996.getClass(), "year", 2012);
        setShortField(term148996, term148996.getClass(), "month", (short) 9);
        setShortField(term148996, term148996.getClass(), "day", (short) 4);
        setField(term148995, term148995.getClass(), "date", term148996);
        setByteField(term149000, term149000.getClass(), "hour", (byte) 19);
        setByteField(term149000, term149000.getClass(), "minute", (byte) 40);
        setByteField(term149000, term149000.getClass(), "second", (byte) 8);
        setIntField(term149000, term149000.getClass(), "nano", 749163460);
        setField(term148995, term148995.getClass(), "time", term149000);
        setField(term148979, term148979.getClass(), "registerTime", term148995);
        setIntField(term149006, term149006.getClass(), "year", 2022);
        setShortField(term149006, term149006.getClass(), "month", (short) 4);
        setShortField(term149006, term149006.getClass(), "day", (short) 10);
        setField(term149005, term149005.getClass(), "date", term149006);
        setByteField(term149010, term149010.getClass(), "hour", (byte) 10);
        setByteField(term149010, term149010.getClass(), "minute", (byte) 54);
        setByteField(term149010, term149010.getClass(), "second", (byte) 13);
        setIntField(term149010, term149010.getClass(), "nano", 390585085);
        setField(term149005, term149005.getClass(), "time", term149010);
        setField(term148979, term148979.getClass(), "accessTime", term149005);
        setField(term148977, term148977.getClass(), "card", term148979);
        setField(term148977, term148977.getClass(), "userName", "THLYTYdxwA");
        setIntField(term149028, term149028.getClass(), "year", 2027);
        setShortField(term149028, term149028.getClass(), "month", (short) 11);
        setShortField(term149028, term149028.getClass(), "day", (short) 4);
        setField(term149027, term149027.getClass(), "date", term149028);
        setByteField(term149032, term149032.getClass(), "hour", (byte) 15);
        setByteField(term149032, term149032.getClass(), "minute", (byte) 56);
        setByteField(term149032, term149032.getClass(), "second", (byte) 12);
        setIntField(term149032, term149032.getClass(), "nano", 941510981);
        setField(term149027, term149027.getClass(), "time", term149032);
        setField(term148977, term148977.getClass(), "lastLoginDate", term149027);
        setBooleanField(term148977, term148977.getClass(), "isWebJoin", true);
        setField(term148977, term148977.getClass(), "webLimitDate", "nMaKkGsKjH");
        setIntField(term148977, term148977.getClass(), "level", 862341418);
        setIntField(term148977, term148977.getClass(), "reincarnationNum", 2068475777);
        setField(term148977, term148977.getClass(), "exp", "bzgnEgNnJB");
        setLongField(term148977, term148977.getClass(), "point", -1742227387713986859L);
        setLongField(term148977, term148977.getClass(), "totalPoint", -6767834419480442076L);
        setIntField(term148977, term148977.getClass(), "playCount", 865947404);
        setIntField(term148977, term148977.getClass(), "multiPlayCount", -685471102);
        setIntField(term148977, term148977.getClass(), "multiWinCount", -1392152397);
        setIntField(term148977, term148977.getClass(), "requestResCount", 559505850);
        setIntField(term148977, term148977.getClass(), "acceptResCount", 83945804);
        setIntField(term148977, term148977.getClass(), "successResCount", -1680670781);
        setIntField(term148977, term148977.getClass(), "playerRating", -1210651793);
        setIntField(term148977, term148977.getClass(), "highestRating", 1725376668);
        setIntField(term148977, term148977.getClass(), "nameplateId", 563995066);
        setIntField(term148977, term148977.getClass(), "frameId", -1143070528);
        setIntField(term148977, term148977.getClass(), "characterId", -2013146103);
        setIntField(term148977, term148977.getClass(), "trophyId", 1831685253);
        setIntField(term148977, term148977.getClass(), "playedTutorialBit", 430196321);
        setIntField(term148977, term148977.getClass(), "firstTutorialCancelNum", 211291160);
        setIntField(term148977, term148977.getClass(), "masterTutorialCancelNum", -317734451);
        setIntField(term148977, term148977.getClass(), "totalRepertoireCount", -1297214762);
        setIntField(term148977, term148977.getClass(), "totalMapNum", -1749048132);
        setLongField(term148977, term148977.getClass(), "totalHiScore", -6778977735203433385L);
        setLongField(term148977, term148977.getClass(), "totalBasicHighScore", -6232367018247056109L);
        setLongField(term148977, term148977.getClass(), "totalAdvancedHighScore", 8211317791178483178L);
        setLongField(term148977, term148977.getClass(), "totalExpertHighScore", -5793340348804061710L);
        setLongField(term148977, term148977.getClass(), "totalMasterHighScore", -6971902098298027896L);
        setIntField(term149089, term149089.getClass(), "year", 2020);
        setShortField(term149089, term149089.getClass(), "month", (short) 9);
        setShortField(term149089, term149089.getClass(), "day", (short) 14);
        setField(term149088, term149088.getClass(), "date", term149089);
        setByteField(term149093, term149093.getClass(), "hour", (byte) 9);
        setByteField(term149093, term149093.getClass(), "minute", (byte) 56);
        setByteField(term149093, term149093.getClass(), "second", (byte) 12);
        setIntField(term149093, term149093.getClass(), "nano", 504208145);
        setField(term149088, term149088.getClass(), "time", term149093);
        setField(term148977, term148977.getClass(), "eventWatchedDate", term149088);
        setIntField(term148977, term148977.getClass(), "friendCount", 201489622);
        setBooleanField(term148977, term148977.getClass(), "isMaimai", true);
        setField(term148977, term148977.getClass(), "firstGameId", "trgyZVXoXP");
        setField(term148977, term148977.getClass(), "firstRomVersion", "zggGcOxpDe");
        setField(term148977, term148977.getClass(), "firstDataVersion", "XdJngfMEyc");
        setIntField(term149137, term149137.getClass(), "year", 2018);
        setShortField(term149137, term149137.getClass(), "month", (short) 9);
        setShortField(term149137, term149137.getClass(), "day", (short) 12);
        setField(term149136, term149136.getClass(), "date", term149137);
        setByteField(term149141, term149141.getClass(), "hour", (byte) 14);
        setByteField(term149141, term149141.getClass(), "minute", (byte) 40);
        setByteField(term149141, term149141.getClass(), "second", (byte) 41);
        setIntField(term149141, term149141.getClass(), "nano", 355428561);
        setField(term149136, term149136.getClass(), "time", term149141);
        setField(term148977, term148977.getClass(), "firstPlayDate", term149136);
        setField(term148977, term148977.getClass(), "lastGameId", "fBrxpovrjQ");
        setField(term148977, term148977.getClass(), "lastRomVersion", "vWNTKunytj");
        setField(term148977, term148977.getClass(), "lastDataVersion", "pbUCEQENML");
        setIntField(term149183, term149183.getClass(), "year", 2024);
        setShortField(term149183, term149183.getClass(), "month", (short) 8);
        setShortField(term149183, term149183.getClass(), "day", (short) 25);
        setField(term149182, term149182.getClass(), "date", term149183);
        setByteField(term149187, term149187.getClass(), "hour", (byte) 11);
        setByteField(term149187, term149187.getClass(), "minute", (byte) 8);
        setByteField(term149187, term149187.getClass(), "second", (byte) 51);
        setIntField(term149187, term149187.getClass(), "nano", 607202551);
        setField(term149182, term149182.getClass(), "time", term149187);
        setField(term148977, term148977.getClass(), "lastPlayDate", term149182);
        setIntField(term148977, term148977.getClass(), "lastPlaceId", -1557911649);
        setField(term148977, term148977.getClass(), "lastPlaceName", "iMEaCLgkkA");
        setField(term148977, term148977.getClass(), "lastRegionId", "GTYlwBwnyr");
        setField(term148977, term148977.getClass(), "lastRegionName", "EWesRocaYe");
        setField(term148977, term148977.getClass(), "lastAllNetId", "LXbvqrOwML");
        setField(term148977, term148977.getClass(), "lastClientId", "oJtyLMFIaY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term148977, args);
    }

};


