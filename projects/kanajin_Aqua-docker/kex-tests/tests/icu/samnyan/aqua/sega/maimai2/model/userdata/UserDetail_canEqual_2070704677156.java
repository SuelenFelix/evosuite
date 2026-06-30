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

public class UserDetail_canEqual_2070704677156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283913;
     Object term284274;

    public UserDetail_canEqual_2070704677156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283917 = new Long(-5967061076297699457L);
        Integer term283980 = new Integer(2132845865);
        Integer term283982 = new Integer(1676055742);
        Integer term283984 = new Integer(-963623987);
        Integer term283986 = new Integer(1184368914);
        Integer term283988 = new Integer(138525382);
        Integer term283990 = new Integer(-1100331351);
        Integer term283992 = new Integer(1506966329);
        Integer term283994 = new Integer(38318819);
        ArrayList term283978 = new ArrayList();
        ((ArrayList) term283978).add(term283980);
        ((ArrayList) term283978).add(term283982);
        ((ArrayList) term283978).add(term283984);
        ((ArrayList) term283978).add(term283986);
        ((ArrayList) term283978).add(term283988);
        ((ArrayList) term283978).add(term283990);
        ((ArrayList) term283978).add(term283992);
        ((ArrayList) term283978).add(term283994);
        Integer term284000 = new Integer(277037422);
        Integer term284002 = new Integer(-513227903);
        Integer term284004 = new Integer(-1834509557);
        ArrayList term283998 = new ArrayList();
        ((ArrayList) term283998).add(term284000);
        ((ArrayList) term283998).add(term284002);
        ((ArrayList) term283998).add(term284004);
        term283913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term283915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283913, term283913.getClass(), "id", -5324073230021944005L);
        setLongField(term283915, term283915.getClass(), "id", -6761592027578213447L);
        setField(term283915, term283915.getClass(), "extId", term283917);
        setField(term283915, term283915.getClass(), "luid", "ZUOjNutasW");
        setIntField(term283932, term283932.getClass(), "year", 2027);
        setShortField(term283932, term283932.getClass(), "month", (short) 7);
        setShortField(term283932, term283932.getClass(), "day", (short) 1);
        setField(term283931, term283931.getClass(), "date", term283932);
        setByteField(term283936, term283936.getClass(), "hour", (byte) 4);
        setByteField(term283936, term283936.getClass(), "minute", (byte) 33);
        setByteField(term283936, term283936.getClass(), "second", (byte) 13);
        setIntField(term283936, term283936.getClass(), "nano", 724808977);
        setField(term283931, term283931.getClass(), "time", term283936);
        setField(term283915, term283915.getClass(), "registerTime", term283931);
        setIntField(term283942, term283942.getClass(), "year", 2025);
        setShortField(term283942, term283942.getClass(), "month", (short) 9);
        setShortField(term283942, term283942.getClass(), "day", (short) 18);
        setField(term283941, term283941.getClass(), "date", term283942);
        setByteField(term283946, term283946.getClass(), "hour", (byte) 19);
        setByteField(term283946, term283946.getClass(), "minute", (byte) 22);
        setByteField(term283946, term283946.getClass(), "second", (byte) 53);
        setIntField(term283946, term283946.getClass(), "nano", 683362814);
        setField(term283941, term283941.getClass(), "time", term283946);
        setField(term283915, term283915.getClass(), "accessTime", term283941);
        setField(term283913, term283913.getClass(), "card", term283915);
        setField(term283913, term283913.getClass(), "userName", "iLnavpwPVW");
        setIntField(term283913, term283913.getClass(), "isNetMember", -1544521733);
        setIntField(term283913, term283913.getClass(), "iconId", -176176990);
        setIntField(term283913, term283913.getClass(), "plateId", -1107491810);
        setIntField(term283913, term283913.getClass(), "titleId", 369101566);
        setIntField(term283913, term283913.getClass(), "partnerId", -1122407208);
        setIntField(term283913, term283913.getClass(), "frameId", -1158696779);
        setIntField(term283913, term283913.getClass(), "selectMapId", 1628040716);
        setIntField(term283913, term283913.getClass(), "totalAwake", 630381282);
        setIntField(term283913, term283913.getClass(), "gradeRating", -467147197);
        setIntField(term283913, term283913.getClass(), "musicRating", 1528864276);
        setIntField(term283913, term283913.getClass(), "playerRating", 1293672054);
        setIntField(term283913, term283913.getClass(), "highestRating", -126829114);
        setIntField(term283913, term283913.getClass(), "gradeRank", 1364504787);
        setIntField(term283913, term283913.getClass(), "classRank", 193942993);
        setIntField(term283913, term283913.getClass(), "courseRank", -1448731227);
        setField(term283913, term283913.getClass(), "charaSlot", term283978);
        setField(term283913, term283913.getClass(), "charaLockSlot", term283998);
        setLongField(term283913, term283913.getClass(), "contentBit", 8504225803473974632L);
        setIntField(term283913, term283913.getClass(), "playCount", 427298296);
        setField(term283913, term283913.getClass(), "eventWatchedDate", "uzOLHHrsVY");
        setField(term283913, term283913.getClass(), "lastGameId", "AaWWwZcnLu");
        setField(term283913, term283913.getClass(), "lastRomVersion", "ZVIGMbBKbL");
        setField(term283913, term283913.getClass(), "lastDataVersion", "gVMFMkMhbp");
        setField(term283913, term283913.getClass(), "lastLoginDate", "UHsHREPriw");
        setField(term283913, term283913.getClass(), "lastPlayDate", "DIwfYhyVhT");
        setIntField(term283913, term283913.getClass(), "lastPlayCredit", 1136711102);
        setIntField(term283913, term283913.getClass(), "lastPlayMode", -1269993796);
        setIntField(term283913, term283913.getClass(), "lastPlaceId", -288156643);
        setField(term283913, term283913.getClass(), "lastPlaceName", "jtunRPVOvC");
        setIntField(term283913, term283913.getClass(), "lastAllNetId", 1906783253);
        setIntField(term283913, term283913.getClass(), "lastRegionId", 1204018336);
        setField(term283913, term283913.getClass(), "lastRegionName", "MkzyPfWvZB");
        setField(term283913, term283913.getClass(), "lastClientId", "BTiJXpfldl");
        setField(term283913, term283913.getClass(), "lastCountryCode", "WayKgiTEQo");
        setIntField(term283913, term283913.getClass(), "lastSelectEMoney", -954637871);
        setIntField(term283913, term283913.getClass(), "lastSelectTicket", 1135537153);
        setIntField(term283913, term283913.getClass(), "lastSelectCourse", 762525337);
        setIntField(term283913, term283913.getClass(), "lastCountCourse", 1446372730);
        setField(term283913, term283913.getClass(), "firstGameId", "SQWqwRyawD");
        setField(term283913, term283913.getClass(), "firstRomVersion", "oqZiibHuxe");
        setField(term283913, term283913.getClass(), "firstDataVersion", "OQkrchliwX");
        setField(term283913, term283913.getClass(), "firstPlayDate", "WTGgxPgcFt");
        setField(term283913, term283913.getClass(), "compatibleCmVersion", "AHhfsLjJbn");
        setField(term283913, term283913.getClass(), "dailyBonusDate", "CcDBslvvvR");
        setField(term283913, term283913.getClass(), "dailyCourseBonusDate", "fKupCAFXkv");
        setField(term283913, term283913.getClass(), "lastPairLoginDate", "vnufBQQZvH");
        setField(term283913, term283913.getClass(), "lastTrialPlayDate", "JvtHeDpYNv");
        setIntField(term283913, term283913.getClass(), "playVsCount", -1728367118);
        setIntField(term283913, term283913.getClass(), "playSyncCount", -904895307);
        setIntField(term283913, term283913.getClass(), "winCount", -1874907467);
        setIntField(term283913, term283913.getClass(), "helpCount", -1129128196);
        setIntField(term283913, term283913.getClass(), "comboCount", -1470909739);
        setLongField(term283913, term283913.getClass(), "totalDeluxscore", 3527305262960233420L);
        setLongField(term283913, term283913.getClass(), "totalBasicDeluxscore", -5512549347212162731L);
        setLongField(term283913, term283913.getClass(), "totalAdvancedDeluxscore", -7830210952668061187L);
        setLongField(term283913, term283913.getClass(), "totalExpertDeluxscore", -758098018342252289L);
        setLongField(term283913, term283913.getClass(), "totalMasterDeluxscore", 1591194837657362385L);
        setLongField(term283913, term283913.getClass(), "totalReMasterDeluxscore", 6059922663321305799L);
        setIntField(term283913, term283913.getClass(), "totalSync", -1412907836);
        setIntField(term283913, term283913.getClass(), "totalBasicSync", -199903643);
        setIntField(term283913, term283913.getClass(), "totalAdvancedSync", 1793350918);
        setIntField(term283913, term283913.getClass(), "totalExpertSync", 364334911);
        setIntField(term283913, term283913.getClass(), "totalMasterSync", -238168572);
        setIntField(term283913, term283913.getClass(), "totalReMasterSync", -868047935);
        setLongField(term283913, term283913.getClass(), "totalAchievement", 8279158889094885898L);
        setLongField(term283913, term283913.getClass(), "totalBasicAchievement", 2432741719277316542L);
        setLongField(term283913, term283913.getClass(), "totalAdvancedAchievement", -5380569180497102187L);
        setLongField(term283913, term283913.getClass(), "totalExpertAchievement", -5461078358912443357L);
        setLongField(term283913, term283913.getClass(), "totalMasterAchievement", -5228826526232226650L);
        setLongField(term283913, term283913.getClass(), "totalReMasterAchievement", -2154764693839161815L);
        setLongField(term283913, term283913.getClass(), "playerOldRating", -8269564708795402463L);
        setLongField(term283913, term283913.getClass(), "playerNewRating", 7102977751932828924L);
        setIntField(term283913, term283913.getClass(), "banState", -1246506132);
        setLongField(term283913, term283913.getClass(), "dateTime", -6147534033119143621L);
        term284274 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term284274;
        callMethod(klass, "canEqual", argTypes, term283913, args);
    }

};


