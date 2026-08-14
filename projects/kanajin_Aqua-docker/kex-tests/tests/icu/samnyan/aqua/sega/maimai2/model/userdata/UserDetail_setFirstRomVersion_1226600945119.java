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

public class UserDetail_setFirstRomVersion_1226600945119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263243;

    public UserDetail_setFirstRomVersion_1226600945119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term263247 = new Long(-6489405551733780896L);
        Integer term263310 = new Integer(1744402926);
        Integer term263312 = new Integer(-68148707);
        Integer term263314 = new Integer(-487634357);
        Integer term263316 = new Integer(52605389);
        Integer term263318 = new Integer(-769585004);
        Integer term263320 = new Integer(483184455);
        Integer term263322 = new Integer(-1969040570);
        ArrayList term263308 = new ArrayList();
        ((ArrayList) term263308).add(term263310);
        ((ArrayList) term263308).add(term263312);
        ((ArrayList) term263308).add(term263314);
        ((ArrayList) term263308).add(term263316);
        ((ArrayList) term263308).add(term263318);
        ((ArrayList) term263308).add(term263320);
        ((ArrayList) term263308).add(term263322);
        Integer term263328 = new Integer(1627123408);
        ArrayList term263326 = new ArrayList();
        ((ArrayList) term263326).add(term263328);
        term263243 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term263245 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term263261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term263271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263276 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term263243, term263243.getClass(), "id", -5074234358142866355L);
        setLongField(term263245, term263245.getClass(), "id", 5228729860795151660L);
        setField(term263245, term263245.getClass(), "extId", term263247);
        setField(term263245, term263245.getClass(), "luid", "gQKUmoXhdM");
        setIntField(term263262, term263262.getClass(), "year", 2025);
        setShortField(term263262, term263262.getClass(), "month", (short) 5);
        setShortField(term263262, term263262.getClass(), "day", (short) 26);
        setField(term263261, term263261.getClass(), "date", term263262);
        setByteField(term263266, term263266.getClass(), "hour", (byte) 20);
        setByteField(term263266, term263266.getClass(), "minute", (byte) 9);
        setByteField(term263266, term263266.getClass(), "second", (byte) 33);
        setIntField(term263266, term263266.getClass(), "nano", 28360372);
        setField(term263261, term263261.getClass(), "time", term263266);
        setField(term263245, term263245.getClass(), "registerTime", term263261);
        setIntField(term263272, term263272.getClass(), "year", 2012);
        setShortField(term263272, term263272.getClass(), "month", (short) 6);
        setShortField(term263272, term263272.getClass(), "day", (short) 6);
        setField(term263271, term263271.getClass(), "date", term263272);
        setByteField(term263276, term263276.getClass(), "hour", (byte) 2);
        setByteField(term263276, term263276.getClass(), "minute", (byte) 48);
        setByteField(term263276, term263276.getClass(), "second", (byte) 6);
        setIntField(term263276, term263276.getClass(), "nano", 755935785);
        setField(term263271, term263271.getClass(), "time", term263276);
        setField(term263245, term263245.getClass(), "accessTime", term263271);
        setField(term263243, term263243.getClass(), "card", term263245);
        setField(term263243, term263243.getClass(), "userName", "tvvzjEdEMh");
        setIntField(term263243, term263243.getClass(), "isNetMember", 1298824158);
        setIntField(term263243, term263243.getClass(), "iconId", 199754542);
        setIntField(term263243, term263243.getClass(), "plateId", -449459947);
        setIntField(term263243, term263243.getClass(), "titleId", -1061589081);
        setIntField(term263243, term263243.getClass(), "partnerId", 746023829);
        setIntField(term263243, term263243.getClass(), "frameId", 41516868);
        setIntField(term263243, term263243.getClass(), "selectMapId", 1336776784);
        setIntField(term263243, term263243.getClass(), "totalAwake", -22457416);
        setIntField(term263243, term263243.getClass(), "gradeRating", -1325174741);
        setIntField(term263243, term263243.getClass(), "musicRating", 684193673);
        setIntField(term263243, term263243.getClass(), "playerRating", 370263718);
        setIntField(term263243, term263243.getClass(), "highestRating", 48015073);
        setIntField(term263243, term263243.getClass(), "gradeRank", 546263682);
        setIntField(term263243, term263243.getClass(), "classRank", -2035094166);
        setIntField(term263243, term263243.getClass(), "courseRank", -1363734645);
        setField(term263243, term263243.getClass(), "charaSlot", term263308);
        setField(term263243, term263243.getClass(), "charaLockSlot", term263326);
        setLongField(term263243, term263243.getClass(), "contentBit", 7625034792867397265L);
        setIntField(term263243, term263243.getClass(), "playCount", -801549011);
        setField(term263243, term263243.getClass(), "eventWatchedDate", "MxEEwZkyaW");
        setField(term263243, term263243.getClass(), "lastGameId", "lOGWYEqHxj");
        setField(term263243, term263243.getClass(), "lastRomVersion", "bfmcuNDfeS");
        setField(term263243, term263243.getClass(), "lastDataVersion", "oNwwaNwhoB");
        setField(term263243, term263243.getClass(), "lastLoginDate", "YVrwLJWJoI");
        setField(term263243, term263243.getClass(), "lastPlayDate", "IDBsGgnCMF");
        setIntField(term263243, term263243.getClass(), "lastPlayCredit", 62132446);
        setIntField(term263243, term263243.getClass(), "lastPlayMode", 1637357009);
        setIntField(term263243, term263243.getClass(), "lastPlaceId", -1207052944);
        setField(term263243, term263243.getClass(), "lastPlaceName", "zogoMEslwR");
        setIntField(term263243, term263243.getClass(), "lastAllNetId", -2019346254);
        setIntField(term263243, term263243.getClass(), "lastRegionId", -37753692);
        setField(term263243, term263243.getClass(), "lastRegionName", "SfWNBumWCS");
        setField(term263243, term263243.getClass(), "lastClientId", "fHJImkGpKa");
        setField(term263243, term263243.getClass(), "lastCountryCode", "FFuRCJTPFU");
        setIntField(term263243, term263243.getClass(), "lastSelectEMoney", -851423847);
        setIntField(term263243, term263243.getClass(), "lastSelectTicket", -2078904541);
        setIntField(term263243, term263243.getClass(), "lastSelectCourse", 1446569258);
        setIntField(term263243, term263243.getClass(), "lastCountCourse", -537915293);
        setField(term263243, term263243.getClass(), "firstGameId", "TFqQgSYtAg");
        setField(term263243, term263243.getClass(), "firstRomVersion", "qIbUvSzenQ");
        setField(term263243, term263243.getClass(), "firstDataVersion", "syLbtpcFxr");
        setField(term263243, term263243.getClass(), "firstPlayDate", "FKHboGOFMY");
        setField(term263243, term263243.getClass(), "compatibleCmVersion", "JAYIoLDVzT");
        setField(term263243, term263243.getClass(), "dailyBonusDate", "nxzYMTIyjg");
        setField(term263243, term263243.getClass(), "dailyCourseBonusDate", "zOpsVAnrwk");
        setField(term263243, term263243.getClass(), "lastPairLoginDate", "nnUWRbjEHe");
        setField(term263243, term263243.getClass(), "lastTrialPlayDate", "nqnYFZYCst");
        setIntField(term263243, term263243.getClass(), "playVsCount", 709026110);
        setIntField(term263243, term263243.getClass(), "playSyncCount", 1292003190);
        setIntField(term263243, term263243.getClass(), "winCount", -1604773694);
        setIntField(term263243, term263243.getClass(), "helpCount", -1181740520);
        setIntField(term263243, term263243.getClass(), "comboCount", 1630084052);
        setLongField(term263243, term263243.getClass(), "totalDeluxscore", 8630097491531309116L);
        setLongField(term263243, term263243.getClass(), "totalBasicDeluxscore", -8021887853223738046L);
        setLongField(term263243, term263243.getClass(), "totalAdvancedDeluxscore", -7693515050102462702L);
        setLongField(term263243, term263243.getClass(), "totalExpertDeluxscore", 7371581139523405552L);
        setLongField(term263243, term263243.getClass(), "totalMasterDeluxscore", 4426088058281677926L);
        setLongField(term263243, term263243.getClass(), "totalReMasterDeluxscore", 5193679691285846331L);
        setIntField(term263243, term263243.getClass(), "totalSync", -1229483233);
        setIntField(term263243, term263243.getClass(), "totalBasicSync", -766646734);
        setIntField(term263243, term263243.getClass(), "totalAdvancedSync", -1692871251);
        setIntField(term263243, term263243.getClass(), "totalExpertSync", -3714758);
        setIntField(term263243, term263243.getClass(), "totalMasterSync", -858513186);
        setIntField(term263243, term263243.getClass(), "totalReMasterSync", 1203235853);
        setLongField(term263243, term263243.getClass(), "totalAchievement", 7878506097802926060L);
        setLongField(term263243, term263243.getClass(), "totalBasicAchievement", 3225521654180272061L);
        setLongField(term263243, term263243.getClass(), "totalAdvancedAchievement", -2881134886720179750L);
        setLongField(term263243, term263243.getClass(), "totalExpertAchievement", -3268158633256901337L);
        setLongField(term263243, term263243.getClass(), "totalMasterAchievement", 8293480340779225768L);
        setLongField(term263243, term263243.getClass(), "totalReMasterAchievement", 5304374182692149929L);
        setLongField(term263243, term263243.getClass(), "playerOldRating", -1719505306839928042L);
        setLongField(term263243, term263243.getClass(), "playerNewRating", 2075422937926060439L);
        setIntField(term263243, term263243.getClass(), "banState", 1274844099);
        setLongField(term263243, term263243.getClass(), "dateTime", 4980953070380296307L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cyTSgJMCVE";
        callMethod(klass, "setFirstRomVersion", argTypes, term263243, args);
    }

};


