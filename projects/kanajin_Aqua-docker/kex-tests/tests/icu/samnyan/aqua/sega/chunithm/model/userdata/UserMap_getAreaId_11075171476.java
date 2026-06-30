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

public class UserMap_getAreaId_11075171476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281010;

    public UserMap_getAreaId_11075171476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281016 = new Long(4628458998884457238L);
        term281010 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term281012 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term281014 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281067 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281222 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281010, term281010.getClass(), "id", 3887073949062468445L);
        setLongField(term281012, term281012.getClass(), "id", 4269796195929114553L);
        setLongField(term281014, term281014.getClass(), "id", 8591178855281158820L);
        setField(term281014, term281014.getClass(), "extId", term281016);
        setField(term281014, term281014.getClass(), "luid", "zDqBWnYkse");
        setIntField(term281031, term281031.getClass(), "year", 2019);
        setShortField(term281031, term281031.getClass(), "month", (short) 3);
        setShortField(term281031, term281031.getClass(), "day", (short) 17);
        setField(term281030, term281030.getClass(), "date", term281031);
        setByteField(term281035, term281035.getClass(), "hour", (byte) 11);
        setByteField(term281035, term281035.getClass(), "minute", (byte) 42);
        setByteField(term281035, term281035.getClass(), "second", (byte) 44);
        setIntField(term281035, term281035.getClass(), "nano", 169054894);
        setField(term281030, term281030.getClass(), "time", term281035);
        setField(term281014, term281014.getClass(), "registerTime", term281030);
        setIntField(term281041, term281041.getClass(), "year", 2019);
        setShortField(term281041, term281041.getClass(), "month", (short) 11);
        setShortField(term281041, term281041.getClass(), "day", (short) 9);
        setField(term281040, term281040.getClass(), "date", term281041);
        setByteField(term281045, term281045.getClass(), "hour", (byte) 8);
        setByteField(term281045, term281045.getClass(), "minute", (byte) 24);
        setByteField(term281045, term281045.getClass(), "second", (byte) 5);
        setIntField(term281045, term281045.getClass(), "nano", 23613780);
        setField(term281040, term281040.getClass(), "time", term281045);
        setField(term281014, term281014.getClass(), "accessTime", term281040);
        setField(term281012, term281012.getClass(), "card", term281014);
        setField(term281012, term281012.getClass(), "userName", "aJCCJNpMCR");
        setIntField(term281063, term281063.getClass(), "year", 2020);
        setShortField(term281063, term281063.getClass(), "month", (short) 2);
        setShortField(term281063, term281063.getClass(), "day", (short) 19);
        setField(term281062, term281062.getClass(), "date", term281063);
        setByteField(term281067, term281067.getClass(), "hour", (byte) 16);
        setByteField(term281067, term281067.getClass(), "minute", (byte) 45);
        setByteField(term281067, term281067.getClass(), "second", (byte) 29);
        setIntField(term281067, term281067.getClass(), "nano", 547803463);
        setField(term281062, term281062.getClass(), "time", term281067);
        setField(term281012, term281012.getClass(), "lastLoginDate", term281062);
        setBooleanField(term281012, term281012.getClass(), "isWebJoin", false);
        setField(term281012, term281012.getClass(), "webLimitDate", "mMmhYmbxdG");
        setIntField(term281012, term281012.getClass(), "level", 774531243);
        setIntField(term281012, term281012.getClass(), "reincarnationNum", 711703993);
        setField(term281012, term281012.getClass(), "exp", "HryXzTbmTy");
        setLongField(term281012, term281012.getClass(), "point", -8153185445188422129L);
        setLongField(term281012, term281012.getClass(), "totalPoint", 2128957764288200150L);
        setIntField(term281012, term281012.getClass(), "playCount", -276563829);
        setIntField(term281012, term281012.getClass(), "multiPlayCount", 1580982720);
        setIntField(term281012, term281012.getClass(), "multiWinCount", 404999880);
        setIntField(term281012, term281012.getClass(), "requestResCount", 348427240);
        setIntField(term281012, term281012.getClass(), "acceptResCount", 173363669);
        setIntField(term281012, term281012.getClass(), "successResCount", 1700003880);
        setIntField(term281012, term281012.getClass(), "playerRating", 1479107053);
        setIntField(term281012, term281012.getClass(), "highestRating", -1251439328);
        setIntField(term281012, term281012.getClass(), "nameplateId", 1798785752);
        setIntField(term281012, term281012.getClass(), "frameId", 195739943);
        setIntField(term281012, term281012.getClass(), "characterId", 594364543);
        setIntField(term281012, term281012.getClass(), "trophyId", 401266476);
        setIntField(term281012, term281012.getClass(), "playedTutorialBit", -1352592419);
        setIntField(term281012, term281012.getClass(), "firstTutorialCancelNum", -1352699741);
        setIntField(term281012, term281012.getClass(), "masterTutorialCancelNum", 1775677389);
        setIntField(term281012, term281012.getClass(), "totalRepertoireCount", 781977367);
        setIntField(term281012, term281012.getClass(), "totalMapNum", 1734793666);
        setLongField(term281012, term281012.getClass(), "totalHiScore", -8941000155799667503L);
        setLongField(term281012, term281012.getClass(), "totalBasicHighScore", 8762299939166364370L);
        setLongField(term281012, term281012.getClass(), "totalAdvancedHighScore", -2058732347677769008L);
        setLongField(term281012, term281012.getClass(), "totalExpertHighScore", -1212345114056050539L);
        setLongField(term281012, term281012.getClass(), "totalMasterHighScore", -4426532311030321254L);
        setIntField(term281124, term281124.getClass(), "year", 2023);
        setShortField(term281124, term281124.getClass(), "month", (short) 10);
        setShortField(term281124, term281124.getClass(), "day", (short) 9);
        setField(term281123, term281123.getClass(), "date", term281124);
        setByteField(term281128, term281128.getClass(), "hour", (byte) 1);
        setByteField(term281128, term281128.getClass(), "minute", (byte) 51);
        setByteField(term281128, term281128.getClass(), "second", (byte) 39);
        setIntField(term281128, term281128.getClass(), "nano", 57286152);
        setField(term281123, term281123.getClass(), "time", term281128);
        setField(term281012, term281012.getClass(), "eventWatchedDate", term281123);
        setIntField(term281012, term281012.getClass(), "friendCount", -2143217889);
        setBooleanField(term281012, term281012.getClass(), "isMaimai", false);
        setField(term281012, term281012.getClass(), "firstGameId", "onBrOcbLBy");
        setField(term281012, term281012.getClass(), "firstRomVersion", "bRCSiJmxoG");
        setField(term281012, term281012.getClass(), "firstDataVersion", "gdETEfEDoV");
        setIntField(term281172, term281172.getClass(), "year", 2014);
        setShortField(term281172, term281172.getClass(), "month", (short) 9);
        setShortField(term281172, term281172.getClass(), "day", (short) 30);
        setField(term281171, term281171.getClass(), "date", term281172);
        setByteField(term281176, term281176.getClass(), "hour", (byte) 13);
        setByteField(term281176, term281176.getClass(), "minute", (byte) 8);
        setByteField(term281176, term281176.getClass(), "second", (byte) 57);
        setIntField(term281176, term281176.getClass(), "nano", 519510860);
        setField(term281171, term281171.getClass(), "time", term281176);
        setField(term281012, term281012.getClass(), "firstPlayDate", term281171);
        setField(term281012, term281012.getClass(), "lastGameId", "VxuAZfQUYL");
        setField(term281012, term281012.getClass(), "lastRomVersion", "JxFppbOcNK");
        setField(term281012, term281012.getClass(), "lastDataVersion", "VDRDLYjCJY");
        setIntField(term281218, term281218.getClass(), "year", 2016);
        setShortField(term281218, term281218.getClass(), "month", (short) 1);
        setShortField(term281218, term281218.getClass(), "day", (short) 26);
        setField(term281217, term281217.getClass(), "date", term281218);
        setByteField(term281222, term281222.getClass(), "hour", (byte) 11);
        setByteField(term281222, term281222.getClass(), "minute", (byte) 42);
        setByteField(term281222, term281222.getClass(), "second", (byte) 36);
        setIntField(term281222, term281222.getClass(), "nano", 321981469);
        setField(term281217, term281217.getClass(), "time", term281222);
        setField(term281012, term281012.getClass(), "lastPlayDate", term281217);
        setIntField(term281012, term281012.getClass(), "lastPlaceId", -2098845580);
        setField(term281012, term281012.getClass(), "lastPlaceName", "FAhGbTievR");
        setField(term281012, term281012.getClass(), "lastRegionId", "BOZOuwzOXv");
        setField(term281012, term281012.getClass(), "lastRegionName", "FeQMOQDSJC");
        setField(term281012, term281012.getClass(), "lastAllNetId", "qpEcsAfmwm");
        setField(term281012, term281012.getClass(), "lastClientId", "bkirFxxFur");
        setField(term281010, term281010.getClass(), "user", term281012);
        setIntField(term281010, term281010.getClass(), "mapId", 2130134973);
        setIntField(term281010, term281010.getClass(), "position", -503344387);
        setBooleanField(term281010, term281010.getClass(), "isClear", true);
        setIntField(term281010, term281010.getClass(), "areaId", 65559668);
        setIntField(term281010, term281010.getClass(), "routeNumber", -1000807164);
        setIntField(term281010, term281010.getClass(), "eventId", -426025570);
        setIntField(term281010, term281010.getClass(), "rate", 585898209);
        setIntField(term281010, term281010.getClass(), "statusCount", 427844033);
        setBooleanField(term281010, term281010.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreaId", argTypes, term281010, args);
    }

};


