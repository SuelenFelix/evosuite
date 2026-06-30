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

public class UserCourse_setCourseId_115539368417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82574;
     Object term82999;

    public UserCourse_setCourseId_115539368417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term82580 = new Long(148047808219672941L);
        Integer term82643 = new Integer(1073400519);
        Integer term82645 = new Integer(-2025555268);
        Integer term82647 = new Integer(-746950289);
        Integer term82649 = new Integer(-137577510);
        Integer term82651 = new Integer(719185716);
        ArrayList term82641 = new ArrayList();
        ((ArrayList) term82641).add(term82643);
        ((ArrayList) term82641).add(term82645);
        ((ArrayList) term82641).add(term82647);
        ((ArrayList) term82641).add(term82649);
        ((ArrayList) term82641).add(term82651);
        Integer term82657 = new Integer(1624820010);
        Integer term82659 = new Integer(-831921156);
        Integer term82661 = new Integer(-2085566906);
        Integer term82663 = new Integer(1773193728);
        Integer term82665 = new Integer(-1341357647);
        Integer term82667 = new Integer(138447019);
        Integer term82669 = new Integer(114915275);
        Integer term82671 = new Integer(338519695);
        Integer term82673 = new Integer(2025566580);
        ArrayList term82655 = new ArrayList();
        ((ArrayList) term82655).add(term82657);
        ((ArrayList) term82655).add(term82659);
        ((ArrayList) term82655).add(term82661);
        ((ArrayList) term82655).add(term82663);
        ((ArrayList) term82655).add(term82665);
        ((ArrayList) term82655).add(term82667);
        ((ArrayList) term82655).add(term82669);
        ((ArrayList) term82655).add(term82671);
        ((ArrayList) term82655).add(term82673);
        term82574 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term82576 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term82578 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term82594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82599 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82609 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term82574, term82574.getClass(), "id", -4715213274903499549L);
        setLongField(term82576, term82576.getClass(), "id", -206273696983196193L);
        setLongField(term82578, term82578.getClass(), "id", -1915177024356330506L);
        setField(term82578, term82578.getClass(), "extId", term82580);
        setField(term82578, term82578.getClass(), "luid", "KoWkwRBvcY");
        setIntField(term82595, term82595.getClass(), "year", 2019);
        setShortField(term82595, term82595.getClass(), "month", (short) 5);
        setShortField(term82595, term82595.getClass(), "day", (short) 16);
        setField(term82594, term82594.getClass(), "date", term82595);
        setByteField(term82599, term82599.getClass(), "hour", (byte) 3);
        setByteField(term82599, term82599.getClass(), "minute", (byte) 12);
        setByteField(term82599, term82599.getClass(), "second", (byte) 27);
        setIntField(term82599, term82599.getClass(), "nano", 775737832);
        setField(term82594, term82594.getClass(), "time", term82599);
        setField(term82578, term82578.getClass(), "registerTime", term82594);
        setIntField(term82605, term82605.getClass(), "year", 2016);
        setShortField(term82605, term82605.getClass(), "month", (short) 12);
        setShortField(term82605, term82605.getClass(), "day", (short) 2);
        setField(term82604, term82604.getClass(), "date", term82605);
        setByteField(term82609, term82609.getClass(), "hour", (byte) 7);
        setByteField(term82609, term82609.getClass(), "minute", (byte) 38);
        setByteField(term82609, term82609.getClass(), "second", (byte) 49);
        setIntField(term82609, term82609.getClass(), "nano", 415044053);
        setField(term82604, term82604.getClass(), "time", term82609);
        setField(term82578, term82578.getClass(), "accessTime", term82604);
        setField(term82576, term82576.getClass(), "card", term82578);
        setField(term82576, term82576.getClass(), "userName", "kqDHOsurKa");
        setIntField(term82576, term82576.getClass(), "isNetMember", 1425210363);
        setIntField(term82576, term82576.getClass(), "iconId", 656143415);
        setIntField(term82576, term82576.getClass(), "plateId", 1654162366);
        setIntField(term82576, term82576.getClass(), "titleId", 1659672136);
        setIntField(term82576, term82576.getClass(), "partnerId", 1379028862);
        setIntField(term82576, term82576.getClass(), "frameId", 1923849673);
        setIntField(term82576, term82576.getClass(), "selectMapId", 783108536);
        setIntField(term82576, term82576.getClass(), "totalAwake", 1305284548);
        setIntField(term82576, term82576.getClass(), "gradeRating", -567549105);
        setIntField(term82576, term82576.getClass(), "musicRating", -1707996167);
        setIntField(term82576, term82576.getClass(), "playerRating", 1222265931);
        setIntField(term82576, term82576.getClass(), "highestRating", 1684951870);
        setIntField(term82576, term82576.getClass(), "gradeRank", -1511199281);
        setIntField(term82576, term82576.getClass(), "classRank", -1801978748);
        setIntField(term82576, term82576.getClass(), "courseRank", 1121989052);
        setField(term82576, term82576.getClass(), "charaSlot", term82641);
        setField(term82576, term82576.getClass(), "charaLockSlot", term82655);
        setLongField(term82576, term82576.getClass(), "contentBit", -8102057067828170079L);
        setIntField(term82576, term82576.getClass(), "playCount", 1115099352);
        setField(term82576, term82576.getClass(), "eventWatchedDate", "NCqNKzmHkE");
        setField(term82576, term82576.getClass(), "lastGameId", "eFSnWGCXQK");
        setField(term82576, term82576.getClass(), "lastRomVersion", "GrrqChmbDB");
        setField(term82576, term82576.getClass(), "lastDataVersion", "AOUZgesZGu");
        setField(term82576, term82576.getClass(), "lastLoginDate", "RApShxzpug");
        setField(term82576, term82576.getClass(), "lastPlayDate", "aygFZPbIko");
        setIntField(term82576, term82576.getClass(), "lastPlayCredit", -269893980);
        setIntField(term82576, term82576.getClass(), "lastPlayMode", 1190163419);
        setIntField(term82576, term82576.getClass(), "lastPlaceId", -1365404936);
        setField(term82576, term82576.getClass(), "lastPlaceName", "hUhlDCVWIF");
        setIntField(term82576, term82576.getClass(), "lastAllNetId", -828371576);
        setIntField(term82576, term82576.getClass(), "lastRegionId", 1475471511);
        setField(term82576, term82576.getClass(), "lastRegionName", "GjzKvoPaBR");
        setField(term82576, term82576.getClass(), "lastClientId", "VZRLekBSXz");
        setField(term82576, term82576.getClass(), "lastCountryCode", "XfdYCOWEXZ");
        setIntField(term82576, term82576.getClass(), "lastSelectEMoney", 1061251899);
        setIntField(term82576, term82576.getClass(), "lastSelectTicket", -1000926687);
        setIntField(term82576, term82576.getClass(), "lastSelectCourse", 89149779);
        setIntField(term82576, term82576.getClass(), "lastCountCourse", 354592191);
        setField(term82576, term82576.getClass(), "firstGameId", "aPbJKoMxFL");
        setField(term82576, term82576.getClass(), "firstRomVersion", "FgtqUFBPnP");
        setField(term82576, term82576.getClass(), "firstDataVersion", "NUkHqaKZhA");
        setField(term82576, term82576.getClass(), "firstPlayDate", "kHSkpGasYO");
        setField(term82576, term82576.getClass(), "compatibleCmVersion", "OvTdHngAsq");
        setField(term82576, term82576.getClass(), "dailyBonusDate", "dlLhtWVZjw");
        setField(term82576, term82576.getClass(), "dailyCourseBonusDate", "bGfglrDSXT");
        setField(term82576, term82576.getClass(), "lastPairLoginDate", "sIrqbajnbs");
        setField(term82576, term82576.getClass(), "lastTrialPlayDate", "AaxFofoThl");
        setIntField(term82576, term82576.getClass(), "playVsCount", -874460167);
        setIntField(term82576, term82576.getClass(), "playSyncCount", 1753994569);
        setIntField(term82576, term82576.getClass(), "winCount", 2131854523);
        setIntField(term82576, term82576.getClass(), "helpCount", -2074551841);
        setIntField(term82576, term82576.getClass(), "comboCount", 1213549602);
        setLongField(term82576, term82576.getClass(), "totalDeluxscore", 2870545673083303918L);
        setLongField(term82576, term82576.getClass(), "totalBasicDeluxscore", -7840381460094892118L);
        setLongField(term82576, term82576.getClass(), "totalAdvancedDeluxscore", -8300306774743166010L);
        setLongField(term82576, term82576.getClass(), "totalExpertDeluxscore", 6114404614513911757L);
        setLongField(term82576, term82576.getClass(), "totalMasterDeluxscore", -8439940175231511654L);
        setLongField(term82576, term82576.getClass(), "totalReMasterDeluxscore", 5112631327574323651L);
        setIntField(term82576, term82576.getClass(), "totalSync", -1638897284);
        setIntField(term82576, term82576.getClass(), "totalBasicSync", -1998048906);
        setIntField(term82576, term82576.getClass(), "totalAdvancedSync", -1915332852);
        setIntField(term82576, term82576.getClass(), "totalExpertSync", 1603272771);
        setIntField(term82576, term82576.getClass(), "totalMasterSync", -1169796605);
        setIntField(term82576, term82576.getClass(), "totalReMasterSync", 1294129760);
        setLongField(term82576, term82576.getClass(), "totalAchievement", -166481681441578938L);
        setLongField(term82576, term82576.getClass(), "totalBasicAchievement", -4633318477485324682L);
        setLongField(term82576, term82576.getClass(), "totalAdvancedAchievement", 5380478321033986380L);
        setLongField(term82576, term82576.getClass(), "totalExpertAchievement", -5286169278330415236L);
        setLongField(term82576, term82576.getClass(), "totalMasterAchievement", -6466670514888869637L);
        setLongField(term82576, term82576.getClass(), "totalReMasterAchievement", 1092970910177761761L);
        setLongField(term82576, term82576.getClass(), "playerOldRating", 4106733769705635532L);
        setLongField(term82576, term82576.getClass(), "playerNewRating", -983658954375044823L);
        setIntField(term82576, term82576.getClass(), "banState", -1042003821);
        setLongField(term82576, term82576.getClass(), "dateTime", -2344830742558802930L);
        setField(term82574, term82574.getClass(), "user", term82576);
        setIntField(term82574, term82574.getClass(), "courseId", 1800189572);
        setBooleanField(term82574, term82574.getClass(), "isLastClear", true);
        setIntField(term82574, term82574.getClass(), "totalRestlife", -555300889);
        setIntField(term82574, term82574.getClass(), "totalAchievement", -319938895);
        setIntField(term82574, term82574.getClass(), "totalDeluxscore", -529078248);
        setIntField(term82574, term82574.getClass(), "playCount", 2125754107);
        setField(term82574, term82574.getClass(), "clearDate", "ukaqYcLsKW");
        setField(term82574, term82574.getClass(), "lastPlayDate", "EZLBboYbhD");
        setIntField(term82574, term82574.getClass(), "bestAchievement", 1094413748);
        setField(term82574, term82574.getClass(), "bestAchievementDate", "bZISImXSTe");
        setIntField(term82574, term82574.getClass(), "bestDeluxscore", 1697340530);
        setField(term82574, term82574.getClass(), "bestDeluxscoreDate", "yrKoMMHHHY");
        term82999 = new Integer(2037702914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82999;
        callMethod(klass, "setCourseId", argTypes, term82574, args);
    }

};


