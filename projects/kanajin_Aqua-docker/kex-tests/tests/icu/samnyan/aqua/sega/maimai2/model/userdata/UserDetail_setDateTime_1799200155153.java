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

public class UserDetail_setDateTime_1799200155153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4316860;
     Object term4317223;

    public UserDetail_setDateTime_1799200155153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4316864 = new Long(-7525675331115095909L);
        Integer term4316927 = new Integer(-1537602442);
        Integer term4316929 = new Integer(-1264895109);
        Integer term4316931 = new Integer(-1573815915);
        Integer term4316933 = new Integer(-1219777858);
        Integer term4316935 = new Integer(1275177499);
        Integer term4316937 = new Integer(683701474);
        Integer term4316939 = new Integer(247947009);
        Integer term4316941 = new Integer(718686721);
        ArrayList term4316925 = new ArrayList();
        ((ArrayList) term4316925).add(term4316927);
        ((ArrayList) term4316925).add(term4316929);
        ((ArrayList) term4316925).add(term4316931);
        ((ArrayList) term4316925).add(term4316933);
        ((ArrayList) term4316925).add(term4316935);
        ((ArrayList) term4316925).add(term4316937);
        ((ArrayList) term4316925).add(term4316939);
        ((ArrayList) term4316925).add(term4316941);
        Integer term4316947 = new Integer(-1912489972);
        Integer term4316949 = new Integer(380168858);
        Integer term4316951 = new Integer(1684017550);
        Integer term4316953 = new Integer(-1085067457);
        ArrayList term4316945 = new ArrayList();
        ((ArrayList) term4316945).add(term4316947);
        ((ArrayList) term4316945).add(term4316949);
        ((ArrayList) term4316945).add(term4316951);
        ((ArrayList) term4316945).add(term4316953);
        term4316860 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4316862 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4316878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4316879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4316883 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4316888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4316889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4316893 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4316860, term4316860.getClass(), "id", 1622820529891820979L);
        setLongField(term4316862, term4316862.getClass(), "id", 3995157495678809397L);
        setField(term4316862, term4316862.getClass(), "extId", term4316864);
        setField(term4316862, term4316862.getClass(), "luid", "QTGimEpEZJ");
        setIntField(term4316879, term4316879.getClass(), "year", 2012);
        setShortField(term4316879, term4316879.getClass(), "month", (short) 5);
        setShortField(term4316879, term4316879.getClass(), "day", (short) 18);
        setField(term4316878, term4316878.getClass(), "date", term4316879);
        setByteField(term4316883, term4316883.getClass(), "hour", (byte) 5);
        setByteField(term4316883, term4316883.getClass(), "minute", (byte) 26);
        setByteField(term4316883, term4316883.getClass(), "second", (byte) 21);
        setIntField(term4316883, term4316883.getClass(), "nano", 593871428);
        setField(term4316878, term4316878.getClass(), "time", term4316883);
        setField(term4316862, term4316862.getClass(), "registerTime", term4316878);
        setIntField(term4316889, term4316889.getClass(), "year", 2028);
        setShortField(term4316889, term4316889.getClass(), "month", (short) 1);
        setShortField(term4316889, term4316889.getClass(), "day", (short) 22);
        setField(term4316888, term4316888.getClass(), "date", term4316889);
        setByteField(term4316893, term4316893.getClass(), "hour", (byte) 6);
        setByteField(term4316893, term4316893.getClass(), "minute", (byte) 48);
        setByteField(term4316893, term4316893.getClass(), "second", (byte) 22);
        setIntField(term4316893, term4316893.getClass(), "nano", 501861735);
        setField(term4316888, term4316888.getClass(), "time", term4316893);
        setField(term4316862, term4316862.getClass(), "accessTime", term4316888);
        setField(term4316860, term4316860.getClass(), "card", term4316862);
        setField(term4316860, term4316860.getClass(), "userName", "SbMhJVRHUW");
        setIntField(term4316860, term4316860.getClass(), "isNetMember", 1319263990);
        setIntField(term4316860, term4316860.getClass(), "iconId", 1781286767);
        setIntField(term4316860, term4316860.getClass(), "plateId", -660769096);
        setIntField(term4316860, term4316860.getClass(), "titleId", 1506227973);
        setIntField(term4316860, term4316860.getClass(), "partnerId", -1592472729);
        setIntField(term4316860, term4316860.getClass(), "frameId", 1337057239);
        setIntField(term4316860, term4316860.getClass(), "selectMapId", 806545682);
        setIntField(term4316860, term4316860.getClass(), "totalAwake", -335561471);
        setIntField(term4316860, term4316860.getClass(), "gradeRating", 1828512425);
        setIntField(term4316860, term4316860.getClass(), "musicRating", -549747689);
        setIntField(term4316860, term4316860.getClass(), "playerRating", 69154996);
        setIntField(term4316860, term4316860.getClass(), "highestRating", 105071019);
        setIntField(term4316860, term4316860.getClass(), "gradeRank", 1779950940);
        setIntField(term4316860, term4316860.getClass(), "classRank", 437840855);
        setIntField(term4316860, term4316860.getClass(), "courseRank", -1849062046);
        setField(term4316860, term4316860.getClass(), "charaSlot", term4316925);
        setField(term4316860, term4316860.getClass(), "charaLockSlot", term4316945);
        setLongField(term4316860, term4316860.getClass(), "contentBit", 8224875780953368391L);
        setIntField(term4316860, term4316860.getClass(), "playCount", -1485556366);
        setField(term4316860, term4316860.getClass(), "eventWatchedDate", "qmFTWjiXmW");
        setField(term4316860, term4316860.getClass(), "lastGameId", "QsARdvBSJw");
        setField(term4316860, term4316860.getClass(), "lastRomVersion", "jMULDEbOpT");
        setField(term4316860, term4316860.getClass(), "lastDataVersion", "kgZMvIHlHY");
        setField(term4316860, term4316860.getClass(), "lastLoginDate", "GuPDesrCAN");
        setField(term4316860, term4316860.getClass(), "lastPlayDate", "LmjqSOqffT");
        setIntField(term4316860, term4316860.getClass(), "lastPlayCredit", -2040512016);
        setIntField(term4316860, term4316860.getClass(), "lastPlayMode", -1610742879);
        setIntField(term4316860, term4316860.getClass(), "lastPlaceId", 630400363);
        setField(term4316860, term4316860.getClass(), "lastPlaceName", "aGpplaGWUz");
        setIntField(term4316860, term4316860.getClass(), "lastAllNetId", 2086105303);
        setIntField(term4316860, term4316860.getClass(), "lastRegionId", 1209873839);
        setField(term4316860, term4316860.getClass(), "lastRegionName", "nbJjOXihtH");
        setField(term4316860, term4316860.getClass(), "lastClientId", "nSPUKhVhmo");
        setField(term4316860, term4316860.getClass(), "lastCountryCode", "vUdpsIIbkh");
        setIntField(term4316860, term4316860.getClass(), "lastSelectEMoney", 1644434319);
        setIntField(term4316860, term4316860.getClass(), "lastSelectTicket", 564824149);
        setIntField(term4316860, term4316860.getClass(), "lastSelectCourse", 1779440701);
        setIntField(term4316860, term4316860.getClass(), "lastCountCourse", -1503856128);
        setField(term4316860, term4316860.getClass(), "firstGameId", "ldCLvtDWXb");
        setField(term4316860, term4316860.getClass(), "firstRomVersion", "uDKxJlQbtL");
        setField(term4316860, term4316860.getClass(), "firstDataVersion", "XEuWpLZnYR");
        setField(term4316860, term4316860.getClass(), "firstPlayDate", "HtEsvVMUlT");
        setField(term4316860, term4316860.getClass(), "compatibleCmVersion", "dycqlqNhzn");
        setField(term4316860, term4316860.getClass(), "dailyBonusDate", "tZFHUPPtIm");
        setField(term4316860, term4316860.getClass(), "dailyCourseBonusDate", "TWWmCKokQo");
        setField(term4316860, term4316860.getClass(), "lastPairLoginDate", "oyVvpbwkUY");
        setField(term4316860, term4316860.getClass(), "lastTrialPlayDate", "OSGeEwhMhd");
        setIntField(term4316860, term4316860.getClass(), "playVsCount", 1175067973);
        setIntField(term4316860, term4316860.getClass(), "playSyncCount", 1464647610);
        setIntField(term4316860, term4316860.getClass(), "winCount", 533840131);
        setIntField(term4316860, term4316860.getClass(), "helpCount", 596509161);
        setIntField(term4316860, term4316860.getClass(), "comboCount", 1424532769);
        setLongField(term4316860, term4316860.getClass(), "totalDeluxscore", 9065348706072020331L);
        setLongField(term4316860, term4316860.getClass(), "totalBasicDeluxscore", -5935479757752360442L);
        setLongField(term4316860, term4316860.getClass(), "totalAdvancedDeluxscore", 7076748609942398064L);
        setLongField(term4316860, term4316860.getClass(), "totalExpertDeluxscore", -5271449704516987175L);
        setLongField(term4316860, term4316860.getClass(), "totalMasterDeluxscore", -4925774624311624473L);
        setLongField(term4316860, term4316860.getClass(), "totalReMasterDeluxscore", 4128261364581251122L);
        setIntField(term4316860, term4316860.getClass(), "totalSync", -846808468);
        setIntField(term4316860, term4316860.getClass(), "totalBasicSync", 326752212);
        setIntField(term4316860, term4316860.getClass(), "totalAdvancedSync", 1580207061);
        setIntField(term4316860, term4316860.getClass(), "totalExpertSync", -998483279);
        setIntField(term4316860, term4316860.getClass(), "totalMasterSync", 2114403807);
        setIntField(term4316860, term4316860.getClass(), "totalReMasterSync", -972855235);
        setLongField(term4316860, term4316860.getClass(), "totalAchievement", -6673041998791432184L);
        setLongField(term4316860, term4316860.getClass(), "totalBasicAchievement", 8641531638641407019L);
        setLongField(term4316860, term4316860.getClass(), "totalAdvancedAchievement", 1857451175347330652L);
        setLongField(term4316860, term4316860.getClass(), "totalExpertAchievement", -7169546572269429521L);
        setLongField(term4316860, term4316860.getClass(), "totalMasterAchievement", -1711525543892635451L);
        setLongField(term4316860, term4316860.getClass(), "totalReMasterAchievement", -5647720550192286887L);
        setLongField(term4316860, term4316860.getClass(), "playerOldRating", -5760506049933505087L);
        setLongField(term4316860, term4316860.getClass(), "playerNewRating", 4109435931975317466L);
        setIntField(term4316860, term4316860.getClass(), "banState", -1948382313);
        setLongField(term4316860, term4316860.getClass(), "dateTime", 7165110885442639599L);
        term4317223 = new Long(2547551767706264991L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4317223;
        callMethod(klass, "setDateTime", argTypes, term4316860, args);
    }

};


