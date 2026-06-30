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

public class UserDetail_setTotalBasicSync_811795675140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274808;
     Object term275169;

    public UserDetail_setTotalBasicSync_811795675140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274812 = new Long(-5876259280451647338L);
        Integer term274875 = new Integer(1000587160);
        Integer term274877 = new Integer(1691425223);
        Integer term274879 = new Integer(2086385537);
        Integer term274881 = new Integer(-898458301);
        Integer term274883 = new Integer(-1752896);
        Integer term274885 = new Integer(-1202458563);
        Integer term274887 = new Integer(-974221589);
        Integer term274889 = new Integer(-167704667);
        ArrayList term274873 = new ArrayList();
        ((ArrayList) term274873).add(term274875);
        ((ArrayList) term274873).add(term274877);
        ((ArrayList) term274873).add(term274879);
        ((ArrayList) term274873).add(term274881);
        ((ArrayList) term274873).add(term274883);
        ((ArrayList) term274873).add(term274885);
        ((ArrayList) term274873).add(term274887);
        ((ArrayList) term274873).add(term274889);
        Integer term274895 = new Integer(-820617926);
        Integer term274897 = new Integer(-1871142929);
        Integer term274899 = new Integer(-1594964553);
        ArrayList term274893 = new ArrayList();
        ((ArrayList) term274893).add(term274895);
        ((ArrayList) term274893).add(term274897);
        ((ArrayList) term274893).add(term274899);
        term274808 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term274810 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274841 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274808, term274808.getClass(), "id", 85615018786024272L);
        setLongField(term274810, term274810.getClass(), "id", -24295254511972976L);
        setField(term274810, term274810.getClass(), "extId", term274812);
        setField(term274810, term274810.getClass(), "luid", "EbBIyYIcdK");
        setIntField(term274827, term274827.getClass(), "year", 2022);
        setShortField(term274827, term274827.getClass(), "month", (short) 12);
        setShortField(term274827, term274827.getClass(), "day", (short) 31);
        setField(term274826, term274826.getClass(), "date", term274827);
        setByteField(term274831, term274831.getClass(), "hour", (byte) 12);
        setByteField(term274831, term274831.getClass(), "minute", (byte) 2);
        setByteField(term274831, term274831.getClass(), "second", (byte) 5);
        setIntField(term274831, term274831.getClass(), "nano", 238792504);
        setField(term274826, term274826.getClass(), "time", term274831);
        setField(term274810, term274810.getClass(), "registerTime", term274826);
        setIntField(term274837, term274837.getClass(), "year", 2021);
        setShortField(term274837, term274837.getClass(), "month", (short) 5);
        setShortField(term274837, term274837.getClass(), "day", (short) 16);
        setField(term274836, term274836.getClass(), "date", term274837);
        setByteField(term274841, term274841.getClass(), "hour", (byte) 4);
        setByteField(term274841, term274841.getClass(), "minute", (byte) 27);
        setByteField(term274841, term274841.getClass(), "second", (byte) 14);
        setIntField(term274841, term274841.getClass(), "nano", 585753199);
        setField(term274836, term274836.getClass(), "time", term274841);
        setField(term274810, term274810.getClass(), "accessTime", term274836);
        setField(term274808, term274808.getClass(), "card", term274810);
        setField(term274808, term274808.getClass(), "userName", "gtWJVwJMfO");
        setIntField(term274808, term274808.getClass(), "isNetMember", 1491404701);
        setIntField(term274808, term274808.getClass(), "iconId", 1616183536);
        setIntField(term274808, term274808.getClass(), "plateId", 771552165);
        setIntField(term274808, term274808.getClass(), "titleId", -1365886136);
        setIntField(term274808, term274808.getClass(), "partnerId", -2049839076);
        setIntField(term274808, term274808.getClass(), "frameId", -304064614);
        setIntField(term274808, term274808.getClass(), "selectMapId", -2083558546);
        setIntField(term274808, term274808.getClass(), "totalAwake", 1728733629);
        setIntField(term274808, term274808.getClass(), "gradeRating", 1916491404);
        setIntField(term274808, term274808.getClass(), "musicRating", 1963930446);
        setIntField(term274808, term274808.getClass(), "playerRating", -408302545);
        setIntField(term274808, term274808.getClass(), "highestRating", -1320522399);
        setIntField(term274808, term274808.getClass(), "gradeRank", 1941013481);
        setIntField(term274808, term274808.getClass(), "classRank", 558340441);
        setIntField(term274808, term274808.getClass(), "courseRank", 1770611027);
        setField(term274808, term274808.getClass(), "charaSlot", term274873);
        setField(term274808, term274808.getClass(), "charaLockSlot", term274893);
        setLongField(term274808, term274808.getClass(), "contentBit", -2635740287680418450L);
        setIntField(term274808, term274808.getClass(), "playCount", 334175541);
        setField(term274808, term274808.getClass(), "eventWatchedDate", "dzaFbbcFgB");
        setField(term274808, term274808.getClass(), "lastGameId", "XxkSKRIccb");
        setField(term274808, term274808.getClass(), "lastRomVersion", "rVoqxsvuEO");
        setField(term274808, term274808.getClass(), "lastDataVersion", "fvlPYWsfNi");
        setField(term274808, term274808.getClass(), "lastLoginDate", "HguRJwSWml");
        setField(term274808, term274808.getClass(), "lastPlayDate", "cjzZzvSdbp");
        setIntField(term274808, term274808.getClass(), "lastPlayCredit", 1841048082);
        setIntField(term274808, term274808.getClass(), "lastPlayMode", -57312033);
        setIntField(term274808, term274808.getClass(), "lastPlaceId", 1742098836);
        setField(term274808, term274808.getClass(), "lastPlaceName", "IySBbmolVR");
        setIntField(term274808, term274808.getClass(), "lastAllNetId", 64098614);
        setIntField(term274808, term274808.getClass(), "lastRegionId", 1944053676);
        setField(term274808, term274808.getClass(), "lastRegionName", "TZacooIYfu");
        setField(term274808, term274808.getClass(), "lastClientId", "tYRyfLlFwR");
        setField(term274808, term274808.getClass(), "lastCountryCode", "cyzJelnZnf");
        setIntField(term274808, term274808.getClass(), "lastSelectEMoney", 783466223);
        setIntField(term274808, term274808.getClass(), "lastSelectTicket", 5087099);
        setIntField(term274808, term274808.getClass(), "lastSelectCourse", 637442694);
        setIntField(term274808, term274808.getClass(), "lastCountCourse", 1058907718);
        setField(term274808, term274808.getClass(), "firstGameId", "fsOzUshnsb");
        setField(term274808, term274808.getClass(), "firstRomVersion", "GPQHPXZvWo");
        setField(term274808, term274808.getClass(), "firstDataVersion", "ryfICfuPmW");
        setField(term274808, term274808.getClass(), "firstPlayDate", "MvedeYpPGN");
        setField(term274808, term274808.getClass(), "compatibleCmVersion", "qAHfvXErtw");
        setField(term274808, term274808.getClass(), "dailyBonusDate", "pQXxjfMbVr");
        setField(term274808, term274808.getClass(), "dailyCourseBonusDate", "yvzxlTzslz");
        setField(term274808, term274808.getClass(), "lastPairLoginDate", "WWKYyzWBuQ");
        setField(term274808, term274808.getClass(), "lastTrialPlayDate", "JiQhYekDeJ");
        setIntField(term274808, term274808.getClass(), "playVsCount", 1946590161);
        setIntField(term274808, term274808.getClass(), "playSyncCount", -663998937);
        setIntField(term274808, term274808.getClass(), "winCount", 672324332);
        setIntField(term274808, term274808.getClass(), "helpCount", 696727230);
        setIntField(term274808, term274808.getClass(), "comboCount", -1533142622);
        setLongField(term274808, term274808.getClass(), "totalDeluxscore", 2870533322468936501L);
        setLongField(term274808, term274808.getClass(), "totalBasicDeluxscore", 2011435754693350644L);
        setLongField(term274808, term274808.getClass(), "totalAdvancedDeluxscore", -2623273801109504921L);
        setLongField(term274808, term274808.getClass(), "totalExpertDeluxscore", -5669134296599186225L);
        setLongField(term274808, term274808.getClass(), "totalMasterDeluxscore", 4635334694620019875L);
        setLongField(term274808, term274808.getClass(), "totalReMasterDeluxscore", -1320890036841431746L);
        setIntField(term274808, term274808.getClass(), "totalSync", 285134412);
        setIntField(term274808, term274808.getClass(), "totalBasicSync", 1477109630);
        setIntField(term274808, term274808.getClass(), "totalAdvancedSync", 1716965346);
        setIntField(term274808, term274808.getClass(), "totalExpertSync", -1457239006);
        setIntField(term274808, term274808.getClass(), "totalMasterSync", 3643262);
        setIntField(term274808, term274808.getClass(), "totalReMasterSync", 1345774236);
        setLongField(term274808, term274808.getClass(), "totalAchievement", 4591233716936391423L);
        setLongField(term274808, term274808.getClass(), "totalBasicAchievement", -7602281244909659536L);
        setLongField(term274808, term274808.getClass(), "totalAdvancedAchievement", -8488151499705650323L);
        setLongField(term274808, term274808.getClass(), "totalExpertAchievement", 3306868697165535594L);
        setLongField(term274808, term274808.getClass(), "totalMasterAchievement", -3974466212972316608L);
        setLongField(term274808, term274808.getClass(), "totalReMasterAchievement", -3740270869928069330L);
        setLongField(term274808, term274808.getClass(), "playerOldRating", -6561781274358001681L);
        setLongField(term274808, term274808.getClass(), "playerNewRating", -7935270139965014503L);
        setIntField(term274808, term274808.getClass(), "banState", 1940738905);
        setLongField(term274808, term274808.getClass(), "dateTime", -5411788322140476647L);
        term275169 = new Integer(351961548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275169;
        callMethod(klass, "setTotalBasicSync", argTypes, term274808, args);
    }

};


