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

public class UserLoginBonus_setPoint_130633128910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50241;
     Object term50602;

    public UserLoginBonus_setPoint_130633128910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50247 = new Long(7862575738391801707L);
        Integer term50310 = new Integer(401203924);
        Integer term50312 = new Integer(-1212399479);
        Integer term50314 = new Integer(2107679041);
        Integer term50316 = new Integer(2040965507);
        Integer term50318 = new Integer(-1281083262);
        ArrayList term50308 = new ArrayList();
        ((ArrayList) term50308).add(term50310);
        ((ArrayList) term50308).add(term50312);
        ((ArrayList) term50308).add(term50314);
        ((ArrayList) term50308).add(term50316);
        ((ArrayList) term50308).add(term50318);
        Integer term50324 = new Integer(1059930704);
        Integer term50326 = new Integer(-1967153290);
        Integer term50328 = new Integer(-1397251956);
        ArrayList term50322 = new ArrayList();
        ((ArrayList) term50322).add(term50324);
        ((ArrayList) term50322).add(term50326);
        ((ArrayList) term50322).add(term50328);
        term50241 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term50243 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term50245 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50276 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50241, term50241.getClass(), "id", 7651884502076816477L);
        setLongField(term50243, term50243.getClass(), "id", -45437711112045954L);
        setLongField(term50245, term50245.getClass(), "id", -2665418140152906040L);
        setField(term50245, term50245.getClass(), "extId", term50247);
        setField(term50245, term50245.getClass(), "luid", "oOrXvGaFwa");
        setIntField(term50262, term50262.getClass(), "year", 2020);
        setShortField(term50262, term50262.getClass(), "month", (short) 5);
        setShortField(term50262, term50262.getClass(), "day", (short) 12);
        setField(term50261, term50261.getClass(), "date", term50262);
        setByteField(term50266, term50266.getClass(), "hour", (byte) 22);
        setByteField(term50266, term50266.getClass(), "minute", (byte) 7);
        setByteField(term50266, term50266.getClass(), "second", (byte) 49);
        setIntField(term50266, term50266.getClass(), "nano", 677355362);
        setField(term50261, term50261.getClass(), "time", term50266);
        setField(term50245, term50245.getClass(), "registerTime", term50261);
        setIntField(term50272, term50272.getClass(), "year", 2010);
        setShortField(term50272, term50272.getClass(), "month", (short) 11);
        setShortField(term50272, term50272.getClass(), "day", (short) 1);
        setField(term50271, term50271.getClass(), "date", term50272);
        setByteField(term50276, term50276.getClass(), "hour", (byte) 5);
        setByteField(term50276, term50276.getClass(), "minute", (byte) 32);
        setByteField(term50276, term50276.getClass(), "second", (byte) 8);
        setIntField(term50276, term50276.getClass(), "nano", 918832231);
        setField(term50271, term50271.getClass(), "time", term50276);
        setField(term50245, term50245.getClass(), "accessTime", term50271);
        setField(term50243, term50243.getClass(), "card", term50245);
        setField(term50243, term50243.getClass(), "userName", "KJSTLGsSvO");
        setIntField(term50243, term50243.getClass(), "isNetMember", -1255440898);
        setIntField(term50243, term50243.getClass(), "iconId", -1185096329);
        setIntField(term50243, term50243.getClass(), "plateId", -2051822073);
        setIntField(term50243, term50243.getClass(), "titleId", -838891056);
        setIntField(term50243, term50243.getClass(), "partnerId", -2133180225);
        setIntField(term50243, term50243.getClass(), "frameId", -1486915040);
        setIntField(term50243, term50243.getClass(), "selectMapId", -1960290626);
        setIntField(term50243, term50243.getClass(), "totalAwake", -1941903722);
        setIntField(term50243, term50243.getClass(), "gradeRating", 491009356);
        setIntField(term50243, term50243.getClass(), "musicRating", 1180952236);
        setIntField(term50243, term50243.getClass(), "playerRating", 1549827025);
        setIntField(term50243, term50243.getClass(), "highestRating", 523998499);
        setIntField(term50243, term50243.getClass(), "gradeRank", -808741755);
        setIntField(term50243, term50243.getClass(), "classRank", -1088446142);
        setIntField(term50243, term50243.getClass(), "courseRank", 342337914);
        setField(term50243, term50243.getClass(), "charaSlot", term50308);
        setField(term50243, term50243.getClass(), "charaLockSlot", term50322);
        setLongField(term50243, term50243.getClass(), "contentBit", 590621623960257295L);
        setIntField(term50243, term50243.getClass(), "playCount", 920216419);
        setField(term50243, term50243.getClass(), "eventWatchedDate", "kSkiIpaepq");
        setField(term50243, term50243.getClass(), "lastGameId", "FzJhDecyvI");
        setField(term50243, term50243.getClass(), "lastRomVersion", "zOxseYMSdY");
        setField(term50243, term50243.getClass(), "lastDataVersion", "jEKlkqpHMQ");
        setField(term50243, term50243.getClass(), "lastLoginDate", "QpEVWispEh");
        setField(term50243, term50243.getClass(), "lastPlayDate", "STofGrqXqL");
        setIntField(term50243, term50243.getClass(), "lastPlayCredit", -1576226952);
        setIntField(term50243, term50243.getClass(), "lastPlayMode", 1555746325);
        setIntField(term50243, term50243.getClass(), "lastPlaceId", -1910031809);
        setField(term50243, term50243.getClass(), "lastPlaceName", "IoRhBfdSuN");
        setIntField(term50243, term50243.getClass(), "lastAllNetId", 1270786654);
        setIntField(term50243, term50243.getClass(), "lastRegionId", -1971037654);
        setField(term50243, term50243.getClass(), "lastRegionName", "JGdxVjQzts");
        setField(term50243, term50243.getClass(), "lastClientId", "jEdjRikQtN");
        setField(term50243, term50243.getClass(), "lastCountryCode", "fSNUaokVWs");
        setIntField(term50243, term50243.getClass(), "lastSelectEMoney", -1001929512);
        setIntField(term50243, term50243.getClass(), "lastSelectTicket", 1783875922);
        setIntField(term50243, term50243.getClass(), "lastSelectCourse", -1504060723);
        setIntField(term50243, term50243.getClass(), "lastCountCourse", 1458290326);
        setField(term50243, term50243.getClass(), "firstGameId", "dTxnMmHoVm");
        setField(term50243, term50243.getClass(), "firstRomVersion", "iswxaQUQgT");
        setField(term50243, term50243.getClass(), "firstDataVersion", "MxUSQqhNse");
        setField(term50243, term50243.getClass(), "firstPlayDate", "skwxdosvQV");
        setField(term50243, term50243.getClass(), "compatibleCmVersion", "DBYTggnCkD");
        setField(term50243, term50243.getClass(), "dailyBonusDate", "RyXrJxJQiY");
        setField(term50243, term50243.getClass(), "dailyCourseBonusDate", "JfnQeTdzWs");
        setField(term50243, term50243.getClass(), "lastPairLoginDate", "HGhGqMiMOk");
        setField(term50243, term50243.getClass(), "lastTrialPlayDate", "VtTzFdKpZI");
        setIntField(term50243, term50243.getClass(), "playVsCount", 1025606001);
        setIntField(term50243, term50243.getClass(), "playSyncCount", -1227561158);
        setIntField(term50243, term50243.getClass(), "winCount", -1853440273);
        setIntField(term50243, term50243.getClass(), "helpCount", 1884281846);
        setIntField(term50243, term50243.getClass(), "comboCount", -1779176468);
        setLongField(term50243, term50243.getClass(), "totalDeluxscore", -3940823299046887533L);
        setLongField(term50243, term50243.getClass(), "totalBasicDeluxscore", 1916346681449508616L);
        setLongField(term50243, term50243.getClass(), "totalAdvancedDeluxscore", 8115348150286567116L);
        setLongField(term50243, term50243.getClass(), "totalExpertDeluxscore", 6549453781602844135L);
        setLongField(term50243, term50243.getClass(), "totalMasterDeluxscore", -7858384696957926965L);
        setLongField(term50243, term50243.getClass(), "totalReMasterDeluxscore", -7639406314873940496L);
        setIntField(term50243, term50243.getClass(), "totalSync", -790563662);
        setIntField(term50243, term50243.getClass(), "totalBasicSync", 692290973);
        setIntField(term50243, term50243.getClass(), "totalAdvancedSync", 344667712);
        setIntField(term50243, term50243.getClass(), "totalExpertSync", 921447346);
        setIntField(term50243, term50243.getClass(), "totalMasterSync", 1514227664);
        setIntField(term50243, term50243.getClass(), "totalReMasterSync", 2000874140);
        setLongField(term50243, term50243.getClass(), "totalAchievement", -5550345592284314693L);
        setLongField(term50243, term50243.getClass(), "totalBasicAchievement", -5478680438603251116L);
        setLongField(term50243, term50243.getClass(), "totalAdvancedAchievement", 3362279702053141081L);
        setLongField(term50243, term50243.getClass(), "totalExpertAchievement", -58248142535266417L);
        setLongField(term50243, term50243.getClass(), "totalMasterAchievement", 370832762515262203L);
        setLongField(term50243, term50243.getClass(), "totalReMasterAchievement", 6931806194311088657L);
        setLongField(term50243, term50243.getClass(), "playerOldRating", -6104317529539097644L);
        setLongField(term50243, term50243.getClass(), "playerNewRating", 4456551328322151200L);
        setIntField(term50243, term50243.getClass(), "banState", -701728269);
        setLongField(term50243, term50243.getClass(), "dateTime", 6700719103019158902L);
        setField(term50241, term50241.getClass(), "user", term50243);
        setIntField(term50241, term50241.getClass(), "bonusId", -1094813190);
        setIntField(term50241, term50241.getClass(), "point", -355401879);
        setBooleanField(term50241, term50241.getClass(), "isCurrent", false);
        setBooleanField(term50241, term50241.getClass(), "isComplete", false);
        term50602 = new Integer(-1878519758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50602;
        callMethod(klass, "setPoint", argTypes, term50241, args);
    }

};


