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

public class UserGeneralData_setPropertyKey_17467610687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137021;

    public UserGeneralData_setPropertyKey_17467610687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137027 = new Long(1993646237353405740L);
        Integer term137090 = new Integer(-1722702406);
        Integer term137092 = new Integer(549278914);
        Integer term137094 = new Integer(-1490125498);
        ArrayList term137088 = new ArrayList();
        ((ArrayList) term137088).add(term137090);
        ((ArrayList) term137088).add(term137092);
        ((ArrayList) term137088).add(term137094);
        Integer term137100 = new Integer(-1443119347);
        Integer term137102 = new Integer(1962181481);
        Integer term137104 = new Integer(1798831879);
        Integer term137106 = new Integer(1393855580);
        Integer term137108 = new Integer(-849064032);
        Integer term137110 = new Integer(-184659375);
        Integer term137112 = new Integer(629005618);
        ArrayList term137098 = new ArrayList();
        ((ArrayList) term137098).add(term137100);
        ((ArrayList) term137098).add(term137102);
        ((ArrayList) term137098).add(term137104);
        ((ArrayList) term137098).add(term137106);
        ((ArrayList) term137098).add(term137108);
        ((ArrayList) term137098).add(term137110);
        ((ArrayList) term137098).add(term137112);
        term137021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term137023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term137025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term137041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137021, term137021.getClass(), "id", 3387118333525783222L);
        setLongField(term137023, term137023.getClass(), "id", -1884099306500725348L);
        setLongField(term137025, term137025.getClass(), "id", -2373213666263358066L);
        setField(term137025, term137025.getClass(), "extId", term137027);
        setField(term137025, term137025.getClass(), "luid", "ACdUTXxFxF");
        setIntField(term137042, term137042.getClass(), "year", 2011);
        setShortField(term137042, term137042.getClass(), "month", (short) 10);
        setShortField(term137042, term137042.getClass(), "day", (short) 20);
        setField(term137041, term137041.getClass(), "date", term137042);
        setByteField(term137046, term137046.getClass(), "hour", (byte) 2);
        setByteField(term137046, term137046.getClass(), "minute", (byte) 15);
        setByteField(term137046, term137046.getClass(), "second", (byte) 4);
        setIntField(term137046, term137046.getClass(), "nano", 46300192);
        setField(term137041, term137041.getClass(), "time", term137046);
        setField(term137025, term137025.getClass(), "registerTime", term137041);
        setIntField(term137052, term137052.getClass(), "year", 2023);
        setShortField(term137052, term137052.getClass(), "month", (short) 3);
        setShortField(term137052, term137052.getClass(), "day", (short) 26);
        setField(term137051, term137051.getClass(), "date", term137052);
        setByteField(term137056, term137056.getClass(), "hour", (byte) 2);
        setByteField(term137056, term137056.getClass(), "minute", (byte) 30);
        setByteField(term137056, term137056.getClass(), "second", (byte) 47);
        setIntField(term137056, term137056.getClass(), "nano", 494050019);
        setField(term137051, term137051.getClass(), "time", term137056);
        setField(term137025, term137025.getClass(), "accessTime", term137051);
        setField(term137023, term137023.getClass(), "card", term137025);
        setField(term137023, term137023.getClass(), "userName", "MsjtvLqctc");
        setIntField(term137023, term137023.getClass(), "isNetMember", 100828116);
        setIntField(term137023, term137023.getClass(), "iconId", -1959805707);
        setIntField(term137023, term137023.getClass(), "plateId", 30813741);
        setIntField(term137023, term137023.getClass(), "titleId", 2044603094);
        setIntField(term137023, term137023.getClass(), "partnerId", 726068108);
        setIntField(term137023, term137023.getClass(), "frameId", 56736806);
        setIntField(term137023, term137023.getClass(), "selectMapId", 496074088);
        setIntField(term137023, term137023.getClass(), "totalAwake", -785066858);
        setIntField(term137023, term137023.getClass(), "gradeRating", -1086354117);
        setIntField(term137023, term137023.getClass(), "musicRating", -868397361);
        setIntField(term137023, term137023.getClass(), "playerRating", 1974839599);
        setIntField(term137023, term137023.getClass(), "highestRating", 975425511);
        setIntField(term137023, term137023.getClass(), "gradeRank", 1662673275);
        setIntField(term137023, term137023.getClass(), "classRank", 1782831447);
        setIntField(term137023, term137023.getClass(), "courseRank", -1997327027);
        setField(term137023, term137023.getClass(), "charaSlot", term137088);
        setField(term137023, term137023.getClass(), "charaLockSlot", term137098);
        setLongField(term137023, term137023.getClass(), "contentBit", 3167925474408487500L);
        setIntField(term137023, term137023.getClass(), "playCount", -1055738735);
        setField(term137023, term137023.getClass(), "eventWatchedDate", "omhBZktFpR");
        setField(term137023, term137023.getClass(), "lastGameId", "zEsjjlIKrF");
        setField(term137023, term137023.getClass(), "lastRomVersion", "XeoSSCwSfl");
        setField(term137023, term137023.getClass(), "lastDataVersion", "adcoGovSer");
        setField(term137023, term137023.getClass(), "lastLoginDate", "DZqXfiKqtE");
        setField(term137023, term137023.getClass(), "lastPlayDate", "YOsqpIMuey");
        setIntField(term137023, term137023.getClass(), "lastPlayCredit", 693030720);
        setIntField(term137023, term137023.getClass(), "lastPlayMode", -148509792);
        setIntField(term137023, term137023.getClass(), "lastPlaceId", 1306551461);
        setField(term137023, term137023.getClass(), "lastPlaceName", "dfJffzsKZe");
        setIntField(term137023, term137023.getClass(), "lastAllNetId", -141757322);
        setIntField(term137023, term137023.getClass(), "lastRegionId", 507424812);
        setField(term137023, term137023.getClass(), "lastRegionName", "dTgyMBkwWX");
        setField(term137023, term137023.getClass(), "lastClientId", "mhIqZywfDK");
        setField(term137023, term137023.getClass(), "lastCountryCode", "MXPBuilyzu");
        setIntField(term137023, term137023.getClass(), "lastSelectEMoney", -844787500);
        setIntField(term137023, term137023.getClass(), "lastSelectTicket", 917456811);
        setIntField(term137023, term137023.getClass(), "lastSelectCourse", 78789367);
        setIntField(term137023, term137023.getClass(), "lastCountCourse", -437074400);
        setField(term137023, term137023.getClass(), "firstGameId", "CHVVqdbuYH");
        setField(term137023, term137023.getClass(), "firstRomVersion", "rLNYIbBxpb");
        setField(term137023, term137023.getClass(), "firstDataVersion", "kdvVBzzgOS");
        setField(term137023, term137023.getClass(), "firstPlayDate", "cwXRILYula");
        setField(term137023, term137023.getClass(), "compatibleCmVersion", "GRIytmuHxn");
        setField(term137023, term137023.getClass(), "dailyBonusDate", "kTzFRQAqyW");
        setField(term137023, term137023.getClass(), "dailyCourseBonusDate", "VHZcekDeFJ");
        setField(term137023, term137023.getClass(), "lastPairLoginDate", "JpemqlOPQk");
        setField(term137023, term137023.getClass(), "lastTrialPlayDate", "wZMPsUUQHd");
        setIntField(term137023, term137023.getClass(), "playVsCount", -1058580635);
        setIntField(term137023, term137023.getClass(), "playSyncCount", 1737604630);
        setIntField(term137023, term137023.getClass(), "winCount", 1363336854);
        setIntField(term137023, term137023.getClass(), "helpCount", 649098774);
        setIntField(term137023, term137023.getClass(), "comboCount", 394089806);
        setLongField(term137023, term137023.getClass(), "totalDeluxscore", 1795121082914093827L);
        setLongField(term137023, term137023.getClass(), "totalBasicDeluxscore", 4695542955666419066L);
        setLongField(term137023, term137023.getClass(), "totalAdvancedDeluxscore", 5184136181588829179L);
        setLongField(term137023, term137023.getClass(), "totalExpertDeluxscore", -6782013692212067743L);
        setLongField(term137023, term137023.getClass(), "totalMasterDeluxscore", 8691781742778305794L);
        setLongField(term137023, term137023.getClass(), "totalReMasterDeluxscore", 8232658097064806470L);
        setIntField(term137023, term137023.getClass(), "totalSync", 1726963667);
        setIntField(term137023, term137023.getClass(), "totalBasicSync", 1456425179);
        setIntField(term137023, term137023.getClass(), "totalAdvancedSync", -709895123);
        setIntField(term137023, term137023.getClass(), "totalExpertSync", -1519932258);
        setIntField(term137023, term137023.getClass(), "totalMasterSync", 1214021948);
        setIntField(term137023, term137023.getClass(), "totalReMasterSync", -795117444);
        setLongField(term137023, term137023.getClass(), "totalAchievement", 2299320555486744104L);
        setLongField(term137023, term137023.getClass(), "totalBasicAchievement", -7923304208284039427L);
        setLongField(term137023, term137023.getClass(), "totalAdvancedAchievement", 1614428480983807273L);
        setLongField(term137023, term137023.getClass(), "totalExpertAchievement", 2399810728701767602L);
        setLongField(term137023, term137023.getClass(), "totalMasterAchievement", 1731037220890873295L);
        setLongField(term137023, term137023.getClass(), "totalReMasterAchievement", 9096957387179242981L);
        setLongField(term137023, term137023.getClass(), "playerOldRating", -6089052616730866540L);
        setLongField(term137023, term137023.getClass(), "playerNewRating", 6239531663351903414L);
        setIntField(term137023, term137023.getClass(), "banState", -1609134843);
        setLongField(term137023, term137023.getClass(), "dateTime", -3213625856614760566L);
        setField(term137021, term137021.getClass(), "user", term137023);
        setField(term137021, term137021.getClass(), "propertyKey", "kfQRMGKNWd");
        setField(term137021, term137021.getClass(), "propertyValue", "DmPsloRwDO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VELROAvnmN";
        callMethod(klass, "setPropertyKey", argTypes, term137021, args);
    }

};


