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

public class UserDetail_setPlayCount_125850916198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251078;
     Object term251433;

    public UserDetail_setPlayCount_125850916198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251082 = new Long(-6837989212848250735L);
        Integer term251145 = new Integer(672070228);
        ArrayList term251143 = new ArrayList();
        ((ArrayList) term251143).add(term251145);
        Integer term251151 = new Integer(1014463904);
        Integer term251153 = new Integer(928673401);
        Integer term251155 = new Integer(-631739609);
        Integer term251157 = new Integer(-2045566233);
        Integer term251159 = new Integer(102632361);
        Integer term251161 = new Integer(-871963633);
        Integer term251163 = new Integer(-572352492);
        ArrayList term251149 = new ArrayList();
        ((ArrayList) term251149).add(term251151);
        ((ArrayList) term251149).add(term251153);
        ((ArrayList) term251149).add(term251155);
        ((ArrayList) term251149).add(term251157);
        ((ArrayList) term251149).add(term251159);
        ((ArrayList) term251149).add(term251161);
        ((ArrayList) term251149).add(term251163);
        term251078 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term251080 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term251096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251111 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term251078, term251078.getClass(), "id", 140713494572753585L);
        setLongField(term251080, term251080.getClass(), "id", -8681068136175115177L);
        setField(term251080, term251080.getClass(), "extId", term251082);
        setField(term251080, term251080.getClass(), "luid", "SNbQDPikGp");
        setIntField(term251097, term251097.getClass(), "year", 2017);
        setShortField(term251097, term251097.getClass(), "month", (short) 4);
        setShortField(term251097, term251097.getClass(), "day", (short) 16);
        setField(term251096, term251096.getClass(), "date", term251097);
        setByteField(term251101, term251101.getClass(), "hour", (byte) 4);
        setByteField(term251101, term251101.getClass(), "minute", (byte) 46);
        setByteField(term251101, term251101.getClass(), "second", (byte) 10);
        setIntField(term251101, term251101.getClass(), "nano", 543909144);
        setField(term251096, term251096.getClass(), "time", term251101);
        setField(term251080, term251080.getClass(), "registerTime", term251096);
        setIntField(term251107, term251107.getClass(), "year", 2025);
        setShortField(term251107, term251107.getClass(), "month", (short) 1);
        setShortField(term251107, term251107.getClass(), "day", (short) 18);
        setField(term251106, term251106.getClass(), "date", term251107);
        setByteField(term251111, term251111.getClass(), "hour", (byte) 6);
        setByteField(term251111, term251111.getClass(), "minute", (byte) 53);
        setByteField(term251111, term251111.getClass(), "second", (byte) 54);
        setIntField(term251111, term251111.getClass(), "nano", 781716212);
        setField(term251106, term251106.getClass(), "time", term251111);
        setField(term251080, term251080.getClass(), "accessTime", term251106);
        setField(term251078, term251078.getClass(), "card", term251080);
        setField(term251078, term251078.getClass(), "userName", "dCxylRMRqf");
        setIntField(term251078, term251078.getClass(), "isNetMember", -292092227);
        setIntField(term251078, term251078.getClass(), "iconId", 971086014);
        setIntField(term251078, term251078.getClass(), "plateId", 2016092974);
        setIntField(term251078, term251078.getClass(), "titleId", 1532471714);
        setIntField(term251078, term251078.getClass(), "partnerId", 1327391659);
        setIntField(term251078, term251078.getClass(), "frameId", -68772589);
        setIntField(term251078, term251078.getClass(), "selectMapId", -1830287514);
        setIntField(term251078, term251078.getClass(), "totalAwake", 449627601);
        setIntField(term251078, term251078.getClass(), "gradeRating", 2002854184);
        setIntField(term251078, term251078.getClass(), "musicRating", -1390281456);
        setIntField(term251078, term251078.getClass(), "playerRating", 2038031656);
        setIntField(term251078, term251078.getClass(), "highestRating", -1595647314);
        setIntField(term251078, term251078.getClass(), "gradeRank", -292744614);
        setIntField(term251078, term251078.getClass(), "classRank", 1205713971);
        setIntField(term251078, term251078.getClass(), "courseRank", 2071933112);
        setField(term251078, term251078.getClass(), "charaSlot", term251143);
        setField(term251078, term251078.getClass(), "charaLockSlot", term251149);
        setLongField(term251078, term251078.getClass(), "contentBit", -5074794736116814186L);
        setIntField(term251078, term251078.getClass(), "playCount", 1424640401);
        setField(term251078, term251078.getClass(), "eventWatchedDate", "MSwWSxHYib");
        setField(term251078, term251078.getClass(), "lastGameId", "bVOxJayYiq");
        setField(term251078, term251078.getClass(), "lastRomVersion", "qjysmKMiKT");
        setField(term251078, term251078.getClass(), "lastDataVersion", "IdvxsTXhfI");
        setField(term251078, term251078.getClass(), "lastLoginDate", "dqJbExUvup");
        setField(term251078, term251078.getClass(), "lastPlayDate", "TcgeOuVhBl");
        setIntField(term251078, term251078.getClass(), "lastPlayCredit", 1470762328);
        setIntField(term251078, term251078.getClass(), "lastPlayMode", -430947135);
        setIntField(term251078, term251078.getClass(), "lastPlaceId", -824754622);
        setField(term251078, term251078.getClass(), "lastPlaceName", "EsGOUSyjcl");
        setIntField(term251078, term251078.getClass(), "lastAllNetId", -511944283);
        setIntField(term251078, term251078.getClass(), "lastRegionId", 1200806761);
        setField(term251078, term251078.getClass(), "lastRegionName", "MrcebsjLJc");
        setField(term251078, term251078.getClass(), "lastClientId", "WsgiRfUyFt");
        setField(term251078, term251078.getClass(), "lastCountryCode", "UeuvnYQTzK");
        setIntField(term251078, term251078.getClass(), "lastSelectEMoney", 223962600);
        setIntField(term251078, term251078.getClass(), "lastSelectTicket", -1348546766);
        setIntField(term251078, term251078.getClass(), "lastSelectCourse", -612639577);
        setIntField(term251078, term251078.getClass(), "lastCountCourse", 1351645297);
        setField(term251078, term251078.getClass(), "firstGameId", "WIRsSxDEcQ");
        setField(term251078, term251078.getClass(), "firstRomVersion", "gktMmpIJGy");
        setField(term251078, term251078.getClass(), "firstDataVersion", "yEUvvkNsJL");
        setField(term251078, term251078.getClass(), "firstPlayDate", "LeUPMkvgXk");
        setField(term251078, term251078.getClass(), "compatibleCmVersion", "fiZsddQQDN");
        setField(term251078, term251078.getClass(), "dailyBonusDate", "qngJBSwcWS");
        setField(term251078, term251078.getClass(), "dailyCourseBonusDate", "NeglvhHDjr");
        setField(term251078, term251078.getClass(), "lastPairLoginDate", "TTDVDdOeqI");
        setField(term251078, term251078.getClass(), "lastTrialPlayDate", "jDyYjDgeRm");
        setIntField(term251078, term251078.getClass(), "playVsCount", 797872167);
        setIntField(term251078, term251078.getClass(), "playSyncCount", -1898471230);
        setIntField(term251078, term251078.getClass(), "winCount", -236037138);
        setIntField(term251078, term251078.getClass(), "helpCount", 941970855);
        setIntField(term251078, term251078.getClass(), "comboCount", -928779283);
        setLongField(term251078, term251078.getClass(), "totalDeluxscore", -526943830764994645L);
        setLongField(term251078, term251078.getClass(), "totalBasicDeluxscore", 6849552893109253485L);
        setLongField(term251078, term251078.getClass(), "totalAdvancedDeluxscore", 6011430648807726827L);
        setLongField(term251078, term251078.getClass(), "totalExpertDeluxscore", 5825555842140547258L);
        setLongField(term251078, term251078.getClass(), "totalMasterDeluxscore", 1636286734824334816L);
        setLongField(term251078, term251078.getClass(), "totalReMasterDeluxscore", 504220594953571708L);
        setIntField(term251078, term251078.getClass(), "totalSync", -1495150636);
        setIntField(term251078, term251078.getClass(), "totalBasicSync", 349016490);
        setIntField(term251078, term251078.getClass(), "totalAdvancedSync", 440243083);
        setIntField(term251078, term251078.getClass(), "totalExpertSync", -1309251968);
        setIntField(term251078, term251078.getClass(), "totalMasterSync", -1744361983);
        setIntField(term251078, term251078.getClass(), "totalReMasterSync", -1442368912);
        setLongField(term251078, term251078.getClass(), "totalAchievement", -659232248554822246L);
        setLongField(term251078, term251078.getClass(), "totalBasicAchievement", 1218491186084285911L);
        setLongField(term251078, term251078.getClass(), "totalAdvancedAchievement", 7470888335236366520L);
        setLongField(term251078, term251078.getClass(), "totalExpertAchievement", 8656142971885912306L);
        setLongField(term251078, term251078.getClass(), "totalMasterAchievement", 1936974624612863975L);
        setLongField(term251078, term251078.getClass(), "totalReMasterAchievement", -4951431680873099998L);
        setLongField(term251078, term251078.getClass(), "playerOldRating", 8922800633144478376L);
        setLongField(term251078, term251078.getClass(), "playerNewRating", 6448284369187440711L);
        setIntField(term251078, term251078.getClass(), "banState", 114583319);
        setLongField(term251078, term251078.getClass(), "dateTime", -7957128919967123371L);
        term251433 = new Integer(1054093600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term251433;
        callMethod(klass, "setPlayCount", argTypes, term251078, args);
    }

};


