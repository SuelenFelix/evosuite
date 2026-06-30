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

public class UserDetail_setFirstRomVersion_1226600945120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263298;

    public UserDetail_setFirstRomVersion_1226600945120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term263302 = new Long(-6489405551733780896L);
        Integer term263365 = new Integer(1744402926);
        Integer term263367 = new Integer(-68148707);
        Integer term263369 = new Integer(-487634357);
        Integer term263371 = new Integer(52605389);
        Integer term263373 = new Integer(-769585004);
        Integer term263375 = new Integer(483184455);
        Integer term263377 = new Integer(-1969040570);
        ArrayList term263363 = new ArrayList();
        ((ArrayList) term263363).add(term263365);
        ((ArrayList) term263363).add(term263367);
        ((ArrayList) term263363).add(term263369);
        ((ArrayList) term263363).add(term263371);
        ((ArrayList) term263363).add(term263373);
        ((ArrayList) term263363).add(term263375);
        ((ArrayList) term263363).add(term263377);
        Integer term263383 = new Integer(1627123408);
        ArrayList term263381 = new ArrayList();
        ((ArrayList) term263381).add(term263383);
        term263298 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term263300 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term263316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term263326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263331 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term263298, term263298.getClass(), "id", -5074234358142866355L);
        setLongField(term263300, term263300.getClass(), "id", 5228729860795151660L);
        setField(term263300, term263300.getClass(), "extId", term263302);
        setField(term263300, term263300.getClass(), "luid", "gQKUmoXhdM");
        setIntField(term263317, term263317.getClass(), "year", 2025);
        setShortField(term263317, term263317.getClass(), "month", (short) 5);
        setShortField(term263317, term263317.getClass(), "day", (short) 26);
        setField(term263316, term263316.getClass(), "date", term263317);
        setByteField(term263321, term263321.getClass(), "hour", (byte) 20);
        setByteField(term263321, term263321.getClass(), "minute", (byte) 9);
        setByteField(term263321, term263321.getClass(), "second", (byte) 33);
        setIntField(term263321, term263321.getClass(), "nano", 28360372);
        setField(term263316, term263316.getClass(), "time", term263321);
        setField(term263300, term263300.getClass(), "registerTime", term263316);
        setIntField(term263327, term263327.getClass(), "year", 2012);
        setShortField(term263327, term263327.getClass(), "month", (short) 6);
        setShortField(term263327, term263327.getClass(), "day", (short) 6);
        setField(term263326, term263326.getClass(), "date", term263327);
        setByteField(term263331, term263331.getClass(), "hour", (byte) 2);
        setByteField(term263331, term263331.getClass(), "minute", (byte) 48);
        setByteField(term263331, term263331.getClass(), "second", (byte) 6);
        setIntField(term263331, term263331.getClass(), "nano", 755935785);
        setField(term263326, term263326.getClass(), "time", term263331);
        setField(term263300, term263300.getClass(), "accessTime", term263326);
        setField(term263298, term263298.getClass(), "card", term263300);
        setField(term263298, term263298.getClass(), "userName", "tvvzjEdEMh");
        setIntField(term263298, term263298.getClass(), "isNetMember", 1298824158);
        setIntField(term263298, term263298.getClass(), "iconId", 199754542);
        setIntField(term263298, term263298.getClass(), "plateId", -449459947);
        setIntField(term263298, term263298.getClass(), "titleId", -1061589081);
        setIntField(term263298, term263298.getClass(), "partnerId", 746023829);
        setIntField(term263298, term263298.getClass(), "frameId", 41516868);
        setIntField(term263298, term263298.getClass(), "selectMapId", 1336776784);
        setIntField(term263298, term263298.getClass(), "totalAwake", -22457416);
        setIntField(term263298, term263298.getClass(), "gradeRating", -1325174741);
        setIntField(term263298, term263298.getClass(), "musicRating", 684193673);
        setIntField(term263298, term263298.getClass(), "playerRating", 370263718);
        setIntField(term263298, term263298.getClass(), "highestRating", 48015073);
        setIntField(term263298, term263298.getClass(), "gradeRank", 546263682);
        setIntField(term263298, term263298.getClass(), "classRank", -2035094166);
        setIntField(term263298, term263298.getClass(), "courseRank", -1363734645);
        setField(term263298, term263298.getClass(), "charaSlot", term263363);
        setField(term263298, term263298.getClass(), "charaLockSlot", term263381);
        setLongField(term263298, term263298.getClass(), "contentBit", 7625034792867397265L);
        setIntField(term263298, term263298.getClass(), "playCount", -801549011);
        setField(term263298, term263298.getClass(), "eventWatchedDate", "MxEEwZkyaW");
        setField(term263298, term263298.getClass(), "lastGameId", "lOGWYEqHxj");
        setField(term263298, term263298.getClass(), "lastRomVersion", "bfmcuNDfeS");
        setField(term263298, term263298.getClass(), "lastDataVersion", "oNwwaNwhoB");
        setField(term263298, term263298.getClass(), "lastLoginDate", "YVrwLJWJoI");
        setField(term263298, term263298.getClass(), "lastPlayDate", "IDBsGgnCMF");
        setIntField(term263298, term263298.getClass(), "lastPlayCredit", 62132446);
        setIntField(term263298, term263298.getClass(), "lastPlayMode", 1637357009);
        setIntField(term263298, term263298.getClass(), "lastPlaceId", -1207052944);
        setField(term263298, term263298.getClass(), "lastPlaceName", "zogoMEslwR");
        setIntField(term263298, term263298.getClass(), "lastAllNetId", -2019346254);
        setIntField(term263298, term263298.getClass(), "lastRegionId", -37753692);
        setField(term263298, term263298.getClass(), "lastRegionName", "SfWNBumWCS");
        setField(term263298, term263298.getClass(), "lastClientId", "fHJImkGpKa");
        setField(term263298, term263298.getClass(), "lastCountryCode", "FFuRCJTPFU");
        setIntField(term263298, term263298.getClass(), "lastSelectEMoney", -851423847);
        setIntField(term263298, term263298.getClass(), "lastSelectTicket", -2078904541);
        setIntField(term263298, term263298.getClass(), "lastSelectCourse", 1446569258);
        setIntField(term263298, term263298.getClass(), "lastCountCourse", -537915293);
        setField(term263298, term263298.getClass(), "firstGameId", "TFqQgSYtAg");
        setField(term263298, term263298.getClass(), "firstRomVersion", "qIbUvSzenQ");
        setField(term263298, term263298.getClass(), "firstDataVersion", "syLbtpcFxr");
        setField(term263298, term263298.getClass(), "firstPlayDate", "FKHboGOFMY");
        setField(term263298, term263298.getClass(), "compatibleCmVersion", "JAYIoLDVzT");
        setField(term263298, term263298.getClass(), "dailyBonusDate", "nxzYMTIyjg");
        setField(term263298, term263298.getClass(), "dailyCourseBonusDate", "zOpsVAnrwk");
        setField(term263298, term263298.getClass(), "lastPairLoginDate", "nnUWRbjEHe");
        setField(term263298, term263298.getClass(), "lastTrialPlayDate", "nqnYFZYCst");
        setIntField(term263298, term263298.getClass(), "playVsCount", 709026110);
        setIntField(term263298, term263298.getClass(), "playSyncCount", 1292003190);
        setIntField(term263298, term263298.getClass(), "winCount", -1604773694);
        setIntField(term263298, term263298.getClass(), "helpCount", -1181740520);
        setIntField(term263298, term263298.getClass(), "comboCount", 1630084052);
        setLongField(term263298, term263298.getClass(), "totalDeluxscore", 8630097491531309116L);
        setLongField(term263298, term263298.getClass(), "totalBasicDeluxscore", -8021887853223738046L);
        setLongField(term263298, term263298.getClass(), "totalAdvancedDeluxscore", -7693515050102462702L);
        setLongField(term263298, term263298.getClass(), "totalExpertDeluxscore", 7371581139523405552L);
        setLongField(term263298, term263298.getClass(), "totalMasterDeluxscore", 4426088058281677926L);
        setLongField(term263298, term263298.getClass(), "totalReMasterDeluxscore", 5193679691285846331L);
        setIntField(term263298, term263298.getClass(), "totalSync", -1229483233);
        setIntField(term263298, term263298.getClass(), "totalBasicSync", -766646734);
        setIntField(term263298, term263298.getClass(), "totalAdvancedSync", -1692871251);
        setIntField(term263298, term263298.getClass(), "totalExpertSync", -3714758);
        setIntField(term263298, term263298.getClass(), "totalMasterSync", -858513186);
        setIntField(term263298, term263298.getClass(), "totalReMasterSync", 1203235853);
        setLongField(term263298, term263298.getClass(), "totalAchievement", 7878506097802926060L);
        setLongField(term263298, term263298.getClass(), "totalBasicAchievement", 3225521654180272061L);
        setLongField(term263298, term263298.getClass(), "totalAdvancedAchievement", -2881134886720179750L);
        setLongField(term263298, term263298.getClass(), "totalExpertAchievement", -3268158633256901337L);
        setLongField(term263298, term263298.getClass(), "totalMasterAchievement", 8293480340779225768L);
        setLongField(term263298, term263298.getClass(), "totalReMasterAchievement", 5304374182692149929L);
        setLongField(term263298, term263298.getClass(), "playerOldRating", -1719505306839928042L);
        setLongField(term263298, term263298.getClass(), "playerNewRating", 2075422937926060439L);
        setIntField(term263298, term263298.getClass(), "banState", 1274844099);
        setLongField(term263298, term263298.getClass(), "dateTime", 4980953070380296307L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cyTSgJMCVE";
        callMethod(klass, "setFirstRomVersion", argTypes, term263298, args);
    }

};


