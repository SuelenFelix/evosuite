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

public class UserMap_isLock_1590126425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576094;

    public UserMap_isLock_1590126425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term576100 = new Long(-2571841019708046378L);
        Integer term576163 = new Integer(-600241671);
        Integer term576165 = new Integer(-1229610550);
        Integer term576167 = new Integer(493486357);
        ArrayList term576161 = new ArrayList();
        ((ArrayList) term576161).add(term576163);
        ((ArrayList) term576161).add(term576165);
        ((ArrayList) term576161).add(term576167);
        Integer term576173 = new Integer(329514667);
        Integer term576175 = new Integer(1579294785);
        Integer term576177 = new Integer(41910159);
        Integer term576179 = new Integer(2144178531);
        Integer term576181 = new Integer(-1853902014);
        Integer term576183 = new Integer(1694299799);
        Integer term576185 = new Integer(-1172188590);
        Integer term576187 = new Integer(1811271159);
        Integer term576189 = new Integer(534169620);
        ArrayList term576171 = new ArrayList();
        ((ArrayList) term576171).add(term576173);
        ((ArrayList) term576171).add(term576175);
        ((ArrayList) term576171).add(term576177);
        ((ArrayList) term576171).add(term576179);
        ((ArrayList) term576171).add(term576181);
        ((ArrayList) term576171).add(term576183);
        ((ArrayList) term576171).add(term576185);
        ((ArrayList) term576171).add(term576187);
        ((ArrayList) term576171).add(term576189);
        term576094 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term576096 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term576098 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term576114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term576115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576119 = newInstance(Class.forName("java.time.LocalTime"));
        Object term576124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term576125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576129 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term576094, term576094.getClass(), "id", 6185797750719825498L);
        setLongField(term576096, term576096.getClass(), "id", -5998745924716690462L);
        setLongField(term576098, term576098.getClass(), "id", 8405467702193861632L);
        setField(term576098, term576098.getClass(), "extId", term576100);
        setField(term576098, term576098.getClass(), "luid", "cfRRQxoitS");
        setIntField(term576115, term576115.getClass(), "year", 2020);
        setShortField(term576115, term576115.getClass(), "month", (short) 11);
        setShortField(term576115, term576115.getClass(), "day", (short) 22);
        setField(term576114, term576114.getClass(), "date", term576115);
        setByteField(term576119, term576119.getClass(), "hour", (byte) 7);
        setByteField(term576119, term576119.getClass(), "minute", (byte) 27);
        setByteField(term576119, term576119.getClass(), "second", (byte) 8);
        setIntField(term576119, term576119.getClass(), "nano", 714257990);
        setField(term576114, term576114.getClass(), "time", term576119);
        setField(term576098, term576098.getClass(), "registerTime", term576114);
        setIntField(term576125, term576125.getClass(), "year", 2017);
        setShortField(term576125, term576125.getClass(), "month", (short) 11);
        setShortField(term576125, term576125.getClass(), "day", (short) 23);
        setField(term576124, term576124.getClass(), "date", term576125);
        setByteField(term576129, term576129.getClass(), "hour", (byte) 21);
        setByteField(term576129, term576129.getClass(), "minute", (byte) 0);
        setByteField(term576129, term576129.getClass(), "second", (byte) 53);
        setIntField(term576129, term576129.getClass(), "nano", 301726701);
        setField(term576124, term576124.getClass(), "time", term576129);
        setField(term576098, term576098.getClass(), "accessTime", term576124);
        setField(term576096, term576096.getClass(), "card", term576098);
        setField(term576096, term576096.getClass(), "userName", "mgyJhbHucU");
        setIntField(term576096, term576096.getClass(), "isNetMember", -1193275127);
        setIntField(term576096, term576096.getClass(), "iconId", -95756697);
        setIntField(term576096, term576096.getClass(), "plateId", 308539405);
        setIntField(term576096, term576096.getClass(), "titleId", 1897165830);
        setIntField(term576096, term576096.getClass(), "partnerId", -1337117587);
        setIntField(term576096, term576096.getClass(), "frameId", 1701520317);
        setIntField(term576096, term576096.getClass(), "selectMapId", 60202062);
        setIntField(term576096, term576096.getClass(), "totalAwake", -1323461699);
        setIntField(term576096, term576096.getClass(), "gradeRating", -191838912);
        setIntField(term576096, term576096.getClass(), "musicRating", 1548705495);
        setIntField(term576096, term576096.getClass(), "playerRating", -1662340594);
        setIntField(term576096, term576096.getClass(), "highestRating", -1739584846);
        setIntField(term576096, term576096.getClass(), "gradeRank", -384394677);
        setIntField(term576096, term576096.getClass(), "classRank", -23042836);
        setIntField(term576096, term576096.getClass(), "courseRank", -414536275);
        setField(term576096, term576096.getClass(), "charaSlot", term576161);
        setField(term576096, term576096.getClass(), "charaLockSlot", term576171);
        setLongField(term576096, term576096.getClass(), "contentBit", -808068614617545483L);
        setIntField(term576096, term576096.getClass(), "playCount", 1600445567);
        setField(term576096, term576096.getClass(), "eventWatchedDate", "zYfEIbjeKu");
        setField(term576096, term576096.getClass(), "lastGameId", "VSDWENKakG");
        setField(term576096, term576096.getClass(), "lastRomVersion", "xbnryvIWLR");
        setField(term576096, term576096.getClass(), "lastDataVersion", "jRusMkoQiy");
        setField(term576096, term576096.getClass(), "lastLoginDate", "IMcORGsrxV");
        setField(term576096, term576096.getClass(), "lastPlayDate", "kcqtzGMgUB");
        setIntField(term576096, term576096.getClass(), "lastPlayCredit", -203499388);
        setIntField(term576096, term576096.getClass(), "lastPlayMode", -1798951142);
        setIntField(term576096, term576096.getClass(), "lastPlaceId", 2126171076);
        setField(term576096, term576096.getClass(), "lastPlaceName", "MvJxDDfWGK");
        setIntField(term576096, term576096.getClass(), "lastAllNetId", -1715868080);
        setIntField(term576096, term576096.getClass(), "lastRegionId", -101457282);
        setField(term576096, term576096.getClass(), "lastRegionName", "yzTdZkuLNP");
        setField(term576096, term576096.getClass(), "lastClientId", "atTJfmQzkr");
        setField(term576096, term576096.getClass(), "lastCountryCode", "gLNTTSVhob");
        setIntField(term576096, term576096.getClass(), "lastSelectEMoney", -634321203);
        setIntField(term576096, term576096.getClass(), "lastSelectTicket", -1785542722);
        setIntField(term576096, term576096.getClass(), "lastSelectCourse", 2123441133);
        setIntField(term576096, term576096.getClass(), "lastCountCourse", 2064337698);
        setField(term576096, term576096.getClass(), "firstGameId", "KLyGGXmYZh");
        setField(term576096, term576096.getClass(), "firstRomVersion", "sytrHVTQEI");
        setField(term576096, term576096.getClass(), "firstDataVersion", "nltxEDDLVH");
        setField(term576096, term576096.getClass(), "firstPlayDate", "KCUvXJqJll");
        setField(term576096, term576096.getClass(), "compatibleCmVersion", "wLDOEJhzwJ");
        setField(term576096, term576096.getClass(), "dailyBonusDate", "aHcgDPrlqI");
        setField(term576096, term576096.getClass(), "dailyCourseBonusDate", "lDKZMIbuCj");
        setField(term576096, term576096.getClass(), "lastPairLoginDate", "qHxWIgyNwU");
        setField(term576096, term576096.getClass(), "lastTrialPlayDate", "UeSmUWREYK");
        setIntField(term576096, term576096.getClass(), "playVsCount", 819893351);
        setIntField(term576096, term576096.getClass(), "playSyncCount", 645689261);
        setIntField(term576096, term576096.getClass(), "winCount", 179685623);
        setIntField(term576096, term576096.getClass(), "helpCount", -2076786785);
        setIntField(term576096, term576096.getClass(), "comboCount", 768521245);
        setLongField(term576096, term576096.getClass(), "totalDeluxscore", -6755928923656597385L);
        setLongField(term576096, term576096.getClass(), "totalBasicDeluxscore", 8600185973716742658L);
        setLongField(term576096, term576096.getClass(), "totalAdvancedDeluxscore", 7318574340800072134L);
        setLongField(term576096, term576096.getClass(), "totalExpertDeluxscore", -2011042730960501687L);
        setLongField(term576096, term576096.getClass(), "totalMasterDeluxscore", 1487785513408339775L);
        setLongField(term576096, term576096.getClass(), "totalReMasterDeluxscore", -632227856572375508L);
        setIntField(term576096, term576096.getClass(), "totalSync", -1280892582);
        setIntField(term576096, term576096.getClass(), "totalBasicSync", 1379453553);
        setIntField(term576096, term576096.getClass(), "totalAdvancedSync", 375725214);
        setIntField(term576096, term576096.getClass(), "totalExpertSync", -621398753);
        setIntField(term576096, term576096.getClass(), "totalMasterSync", -535984994);
        setIntField(term576096, term576096.getClass(), "totalReMasterSync", 100172930);
        setLongField(term576096, term576096.getClass(), "totalAchievement", 4082217461532919231L);
        setLongField(term576096, term576096.getClass(), "totalBasicAchievement", 1950506517263307539L);
        setLongField(term576096, term576096.getClass(), "totalAdvancedAchievement", -2804599718627881932L);
        setLongField(term576096, term576096.getClass(), "totalExpertAchievement", -3476729761093121645L);
        setLongField(term576096, term576096.getClass(), "totalMasterAchievement", 8259268380797174879L);
        setLongField(term576096, term576096.getClass(), "totalReMasterAchievement", 2213789470747401165L);
        setLongField(term576096, term576096.getClass(), "playerOldRating", 3578329207262082010L);
        setLongField(term576096, term576096.getClass(), "playerNewRating", -8824763031140623852L);
        setIntField(term576096, term576096.getClass(), "banState", -1396497734);
        setLongField(term576096, term576096.getClass(), "dateTime", 1845275453201912156L);
        setField(term576094, term576094.getClass(), "user", term576096);
        setIntField(term576094, term576094.getClass(), "mapId", -1015290117);
        setIntField(term576094, term576094.getClass(), "distance", -1884547345);
        setBooleanField(term576094, term576094.getClass(), "isLock", true);
        setBooleanField(term576094, term576094.getClass(), "isClear", false);
        setBooleanField(term576094, term576094.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLock", argTypes, term576094, args);
    }

};


