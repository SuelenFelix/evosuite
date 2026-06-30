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

public class UserDetail_setLastTrialPlayDate_690771047126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301459;

    public UserDetail_setLastTrialPlayDate_690771047126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4301463 = new Long(-4657983727699507915L);
        Integer term4301526 = new Integer(965262203);
        Integer term4301528 = new Integer(1569464081);
        Integer term4301530 = new Integer(1899979707);
        Integer term4301532 = new Integer(-379153640);
        Integer term4301534 = new Integer(2059143976);
        Integer term4301536 = new Integer(-855871020);
        ArrayList term4301524 = new ArrayList();
        ((ArrayList) term4301524).add(term4301526);
        ((ArrayList) term4301524).add(term4301528);
        ((ArrayList) term4301524).add(term4301530);
        ((ArrayList) term4301524).add(term4301532);
        ((ArrayList) term4301524).add(term4301534);
        ((ArrayList) term4301524).add(term4301536);
        Integer term4301542 = new Integer(294740259);
        Integer term4301544 = new Integer(-843479862);
        Integer term4301546 = new Integer(-1178581916);
        Integer term4301548 = new Integer(-1533008285);
        Integer term4301550 = new Integer(-317721741);
        Integer term4301552 = new Integer(603089761);
        ArrayList term4301540 = new ArrayList();
        ((ArrayList) term4301540).add(term4301542);
        ((ArrayList) term4301540).add(term4301544);
        ((ArrayList) term4301540).add(term4301546);
        ((ArrayList) term4301540).add(term4301548);
        ((ArrayList) term4301540).add(term4301550);
        ((ArrayList) term4301540).add(term4301552);
        term4301459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4301461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4301477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4301478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4301482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4301487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4301488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4301492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4301459, term4301459.getClass(), "id", 8700934381045250042L);
        setLongField(term4301461, term4301461.getClass(), "id", -5369645950304374550L);
        setField(term4301461, term4301461.getClass(), "extId", term4301463);
        setField(term4301461, term4301461.getClass(), "luid", "MijRLSLMgF");
        setIntField(term4301478, term4301478.getClass(), "year", 2014);
        setShortField(term4301478, term4301478.getClass(), "month", (short) 5);
        setShortField(term4301478, term4301478.getClass(), "day", (short) 31);
        setField(term4301477, term4301477.getClass(), "date", term4301478);
        setByteField(term4301482, term4301482.getClass(), "hour", (byte) 12);
        setByteField(term4301482, term4301482.getClass(), "minute", (byte) 2);
        setByteField(term4301482, term4301482.getClass(), "second", (byte) 45);
        setIntField(term4301482, term4301482.getClass(), "nano", 917947270);
        setField(term4301477, term4301477.getClass(), "time", term4301482);
        setField(term4301461, term4301461.getClass(), "registerTime", term4301477);
        setIntField(term4301488, term4301488.getClass(), "year", 2012);
        setShortField(term4301488, term4301488.getClass(), "month", (short) 7);
        setShortField(term4301488, term4301488.getClass(), "day", (short) 26);
        setField(term4301487, term4301487.getClass(), "date", term4301488);
        setByteField(term4301492, term4301492.getClass(), "hour", (byte) 18);
        setByteField(term4301492, term4301492.getClass(), "minute", (byte) 35);
        setByteField(term4301492, term4301492.getClass(), "second", (byte) 36);
        setIntField(term4301492, term4301492.getClass(), "nano", 621722564);
        setField(term4301487, term4301487.getClass(), "time", term4301492);
        setField(term4301461, term4301461.getClass(), "accessTime", term4301487);
        setField(term4301459, term4301459.getClass(), "card", term4301461);
        setField(term4301459, term4301459.getClass(), "userName", "yFBfgosAnZ");
        setIntField(term4301459, term4301459.getClass(), "isNetMember", 1166548559);
        setIntField(term4301459, term4301459.getClass(), "iconId", -1872063980);
        setIntField(term4301459, term4301459.getClass(), "plateId", -1140254092);
        setIntField(term4301459, term4301459.getClass(), "titleId", 802204311);
        setIntField(term4301459, term4301459.getClass(), "partnerId", -1288272400);
        setIntField(term4301459, term4301459.getClass(), "frameId", 1193220366);
        setIntField(term4301459, term4301459.getClass(), "selectMapId", 1864661102);
        setIntField(term4301459, term4301459.getClass(), "totalAwake", -1641612244);
        setIntField(term4301459, term4301459.getClass(), "gradeRating", 1516541025);
        setIntField(term4301459, term4301459.getClass(), "musicRating", -2031070684);
        setIntField(term4301459, term4301459.getClass(), "playerRating", 1245553396);
        setIntField(term4301459, term4301459.getClass(), "highestRating", 426069486);
        setIntField(term4301459, term4301459.getClass(), "gradeRank", 322832902);
        setIntField(term4301459, term4301459.getClass(), "classRank", -1742143824);
        setIntField(term4301459, term4301459.getClass(), "courseRank", -445259737);
        setField(term4301459, term4301459.getClass(), "charaSlot", term4301524);
        setField(term4301459, term4301459.getClass(), "charaLockSlot", term4301540);
        setLongField(term4301459, term4301459.getClass(), "contentBit", -1183952544371707121L);
        setIntField(term4301459, term4301459.getClass(), "playCount", 1774710949);
        setField(term4301459, term4301459.getClass(), "eventWatchedDate", "zxsTosayqk");
        setField(term4301459, term4301459.getClass(), "lastGameId", "yYjnUEGjlB");
        setField(term4301459, term4301459.getClass(), "lastRomVersion", "BgmlAloxUH");
        setField(term4301459, term4301459.getClass(), "lastDataVersion", "fKnbWKlXQh");
        setField(term4301459, term4301459.getClass(), "lastLoginDate", "IvlwRKankU");
        setField(term4301459, term4301459.getClass(), "lastPlayDate", "ovOQSvKPqw");
        setIntField(term4301459, term4301459.getClass(), "lastPlayCredit", -2122492420);
        setIntField(term4301459, term4301459.getClass(), "lastPlayMode", 1441759558);
        setIntField(term4301459, term4301459.getClass(), "lastPlaceId", 411005297);
        setField(term4301459, term4301459.getClass(), "lastPlaceName", "dYuVvDOdrd");
        setIntField(term4301459, term4301459.getClass(), "lastAllNetId", -1832608645);
        setIntField(term4301459, term4301459.getClass(), "lastRegionId", -1826816365);
        setField(term4301459, term4301459.getClass(), "lastRegionName", "ybntnDaJPL");
        setField(term4301459, term4301459.getClass(), "lastClientId", "jYHXPsIfqq");
        setField(term4301459, term4301459.getClass(), "lastCountryCode", "lqPaRmbNIu");
        setIntField(term4301459, term4301459.getClass(), "lastSelectEMoney", 1721208601);
        setIntField(term4301459, term4301459.getClass(), "lastSelectTicket", -1695157474);
        setIntField(term4301459, term4301459.getClass(), "lastSelectCourse", -218490109);
        setIntField(term4301459, term4301459.getClass(), "lastCountCourse", -1613587206);
        setField(term4301459, term4301459.getClass(), "firstGameId", "IoZBjSIffb");
        setField(term4301459, term4301459.getClass(), "firstRomVersion", "NPclmTVJEc");
        setField(term4301459, term4301459.getClass(), "firstDataVersion", "KqpJndvCSA");
        setField(term4301459, term4301459.getClass(), "firstPlayDate", "RewqAKnOkv");
        setField(term4301459, term4301459.getClass(), "compatibleCmVersion", "bMJMHhdQLS");
        setField(term4301459, term4301459.getClass(), "dailyBonusDate", "LaxaTShRBN");
        setField(term4301459, term4301459.getClass(), "dailyCourseBonusDate", "aCgySHMzlU");
        setField(term4301459, term4301459.getClass(), "lastPairLoginDate", "IfzNKeMIwz");
        setField(term4301459, term4301459.getClass(), "lastTrialPlayDate", "KjpmuQNOkH");
        setIntField(term4301459, term4301459.getClass(), "playVsCount", 1125323677);
        setIntField(term4301459, term4301459.getClass(), "playSyncCount", -1356553935);
        setIntField(term4301459, term4301459.getClass(), "winCount", 1742867836);
        setIntField(term4301459, term4301459.getClass(), "helpCount", 311517240);
        setIntField(term4301459, term4301459.getClass(), "comboCount", -165991826);
        setLongField(term4301459, term4301459.getClass(), "totalDeluxscore", 2304150604414553560L);
        setLongField(term4301459, term4301459.getClass(), "totalBasicDeluxscore", 8143581236396352312L);
        setLongField(term4301459, term4301459.getClass(), "totalAdvancedDeluxscore", 5374779861622525011L);
        setLongField(term4301459, term4301459.getClass(), "totalExpertDeluxscore", -1494791309805078688L);
        setLongField(term4301459, term4301459.getClass(), "totalMasterDeluxscore", -2065334219671575393L);
        setLongField(term4301459, term4301459.getClass(), "totalReMasterDeluxscore", 5981553976991456915L);
        setIntField(term4301459, term4301459.getClass(), "totalSync", 1831572853);
        setIntField(term4301459, term4301459.getClass(), "totalBasicSync", 1424118613);
        setIntField(term4301459, term4301459.getClass(), "totalAdvancedSync", 129846115);
        setIntField(term4301459, term4301459.getClass(), "totalExpertSync", -237743249);
        setIntField(term4301459, term4301459.getClass(), "totalMasterSync", -1980607791);
        setIntField(term4301459, term4301459.getClass(), "totalReMasterSync", -1959799564);
        setLongField(term4301459, term4301459.getClass(), "totalAchievement", 188659723058366950L);
        setLongField(term4301459, term4301459.getClass(), "totalBasicAchievement", 6372417766627459997L);
        setLongField(term4301459, term4301459.getClass(), "totalAdvancedAchievement", 3077987066609289344L);
        setLongField(term4301459, term4301459.getClass(), "totalExpertAchievement", 1858905927950016240L);
        setLongField(term4301459, term4301459.getClass(), "totalMasterAchievement", 422215730523325557L);
        setLongField(term4301459, term4301459.getClass(), "totalReMasterAchievement", 528366073741279946L);
        setLongField(term4301459, term4301459.getClass(), "playerOldRating", 4737027601788951615L);
        setLongField(term4301459, term4301459.getClass(), "playerNewRating", 7206929432867358103L);
        setIntField(term4301459, term4301459.getClass(), "banState", -1349016821);
        setLongField(term4301459, term4301459.getClass(), "dateTime", -4687670938311445549L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HOtRlAiRts";
        callMethod(klass, "setLastTrialPlayDate", argTypes, term4301459, args);
    }

};


