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

public class UserUdemae_setNpcTotalWinNum_210736246731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113097;
     Object term113478;

    public UserUdemae_setNpcTotalWinNum_210736246731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113103 = new Long(3090901538358721367L);
        Integer term113166 = new Integer(200150950);
        Integer term113168 = new Integer(-366198044);
        Integer term113170 = new Integer(-1350380769);
        Integer term113172 = new Integer(-1432215030);
        Integer term113174 = new Integer(1233186320);
        Integer term113176 = new Integer(-1303269101);
        ArrayList term113164 = new ArrayList();
        ((ArrayList) term113164).add(term113166);
        ((ArrayList) term113164).add(term113168);
        ((ArrayList) term113164).add(term113170);
        ((ArrayList) term113164).add(term113172);
        ((ArrayList) term113164).add(term113174);
        ((ArrayList) term113164).add(term113176);
        Integer term113182 = new Integer(1435572720);
        Integer term113184 = new Integer(1437618365);
        Integer term113186 = new Integer(1122535239);
        Integer term113188 = new Integer(1158923260);
        Integer term113190 = new Integer(1633508772);
        Integer term113192 = new Integer(-545275970);
        ArrayList term113180 = new ArrayList();
        ((ArrayList) term113180).add(term113182);
        ((ArrayList) term113180).add(term113184);
        ((ArrayList) term113180).add(term113186);
        ((ArrayList) term113180).add(term113188);
        ((ArrayList) term113180).add(term113190);
        ((ArrayList) term113180).add(term113192);
        term113097 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term113099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term113101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term113117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term113097, term113097.getClass(), "id", -2465126846058122797L);
        setLongField(term113099, term113099.getClass(), "id", -1296243020884964748L);
        setLongField(term113101, term113101.getClass(), "id", 2234534677218129148L);
        setField(term113101, term113101.getClass(), "extId", term113103);
        setField(term113101, term113101.getClass(), "luid", "IlWYmbzQQL");
        setIntField(term113118, term113118.getClass(), "year", 2029);
        setShortField(term113118, term113118.getClass(), "month", (short) 1);
        setShortField(term113118, term113118.getClass(), "day", (short) 15);
        setField(term113117, term113117.getClass(), "date", term113118);
        setByteField(term113122, term113122.getClass(), "hour", (byte) 1);
        setByteField(term113122, term113122.getClass(), "minute", (byte) 39);
        setByteField(term113122, term113122.getClass(), "second", (byte) 40);
        setIntField(term113122, term113122.getClass(), "nano", 99482694);
        setField(term113117, term113117.getClass(), "time", term113122);
        setField(term113101, term113101.getClass(), "registerTime", term113117);
        setIntField(term113128, term113128.getClass(), "year", 2025);
        setShortField(term113128, term113128.getClass(), "month", (short) 2);
        setShortField(term113128, term113128.getClass(), "day", (short) 11);
        setField(term113127, term113127.getClass(), "date", term113128);
        setByteField(term113132, term113132.getClass(), "hour", (byte) 15);
        setByteField(term113132, term113132.getClass(), "minute", (byte) 46);
        setByteField(term113132, term113132.getClass(), "second", (byte) 31);
        setIntField(term113132, term113132.getClass(), "nano", 989587730);
        setField(term113127, term113127.getClass(), "time", term113132);
        setField(term113101, term113101.getClass(), "accessTime", term113127);
        setField(term113099, term113099.getClass(), "card", term113101);
        setField(term113099, term113099.getClass(), "userName", "pinoPipukP");
        setIntField(term113099, term113099.getClass(), "isNetMember", -1731721170);
        setIntField(term113099, term113099.getClass(), "iconId", 893978926);
        setIntField(term113099, term113099.getClass(), "plateId", -1002898053);
        setIntField(term113099, term113099.getClass(), "titleId", -938480312);
        setIntField(term113099, term113099.getClass(), "partnerId", -1755694249);
        setIntField(term113099, term113099.getClass(), "frameId", -730526942);
        setIntField(term113099, term113099.getClass(), "selectMapId", 1596741735);
        setIntField(term113099, term113099.getClass(), "totalAwake", -992293515);
        setIntField(term113099, term113099.getClass(), "gradeRating", -941799505);
        setIntField(term113099, term113099.getClass(), "musicRating", -490855781);
        setIntField(term113099, term113099.getClass(), "playerRating", -1019146708);
        setIntField(term113099, term113099.getClass(), "highestRating", -1659254800);
        setIntField(term113099, term113099.getClass(), "gradeRank", 1069040713);
        setIntField(term113099, term113099.getClass(), "classRank", -932319157);
        setIntField(term113099, term113099.getClass(), "courseRank", 2096486142);
        setField(term113099, term113099.getClass(), "charaSlot", term113164);
        setField(term113099, term113099.getClass(), "charaLockSlot", term113180);
        setLongField(term113099, term113099.getClass(), "contentBit", 1514427633703984770L);
        setIntField(term113099, term113099.getClass(), "playCount", 1814053301);
        setField(term113099, term113099.getClass(), "eventWatchedDate", "qqnzeIWFCa");
        setField(term113099, term113099.getClass(), "lastGameId", "gOdeBqOhYH");
        setField(term113099, term113099.getClass(), "lastRomVersion", "EyPdpJTxkZ");
        setField(term113099, term113099.getClass(), "lastDataVersion", "vfKOoCcJXS");
        setField(term113099, term113099.getClass(), "lastLoginDate", "jCPFInZUzz");
        setField(term113099, term113099.getClass(), "lastPlayDate", "WPHeIEBBVh");
        setIntField(term113099, term113099.getClass(), "lastPlayCredit", -1145940584);
        setIntField(term113099, term113099.getClass(), "lastPlayMode", 1759520462);
        setIntField(term113099, term113099.getClass(), "lastPlaceId", -450055049);
        setField(term113099, term113099.getClass(), "lastPlaceName", "ruFkchQbOS");
        setIntField(term113099, term113099.getClass(), "lastAllNetId", -2139747712);
        setIntField(term113099, term113099.getClass(), "lastRegionId", -60712376);
        setField(term113099, term113099.getClass(), "lastRegionName", "tBfuxXsdPa");
        setField(term113099, term113099.getClass(), "lastClientId", "fbUKhQMRyD");
        setField(term113099, term113099.getClass(), "lastCountryCode", "NSGSwngDCi");
        setIntField(term113099, term113099.getClass(), "lastSelectEMoney", 1374935274);
        setIntField(term113099, term113099.getClass(), "lastSelectTicket", 1063935111);
        setIntField(term113099, term113099.getClass(), "lastSelectCourse", 1742675635);
        setIntField(term113099, term113099.getClass(), "lastCountCourse", 1406898507);
        setField(term113099, term113099.getClass(), "firstGameId", "IqTXCynBeA");
        setField(term113099, term113099.getClass(), "firstRomVersion", "bgIAbyunKO");
        setField(term113099, term113099.getClass(), "firstDataVersion", "ECOAkMOcmP");
        setField(term113099, term113099.getClass(), "firstPlayDate", "GropLwcnsd");
        setField(term113099, term113099.getClass(), "compatibleCmVersion", "OPVlJKGGVY");
        setField(term113099, term113099.getClass(), "dailyBonusDate", "kcbEwUStJX");
        setField(term113099, term113099.getClass(), "dailyCourseBonusDate", "rbJDQpboBH");
        setField(term113099, term113099.getClass(), "lastPairLoginDate", "AJvPxKmklj");
        setField(term113099, term113099.getClass(), "lastTrialPlayDate", "nXIqTwQhkl");
        setIntField(term113099, term113099.getClass(), "playVsCount", -28514280);
        setIntField(term113099, term113099.getClass(), "playSyncCount", 313319336);
        setIntField(term113099, term113099.getClass(), "winCount", -335338628);
        setIntField(term113099, term113099.getClass(), "helpCount", 1539132721);
        setIntField(term113099, term113099.getClass(), "comboCount", -564177085);
        setLongField(term113099, term113099.getClass(), "totalDeluxscore", -6633688490127237966L);
        setLongField(term113099, term113099.getClass(), "totalBasicDeluxscore", 9021741190754893927L);
        setLongField(term113099, term113099.getClass(), "totalAdvancedDeluxscore", -1822732075600106365L);
        setLongField(term113099, term113099.getClass(), "totalExpertDeluxscore", -6384638601613937294L);
        setLongField(term113099, term113099.getClass(), "totalMasterDeluxscore", -2341674103251376130L);
        setLongField(term113099, term113099.getClass(), "totalReMasterDeluxscore", -7249496366136681891L);
        setIntField(term113099, term113099.getClass(), "totalSync", 1951006294);
        setIntField(term113099, term113099.getClass(), "totalBasicSync", 315490614);
        setIntField(term113099, term113099.getClass(), "totalAdvancedSync", -181204804);
        setIntField(term113099, term113099.getClass(), "totalExpertSync", 2073462223);
        setIntField(term113099, term113099.getClass(), "totalMasterSync", 509141438);
        setIntField(term113099, term113099.getClass(), "totalReMasterSync", 55918608);
        setLongField(term113099, term113099.getClass(), "totalAchievement", 7470377993428674715L);
        setLongField(term113099, term113099.getClass(), "totalBasicAchievement", 8607992547586311637L);
        setLongField(term113099, term113099.getClass(), "totalAdvancedAchievement", -705228244449989156L);
        setLongField(term113099, term113099.getClass(), "totalExpertAchievement", 6210903460142550841L);
        setLongField(term113099, term113099.getClass(), "totalMasterAchievement", 6382689199350893487L);
        setLongField(term113099, term113099.getClass(), "totalReMasterAchievement", 2335919891878722978L);
        setLongField(term113099, term113099.getClass(), "playerOldRating", -79820031844738282L);
        setLongField(term113099, term113099.getClass(), "playerNewRating", 6299176426687603491L);
        setIntField(term113099, term113099.getClass(), "banState", 1863053491);
        setLongField(term113099, term113099.getClass(), "dateTime", -7995639033732034295L);
        setField(term113097, term113097.getClass(), "user", term113099);
        setIntField(term113097, term113097.getClass(), "rate", 1569101532);
        setIntField(term113097, term113097.getClass(), "maxRate", -1825428555);
        setIntField(term113097, term113097.getClass(), "classValue", 2124679916);
        setIntField(term113097, term113097.getClass(), "maxClassValue", -1587529994);
        setIntField(term113097, term113097.getClass(), "totalWinNum", -214529845);
        setIntField(term113097, term113097.getClass(), "totalLoseNum", 684495339);
        setIntField(term113097, term113097.getClass(), "maxWinNum", 361364617);
        setIntField(term113097, term113097.getClass(), "maxLoseNum", -132332846);
        setIntField(term113097, term113097.getClass(), "winNum", -160055040);
        setIntField(term113097, term113097.getClass(), "loseNum", 7043168);
        setIntField(term113097, term113097.getClass(), "npcTotalWinNum", 2007440099);
        setIntField(term113097, term113097.getClass(), "npcTotalLoseNum", 1462309526);
        setIntField(term113097, term113097.getClass(), "npcMaxWinNum", -451407895);
        setIntField(term113097, term113097.getClass(), "npcMaxLoseNum", -1132970218);
        setIntField(term113097, term113097.getClass(), "npcWinNum", -693000999);
        setIntField(term113097, term113097.getClass(), "npcLoseNum", -518970778);
        term113478 = new Integer(-534810305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term113478;
        callMethod(klass, "setNpcTotalWinNum", argTypes, term113097, args);
    }

};


