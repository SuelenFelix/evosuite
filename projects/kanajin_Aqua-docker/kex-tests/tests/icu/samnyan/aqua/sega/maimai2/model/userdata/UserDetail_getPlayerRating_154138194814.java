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

public class UserDetail_getPlayerRating_154138194814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203004;

    public UserDetail_getPlayerRating_154138194814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203008 = new Long(3472971833455746664L);
        Integer term203071 = new Integer(-72892619);
        Integer term203073 = new Integer(907161445);
        Integer term203075 = new Integer(-107125345);
        Integer term203077 = new Integer(-1484271501);
        Integer term203079 = new Integer(1994800842);
        Integer term203081 = new Integer(418349525);
        Integer term203083 = new Integer(989214721);
        Integer term203085 = new Integer(1509604);
        ArrayList term203069 = new ArrayList();
        ((ArrayList) term203069).add(term203071);
        ((ArrayList) term203069).add(term203073);
        ((ArrayList) term203069).add(term203075);
        ((ArrayList) term203069).add(term203077);
        ((ArrayList) term203069).add(term203079);
        ((ArrayList) term203069).add(term203081);
        ((ArrayList) term203069).add(term203083);
        ((ArrayList) term203069).add(term203085);
        Integer term203091 = new Integer(516929449);
        Integer term203093 = new Integer(86726117);
        Integer term203095 = new Integer(-142908686);
        Integer term203097 = new Integer(780437076);
        Integer term203099 = new Integer(-1290991126);
        Integer term203101 = new Integer(1579548215);
        Integer term203103 = new Integer(518866176);
        Integer term203105 = new Integer(-1352533284);
        Integer term203107 = new Integer(-149022151);
        ArrayList term203089 = new ArrayList();
        ((ArrayList) term203089).add(term203091);
        ((ArrayList) term203089).add(term203093);
        ((ArrayList) term203089).add(term203095);
        ((ArrayList) term203089).add(term203097);
        ((ArrayList) term203089).add(term203099);
        ((ArrayList) term203089).add(term203101);
        ((ArrayList) term203089).add(term203103);
        ((ArrayList) term203089).add(term203105);
        ((ArrayList) term203089).add(term203107);
        term203004 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term203006 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term203022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term203032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203037 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term203004, term203004.getClass(), "id", 2705815334800907277L);
        setLongField(term203006, term203006.getClass(), "id", -1480160142292210731L);
        setField(term203006, term203006.getClass(), "extId", term203008);
        setField(term203006, term203006.getClass(), "luid", "FOCcfSPbbu");
        setIntField(term203023, term203023.getClass(), "year", 2026);
        setShortField(term203023, term203023.getClass(), "month", (short) 11);
        setShortField(term203023, term203023.getClass(), "day", (short) 25);
        setField(term203022, term203022.getClass(), "date", term203023);
        setByteField(term203027, term203027.getClass(), "hour", (byte) 12);
        setByteField(term203027, term203027.getClass(), "minute", (byte) 39);
        setByteField(term203027, term203027.getClass(), "second", (byte) 8);
        setIntField(term203027, term203027.getClass(), "nano", 444272669);
        setField(term203022, term203022.getClass(), "time", term203027);
        setField(term203006, term203006.getClass(), "registerTime", term203022);
        setIntField(term203033, term203033.getClass(), "year", 2023);
        setShortField(term203033, term203033.getClass(), "month", (short) 1);
        setShortField(term203033, term203033.getClass(), "day", (short) 9);
        setField(term203032, term203032.getClass(), "date", term203033);
        setByteField(term203037, term203037.getClass(), "hour", (byte) 5);
        setByteField(term203037, term203037.getClass(), "minute", (byte) 45);
        setByteField(term203037, term203037.getClass(), "second", (byte) 39);
        setIntField(term203037, term203037.getClass(), "nano", 734895244);
        setField(term203032, term203032.getClass(), "time", term203037);
        setField(term203006, term203006.getClass(), "accessTime", term203032);
        setField(term203004, term203004.getClass(), "card", term203006);
        setField(term203004, term203004.getClass(), "userName", "UPmwujGhlc");
        setIntField(term203004, term203004.getClass(), "isNetMember", 998281573);
        setIntField(term203004, term203004.getClass(), "iconId", 1538565026);
        setIntField(term203004, term203004.getClass(), "plateId", 1510446613);
        setIntField(term203004, term203004.getClass(), "titleId", -591217691);
        setIntField(term203004, term203004.getClass(), "partnerId", -1436479682);
        setIntField(term203004, term203004.getClass(), "frameId", -87850160);
        setIntField(term203004, term203004.getClass(), "selectMapId", 2100422614);
        setIntField(term203004, term203004.getClass(), "totalAwake", 95434101);
        setIntField(term203004, term203004.getClass(), "gradeRating", 1578254763);
        setIntField(term203004, term203004.getClass(), "musicRating", -1197972603);
        setIntField(term203004, term203004.getClass(), "playerRating", 82035733);
        setIntField(term203004, term203004.getClass(), "highestRating", -815104311);
        setIntField(term203004, term203004.getClass(), "gradeRank", -323574733);
        setIntField(term203004, term203004.getClass(), "classRank", -1600567927);
        setIntField(term203004, term203004.getClass(), "courseRank", -1051157170);
        setField(term203004, term203004.getClass(), "charaSlot", term203069);
        setField(term203004, term203004.getClass(), "charaLockSlot", term203089);
        setLongField(term203004, term203004.getClass(), "contentBit", 3914089655926308630L);
        setIntField(term203004, term203004.getClass(), "playCount", 1267890763);
        setField(term203004, term203004.getClass(), "eventWatchedDate", "pQdTbZcdsU");
        setField(term203004, term203004.getClass(), "lastGameId", "zYbZAMKJJx");
        setField(term203004, term203004.getClass(), "lastRomVersion", "UbkdwQOyIg");
        setField(term203004, term203004.getClass(), "lastDataVersion", "dFXhuubrpE");
        setField(term203004, term203004.getClass(), "lastLoginDate", "fPBxFWEXsZ");
        setField(term203004, term203004.getClass(), "lastPlayDate", "DTSquzpmAy");
        setIntField(term203004, term203004.getClass(), "lastPlayCredit", -354908388);
        setIntField(term203004, term203004.getClass(), "lastPlayMode", -1823173740);
        setIntField(term203004, term203004.getClass(), "lastPlaceId", 711565551);
        setField(term203004, term203004.getClass(), "lastPlaceName", "sLSrByejly");
        setIntField(term203004, term203004.getClass(), "lastAllNetId", 1808622233);
        setIntField(term203004, term203004.getClass(), "lastRegionId", -1854319585);
        setField(term203004, term203004.getClass(), "lastRegionName", "mtPPnpDISm");
        setField(term203004, term203004.getClass(), "lastClientId", "AoSkdtsoBx");
        setField(term203004, term203004.getClass(), "lastCountryCode", "jrZmqbTcJl");
        setIntField(term203004, term203004.getClass(), "lastSelectEMoney", 548084080);
        setIntField(term203004, term203004.getClass(), "lastSelectTicket", 1744825642);
        setIntField(term203004, term203004.getClass(), "lastSelectCourse", -1372443184);
        setIntField(term203004, term203004.getClass(), "lastCountCourse", -360453538);
        setField(term203004, term203004.getClass(), "firstGameId", "yNNgRsdIJB");
        setField(term203004, term203004.getClass(), "firstRomVersion", "mTGSRlRqoq");
        setField(term203004, term203004.getClass(), "firstDataVersion", "JqQcQNfjqu");
        setField(term203004, term203004.getClass(), "firstPlayDate", "yteVNaIzuh");
        setField(term203004, term203004.getClass(), "compatibleCmVersion", "enQDPVKJyy");
        setField(term203004, term203004.getClass(), "dailyBonusDate", "YUhHOeBPAY");
        setField(term203004, term203004.getClass(), "dailyCourseBonusDate", "uQajEqWBxv");
        setField(term203004, term203004.getClass(), "lastPairLoginDate", "nUQbsnKbql");
        setField(term203004, term203004.getClass(), "lastTrialPlayDate", "AdLJITWMJR");
        setIntField(term203004, term203004.getClass(), "playVsCount", -1878105251);
        setIntField(term203004, term203004.getClass(), "playSyncCount", 269733901);
        setIntField(term203004, term203004.getClass(), "winCount", -736927476);
        setIntField(term203004, term203004.getClass(), "helpCount", 1853113749);
        setIntField(term203004, term203004.getClass(), "comboCount", -586438860);
        setLongField(term203004, term203004.getClass(), "totalDeluxscore", 471574466241202477L);
        setLongField(term203004, term203004.getClass(), "totalBasicDeluxscore", 6921966529919120680L);
        setLongField(term203004, term203004.getClass(), "totalAdvancedDeluxscore", 7885177573716845935L);
        setLongField(term203004, term203004.getClass(), "totalExpertDeluxscore", 7611899443645591700L);
        setLongField(term203004, term203004.getClass(), "totalMasterDeluxscore", 904109184471797244L);
        setLongField(term203004, term203004.getClass(), "totalReMasterDeluxscore", 7335322702070483255L);
        setIntField(term203004, term203004.getClass(), "totalSync", -1602722865);
        setIntField(term203004, term203004.getClass(), "totalBasicSync", -1584130001);
        setIntField(term203004, term203004.getClass(), "totalAdvancedSync", -1669995376);
        setIntField(term203004, term203004.getClass(), "totalExpertSync", -684090418);
        setIntField(term203004, term203004.getClass(), "totalMasterSync", 248781931);
        setIntField(term203004, term203004.getClass(), "totalReMasterSync", 1444890082);
        setLongField(term203004, term203004.getClass(), "totalAchievement", 4882267736842596671L);
        setLongField(term203004, term203004.getClass(), "totalBasicAchievement", 2424177001662013695L);
        setLongField(term203004, term203004.getClass(), "totalAdvancedAchievement", 4099916510103109834L);
        setLongField(term203004, term203004.getClass(), "totalExpertAchievement", -3195597238532109139L);
        setLongField(term203004, term203004.getClass(), "totalMasterAchievement", -6010618625691381313L);
        setLongField(term203004, term203004.getClass(), "totalReMasterAchievement", 166461101785203931L);
        setLongField(term203004, term203004.getClass(), "playerOldRating", -5498768254914601103L);
        setLongField(term203004, term203004.getClass(), "playerNewRating", -7313763512981216447L);
        setIntField(term203004, term203004.getClass(), "banState", -463625508);
        setLongField(term203004, term203004.getClass(), "dateTime", -1012017279799552950L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term203004, args);
    }

};


