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

public class UserData_setMultiWinCount_54323334963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156357;
     Object term156633;

    public UserData_setMultiWinCount_54323334963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156361 = new Long(-532956263280568707L);
        term156357 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term156359 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156390 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156407 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156408 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156412 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156521 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156567 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156357, term156357.getClass(), "id", -3527774235000527109L);
        setLongField(term156359, term156359.getClass(), "id", 7471635522817277586L);
        setField(term156359, term156359.getClass(), "extId", term156361);
        setField(term156359, term156359.getClass(), "luid", "PXtEfvnxXo");
        setIntField(term156376, term156376.getClass(), "year", 2015);
        setShortField(term156376, term156376.getClass(), "month", (short) 10);
        setShortField(term156376, term156376.getClass(), "day", (short) 18);
        setField(term156375, term156375.getClass(), "date", term156376);
        setByteField(term156380, term156380.getClass(), "hour", (byte) 7);
        setByteField(term156380, term156380.getClass(), "minute", (byte) 55);
        setByteField(term156380, term156380.getClass(), "second", (byte) 30);
        setIntField(term156380, term156380.getClass(), "nano", 298001467);
        setField(term156375, term156375.getClass(), "time", term156380);
        setField(term156359, term156359.getClass(), "registerTime", term156375);
        setIntField(term156386, term156386.getClass(), "year", 2017);
        setShortField(term156386, term156386.getClass(), "month", (short) 4);
        setShortField(term156386, term156386.getClass(), "day", (short) 2);
        setField(term156385, term156385.getClass(), "date", term156386);
        setByteField(term156390, term156390.getClass(), "hour", (byte) 11);
        setByteField(term156390, term156390.getClass(), "minute", (byte) 18);
        setByteField(term156390, term156390.getClass(), "second", (byte) 44);
        setIntField(term156390, term156390.getClass(), "nano", 237956240);
        setField(term156385, term156385.getClass(), "time", term156390);
        setField(term156359, term156359.getClass(), "accessTime", term156385);
        setField(term156357, term156357.getClass(), "card", term156359);
        setField(term156357, term156357.getClass(), "userName", "VRanEGfPea");
        setIntField(term156408, term156408.getClass(), "year", 2014);
        setShortField(term156408, term156408.getClass(), "month", (short) 10);
        setShortField(term156408, term156408.getClass(), "day", (short) 6);
        setField(term156407, term156407.getClass(), "date", term156408);
        setByteField(term156412, term156412.getClass(), "hour", (byte) 1);
        setByteField(term156412, term156412.getClass(), "minute", (byte) 54);
        setByteField(term156412, term156412.getClass(), "second", (byte) 49);
        setIntField(term156412, term156412.getClass(), "nano", 767243537);
        setField(term156407, term156407.getClass(), "time", term156412);
        setField(term156357, term156357.getClass(), "lastLoginDate", term156407);
        setBooleanField(term156357, term156357.getClass(), "isWebJoin", false);
        setField(term156357, term156357.getClass(), "webLimitDate", "aGdROcHtyG");
        setIntField(term156357, term156357.getClass(), "level", -443514250);
        setIntField(term156357, term156357.getClass(), "reincarnationNum", 1623408712);
        setField(term156357, term156357.getClass(), "exp", "grxNCPTaxQ");
        setLongField(term156357, term156357.getClass(), "point", -275396578570511122L);
        setLongField(term156357, term156357.getClass(), "totalPoint", -8062307215635891271L);
        setIntField(term156357, term156357.getClass(), "playCount", -689716944);
        setIntField(term156357, term156357.getClass(), "multiPlayCount", -76212338);
        setIntField(term156357, term156357.getClass(), "multiWinCount", 1841912944);
        setIntField(term156357, term156357.getClass(), "requestResCount", 1546600239);
        setIntField(term156357, term156357.getClass(), "acceptResCount", -1396225638);
        setIntField(term156357, term156357.getClass(), "successResCount", -241102183);
        setIntField(term156357, term156357.getClass(), "playerRating", -1633122154);
        setIntField(term156357, term156357.getClass(), "highestRating", 1017124411);
        setIntField(term156357, term156357.getClass(), "nameplateId", -1833430963);
        setIntField(term156357, term156357.getClass(), "frameId", -1688592299);
        setIntField(term156357, term156357.getClass(), "characterId", 1835314181);
        setIntField(term156357, term156357.getClass(), "trophyId", 990656402);
        setIntField(term156357, term156357.getClass(), "playedTutorialBit", -105353462);
        setIntField(term156357, term156357.getClass(), "firstTutorialCancelNum", 1445070014);
        setIntField(term156357, term156357.getClass(), "masterTutorialCancelNum", -2066241981);
        setIntField(term156357, term156357.getClass(), "totalRepertoireCount", -891786731);
        setIntField(term156357, term156357.getClass(), "totalMapNum", -807543898);
        setLongField(term156357, term156357.getClass(), "totalHiScore", 4269096919613934136L);
        setLongField(term156357, term156357.getClass(), "totalBasicHighScore", -2563244893214775249L);
        setLongField(term156357, term156357.getClass(), "totalAdvancedHighScore", 2634037196192273345L);
        setLongField(term156357, term156357.getClass(), "totalExpertHighScore", 2205040918557782878L);
        setLongField(term156357, term156357.getClass(), "totalMasterHighScore", 8369727850301838022L);
        setIntField(term156469, term156469.getClass(), "year", 2019);
        setShortField(term156469, term156469.getClass(), "month", (short) 1);
        setShortField(term156469, term156469.getClass(), "day", (short) 29);
        setField(term156468, term156468.getClass(), "date", term156469);
        setByteField(term156473, term156473.getClass(), "hour", (byte) 23);
        setByteField(term156473, term156473.getClass(), "minute", (byte) 17);
        setByteField(term156473, term156473.getClass(), "second", (byte) 56);
        setIntField(term156473, term156473.getClass(), "nano", 946611414);
        setField(term156468, term156468.getClass(), "time", term156473);
        setField(term156357, term156357.getClass(), "eventWatchedDate", term156468);
        setIntField(term156357, term156357.getClass(), "friendCount", -1643992590);
        setBooleanField(term156357, term156357.getClass(), "isMaimai", true);
        setField(term156357, term156357.getClass(), "firstGameId", "VSAOMfeZza");
        setField(term156357, term156357.getClass(), "firstRomVersion", "SfwPnHKjAh");
        setField(term156357, term156357.getClass(), "firstDataVersion", "slVCZJOwTn");
        setIntField(term156517, term156517.getClass(), "year", 2011);
        setShortField(term156517, term156517.getClass(), "month", (short) 8);
        setShortField(term156517, term156517.getClass(), "day", (short) 21);
        setField(term156516, term156516.getClass(), "date", term156517);
        setByteField(term156521, term156521.getClass(), "hour", (byte) 20);
        setByteField(term156521, term156521.getClass(), "minute", (byte) 34);
        setByteField(term156521, term156521.getClass(), "second", (byte) 42);
        setIntField(term156521, term156521.getClass(), "nano", 280683987);
        setField(term156516, term156516.getClass(), "time", term156521);
        setField(term156357, term156357.getClass(), "firstPlayDate", term156516);
        setField(term156357, term156357.getClass(), "lastGameId", "wyOXHOMKYx");
        setField(term156357, term156357.getClass(), "lastRomVersion", "rvkJHBxSuS");
        setField(term156357, term156357.getClass(), "lastDataVersion", "XChVAzyqqj");
        setIntField(term156563, term156563.getClass(), "year", 2022);
        setShortField(term156563, term156563.getClass(), "month", (short) 12);
        setShortField(term156563, term156563.getClass(), "day", (short) 30);
        setField(term156562, term156562.getClass(), "date", term156563);
        setByteField(term156567, term156567.getClass(), "hour", (byte) 21);
        setByteField(term156567, term156567.getClass(), "minute", (byte) 43);
        setByteField(term156567, term156567.getClass(), "second", (byte) 14);
        setIntField(term156567, term156567.getClass(), "nano", 926666739);
        setField(term156562, term156562.getClass(), "time", term156567);
        setField(term156357, term156357.getClass(), "lastPlayDate", term156562);
        setIntField(term156357, term156357.getClass(), "lastPlaceId", 1617077670);
        setField(term156357, term156357.getClass(), "lastPlaceName", "niqsKibyMX");
        setField(term156357, term156357.getClass(), "lastRegionId", "EEigYHpeLr");
        setField(term156357, term156357.getClass(), "lastRegionName", "iOZRBGDCUA");
        setField(term156357, term156357.getClass(), "lastAllNetId", "SNLGmwYLAV");
        setField(term156357, term156357.getClass(), "lastClientId", "FskwpQdCkf");
        term156633 = new Integer(2071351288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term156633;
        callMethod(klass, "setMultiWinCount", argTypes, term156357, args);
    }

};


