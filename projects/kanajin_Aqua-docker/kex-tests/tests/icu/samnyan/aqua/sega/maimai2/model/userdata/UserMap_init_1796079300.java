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

public class UserMap_init_1796079300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573251;

    public UserMap_init_1796079300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term573255 = new Long(5295517562699482299L);
        Integer term573318 = new Integer(-1900819498);
        Integer term573320 = new Integer(-1374608663);
        Integer term573322 = new Integer(-1618100560);
        Integer term573324 = new Integer(751804772);
        Integer term573326 = new Integer(1423413334);
        ArrayList term573316 = new ArrayList();
        ((ArrayList) term573316).add(term573318);
        ((ArrayList) term573316).add(term573320);
        ((ArrayList) term573316).add(term573322);
        ((ArrayList) term573316).add(term573324);
        ((ArrayList) term573316).add(term573326);
        Integer term573332 = new Integer(-1579434672);
        ArrayList term573330 = new ArrayList();
        ((ArrayList) term573330).add(term573332);
        term573251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term573253 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term573269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term573270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term573274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term573279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term573280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term573284 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term573251, term573251.getClass(), "id", -285585536217124742L);
        setLongField(term573253, term573253.getClass(), "id", 8450667731140396820L);
        setField(term573253, term573253.getClass(), "extId", term573255);
        setField(term573253, term573253.getClass(), "luid", "PGrXrCrNgR");
        setIntField(term573270, term573270.getClass(), "year", 2011);
        setShortField(term573270, term573270.getClass(), "month", (short) 9);
        setShortField(term573270, term573270.getClass(), "day", (short) 7);
        setField(term573269, term573269.getClass(), "date", term573270);
        setByteField(term573274, term573274.getClass(), "hour", (byte) 9);
        setByteField(term573274, term573274.getClass(), "minute", (byte) 31);
        setByteField(term573274, term573274.getClass(), "second", (byte) 37);
        setIntField(term573274, term573274.getClass(), "nano", 559056051);
        setField(term573269, term573269.getClass(), "time", term573274);
        setField(term573253, term573253.getClass(), "registerTime", term573269);
        setIntField(term573280, term573280.getClass(), "year", 2016);
        setShortField(term573280, term573280.getClass(), "month", (short) 2);
        setShortField(term573280, term573280.getClass(), "day", (short) 25);
        setField(term573279, term573279.getClass(), "date", term573280);
        setByteField(term573284, term573284.getClass(), "hour", (byte) 23);
        setByteField(term573284, term573284.getClass(), "minute", (byte) 49);
        setByteField(term573284, term573284.getClass(), "second", (byte) 23);
        setIntField(term573284, term573284.getClass(), "nano", 683094927);
        setField(term573279, term573279.getClass(), "time", term573284);
        setField(term573253, term573253.getClass(), "accessTime", term573279);
        setField(term573251, term573251.getClass(), "card", term573253);
        setField(term573251, term573251.getClass(), "userName", "EULRvNAJqx");
        setIntField(term573251, term573251.getClass(), "isNetMember", 1460579209);
        setIntField(term573251, term573251.getClass(), "iconId", 1156532903);
        setIntField(term573251, term573251.getClass(), "plateId", 1917551900);
        setIntField(term573251, term573251.getClass(), "titleId", -699344526);
        setIntField(term573251, term573251.getClass(), "partnerId", -1387520244);
        setIntField(term573251, term573251.getClass(), "frameId", -1464945231);
        setIntField(term573251, term573251.getClass(), "selectMapId", -1708820760);
        setIntField(term573251, term573251.getClass(), "totalAwake", -36119261);
        setIntField(term573251, term573251.getClass(), "gradeRating", -1308289364);
        setIntField(term573251, term573251.getClass(), "musicRating", 906169529);
        setIntField(term573251, term573251.getClass(), "playerRating", 1963973476);
        setIntField(term573251, term573251.getClass(), "highestRating", -1414670849);
        setIntField(term573251, term573251.getClass(), "gradeRank", -1168125305);
        setIntField(term573251, term573251.getClass(), "classRank", 1539479374);
        setIntField(term573251, term573251.getClass(), "courseRank", -1929010375);
        setField(term573251, term573251.getClass(), "charaSlot", term573316);
        setField(term573251, term573251.getClass(), "charaLockSlot", term573330);
        setLongField(term573251, term573251.getClass(), "contentBit", 351095557613066559L);
        setIntField(term573251, term573251.getClass(), "playCount", -649451321);
        setField(term573251, term573251.getClass(), "eventWatchedDate", "AYcpwIVJmz");
        setField(term573251, term573251.getClass(), "lastGameId", "YSPKLVNKTc");
        setField(term573251, term573251.getClass(), "lastRomVersion", "akyvqtZpjc");
        setField(term573251, term573251.getClass(), "lastDataVersion", "vGXflxkhjP");
        setField(term573251, term573251.getClass(), "lastLoginDate", "ryBTyRbhBQ");
        setField(term573251, term573251.getClass(), "lastPlayDate", "qBYSFFIJDU");
        setIntField(term573251, term573251.getClass(), "lastPlayCredit", -1420484405);
        setIntField(term573251, term573251.getClass(), "lastPlayMode", 1065857896);
        setIntField(term573251, term573251.getClass(), "lastPlaceId", 1443014202);
        setField(term573251, term573251.getClass(), "lastPlaceName", "HMbuyeqRqp");
        setIntField(term573251, term573251.getClass(), "lastAllNetId", -257057606);
        setIntField(term573251, term573251.getClass(), "lastRegionId", -769898887);
        setField(term573251, term573251.getClass(), "lastRegionName", "sOiXQdZPmf");
        setField(term573251, term573251.getClass(), "lastClientId", "wlzJPUYmxR");
        setField(term573251, term573251.getClass(), "lastCountryCode", "MylkMzluce");
        setIntField(term573251, term573251.getClass(), "lastSelectEMoney", 1668483297);
        setIntField(term573251, term573251.getClass(), "lastSelectTicket", 1121829833);
        setIntField(term573251, term573251.getClass(), "lastSelectCourse", 981925414);
        setIntField(term573251, term573251.getClass(), "lastCountCourse", 1818636396);
        setField(term573251, term573251.getClass(), "firstGameId", "qisajGUsvP");
        setField(term573251, term573251.getClass(), "firstRomVersion", "eKAyPnOhdq");
        setField(term573251, term573251.getClass(), "firstDataVersion", "FwMzlNzHAM");
        setField(term573251, term573251.getClass(), "firstPlayDate", "CXSpCisENQ");
        setField(term573251, term573251.getClass(), "compatibleCmVersion", "BxdUrZMYje");
        setField(term573251, term573251.getClass(), "dailyBonusDate", "nQxcLEaCoi");
        setField(term573251, term573251.getClass(), "dailyCourseBonusDate", "fWFsMZgMmT");
        setField(term573251, term573251.getClass(), "lastPairLoginDate", "QWHLhfMYRi");
        setField(term573251, term573251.getClass(), "lastTrialPlayDate", "PmBNfgmHJQ");
        setIntField(term573251, term573251.getClass(), "playVsCount", 2098790436);
        setIntField(term573251, term573251.getClass(), "playSyncCount", 653927801);
        setIntField(term573251, term573251.getClass(), "winCount", 1606211137);
        setIntField(term573251, term573251.getClass(), "helpCount", -198430566);
        setIntField(term573251, term573251.getClass(), "comboCount", -314347485);
        setLongField(term573251, term573251.getClass(), "totalDeluxscore", -4199631222733729244L);
        setLongField(term573251, term573251.getClass(), "totalBasicDeluxscore", -8385514963338920782L);
        setLongField(term573251, term573251.getClass(), "totalAdvancedDeluxscore", -8352748939621608604L);
        setLongField(term573251, term573251.getClass(), "totalExpertDeluxscore", -6576015578845701576L);
        setLongField(term573251, term573251.getClass(), "totalMasterDeluxscore", 8654785387132501356L);
        setLongField(term573251, term573251.getClass(), "totalReMasterDeluxscore", -1265002046700776446L);
        setIntField(term573251, term573251.getClass(), "totalSync", 720865268);
        setIntField(term573251, term573251.getClass(), "totalBasicSync", -467055559);
        setIntField(term573251, term573251.getClass(), "totalAdvancedSync", 72797080);
        setIntField(term573251, term573251.getClass(), "totalExpertSync", -448022642);
        setIntField(term573251, term573251.getClass(), "totalMasterSync", -89936353);
        setIntField(term573251, term573251.getClass(), "totalReMasterSync", 17466248);
        setLongField(term573251, term573251.getClass(), "totalAchievement", -1309809941221752040L);
        setLongField(term573251, term573251.getClass(), "totalBasicAchievement", -7956383383435466862L);
        setLongField(term573251, term573251.getClass(), "totalAdvancedAchievement", 8927752796455841200L);
        setLongField(term573251, term573251.getClass(), "totalExpertAchievement", 2442053475180358270L);
        setLongField(term573251, term573251.getClass(), "totalMasterAchievement", -3059901798541561527L);
        setLongField(term573251, term573251.getClass(), "totalReMasterAchievement", 4080443744104353652L);
        setLongField(term573251, term573251.getClass(), "playerOldRating", 1359767636867801962L);
        setLongField(term573251, term573251.getClass(), "playerNewRating", 9217576931246225277L);
        setIntField(term573251, term573251.getClass(), "banState", 482695779);
        setLongField(term573251, term573251.getClass(), "dateTime", 4113035650120792049L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term573251;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


