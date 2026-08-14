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

public class UserDetail_setTotalBasicSync_811795675139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274753;
     Object term275114;

    public UserDetail_setTotalBasicSync_811795675139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274757 = new Long(-5876259280451647338L);
        Integer term274820 = new Integer(1000587160);
        Integer term274822 = new Integer(1691425223);
        Integer term274824 = new Integer(2086385537);
        Integer term274826 = new Integer(-898458301);
        Integer term274828 = new Integer(-1752896);
        Integer term274830 = new Integer(-1202458563);
        Integer term274832 = new Integer(-974221589);
        Integer term274834 = new Integer(-167704667);
        ArrayList term274818 = new ArrayList();
        ((ArrayList) term274818).add(term274820);
        ((ArrayList) term274818).add(term274822);
        ((ArrayList) term274818).add(term274824);
        ((ArrayList) term274818).add(term274826);
        ((ArrayList) term274818).add(term274828);
        ((ArrayList) term274818).add(term274830);
        ((ArrayList) term274818).add(term274832);
        ((ArrayList) term274818).add(term274834);
        Integer term274840 = new Integer(-820617926);
        Integer term274842 = new Integer(-1871142929);
        Integer term274844 = new Integer(-1594964553);
        ArrayList term274838 = new ArrayList();
        ((ArrayList) term274838).add(term274840);
        ((ArrayList) term274838).add(term274842);
        ((ArrayList) term274838).add(term274844);
        term274753 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term274755 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274786 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274753, term274753.getClass(), "id", 85615018786024272L);
        setLongField(term274755, term274755.getClass(), "id", -24295254511972976L);
        setField(term274755, term274755.getClass(), "extId", term274757);
        setField(term274755, term274755.getClass(), "luid", "EbBIyYIcdK");
        setIntField(term274772, term274772.getClass(), "year", 2022);
        setShortField(term274772, term274772.getClass(), "month", (short) 12);
        setShortField(term274772, term274772.getClass(), "day", (short) 31);
        setField(term274771, term274771.getClass(), "date", term274772);
        setByteField(term274776, term274776.getClass(), "hour", (byte) 12);
        setByteField(term274776, term274776.getClass(), "minute", (byte) 2);
        setByteField(term274776, term274776.getClass(), "second", (byte) 5);
        setIntField(term274776, term274776.getClass(), "nano", 238792504);
        setField(term274771, term274771.getClass(), "time", term274776);
        setField(term274755, term274755.getClass(), "registerTime", term274771);
        setIntField(term274782, term274782.getClass(), "year", 2021);
        setShortField(term274782, term274782.getClass(), "month", (short) 5);
        setShortField(term274782, term274782.getClass(), "day", (short) 16);
        setField(term274781, term274781.getClass(), "date", term274782);
        setByteField(term274786, term274786.getClass(), "hour", (byte) 4);
        setByteField(term274786, term274786.getClass(), "minute", (byte) 27);
        setByteField(term274786, term274786.getClass(), "second", (byte) 14);
        setIntField(term274786, term274786.getClass(), "nano", 585753199);
        setField(term274781, term274781.getClass(), "time", term274786);
        setField(term274755, term274755.getClass(), "accessTime", term274781);
        setField(term274753, term274753.getClass(), "card", term274755);
        setField(term274753, term274753.getClass(), "userName", "gtWJVwJMfO");
        setIntField(term274753, term274753.getClass(), "isNetMember", 1491404701);
        setIntField(term274753, term274753.getClass(), "iconId", 1616183536);
        setIntField(term274753, term274753.getClass(), "plateId", 771552165);
        setIntField(term274753, term274753.getClass(), "titleId", -1365886136);
        setIntField(term274753, term274753.getClass(), "partnerId", -2049839076);
        setIntField(term274753, term274753.getClass(), "frameId", -304064614);
        setIntField(term274753, term274753.getClass(), "selectMapId", -2083558546);
        setIntField(term274753, term274753.getClass(), "totalAwake", 1728733629);
        setIntField(term274753, term274753.getClass(), "gradeRating", 1916491404);
        setIntField(term274753, term274753.getClass(), "musicRating", 1963930446);
        setIntField(term274753, term274753.getClass(), "playerRating", -408302545);
        setIntField(term274753, term274753.getClass(), "highestRating", -1320522399);
        setIntField(term274753, term274753.getClass(), "gradeRank", 1941013481);
        setIntField(term274753, term274753.getClass(), "classRank", 558340441);
        setIntField(term274753, term274753.getClass(), "courseRank", 1770611027);
        setField(term274753, term274753.getClass(), "charaSlot", term274818);
        setField(term274753, term274753.getClass(), "charaLockSlot", term274838);
        setLongField(term274753, term274753.getClass(), "contentBit", -2635740287680418450L);
        setIntField(term274753, term274753.getClass(), "playCount", 334175541);
        setField(term274753, term274753.getClass(), "eventWatchedDate", "dzaFbbcFgB");
        setField(term274753, term274753.getClass(), "lastGameId", "XxkSKRIccb");
        setField(term274753, term274753.getClass(), "lastRomVersion", "rVoqxsvuEO");
        setField(term274753, term274753.getClass(), "lastDataVersion", "fvlPYWsfNi");
        setField(term274753, term274753.getClass(), "lastLoginDate", "HguRJwSWml");
        setField(term274753, term274753.getClass(), "lastPlayDate", "cjzZzvSdbp");
        setIntField(term274753, term274753.getClass(), "lastPlayCredit", 1841048082);
        setIntField(term274753, term274753.getClass(), "lastPlayMode", -57312033);
        setIntField(term274753, term274753.getClass(), "lastPlaceId", 1742098836);
        setField(term274753, term274753.getClass(), "lastPlaceName", "IySBbmolVR");
        setIntField(term274753, term274753.getClass(), "lastAllNetId", 64098614);
        setIntField(term274753, term274753.getClass(), "lastRegionId", 1944053676);
        setField(term274753, term274753.getClass(), "lastRegionName", "TZacooIYfu");
        setField(term274753, term274753.getClass(), "lastClientId", "tYRyfLlFwR");
        setField(term274753, term274753.getClass(), "lastCountryCode", "cyzJelnZnf");
        setIntField(term274753, term274753.getClass(), "lastSelectEMoney", 783466223);
        setIntField(term274753, term274753.getClass(), "lastSelectTicket", 5087099);
        setIntField(term274753, term274753.getClass(), "lastSelectCourse", 637442694);
        setIntField(term274753, term274753.getClass(), "lastCountCourse", 1058907718);
        setField(term274753, term274753.getClass(), "firstGameId", "fsOzUshnsb");
        setField(term274753, term274753.getClass(), "firstRomVersion", "GPQHPXZvWo");
        setField(term274753, term274753.getClass(), "firstDataVersion", "ryfICfuPmW");
        setField(term274753, term274753.getClass(), "firstPlayDate", "MvedeYpPGN");
        setField(term274753, term274753.getClass(), "compatibleCmVersion", "qAHfvXErtw");
        setField(term274753, term274753.getClass(), "dailyBonusDate", "pQXxjfMbVr");
        setField(term274753, term274753.getClass(), "dailyCourseBonusDate", "yvzxlTzslz");
        setField(term274753, term274753.getClass(), "lastPairLoginDate", "WWKYyzWBuQ");
        setField(term274753, term274753.getClass(), "lastTrialPlayDate", "JiQhYekDeJ");
        setIntField(term274753, term274753.getClass(), "playVsCount", 1946590161);
        setIntField(term274753, term274753.getClass(), "playSyncCount", -663998937);
        setIntField(term274753, term274753.getClass(), "winCount", 672324332);
        setIntField(term274753, term274753.getClass(), "helpCount", 696727230);
        setIntField(term274753, term274753.getClass(), "comboCount", -1533142622);
        setLongField(term274753, term274753.getClass(), "totalDeluxscore", 2870533322468936501L);
        setLongField(term274753, term274753.getClass(), "totalBasicDeluxscore", 2011435754693350644L);
        setLongField(term274753, term274753.getClass(), "totalAdvancedDeluxscore", -2623273801109504921L);
        setLongField(term274753, term274753.getClass(), "totalExpertDeluxscore", -5669134296599186225L);
        setLongField(term274753, term274753.getClass(), "totalMasterDeluxscore", 4635334694620019875L);
        setLongField(term274753, term274753.getClass(), "totalReMasterDeluxscore", -1320890036841431746L);
        setIntField(term274753, term274753.getClass(), "totalSync", 285134412);
        setIntField(term274753, term274753.getClass(), "totalBasicSync", 1477109630);
        setIntField(term274753, term274753.getClass(), "totalAdvancedSync", 1716965346);
        setIntField(term274753, term274753.getClass(), "totalExpertSync", -1457239006);
        setIntField(term274753, term274753.getClass(), "totalMasterSync", 3643262);
        setIntField(term274753, term274753.getClass(), "totalReMasterSync", 1345774236);
        setLongField(term274753, term274753.getClass(), "totalAchievement", 4591233716936391423L);
        setLongField(term274753, term274753.getClass(), "totalBasicAchievement", -7602281244909659536L);
        setLongField(term274753, term274753.getClass(), "totalAdvancedAchievement", -8488151499705650323L);
        setLongField(term274753, term274753.getClass(), "totalExpertAchievement", 3306868697165535594L);
        setLongField(term274753, term274753.getClass(), "totalMasterAchievement", -3974466212972316608L);
        setLongField(term274753, term274753.getClass(), "totalReMasterAchievement", -3740270869928069330L);
        setLongField(term274753, term274753.getClass(), "playerOldRating", -6561781274358001681L);
        setLongField(term274753, term274753.getClass(), "playerNewRating", -7935270139965014503L);
        setIntField(term274753, term274753.getClass(), "banState", 1940738905);
        setLongField(term274753, term274753.getClass(), "dateTime", -5411788322140476647L);
        term275114 = new Integer(351961548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275114;
        callMethod(klass, "setTotalBasicSync", argTypes, term274753, args);
    }

};


