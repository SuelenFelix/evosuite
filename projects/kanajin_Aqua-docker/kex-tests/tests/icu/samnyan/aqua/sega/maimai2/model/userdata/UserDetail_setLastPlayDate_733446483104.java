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

public class UserDetail_setLastPlayDate_733446483104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4288711;

    public UserDetail_setLastPlayDate_733446483104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4288715 = new Long(-1293962831337793157L);
        Integer term4288778 = new Integer(-71096217);
        Integer term4288780 = new Integer(-1809406090);
        Integer term4288782 = new Integer(-1783195316);
        ArrayList term4288776 = new ArrayList();
        ((ArrayList) term4288776).add(term4288778);
        ((ArrayList) term4288776).add(term4288780);
        ((ArrayList) term4288776).add(term4288782);
        Integer term4288788 = new Integer(-1932630543);
        Integer term4288790 = new Integer(-1460939623);
        Integer term4288792 = new Integer(1024871937);
        Integer term4288794 = new Integer(1248282915);
        Integer term4288796 = new Integer(530401633);
        ArrayList term4288786 = new ArrayList();
        ((ArrayList) term4288786).add(term4288788);
        ((ArrayList) term4288786).add(term4288790);
        ((ArrayList) term4288786).add(term4288792);
        ((ArrayList) term4288786).add(term4288794);
        ((ArrayList) term4288786).add(term4288796);
        term4288711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4288713 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4288729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4288730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4288734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4288739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4288740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4288744 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4288711, term4288711.getClass(), "id", -4552096009637020831L);
        setLongField(term4288713, term4288713.getClass(), "id", -3553872973964401333L);
        setField(term4288713, term4288713.getClass(), "extId", term4288715);
        setField(term4288713, term4288713.getClass(), "luid", "aLNSSsRnIj");
        setIntField(term4288730, term4288730.getClass(), "year", 2018);
        setShortField(term4288730, term4288730.getClass(), "month", (short) 3);
        setShortField(term4288730, term4288730.getClass(), "day", (short) 15);
        setField(term4288729, term4288729.getClass(), "date", term4288730);
        setByteField(term4288734, term4288734.getClass(), "hour", (byte) 7);
        setByteField(term4288734, term4288734.getClass(), "minute", (byte) 44);
        setByteField(term4288734, term4288734.getClass(), "second", (byte) 23);
        setIntField(term4288734, term4288734.getClass(), "nano", 501033008);
        setField(term4288729, term4288729.getClass(), "time", term4288734);
        setField(term4288713, term4288713.getClass(), "registerTime", term4288729);
        setIntField(term4288740, term4288740.getClass(), "year", 2017);
        setShortField(term4288740, term4288740.getClass(), "month", (short) 11);
        setShortField(term4288740, term4288740.getClass(), "day", (short) 13);
        setField(term4288739, term4288739.getClass(), "date", term4288740);
        setByteField(term4288744, term4288744.getClass(), "hour", (byte) 0);
        setByteField(term4288744, term4288744.getClass(), "minute", (byte) 49);
        setByteField(term4288744, term4288744.getClass(), "second", (byte) 11);
        setIntField(term4288744, term4288744.getClass(), "nano", 547330133);
        setField(term4288739, term4288739.getClass(), "time", term4288744);
        setField(term4288713, term4288713.getClass(), "accessTime", term4288739);
        setField(term4288711, term4288711.getClass(), "card", term4288713);
        setField(term4288711, term4288711.getClass(), "userName", "OhlDNsgYeb");
        setIntField(term4288711, term4288711.getClass(), "isNetMember", -309197811);
        setIntField(term4288711, term4288711.getClass(), "iconId", 1633929537);
        setIntField(term4288711, term4288711.getClass(), "plateId", -493637713);
        setIntField(term4288711, term4288711.getClass(), "titleId", -597268717);
        setIntField(term4288711, term4288711.getClass(), "partnerId", 1602169036);
        setIntField(term4288711, term4288711.getClass(), "frameId", 901149734);
        setIntField(term4288711, term4288711.getClass(), "selectMapId", -637921793);
        setIntField(term4288711, term4288711.getClass(), "totalAwake", -900192055);
        setIntField(term4288711, term4288711.getClass(), "gradeRating", 1339384045);
        setIntField(term4288711, term4288711.getClass(), "musicRating", 966938220);
        setIntField(term4288711, term4288711.getClass(), "playerRating", -1248582059);
        setIntField(term4288711, term4288711.getClass(), "highestRating", -2116281889);
        setIntField(term4288711, term4288711.getClass(), "gradeRank", -354343312);
        setIntField(term4288711, term4288711.getClass(), "classRank", 76416827);
        setIntField(term4288711, term4288711.getClass(), "courseRank", -1153869329);
        setField(term4288711, term4288711.getClass(), "charaSlot", term4288776);
        setField(term4288711, term4288711.getClass(), "charaLockSlot", term4288786);
        setLongField(term4288711, term4288711.getClass(), "contentBit", -7393149620594666692L);
        setIntField(term4288711, term4288711.getClass(), "playCount", -701552703);
        setField(term4288711, term4288711.getClass(), "eventWatchedDate", "czPeJVIFWG");
        setField(term4288711, term4288711.getClass(), "lastGameId", "WZImDLbrLb");
        setField(term4288711, term4288711.getClass(), "lastRomVersion", "oLByFeXPsE");
        setField(term4288711, term4288711.getClass(), "lastDataVersion", "PETPrYpHNv");
        setField(term4288711, term4288711.getClass(), "lastLoginDate", "oXiazAhGui");
        setField(term4288711, term4288711.getClass(), "lastPlayDate", "zAAXgpBlds");
        setIntField(term4288711, term4288711.getClass(), "lastPlayCredit", -2026821035);
        setIntField(term4288711, term4288711.getClass(), "lastPlayMode", -1827619022);
        setIntField(term4288711, term4288711.getClass(), "lastPlaceId", 1374146682);
        setField(term4288711, term4288711.getClass(), "lastPlaceName", "aEqlbxAfLG");
        setIntField(term4288711, term4288711.getClass(), "lastAllNetId", -53256845);
        setIntField(term4288711, term4288711.getClass(), "lastRegionId", 474389122);
        setField(term4288711, term4288711.getClass(), "lastRegionName", "pSDFzthxua");
        setField(term4288711, term4288711.getClass(), "lastClientId", "fMtgRfpcIg");
        setField(term4288711, term4288711.getClass(), "lastCountryCode", "mdduXqmIxh");
        setIntField(term4288711, term4288711.getClass(), "lastSelectEMoney", 1425711735);
        setIntField(term4288711, term4288711.getClass(), "lastSelectTicket", 407626384);
        setIntField(term4288711, term4288711.getClass(), "lastSelectCourse", 2090589636);
        setIntField(term4288711, term4288711.getClass(), "lastCountCourse", -1922473494);
        setField(term4288711, term4288711.getClass(), "firstGameId", "AjAFnimlqM");
        setField(term4288711, term4288711.getClass(), "firstRomVersion", "QwqJqavevJ");
        setField(term4288711, term4288711.getClass(), "firstDataVersion", "aHjqqXqOij");
        setField(term4288711, term4288711.getClass(), "firstPlayDate", "fscFBxElRr");
        setField(term4288711, term4288711.getClass(), "compatibleCmVersion", "kRhIAwFbRl");
        setField(term4288711, term4288711.getClass(), "dailyBonusDate", "NpnSHKlhDb");
        setField(term4288711, term4288711.getClass(), "dailyCourseBonusDate", "OMFreNSCKt");
        setField(term4288711, term4288711.getClass(), "lastPairLoginDate", "LSxNDSDbTW");
        setField(term4288711, term4288711.getClass(), "lastTrialPlayDate", "QLJATCbQhE");
        setIntField(term4288711, term4288711.getClass(), "playVsCount", 344231951);
        setIntField(term4288711, term4288711.getClass(), "playSyncCount", 1037031553);
        setIntField(term4288711, term4288711.getClass(), "winCount", -1404973886);
        setIntField(term4288711, term4288711.getClass(), "helpCount", 666748652);
        setIntField(term4288711, term4288711.getClass(), "comboCount", -838704530);
        setLongField(term4288711, term4288711.getClass(), "totalDeluxscore", 1371571288982206994L);
        setLongField(term4288711, term4288711.getClass(), "totalBasicDeluxscore", -1728512109821896678L);
        setLongField(term4288711, term4288711.getClass(), "totalAdvancedDeluxscore", -8020266196115653720L);
        setLongField(term4288711, term4288711.getClass(), "totalExpertDeluxscore", -1440547397258039434L);
        setLongField(term4288711, term4288711.getClass(), "totalMasterDeluxscore", 6785491555880539075L);
        setLongField(term4288711, term4288711.getClass(), "totalReMasterDeluxscore", 4202766639754004816L);
        setIntField(term4288711, term4288711.getClass(), "totalSync", -953562795);
        setIntField(term4288711, term4288711.getClass(), "totalBasicSync", 1759108208);
        setIntField(term4288711, term4288711.getClass(), "totalAdvancedSync", -1129640968);
        setIntField(term4288711, term4288711.getClass(), "totalExpertSync", 1897442641);
        setIntField(term4288711, term4288711.getClass(), "totalMasterSync", -231086575);
        setIntField(term4288711, term4288711.getClass(), "totalReMasterSync", -1379307338);
        setLongField(term4288711, term4288711.getClass(), "totalAchievement", -7377436341847049304L);
        setLongField(term4288711, term4288711.getClass(), "totalBasicAchievement", 8971692998486776404L);
        setLongField(term4288711, term4288711.getClass(), "totalAdvancedAchievement", 833638669999586545L);
        setLongField(term4288711, term4288711.getClass(), "totalExpertAchievement", -7809745213436685252L);
        setLongField(term4288711, term4288711.getClass(), "totalMasterAchievement", 7863601666856073872L);
        setLongField(term4288711, term4288711.getClass(), "totalReMasterAchievement", -4826509475566960527L);
        setLongField(term4288711, term4288711.getClass(), "playerOldRating", 6788916086967633427L);
        setLongField(term4288711, term4288711.getClass(), "playerNewRating", -3430101118308949768L);
        setIntField(term4288711, term4288711.getClass(), "banState", 1350104696);
        setLongField(term4288711, term4288711.getClass(), "dateTime", -1436150124882688728L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eHeCHffvhA";
        callMethod(klass, "setLastPlayDate", argTypes, term4288711, args);
    }

};


