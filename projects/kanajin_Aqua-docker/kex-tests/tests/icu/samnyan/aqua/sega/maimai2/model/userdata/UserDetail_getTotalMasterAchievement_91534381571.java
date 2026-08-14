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

public class UserDetail_getTotalMasterAchievement_91534381571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235725;

    public UserDetail_getTotalMasterAchievement_91534381571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235729 = new Long(753095050088595263L);
        Integer term235792 = new Integer(-1069668783);
        Integer term235794 = new Integer(-301450995);
        Integer term235796 = new Integer(753886838);
        Integer term235798 = new Integer(-1802788931);
        Integer term235800 = new Integer(505497573);
        ArrayList term235790 = new ArrayList();
        ((ArrayList) term235790).add(term235792);
        ((ArrayList) term235790).add(term235794);
        ((ArrayList) term235790).add(term235796);
        ((ArrayList) term235790).add(term235798);
        ((ArrayList) term235790).add(term235800);
        Integer term235806 = new Integer(1848062442);
        Integer term235808 = new Integer(-122481618);
        Integer term235810 = new Integer(-82929535);
        Integer term235812 = new Integer(1850505181);
        Integer term235814 = new Integer(324766253);
        ArrayList term235804 = new ArrayList();
        ((ArrayList) term235804).add(term235806);
        ((ArrayList) term235804).add(term235808);
        ((ArrayList) term235804).add(term235810);
        ((ArrayList) term235804).add(term235812);
        ((ArrayList) term235804).add(term235814);
        term235725 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term235727 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term235743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term235753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235758 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term235725, term235725.getClass(), "id", 6804456924412460417L);
        setLongField(term235727, term235727.getClass(), "id", -8509469875944408947L);
        setField(term235727, term235727.getClass(), "extId", term235729);
        setField(term235727, term235727.getClass(), "luid", "GujFgWTvuM");
        setIntField(term235744, term235744.getClass(), "year", 2014);
        setShortField(term235744, term235744.getClass(), "month", (short) 12);
        setShortField(term235744, term235744.getClass(), "day", (short) 12);
        setField(term235743, term235743.getClass(), "date", term235744);
        setByteField(term235748, term235748.getClass(), "hour", (byte) 8);
        setByteField(term235748, term235748.getClass(), "minute", (byte) 44);
        setByteField(term235748, term235748.getClass(), "second", (byte) 19);
        setIntField(term235748, term235748.getClass(), "nano", 16834354);
        setField(term235743, term235743.getClass(), "time", term235748);
        setField(term235727, term235727.getClass(), "registerTime", term235743);
        setIntField(term235754, term235754.getClass(), "year", 2012);
        setShortField(term235754, term235754.getClass(), "month", (short) 11);
        setShortField(term235754, term235754.getClass(), "day", (short) 5);
        setField(term235753, term235753.getClass(), "date", term235754);
        setByteField(term235758, term235758.getClass(), "hour", (byte) 16);
        setByteField(term235758, term235758.getClass(), "minute", (byte) 51);
        setByteField(term235758, term235758.getClass(), "second", (byte) 52);
        setIntField(term235758, term235758.getClass(), "nano", 794474514);
        setField(term235753, term235753.getClass(), "time", term235758);
        setField(term235727, term235727.getClass(), "accessTime", term235753);
        setField(term235725, term235725.getClass(), "card", term235727);
        setField(term235725, term235725.getClass(), "userName", "PkJQanvmOF");
        setIntField(term235725, term235725.getClass(), "isNetMember", -5656680);
        setIntField(term235725, term235725.getClass(), "iconId", 1091964304);
        setIntField(term235725, term235725.getClass(), "plateId", -613681108);
        setIntField(term235725, term235725.getClass(), "titleId", 1352625518);
        setIntField(term235725, term235725.getClass(), "partnerId", 668348121);
        setIntField(term235725, term235725.getClass(), "frameId", 430885685);
        setIntField(term235725, term235725.getClass(), "selectMapId", 468323881);
        setIntField(term235725, term235725.getClass(), "totalAwake", 1862554868);
        setIntField(term235725, term235725.getClass(), "gradeRating", -610778528);
        setIntField(term235725, term235725.getClass(), "musicRating", 1749515367);
        setIntField(term235725, term235725.getClass(), "playerRating", -1319948187);
        setIntField(term235725, term235725.getClass(), "highestRating", -1019693873);
        setIntField(term235725, term235725.getClass(), "gradeRank", 1079247960);
        setIntField(term235725, term235725.getClass(), "classRank", 2145303715);
        setIntField(term235725, term235725.getClass(), "courseRank", -307543677);
        setField(term235725, term235725.getClass(), "charaSlot", term235790);
        setField(term235725, term235725.getClass(), "charaLockSlot", term235804);
        setLongField(term235725, term235725.getClass(), "contentBit", -9222400055986256741L);
        setIntField(term235725, term235725.getClass(), "playCount", -2034844354);
        setField(term235725, term235725.getClass(), "eventWatchedDate", "SisnDNfBOL");
        setField(term235725, term235725.getClass(), "lastGameId", "DOrhajvJna");
        setField(term235725, term235725.getClass(), "lastRomVersion", "TWXTXWpWvZ");
        setField(term235725, term235725.getClass(), "lastDataVersion", "hIFzWFybun");
        setField(term235725, term235725.getClass(), "lastLoginDate", "efPIDmXVuA");
        setField(term235725, term235725.getClass(), "lastPlayDate", "QLWISNFJbc");
        setIntField(term235725, term235725.getClass(), "lastPlayCredit", 1068979901);
        setIntField(term235725, term235725.getClass(), "lastPlayMode", 2060073727);
        setIntField(term235725, term235725.getClass(), "lastPlaceId", -1770044035);
        setField(term235725, term235725.getClass(), "lastPlaceName", "xbmjEKbGpU");
        setIntField(term235725, term235725.getClass(), "lastAllNetId", -2104780176);
        setIntField(term235725, term235725.getClass(), "lastRegionId", -1976301777);
        setField(term235725, term235725.getClass(), "lastRegionName", "GpEbHHguTm");
        setField(term235725, term235725.getClass(), "lastClientId", "vtSiSVFRIe");
        setField(term235725, term235725.getClass(), "lastCountryCode", "upOvrKREfg");
        setIntField(term235725, term235725.getClass(), "lastSelectEMoney", -463965331);
        setIntField(term235725, term235725.getClass(), "lastSelectTicket", 769940367);
        setIntField(term235725, term235725.getClass(), "lastSelectCourse", 1030297962);
        setIntField(term235725, term235725.getClass(), "lastCountCourse", -925377527);
        setField(term235725, term235725.getClass(), "firstGameId", "vMForGnHtH");
        setField(term235725, term235725.getClass(), "firstRomVersion", "iIbCprkKgM");
        setField(term235725, term235725.getClass(), "firstDataVersion", "KZwBpKcAut");
        setField(term235725, term235725.getClass(), "firstPlayDate", "CVpwUkVCbY");
        setField(term235725, term235725.getClass(), "compatibleCmVersion", "HELbjUlajR");
        setField(term235725, term235725.getClass(), "dailyBonusDate", "mNIKTByuKp");
        setField(term235725, term235725.getClass(), "dailyCourseBonusDate", "YFhbGDashN");
        setField(term235725, term235725.getClass(), "lastPairLoginDate", "bXRtHEJyHj");
        setField(term235725, term235725.getClass(), "lastTrialPlayDate", "zNvZiItfOR");
        setIntField(term235725, term235725.getClass(), "playVsCount", 1946040384);
        setIntField(term235725, term235725.getClass(), "playSyncCount", -870849674);
        setIntField(term235725, term235725.getClass(), "winCount", -365807826);
        setIntField(term235725, term235725.getClass(), "helpCount", -1527783758);
        setIntField(term235725, term235725.getClass(), "comboCount", 1611976687);
        setLongField(term235725, term235725.getClass(), "totalDeluxscore", -3231533722695256678L);
        setLongField(term235725, term235725.getClass(), "totalBasicDeluxscore", -3540280542591861577L);
        setLongField(term235725, term235725.getClass(), "totalAdvancedDeluxscore", 2265015118764489452L);
        setLongField(term235725, term235725.getClass(), "totalExpertDeluxscore", 7097125905032602965L);
        setLongField(term235725, term235725.getClass(), "totalMasterDeluxscore", -7248453145788248328L);
        setLongField(term235725, term235725.getClass(), "totalReMasterDeluxscore", 2044032406923573224L);
        setIntField(term235725, term235725.getClass(), "totalSync", -1847574054);
        setIntField(term235725, term235725.getClass(), "totalBasicSync", -1096876519);
        setIntField(term235725, term235725.getClass(), "totalAdvancedSync", -1260030158);
        setIntField(term235725, term235725.getClass(), "totalExpertSync", -1556763879);
        setIntField(term235725, term235725.getClass(), "totalMasterSync", -640616441);
        setIntField(term235725, term235725.getClass(), "totalReMasterSync", 209081740);
        setLongField(term235725, term235725.getClass(), "totalAchievement", 374166713753831394L);
        setLongField(term235725, term235725.getClass(), "totalBasicAchievement", 22932753184139997L);
        setLongField(term235725, term235725.getClass(), "totalAdvancedAchievement", 5105621780223864864L);
        setLongField(term235725, term235725.getClass(), "totalExpertAchievement", 5982813927640588507L);
        setLongField(term235725, term235725.getClass(), "totalMasterAchievement", -3324864942925967011L);
        setLongField(term235725, term235725.getClass(), "totalReMasterAchievement", 2692970857574549580L);
        setLongField(term235725, term235725.getClass(), "playerOldRating", 7324777923006843295L);
        setLongField(term235725, term235725.getClass(), "playerNewRating", 7463407575385501468L);
        setIntField(term235725, term235725.getClass(), "banState", -845599480);
        setLongField(term235725, term235725.getClass(), "dateTime", -6646878577302155605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterAchievement", argTypes, term235725, args);
    }

};


