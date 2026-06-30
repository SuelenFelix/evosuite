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

public class UserDetail_getTotalMasterAchievement_91534381572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235780;

    public UserDetail_getTotalMasterAchievement_91534381572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235784 = new Long(753095050088595263L);
        Integer term235847 = new Integer(-1069668783);
        Integer term235849 = new Integer(-301450995);
        Integer term235851 = new Integer(753886838);
        Integer term235853 = new Integer(-1802788931);
        Integer term235855 = new Integer(505497573);
        ArrayList term235845 = new ArrayList();
        ((ArrayList) term235845).add(term235847);
        ((ArrayList) term235845).add(term235849);
        ((ArrayList) term235845).add(term235851);
        ((ArrayList) term235845).add(term235853);
        ((ArrayList) term235845).add(term235855);
        Integer term235861 = new Integer(1848062442);
        Integer term235863 = new Integer(-122481618);
        Integer term235865 = new Integer(-82929535);
        Integer term235867 = new Integer(1850505181);
        Integer term235869 = new Integer(324766253);
        ArrayList term235859 = new ArrayList();
        ((ArrayList) term235859).add(term235861);
        ((ArrayList) term235859).add(term235863);
        ((ArrayList) term235859).add(term235865);
        ((ArrayList) term235859).add(term235867);
        ((ArrayList) term235859).add(term235869);
        term235780 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term235782 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term235798 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235803 = newInstance(Class.forName("java.time.LocalTime"));
        Object term235808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235813 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term235780, term235780.getClass(), "id", 6804456924412460417L);
        setLongField(term235782, term235782.getClass(), "id", -8509469875944408947L);
        setField(term235782, term235782.getClass(), "extId", term235784);
        setField(term235782, term235782.getClass(), "luid", "GujFgWTvuM");
        setIntField(term235799, term235799.getClass(), "year", 2014);
        setShortField(term235799, term235799.getClass(), "month", (short) 12);
        setShortField(term235799, term235799.getClass(), "day", (short) 12);
        setField(term235798, term235798.getClass(), "date", term235799);
        setByteField(term235803, term235803.getClass(), "hour", (byte) 8);
        setByteField(term235803, term235803.getClass(), "minute", (byte) 44);
        setByteField(term235803, term235803.getClass(), "second", (byte) 19);
        setIntField(term235803, term235803.getClass(), "nano", 16834354);
        setField(term235798, term235798.getClass(), "time", term235803);
        setField(term235782, term235782.getClass(), "registerTime", term235798);
        setIntField(term235809, term235809.getClass(), "year", 2012);
        setShortField(term235809, term235809.getClass(), "month", (short) 11);
        setShortField(term235809, term235809.getClass(), "day", (short) 5);
        setField(term235808, term235808.getClass(), "date", term235809);
        setByteField(term235813, term235813.getClass(), "hour", (byte) 16);
        setByteField(term235813, term235813.getClass(), "minute", (byte) 51);
        setByteField(term235813, term235813.getClass(), "second", (byte) 52);
        setIntField(term235813, term235813.getClass(), "nano", 794474514);
        setField(term235808, term235808.getClass(), "time", term235813);
        setField(term235782, term235782.getClass(), "accessTime", term235808);
        setField(term235780, term235780.getClass(), "card", term235782);
        setField(term235780, term235780.getClass(), "userName", "PkJQanvmOF");
        setIntField(term235780, term235780.getClass(), "isNetMember", -5656680);
        setIntField(term235780, term235780.getClass(), "iconId", 1091964304);
        setIntField(term235780, term235780.getClass(), "plateId", -613681108);
        setIntField(term235780, term235780.getClass(), "titleId", 1352625518);
        setIntField(term235780, term235780.getClass(), "partnerId", 668348121);
        setIntField(term235780, term235780.getClass(), "frameId", 430885685);
        setIntField(term235780, term235780.getClass(), "selectMapId", 468323881);
        setIntField(term235780, term235780.getClass(), "totalAwake", 1862554868);
        setIntField(term235780, term235780.getClass(), "gradeRating", -610778528);
        setIntField(term235780, term235780.getClass(), "musicRating", 1749515367);
        setIntField(term235780, term235780.getClass(), "playerRating", -1319948187);
        setIntField(term235780, term235780.getClass(), "highestRating", -1019693873);
        setIntField(term235780, term235780.getClass(), "gradeRank", 1079247960);
        setIntField(term235780, term235780.getClass(), "classRank", 2145303715);
        setIntField(term235780, term235780.getClass(), "courseRank", -307543677);
        setField(term235780, term235780.getClass(), "charaSlot", term235845);
        setField(term235780, term235780.getClass(), "charaLockSlot", term235859);
        setLongField(term235780, term235780.getClass(), "contentBit", -9222400055986256741L);
        setIntField(term235780, term235780.getClass(), "playCount", -2034844354);
        setField(term235780, term235780.getClass(), "eventWatchedDate", "SisnDNfBOL");
        setField(term235780, term235780.getClass(), "lastGameId", "DOrhajvJna");
        setField(term235780, term235780.getClass(), "lastRomVersion", "TWXTXWpWvZ");
        setField(term235780, term235780.getClass(), "lastDataVersion", "hIFzWFybun");
        setField(term235780, term235780.getClass(), "lastLoginDate", "efPIDmXVuA");
        setField(term235780, term235780.getClass(), "lastPlayDate", "QLWISNFJbc");
        setIntField(term235780, term235780.getClass(), "lastPlayCredit", 1068979901);
        setIntField(term235780, term235780.getClass(), "lastPlayMode", 2060073727);
        setIntField(term235780, term235780.getClass(), "lastPlaceId", -1770044035);
        setField(term235780, term235780.getClass(), "lastPlaceName", "xbmjEKbGpU");
        setIntField(term235780, term235780.getClass(), "lastAllNetId", -2104780176);
        setIntField(term235780, term235780.getClass(), "lastRegionId", -1976301777);
        setField(term235780, term235780.getClass(), "lastRegionName", "GpEbHHguTm");
        setField(term235780, term235780.getClass(), "lastClientId", "vtSiSVFRIe");
        setField(term235780, term235780.getClass(), "lastCountryCode", "upOvrKREfg");
        setIntField(term235780, term235780.getClass(), "lastSelectEMoney", -463965331);
        setIntField(term235780, term235780.getClass(), "lastSelectTicket", 769940367);
        setIntField(term235780, term235780.getClass(), "lastSelectCourse", 1030297962);
        setIntField(term235780, term235780.getClass(), "lastCountCourse", -925377527);
        setField(term235780, term235780.getClass(), "firstGameId", "vMForGnHtH");
        setField(term235780, term235780.getClass(), "firstRomVersion", "iIbCprkKgM");
        setField(term235780, term235780.getClass(), "firstDataVersion", "KZwBpKcAut");
        setField(term235780, term235780.getClass(), "firstPlayDate", "CVpwUkVCbY");
        setField(term235780, term235780.getClass(), "compatibleCmVersion", "HELbjUlajR");
        setField(term235780, term235780.getClass(), "dailyBonusDate", "mNIKTByuKp");
        setField(term235780, term235780.getClass(), "dailyCourseBonusDate", "YFhbGDashN");
        setField(term235780, term235780.getClass(), "lastPairLoginDate", "bXRtHEJyHj");
        setField(term235780, term235780.getClass(), "lastTrialPlayDate", "zNvZiItfOR");
        setIntField(term235780, term235780.getClass(), "playVsCount", 1946040384);
        setIntField(term235780, term235780.getClass(), "playSyncCount", -870849674);
        setIntField(term235780, term235780.getClass(), "winCount", -365807826);
        setIntField(term235780, term235780.getClass(), "helpCount", -1527783758);
        setIntField(term235780, term235780.getClass(), "comboCount", 1611976687);
        setLongField(term235780, term235780.getClass(), "totalDeluxscore", -3231533722695256678L);
        setLongField(term235780, term235780.getClass(), "totalBasicDeluxscore", -3540280542591861577L);
        setLongField(term235780, term235780.getClass(), "totalAdvancedDeluxscore", 2265015118764489452L);
        setLongField(term235780, term235780.getClass(), "totalExpertDeluxscore", 7097125905032602965L);
        setLongField(term235780, term235780.getClass(), "totalMasterDeluxscore", -7248453145788248328L);
        setLongField(term235780, term235780.getClass(), "totalReMasterDeluxscore", 2044032406923573224L);
        setIntField(term235780, term235780.getClass(), "totalSync", -1847574054);
        setIntField(term235780, term235780.getClass(), "totalBasicSync", -1096876519);
        setIntField(term235780, term235780.getClass(), "totalAdvancedSync", -1260030158);
        setIntField(term235780, term235780.getClass(), "totalExpertSync", -1556763879);
        setIntField(term235780, term235780.getClass(), "totalMasterSync", -640616441);
        setIntField(term235780, term235780.getClass(), "totalReMasterSync", 209081740);
        setLongField(term235780, term235780.getClass(), "totalAchievement", 374166713753831394L);
        setLongField(term235780, term235780.getClass(), "totalBasicAchievement", 22932753184139997L);
        setLongField(term235780, term235780.getClass(), "totalAdvancedAchievement", 5105621780223864864L);
        setLongField(term235780, term235780.getClass(), "totalExpertAchievement", 5982813927640588507L);
        setLongField(term235780, term235780.getClass(), "totalMasterAchievement", -3324864942925967011L);
        setLongField(term235780, term235780.getClass(), "totalReMasterAchievement", 2692970857574549580L);
        setLongField(term235780, term235780.getClass(), "playerOldRating", 7324777923006843295L);
        setLongField(term235780, term235780.getClass(), "playerNewRating", 7463407575385501468L);
        setIntField(term235780, term235780.getClass(), "banState", -845599480);
        setLongField(term235780, term235780.getClass(), "dateTime", -6646878577302155605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterAchievement", argTypes, term235780, args);
    }

};


