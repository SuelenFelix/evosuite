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

public class UserDetail_setCard_43993754579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239727;
     Object term240072;

    public UserDetail_setCard_43993754579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239731 = new Long(-1526328443223793465L);
        Integer term239794 = new Integer(-7331803);
        ArrayList term239792 = new ArrayList();
        ((ArrayList) term239792).add(term239794);
        Integer term239800 = new Integer(1725012686);
        Integer term239802 = new Integer(-309653587);
        ArrayList term239798 = new ArrayList();
        ((ArrayList) term239798).add(term239800);
        ((ArrayList) term239798).add(term239802);
        term239727 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term239729 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term239745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239760 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term239727, term239727.getClass(), "id", -7645850818717932590L);
        setLongField(term239729, term239729.getClass(), "id", 8089166918213337334L);
        setField(term239729, term239729.getClass(), "extId", term239731);
        setField(term239729, term239729.getClass(), "luid", "xHANisEhHP");
        setIntField(term239746, term239746.getClass(), "year", 2017);
        setShortField(term239746, term239746.getClass(), "month", (short) 9);
        setShortField(term239746, term239746.getClass(), "day", (short) 8);
        setField(term239745, term239745.getClass(), "date", term239746);
        setByteField(term239750, term239750.getClass(), "hour", (byte) 6);
        setByteField(term239750, term239750.getClass(), "minute", (byte) 20);
        setByteField(term239750, term239750.getClass(), "second", (byte) 45);
        setIntField(term239750, term239750.getClass(), "nano", 768981890);
        setField(term239745, term239745.getClass(), "time", term239750);
        setField(term239729, term239729.getClass(), "registerTime", term239745);
        setIntField(term239756, term239756.getClass(), "year", 2024);
        setShortField(term239756, term239756.getClass(), "month", (short) 7);
        setShortField(term239756, term239756.getClass(), "day", (short) 3);
        setField(term239755, term239755.getClass(), "date", term239756);
        setByteField(term239760, term239760.getClass(), "hour", (byte) 8);
        setByteField(term239760, term239760.getClass(), "minute", (byte) 6);
        setByteField(term239760, term239760.getClass(), "second", (byte) 33);
        setIntField(term239760, term239760.getClass(), "nano", 210450276);
        setField(term239755, term239755.getClass(), "time", term239760);
        setField(term239729, term239729.getClass(), "accessTime", term239755);
        setField(term239727, term239727.getClass(), "card", term239729);
        setField(term239727, term239727.getClass(), "userName", "jlmmzUmQxH");
        setIntField(term239727, term239727.getClass(), "isNetMember", 475400585);
        setIntField(term239727, term239727.getClass(), "iconId", 1734754418);
        setIntField(term239727, term239727.getClass(), "plateId", -1839971770);
        setIntField(term239727, term239727.getClass(), "titleId", 935864551);
        setIntField(term239727, term239727.getClass(), "partnerId", 763770353);
        setIntField(term239727, term239727.getClass(), "frameId", -169966950);
        setIntField(term239727, term239727.getClass(), "selectMapId", 788728016);
        setIntField(term239727, term239727.getClass(), "totalAwake", 776647480);
        setIntField(term239727, term239727.getClass(), "gradeRating", -1407923009);
        setIntField(term239727, term239727.getClass(), "musicRating", 810863217);
        setIntField(term239727, term239727.getClass(), "playerRating", -1373220514);
        setIntField(term239727, term239727.getClass(), "highestRating", -2033428879);
        setIntField(term239727, term239727.getClass(), "gradeRank", -668242366);
        setIntField(term239727, term239727.getClass(), "classRank", -1499983680);
        setIntField(term239727, term239727.getClass(), "courseRank", 141123988);
        setField(term239727, term239727.getClass(), "charaSlot", term239792);
        setField(term239727, term239727.getClass(), "charaLockSlot", term239798);
        setLongField(term239727, term239727.getClass(), "contentBit", 8822045384640483341L);
        setIntField(term239727, term239727.getClass(), "playCount", 1129353689);
        setField(term239727, term239727.getClass(), "eventWatchedDate", "RuYeeRfuJU");
        setField(term239727, term239727.getClass(), "lastGameId", "prwDXCPkFo");
        setField(term239727, term239727.getClass(), "lastRomVersion", "gXdJSyNntC");
        setField(term239727, term239727.getClass(), "lastDataVersion", "oovEoPNoDL");
        setField(term239727, term239727.getClass(), "lastLoginDate", "oflVrdmLzV");
        setField(term239727, term239727.getClass(), "lastPlayDate", "RrqOknhAbQ");
        setIntField(term239727, term239727.getClass(), "lastPlayCredit", -1177311303);
        setIntField(term239727, term239727.getClass(), "lastPlayMode", -192686342);
        setIntField(term239727, term239727.getClass(), "lastPlaceId", 543761654);
        setField(term239727, term239727.getClass(), "lastPlaceName", "JgwCJZKOrP");
        setIntField(term239727, term239727.getClass(), "lastAllNetId", 1129145600);
        setIntField(term239727, term239727.getClass(), "lastRegionId", -851007430);
        setField(term239727, term239727.getClass(), "lastRegionName", "HrQeKGmoKp");
        setField(term239727, term239727.getClass(), "lastClientId", "xEsTyydekp");
        setField(term239727, term239727.getClass(), "lastCountryCode", "ZjkBEbQCcc");
        setIntField(term239727, term239727.getClass(), "lastSelectEMoney", 916784201);
        setIntField(term239727, term239727.getClass(), "lastSelectTicket", -1309260186);
        setIntField(term239727, term239727.getClass(), "lastSelectCourse", -2090023696);
        setIntField(term239727, term239727.getClass(), "lastCountCourse", 461955028);
        setField(term239727, term239727.getClass(), "firstGameId", "oiGazRusBr");
        setField(term239727, term239727.getClass(), "firstRomVersion", "OPiUmYGtvL");
        setField(term239727, term239727.getClass(), "firstDataVersion", "PYXQFMpHgr");
        setField(term239727, term239727.getClass(), "firstPlayDate", "PxRBsVnNDB");
        setField(term239727, term239727.getClass(), "compatibleCmVersion", "wUGJdObirh");
        setField(term239727, term239727.getClass(), "dailyBonusDate", "fwRConrHOE");
        setField(term239727, term239727.getClass(), "dailyCourseBonusDate", "AXuVUkyDUa");
        setField(term239727, term239727.getClass(), "lastPairLoginDate", "OqUCbfAuLF");
        setField(term239727, term239727.getClass(), "lastTrialPlayDate", "mAgnHWeTVt");
        setIntField(term239727, term239727.getClass(), "playVsCount", 1118240740);
        setIntField(term239727, term239727.getClass(), "playSyncCount", 2074140139);
        setIntField(term239727, term239727.getClass(), "winCount", 1960030370);
        setIntField(term239727, term239727.getClass(), "helpCount", -1291981576);
        setIntField(term239727, term239727.getClass(), "comboCount", 1976016035);
        setLongField(term239727, term239727.getClass(), "totalDeluxscore", 45893618898764862L);
        setLongField(term239727, term239727.getClass(), "totalBasicDeluxscore", -5276697364172452398L);
        setLongField(term239727, term239727.getClass(), "totalAdvancedDeluxscore", -144730067102776606L);
        setLongField(term239727, term239727.getClass(), "totalExpertDeluxscore", -7896951062125228961L);
        setLongField(term239727, term239727.getClass(), "totalMasterDeluxscore", 3508165207481641200L);
        setLongField(term239727, term239727.getClass(), "totalReMasterDeluxscore", 8981882085945801014L);
        setIntField(term239727, term239727.getClass(), "totalSync", -802507085);
        setIntField(term239727, term239727.getClass(), "totalBasicSync", -1721657165);
        setIntField(term239727, term239727.getClass(), "totalAdvancedSync", -679248876);
        setIntField(term239727, term239727.getClass(), "totalExpertSync", -1201296940);
        setIntField(term239727, term239727.getClass(), "totalMasterSync", -1949732518);
        setIntField(term239727, term239727.getClass(), "totalReMasterSync", -363721129);
        setLongField(term239727, term239727.getClass(), "totalAchievement", 627916511020111213L);
        setLongField(term239727, term239727.getClass(), "totalBasicAchievement", -5331019109573791092L);
        setLongField(term239727, term239727.getClass(), "totalAdvancedAchievement", -5347198056336462508L);
        setLongField(term239727, term239727.getClass(), "totalExpertAchievement", -2702700372556153881L);
        setLongField(term239727, term239727.getClass(), "totalMasterAchievement", 1474337122072763102L);
        setLongField(term239727, term239727.getClass(), "totalReMasterAchievement", -1776244408886273790L);
        setLongField(term239727, term239727.getClass(), "playerOldRating", 554091061204450564L);
        setLongField(term239727, term239727.getClass(), "playerNewRating", 5483234956155548403L);
        setIntField(term239727, term239727.getClass(), "banState", -647496320);
        setLongField(term239727, term239727.getClass(), "dateTime", -8661647252098774207L);
        Long term240074 = new Long(-412186147449928821L);
        term240072 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240103 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240072, term240072.getClass(), "id", 5993247235238833039L);
        setField(term240072, term240072.getClass(), "extId", term240074);
        setField(term240072, term240072.getClass(), "luid", "wMlHXDjHnI");
        setIntField(term240089, term240089.getClass(), "year", 2028);
        setShortField(term240089, term240089.getClass(), "month", (short) 4);
        setShortField(term240089, term240089.getClass(), "day", (short) 5);
        setField(term240088, term240088.getClass(), "date", term240089);
        setByteField(term240093, term240093.getClass(), "hour", (byte) 14);
        setByteField(term240093, term240093.getClass(), "minute", (byte) 57);
        setByteField(term240093, term240093.getClass(), "second", (byte) 16);
        setIntField(term240093, term240093.getClass(), "nano", 963050998);
        setField(term240088, term240088.getClass(), "time", term240093);
        setField(term240072, term240072.getClass(), "registerTime", term240088);
        setIntField(term240099, term240099.getClass(), "year", 2027);
        setShortField(term240099, term240099.getClass(), "month", (short) 12);
        setShortField(term240099, term240099.getClass(), "day", (short) 25);
        setField(term240098, term240098.getClass(), "date", term240099);
        setByteField(term240103, term240103.getClass(), "hour", (byte) 19);
        setByteField(term240103, term240103.getClass(), "minute", (byte) 4);
        setByteField(term240103, term240103.getClass(), "second", (byte) 19);
        setIntField(term240103, term240103.getClass(), "nano", 237686859);
        setField(term240098, term240098.getClass(), "time", term240103);
        setField(term240072, term240072.getClass(), "accessTime", term240098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term240072;
        callMethod(klass, "setCard", argTypes, term239727, args);
    }

};


