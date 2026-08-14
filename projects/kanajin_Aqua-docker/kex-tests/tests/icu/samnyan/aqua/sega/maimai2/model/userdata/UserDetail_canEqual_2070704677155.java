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

public class UserDetail_canEqual_2070704677155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283858;
     Object term284219;

    public UserDetail_canEqual_2070704677155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283862 = new Long(-5967061076297699457L);
        Integer term283925 = new Integer(2132845865);
        Integer term283927 = new Integer(1676055742);
        Integer term283929 = new Integer(-963623987);
        Integer term283931 = new Integer(1184368914);
        Integer term283933 = new Integer(138525382);
        Integer term283935 = new Integer(-1100331351);
        Integer term283937 = new Integer(1506966329);
        Integer term283939 = new Integer(38318819);
        ArrayList term283923 = new ArrayList();
        ((ArrayList) term283923).add(term283925);
        ((ArrayList) term283923).add(term283927);
        ((ArrayList) term283923).add(term283929);
        ((ArrayList) term283923).add(term283931);
        ((ArrayList) term283923).add(term283933);
        ((ArrayList) term283923).add(term283935);
        ((ArrayList) term283923).add(term283937);
        ((ArrayList) term283923).add(term283939);
        Integer term283945 = new Integer(277037422);
        Integer term283947 = new Integer(-513227903);
        Integer term283949 = new Integer(-1834509557);
        ArrayList term283943 = new ArrayList();
        ((ArrayList) term283943).add(term283945);
        ((ArrayList) term283943).add(term283947);
        ((ArrayList) term283943).add(term283949);
        term283858 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term283860 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283891 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283858, term283858.getClass(), "id", -5324073230021944005L);
        setLongField(term283860, term283860.getClass(), "id", -6761592027578213447L);
        setField(term283860, term283860.getClass(), "extId", term283862);
        setField(term283860, term283860.getClass(), "luid", "ZUOjNutasW");
        setIntField(term283877, term283877.getClass(), "year", 2027);
        setShortField(term283877, term283877.getClass(), "month", (short) 7);
        setShortField(term283877, term283877.getClass(), "day", (short) 1);
        setField(term283876, term283876.getClass(), "date", term283877);
        setByteField(term283881, term283881.getClass(), "hour", (byte) 4);
        setByteField(term283881, term283881.getClass(), "minute", (byte) 33);
        setByteField(term283881, term283881.getClass(), "second", (byte) 13);
        setIntField(term283881, term283881.getClass(), "nano", 724808977);
        setField(term283876, term283876.getClass(), "time", term283881);
        setField(term283860, term283860.getClass(), "registerTime", term283876);
        setIntField(term283887, term283887.getClass(), "year", 2025);
        setShortField(term283887, term283887.getClass(), "month", (short) 9);
        setShortField(term283887, term283887.getClass(), "day", (short) 18);
        setField(term283886, term283886.getClass(), "date", term283887);
        setByteField(term283891, term283891.getClass(), "hour", (byte) 19);
        setByteField(term283891, term283891.getClass(), "minute", (byte) 22);
        setByteField(term283891, term283891.getClass(), "second", (byte) 53);
        setIntField(term283891, term283891.getClass(), "nano", 683362814);
        setField(term283886, term283886.getClass(), "time", term283891);
        setField(term283860, term283860.getClass(), "accessTime", term283886);
        setField(term283858, term283858.getClass(), "card", term283860);
        setField(term283858, term283858.getClass(), "userName", "iLnavpwPVW");
        setIntField(term283858, term283858.getClass(), "isNetMember", -1544521733);
        setIntField(term283858, term283858.getClass(), "iconId", -176176990);
        setIntField(term283858, term283858.getClass(), "plateId", -1107491810);
        setIntField(term283858, term283858.getClass(), "titleId", 369101566);
        setIntField(term283858, term283858.getClass(), "partnerId", -1122407208);
        setIntField(term283858, term283858.getClass(), "frameId", -1158696779);
        setIntField(term283858, term283858.getClass(), "selectMapId", 1628040716);
        setIntField(term283858, term283858.getClass(), "totalAwake", 630381282);
        setIntField(term283858, term283858.getClass(), "gradeRating", -467147197);
        setIntField(term283858, term283858.getClass(), "musicRating", 1528864276);
        setIntField(term283858, term283858.getClass(), "playerRating", 1293672054);
        setIntField(term283858, term283858.getClass(), "highestRating", -126829114);
        setIntField(term283858, term283858.getClass(), "gradeRank", 1364504787);
        setIntField(term283858, term283858.getClass(), "classRank", 193942993);
        setIntField(term283858, term283858.getClass(), "courseRank", -1448731227);
        setField(term283858, term283858.getClass(), "charaSlot", term283923);
        setField(term283858, term283858.getClass(), "charaLockSlot", term283943);
        setLongField(term283858, term283858.getClass(), "contentBit", 8504225803473974632L);
        setIntField(term283858, term283858.getClass(), "playCount", 427298296);
        setField(term283858, term283858.getClass(), "eventWatchedDate", "uzOLHHrsVY");
        setField(term283858, term283858.getClass(), "lastGameId", "AaWWwZcnLu");
        setField(term283858, term283858.getClass(), "lastRomVersion", "ZVIGMbBKbL");
        setField(term283858, term283858.getClass(), "lastDataVersion", "gVMFMkMhbp");
        setField(term283858, term283858.getClass(), "lastLoginDate", "UHsHREPriw");
        setField(term283858, term283858.getClass(), "lastPlayDate", "DIwfYhyVhT");
        setIntField(term283858, term283858.getClass(), "lastPlayCredit", 1136711102);
        setIntField(term283858, term283858.getClass(), "lastPlayMode", -1269993796);
        setIntField(term283858, term283858.getClass(), "lastPlaceId", -288156643);
        setField(term283858, term283858.getClass(), "lastPlaceName", "jtunRPVOvC");
        setIntField(term283858, term283858.getClass(), "lastAllNetId", 1906783253);
        setIntField(term283858, term283858.getClass(), "lastRegionId", 1204018336);
        setField(term283858, term283858.getClass(), "lastRegionName", "MkzyPfWvZB");
        setField(term283858, term283858.getClass(), "lastClientId", "BTiJXpfldl");
        setField(term283858, term283858.getClass(), "lastCountryCode", "WayKgiTEQo");
        setIntField(term283858, term283858.getClass(), "lastSelectEMoney", -954637871);
        setIntField(term283858, term283858.getClass(), "lastSelectTicket", 1135537153);
        setIntField(term283858, term283858.getClass(), "lastSelectCourse", 762525337);
        setIntField(term283858, term283858.getClass(), "lastCountCourse", 1446372730);
        setField(term283858, term283858.getClass(), "firstGameId", "SQWqwRyawD");
        setField(term283858, term283858.getClass(), "firstRomVersion", "oqZiibHuxe");
        setField(term283858, term283858.getClass(), "firstDataVersion", "OQkrchliwX");
        setField(term283858, term283858.getClass(), "firstPlayDate", "WTGgxPgcFt");
        setField(term283858, term283858.getClass(), "compatibleCmVersion", "AHhfsLjJbn");
        setField(term283858, term283858.getClass(), "dailyBonusDate", "CcDBslvvvR");
        setField(term283858, term283858.getClass(), "dailyCourseBonusDate", "fKupCAFXkv");
        setField(term283858, term283858.getClass(), "lastPairLoginDate", "vnufBQQZvH");
        setField(term283858, term283858.getClass(), "lastTrialPlayDate", "JvtHeDpYNv");
        setIntField(term283858, term283858.getClass(), "playVsCount", -1728367118);
        setIntField(term283858, term283858.getClass(), "playSyncCount", -904895307);
        setIntField(term283858, term283858.getClass(), "winCount", -1874907467);
        setIntField(term283858, term283858.getClass(), "helpCount", -1129128196);
        setIntField(term283858, term283858.getClass(), "comboCount", -1470909739);
        setLongField(term283858, term283858.getClass(), "totalDeluxscore", 3527305262960233420L);
        setLongField(term283858, term283858.getClass(), "totalBasicDeluxscore", -5512549347212162731L);
        setLongField(term283858, term283858.getClass(), "totalAdvancedDeluxscore", -7830210952668061187L);
        setLongField(term283858, term283858.getClass(), "totalExpertDeluxscore", -758098018342252289L);
        setLongField(term283858, term283858.getClass(), "totalMasterDeluxscore", 1591194837657362385L);
        setLongField(term283858, term283858.getClass(), "totalReMasterDeluxscore", 6059922663321305799L);
        setIntField(term283858, term283858.getClass(), "totalSync", -1412907836);
        setIntField(term283858, term283858.getClass(), "totalBasicSync", -199903643);
        setIntField(term283858, term283858.getClass(), "totalAdvancedSync", 1793350918);
        setIntField(term283858, term283858.getClass(), "totalExpertSync", 364334911);
        setIntField(term283858, term283858.getClass(), "totalMasterSync", -238168572);
        setIntField(term283858, term283858.getClass(), "totalReMasterSync", -868047935);
        setLongField(term283858, term283858.getClass(), "totalAchievement", 8279158889094885898L);
        setLongField(term283858, term283858.getClass(), "totalBasicAchievement", 2432741719277316542L);
        setLongField(term283858, term283858.getClass(), "totalAdvancedAchievement", -5380569180497102187L);
        setLongField(term283858, term283858.getClass(), "totalExpertAchievement", -5461078358912443357L);
        setLongField(term283858, term283858.getClass(), "totalMasterAchievement", -5228826526232226650L);
        setLongField(term283858, term283858.getClass(), "totalReMasterAchievement", -2154764693839161815L);
        setLongField(term283858, term283858.getClass(), "playerOldRating", -8269564708795402463L);
        setLongField(term283858, term283858.getClass(), "playerNewRating", 7102977751932828924L);
        setIntField(term283858, term283858.getClass(), "banState", -1246506132);
        setLongField(term283858, term283858.getClass(), "dateTime", -6147534033119143621L);
        term284219 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term284219;
        callMethod(klass, "canEqual", argTypes, term283858, args);
    }

};


