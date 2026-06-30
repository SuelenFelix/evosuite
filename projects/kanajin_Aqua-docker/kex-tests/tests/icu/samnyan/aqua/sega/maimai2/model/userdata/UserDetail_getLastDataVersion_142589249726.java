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

public class UserDetail_getLastDataVersion_142589249726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209782;

    public UserDetail_getLastDataVersion_142589249726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209786 = new Long(-7983954942068142191L);
        Integer term209849 = new Integer(-1559804880);
        Integer term209851 = new Integer(420300457);
        Integer term209853 = new Integer(804843661);
        Integer term209855 = new Integer(1968236726);
        ArrayList term209847 = new ArrayList();
        ((ArrayList) term209847).add(term209849);
        ((ArrayList) term209847).add(term209851);
        ((ArrayList) term209847).add(term209853);
        ((ArrayList) term209847).add(term209855);
        Integer term209861 = new Integer(-1080686915);
        Integer term209863 = new Integer(-1329496162);
        Integer term209865 = new Integer(-1181178091);
        Integer term209867 = new Integer(797166053);
        Integer term209869 = new Integer(-1145342603);
        Integer term209871 = new Integer(-1135326582);
        Integer term209873 = new Integer(594267051);
        Integer term209875 = new Integer(-1225303838);
        ArrayList term209859 = new ArrayList();
        ((ArrayList) term209859).add(term209861);
        ((ArrayList) term209859).add(term209863);
        ((ArrayList) term209859).add(term209865);
        ((ArrayList) term209859).add(term209867);
        ((ArrayList) term209859).add(term209869);
        ((ArrayList) term209859).add(term209871);
        ((ArrayList) term209859).add(term209873);
        ((ArrayList) term209859).add(term209875);
        term209782 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term209784 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209815 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209782, term209782.getClass(), "id", 4440178585288161892L);
        setLongField(term209784, term209784.getClass(), "id", -712345822871055137L);
        setField(term209784, term209784.getClass(), "extId", term209786);
        setField(term209784, term209784.getClass(), "luid", "kNYoaOPXRc");
        setIntField(term209801, term209801.getClass(), "year", 2012);
        setShortField(term209801, term209801.getClass(), "month", (short) 8);
        setShortField(term209801, term209801.getClass(), "day", (short) 31);
        setField(term209800, term209800.getClass(), "date", term209801);
        setByteField(term209805, term209805.getClass(), "hour", (byte) 17);
        setByteField(term209805, term209805.getClass(), "minute", (byte) 11);
        setByteField(term209805, term209805.getClass(), "second", (byte) 29);
        setIntField(term209805, term209805.getClass(), "nano", 462334388);
        setField(term209800, term209800.getClass(), "time", term209805);
        setField(term209784, term209784.getClass(), "registerTime", term209800);
        setIntField(term209811, term209811.getClass(), "year", 2027);
        setShortField(term209811, term209811.getClass(), "month", (short) 11);
        setShortField(term209811, term209811.getClass(), "day", (short) 28);
        setField(term209810, term209810.getClass(), "date", term209811);
        setByteField(term209815, term209815.getClass(), "hour", (byte) 23);
        setByteField(term209815, term209815.getClass(), "minute", (byte) 7);
        setByteField(term209815, term209815.getClass(), "second", (byte) 56);
        setIntField(term209815, term209815.getClass(), "nano", 948648524);
        setField(term209810, term209810.getClass(), "time", term209815);
        setField(term209784, term209784.getClass(), "accessTime", term209810);
        setField(term209782, term209782.getClass(), "card", term209784);
        setField(term209782, term209782.getClass(), "userName", "tYZxePZIvy");
        setIntField(term209782, term209782.getClass(), "isNetMember", -1525849749);
        setIntField(term209782, term209782.getClass(), "iconId", -1011327507);
        setIntField(term209782, term209782.getClass(), "plateId", -378080115);
        setIntField(term209782, term209782.getClass(), "titleId", 1202464107);
        setIntField(term209782, term209782.getClass(), "partnerId", -1327144256);
        setIntField(term209782, term209782.getClass(), "frameId", -126708360);
        setIntField(term209782, term209782.getClass(), "selectMapId", -1492561928);
        setIntField(term209782, term209782.getClass(), "totalAwake", 14544336);
        setIntField(term209782, term209782.getClass(), "gradeRating", 1884335890);
        setIntField(term209782, term209782.getClass(), "musicRating", -848097424);
        setIntField(term209782, term209782.getClass(), "playerRating", 1737457363);
        setIntField(term209782, term209782.getClass(), "highestRating", 72159811);
        setIntField(term209782, term209782.getClass(), "gradeRank", 1883446311);
        setIntField(term209782, term209782.getClass(), "classRank", -1769314512);
        setIntField(term209782, term209782.getClass(), "courseRank", -1007583316);
        setField(term209782, term209782.getClass(), "charaSlot", term209847);
        setField(term209782, term209782.getClass(), "charaLockSlot", term209859);
        setLongField(term209782, term209782.getClass(), "contentBit", 8775889542973840958L);
        setIntField(term209782, term209782.getClass(), "playCount", -2097129486);
        setField(term209782, term209782.getClass(), "eventWatchedDate", "kvHeZIxKeu");
        setField(term209782, term209782.getClass(), "lastGameId", "sFuwqpHtuJ");
        setField(term209782, term209782.getClass(), "lastRomVersion", "bMJcegMICR");
        setField(term209782, term209782.getClass(), "lastDataVersion", "ISmVucBSqp");
        setField(term209782, term209782.getClass(), "lastLoginDate", "zJfxfAWdxN");
        setField(term209782, term209782.getClass(), "lastPlayDate", "lPOtrbBtKg");
        setIntField(term209782, term209782.getClass(), "lastPlayCredit", 906821588);
        setIntField(term209782, term209782.getClass(), "lastPlayMode", -1915430818);
        setIntField(term209782, term209782.getClass(), "lastPlaceId", -1119861207);
        setField(term209782, term209782.getClass(), "lastPlaceName", "DoQKZouOMo");
        setIntField(term209782, term209782.getClass(), "lastAllNetId", 1746807042);
        setIntField(term209782, term209782.getClass(), "lastRegionId", 357981547);
        setField(term209782, term209782.getClass(), "lastRegionName", "eBKpRbeIXG");
        setField(term209782, term209782.getClass(), "lastClientId", "ImITtFnAXw");
        setField(term209782, term209782.getClass(), "lastCountryCode", "NxaXDGmFox");
        setIntField(term209782, term209782.getClass(), "lastSelectEMoney", 426955084);
        setIntField(term209782, term209782.getClass(), "lastSelectTicket", -335419483);
        setIntField(term209782, term209782.getClass(), "lastSelectCourse", 1557694351);
        setIntField(term209782, term209782.getClass(), "lastCountCourse", 1469773425);
        setField(term209782, term209782.getClass(), "firstGameId", "wNfCoECSdJ");
        setField(term209782, term209782.getClass(), "firstRomVersion", "tCNdSxfOaB");
        setField(term209782, term209782.getClass(), "firstDataVersion", "MGMcdMpSfC");
        setField(term209782, term209782.getClass(), "firstPlayDate", "kMdSIzbJlX");
        setField(term209782, term209782.getClass(), "compatibleCmVersion", "SjYMHgEWRM");
        setField(term209782, term209782.getClass(), "dailyBonusDate", "KZGFIzWwqH");
        setField(term209782, term209782.getClass(), "dailyCourseBonusDate", "AelQdYRmHZ");
        setField(term209782, term209782.getClass(), "lastPairLoginDate", "bOPaMsPSyq");
        setField(term209782, term209782.getClass(), "lastTrialPlayDate", "slpsXDdiXm");
        setIntField(term209782, term209782.getClass(), "playVsCount", -1873950815);
        setIntField(term209782, term209782.getClass(), "playSyncCount", 1580956926);
        setIntField(term209782, term209782.getClass(), "winCount", 989244656);
        setIntField(term209782, term209782.getClass(), "helpCount", 1888105108);
        setIntField(term209782, term209782.getClass(), "comboCount", 507720504);
        setLongField(term209782, term209782.getClass(), "totalDeluxscore", -8923763886552559588L);
        setLongField(term209782, term209782.getClass(), "totalBasicDeluxscore", 4612473616346653819L);
        setLongField(term209782, term209782.getClass(), "totalAdvancedDeluxscore", -8556382140453315552L);
        setLongField(term209782, term209782.getClass(), "totalExpertDeluxscore", -1386007688006767393L);
        setLongField(term209782, term209782.getClass(), "totalMasterDeluxscore", 2287382827132184696L);
        setLongField(term209782, term209782.getClass(), "totalReMasterDeluxscore", -8318569845287747350L);
        setIntField(term209782, term209782.getClass(), "totalSync", 1565969836);
        setIntField(term209782, term209782.getClass(), "totalBasicSync", -1245521601);
        setIntField(term209782, term209782.getClass(), "totalAdvancedSync", 1500058331);
        setIntField(term209782, term209782.getClass(), "totalExpertSync", -112602297);
        setIntField(term209782, term209782.getClass(), "totalMasterSync", -2142300138);
        setIntField(term209782, term209782.getClass(), "totalReMasterSync", -662235369);
        setLongField(term209782, term209782.getClass(), "totalAchievement", 9045344704342547818L);
        setLongField(term209782, term209782.getClass(), "totalBasicAchievement", 5942753047636183902L);
        setLongField(term209782, term209782.getClass(), "totalAdvancedAchievement", 7791871566240418066L);
        setLongField(term209782, term209782.getClass(), "totalExpertAchievement", -692884341060238338L);
        setLongField(term209782, term209782.getClass(), "totalMasterAchievement", 2232149240312314574L);
        setLongField(term209782, term209782.getClass(), "totalReMasterAchievement", -910028567124995177L);
        setLongField(term209782, term209782.getClass(), "playerOldRating", -6151081500934360869L);
        setLongField(term209782, term209782.getClass(), "playerNewRating", -4961555175995886525L);
        setIntField(term209782, term209782.getClass(), "banState", -188505057);
        setLongField(term209782, term209782.getClass(), "dateTime", 442340053526281280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term209782, args);
    }

};


