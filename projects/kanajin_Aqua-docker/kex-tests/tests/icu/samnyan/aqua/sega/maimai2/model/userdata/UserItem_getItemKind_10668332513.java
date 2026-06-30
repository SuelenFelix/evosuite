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

public class UserItem_getItemKind_10668332513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34632;

    public UserItem_getItemKind_10668332513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34638 = new Long(2936323121573284007L);
        Integer term34701 = new Integer(-688213483);
        Integer term34703 = new Integer(644154104);
        Integer term34705 = new Integer(76650923);
        Integer term34707 = new Integer(1003743923);
        Integer term34709 = new Integer(1887772522);
        ArrayList term34699 = new ArrayList();
        ((ArrayList) term34699).add(term34701);
        ((ArrayList) term34699).add(term34703);
        ((ArrayList) term34699).add(term34705);
        ((ArrayList) term34699).add(term34707);
        ((ArrayList) term34699).add(term34709);
        Integer term34715 = new Integer(354196060);
        Integer term34717 = new Integer(-1840305774);
        Integer term34719 = new Integer(1365087144);
        Integer term34721 = new Integer(-1537255112);
        Integer term34723 = new Integer(934477462);
        Integer term34725 = new Integer(4900410);
        ArrayList term34713 = new ArrayList();
        ((ArrayList) term34713).add(term34715);
        ((ArrayList) term34713).add(term34717);
        ((ArrayList) term34713).add(term34719);
        ((ArrayList) term34713).add(term34721);
        ((ArrayList) term34713).add(term34723);
        ((ArrayList) term34713).add(term34725);
        term34632 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term34634 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term34636 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term34652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34667 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term34632, term34632.getClass(), "id", 2896485328388781986L);
        setLongField(term34634, term34634.getClass(), "id", 54468717425932218L);
        setLongField(term34636, term34636.getClass(), "id", 5860114696949347386L);
        setField(term34636, term34636.getClass(), "extId", term34638);
        setField(term34636, term34636.getClass(), "luid", "qYOIXsGycY");
        setIntField(term34653, term34653.getClass(), "year", 2013);
        setShortField(term34653, term34653.getClass(), "month", (short) 11);
        setShortField(term34653, term34653.getClass(), "day", (short) 19);
        setField(term34652, term34652.getClass(), "date", term34653);
        setByteField(term34657, term34657.getClass(), "hour", (byte) 6);
        setByteField(term34657, term34657.getClass(), "minute", (byte) 45);
        setByteField(term34657, term34657.getClass(), "second", (byte) 10);
        setIntField(term34657, term34657.getClass(), "nano", 288981190);
        setField(term34652, term34652.getClass(), "time", term34657);
        setField(term34636, term34636.getClass(), "registerTime", term34652);
        setIntField(term34663, term34663.getClass(), "year", 2025);
        setShortField(term34663, term34663.getClass(), "month", (short) 9);
        setShortField(term34663, term34663.getClass(), "day", (short) 18);
        setField(term34662, term34662.getClass(), "date", term34663);
        setByteField(term34667, term34667.getClass(), "hour", (byte) 16);
        setByteField(term34667, term34667.getClass(), "minute", (byte) 1);
        setByteField(term34667, term34667.getClass(), "second", (byte) 23);
        setIntField(term34667, term34667.getClass(), "nano", 178285726);
        setField(term34662, term34662.getClass(), "time", term34667);
        setField(term34636, term34636.getClass(), "accessTime", term34662);
        setField(term34634, term34634.getClass(), "card", term34636);
        setField(term34634, term34634.getClass(), "userName", "sJNXNshRLe");
        setIntField(term34634, term34634.getClass(), "isNetMember", 1130098561);
        setIntField(term34634, term34634.getClass(), "iconId", 954169543);
        setIntField(term34634, term34634.getClass(), "plateId", -2124307939);
        setIntField(term34634, term34634.getClass(), "titleId", 332880714);
        setIntField(term34634, term34634.getClass(), "partnerId", 904733719);
        setIntField(term34634, term34634.getClass(), "frameId", -240576356);
        setIntField(term34634, term34634.getClass(), "selectMapId", 148921829);
        setIntField(term34634, term34634.getClass(), "totalAwake", 2076458515);
        setIntField(term34634, term34634.getClass(), "gradeRating", 622248745);
        setIntField(term34634, term34634.getClass(), "musicRating", -33243170);
        setIntField(term34634, term34634.getClass(), "playerRating", -906823990);
        setIntField(term34634, term34634.getClass(), "highestRating", -1670324779);
        setIntField(term34634, term34634.getClass(), "gradeRank", -1696838199);
        setIntField(term34634, term34634.getClass(), "classRank", -1286086755);
        setIntField(term34634, term34634.getClass(), "courseRank", 724669093);
        setField(term34634, term34634.getClass(), "charaSlot", term34699);
        setField(term34634, term34634.getClass(), "charaLockSlot", term34713);
        setLongField(term34634, term34634.getClass(), "contentBit", 3415381732664403599L);
        setIntField(term34634, term34634.getClass(), "playCount", -2005743628);
        setField(term34634, term34634.getClass(), "eventWatchedDate", "AYnbmgRCKr");
        setField(term34634, term34634.getClass(), "lastGameId", "iQRfDlaoYD");
        setField(term34634, term34634.getClass(), "lastRomVersion", "kpcyrjDQzN");
        setField(term34634, term34634.getClass(), "lastDataVersion", "IyukykAHLQ");
        setField(term34634, term34634.getClass(), "lastLoginDate", "CwZcgFJqMh");
        setField(term34634, term34634.getClass(), "lastPlayDate", "RldCZqgRbO");
        setIntField(term34634, term34634.getClass(), "lastPlayCredit", -1204207224);
        setIntField(term34634, term34634.getClass(), "lastPlayMode", -77932500);
        setIntField(term34634, term34634.getClass(), "lastPlaceId", -1558194793);
        setField(term34634, term34634.getClass(), "lastPlaceName", "LOVugCAgJs");
        setIntField(term34634, term34634.getClass(), "lastAllNetId", -13354986);
        setIntField(term34634, term34634.getClass(), "lastRegionId", -2134459880);
        setField(term34634, term34634.getClass(), "lastRegionName", "SNmHXwCiFY");
        setField(term34634, term34634.getClass(), "lastClientId", "HZfkWoqyUW");
        setField(term34634, term34634.getClass(), "lastCountryCode", "QRwANPSyfT");
        setIntField(term34634, term34634.getClass(), "lastSelectEMoney", -1811405838);
        setIntField(term34634, term34634.getClass(), "lastSelectTicket", 619484749);
        setIntField(term34634, term34634.getClass(), "lastSelectCourse", 490271003);
        setIntField(term34634, term34634.getClass(), "lastCountCourse", 1541867826);
        setField(term34634, term34634.getClass(), "firstGameId", "DbZKLwYBgy");
        setField(term34634, term34634.getClass(), "firstRomVersion", "LnNRVsjmxw");
        setField(term34634, term34634.getClass(), "firstDataVersion", "PlOnDkNrvX");
        setField(term34634, term34634.getClass(), "firstPlayDate", "MltgFGldop");
        setField(term34634, term34634.getClass(), "compatibleCmVersion", "JCWSoxnBJs");
        setField(term34634, term34634.getClass(), "dailyBonusDate", "vAxcpvjEEa");
        setField(term34634, term34634.getClass(), "dailyCourseBonusDate", "FCkOgIBqXE");
        setField(term34634, term34634.getClass(), "lastPairLoginDate", "kadRHthQRD");
        setField(term34634, term34634.getClass(), "lastTrialPlayDate", "cGbJSRSpNn");
        setIntField(term34634, term34634.getClass(), "playVsCount", -137176190);
        setIntField(term34634, term34634.getClass(), "playSyncCount", 348263044);
        setIntField(term34634, term34634.getClass(), "winCount", 1394815305);
        setIntField(term34634, term34634.getClass(), "helpCount", -315070279);
        setIntField(term34634, term34634.getClass(), "comboCount", 62449386);
        setLongField(term34634, term34634.getClass(), "totalDeluxscore", 3853271903861685327L);
        setLongField(term34634, term34634.getClass(), "totalBasicDeluxscore", 9105566407535624519L);
        setLongField(term34634, term34634.getClass(), "totalAdvancedDeluxscore", 8850312777693707693L);
        setLongField(term34634, term34634.getClass(), "totalExpertDeluxscore", 1038272501243892514L);
        setLongField(term34634, term34634.getClass(), "totalMasterDeluxscore", -5787975575293098129L);
        setLongField(term34634, term34634.getClass(), "totalReMasterDeluxscore", -2214621750590649821L);
        setIntField(term34634, term34634.getClass(), "totalSync", -1488558129);
        setIntField(term34634, term34634.getClass(), "totalBasicSync", -929614389);
        setIntField(term34634, term34634.getClass(), "totalAdvancedSync", 1585326879);
        setIntField(term34634, term34634.getClass(), "totalExpertSync", 1161195592);
        setIntField(term34634, term34634.getClass(), "totalMasterSync", -1012640616);
        setIntField(term34634, term34634.getClass(), "totalReMasterSync", -552664740);
        setLongField(term34634, term34634.getClass(), "totalAchievement", -480743639677441412L);
        setLongField(term34634, term34634.getClass(), "totalBasicAchievement", 4618470175243384123L);
        setLongField(term34634, term34634.getClass(), "totalAdvancedAchievement", 1747819662947425876L);
        setLongField(term34634, term34634.getClass(), "totalExpertAchievement", 8085945615925723302L);
        setLongField(term34634, term34634.getClass(), "totalMasterAchievement", 5874242482849721868L);
        setLongField(term34634, term34634.getClass(), "totalReMasterAchievement", 682045578778432659L);
        setLongField(term34634, term34634.getClass(), "playerOldRating", -1059217926759861865L);
        setLongField(term34634, term34634.getClass(), "playerNewRating", 4331712795558033930L);
        setIntField(term34634, term34634.getClass(), "banState", -1639838200);
        setLongField(term34634, term34634.getClass(), "dateTime", 8180021874498524998L);
        setField(term34632, term34632.getClass(), "user", term34634);
        setIntField(term34632, term34632.getClass(), "itemKind", -60462175);
        setIntField(term34632, term34632.getClass(), "itemId", 1315997028);
        setIntField(term34632, term34632.getClass(), "stock", 1268210239);
        setBooleanField(term34632, term34632.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemKind", argTypes, term34632, args);
    }

};


