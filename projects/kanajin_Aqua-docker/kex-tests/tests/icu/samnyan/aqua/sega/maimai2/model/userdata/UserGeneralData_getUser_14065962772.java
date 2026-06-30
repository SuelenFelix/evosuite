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

public class UserGeneralData_getUser_14065962772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133345;

    public UserGeneralData_getUser_14065962772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133351 = new Long(-7698746988132548371L);
        ArrayList term133412 = new ArrayList();
        Integer term133418 = new Integer(817836900);
        Integer term133420 = new Integer(1691654567);
        Integer term133422 = new Integer(-1604942135);
        Integer term133424 = new Integer(2000275611);
        Integer term133426 = new Integer(2060369122);
        Integer term133428 = new Integer(-1275204506);
        Integer term133430 = new Integer(507439888);
        ArrayList term133416 = new ArrayList();
        ((ArrayList) term133416).add(term133418);
        ((ArrayList) term133416).add(term133420);
        ((ArrayList) term133416).add(term133422);
        ((ArrayList) term133416).add(term133424);
        ((ArrayList) term133416).add(term133426);
        ((ArrayList) term133416).add(term133428);
        ((ArrayList) term133416).add(term133430);
        term133345 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term133347 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term133349 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133380 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133345, term133345.getClass(), "id", 6335824346315596595L);
        setLongField(term133347, term133347.getClass(), "id", -109641936297719200L);
        setLongField(term133349, term133349.getClass(), "id", 7805361335309542211L);
        setField(term133349, term133349.getClass(), "extId", term133351);
        setField(term133349, term133349.getClass(), "luid", "EsauoauZcZ");
        setIntField(term133366, term133366.getClass(), "year", 2027);
        setShortField(term133366, term133366.getClass(), "month", (short) 3);
        setShortField(term133366, term133366.getClass(), "day", (short) 20);
        setField(term133365, term133365.getClass(), "date", term133366);
        setByteField(term133370, term133370.getClass(), "hour", (byte) 9);
        setByteField(term133370, term133370.getClass(), "minute", (byte) 34);
        setByteField(term133370, term133370.getClass(), "second", (byte) 31);
        setIntField(term133370, term133370.getClass(), "nano", 746182707);
        setField(term133365, term133365.getClass(), "time", term133370);
        setField(term133349, term133349.getClass(), "registerTime", term133365);
        setIntField(term133376, term133376.getClass(), "year", 2018);
        setShortField(term133376, term133376.getClass(), "month", (short) 9);
        setShortField(term133376, term133376.getClass(), "day", (short) 11);
        setField(term133375, term133375.getClass(), "date", term133376);
        setByteField(term133380, term133380.getClass(), "hour", (byte) 18);
        setByteField(term133380, term133380.getClass(), "minute", (byte) 44);
        setByteField(term133380, term133380.getClass(), "second", (byte) 42);
        setIntField(term133380, term133380.getClass(), "nano", 303163100);
        setField(term133375, term133375.getClass(), "time", term133380);
        setField(term133349, term133349.getClass(), "accessTime", term133375);
        setField(term133347, term133347.getClass(), "card", term133349);
        setField(term133347, term133347.getClass(), "userName", "qiDNqUNRHY");
        setIntField(term133347, term133347.getClass(), "isNetMember", -1601686432);
        setIntField(term133347, term133347.getClass(), "iconId", 1005405366);
        setIntField(term133347, term133347.getClass(), "plateId", 1682083643);
        setIntField(term133347, term133347.getClass(), "titleId", -913374434);
        setIntField(term133347, term133347.getClass(), "partnerId", -852430845);
        setIntField(term133347, term133347.getClass(), "frameId", 64842894);
        setIntField(term133347, term133347.getClass(), "selectMapId", -1932624760);
        setIntField(term133347, term133347.getClass(), "totalAwake", 527367438);
        setIntField(term133347, term133347.getClass(), "gradeRating", -1862333439);
        setIntField(term133347, term133347.getClass(), "musicRating", -798735804);
        setIntField(term133347, term133347.getClass(), "playerRating", 1532015613);
        setIntField(term133347, term133347.getClass(), "highestRating", -1143681603);
        setIntField(term133347, term133347.getClass(), "gradeRank", 671881052);
        setIntField(term133347, term133347.getClass(), "classRank", 1496400210);
        setIntField(term133347, term133347.getClass(), "courseRank", -1434027177);
        setField(term133347, term133347.getClass(), "charaSlot", term133412);
        setField(term133347, term133347.getClass(), "charaLockSlot", term133416);
        setLongField(term133347, term133347.getClass(), "contentBit", -3947409235127058867L);
        setIntField(term133347, term133347.getClass(), "playCount", 1385323795);
        setField(term133347, term133347.getClass(), "eventWatchedDate", "WjRIILfuQl");
        setField(term133347, term133347.getClass(), "lastGameId", "FqgiIhfmCu");
        setField(term133347, term133347.getClass(), "lastRomVersion", "oENXVcVJUC");
        setField(term133347, term133347.getClass(), "lastDataVersion", "ytIVCXPyNV");
        setField(term133347, term133347.getClass(), "lastLoginDate", "LmUSMvJtpQ");
        setField(term133347, term133347.getClass(), "lastPlayDate", "eoDQvGDMGx");
        setIntField(term133347, term133347.getClass(), "lastPlayCredit", -66414124);
        setIntField(term133347, term133347.getClass(), "lastPlayMode", 497879148);
        setIntField(term133347, term133347.getClass(), "lastPlaceId", -237343326);
        setField(term133347, term133347.getClass(), "lastPlaceName", "OtuSXazGGk");
        setIntField(term133347, term133347.getClass(), "lastAllNetId", -392082342);
        setIntField(term133347, term133347.getClass(), "lastRegionId", -854451115);
        setField(term133347, term133347.getClass(), "lastRegionName", "tBhjvegtdH");
        setField(term133347, term133347.getClass(), "lastClientId", "OpHteeKkID");
        setField(term133347, term133347.getClass(), "lastCountryCode", "EPqrGqPuGp");
        setIntField(term133347, term133347.getClass(), "lastSelectEMoney", 1986079462);
        setIntField(term133347, term133347.getClass(), "lastSelectTicket", -1259832629);
        setIntField(term133347, term133347.getClass(), "lastSelectCourse", -614088635);
        setIntField(term133347, term133347.getClass(), "lastCountCourse", 2118042800);
        setField(term133347, term133347.getClass(), "firstGameId", "fevqUofURr");
        setField(term133347, term133347.getClass(), "firstRomVersion", "jvawePHFow");
        setField(term133347, term133347.getClass(), "firstDataVersion", "qUypQjDKks");
        setField(term133347, term133347.getClass(), "firstPlayDate", "VItjCXRpXX");
        setField(term133347, term133347.getClass(), "compatibleCmVersion", "CuQvkbeIKF");
        setField(term133347, term133347.getClass(), "dailyBonusDate", "JTDaVaJNVZ");
        setField(term133347, term133347.getClass(), "dailyCourseBonusDate", "SqbHVsvNsi");
        setField(term133347, term133347.getClass(), "lastPairLoginDate", "PCctsmeLnX");
        setField(term133347, term133347.getClass(), "lastTrialPlayDate", "mDPZZCKeJW");
        setIntField(term133347, term133347.getClass(), "playVsCount", -1128188846);
        setIntField(term133347, term133347.getClass(), "playSyncCount", -1601581964);
        setIntField(term133347, term133347.getClass(), "winCount", -1178253517);
        setIntField(term133347, term133347.getClass(), "helpCount", 1443002510);
        setIntField(term133347, term133347.getClass(), "comboCount", 1678623341);
        setLongField(term133347, term133347.getClass(), "totalDeluxscore", -1744175176071038140L);
        setLongField(term133347, term133347.getClass(), "totalBasicDeluxscore", 5740445776317547117L);
        setLongField(term133347, term133347.getClass(), "totalAdvancedDeluxscore", 5340451110486706929L);
        setLongField(term133347, term133347.getClass(), "totalExpertDeluxscore", -834649057234045870L);
        setLongField(term133347, term133347.getClass(), "totalMasterDeluxscore", -1731901704281084122L);
        setLongField(term133347, term133347.getClass(), "totalReMasterDeluxscore", 4619955776615657848L);
        setIntField(term133347, term133347.getClass(), "totalSync", -1023826937);
        setIntField(term133347, term133347.getClass(), "totalBasicSync", 1573871540);
        setIntField(term133347, term133347.getClass(), "totalAdvancedSync", -848249952);
        setIntField(term133347, term133347.getClass(), "totalExpertSync", 1446304058);
        setIntField(term133347, term133347.getClass(), "totalMasterSync", 1814136333);
        setIntField(term133347, term133347.getClass(), "totalReMasterSync", -1517722805);
        setLongField(term133347, term133347.getClass(), "totalAchievement", -5109383647593837186L);
        setLongField(term133347, term133347.getClass(), "totalBasicAchievement", -4839387572451342971L);
        setLongField(term133347, term133347.getClass(), "totalAdvancedAchievement", 4479770479690888765L);
        setLongField(term133347, term133347.getClass(), "totalExpertAchievement", -7067084092274132782L);
        setLongField(term133347, term133347.getClass(), "totalMasterAchievement", -4623234140799811472L);
        setLongField(term133347, term133347.getClass(), "totalReMasterAchievement", -603528869970967767L);
        setLongField(term133347, term133347.getClass(), "playerOldRating", 3585774690299855955L);
        setLongField(term133347, term133347.getClass(), "playerNewRating", -2688469248973543728L);
        setIntField(term133347, term133347.getClass(), "banState", -659702501);
        setLongField(term133347, term133347.getClass(), "dateTime", -250266242572593166L);
        setField(term133345, term133345.getClass(), "user", term133347);
        setField(term133345, term133345.getClass(), "propertyKey", "fLUSgXlneP");
        setField(term133345, term133345.getClass(), "propertyValue", "hKDHCIiSuI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term133345, args);
    }

};


