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

public class UserDetail_setPartnerId_66515958584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4277192;
     Object term4277549;

    public UserDetail_setPartnerId_66515958584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4277196 = new Long(-8985083735056061211L);
        Integer term4277259 = new Integer(2023775166);
        Integer term4277261 = new Integer(2041747664);
        Integer term4277263 = new Integer(-55507174);
        Integer term4277265 = new Integer(1686211970);
        ArrayList term4277257 = new ArrayList();
        ((ArrayList) term4277257).add(term4277259);
        ((ArrayList) term4277257).add(term4277261);
        ((ArrayList) term4277257).add(term4277263);
        ((ArrayList) term4277257).add(term4277265);
        Integer term4277271 = new Integer(-1718965606);
        Integer term4277273 = new Integer(1584286085);
        Integer term4277275 = new Integer(1829584257);
        Integer term4277277 = new Integer(-1981265348);
        Integer term4277279 = new Integer(-1586349939);
        ArrayList term4277269 = new ArrayList();
        ((ArrayList) term4277269).add(term4277271);
        ((ArrayList) term4277269).add(term4277273);
        ((ArrayList) term4277269).add(term4277275);
        ((ArrayList) term4277269).add(term4277277);
        ((ArrayList) term4277269).add(term4277279);
        term4277192 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4277194 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4277210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4277211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4277215 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4277220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4277221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4277225 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4277192, term4277192.getClass(), "id", -3325828620490347671L);
        setLongField(term4277194, term4277194.getClass(), "id", -6433518198786014105L);
        setField(term4277194, term4277194.getClass(), "extId", term4277196);
        setField(term4277194, term4277194.getClass(), "luid", "iGJfMSplRM");
        setIntField(term4277211, term4277211.getClass(), "year", 2021);
        setShortField(term4277211, term4277211.getClass(), "month", (short) 9);
        setShortField(term4277211, term4277211.getClass(), "day", (short) 27);
        setField(term4277210, term4277210.getClass(), "date", term4277211);
        setByteField(term4277215, term4277215.getClass(), "hour", (byte) 17);
        setByteField(term4277215, term4277215.getClass(), "minute", (byte) 42);
        setByteField(term4277215, term4277215.getClass(), "second", (byte) 38);
        setIntField(term4277215, term4277215.getClass(), "nano", 59809641);
        setField(term4277210, term4277210.getClass(), "time", term4277215);
        setField(term4277194, term4277194.getClass(), "registerTime", term4277210);
        setIntField(term4277221, term4277221.getClass(), "year", 2012);
        setShortField(term4277221, term4277221.getClass(), "month", (short) 2);
        setShortField(term4277221, term4277221.getClass(), "day", (short) 1);
        setField(term4277220, term4277220.getClass(), "date", term4277221);
        setByteField(term4277225, term4277225.getClass(), "hour", (byte) 12);
        setByteField(term4277225, term4277225.getClass(), "minute", (byte) 30);
        setByteField(term4277225, term4277225.getClass(), "second", (byte) 2);
        setIntField(term4277225, term4277225.getClass(), "nano", 301628532);
        setField(term4277220, term4277220.getClass(), "time", term4277225);
        setField(term4277194, term4277194.getClass(), "accessTime", term4277220);
        setField(term4277192, term4277192.getClass(), "card", term4277194);
        setField(term4277192, term4277192.getClass(), "userName", "aYytfjugDW");
        setIntField(term4277192, term4277192.getClass(), "isNetMember", -1228193251);
        setIntField(term4277192, term4277192.getClass(), "iconId", 348905645);
        setIntField(term4277192, term4277192.getClass(), "plateId", -1358542043);
        setIntField(term4277192, term4277192.getClass(), "titleId", -1680980490);
        setIntField(term4277192, term4277192.getClass(), "partnerId", -2146862387);
        setIntField(term4277192, term4277192.getClass(), "frameId", 709067799);
        setIntField(term4277192, term4277192.getClass(), "selectMapId", -387470183);
        setIntField(term4277192, term4277192.getClass(), "totalAwake", 1636961615);
        setIntField(term4277192, term4277192.getClass(), "gradeRating", 1212776196);
        setIntField(term4277192, term4277192.getClass(), "musicRating", -1125522274);
        setIntField(term4277192, term4277192.getClass(), "playerRating", 630695806);
        setIntField(term4277192, term4277192.getClass(), "highestRating", 454455751);
        setIntField(term4277192, term4277192.getClass(), "gradeRank", 190541041);
        setIntField(term4277192, term4277192.getClass(), "classRank", -538795963);
        setIntField(term4277192, term4277192.getClass(), "courseRank", -222955734);
        setField(term4277192, term4277192.getClass(), "charaSlot", term4277257);
        setField(term4277192, term4277192.getClass(), "charaLockSlot", term4277269);
        setLongField(term4277192, term4277192.getClass(), "contentBit", 7108587257054203194L);
        setIntField(term4277192, term4277192.getClass(), "playCount", -1270154385);
        setField(term4277192, term4277192.getClass(), "eventWatchedDate", "ZKhpIZeCdq");
        setField(term4277192, term4277192.getClass(), "lastGameId", "pOQOddSxmY");
        setField(term4277192, term4277192.getClass(), "lastRomVersion", "SXNpSXuGdg");
        setField(term4277192, term4277192.getClass(), "lastDataVersion", "plLMBchVar");
        setField(term4277192, term4277192.getClass(), "lastLoginDate", "XkddckmYyn");
        setField(term4277192, term4277192.getClass(), "lastPlayDate", "ijHAvzAZZn");
        setIntField(term4277192, term4277192.getClass(), "lastPlayCredit", -1058665514);
        setIntField(term4277192, term4277192.getClass(), "lastPlayMode", -1393510567);
        setIntField(term4277192, term4277192.getClass(), "lastPlaceId", -949983756);
        setField(term4277192, term4277192.getClass(), "lastPlaceName", "MtKQwrqkvh");
        setIntField(term4277192, term4277192.getClass(), "lastAllNetId", -1790102208);
        setIntField(term4277192, term4277192.getClass(), "lastRegionId", 225583852);
        setField(term4277192, term4277192.getClass(), "lastRegionName", "uHxbjcSwQq");
        setField(term4277192, term4277192.getClass(), "lastClientId", "qktmPpuObb");
        setField(term4277192, term4277192.getClass(), "lastCountryCode", "XIHSSZlaIG");
        setIntField(term4277192, term4277192.getClass(), "lastSelectEMoney", -1467260036);
        setIntField(term4277192, term4277192.getClass(), "lastSelectTicket", -121743186);
        setIntField(term4277192, term4277192.getClass(), "lastSelectCourse", 920366158);
        setIntField(term4277192, term4277192.getClass(), "lastCountCourse", 614062723);
        setField(term4277192, term4277192.getClass(), "firstGameId", "qbZdbVoZnb");
        setField(term4277192, term4277192.getClass(), "firstRomVersion", "evLDzZnROh");
        setField(term4277192, term4277192.getClass(), "firstDataVersion", "RpnPmEsIIL");
        setField(term4277192, term4277192.getClass(), "firstPlayDate", "THbmoulUSu");
        setField(term4277192, term4277192.getClass(), "compatibleCmVersion", "TwlwtNAseQ");
        setField(term4277192, term4277192.getClass(), "dailyBonusDate", "lswSibWJRl");
        setField(term4277192, term4277192.getClass(), "dailyCourseBonusDate", "aQMRRzLFzN");
        setField(term4277192, term4277192.getClass(), "lastPairLoginDate", "PagENVYiQf");
        setField(term4277192, term4277192.getClass(), "lastTrialPlayDate", "USJRdnRjrb");
        setIntField(term4277192, term4277192.getClass(), "playVsCount", 1719716865);
        setIntField(term4277192, term4277192.getClass(), "playSyncCount", 381357682);
        setIntField(term4277192, term4277192.getClass(), "winCount", -1281544643);
        setIntField(term4277192, term4277192.getClass(), "helpCount", -781546643);
        setIntField(term4277192, term4277192.getClass(), "comboCount", -467719301);
        setLongField(term4277192, term4277192.getClass(), "totalDeluxscore", 172505703472516607L);
        setLongField(term4277192, term4277192.getClass(), "totalBasicDeluxscore", -8115908217544636405L);
        setLongField(term4277192, term4277192.getClass(), "totalAdvancedDeluxscore", 5822732748902068419L);
        setLongField(term4277192, term4277192.getClass(), "totalExpertDeluxscore", 5877643113835194480L);
        setLongField(term4277192, term4277192.getClass(), "totalMasterDeluxscore", -9025918888360862319L);
        setLongField(term4277192, term4277192.getClass(), "totalReMasterDeluxscore", 2569695609314976185L);
        setIntField(term4277192, term4277192.getClass(), "totalSync", 1136498849);
        setIntField(term4277192, term4277192.getClass(), "totalBasicSync", -2047280396);
        setIntField(term4277192, term4277192.getClass(), "totalAdvancedSync", 1913233564);
        setIntField(term4277192, term4277192.getClass(), "totalExpertSync", 189938320);
        setIntField(term4277192, term4277192.getClass(), "totalMasterSync", -912666839);
        setIntField(term4277192, term4277192.getClass(), "totalReMasterSync", -1798054511);
        setLongField(term4277192, term4277192.getClass(), "totalAchievement", -2538133195108826371L);
        setLongField(term4277192, term4277192.getClass(), "totalBasicAchievement", 5558165539895465335L);
        setLongField(term4277192, term4277192.getClass(), "totalAdvancedAchievement", -3781038122918622603L);
        setLongField(term4277192, term4277192.getClass(), "totalExpertAchievement", 800979057316237119L);
        setLongField(term4277192, term4277192.getClass(), "totalMasterAchievement", 6681150173431546789L);
        setLongField(term4277192, term4277192.getClass(), "totalReMasterAchievement", -8653421400992221011L);
        setLongField(term4277192, term4277192.getClass(), "playerOldRating", -3429577724137348581L);
        setLongField(term4277192, term4277192.getClass(), "playerNewRating", 4709929370450315691L);
        setIntField(term4277192, term4277192.getClass(), "banState", -510431478);
        setLongField(term4277192, term4277192.getClass(), "dateTime", -3103245228780736210L);
        term4277549 = new Integer(984347666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4277549;
        callMethod(klass, "setPartnerId", argTypes, term4277192, args);
    }

};


