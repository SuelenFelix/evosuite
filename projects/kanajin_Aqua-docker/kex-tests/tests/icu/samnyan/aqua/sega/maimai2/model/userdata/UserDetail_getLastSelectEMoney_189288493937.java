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

public class UserDetail_getLastSelectEMoney_189288493937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4250503;

    public UserDetail_getLastSelectEMoney_189288493937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4250507 = new Long(-268890584351402081L);
        Integer term4250570 = new Integer(863394391);
        Integer term4250572 = new Integer(-1464666900);
        Integer term4250574 = new Integer(1514362336);
        Integer term4250576 = new Integer(-826362969);
        ArrayList term4250568 = new ArrayList();
        ((ArrayList) term4250568).add(term4250570);
        ((ArrayList) term4250568).add(term4250572);
        ((ArrayList) term4250568).add(term4250574);
        ((ArrayList) term4250568).add(term4250576);
        Integer term4250582 = new Integer(1062563319);
        Integer term4250584 = new Integer(515240740);
        Integer term4250586 = new Integer(-1221744120);
        Integer term4250588 = new Integer(1995800837);
        ArrayList term4250580 = new ArrayList();
        ((ArrayList) term4250580).add(term4250582);
        ((ArrayList) term4250580).add(term4250584);
        ((ArrayList) term4250580).add(term4250586);
        ((ArrayList) term4250580).add(term4250588);
        term4250503 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4250505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4250521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4250522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4250526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4250531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4250532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4250536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4250503, term4250503.getClass(), "id", 7750769505599613857L);
        setLongField(term4250505, term4250505.getClass(), "id", 3601799297876850003L);
        setField(term4250505, term4250505.getClass(), "extId", term4250507);
        setField(term4250505, term4250505.getClass(), "luid", "mZcvQZJUoQ");
        setIntField(term4250522, term4250522.getClass(), "year", 2017);
        setShortField(term4250522, term4250522.getClass(), "month", (short) 2);
        setShortField(term4250522, term4250522.getClass(), "day", (short) 28);
        setField(term4250521, term4250521.getClass(), "date", term4250522);
        setByteField(term4250526, term4250526.getClass(), "hour", (byte) 16);
        setByteField(term4250526, term4250526.getClass(), "minute", (byte) 32);
        setByteField(term4250526, term4250526.getClass(), "second", (byte) 2);
        setIntField(term4250526, term4250526.getClass(), "nano", 348590610);
        setField(term4250521, term4250521.getClass(), "time", term4250526);
        setField(term4250505, term4250505.getClass(), "registerTime", term4250521);
        setIntField(term4250532, term4250532.getClass(), "year", 2020);
        setShortField(term4250532, term4250532.getClass(), "month", (short) 6);
        setShortField(term4250532, term4250532.getClass(), "day", (short) 10);
        setField(term4250531, term4250531.getClass(), "date", term4250532);
        setByteField(term4250536, term4250536.getClass(), "hour", (byte) 14);
        setByteField(term4250536, term4250536.getClass(), "minute", (byte) 19);
        setByteField(term4250536, term4250536.getClass(), "second", (byte) 51);
        setIntField(term4250536, term4250536.getClass(), "nano", 577707435);
        setField(term4250531, term4250531.getClass(), "time", term4250536);
        setField(term4250505, term4250505.getClass(), "accessTime", term4250531);
        setField(term4250503, term4250503.getClass(), "card", term4250505);
        setField(term4250503, term4250503.getClass(), "userName", "OqrPEvuBtF");
        setIntField(term4250503, term4250503.getClass(), "isNetMember", -910937813);
        setIntField(term4250503, term4250503.getClass(), "iconId", -386184080);
        setIntField(term4250503, term4250503.getClass(), "plateId", -2016731223);
        setIntField(term4250503, term4250503.getClass(), "titleId", 1940492441);
        setIntField(term4250503, term4250503.getClass(), "partnerId", 305906143);
        setIntField(term4250503, term4250503.getClass(), "frameId", -1281488925);
        setIntField(term4250503, term4250503.getClass(), "selectMapId", 2015410711);
        setIntField(term4250503, term4250503.getClass(), "totalAwake", -919365772);
        setIntField(term4250503, term4250503.getClass(), "gradeRating", -1932122287);
        setIntField(term4250503, term4250503.getClass(), "musicRating", 1246272913);
        setIntField(term4250503, term4250503.getClass(), "playerRating", -1973748829);
        setIntField(term4250503, term4250503.getClass(), "highestRating", -101385314);
        setIntField(term4250503, term4250503.getClass(), "gradeRank", -1582759618);
        setIntField(term4250503, term4250503.getClass(), "classRank", -2135691845);
        setIntField(term4250503, term4250503.getClass(), "courseRank", -319994257);
        setField(term4250503, term4250503.getClass(), "charaSlot", term4250568);
        setField(term4250503, term4250503.getClass(), "charaLockSlot", term4250580);
        setLongField(term4250503, term4250503.getClass(), "contentBit", -261113926299691059L);
        setIntField(term4250503, term4250503.getClass(), "playCount", -847915332);
        setField(term4250503, term4250503.getClass(), "eventWatchedDate", "DKGIDnBlEv");
        setField(term4250503, term4250503.getClass(), "lastGameId", "DTpxaSlxPP");
        setField(term4250503, term4250503.getClass(), "lastRomVersion", "plCDTgfpQm");
        setField(term4250503, term4250503.getClass(), "lastDataVersion", "yPlTStlmTw");
        setField(term4250503, term4250503.getClass(), "lastLoginDate", "fGeObYmXYc");
        setField(term4250503, term4250503.getClass(), "lastPlayDate", "KiWmzelKXz");
        setIntField(term4250503, term4250503.getClass(), "lastPlayCredit", 716199448);
        setIntField(term4250503, term4250503.getClass(), "lastPlayMode", 1606445906);
        setIntField(term4250503, term4250503.getClass(), "lastPlaceId", -734645902);
        setField(term4250503, term4250503.getClass(), "lastPlaceName", "yYDBNVVSpL");
        setIntField(term4250503, term4250503.getClass(), "lastAllNetId", -2117327462);
        setIntField(term4250503, term4250503.getClass(), "lastRegionId", -920043239);
        setField(term4250503, term4250503.getClass(), "lastRegionName", "TtMYFnHyNr");
        setField(term4250503, term4250503.getClass(), "lastClientId", "zPenhAOVMc");
        setField(term4250503, term4250503.getClass(), "lastCountryCode", "WwZytLkljc");
        setIntField(term4250503, term4250503.getClass(), "lastSelectEMoney", 783823476);
        setIntField(term4250503, term4250503.getClass(), "lastSelectTicket", 93173423);
        setIntField(term4250503, term4250503.getClass(), "lastSelectCourse", 1847077964);
        setIntField(term4250503, term4250503.getClass(), "lastCountCourse", 1605430682);
        setField(term4250503, term4250503.getClass(), "firstGameId", "CKsfyEYKir");
        setField(term4250503, term4250503.getClass(), "firstRomVersion", "nhGhfnIhKT");
        setField(term4250503, term4250503.getClass(), "firstDataVersion", "VDyxEWbxxH");
        setField(term4250503, term4250503.getClass(), "firstPlayDate", "dTcmSunirb");
        setField(term4250503, term4250503.getClass(), "compatibleCmVersion", "uLHRiTJWqO");
        setField(term4250503, term4250503.getClass(), "dailyBonusDate", "MIYitOvnZU");
        setField(term4250503, term4250503.getClass(), "dailyCourseBonusDate", "BmUDXBSCwH");
        setField(term4250503, term4250503.getClass(), "lastPairLoginDate", "mRkCNrjJkv");
        setField(term4250503, term4250503.getClass(), "lastTrialPlayDate", "YwSpcOJryh");
        setIntField(term4250503, term4250503.getClass(), "playVsCount", -776109258);
        setIntField(term4250503, term4250503.getClass(), "playSyncCount", 1934332073);
        setIntField(term4250503, term4250503.getClass(), "winCount", -400525162);
        setIntField(term4250503, term4250503.getClass(), "helpCount", -335055964);
        setIntField(term4250503, term4250503.getClass(), "comboCount", 1147118756);
        setLongField(term4250503, term4250503.getClass(), "totalDeluxscore", -8358760447400457758L);
        setLongField(term4250503, term4250503.getClass(), "totalBasicDeluxscore", 5448896024273189407L);
        setLongField(term4250503, term4250503.getClass(), "totalAdvancedDeluxscore", 7160790863939955739L);
        setLongField(term4250503, term4250503.getClass(), "totalExpertDeluxscore", -4561374275354792142L);
        setLongField(term4250503, term4250503.getClass(), "totalMasterDeluxscore", -3480025073385530543L);
        setLongField(term4250503, term4250503.getClass(), "totalReMasterDeluxscore", 1641635529828725947L);
        setIntField(term4250503, term4250503.getClass(), "totalSync", -237929707);
        setIntField(term4250503, term4250503.getClass(), "totalBasicSync", 1304503949);
        setIntField(term4250503, term4250503.getClass(), "totalAdvancedSync", 38496711);
        setIntField(term4250503, term4250503.getClass(), "totalExpertSync", -563317755);
        setIntField(term4250503, term4250503.getClass(), "totalMasterSync", -701740335);
        setIntField(term4250503, term4250503.getClass(), "totalReMasterSync", -134722691);
        setLongField(term4250503, term4250503.getClass(), "totalAchievement", 7088980486437783022L);
        setLongField(term4250503, term4250503.getClass(), "totalBasicAchievement", 1587168846891153169L);
        setLongField(term4250503, term4250503.getClass(), "totalAdvancedAchievement", -2202334465903608682L);
        setLongField(term4250503, term4250503.getClass(), "totalExpertAchievement", -7084662478787972368L);
        setLongField(term4250503, term4250503.getClass(), "totalMasterAchievement", -1486915661625035892L);
        setLongField(term4250503, term4250503.getClass(), "totalReMasterAchievement", -6731475174932467847L);
        setLongField(term4250503, term4250503.getClass(), "playerOldRating", 3330436689651922517L);
        setLongField(term4250503, term4250503.getClass(), "playerNewRating", -2116456065299377028L);
        setIntField(term4250503, term4250503.getClass(), "banState", -1283702742);
        setLongField(term4250503, term4250503.getClass(), "dateTime", -7018758708279807590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectEMoney", argTypes, term4250503, args);
    }

};


