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

public class UserItem_toString_70456724116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42630;

    public UserItem_toString_70456724116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42636 = new Long(-8658027316505137504L);
        Integer term42699 = new Integer(1048451946);
        Integer term42701 = new Integer(5603560);
        Integer term42703 = new Integer(-1079020032);
        Integer term42705 = new Integer(-1973791064);
        Integer term42707 = new Integer(-2072158633);
        Integer term42709 = new Integer(-355469363);
        Integer term42711 = new Integer(1465188553);
        Integer term42713 = new Integer(1633913667);
        ArrayList term42697 = new ArrayList();
        ((ArrayList) term42697).add(term42699);
        ((ArrayList) term42697).add(term42701);
        ((ArrayList) term42697).add(term42703);
        ((ArrayList) term42697).add(term42705);
        ((ArrayList) term42697).add(term42707);
        ((ArrayList) term42697).add(term42709);
        ((ArrayList) term42697).add(term42711);
        ((ArrayList) term42697).add(term42713);
        Integer term42719 = new Integer(1292332296);
        Integer term42721 = new Integer(-1415256843);
        Integer term42723 = new Integer(612177768);
        Integer term42725 = new Integer(-1626451656);
        Integer term42727 = new Integer(173952451);
        Integer term42729 = new Integer(-1972033388);
        Integer term42731 = new Integer(-1005024758);
        ArrayList term42717 = new ArrayList();
        ((ArrayList) term42717).add(term42719);
        ((ArrayList) term42717).add(term42721);
        ((ArrayList) term42717).add(term42723);
        ((ArrayList) term42717).add(term42725);
        ((ArrayList) term42717).add(term42727);
        ((ArrayList) term42717).add(term42729);
        ((ArrayList) term42717).add(term42731);
        term42630 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term42632 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term42634 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42655 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42665 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42630, term42630.getClass(), "id", 9162413454188628116L);
        setLongField(term42632, term42632.getClass(), "id", 6077385331237778943L);
        setLongField(term42634, term42634.getClass(), "id", -5803004674995774129L);
        setField(term42634, term42634.getClass(), "extId", term42636);
        setField(term42634, term42634.getClass(), "luid", "DcKqrrTdId");
        setIntField(term42651, term42651.getClass(), "year", 2019);
        setShortField(term42651, term42651.getClass(), "month", (short) 6);
        setShortField(term42651, term42651.getClass(), "day", (short) 12);
        setField(term42650, term42650.getClass(), "date", term42651);
        setByteField(term42655, term42655.getClass(), "hour", (byte) 5);
        setByteField(term42655, term42655.getClass(), "minute", (byte) 13);
        setByteField(term42655, term42655.getClass(), "second", (byte) 8);
        setIntField(term42655, term42655.getClass(), "nano", 838117658);
        setField(term42650, term42650.getClass(), "time", term42655);
        setField(term42634, term42634.getClass(), "registerTime", term42650);
        setIntField(term42661, term42661.getClass(), "year", 2014);
        setShortField(term42661, term42661.getClass(), "month", (short) 8);
        setShortField(term42661, term42661.getClass(), "day", (short) 13);
        setField(term42660, term42660.getClass(), "date", term42661);
        setByteField(term42665, term42665.getClass(), "hour", (byte) 13);
        setByteField(term42665, term42665.getClass(), "minute", (byte) 15);
        setByteField(term42665, term42665.getClass(), "second", (byte) 51);
        setIntField(term42665, term42665.getClass(), "nano", 433726678);
        setField(term42660, term42660.getClass(), "time", term42665);
        setField(term42634, term42634.getClass(), "accessTime", term42660);
        setField(term42632, term42632.getClass(), "card", term42634);
        setField(term42632, term42632.getClass(), "userName", "fwtOJhjXbW");
        setIntField(term42632, term42632.getClass(), "isNetMember", 1337550691);
        setIntField(term42632, term42632.getClass(), "iconId", 2107385711);
        setIntField(term42632, term42632.getClass(), "plateId", 986298442);
        setIntField(term42632, term42632.getClass(), "titleId", 1751660702);
        setIntField(term42632, term42632.getClass(), "partnerId", 433217860);
        setIntField(term42632, term42632.getClass(), "frameId", 495773924);
        setIntField(term42632, term42632.getClass(), "selectMapId", 1485597364);
        setIntField(term42632, term42632.getClass(), "totalAwake", 1232259140);
        setIntField(term42632, term42632.getClass(), "gradeRating", -1371367751);
        setIntField(term42632, term42632.getClass(), "musicRating", -954813389);
        setIntField(term42632, term42632.getClass(), "playerRating", -232542458);
        setIntField(term42632, term42632.getClass(), "highestRating", -106999876);
        setIntField(term42632, term42632.getClass(), "gradeRank", -2129996761);
        setIntField(term42632, term42632.getClass(), "classRank", 1822990018);
        setIntField(term42632, term42632.getClass(), "courseRank", -417542619);
        setField(term42632, term42632.getClass(), "charaSlot", term42697);
        setField(term42632, term42632.getClass(), "charaLockSlot", term42717);
        setLongField(term42632, term42632.getClass(), "contentBit", 5467431248910278098L);
        setIntField(term42632, term42632.getClass(), "playCount", 562244123);
        setField(term42632, term42632.getClass(), "eventWatchedDate", "ltWBKZaXwJ");
        setField(term42632, term42632.getClass(), "lastGameId", "FSQpgxQnsH");
        setField(term42632, term42632.getClass(), "lastRomVersion", "LBPwnVMEpP");
        setField(term42632, term42632.getClass(), "lastDataVersion", "cwALzyQVjH");
        setField(term42632, term42632.getClass(), "lastLoginDate", "jlYNjpdkoz");
        setField(term42632, term42632.getClass(), "lastPlayDate", "DZAGnhJkeU");
        setIntField(term42632, term42632.getClass(), "lastPlayCredit", -1020238686);
        setIntField(term42632, term42632.getClass(), "lastPlayMode", -1450230869);
        setIntField(term42632, term42632.getClass(), "lastPlaceId", -785918740);
        setField(term42632, term42632.getClass(), "lastPlaceName", "xQuVexkiVz");
        setIntField(term42632, term42632.getClass(), "lastAllNetId", 384642213);
        setIntField(term42632, term42632.getClass(), "lastRegionId", 1673176720);
        setField(term42632, term42632.getClass(), "lastRegionName", "LqNgPziYtv");
        setField(term42632, term42632.getClass(), "lastClientId", "wiDfuaXnrP");
        setField(term42632, term42632.getClass(), "lastCountryCode", "btdGZUcaZl");
        setIntField(term42632, term42632.getClass(), "lastSelectEMoney", 1084767630);
        setIntField(term42632, term42632.getClass(), "lastSelectTicket", 1634202484);
        setIntField(term42632, term42632.getClass(), "lastSelectCourse", -1738191161);
        setIntField(term42632, term42632.getClass(), "lastCountCourse", 48416396);
        setField(term42632, term42632.getClass(), "firstGameId", "WnEAVdCxna");
        setField(term42632, term42632.getClass(), "firstRomVersion", "lnPIxHHyEK");
        setField(term42632, term42632.getClass(), "firstDataVersion", "unvQfYuBUz");
        setField(term42632, term42632.getClass(), "firstPlayDate", "RqnYUpQBbG");
        setField(term42632, term42632.getClass(), "compatibleCmVersion", "sKnuhmcjCC");
        setField(term42632, term42632.getClass(), "dailyBonusDate", "oCBbVNwMnb");
        setField(term42632, term42632.getClass(), "dailyCourseBonusDate", "miJxAzOVJy");
        setField(term42632, term42632.getClass(), "lastPairLoginDate", "kjqlBVaviD");
        setField(term42632, term42632.getClass(), "lastTrialPlayDate", "iVRXRDCrcM");
        setIntField(term42632, term42632.getClass(), "playVsCount", -1949441630);
        setIntField(term42632, term42632.getClass(), "playSyncCount", 1641286805);
        setIntField(term42632, term42632.getClass(), "winCount", -370516662);
        setIntField(term42632, term42632.getClass(), "helpCount", -372652916);
        setIntField(term42632, term42632.getClass(), "comboCount", 1915058189);
        setLongField(term42632, term42632.getClass(), "totalDeluxscore", -6624097117784103684L);
        setLongField(term42632, term42632.getClass(), "totalBasicDeluxscore", 4418899868035922058L);
        setLongField(term42632, term42632.getClass(), "totalAdvancedDeluxscore", 4663932691158406829L);
        setLongField(term42632, term42632.getClass(), "totalExpertDeluxscore", -5802364286448544947L);
        setLongField(term42632, term42632.getClass(), "totalMasterDeluxscore", 7633060281229939158L);
        setLongField(term42632, term42632.getClass(), "totalReMasterDeluxscore", 4171742078739516731L);
        setIntField(term42632, term42632.getClass(), "totalSync", -1466811987);
        setIntField(term42632, term42632.getClass(), "totalBasicSync", 469445830);
        setIntField(term42632, term42632.getClass(), "totalAdvancedSync", -1482217659);
        setIntField(term42632, term42632.getClass(), "totalExpertSync", 1650302326);
        setIntField(term42632, term42632.getClass(), "totalMasterSync", -123648353);
        setIntField(term42632, term42632.getClass(), "totalReMasterSync", -992215212);
        setLongField(term42632, term42632.getClass(), "totalAchievement", 4391974157316283404L);
        setLongField(term42632, term42632.getClass(), "totalBasicAchievement", -8447404910321380142L);
        setLongField(term42632, term42632.getClass(), "totalAdvancedAchievement", 3415544654174435087L);
        setLongField(term42632, term42632.getClass(), "totalExpertAchievement", -6444648462294378605L);
        setLongField(term42632, term42632.getClass(), "totalMasterAchievement", 2399163633137062666L);
        setLongField(term42632, term42632.getClass(), "totalReMasterAchievement", 4553697734347851750L);
        setLongField(term42632, term42632.getClass(), "playerOldRating", 1612790513855406360L);
        setLongField(term42632, term42632.getClass(), "playerNewRating", -3628485034781450950L);
        setIntField(term42632, term42632.getClass(), "banState", 665125325);
        setLongField(term42632, term42632.getClass(), "dateTime", 2505442540861032970L);
        setField(term42630, term42630.getClass(), "user", term42632);
        setIntField(term42630, term42630.getClass(), "itemKind", -1180829225);
        setIntField(term42630, term42630.getClass(), "itemId", -19961314);
        setIntField(term42630, term42630.getClass(), "stock", 903876999);
        setBooleanField(term42630, term42630.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term42630, args);
    }

};


