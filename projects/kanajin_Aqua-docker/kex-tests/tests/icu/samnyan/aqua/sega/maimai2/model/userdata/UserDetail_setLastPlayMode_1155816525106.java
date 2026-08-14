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

public class UserDetail_setLastPlayMode_1155816525106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255770;
     Object term256121;

    public UserDetail_setLastPlayMode_1155816525106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term255774 = new Long(-7506365302323354325L);
        Integer term255837 = new Integer(-1058856035);
        Integer term255839 = new Integer(-91024448);
        Integer term255841 = new Integer(-744517334);
        Integer term255843 = new Integer(-855464783);
        Integer term255845 = new Integer(1496015170);
        Integer term255847 = new Integer(412507839);
        ArrayList term255835 = new ArrayList();
        ((ArrayList) term255835).add(term255837);
        ((ArrayList) term255835).add(term255839);
        ((ArrayList) term255835).add(term255841);
        ((ArrayList) term255835).add(term255843);
        ((ArrayList) term255835).add(term255845);
        ((ArrayList) term255835).add(term255847);
        ArrayList term255851 = new ArrayList();
        term255770 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term255772 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term255788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255793 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255798 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255803 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term255770, term255770.getClass(), "id", 3692170468392381501L);
        setLongField(term255772, term255772.getClass(), "id", -145300427529392700L);
        setField(term255772, term255772.getClass(), "extId", term255774);
        setField(term255772, term255772.getClass(), "luid", "mmeVnvqGFB");
        setIntField(term255789, term255789.getClass(), "year", 2012);
        setShortField(term255789, term255789.getClass(), "month", (short) 5);
        setShortField(term255789, term255789.getClass(), "day", (short) 5);
        setField(term255788, term255788.getClass(), "date", term255789);
        setByteField(term255793, term255793.getClass(), "hour", (byte) 9);
        setByteField(term255793, term255793.getClass(), "minute", (byte) 8);
        setByteField(term255793, term255793.getClass(), "second", (byte) 40);
        setIntField(term255793, term255793.getClass(), "nano", 919436445);
        setField(term255788, term255788.getClass(), "time", term255793);
        setField(term255772, term255772.getClass(), "registerTime", term255788);
        setIntField(term255799, term255799.getClass(), "year", 2015);
        setShortField(term255799, term255799.getClass(), "month", (short) 11);
        setShortField(term255799, term255799.getClass(), "day", (short) 3);
        setField(term255798, term255798.getClass(), "date", term255799);
        setByteField(term255803, term255803.getClass(), "hour", (byte) 5);
        setByteField(term255803, term255803.getClass(), "minute", (byte) 27);
        setByteField(term255803, term255803.getClass(), "second", (byte) 14);
        setIntField(term255803, term255803.getClass(), "nano", 150694068);
        setField(term255798, term255798.getClass(), "time", term255803);
        setField(term255772, term255772.getClass(), "accessTime", term255798);
        setField(term255770, term255770.getClass(), "card", term255772);
        setField(term255770, term255770.getClass(), "userName", "uaCErguuKj");
        setIntField(term255770, term255770.getClass(), "isNetMember", -1985046611);
        setIntField(term255770, term255770.getClass(), "iconId", 428782787);
        setIntField(term255770, term255770.getClass(), "plateId", -1722780181);
        setIntField(term255770, term255770.getClass(), "titleId", -120532453);
        setIntField(term255770, term255770.getClass(), "partnerId", 1641156302);
        setIntField(term255770, term255770.getClass(), "frameId", -1103659575);
        setIntField(term255770, term255770.getClass(), "selectMapId", 1725216560);
        setIntField(term255770, term255770.getClass(), "totalAwake", -1665341777);
        setIntField(term255770, term255770.getClass(), "gradeRating", 1478390763);
        setIntField(term255770, term255770.getClass(), "musicRating", -682426147);
        setIntField(term255770, term255770.getClass(), "playerRating", 1982919387);
        setIntField(term255770, term255770.getClass(), "highestRating", 1050211385);
        setIntField(term255770, term255770.getClass(), "gradeRank", -1724136965);
        setIntField(term255770, term255770.getClass(), "classRank", 838077311);
        setIntField(term255770, term255770.getClass(), "courseRank", 247997035);
        setField(term255770, term255770.getClass(), "charaSlot", term255835);
        setField(term255770, term255770.getClass(), "charaLockSlot", term255851);
        setLongField(term255770, term255770.getClass(), "contentBit", -7083218946769119040L);
        setIntField(term255770, term255770.getClass(), "playCount", 484164039);
        setField(term255770, term255770.getClass(), "eventWatchedDate", "CWIkxfoXOn");
        setField(term255770, term255770.getClass(), "lastGameId", "paSMyMWJmJ");
        setField(term255770, term255770.getClass(), "lastRomVersion", "BfEbeOIyEv");
        setField(term255770, term255770.getClass(), "lastDataVersion", "wKtDelthfw");
        setField(term255770, term255770.getClass(), "lastLoginDate", "gFOGAVnoKy");
        setField(term255770, term255770.getClass(), "lastPlayDate", "TNCsQimVZr");
        setIntField(term255770, term255770.getClass(), "lastPlayCredit", 1132248674);
        setIntField(term255770, term255770.getClass(), "lastPlayMode", 145644776);
        setIntField(term255770, term255770.getClass(), "lastPlaceId", -831867823);
        setField(term255770, term255770.getClass(), "lastPlaceName", "dTJYyhSqZb");
        setIntField(term255770, term255770.getClass(), "lastAllNetId", -1687655045);
        setIntField(term255770, term255770.getClass(), "lastRegionId", 316843723);
        setField(term255770, term255770.getClass(), "lastRegionName", "iicxxwOzxG");
        setField(term255770, term255770.getClass(), "lastClientId", "BSnMedHMbT");
        setField(term255770, term255770.getClass(), "lastCountryCode", "suxAdGELQz");
        setIntField(term255770, term255770.getClass(), "lastSelectEMoney", -1497095861);
        setIntField(term255770, term255770.getClass(), "lastSelectTicket", -1692196889);
        setIntField(term255770, term255770.getClass(), "lastSelectCourse", 25600877);
        setIntField(term255770, term255770.getClass(), "lastCountCourse", -1756534726);
        setField(term255770, term255770.getClass(), "firstGameId", "tDWIXysudb");
        setField(term255770, term255770.getClass(), "firstRomVersion", "RpgUAcoIsr");
        setField(term255770, term255770.getClass(), "firstDataVersion", "lQcYldlbRe");
        setField(term255770, term255770.getClass(), "firstPlayDate", "wLBfWSBNBp");
        setField(term255770, term255770.getClass(), "compatibleCmVersion", "mmSpCBAGwv");
        setField(term255770, term255770.getClass(), "dailyBonusDate", "cFItYVTeZD");
        setField(term255770, term255770.getClass(), "dailyCourseBonusDate", "CFWwaVWFFR");
        setField(term255770, term255770.getClass(), "lastPairLoginDate", "mVUqRSEsUR");
        setField(term255770, term255770.getClass(), "lastTrialPlayDate", "CgmarxBJZT");
        setIntField(term255770, term255770.getClass(), "playVsCount", -359047843);
        setIntField(term255770, term255770.getClass(), "playSyncCount", 1990411423);
        setIntField(term255770, term255770.getClass(), "winCount", -1628643632);
        setIntField(term255770, term255770.getClass(), "helpCount", 1972351840);
        setIntField(term255770, term255770.getClass(), "comboCount", -1695281641);
        setLongField(term255770, term255770.getClass(), "totalDeluxscore", -2928446311118560681L);
        setLongField(term255770, term255770.getClass(), "totalBasicDeluxscore", 3422185656455067064L);
        setLongField(term255770, term255770.getClass(), "totalAdvancedDeluxscore", -4961884899134285811L);
        setLongField(term255770, term255770.getClass(), "totalExpertDeluxscore", 638503400143239064L);
        setLongField(term255770, term255770.getClass(), "totalMasterDeluxscore", 5059296065562893295L);
        setLongField(term255770, term255770.getClass(), "totalReMasterDeluxscore", 391569930912850803L);
        setIntField(term255770, term255770.getClass(), "totalSync", -1479800705);
        setIntField(term255770, term255770.getClass(), "totalBasicSync", -37021358);
        setIntField(term255770, term255770.getClass(), "totalAdvancedSync", -1212186063);
        setIntField(term255770, term255770.getClass(), "totalExpertSync", 1840775354);
        setIntField(term255770, term255770.getClass(), "totalMasterSync", -127145524);
        setIntField(term255770, term255770.getClass(), "totalReMasterSync", -842625847);
        setLongField(term255770, term255770.getClass(), "totalAchievement", -1534292340214039950L);
        setLongField(term255770, term255770.getClass(), "totalBasicAchievement", -6875654956377189731L);
        setLongField(term255770, term255770.getClass(), "totalAdvancedAchievement", 2952029505049437620L);
        setLongField(term255770, term255770.getClass(), "totalExpertAchievement", -3133469301333816174L);
        setLongField(term255770, term255770.getClass(), "totalMasterAchievement", -4645923728883467259L);
        setLongField(term255770, term255770.getClass(), "totalReMasterAchievement", -852683032075937003L);
        setLongField(term255770, term255770.getClass(), "playerOldRating", -5626893806070484312L);
        setLongField(term255770, term255770.getClass(), "playerNewRating", -2683946059174871908L);
        setIntField(term255770, term255770.getClass(), "banState", -980360525);
        setLongField(term255770, term255770.getClass(), "dateTime", 300150071278151897L);
        term256121 = new Integer(741975827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term256121;
        callMethod(klass, "setLastPlayMode", argTypes, term255770, args);
    }

};


