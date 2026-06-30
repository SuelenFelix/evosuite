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

public class UserDetail_setPlayCount_125850916199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251133;
     Object term251488;

    public UserDetail_setPlayCount_125850916199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251137 = new Long(-6837989212848250735L);
        Integer term251200 = new Integer(672070228);
        ArrayList term251198 = new ArrayList();
        ((ArrayList) term251198).add(term251200);
        Integer term251206 = new Integer(1014463904);
        Integer term251208 = new Integer(928673401);
        Integer term251210 = new Integer(-631739609);
        Integer term251212 = new Integer(-2045566233);
        Integer term251214 = new Integer(102632361);
        Integer term251216 = new Integer(-871963633);
        Integer term251218 = new Integer(-572352492);
        ArrayList term251204 = new ArrayList();
        ((ArrayList) term251204).add(term251206);
        ((ArrayList) term251204).add(term251208);
        ((ArrayList) term251204).add(term251210);
        ((ArrayList) term251204).add(term251212);
        ((ArrayList) term251204).add(term251214);
        ((ArrayList) term251204).add(term251216);
        ((ArrayList) term251204).add(term251218);
        term251133 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term251135 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term251151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term251133, term251133.getClass(), "id", 140713494572753585L);
        setLongField(term251135, term251135.getClass(), "id", -8681068136175115177L);
        setField(term251135, term251135.getClass(), "extId", term251137);
        setField(term251135, term251135.getClass(), "luid", "SNbQDPikGp");
        setIntField(term251152, term251152.getClass(), "year", 2017);
        setShortField(term251152, term251152.getClass(), "month", (short) 4);
        setShortField(term251152, term251152.getClass(), "day", (short) 16);
        setField(term251151, term251151.getClass(), "date", term251152);
        setByteField(term251156, term251156.getClass(), "hour", (byte) 4);
        setByteField(term251156, term251156.getClass(), "minute", (byte) 46);
        setByteField(term251156, term251156.getClass(), "second", (byte) 10);
        setIntField(term251156, term251156.getClass(), "nano", 543909144);
        setField(term251151, term251151.getClass(), "time", term251156);
        setField(term251135, term251135.getClass(), "registerTime", term251151);
        setIntField(term251162, term251162.getClass(), "year", 2025);
        setShortField(term251162, term251162.getClass(), "month", (short) 1);
        setShortField(term251162, term251162.getClass(), "day", (short) 18);
        setField(term251161, term251161.getClass(), "date", term251162);
        setByteField(term251166, term251166.getClass(), "hour", (byte) 6);
        setByteField(term251166, term251166.getClass(), "minute", (byte) 53);
        setByteField(term251166, term251166.getClass(), "second", (byte) 54);
        setIntField(term251166, term251166.getClass(), "nano", 781716212);
        setField(term251161, term251161.getClass(), "time", term251166);
        setField(term251135, term251135.getClass(), "accessTime", term251161);
        setField(term251133, term251133.getClass(), "card", term251135);
        setField(term251133, term251133.getClass(), "userName", "dCxylRMRqf");
        setIntField(term251133, term251133.getClass(), "isNetMember", -292092227);
        setIntField(term251133, term251133.getClass(), "iconId", 971086014);
        setIntField(term251133, term251133.getClass(), "plateId", 2016092974);
        setIntField(term251133, term251133.getClass(), "titleId", 1532471714);
        setIntField(term251133, term251133.getClass(), "partnerId", 1327391659);
        setIntField(term251133, term251133.getClass(), "frameId", -68772589);
        setIntField(term251133, term251133.getClass(), "selectMapId", -1830287514);
        setIntField(term251133, term251133.getClass(), "totalAwake", 449627601);
        setIntField(term251133, term251133.getClass(), "gradeRating", 2002854184);
        setIntField(term251133, term251133.getClass(), "musicRating", -1390281456);
        setIntField(term251133, term251133.getClass(), "playerRating", 2038031656);
        setIntField(term251133, term251133.getClass(), "highestRating", -1595647314);
        setIntField(term251133, term251133.getClass(), "gradeRank", -292744614);
        setIntField(term251133, term251133.getClass(), "classRank", 1205713971);
        setIntField(term251133, term251133.getClass(), "courseRank", 2071933112);
        setField(term251133, term251133.getClass(), "charaSlot", term251198);
        setField(term251133, term251133.getClass(), "charaLockSlot", term251204);
        setLongField(term251133, term251133.getClass(), "contentBit", -5074794736116814186L);
        setIntField(term251133, term251133.getClass(), "playCount", 1424640401);
        setField(term251133, term251133.getClass(), "eventWatchedDate", "MSwWSxHYib");
        setField(term251133, term251133.getClass(), "lastGameId", "bVOxJayYiq");
        setField(term251133, term251133.getClass(), "lastRomVersion", "qjysmKMiKT");
        setField(term251133, term251133.getClass(), "lastDataVersion", "IdvxsTXhfI");
        setField(term251133, term251133.getClass(), "lastLoginDate", "dqJbExUvup");
        setField(term251133, term251133.getClass(), "lastPlayDate", "TcgeOuVhBl");
        setIntField(term251133, term251133.getClass(), "lastPlayCredit", 1470762328);
        setIntField(term251133, term251133.getClass(), "lastPlayMode", -430947135);
        setIntField(term251133, term251133.getClass(), "lastPlaceId", -824754622);
        setField(term251133, term251133.getClass(), "lastPlaceName", "EsGOUSyjcl");
        setIntField(term251133, term251133.getClass(), "lastAllNetId", -511944283);
        setIntField(term251133, term251133.getClass(), "lastRegionId", 1200806761);
        setField(term251133, term251133.getClass(), "lastRegionName", "MrcebsjLJc");
        setField(term251133, term251133.getClass(), "lastClientId", "WsgiRfUyFt");
        setField(term251133, term251133.getClass(), "lastCountryCode", "UeuvnYQTzK");
        setIntField(term251133, term251133.getClass(), "lastSelectEMoney", 223962600);
        setIntField(term251133, term251133.getClass(), "lastSelectTicket", -1348546766);
        setIntField(term251133, term251133.getClass(), "lastSelectCourse", -612639577);
        setIntField(term251133, term251133.getClass(), "lastCountCourse", 1351645297);
        setField(term251133, term251133.getClass(), "firstGameId", "WIRsSxDEcQ");
        setField(term251133, term251133.getClass(), "firstRomVersion", "gktMmpIJGy");
        setField(term251133, term251133.getClass(), "firstDataVersion", "yEUvvkNsJL");
        setField(term251133, term251133.getClass(), "firstPlayDate", "LeUPMkvgXk");
        setField(term251133, term251133.getClass(), "compatibleCmVersion", "fiZsddQQDN");
        setField(term251133, term251133.getClass(), "dailyBonusDate", "qngJBSwcWS");
        setField(term251133, term251133.getClass(), "dailyCourseBonusDate", "NeglvhHDjr");
        setField(term251133, term251133.getClass(), "lastPairLoginDate", "TTDVDdOeqI");
        setField(term251133, term251133.getClass(), "lastTrialPlayDate", "jDyYjDgeRm");
        setIntField(term251133, term251133.getClass(), "playVsCount", 797872167);
        setIntField(term251133, term251133.getClass(), "playSyncCount", -1898471230);
        setIntField(term251133, term251133.getClass(), "winCount", -236037138);
        setIntField(term251133, term251133.getClass(), "helpCount", 941970855);
        setIntField(term251133, term251133.getClass(), "comboCount", -928779283);
        setLongField(term251133, term251133.getClass(), "totalDeluxscore", -526943830764994645L);
        setLongField(term251133, term251133.getClass(), "totalBasicDeluxscore", 6849552893109253485L);
        setLongField(term251133, term251133.getClass(), "totalAdvancedDeluxscore", 6011430648807726827L);
        setLongField(term251133, term251133.getClass(), "totalExpertDeluxscore", 5825555842140547258L);
        setLongField(term251133, term251133.getClass(), "totalMasterDeluxscore", 1636286734824334816L);
        setLongField(term251133, term251133.getClass(), "totalReMasterDeluxscore", 504220594953571708L);
        setIntField(term251133, term251133.getClass(), "totalSync", -1495150636);
        setIntField(term251133, term251133.getClass(), "totalBasicSync", 349016490);
        setIntField(term251133, term251133.getClass(), "totalAdvancedSync", 440243083);
        setIntField(term251133, term251133.getClass(), "totalExpertSync", -1309251968);
        setIntField(term251133, term251133.getClass(), "totalMasterSync", -1744361983);
        setIntField(term251133, term251133.getClass(), "totalReMasterSync", -1442368912);
        setLongField(term251133, term251133.getClass(), "totalAchievement", -659232248554822246L);
        setLongField(term251133, term251133.getClass(), "totalBasicAchievement", 1218491186084285911L);
        setLongField(term251133, term251133.getClass(), "totalAdvancedAchievement", 7470888335236366520L);
        setLongField(term251133, term251133.getClass(), "totalExpertAchievement", 8656142971885912306L);
        setLongField(term251133, term251133.getClass(), "totalMasterAchievement", 1936974624612863975L);
        setLongField(term251133, term251133.getClass(), "totalReMasterAchievement", -4951431680873099998L);
        setLongField(term251133, term251133.getClass(), "playerOldRating", 8922800633144478376L);
        setLongField(term251133, term251133.getClass(), "playerNewRating", 6448284369187440711L);
        setIntField(term251133, term251133.getClass(), "banState", 114583319);
        setLongField(term251133, term251133.getClass(), "dateTime", -7957128919967123371L);
        term251488 = new Integer(1054093600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term251488;
        callMethod(klass, "setPlayCount", argTypes, term251133, args);
    }

};


