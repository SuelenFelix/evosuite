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

public class UserDetail_getEventWatchedDate_120400748322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241976;

    public UserDetail_getEventWatchedDate_120400748322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4241980 = new Long(2846766118789620056L);
        Integer term4242043 = new Integer(1638500325);
        Integer term4242045 = new Integer(1177380645);
        Integer term4242047 = new Integer(-394947882);
        Integer term4242049 = new Integer(84960163);
        Integer term4242051 = new Integer(-1576427116);
        Integer term4242053 = new Integer(836315769);
        ArrayList term4242041 = new ArrayList();
        ((ArrayList) term4242041).add(term4242043);
        ((ArrayList) term4242041).add(term4242045);
        ((ArrayList) term4242041).add(term4242047);
        ((ArrayList) term4242041).add(term4242049);
        ((ArrayList) term4242041).add(term4242051);
        ((ArrayList) term4242041).add(term4242053);
        Integer term4242059 = new Integer(-848316647);
        Integer term4242061 = new Integer(-1208380119);
        Integer term4242063 = new Integer(-864238024);
        Integer term4242065 = new Integer(-1314380245);
        Integer term4242067 = new Integer(1515851499);
        Integer term4242069 = new Integer(1012518296);
        Integer term4242071 = new Integer(1105035324);
        Integer term4242073 = new Integer(-1584523024);
        ArrayList term4242057 = new ArrayList();
        ((ArrayList) term4242057).add(term4242059);
        ((ArrayList) term4242057).add(term4242061);
        ((ArrayList) term4242057).add(term4242063);
        ((ArrayList) term4242057).add(term4242065);
        ((ArrayList) term4242057).add(term4242067);
        ((ArrayList) term4242057).add(term4242069);
        ((ArrayList) term4242057).add(term4242071);
        ((ArrayList) term4242057).add(term4242073);
        term4241976 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4241978 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4241994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4241995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4241999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4242004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4242005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4242009 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4241976, term4241976.getClass(), "id", 7643953238819124357L);
        setLongField(term4241978, term4241978.getClass(), "id", -5285627169369631055L);
        setField(term4241978, term4241978.getClass(), "extId", term4241980);
        setField(term4241978, term4241978.getClass(), "luid", "WPMZgGVXgt");
        setIntField(term4241995, term4241995.getClass(), "year", 2028);
        setShortField(term4241995, term4241995.getClass(), "month", (short) 12);
        setShortField(term4241995, term4241995.getClass(), "day", (short) 20);
        setField(term4241994, term4241994.getClass(), "date", term4241995);
        setByteField(term4241999, term4241999.getClass(), "hour", (byte) 16);
        setByteField(term4241999, term4241999.getClass(), "minute", (byte) 29);
        setByteField(term4241999, term4241999.getClass(), "second", (byte) 20);
        setIntField(term4241999, term4241999.getClass(), "nano", 591418148);
        setField(term4241994, term4241994.getClass(), "time", term4241999);
        setField(term4241978, term4241978.getClass(), "registerTime", term4241994);
        setIntField(term4242005, term4242005.getClass(), "year", 2010);
        setShortField(term4242005, term4242005.getClass(), "month", (short) 4);
        setShortField(term4242005, term4242005.getClass(), "day", (short) 25);
        setField(term4242004, term4242004.getClass(), "date", term4242005);
        setByteField(term4242009, term4242009.getClass(), "hour", (byte) 14);
        setByteField(term4242009, term4242009.getClass(), "minute", (byte) 40);
        setByteField(term4242009, term4242009.getClass(), "second", (byte) 54);
        setIntField(term4242009, term4242009.getClass(), "nano", 750280937);
        setField(term4242004, term4242004.getClass(), "time", term4242009);
        setField(term4241978, term4241978.getClass(), "accessTime", term4242004);
        setField(term4241976, term4241976.getClass(), "card", term4241978);
        setField(term4241976, term4241976.getClass(), "userName", "VVlIQxtXAf");
        setIntField(term4241976, term4241976.getClass(), "isNetMember", -1452974322);
        setIntField(term4241976, term4241976.getClass(), "iconId", -1478388374);
        setIntField(term4241976, term4241976.getClass(), "plateId", -451813784);
        setIntField(term4241976, term4241976.getClass(), "titleId", 9102467);
        setIntField(term4241976, term4241976.getClass(), "partnerId", -1297394100);
        setIntField(term4241976, term4241976.getClass(), "frameId", -1895532083);
        setIntField(term4241976, term4241976.getClass(), "selectMapId", 1274925209);
        setIntField(term4241976, term4241976.getClass(), "totalAwake", 1618429825);
        setIntField(term4241976, term4241976.getClass(), "gradeRating", 1013581826);
        setIntField(term4241976, term4241976.getClass(), "musicRating", 1626605795);
        setIntField(term4241976, term4241976.getClass(), "playerRating", -1354826103);
        setIntField(term4241976, term4241976.getClass(), "highestRating", 1132652198);
        setIntField(term4241976, term4241976.getClass(), "gradeRank", 1832225395);
        setIntField(term4241976, term4241976.getClass(), "classRank", -1532640555);
        setIntField(term4241976, term4241976.getClass(), "courseRank", -2082818848);
        setField(term4241976, term4241976.getClass(), "charaSlot", term4242041);
        setField(term4241976, term4241976.getClass(), "charaLockSlot", term4242057);
        setLongField(term4241976, term4241976.getClass(), "contentBit", -893948945435312883L);
        setIntField(term4241976, term4241976.getClass(), "playCount", -162763706);
        setField(term4241976, term4241976.getClass(), "eventWatchedDate", "lOiTrtPgBR");
        setField(term4241976, term4241976.getClass(), "lastGameId", "pzrdTCNiZU");
        setField(term4241976, term4241976.getClass(), "lastRomVersion", "DFSuyfoYnX");
        setField(term4241976, term4241976.getClass(), "lastDataVersion", "KhfZmSyTEp");
        setField(term4241976, term4241976.getClass(), "lastLoginDate", "NwQbwzsNQG");
        setField(term4241976, term4241976.getClass(), "lastPlayDate", "SwXPOpuvve");
        setIntField(term4241976, term4241976.getClass(), "lastPlayCredit", -998351516);
        setIntField(term4241976, term4241976.getClass(), "lastPlayMode", 2003586280);
        setIntField(term4241976, term4241976.getClass(), "lastPlaceId", 175409248);
        setField(term4241976, term4241976.getClass(), "lastPlaceName", "YhIOtPNsIh");
        setIntField(term4241976, term4241976.getClass(), "lastAllNetId", 676449123);
        setIntField(term4241976, term4241976.getClass(), "lastRegionId", -213280289);
        setField(term4241976, term4241976.getClass(), "lastRegionName", "UzrMzkyZgK");
        setField(term4241976, term4241976.getClass(), "lastClientId", "HSdCJqxSqO");
        setField(term4241976, term4241976.getClass(), "lastCountryCode", "cuLtmLUosy");
        setIntField(term4241976, term4241976.getClass(), "lastSelectEMoney", 1325260782);
        setIntField(term4241976, term4241976.getClass(), "lastSelectTicket", 506959177);
        setIntField(term4241976, term4241976.getClass(), "lastSelectCourse", -1134291649);
        setIntField(term4241976, term4241976.getClass(), "lastCountCourse", -338306509);
        setField(term4241976, term4241976.getClass(), "firstGameId", "OfZNzrumbI");
        setField(term4241976, term4241976.getClass(), "firstRomVersion", "qQQksZIbYe");
        setField(term4241976, term4241976.getClass(), "firstDataVersion", "uCSOtjaXNj");
        setField(term4241976, term4241976.getClass(), "firstPlayDate", "NwrPrUktOh");
        setField(term4241976, term4241976.getClass(), "compatibleCmVersion", "GPbLMmNLAo");
        setField(term4241976, term4241976.getClass(), "dailyBonusDate", "PxWAnJVoqn");
        setField(term4241976, term4241976.getClass(), "dailyCourseBonusDate", "WhKXkfrwcM");
        setField(term4241976, term4241976.getClass(), "lastPairLoginDate", "WZUuPAANnb");
        setField(term4241976, term4241976.getClass(), "lastTrialPlayDate", "OLeeagPTrn");
        setIntField(term4241976, term4241976.getClass(), "playVsCount", 651078143);
        setIntField(term4241976, term4241976.getClass(), "playSyncCount", -502673153);
        setIntField(term4241976, term4241976.getClass(), "winCount", 504009778);
        setIntField(term4241976, term4241976.getClass(), "helpCount", -631759298);
        setIntField(term4241976, term4241976.getClass(), "comboCount", -2075977879);
        setLongField(term4241976, term4241976.getClass(), "totalDeluxscore", -3635135241247049595L);
        setLongField(term4241976, term4241976.getClass(), "totalBasicDeluxscore", -4190400236883271751L);
        setLongField(term4241976, term4241976.getClass(), "totalAdvancedDeluxscore", -3703897104578437001L);
        setLongField(term4241976, term4241976.getClass(), "totalExpertDeluxscore", 5581004894199087023L);
        setLongField(term4241976, term4241976.getClass(), "totalMasterDeluxscore", -6840253172734598387L);
        setLongField(term4241976, term4241976.getClass(), "totalReMasterDeluxscore", -2457322226278869101L);
        setIntField(term4241976, term4241976.getClass(), "totalSync", -1871687190);
        setIntField(term4241976, term4241976.getClass(), "totalBasicSync", -595836995);
        setIntField(term4241976, term4241976.getClass(), "totalAdvancedSync", -1712574483);
        setIntField(term4241976, term4241976.getClass(), "totalExpertSync", 1560884964);
        setIntField(term4241976, term4241976.getClass(), "totalMasterSync", 1469428125);
        setIntField(term4241976, term4241976.getClass(), "totalReMasterSync", -961290786);
        setLongField(term4241976, term4241976.getClass(), "totalAchievement", 5362912730247379691L);
        setLongField(term4241976, term4241976.getClass(), "totalBasicAchievement", 3438050580852312398L);
        setLongField(term4241976, term4241976.getClass(), "totalAdvancedAchievement", -794131496191793103L);
        setLongField(term4241976, term4241976.getClass(), "totalExpertAchievement", 7681316891318429201L);
        setLongField(term4241976, term4241976.getClass(), "totalMasterAchievement", -6949775354007330272L);
        setLongField(term4241976, term4241976.getClass(), "totalReMasterAchievement", -8860970965395000679L);
        setLongField(term4241976, term4241976.getClass(), "playerOldRating", 6549196994567601923L);
        setLongField(term4241976, term4241976.getClass(), "playerNewRating", 8957880868475399092L);
        setIntField(term4241976, term4241976.getClass(), "banState", 1351109635);
        setLongField(term4241976, term4241976.getClass(), "dateTime", -6371932437753678260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term4241976, args);
    }

};


