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

public class UserDetail_setLastAllNetId_1312411699109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291594;
     Object term4291949;

    public UserDetail_setLastAllNetId_1312411699109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4291598 = new Long(2766432648605092542L);
        Integer term4291661 = new Integer(-1550515105);
        Integer term4291663 = new Integer(-1856677255);
        Integer term4291665 = new Integer(-1066312681);
        Integer term4291667 = new Integer(1151101967);
        Integer term4291669 = new Integer(720162054);
        Integer term4291671 = new Integer(1656175535);
        Integer term4291673 = new Integer(-529922125);
        ArrayList term4291659 = new ArrayList();
        ((ArrayList) term4291659).add(term4291661);
        ((ArrayList) term4291659).add(term4291663);
        ((ArrayList) term4291659).add(term4291665);
        ((ArrayList) term4291659).add(term4291667);
        ((ArrayList) term4291659).add(term4291669);
        ((ArrayList) term4291659).add(term4291671);
        ((ArrayList) term4291659).add(term4291673);
        Integer term4291679 = new Integer(-1030934359);
        ArrayList term4291677 = new ArrayList();
        ((ArrayList) term4291677).add(term4291679);
        term4291594 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4291596 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4291612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4291613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4291617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4291622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4291623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4291627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4291594, term4291594.getClass(), "id", -9133301183633301360L);
        setLongField(term4291596, term4291596.getClass(), "id", 1651245857376181768L);
        setField(term4291596, term4291596.getClass(), "extId", term4291598);
        setField(term4291596, term4291596.getClass(), "luid", "AVnreYVFjN");
        setIntField(term4291613, term4291613.getClass(), "year", 2016);
        setShortField(term4291613, term4291613.getClass(), "month", (short) 6);
        setShortField(term4291613, term4291613.getClass(), "day", (short) 20);
        setField(term4291612, term4291612.getClass(), "date", term4291613);
        setByteField(term4291617, term4291617.getClass(), "hour", (byte) 8);
        setByteField(term4291617, term4291617.getClass(), "minute", (byte) 40);
        setByteField(term4291617, term4291617.getClass(), "second", (byte) 58);
        setIntField(term4291617, term4291617.getClass(), "nano", 145585834);
        setField(term4291612, term4291612.getClass(), "time", term4291617);
        setField(term4291596, term4291596.getClass(), "registerTime", term4291612);
        setIntField(term4291623, term4291623.getClass(), "year", 2018);
        setShortField(term4291623, term4291623.getClass(), "month", (short) 12);
        setShortField(term4291623, term4291623.getClass(), "day", (short) 18);
        setField(term4291622, term4291622.getClass(), "date", term4291623);
        setByteField(term4291627, term4291627.getClass(), "hour", (byte) 15);
        setByteField(term4291627, term4291627.getClass(), "minute", (byte) 37);
        setByteField(term4291627, term4291627.getClass(), "second", (byte) 50);
        setIntField(term4291627, term4291627.getClass(), "nano", 845147401);
        setField(term4291622, term4291622.getClass(), "time", term4291627);
        setField(term4291596, term4291596.getClass(), "accessTime", term4291622);
        setField(term4291594, term4291594.getClass(), "card", term4291596);
        setField(term4291594, term4291594.getClass(), "userName", "ZmEVENVNgY");
        setIntField(term4291594, term4291594.getClass(), "isNetMember", 895620504);
        setIntField(term4291594, term4291594.getClass(), "iconId", -620267178);
        setIntField(term4291594, term4291594.getClass(), "plateId", -356448942);
        setIntField(term4291594, term4291594.getClass(), "titleId", -428418222);
        setIntField(term4291594, term4291594.getClass(), "partnerId", 765142097);
        setIntField(term4291594, term4291594.getClass(), "frameId", -718505094);
        setIntField(term4291594, term4291594.getClass(), "selectMapId", 235886724);
        setIntField(term4291594, term4291594.getClass(), "totalAwake", -1331372844);
        setIntField(term4291594, term4291594.getClass(), "gradeRating", 1945878110);
        setIntField(term4291594, term4291594.getClass(), "musicRating", -673334632);
        setIntField(term4291594, term4291594.getClass(), "playerRating", 1665822083);
        setIntField(term4291594, term4291594.getClass(), "highestRating", -327800252);
        setIntField(term4291594, term4291594.getClass(), "gradeRank", -1994852693);
        setIntField(term4291594, term4291594.getClass(), "classRank", 2122161558);
        setIntField(term4291594, term4291594.getClass(), "courseRank", 473022611);
        setField(term4291594, term4291594.getClass(), "charaSlot", term4291659);
        setField(term4291594, term4291594.getClass(), "charaLockSlot", term4291677);
        setLongField(term4291594, term4291594.getClass(), "contentBit", 6899264003506120662L);
        setIntField(term4291594, term4291594.getClass(), "playCount", 429611047);
        setField(term4291594, term4291594.getClass(), "eventWatchedDate", "WardVpDPqI");
        setField(term4291594, term4291594.getClass(), "lastGameId", "nIHPGoXCKA");
        setField(term4291594, term4291594.getClass(), "lastRomVersion", "dkcSpBTRzx");
        setField(term4291594, term4291594.getClass(), "lastDataVersion", "DFREdPBmZY");
        setField(term4291594, term4291594.getClass(), "lastLoginDate", "XkvYVNqKZI");
        setField(term4291594, term4291594.getClass(), "lastPlayDate", "zETrCQQFoC");
        setIntField(term4291594, term4291594.getClass(), "lastPlayCredit", 1513152577);
        setIntField(term4291594, term4291594.getClass(), "lastPlayMode", 367117750);
        setIntField(term4291594, term4291594.getClass(), "lastPlaceId", -433125153);
        setField(term4291594, term4291594.getClass(), "lastPlaceName", "DyKhsPZRPV");
        setIntField(term4291594, term4291594.getClass(), "lastAllNetId", 1170717029);
        setIntField(term4291594, term4291594.getClass(), "lastRegionId", -1749497361);
        setField(term4291594, term4291594.getClass(), "lastRegionName", "DomGCYLngp");
        setField(term4291594, term4291594.getClass(), "lastClientId", "VWkQarLnXi");
        setField(term4291594, term4291594.getClass(), "lastCountryCode", "OqUFoLmYoS");
        setIntField(term4291594, term4291594.getClass(), "lastSelectEMoney", 1940376435);
        setIntField(term4291594, term4291594.getClass(), "lastSelectTicket", -1501489475);
        setIntField(term4291594, term4291594.getClass(), "lastSelectCourse", -1923933633);
        setIntField(term4291594, term4291594.getClass(), "lastCountCourse", -1189015514);
        setField(term4291594, term4291594.getClass(), "firstGameId", "fLzPOfocoA");
        setField(term4291594, term4291594.getClass(), "firstRomVersion", "ksrvpqtrSA");
        setField(term4291594, term4291594.getClass(), "firstDataVersion", "cAdfagqgwP");
        setField(term4291594, term4291594.getClass(), "firstPlayDate", "MySuTjKDdQ");
        setField(term4291594, term4291594.getClass(), "compatibleCmVersion", "UnNsKMGJsY");
        setField(term4291594, term4291594.getClass(), "dailyBonusDate", "MTpjCrCxQY");
        setField(term4291594, term4291594.getClass(), "dailyCourseBonusDate", "jXztHwvBXe");
        setField(term4291594, term4291594.getClass(), "lastPairLoginDate", "mVMTkIslnp");
        setField(term4291594, term4291594.getClass(), "lastTrialPlayDate", "UAIzQbLxXg");
        setIntField(term4291594, term4291594.getClass(), "playVsCount", -1252494191);
        setIntField(term4291594, term4291594.getClass(), "playSyncCount", -1321217483);
        setIntField(term4291594, term4291594.getClass(), "winCount", 944223872);
        setIntField(term4291594, term4291594.getClass(), "helpCount", -152458972);
        setIntField(term4291594, term4291594.getClass(), "comboCount", -1707100305);
        setLongField(term4291594, term4291594.getClass(), "totalDeluxscore", 906531845491461638L);
        setLongField(term4291594, term4291594.getClass(), "totalBasicDeluxscore", 5314472969598022674L);
        setLongField(term4291594, term4291594.getClass(), "totalAdvancedDeluxscore", 1355102140089578623L);
        setLongField(term4291594, term4291594.getClass(), "totalExpertDeluxscore", 7250150179137586959L);
        setLongField(term4291594, term4291594.getClass(), "totalMasterDeluxscore", 1134756387963979006L);
        setLongField(term4291594, term4291594.getClass(), "totalReMasterDeluxscore", 6142378034157820147L);
        setIntField(term4291594, term4291594.getClass(), "totalSync", 113450435);
        setIntField(term4291594, term4291594.getClass(), "totalBasicSync", 1402789618);
        setIntField(term4291594, term4291594.getClass(), "totalAdvancedSync", 1479593813);
        setIntField(term4291594, term4291594.getClass(), "totalExpertSync", 1114709919);
        setIntField(term4291594, term4291594.getClass(), "totalMasterSync", -1420910244);
        setIntField(term4291594, term4291594.getClass(), "totalReMasterSync", -42860013);
        setLongField(term4291594, term4291594.getClass(), "totalAchievement", -6692832142899051379L);
        setLongField(term4291594, term4291594.getClass(), "totalBasicAchievement", -1044535117952468061L);
        setLongField(term4291594, term4291594.getClass(), "totalAdvancedAchievement", 7806004135507195330L);
        setLongField(term4291594, term4291594.getClass(), "totalExpertAchievement", 2724323642683773030L);
        setLongField(term4291594, term4291594.getClass(), "totalMasterAchievement", -7035276074209066753L);
        setLongField(term4291594, term4291594.getClass(), "totalReMasterAchievement", -1689439188382010424L);
        setLongField(term4291594, term4291594.getClass(), "playerOldRating", -2496964191714353932L);
        setLongField(term4291594, term4291594.getClass(), "playerNewRating", -1999662790763379776L);
        setIntField(term4291594, term4291594.getClass(), "banState", 1335324149);
        setLongField(term4291594, term4291594.getClass(), "dateTime", -4762851476114949272L);
        term4291949 = new Integer(-1797953608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4291949;
        callMethod(klass, "setLastAllNetId", argTypes, term4291594, args);
    }

};


