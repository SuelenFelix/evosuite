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

public class UserDetail_setCard_43993754578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239672;
     Object term240017;

    public UserDetail_setCard_43993754578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239676 = new Long(-1526328443223793465L);
        Integer term239739 = new Integer(-7331803);
        ArrayList term239737 = new ArrayList();
        ((ArrayList) term239737).add(term239739);
        Integer term239745 = new Integer(1725012686);
        Integer term239747 = new Integer(-309653587);
        ArrayList term239743 = new ArrayList();
        ((ArrayList) term239743).add(term239745);
        ((ArrayList) term239743).add(term239747);
        term239672 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term239674 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term239690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239705 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term239672, term239672.getClass(), "id", -7645850818717932590L);
        setLongField(term239674, term239674.getClass(), "id", 8089166918213337334L);
        setField(term239674, term239674.getClass(), "extId", term239676);
        setField(term239674, term239674.getClass(), "luid", "xHANisEhHP");
        setIntField(term239691, term239691.getClass(), "year", 2017);
        setShortField(term239691, term239691.getClass(), "month", (short) 9);
        setShortField(term239691, term239691.getClass(), "day", (short) 8);
        setField(term239690, term239690.getClass(), "date", term239691);
        setByteField(term239695, term239695.getClass(), "hour", (byte) 6);
        setByteField(term239695, term239695.getClass(), "minute", (byte) 20);
        setByteField(term239695, term239695.getClass(), "second", (byte) 45);
        setIntField(term239695, term239695.getClass(), "nano", 768981890);
        setField(term239690, term239690.getClass(), "time", term239695);
        setField(term239674, term239674.getClass(), "registerTime", term239690);
        setIntField(term239701, term239701.getClass(), "year", 2024);
        setShortField(term239701, term239701.getClass(), "month", (short) 7);
        setShortField(term239701, term239701.getClass(), "day", (short) 3);
        setField(term239700, term239700.getClass(), "date", term239701);
        setByteField(term239705, term239705.getClass(), "hour", (byte) 8);
        setByteField(term239705, term239705.getClass(), "minute", (byte) 6);
        setByteField(term239705, term239705.getClass(), "second", (byte) 33);
        setIntField(term239705, term239705.getClass(), "nano", 210450276);
        setField(term239700, term239700.getClass(), "time", term239705);
        setField(term239674, term239674.getClass(), "accessTime", term239700);
        setField(term239672, term239672.getClass(), "card", term239674);
        setField(term239672, term239672.getClass(), "userName", "jlmmzUmQxH");
        setIntField(term239672, term239672.getClass(), "isNetMember", 475400585);
        setIntField(term239672, term239672.getClass(), "iconId", 1734754418);
        setIntField(term239672, term239672.getClass(), "plateId", -1839971770);
        setIntField(term239672, term239672.getClass(), "titleId", 935864551);
        setIntField(term239672, term239672.getClass(), "partnerId", 763770353);
        setIntField(term239672, term239672.getClass(), "frameId", -169966950);
        setIntField(term239672, term239672.getClass(), "selectMapId", 788728016);
        setIntField(term239672, term239672.getClass(), "totalAwake", 776647480);
        setIntField(term239672, term239672.getClass(), "gradeRating", -1407923009);
        setIntField(term239672, term239672.getClass(), "musicRating", 810863217);
        setIntField(term239672, term239672.getClass(), "playerRating", -1373220514);
        setIntField(term239672, term239672.getClass(), "highestRating", -2033428879);
        setIntField(term239672, term239672.getClass(), "gradeRank", -668242366);
        setIntField(term239672, term239672.getClass(), "classRank", -1499983680);
        setIntField(term239672, term239672.getClass(), "courseRank", 141123988);
        setField(term239672, term239672.getClass(), "charaSlot", term239737);
        setField(term239672, term239672.getClass(), "charaLockSlot", term239743);
        setLongField(term239672, term239672.getClass(), "contentBit", 8822045384640483341L);
        setIntField(term239672, term239672.getClass(), "playCount", 1129353689);
        setField(term239672, term239672.getClass(), "eventWatchedDate", "RuYeeRfuJU");
        setField(term239672, term239672.getClass(), "lastGameId", "prwDXCPkFo");
        setField(term239672, term239672.getClass(), "lastRomVersion", "gXdJSyNntC");
        setField(term239672, term239672.getClass(), "lastDataVersion", "oovEoPNoDL");
        setField(term239672, term239672.getClass(), "lastLoginDate", "oflVrdmLzV");
        setField(term239672, term239672.getClass(), "lastPlayDate", "RrqOknhAbQ");
        setIntField(term239672, term239672.getClass(), "lastPlayCredit", -1177311303);
        setIntField(term239672, term239672.getClass(), "lastPlayMode", -192686342);
        setIntField(term239672, term239672.getClass(), "lastPlaceId", 543761654);
        setField(term239672, term239672.getClass(), "lastPlaceName", "JgwCJZKOrP");
        setIntField(term239672, term239672.getClass(), "lastAllNetId", 1129145600);
        setIntField(term239672, term239672.getClass(), "lastRegionId", -851007430);
        setField(term239672, term239672.getClass(), "lastRegionName", "HrQeKGmoKp");
        setField(term239672, term239672.getClass(), "lastClientId", "xEsTyydekp");
        setField(term239672, term239672.getClass(), "lastCountryCode", "ZjkBEbQCcc");
        setIntField(term239672, term239672.getClass(), "lastSelectEMoney", 916784201);
        setIntField(term239672, term239672.getClass(), "lastSelectTicket", -1309260186);
        setIntField(term239672, term239672.getClass(), "lastSelectCourse", -2090023696);
        setIntField(term239672, term239672.getClass(), "lastCountCourse", 461955028);
        setField(term239672, term239672.getClass(), "firstGameId", "oiGazRusBr");
        setField(term239672, term239672.getClass(), "firstRomVersion", "OPiUmYGtvL");
        setField(term239672, term239672.getClass(), "firstDataVersion", "PYXQFMpHgr");
        setField(term239672, term239672.getClass(), "firstPlayDate", "PxRBsVnNDB");
        setField(term239672, term239672.getClass(), "compatibleCmVersion", "wUGJdObirh");
        setField(term239672, term239672.getClass(), "dailyBonusDate", "fwRConrHOE");
        setField(term239672, term239672.getClass(), "dailyCourseBonusDate", "AXuVUkyDUa");
        setField(term239672, term239672.getClass(), "lastPairLoginDate", "OqUCbfAuLF");
        setField(term239672, term239672.getClass(), "lastTrialPlayDate", "mAgnHWeTVt");
        setIntField(term239672, term239672.getClass(), "playVsCount", 1118240740);
        setIntField(term239672, term239672.getClass(), "playSyncCount", 2074140139);
        setIntField(term239672, term239672.getClass(), "winCount", 1960030370);
        setIntField(term239672, term239672.getClass(), "helpCount", -1291981576);
        setIntField(term239672, term239672.getClass(), "comboCount", 1976016035);
        setLongField(term239672, term239672.getClass(), "totalDeluxscore", 45893618898764862L);
        setLongField(term239672, term239672.getClass(), "totalBasicDeluxscore", -5276697364172452398L);
        setLongField(term239672, term239672.getClass(), "totalAdvancedDeluxscore", -144730067102776606L);
        setLongField(term239672, term239672.getClass(), "totalExpertDeluxscore", -7896951062125228961L);
        setLongField(term239672, term239672.getClass(), "totalMasterDeluxscore", 3508165207481641200L);
        setLongField(term239672, term239672.getClass(), "totalReMasterDeluxscore", 8981882085945801014L);
        setIntField(term239672, term239672.getClass(), "totalSync", -802507085);
        setIntField(term239672, term239672.getClass(), "totalBasicSync", -1721657165);
        setIntField(term239672, term239672.getClass(), "totalAdvancedSync", -679248876);
        setIntField(term239672, term239672.getClass(), "totalExpertSync", -1201296940);
        setIntField(term239672, term239672.getClass(), "totalMasterSync", -1949732518);
        setIntField(term239672, term239672.getClass(), "totalReMasterSync", -363721129);
        setLongField(term239672, term239672.getClass(), "totalAchievement", 627916511020111213L);
        setLongField(term239672, term239672.getClass(), "totalBasicAchievement", -5331019109573791092L);
        setLongField(term239672, term239672.getClass(), "totalAdvancedAchievement", -5347198056336462508L);
        setLongField(term239672, term239672.getClass(), "totalExpertAchievement", -2702700372556153881L);
        setLongField(term239672, term239672.getClass(), "totalMasterAchievement", 1474337122072763102L);
        setLongField(term239672, term239672.getClass(), "totalReMasterAchievement", -1776244408886273790L);
        setLongField(term239672, term239672.getClass(), "playerOldRating", 554091061204450564L);
        setLongField(term239672, term239672.getClass(), "playerNewRating", 5483234956155548403L);
        setIntField(term239672, term239672.getClass(), "banState", -647496320);
        setLongField(term239672, term239672.getClass(), "dateTime", -8661647252098774207L);
        Long term240019 = new Long(-412186147449928821L);
        term240017 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240038 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240048 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240017, term240017.getClass(), "id", 5993247235238833039L);
        setField(term240017, term240017.getClass(), "extId", term240019);
        setField(term240017, term240017.getClass(), "luid", "wMlHXDjHnI");
        setIntField(term240034, term240034.getClass(), "year", 2028);
        setShortField(term240034, term240034.getClass(), "month", (short) 4);
        setShortField(term240034, term240034.getClass(), "day", (short) 5);
        setField(term240033, term240033.getClass(), "date", term240034);
        setByteField(term240038, term240038.getClass(), "hour", (byte) 14);
        setByteField(term240038, term240038.getClass(), "minute", (byte) 57);
        setByteField(term240038, term240038.getClass(), "second", (byte) 16);
        setIntField(term240038, term240038.getClass(), "nano", 963050998);
        setField(term240033, term240033.getClass(), "time", term240038);
        setField(term240017, term240017.getClass(), "registerTime", term240033);
        setIntField(term240044, term240044.getClass(), "year", 2027);
        setShortField(term240044, term240044.getClass(), "month", (short) 12);
        setShortField(term240044, term240044.getClass(), "day", (short) 25);
        setField(term240043, term240043.getClass(), "date", term240044);
        setByteField(term240048, term240048.getClass(), "hour", (byte) 19);
        setByteField(term240048, term240048.getClass(), "minute", (byte) 4);
        setByteField(term240048, term240048.getClass(), "second", (byte) 19);
        setIntField(term240048, term240048.getClass(), "nano", 237686859);
        setField(term240043, term240043.getClass(), "time", term240048);
        setField(term240017, term240017.getClass(), "accessTime", term240043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term240017;
        callMethod(klass, "setCard", argTypes, term239672, args);
    }

};


