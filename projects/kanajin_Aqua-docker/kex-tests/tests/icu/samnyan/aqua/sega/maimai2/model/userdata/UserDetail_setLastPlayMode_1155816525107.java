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

public class UserDetail_setLastPlayMode_1155816525107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255825;
     Object term256176;

    public UserDetail_setLastPlayMode_1155816525107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term255829 = new Long(-7506365302323354325L);
        Integer term255892 = new Integer(-1058856035);
        Integer term255894 = new Integer(-91024448);
        Integer term255896 = new Integer(-744517334);
        Integer term255898 = new Integer(-855464783);
        Integer term255900 = new Integer(1496015170);
        Integer term255902 = new Integer(412507839);
        ArrayList term255890 = new ArrayList();
        ((ArrayList) term255890).add(term255892);
        ((ArrayList) term255890).add(term255894);
        ((ArrayList) term255890).add(term255896);
        ((ArrayList) term255890).add(term255898);
        ((ArrayList) term255890).add(term255900);
        ((ArrayList) term255890).add(term255902);
        ArrayList term255906 = new ArrayList();
        term255825 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term255827 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term255843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255858 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term255825, term255825.getClass(), "id", 3692170468392381501L);
        setLongField(term255827, term255827.getClass(), "id", -145300427529392700L);
        setField(term255827, term255827.getClass(), "extId", term255829);
        setField(term255827, term255827.getClass(), "luid", "mmeVnvqGFB");
        setIntField(term255844, term255844.getClass(), "year", 2012);
        setShortField(term255844, term255844.getClass(), "month", (short) 5);
        setShortField(term255844, term255844.getClass(), "day", (short) 5);
        setField(term255843, term255843.getClass(), "date", term255844);
        setByteField(term255848, term255848.getClass(), "hour", (byte) 9);
        setByteField(term255848, term255848.getClass(), "minute", (byte) 8);
        setByteField(term255848, term255848.getClass(), "second", (byte) 40);
        setIntField(term255848, term255848.getClass(), "nano", 919436445);
        setField(term255843, term255843.getClass(), "time", term255848);
        setField(term255827, term255827.getClass(), "registerTime", term255843);
        setIntField(term255854, term255854.getClass(), "year", 2015);
        setShortField(term255854, term255854.getClass(), "month", (short) 11);
        setShortField(term255854, term255854.getClass(), "day", (short) 3);
        setField(term255853, term255853.getClass(), "date", term255854);
        setByteField(term255858, term255858.getClass(), "hour", (byte) 5);
        setByteField(term255858, term255858.getClass(), "minute", (byte) 27);
        setByteField(term255858, term255858.getClass(), "second", (byte) 14);
        setIntField(term255858, term255858.getClass(), "nano", 150694068);
        setField(term255853, term255853.getClass(), "time", term255858);
        setField(term255827, term255827.getClass(), "accessTime", term255853);
        setField(term255825, term255825.getClass(), "card", term255827);
        setField(term255825, term255825.getClass(), "userName", "uaCErguuKj");
        setIntField(term255825, term255825.getClass(), "isNetMember", -1985046611);
        setIntField(term255825, term255825.getClass(), "iconId", 428782787);
        setIntField(term255825, term255825.getClass(), "plateId", -1722780181);
        setIntField(term255825, term255825.getClass(), "titleId", -120532453);
        setIntField(term255825, term255825.getClass(), "partnerId", 1641156302);
        setIntField(term255825, term255825.getClass(), "frameId", -1103659575);
        setIntField(term255825, term255825.getClass(), "selectMapId", 1725216560);
        setIntField(term255825, term255825.getClass(), "totalAwake", -1665341777);
        setIntField(term255825, term255825.getClass(), "gradeRating", 1478390763);
        setIntField(term255825, term255825.getClass(), "musicRating", -682426147);
        setIntField(term255825, term255825.getClass(), "playerRating", 1982919387);
        setIntField(term255825, term255825.getClass(), "highestRating", 1050211385);
        setIntField(term255825, term255825.getClass(), "gradeRank", -1724136965);
        setIntField(term255825, term255825.getClass(), "classRank", 838077311);
        setIntField(term255825, term255825.getClass(), "courseRank", 247997035);
        setField(term255825, term255825.getClass(), "charaSlot", term255890);
        setField(term255825, term255825.getClass(), "charaLockSlot", term255906);
        setLongField(term255825, term255825.getClass(), "contentBit", -7083218946769119040L);
        setIntField(term255825, term255825.getClass(), "playCount", 484164039);
        setField(term255825, term255825.getClass(), "eventWatchedDate", "CWIkxfoXOn");
        setField(term255825, term255825.getClass(), "lastGameId", "paSMyMWJmJ");
        setField(term255825, term255825.getClass(), "lastRomVersion", "BfEbeOIyEv");
        setField(term255825, term255825.getClass(), "lastDataVersion", "wKtDelthfw");
        setField(term255825, term255825.getClass(), "lastLoginDate", "gFOGAVnoKy");
        setField(term255825, term255825.getClass(), "lastPlayDate", "TNCsQimVZr");
        setIntField(term255825, term255825.getClass(), "lastPlayCredit", 1132248674);
        setIntField(term255825, term255825.getClass(), "lastPlayMode", 145644776);
        setIntField(term255825, term255825.getClass(), "lastPlaceId", -831867823);
        setField(term255825, term255825.getClass(), "lastPlaceName", "dTJYyhSqZb");
        setIntField(term255825, term255825.getClass(), "lastAllNetId", -1687655045);
        setIntField(term255825, term255825.getClass(), "lastRegionId", 316843723);
        setField(term255825, term255825.getClass(), "lastRegionName", "iicxxwOzxG");
        setField(term255825, term255825.getClass(), "lastClientId", "BSnMedHMbT");
        setField(term255825, term255825.getClass(), "lastCountryCode", "suxAdGELQz");
        setIntField(term255825, term255825.getClass(), "lastSelectEMoney", -1497095861);
        setIntField(term255825, term255825.getClass(), "lastSelectTicket", -1692196889);
        setIntField(term255825, term255825.getClass(), "lastSelectCourse", 25600877);
        setIntField(term255825, term255825.getClass(), "lastCountCourse", -1756534726);
        setField(term255825, term255825.getClass(), "firstGameId", "tDWIXysudb");
        setField(term255825, term255825.getClass(), "firstRomVersion", "RpgUAcoIsr");
        setField(term255825, term255825.getClass(), "firstDataVersion", "lQcYldlbRe");
        setField(term255825, term255825.getClass(), "firstPlayDate", "wLBfWSBNBp");
        setField(term255825, term255825.getClass(), "compatibleCmVersion", "mmSpCBAGwv");
        setField(term255825, term255825.getClass(), "dailyBonusDate", "cFItYVTeZD");
        setField(term255825, term255825.getClass(), "dailyCourseBonusDate", "CFWwaVWFFR");
        setField(term255825, term255825.getClass(), "lastPairLoginDate", "mVUqRSEsUR");
        setField(term255825, term255825.getClass(), "lastTrialPlayDate", "CgmarxBJZT");
        setIntField(term255825, term255825.getClass(), "playVsCount", -359047843);
        setIntField(term255825, term255825.getClass(), "playSyncCount", 1990411423);
        setIntField(term255825, term255825.getClass(), "winCount", -1628643632);
        setIntField(term255825, term255825.getClass(), "helpCount", 1972351840);
        setIntField(term255825, term255825.getClass(), "comboCount", -1695281641);
        setLongField(term255825, term255825.getClass(), "totalDeluxscore", -2928446311118560681L);
        setLongField(term255825, term255825.getClass(), "totalBasicDeluxscore", 3422185656455067064L);
        setLongField(term255825, term255825.getClass(), "totalAdvancedDeluxscore", -4961884899134285811L);
        setLongField(term255825, term255825.getClass(), "totalExpertDeluxscore", 638503400143239064L);
        setLongField(term255825, term255825.getClass(), "totalMasterDeluxscore", 5059296065562893295L);
        setLongField(term255825, term255825.getClass(), "totalReMasterDeluxscore", 391569930912850803L);
        setIntField(term255825, term255825.getClass(), "totalSync", -1479800705);
        setIntField(term255825, term255825.getClass(), "totalBasicSync", -37021358);
        setIntField(term255825, term255825.getClass(), "totalAdvancedSync", -1212186063);
        setIntField(term255825, term255825.getClass(), "totalExpertSync", 1840775354);
        setIntField(term255825, term255825.getClass(), "totalMasterSync", -127145524);
        setIntField(term255825, term255825.getClass(), "totalReMasterSync", -842625847);
        setLongField(term255825, term255825.getClass(), "totalAchievement", -1534292340214039950L);
        setLongField(term255825, term255825.getClass(), "totalBasicAchievement", -6875654956377189731L);
        setLongField(term255825, term255825.getClass(), "totalAdvancedAchievement", 2952029505049437620L);
        setLongField(term255825, term255825.getClass(), "totalExpertAchievement", -3133469301333816174L);
        setLongField(term255825, term255825.getClass(), "totalMasterAchievement", -4645923728883467259L);
        setLongField(term255825, term255825.getClass(), "totalReMasterAchievement", -852683032075937003L);
        setLongField(term255825, term255825.getClass(), "playerOldRating", -5626893806070484312L);
        setLongField(term255825, term255825.getClass(), "playerNewRating", -2683946059174871908L);
        setIntField(term255825, term255825.getClass(), "banState", -980360525);
        setLongField(term255825, term255825.getClass(), "dateTime", 300150071278151897L);
        term256176 = new Integer(741975827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term256176;
        callMethod(klass, "setLastPlayMode", argTypes, term255825, args);
    }

};


