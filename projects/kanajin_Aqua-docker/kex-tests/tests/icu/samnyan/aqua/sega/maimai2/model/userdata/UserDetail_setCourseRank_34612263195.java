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

public class UserDetail_setCourseRank_34612263195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248857;
     Object term249224;

    public UserDetail_setCourseRank_34612263195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248861 = new Long(1193381106528373019L);
        Integer term248924 = new Integer(1599041316);
        Integer term248926 = new Integer(1478113587);
        Integer term248928 = new Integer(1580986308);
        Integer term248930 = new Integer(-870011438);
        Integer term248932 = new Integer(-1767217325);
        ArrayList term248922 = new ArrayList();
        ((ArrayList) term248922).add(term248924);
        ((ArrayList) term248922).add(term248926);
        ((ArrayList) term248922).add(term248928);
        ((ArrayList) term248922).add(term248930);
        ((ArrayList) term248922).add(term248932);
        Integer term248938 = new Integer(-170630873);
        Integer term248940 = new Integer(-1246900588);
        Integer term248942 = new Integer(548633933);
        Integer term248944 = new Integer(-1532179986);
        Integer term248946 = new Integer(1644599689);
        Integer term248948 = new Integer(1665477880);
        Integer term248950 = new Integer(2044728583);
        Integer term248952 = new Integer(64790905);
        Integer term248954 = new Integer(-1199056049);
        ArrayList term248936 = new ArrayList();
        ((ArrayList) term248936).add(term248938);
        ((ArrayList) term248936).add(term248940);
        ((ArrayList) term248936).add(term248942);
        ((ArrayList) term248936).add(term248944);
        ((ArrayList) term248936).add(term248946);
        ((ArrayList) term248936).add(term248948);
        ((ArrayList) term248936).add(term248950);
        ((ArrayList) term248936).add(term248952);
        ((ArrayList) term248936).add(term248954);
        term248857 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term248859 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term248875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248890 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term248857, term248857.getClass(), "id", 4834275368724514974L);
        setLongField(term248859, term248859.getClass(), "id", 5108277927978722079L);
        setField(term248859, term248859.getClass(), "extId", term248861);
        setField(term248859, term248859.getClass(), "luid", "IBmkVoFQfR");
        setIntField(term248876, term248876.getClass(), "year", 2029);
        setShortField(term248876, term248876.getClass(), "month", (short) 8);
        setShortField(term248876, term248876.getClass(), "day", (short) 27);
        setField(term248875, term248875.getClass(), "date", term248876);
        setByteField(term248880, term248880.getClass(), "hour", (byte) 10);
        setByteField(term248880, term248880.getClass(), "minute", (byte) 54);
        setByteField(term248880, term248880.getClass(), "second", (byte) 17);
        setIntField(term248880, term248880.getClass(), "nano", 953558700);
        setField(term248875, term248875.getClass(), "time", term248880);
        setField(term248859, term248859.getClass(), "registerTime", term248875);
        setIntField(term248886, term248886.getClass(), "year", 2012);
        setShortField(term248886, term248886.getClass(), "month", (short) 1);
        setShortField(term248886, term248886.getClass(), "day", (short) 12);
        setField(term248885, term248885.getClass(), "date", term248886);
        setByteField(term248890, term248890.getClass(), "hour", (byte) 16);
        setByteField(term248890, term248890.getClass(), "minute", (byte) 4);
        setByteField(term248890, term248890.getClass(), "second", (byte) 10);
        setIntField(term248890, term248890.getClass(), "nano", 245911854);
        setField(term248885, term248885.getClass(), "time", term248890);
        setField(term248859, term248859.getClass(), "accessTime", term248885);
        setField(term248857, term248857.getClass(), "card", term248859);
        setField(term248857, term248857.getClass(), "userName", "fvqExLyjOZ");
        setIntField(term248857, term248857.getClass(), "isNetMember", -915338342);
        setIntField(term248857, term248857.getClass(), "iconId", -1236327658);
        setIntField(term248857, term248857.getClass(), "plateId", -2078413069);
        setIntField(term248857, term248857.getClass(), "titleId", -658767923);
        setIntField(term248857, term248857.getClass(), "partnerId", -1161978855);
        setIntField(term248857, term248857.getClass(), "frameId", -1139637537);
        setIntField(term248857, term248857.getClass(), "selectMapId", 874187704);
        setIntField(term248857, term248857.getClass(), "totalAwake", -1225225379);
        setIntField(term248857, term248857.getClass(), "gradeRating", 161275630);
        setIntField(term248857, term248857.getClass(), "musicRating", -914981551);
        setIntField(term248857, term248857.getClass(), "playerRating", -1477457516);
        setIntField(term248857, term248857.getClass(), "highestRating", 936008693);
        setIntField(term248857, term248857.getClass(), "gradeRank", -194054691);
        setIntField(term248857, term248857.getClass(), "classRank", -2077227809);
        setIntField(term248857, term248857.getClass(), "courseRank", 93661051);
        setField(term248857, term248857.getClass(), "charaSlot", term248922);
        setField(term248857, term248857.getClass(), "charaLockSlot", term248936);
        setLongField(term248857, term248857.getClass(), "contentBit", -8924727405210277159L);
        setIntField(term248857, term248857.getClass(), "playCount", 1214044941);
        setField(term248857, term248857.getClass(), "eventWatchedDate", "XkzjjKogww");
        setField(term248857, term248857.getClass(), "lastGameId", "twjymkvbft");
        setField(term248857, term248857.getClass(), "lastRomVersion", "YwLqpBnVFV");
        setField(term248857, term248857.getClass(), "lastDataVersion", "brGgmTeuRs");
        setField(term248857, term248857.getClass(), "lastLoginDate", "zMLmSyuwNB");
        setField(term248857, term248857.getClass(), "lastPlayDate", "QtjqcVtEVk");
        setIntField(term248857, term248857.getClass(), "lastPlayCredit", 98530468);
        setIntField(term248857, term248857.getClass(), "lastPlayMode", 1859361838);
        setIntField(term248857, term248857.getClass(), "lastPlaceId", -92170830);
        setField(term248857, term248857.getClass(), "lastPlaceName", "KggRnGvBBV");
        setIntField(term248857, term248857.getClass(), "lastAllNetId", 1164416932);
        setIntField(term248857, term248857.getClass(), "lastRegionId", -1789747143);
        setField(term248857, term248857.getClass(), "lastRegionName", "xqIPePiGzm");
        setField(term248857, term248857.getClass(), "lastClientId", "aTdFvWUkRg");
        setField(term248857, term248857.getClass(), "lastCountryCode", "EvatbEpuBU");
        setIntField(term248857, term248857.getClass(), "lastSelectEMoney", 148921868);
        setIntField(term248857, term248857.getClass(), "lastSelectTicket", 913346742);
        setIntField(term248857, term248857.getClass(), "lastSelectCourse", 428085587);
        setIntField(term248857, term248857.getClass(), "lastCountCourse", 1414585941);
        setField(term248857, term248857.getClass(), "firstGameId", "HKZGEhlODe");
        setField(term248857, term248857.getClass(), "firstRomVersion", "Brehxsxqlu");
        setField(term248857, term248857.getClass(), "firstDataVersion", "YJjLEIFIXz");
        setField(term248857, term248857.getClass(), "firstPlayDate", "EUOVVchCuH");
        setField(term248857, term248857.getClass(), "compatibleCmVersion", "YBEjtwoXAa");
        setField(term248857, term248857.getClass(), "dailyBonusDate", "hcUrfXxUyU");
        setField(term248857, term248857.getClass(), "dailyCourseBonusDate", "EbtBgsMrVm");
        setField(term248857, term248857.getClass(), "lastPairLoginDate", "ReSzglHqbI");
        setField(term248857, term248857.getClass(), "lastTrialPlayDate", "CfqOwyPntO");
        setIntField(term248857, term248857.getClass(), "playVsCount", -782298976);
        setIntField(term248857, term248857.getClass(), "playSyncCount", 1078888028);
        setIntField(term248857, term248857.getClass(), "winCount", 1252827294);
        setIntField(term248857, term248857.getClass(), "helpCount", 398137653);
        setIntField(term248857, term248857.getClass(), "comboCount", -192759837);
        setLongField(term248857, term248857.getClass(), "totalDeluxscore", 4126261898778480160L);
        setLongField(term248857, term248857.getClass(), "totalBasicDeluxscore", 2026386939614428760L);
        setLongField(term248857, term248857.getClass(), "totalAdvancedDeluxscore", 1593290567494068392L);
        setLongField(term248857, term248857.getClass(), "totalExpertDeluxscore", 6537030931849100654L);
        setLongField(term248857, term248857.getClass(), "totalMasterDeluxscore", 889190265054601763L);
        setLongField(term248857, term248857.getClass(), "totalReMasterDeluxscore", -1748968666517850718L);
        setIntField(term248857, term248857.getClass(), "totalSync", 1109092665);
        setIntField(term248857, term248857.getClass(), "totalBasicSync", -229568371);
        setIntField(term248857, term248857.getClass(), "totalAdvancedSync", -419751009);
        setIntField(term248857, term248857.getClass(), "totalExpertSync", -2120524978);
        setIntField(term248857, term248857.getClass(), "totalMasterSync", 2027460163);
        setIntField(term248857, term248857.getClass(), "totalReMasterSync", 220380539);
        setLongField(term248857, term248857.getClass(), "totalAchievement", -8431596385067559706L);
        setLongField(term248857, term248857.getClass(), "totalBasicAchievement", 1257767683889028789L);
        setLongField(term248857, term248857.getClass(), "totalAdvancedAchievement", -853309580184920356L);
        setLongField(term248857, term248857.getClass(), "totalExpertAchievement", -3550172249194619421L);
        setLongField(term248857, term248857.getClass(), "totalMasterAchievement", -4494895151093686171L);
        setLongField(term248857, term248857.getClass(), "totalReMasterAchievement", -2606856029280519831L);
        setLongField(term248857, term248857.getClass(), "playerOldRating", 3497997043676267898L);
        setLongField(term248857, term248857.getClass(), "playerNewRating", -5468317490114133945L);
        setIntField(term248857, term248857.getClass(), "banState", -1659950814);
        setLongField(term248857, term248857.getClass(), "dateTime", 3619014135176002836L);
        term249224 = new Integer(-1098714411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term249224;
        callMethod(klass, "setCourseRank", argTypes, term248857, args);
    }

};


