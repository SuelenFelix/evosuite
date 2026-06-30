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

public class UserMap_setId_20422780208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577816;
     Object term578198;

    public UserMap_setId_20422780208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term577822 = new Long(5592372218942533021L);
        Integer term577885 = new Integer(-495461794);
        Integer term577887 = new Integer(1179148135);
        Integer term577889 = new Integer(1856832248);
        Integer term577891 = new Integer(1112040940);
        Integer term577893 = new Integer(-1289327826);
        Integer term577895 = new Integer(-1510240264);
        Integer term577897 = new Integer(-1206929666);
        Integer term577899 = new Integer(-673087697);
        Integer term577901 = new Integer(821580864);
        ArrayList term577883 = new ArrayList();
        ((ArrayList) term577883).add(term577885);
        ((ArrayList) term577883).add(term577887);
        ((ArrayList) term577883).add(term577889);
        ((ArrayList) term577883).add(term577891);
        ((ArrayList) term577883).add(term577893);
        ((ArrayList) term577883).add(term577895);
        ((ArrayList) term577883).add(term577897);
        ((ArrayList) term577883).add(term577899);
        ((ArrayList) term577883).add(term577901);
        Integer term577907 = new Integer(210061350);
        Integer term577909 = new Integer(-1315216208);
        Integer term577911 = new Integer(-543739494);
        Integer term577913 = new Integer(-1959832217);
        Integer term577915 = new Integer(61867422);
        Integer term577917 = new Integer(536970938);
        Integer term577919 = new Integer(1370836789);
        Integer term577921 = new Integer(-2117537075);
        Integer term577923 = new Integer(-707090176);
        ArrayList term577905 = new ArrayList();
        ((ArrayList) term577905).add(term577907);
        ((ArrayList) term577905).add(term577909);
        ((ArrayList) term577905).add(term577911);
        ((ArrayList) term577905).add(term577913);
        ((ArrayList) term577905).add(term577915);
        ((ArrayList) term577905).add(term577917);
        ((ArrayList) term577905).add(term577919);
        ((ArrayList) term577905).add(term577921);
        ((ArrayList) term577905).add(term577923);
        term577816 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term577818 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term577820 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term577836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term577837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term577841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term577846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term577847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term577851 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term577816, term577816.getClass(), "id", -7740557511599272472L);
        setLongField(term577818, term577818.getClass(), "id", -5527461273652535620L);
        setLongField(term577820, term577820.getClass(), "id", -620275397349491673L);
        setField(term577820, term577820.getClass(), "extId", term577822);
        setField(term577820, term577820.getClass(), "luid", "xtONWhIdYZ");
        setIntField(term577837, term577837.getClass(), "year", 2014);
        setShortField(term577837, term577837.getClass(), "month", (short) 8);
        setShortField(term577837, term577837.getClass(), "day", (short) 11);
        setField(term577836, term577836.getClass(), "date", term577837);
        setByteField(term577841, term577841.getClass(), "hour", (byte) 8);
        setByteField(term577841, term577841.getClass(), "minute", (byte) 38);
        setByteField(term577841, term577841.getClass(), "second", (byte) 55);
        setIntField(term577841, term577841.getClass(), "nano", 733757429);
        setField(term577836, term577836.getClass(), "time", term577841);
        setField(term577820, term577820.getClass(), "registerTime", term577836);
        setIntField(term577847, term577847.getClass(), "year", 2029);
        setShortField(term577847, term577847.getClass(), "month", (short) 3);
        setShortField(term577847, term577847.getClass(), "day", (short) 7);
        setField(term577846, term577846.getClass(), "date", term577847);
        setByteField(term577851, term577851.getClass(), "hour", (byte) 22);
        setByteField(term577851, term577851.getClass(), "minute", (byte) 14);
        setByteField(term577851, term577851.getClass(), "second", (byte) 54);
        setIntField(term577851, term577851.getClass(), "nano", 976620887);
        setField(term577846, term577846.getClass(), "time", term577851);
        setField(term577820, term577820.getClass(), "accessTime", term577846);
        setField(term577818, term577818.getClass(), "card", term577820);
        setField(term577818, term577818.getClass(), "userName", "qcJviMJyih");
        setIntField(term577818, term577818.getClass(), "isNetMember", 1494707753);
        setIntField(term577818, term577818.getClass(), "iconId", 1008896192);
        setIntField(term577818, term577818.getClass(), "plateId", -1681439779);
        setIntField(term577818, term577818.getClass(), "titleId", 1529797594);
        setIntField(term577818, term577818.getClass(), "partnerId", 1498664634);
        setIntField(term577818, term577818.getClass(), "frameId", 1979673404);
        setIntField(term577818, term577818.getClass(), "selectMapId", 1675382771);
        setIntField(term577818, term577818.getClass(), "totalAwake", 1455954597);
        setIntField(term577818, term577818.getClass(), "gradeRating", 114092198);
        setIntField(term577818, term577818.getClass(), "musicRating", 1182557216);
        setIntField(term577818, term577818.getClass(), "playerRating", -2062133856);
        setIntField(term577818, term577818.getClass(), "highestRating", 1605569526);
        setIntField(term577818, term577818.getClass(), "gradeRank", 2069586629);
        setIntField(term577818, term577818.getClass(), "classRank", -1990323984);
        setIntField(term577818, term577818.getClass(), "courseRank", -1317822431);
        setField(term577818, term577818.getClass(), "charaSlot", term577883);
        setField(term577818, term577818.getClass(), "charaLockSlot", term577905);
        setLongField(term577818, term577818.getClass(), "contentBit", -1650856702246595911L);
        setIntField(term577818, term577818.getClass(), "playCount", -1731526458);
        setField(term577818, term577818.getClass(), "eventWatchedDate", "YXMlQLMoOE");
        setField(term577818, term577818.getClass(), "lastGameId", "WGGgaSQZyz");
        setField(term577818, term577818.getClass(), "lastRomVersion", "ZvkzzctPul");
        setField(term577818, term577818.getClass(), "lastDataVersion", "RtFXoZRlqv");
        setField(term577818, term577818.getClass(), "lastLoginDate", "giljVPhTXS");
        setField(term577818, term577818.getClass(), "lastPlayDate", "lmBejKXzgc");
        setIntField(term577818, term577818.getClass(), "lastPlayCredit", 399898795);
        setIntField(term577818, term577818.getClass(), "lastPlayMode", -165817932);
        setIntField(term577818, term577818.getClass(), "lastPlaceId", 844131132);
        setField(term577818, term577818.getClass(), "lastPlaceName", "TGAMTaKkeq");
        setIntField(term577818, term577818.getClass(), "lastAllNetId", 589307278);
        setIntField(term577818, term577818.getClass(), "lastRegionId", -31956914);
        setField(term577818, term577818.getClass(), "lastRegionName", "xNJvuMFXVw");
        setField(term577818, term577818.getClass(), "lastClientId", "OAbBYfOHjL");
        setField(term577818, term577818.getClass(), "lastCountryCode", "JtwWLMosTs");
        setIntField(term577818, term577818.getClass(), "lastSelectEMoney", 844818375);
        setIntField(term577818, term577818.getClass(), "lastSelectTicket", -1481409664);
        setIntField(term577818, term577818.getClass(), "lastSelectCourse", -1190049983);
        setIntField(term577818, term577818.getClass(), "lastCountCourse", 1860199916);
        setField(term577818, term577818.getClass(), "firstGameId", "vLFhGQsEbD");
        setField(term577818, term577818.getClass(), "firstRomVersion", "LZGnPJaBcI");
        setField(term577818, term577818.getClass(), "firstDataVersion", "IKEAosRaXJ");
        setField(term577818, term577818.getClass(), "firstPlayDate", "CLmAOMhCpX");
        setField(term577818, term577818.getClass(), "compatibleCmVersion", "yoDFtfeUOh");
        setField(term577818, term577818.getClass(), "dailyBonusDate", "difvYNUhYG");
        setField(term577818, term577818.getClass(), "dailyCourseBonusDate", "YBblgMPyYX");
        setField(term577818, term577818.getClass(), "lastPairLoginDate", "ZeYKFdRoXM");
        setField(term577818, term577818.getClass(), "lastTrialPlayDate", "USAluGJuwk");
        setIntField(term577818, term577818.getClass(), "playVsCount", -566350354);
        setIntField(term577818, term577818.getClass(), "playSyncCount", -258640175);
        setIntField(term577818, term577818.getClass(), "winCount", -1075614851);
        setIntField(term577818, term577818.getClass(), "helpCount", -637115861);
        setIntField(term577818, term577818.getClass(), "comboCount", 1473822124);
        setLongField(term577818, term577818.getClass(), "totalDeluxscore", -8114637190228824979L);
        setLongField(term577818, term577818.getClass(), "totalBasicDeluxscore", -8883930499605252751L);
        setLongField(term577818, term577818.getClass(), "totalAdvancedDeluxscore", 1542893422381921633L);
        setLongField(term577818, term577818.getClass(), "totalExpertDeluxscore", -3791083652970079371L);
        setLongField(term577818, term577818.getClass(), "totalMasterDeluxscore", -147635273579190724L);
        setLongField(term577818, term577818.getClass(), "totalReMasterDeluxscore", 319253231292351441L);
        setIntField(term577818, term577818.getClass(), "totalSync", -1540964061);
        setIntField(term577818, term577818.getClass(), "totalBasicSync", 730372092);
        setIntField(term577818, term577818.getClass(), "totalAdvancedSync", -263950719);
        setIntField(term577818, term577818.getClass(), "totalExpertSync", 1245124051);
        setIntField(term577818, term577818.getClass(), "totalMasterSync", 437248389);
        setIntField(term577818, term577818.getClass(), "totalReMasterSync", 1954321744);
        setLongField(term577818, term577818.getClass(), "totalAchievement", 8076059246570263983L);
        setLongField(term577818, term577818.getClass(), "totalBasicAchievement", 6664585138464201617L);
        setLongField(term577818, term577818.getClass(), "totalAdvancedAchievement", -1904637682558797053L);
        setLongField(term577818, term577818.getClass(), "totalExpertAchievement", -771270393210620537L);
        setLongField(term577818, term577818.getClass(), "totalMasterAchievement", -6224866904448944766L);
        setLongField(term577818, term577818.getClass(), "totalReMasterAchievement", -293475965820208564L);
        setLongField(term577818, term577818.getClass(), "playerOldRating", -3695551935199336939L);
        setLongField(term577818, term577818.getClass(), "playerNewRating", -2909388444510677885L);
        setIntField(term577818, term577818.getClass(), "banState", 991034326);
        setLongField(term577818, term577818.getClass(), "dateTime", -6021737925363613906L);
        setField(term577816, term577816.getClass(), "user", term577818);
        setIntField(term577816, term577816.getClass(), "mapId", -1234725282);
        setIntField(term577816, term577816.getClass(), "distance", 350532449);
        setBooleanField(term577816, term577816.getClass(), "isLock", false);
        setBooleanField(term577816, term577816.getClass(), "isClear", true);
        setBooleanField(term577816, term577816.getClass(), "isComplete", false);
        term578198 = new Long(4411971772406127972L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term578198;
        callMethod(klass, "setId", argTypes, term577816, args);
    }

};


