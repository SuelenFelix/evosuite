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

public class UserItem_getUser_9040412142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34057;

    public UserItem_getUser_9040412142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34063 = new Long(-5788180182343976541L);
        Integer term34126 = new Integer(754055848);
        Integer term34128 = new Integer(-19246901);
        ArrayList term34124 = new ArrayList();
        ((ArrayList) term34124).add(term34126);
        ((ArrayList) term34124).add(term34128);
        Integer term34134 = new Integer(-370828664);
        Integer term34136 = new Integer(1168633950);
        Integer term34138 = new Integer(1607082164);
        Integer term34140 = new Integer(1890399366);
        Integer term34142 = new Integer(-1867239125);
        Integer term34144 = new Integer(952869601);
        Integer term34146 = new Integer(91958879);
        Integer term34148 = new Integer(-645429025);
        ArrayList term34132 = new ArrayList();
        ((ArrayList) term34132).add(term34134);
        ((ArrayList) term34132).add(term34136);
        ((ArrayList) term34132).add(term34138);
        ((ArrayList) term34132).add(term34140);
        ((ArrayList) term34132).add(term34142);
        ((ArrayList) term34132).add(term34144);
        ((ArrayList) term34132).add(term34146);
        ((ArrayList) term34132).add(term34148);
        term34057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term34059 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term34061 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term34077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34092 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term34057, term34057.getClass(), "id", -2217438327452869934L);
        setLongField(term34059, term34059.getClass(), "id", 6427987239762071453L);
        setLongField(term34061, term34061.getClass(), "id", 9216691136820489449L);
        setField(term34061, term34061.getClass(), "extId", term34063);
        setField(term34061, term34061.getClass(), "luid", "yejonZnVuy");
        setIntField(term34078, term34078.getClass(), "year", 2027);
        setShortField(term34078, term34078.getClass(), "month", (short) 6);
        setShortField(term34078, term34078.getClass(), "day", (short) 20);
        setField(term34077, term34077.getClass(), "date", term34078);
        setByteField(term34082, term34082.getClass(), "hour", (byte) 23);
        setByteField(term34082, term34082.getClass(), "minute", (byte) 21);
        setByteField(term34082, term34082.getClass(), "second", (byte) 6);
        setIntField(term34082, term34082.getClass(), "nano", 897776059);
        setField(term34077, term34077.getClass(), "time", term34082);
        setField(term34061, term34061.getClass(), "registerTime", term34077);
        setIntField(term34088, term34088.getClass(), "year", 2016);
        setShortField(term34088, term34088.getClass(), "month", (short) 3);
        setShortField(term34088, term34088.getClass(), "day", (short) 20);
        setField(term34087, term34087.getClass(), "date", term34088);
        setByteField(term34092, term34092.getClass(), "hour", (byte) 0);
        setByteField(term34092, term34092.getClass(), "minute", (byte) 54);
        setByteField(term34092, term34092.getClass(), "second", (byte) 6);
        setIntField(term34092, term34092.getClass(), "nano", 183302469);
        setField(term34087, term34087.getClass(), "time", term34092);
        setField(term34061, term34061.getClass(), "accessTime", term34087);
        setField(term34059, term34059.getClass(), "card", term34061);
        setField(term34059, term34059.getClass(), "userName", "ouesGIsvuG");
        setIntField(term34059, term34059.getClass(), "isNetMember", 110630919);
        setIntField(term34059, term34059.getClass(), "iconId", 2002558305);
        setIntField(term34059, term34059.getClass(), "plateId", -1729207675);
        setIntField(term34059, term34059.getClass(), "titleId", -861852803);
        setIntField(term34059, term34059.getClass(), "partnerId", -2085852488);
        setIntField(term34059, term34059.getClass(), "frameId", 600214846);
        setIntField(term34059, term34059.getClass(), "selectMapId", 697208850);
        setIntField(term34059, term34059.getClass(), "totalAwake", -973142506);
        setIntField(term34059, term34059.getClass(), "gradeRating", -15011809);
        setIntField(term34059, term34059.getClass(), "musicRating", -482193296);
        setIntField(term34059, term34059.getClass(), "playerRating", 1506869786);
        setIntField(term34059, term34059.getClass(), "highestRating", 950749769);
        setIntField(term34059, term34059.getClass(), "gradeRank", 1497396124);
        setIntField(term34059, term34059.getClass(), "classRank", 1013816325);
        setIntField(term34059, term34059.getClass(), "courseRank", -756785345);
        setField(term34059, term34059.getClass(), "charaSlot", term34124);
        setField(term34059, term34059.getClass(), "charaLockSlot", term34132);
        setLongField(term34059, term34059.getClass(), "contentBit", 6460434640369527093L);
        setIntField(term34059, term34059.getClass(), "playCount", -1077451707);
        setField(term34059, term34059.getClass(), "eventWatchedDate", "pHBHlmLIZQ");
        setField(term34059, term34059.getClass(), "lastGameId", "ZWRAbOuktl");
        setField(term34059, term34059.getClass(), "lastRomVersion", "iqFRvFmVID");
        setField(term34059, term34059.getClass(), "lastDataVersion", "pNAEtppZdv");
        setField(term34059, term34059.getClass(), "lastLoginDate", "VsFWNMdyRt");
        setField(term34059, term34059.getClass(), "lastPlayDate", "QaoYFZhScg");
        setIntField(term34059, term34059.getClass(), "lastPlayCredit", -580180892);
        setIntField(term34059, term34059.getClass(), "lastPlayMode", 862135498);
        setIntField(term34059, term34059.getClass(), "lastPlaceId", -1640521852);
        setField(term34059, term34059.getClass(), "lastPlaceName", "UTvXIenLCR");
        setIntField(term34059, term34059.getClass(), "lastAllNetId", 1999560627);
        setIntField(term34059, term34059.getClass(), "lastRegionId", 93344937);
        setField(term34059, term34059.getClass(), "lastRegionName", "PLeKpWaxhQ");
        setField(term34059, term34059.getClass(), "lastClientId", "EBSKhqDdUW");
        setField(term34059, term34059.getClass(), "lastCountryCode", "LvLbdICdfA");
        setIntField(term34059, term34059.getClass(), "lastSelectEMoney", 1426545044);
        setIntField(term34059, term34059.getClass(), "lastSelectTicket", -2114135536);
        setIntField(term34059, term34059.getClass(), "lastSelectCourse", -1934156754);
        setIntField(term34059, term34059.getClass(), "lastCountCourse", -2122545415);
        setField(term34059, term34059.getClass(), "firstGameId", "rtifrlITwl");
        setField(term34059, term34059.getClass(), "firstRomVersion", "yGWXZDjnPS");
        setField(term34059, term34059.getClass(), "firstDataVersion", "vZucxbGVyo");
        setField(term34059, term34059.getClass(), "firstPlayDate", "ZZoLNbeORl");
        setField(term34059, term34059.getClass(), "compatibleCmVersion", "XjIOUIzJUP");
        setField(term34059, term34059.getClass(), "dailyBonusDate", "iGTpXnnTqB");
        setField(term34059, term34059.getClass(), "dailyCourseBonusDate", "XgJzBOYfQB");
        setField(term34059, term34059.getClass(), "lastPairLoginDate", "GAPGgDekVG");
        setField(term34059, term34059.getClass(), "lastTrialPlayDate", "WmTogHwGLE");
        setIntField(term34059, term34059.getClass(), "playVsCount", 45477597);
        setIntField(term34059, term34059.getClass(), "playSyncCount", 702851889);
        setIntField(term34059, term34059.getClass(), "winCount", 2035373298);
        setIntField(term34059, term34059.getClass(), "helpCount", 1328311779);
        setIntField(term34059, term34059.getClass(), "comboCount", -1459351662);
        setLongField(term34059, term34059.getClass(), "totalDeluxscore", -5745335841303453480L);
        setLongField(term34059, term34059.getClass(), "totalBasicDeluxscore", 7068447368781427495L);
        setLongField(term34059, term34059.getClass(), "totalAdvancedDeluxscore", 7899092949241236700L);
        setLongField(term34059, term34059.getClass(), "totalExpertDeluxscore", 3369965039136843143L);
        setLongField(term34059, term34059.getClass(), "totalMasterDeluxscore", -383809899410674609L);
        setLongField(term34059, term34059.getClass(), "totalReMasterDeluxscore", 4633443327989555279L);
        setIntField(term34059, term34059.getClass(), "totalSync", -887392605);
        setIntField(term34059, term34059.getClass(), "totalBasicSync", 1813573586);
        setIntField(term34059, term34059.getClass(), "totalAdvancedSync", -1950105121);
        setIntField(term34059, term34059.getClass(), "totalExpertSync", 1664370474);
        setIntField(term34059, term34059.getClass(), "totalMasterSync", 56756754);
        setIntField(term34059, term34059.getClass(), "totalReMasterSync", -1283242129);
        setLongField(term34059, term34059.getClass(), "totalAchievement", -7883918174480028850L);
        setLongField(term34059, term34059.getClass(), "totalBasicAchievement", 3512582740653676967L);
        setLongField(term34059, term34059.getClass(), "totalAdvancedAchievement", -6893173979797141349L);
        setLongField(term34059, term34059.getClass(), "totalExpertAchievement", 8849217995403029606L);
        setLongField(term34059, term34059.getClass(), "totalMasterAchievement", 2179437725582700997L);
        setLongField(term34059, term34059.getClass(), "totalReMasterAchievement", 808761243947256536L);
        setLongField(term34059, term34059.getClass(), "playerOldRating", 5841040494527118725L);
        setLongField(term34059, term34059.getClass(), "playerNewRating", 5535938323123427777L);
        setIntField(term34059, term34059.getClass(), "banState", -1400827537);
        setLongField(term34059, term34059.getClass(), "dateTime", 1292632924316952683L);
        setField(term34057, term34057.getClass(), "user", term34059);
        setIntField(term34057, term34057.getClass(), "itemKind", 1630959866);
        setIntField(term34057, term34057.getClass(), "itemId", 414147550);
        setIntField(term34057, term34057.getClass(), "stock", 1652909222);
        setBooleanField(term34057, term34057.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term34057, args);
    }

};


