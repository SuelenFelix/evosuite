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

public class UserDetail_setCourseRank_34612263194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248802;
     Object term249169;

    public UserDetail_setCourseRank_34612263194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248806 = new Long(1193381106528373019L);
        Integer term248869 = new Integer(1599041316);
        Integer term248871 = new Integer(1478113587);
        Integer term248873 = new Integer(1580986308);
        Integer term248875 = new Integer(-870011438);
        Integer term248877 = new Integer(-1767217325);
        ArrayList term248867 = new ArrayList();
        ((ArrayList) term248867).add(term248869);
        ((ArrayList) term248867).add(term248871);
        ((ArrayList) term248867).add(term248873);
        ((ArrayList) term248867).add(term248875);
        ((ArrayList) term248867).add(term248877);
        Integer term248883 = new Integer(-170630873);
        Integer term248885 = new Integer(-1246900588);
        Integer term248887 = new Integer(548633933);
        Integer term248889 = new Integer(-1532179986);
        Integer term248891 = new Integer(1644599689);
        Integer term248893 = new Integer(1665477880);
        Integer term248895 = new Integer(2044728583);
        Integer term248897 = new Integer(64790905);
        Integer term248899 = new Integer(-1199056049);
        ArrayList term248881 = new ArrayList();
        ((ArrayList) term248881).add(term248883);
        ((ArrayList) term248881).add(term248885);
        ((ArrayList) term248881).add(term248887);
        ((ArrayList) term248881).add(term248889);
        ((ArrayList) term248881).add(term248891);
        ((ArrayList) term248881).add(term248893);
        ((ArrayList) term248881).add(term248895);
        ((ArrayList) term248881).add(term248897);
        ((ArrayList) term248881).add(term248899);
        term248802 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term248804 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term248820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248835 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term248802, term248802.getClass(), "id", 4834275368724514974L);
        setLongField(term248804, term248804.getClass(), "id", 5108277927978722079L);
        setField(term248804, term248804.getClass(), "extId", term248806);
        setField(term248804, term248804.getClass(), "luid", "IBmkVoFQfR");
        setIntField(term248821, term248821.getClass(), "year", 2029);
        setShortField(term248821, term248821.getClass(), "month", (short) 8);
        setShortField(term248821, term248821.getClass(), "day", (short) 27);
        setField(term248820, term248820.getClass(), "date", term248821);
        setByteField(term248825, term248825.getClass(), "hour", (byte) 10);
        setByteField(term248825, term248825.getClass(), "minute", (byte) 54);
        setByteField(term248825, term248825.getClass(), "second", (byte) 17);
        setIntField(term248825, term248825.getClass(), "nano", 953558700);
        setField(term248820, term248820.getClass(), "time", term248825);
        setField(term248804, term248804.getClass(), "registerTime", term248820);
        setIntField(term248831, term248831.getClass(), "year", 2012);
        setShortField(term248831, term248831.getClass(), "month", (short) 1);
        setShortField(term248831, term248831.getClass(), "day", (short) 12);
        setField(term248830, term248830.getClass(), "date", term248831);
        setByteField(term248835, term248835.getClass(), "hour", (byte) 16);
        setByteField(term248835, term248835.getClass(), "minute", (byte) 4);
        setByteField(term248835, term248835.getClass(), "second", (byte) 10);
        setIntField(term248835, term248835.getClass(), "nano", 245911854);
        setField(term248830, term248830.getClass(), "time", term248835);
        setField(term248804, term248804.getClass(), "accessTime", term248830);
        setField(term248802, term248802.getClass(), "card", term248804);
        setField(term248802, term248802.getClass(), "userName", "fvqExLyjOZ");
        setIntField(term248802, term248802.getClass(), "isNetMember", -915338342);
        setIntField(term248802, term248802.getClass(), "iconId", -1236327658);
        setIntField(term248802, term248802.getClass(), "plateId", -2078413069);
        setIntField(term248802, term248802.getClass(), "titleId", -658767923);
        setIntField(term248802, term248802.getClass(), "partnerId", -1161978855);
        setIntField(term248802, term248802.getClass(), "frameId", -1139637537);
        setIntField(term248802, term248802.getClass(), "selectMapId", 874187704);
        setIntField(term248802, term248802.getClass(), "totalAwake", -1225225379);
        setIntField(term248802, term248802.getClass(), "gradeRating", 161275630);
        setIntField(term248802, term248802.getClass(), "musicRating", -914981551);
        setIntField(term248802, term248802.getClass(), "playerRating", -1477457516);
        setIntField(term248802, term248802.getClass(), "highestRating", 936008693);
        setIntField(term248802, term248802.getClass(), "gradeRank", -194054691);
        setIntField(term248802, term248802.getClass(), "classRank", -2077227809);
        setIntField(term248802, term248802.getClass(), "courseRank", 93661051);
        setField(term248802, term248802.getClass(), "charaSlot", term248867);
        setField(term248802, term248802.getClass(), "charaLockSlot", term248881);
        setLongField(term248802, term248802.getClass(), "contentBit", -8924727405210277159L);
        setIntField(term248802, term248802.getClass(), "playCount", 1214044941);
        setField(term248802, term248802.getClass(), "eventWatchedDate", "XkzjjKogww");
        setField(term248802, term248802.getClass(), "lastGameId", "twjymkvbft");
        setField(term248802, term248802.getClass(), "lastRomVersion", "YwLqpBnVFV");
        setField(term248802, term248802.getClass(), "lastDataVersion", "brGgmTeuRs");
        setField(term248802, term248802.getClass(), "lastLoginDate", "zMLmSyuwNB");
        setField(term248802, term248802.getClass(), "lastPlayDate", "QtjqcVtEVk");
        setIntField(term248802, term248802.getClass(), "lastPlayCredit", 98530468);
        setIntField(term248802, term248802.getClass(), "lastPlayMode", 1859361838);
        setIntField(term248802, term248802.getClass(), "lastPlaceId", -92170830);
        setField(term248802, term248802.getClass(), "lastPlaceName", "KggRnGvBBV");
        setIntField(term248802, term248802.getClass(), "lastAllNetId", 1164416932);
        setIntField(term248802, term248802.getClass(), "lastRegionId", -1789747143);
        setField(term248802, term248802.getClass(), "lastRegionName", "xqIPePiGzm");
        setField(term248802, term248802.getClass(), "lastClientId", "aTdFvWUkRg");
        setField(term248802, term248802.getClass(), "lastCountryCode", "EvatbEpuBU");
        setIntField(term248802, term248802.getClass(), "lastSelectEMoney", 148921868);
        setIntField(term248802, term248802.getClass(), "lastSelectTicket", 913346742);
        setIntField(term248802, term248802.getClass(), "lastSelectCourse", 428085587);
        setIntField(term248802, term248802.getClass(), "lastCountCourse", 1414585941);
        setField(term248802, term248802.getClass(), "firstGameId", "HKZGEhlODe");
        setField(term248802, term248802.getClass(), "firstRomVersion", "Brehxsxqlu");
        setField(term248802, term248802.getClass(), "firstDataVersion", "YJjLEIFIXz");
        setField(term248802, term248802.getClass(), "firstPlayDate", "EUOVVchCuH");
        setField(term248802, term248802.getClass(), "compatibleCmVersion", "YBEjtwoXAa");
        setField(term248802, term248802.getClass(), "dailyBonusDate", "hcUrfXxUyU");
        setField(term248802, term248802.getClass(), "dailyCourseBonusDate", "EbtBgsMrVm");
        setField(term248802, term248802.getClass(), "lastPairLoginDate", "ReSzglHqbI");
        setField(term248802, term248802.getClass(), "lastTrialPlayDate", "CfqOwyPntO");
        setIntField(term248802, term248802.getClass(), "playVsCount", -782298976);
        setIntField(term248802, term248802.getClass(), "playSyncCount", 1078888028);
        setIntField(term248802, term248802.getClass(), "winCount", 1252827294);
        setIntField(term248802, term248802.getClass(), "helpCount", 398137653);
        setIntField(term248802, term248802.getClass(), "comboCount", -192759837);
        setLongField(term248802, term248802.getClass(), "totalDeluxscore", 4126261898778480160L);
        setLongField(term248802, term248802.getClass(), "totalBasicDeluxscore", 2026386939614428760L);
        setLongField(term248802, term248802.getClass(), "totalAdvancedDeluxscore", 1593290567494068392L);
        setLongField(term248802, term248802.getClass(), "totalExpertDeluxscore", 6537030931849100654L);
        setLongField(term248802, term248802.getClass(), "totalMasterDeluxscore", 889190265054601763L);
        setLongField(term248802, term248802.getClass(), "totalReMasterDeluxscore", -1748968666517850718L);
        setIntField(term248802, term248802.getClass(), "totalSync", 1109092665);
        setIntField(term248802, term248802.getClass(), "totalBasicSync", -229568371);
        setIntField(term248802, term248802.getClass(), "totalAdvancedSync", -419751009);
        setIntField(term248802, term248802.getClass(), "totalExpertSync", -2120524978);
        setIntField(term248802, term248802.getClass(), "totalMasterSync", 2027460163);
        setIntField(term248802, term248802.getClass(), "totalReMasterSync", 220380539);
        setLongField(term248802, term248802.getClass(), "totalAchievement", -8431596385067559706L);
        setLongField(term248802, term248802.getClass(), "totalBasicAchievement", 1257767683889028789L);
        setLongField(term248802, term248802.getClass(), "totalAdvancedAchievement", -853309580184920356L);
        setLongField(term248802, term248802.getClass(), "totalExpertAchievement", -3550172249194619421L);
        setLongField(term248802, term248802.getClass(), "totalMasterAchievement", -4494895151093686171L);
        setLongField(term248802, term248802.getClass(), "totalReMasterAchievement", -2606856029280519831L);
        setLongField(term248802, term248802.getClass(), "playerOldRating", 3497997043676267898L);
        setLongField(term248802, term248802.getClass(), "playerNewRating", -5468317490114133945L);
        setIntField(term248802, term248802.getClass(), "banState", -1659950814);
        setLongField(term248802, term248802.getClass(), "dateTime", 3619014135176002836L);
        term249169 = new Integer(-1098714411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term249169;
        callMethod(klass, "setCourseRank", argTypes, term248802, args);
    }

};


