package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getPlayerRating_154138194813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202949;

    public UserDetail_getPlayerRating_154138194813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202953 = new Long(3472971833455746664L);
        Integer term203016 = new Integer(-72892619);
        Integer term203018 = new Integer(907161445);
        Integer term203020 = new Integer(-107125345);
        Integer term203022 = new Integer(-1484271501);
        Integer term203024 = new Integer(1994800842);
        Integer term203026 = new Integer(418349525);
        Integer term203028 = new Integer(989214721);
        Integer term203030 = new Integer(1509604);
        ArrayList term203014 = new ArrayList();
        ((ArrayList) term203014).add(term203016);
        ((ArrayList) term203014).add(term203018);
        ((ArrayList) term203014).add(term203020);
        ((ArrayList) term203014).add(term203022);
        ((ArrayList) term203014).add(term203024);
        ((ArrayList) term203014).add(term203026);
        ((ArrayList) term203014).add(term203028);
        ((ArrayList) term203014).add(term203030);
        Integer term203036 = new Integer(516929449);
        Integer term203038 = new Integer(86726117);
        Integer term203040 = new Integer(-142908686);
        Integer term203042 = new Integer(780437076);
        Integer term203044 = new Integer(-1290991126);
        Integer term203046 = new Integer(1579548215);
        Integer term203048 = new Integer(518866176);
        Integer term203050 = new Integer(-1352533284);
        Integer term203052 = new Integer(-149022151);
        ArrayList term203034 = new ArrayList();
        ((ArrayList) term203034).add(term203036);
        ((ArrayList) term203034).add(term203038);
        ((ArrayList) term203034).add(term203040);
        ((ArrayList) term203034).add(term203042);
        ((ArrayList) term203034).add(term203044);
        ((ArrayList) term203034).add(term203046);
        ((ArrayList) term203034).add(term203048);
        ((ArrayList) term203034).add(term203050);
        ((ArrayList) term203034).add(term203052);
        term202949 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term202951 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term202967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202982 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term202949, term202949.getClass(), "id", 2705815334800907277L);
        setLongField(term202951, term202951.getClass(), "id", -1480160142292210731L);
        setField(term202951, term202951.getClass(), "extId", term202953);
        setField(term202951, term202951.getClass(), "luid", "FOCcfSPbbu");
        setIntField(term202968, term202968.getClass(), "year", 2026);
        setShortField(term202968, term202968.getClass(), "month", (short) 11);
        setShortField(term202968, term202968.getClass(), "day", (short) 25);
        setField(term202967, term202967.getClass(), "date", term202968);
        setByteField(term202972, term202972.getClass(), "hour", (byte) 12);
        setByteField(term202972, term202972.getClass(), "minute", (byte) 39);
        setByteField(term202972, term202972.getClass(), "second", (byte) 8);
        setIntField(term202972, term202972.getClass(), "nano", 444272669);
        setField(term202967, term202967.getClass(), "time", term202972);
        setField(term202951, term202951.getClass(), "registerTime", term202967);
        setIntField(term202978, term202978.getClass(), "year", 2023);
        setShortField(term202978, term202978.getClass(), "month", (short) 1);
        setShortField(term202978, term202978.getClass(), "day", (short) 9);
        setField(term202977, term202977.getClass(), "date", term202978);
        setByteField(term202982, term202982.getClass(), "hour", (byte) 5);
        setByteField(term202982, term202982.getClass(), "minute", (byte) 45);
        setByteField(term202982, term202982.getClass(), "second", (byte) 39);
        setIntField(term202982, term202982.getClass(), "nano", 734895244);
        setField(term202977, term202977.getClass(), "time", term202982);
        setField(term202951, term202951.getClass(), "accessTime", term202977);
        setField(term202949, term202949.getClass(), "card", term202951);
        setField(term202949, term202949.getClass(), "userName", "UPmwujGhlc");
        setIntField(term202949, term202949.getClass(), "isNetMember", 998281573);
        setIntField(term202949, term202949.getClass(), "iconId", 1538565026);
        setIntField(term202949, term202949.getClass(), "plateId", 1510446613);
        setIntField(term202949, term202949.getClass(), "titleId", -591217691);
        setIntField(term202949, term202949.getClass(), "partnerId", -1436479682);
        setIntField(term202949, term202949.getClass(), "frameId", -87850160);
        setIntField(term202949, term202949.getClass(), "selectMapId", 2100422614);
        setIntField(term202949, term202949.getClass(), "totalAwake", 95434101);
        setIntField(term202949, term202949.getClass(), "gradeRating", 1578254763);
        setIntField(term202949, term202949.getClass(), "musicRating", -1197972603);
        setIntField(term202949, term202949.getClass(), "playerRating", 82035733);
        setIntField(term202949, term202949.getClass(), "highestRating", -815104311);
        setIntField(term202949, term202949.getClass(), "gradeRank", -323574733);
        setIntField(term202949, term202949.getClass(), "classRank", -1600567927);
        setIntField(term202949, term202949.getClass(), "courseRank", -1051157170);
        setField(term202949, term202949.getClass(), "charaSlot", term203014);
        setField(term202949, term202949.getClass(), "charaLockSlot", term203034);
        setLongField(term202949, term202949.getClass(), "contentBit", 3914089655926308630L);
        setIntField(term202949, term202949.getClass(), "playCount", 1267890763);
        setField(term202949, term202949.getClass(), "eventWatchedDate", "pQdTbZcdsU");
        setField(term202949, term202949.getClass(), "lastGameId", "zYbZAMKJJx");
        setField(term202949, term202949.getClass(), "lastRomVersion", "UbkdwQOyIg");
        setField(term202949, term202949.getClass(), "lastDataVersion", "dFXhuubrpE");
        setField(term202949, term202949.getClass(), "lastLoginDate", "fPBxFWEXsZ");
        setField(term202949, term202949.getClass(), "lastPlayDate", "DTSquzpmAy");
        setIntField(term202949, term202949.getClass(), "lastPlayCredit", -354908388);
        setIntField(term202949, term202949.getClass(), "lastPlayMode", -1823173740);
        setIntField(term202949, term202949.getClass(), "lastPlaceId", 711565551);
        setField(term202949, term202949.getClass(), "lastPlaceName", "sLSrByejly");
        setIntField(term202949, term202949.getClass(), "lastAllNetId", 1808622233);
        setIntField(term202949, term202949.getClass(), "lastRegionId", -1854319585);
        setField(term202949, term202949.getClass(), "lastRegionName", "mtPPnpDISm");
        setField(term202949, term202949.getClass(), "lastClientId", "AoSkdtsoBx");
        setField(term202949, term202949.getClass(), "lastCountryCode", "jrZmqbTcJl");
        setIntField(term202949, term202949.getClass(), "lastSelectEMoney", 548084080);
        setIntField(term202949, term202949.getClass(), "lastSelectTicket", 1744825642);
        setIntField(term202949, term202949.getClass(), "lastSelectCourse", -1372443184);
        setIntField(term202949, term202949.getClass(), "lastCountCourse", -360453538);
        setField(term202949, term202949.getClass(), "firstGameId", "yNNgRsdIJB");
        setField(term202949, term202949.getClass(), "firstRomVersion", "mTGSRlRqoq");
        setField(term202949, term202949.getClass(), "firstDataVersion", "JqQcQNfjqu");
        setField(term202949, term202949.getClass(), "firstPlayDate", "yteVNaIzuh");
        setField(term202949, term202949.getClass(), "compatibleCmVersion", "enQDPVKJyy");
        setField(term202949, term202949.getClass(), "dailyBonusDate", "YUhHOeBPAY");
        setField(term202949, term202949.getClass(), "dailyCourseBonusDate", "uQajEqWBxv");
        setField(term202949, term202949.getClass(), "lastPairLoginDate", "nUQbsnKbql");
        setField(term202949, term202949.getClass(), "lastTrialPlayDate", "AdLJITWMJR");
        setIntField(term202949, term202949.getClass(), "playVsCount", -1878105251);
        setIntField(term202949, term202949.getClass(), "playSyncCount", 269733901);
        setIntField(term202949, term202949.getClass(), "winCount", -736927476);
        setIntField(term202949, term202949.getClass(), "helpCount", 1853113749);
        setIntField(term202949, term202949.getClass(), "comboCount", -586438860);
        setLongField(term202949, term202949.getClass(), "totalDeluxscore", 471574466241202477L);
        setLongField(term202949, term202949.getClass(), "totalBasicDeluxscore", 6921966529919120680L);
        setLongField(term202949, term202949.getClass(), "totalAdvancedDeluxscore", 7885177573716845935L);
        setLongField(term202949, term202949.getClass(), "totalExpertDeluxscore", 7611899443645591700L);
        setLongField(term202949, term202949.getClass(), "totalMasterDeluxscore", 904109184471797244L);
        setLongField(term202949, term202949.getClass(), "totalReMasterDeluxscore", 7335322702070483255L);
        setIntField(term202949, term202949.getClass(), "totalSync", -1602722865);
        setIntField(term202949, term202949.getClass(), "totalBasicSync", -1584130001);
        setIntField(term202949, term202949.getClass(), "totalAdvancedSync", -1669995376);
        setIntField(term202949, term202949.getClass(), "totalExpertSync", -684090418);
        setIntField(term202949, term202949.getClass(), "totalMasterSync", 248781931);
        setIntField(term202949, term202949.getClass(), "totalReMasterSync", 1444890082);
        setLongField(term202949, term202949.getClass(), "totalAchievement", 4882267736842596671L);
        setLongField(term202949, term202949.getClass(), "totalBasicAchievement", 2424177001662013695L);
        setLongField(term202949, term202949.getClass(), "totalAdvancedAchievement", 4099916510103109834L);
        setLongField(term202949, term202949.getClass(), "totalExpertAchievement", -3195597238532109139L);
        setLongField(term202949, term202949.getClass(), "totalMasterAchievement", -6010618625691381313L);
        setLongField(term202949, term202949.getClass(), "totalReMasterAchievement", 166461101785203931L);
        setLongField(term202949, term202949.getClass(), "playerOldRating", -5498768254914601103L);
        setLongField(term202949, term202949.getClass(), "playerNewRating", -7313763512981216447L);
        setIntField(term202949, term202949.getClass(), "banState", -463625508);
        setLongField(term202949, term202949.getClass(), "dateTime", -1012017279799552950L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term202949, args);
    }

};


