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

public class UserDetail_getLastDataVersion_142589249725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209727;

    public UserDetail_getLastDataVersion_142589249725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209731 = new Long(-7983954942068142191L);
        Integer term209794 = new Integer(-1559804880);
        Integer term209796 = new Integer(420300457);
        Integer term209798 = new Integer(804843661);
        Integer term209800 = new Integer(1968236726);
        ArrayList term209792 = new ArrayList();
        ((ArrayList) term209792).add(term209794);
        ((ArrayList) term209792).add(term209796);
        ((ArrayList) term209792).add(term209798);
        ((ArrayList) term209792).add(term209800);
        Integer term209806 = new Integer(-1080686915);
        Integer term209808 = new Integer(-1329496162);
        Integer term209810 = new Integer(-1181178091);
        Integer term209812 = new Integer(797166053);
        Integer term209814 = new Integer(-1145342603);
        Integer term209816 = new Integer(-1135326582);
        Integer term209818 = new Integer(594267051);
        Integer term209820 = new Integer(-1225303838);
        ArrayList term209804 = new ArrayList();
        ((ArrayList) term209804).add(term209806);
        ((ArrayList) term209804).add(term209808);
        ((ArrayList) term209804).add(term209810);
        ((ArrayList) term209804).add(term209812);
        ((ArrayList) term209804).add(term209814);
        ((ArrayList) term209804).add(term209816);
        ((ArrayList) term209804).add(term209818);
        ((ArrayList) term209804).add(term209820);
        term209727 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term209729 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209760 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209727, term209727.getClass(), "id", 4440178585288161892L);
        setLongField(term209729, term209729.getClass(), "id", -712345822871055137L);
        setField(term209729, term209729.getClass(), "extId", term209731);
        setField(term209729, term209729.getClass(), "luid", "kNYoaOPXRc");
        setIntField(term209746, term209746.getClass(), "year", 2012);
        setShortField(term209746, term209746.getClass(), "month", (short) 8);
        setShortField(term209746, term209746.getClass(), "day", (short) 31);
        setField(term209745, term209745.getClass(), "date", term209746);
        setByteField(term209750, term209750.getClass(), "hour", (byte) 17);
        setByteField(term209750, term209750.getClass(), "minute", (byte) 11);
        setByteField(term209750, term209750.getClass(), "second", (byte) 29);
        setIntField(term209750, term209750.getClass(), "nano", 462334388);
        setField(term209745, term209745.getClass(), "time", term209750);
        setField(term209729, term209729.getClass(), "registerTime", term209745);
        setIntField(term209756, term209756.getClass(), "year", 2027);
        setShortField(term209756, term209756.getClass(), "month", (short) 11);
        setShortField(term209756, term209756.getClass(), "day", (short) 28);
        setField(term209755, term209755.getClass(), "date", term209756);
        setByteField(term209760, term209760.getClass(), "hour", (byte) 23);
        setByteField(term209760, term209760.getClass(), "minute", (byte) 7);
        setByteField(term209760, term209760.getClass(), "second", (byte) 56);
        setIntField(term209760, term209760.getClass(), "nano", 948648524);
        setField(term209755, term209755.getClass(), "time", term209760);
        setField(term209729, term209729.getClass(), "accessTime", term209755);
        setField(term209727, term209727.getClass(), "card", term209729);
        setField(term209727, term209727.getClass(), "userName", "tYZxePZIvy");
        setIntField(term209727, term209727.getClass(), "isNetMember", -1525849749);
        setIntField(term209727, term209727.getClass(), "iconId", -1011327507);
        setIntField(term209727, term209727.getClass(), "plateId", -378080115);
        setIntField(term209727, term209727.getClass(), "titleId", 1202464107);
        setIntField(term209727, term209727.getClass(), "partnerId", -1327144256);
        setIntField(term209727, term209727.getClass(), "frameId", -126708360);
        setIntField(term209727, term209727.getClass(), "selectMapId", -1492561928);
        setIntField(term209727, term209727.getClass(), "totalAwake", 14544336);
        setIntField(term209727, term209727.getClass(), "gradeRating", 1884335890);
        setIntField(term209727, term209727.getClass(), "musicRating", -848097424);
        setIntField(term209727, term209727.getClass(), "playerRating", 1737457363);
        setIntField(term209727, term209727.getClass(), "highestRating", 72159811);
        setIntField(term209727, term209727.getClass(), "gradeRank", 1883446311);
        setIntField(term209727, term209727.getClass(), "classRank", -1769314512);
        setIntField(term209727, term209727.getClass(), "courseRank", -1007583316);
        setField(term209727, term209727.getClass(), "charaSlot", term209792);
        setField(term209727, term209727.getClass(), "charaLockSlot", term209804);
        setLongField(term209727, term209727.getClass(), "contentBit", 8775889542973840958L);
        setIntField(term209727, term209727.getClass(), "playCount", -2097129486);
        setField(term209727, term209727.getClass(), "eventWatchedDate", "kvHeZIxKeu");
        setField(term209727, term209727.getClass(), "lastGameId", "sFuwqpHtuJ");
        setField(term209727, term209727.getClass(), "lastRomVersion", "bMJcegMICR");
        setField(term209727, term209727.getClass(), "lastDataVersion", "ISmVucBSqp");
        setField(term209727, term209727.getClass(), "lastLoginDate", "zJfxfAWdxN");
        setField(term209727, term209727.getClass(), "lastPlayDate", "lPOtrbBtKg");
        setIntField(term209727, term209727.getClass(), "lastPlayCredit", 906821588);
        setIntField(term209727, term209727.getClass(), "lastPlayMode", -1915430818);
        setIntField(term209727, term209727.getClass(), "lastPlaceId", -1119861207);
        setField(term209727, term209727.getClass(), "lastPlaceName", "DoQKZouOMo");
        setIntField(term209727, term209727.getClass(), "lastAllNetId", 1746807042);
        setIntField(term209727, term209727.getClass(), "lastRegionId", 357981547);
        setField(term209727, term209727.getClass(), "lastRegionName", "eBKpRbeIXG");
        setField(term209727, term209727.getClass(), "lastClientId", "ImITtFnAXw");
        setField(term209727, term209727.getClass(), "lastCountryCode", "NxaXDGmFox");
        setIntField(term209727, term209727.getClass(), "lastSelectEMoney", 426955084);
        setIntField(term209727, term209727.getClass(), "lastSelectTicket", -335419483);
        setIntField(term209727, term209727.getClass(), "lastSelectCourse", 1557694351);
        setIntField(term209727, term209727.getClass(), "lastCountCourse", 1469773425);
        setField(term209727, term209727.getClass(), "firstGameId", "wNfCoECSdJ");
        setField(term209727, term209727.getClass(), "firstRomVersion", "tCNdSxfOaB");
        setField(term209727, term209727.getClass(), "firstDataVersion", "MGMcdMpSfC");
        setField(term209727, term209727.getClass(), "firstPlayDate", "kMdSIzbJlX");
        setField(term209727, term209727.getClass(), "compatibleCmVersion", "SjYMHgEWRM");
        setField(term209727, term209727.getClass(), "dailyBonusDate", "KZGFIzWwqH");
        setField(term209727, term209727.getClass(), "dailyCourseBonusDate", "AelQdYRmHZ");
        setField(term209727, term209727.getClass(), "lastPairLoginDate", "bOPaMsPSyq");
        setField(term209727, term209727.getClass(), "lastTrialPlayDate", "slpsXDdiXm");
        setIntField(term209727, term209727.getClass(), "playVsCount", -1873950815);
        setIntField(term209727, term209727.getClass(), "playSyncCount", 1580956926);
        setIntField(term209727, term209727.getClass(), "winCount", 989244656);
        setIntField(term209727, term209727.getClass(), "helpCount", 1888105108);
        setIntField(term209727, term209727.getClass(), "comboCount", 507720504);
        setLongField(term209727, term209727.getClass(), "totalDeluxscore", -8923763886552559588L);
        setLongField(term209727, term209727.getClass(), "totalBasicDeluxscore", 4612473616346653819L);
        setLongField(term209727, term209727.getClass(), "totalAdvancedDeluxscore", -8556382140453315552L);
        setLongField(term209727, term209727.getClass(), "totalExpertDeluxscore", -1386007688006767393L);
        setLongField(term209727, term209727.getClass(), "totalMasterDeluxscore", 2287382827132184696L);
        setLongField(term209727, term209727.getClass(), "totalReMasterDeluxscore", -8318569845287747350L);
        setIntField(term209727, term209727.getClass(), "totalSync", 1565969836);
        setIntField(term209727, term209727.getClass(), "totalBasicSync", -1245521601);
        setIntField(term209727, term209727.getClass(), "totalAdvancedSync", 1500058331);
        setIntField(term209727, term209727.getClass(), "totalExpertSync", -112602297);
        setIntField(term209727, term209727.getClass(), "totalMasterSync", -2142300138);
        setIntField(term209727, term209727.getClass(), "totalReMasterSync", -662235369);
        setLongField(term209727, term209727.getClass(), "totalAchievement", 9045344704342547818L);
        setLongField(term209727, term209727.getClass(), "totalBasicAchievement", 5942753047636183902L);
        setLongField(term209727, term209727.getClass(), "totalAdvancedAchievement", 7791871566240418066L);
        setLongField(term209727, term209727.getClass(), "totalExpertAchievement", -692884341060238338L);
        setLongField(term209727, term209727.getClass(), "totalMasterAchievement", 2232149240312314574L);
        setLongField(term209727, term209727.getClass(), "totalReMasterAchievement", -910028567124995177L);
        setLongField(term209727, term209727.getClass(), "playerOldRating", -6151081500934360869L);
        setLongField(term209727, term209727.getClass(), "playerNewRating", -4961555175995886525L);
        setIntField(term209727, term209727.getClass(), "banState", -188505057);
        setLongField(term209727, term209727.getClass(), "dateTime", 442340053526281280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term209727, args);
    }

};


