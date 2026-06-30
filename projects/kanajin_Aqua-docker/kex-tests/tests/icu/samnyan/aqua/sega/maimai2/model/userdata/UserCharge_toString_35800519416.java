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

public class UserCharge_toString_35800519416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130841;

    public UserCharge_toString_35800519416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130847 = new Long(3288941170644426558L);
        Integer term130910 = new Integer(2119231643);
        Integer term130912 = new Integer(688546450);
        Integer term130914 = new Integer(115635779);
        ArrayList term130908 = new ArrayList();
        ((ArrayList) term130908).add(term130910);
        ((ArrayList) term130908).add(term130912);
        ((ArrayList) term130908).add(term130914);
        Integer term130920 = new Integer(-1081685171);
        Integer term130922 = new Integer(1511699134);
        Integer term130924 = new Integer(185647247);
        Integer term130926 = new Integer(720814309);
        Integer term130928 = new Integer(964137425);
        Integer term130930 = new Integer(-1378885614);
        ArrayList term130918 = new ArrayList();
        ((ArrayList) term130918).add(term130920);
        ((ArrayList) term130918).add(term130922);
        ((ArrayList) term130918).add(term130924);
        ((ArrayList) term130918).add(term130926);
        ((ArrayList) term130918).add(term130928);
        ((ArrayList) term130918).add(term130930);
        term130841 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term130843 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term130845 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130876 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130841, term130841.getClass(), "id", -6487429259464781998L);
        setLongField(term130843, term130843.getClass(), "id", -3030396384377409618L);
        setLongField(term130845, term130845.getClass(), "id", 2946981130573967101L);
        setField(term130845, term130845.getClass(), "extId", term130847);
        setField(term130845, term130845.getClass(), "luid", "DiWPwuubfu");
        setIntField(term130862, term130862.getClass(), "year", 2020);
        setShortField(term130862, term130862.getClass(), "month", (short) 5);
        setShortField(term130862, term130862.getClass(), "day", (short) 25);
        setField(term130861, term130861.getClass(), "date", term130862);
        setByteField(term130866, term130866.getClass(), "hour", (byte) 4);
        setByteField(term130866, term130866.getClass(), "minute", (byte) 20);
        setByteField(term130866, term130866.getClass(), "second", (byte) 39);
        setIntField(term130866, term130866.getClass(), "nano", 382102366);
        setField(term130861, term130861.getClass(), "time", term130866);
        setField(term130845, term130845.getClass(), "registerTime", term130861);
        setIntField(term130872, term130872.getClass(), "year", 2023);
        setShortField(term130872, term130872.getClass(), "month", (short) 3);
        setShortField(term130872, term130872.getClass(), "day", (short) 4);
        setField(term130871, term130871.getClass(), "date", term130872);
        setByteField(term130876, term130876.getClass(), "hour", (byte) 20);
        setByteField(term130876, term130876.getClass(), "minute", (byte) 17);
        setByteField(term130876, term130876.getClass(), "second", (byte) 33);
        setIntField(term130876, term130876.getClass(), "nano", 193707533);
        setField(term130871, term130871.getClass(), "time", term130876);
        setField(term130845, term130845.getClass(), "accessTime", term130871);
        setField(term130843, term130843.getClass(), "card", term130845);
        setField(term130843, term130843.getClass(), "userName", "vXgtAGmDaN");
        setIntField(term130843, term130843.getClass(), "isNetMember", 955556184);
        setIntField(term130843, term130843.getClass(), "iconId", -1983502078);
        setIntField(term130843, term130843.getClass(), "plateId", 1255011076);
        setIntField(term130843, term130843.getClass(), "titleId", -685777121);
        setIntField(term130843, term130843.getClass(), "partnerId", -1692733101);
        setIntField(term130843, term130843.getClass(), "frameId", 502455086);
        setIntField(term130843, term130843.getClass(), "selectMapId", -1126933002);
        setIntField(term130843, term130843.getClass(), "totalAwake", 1486444842);
        setIntField(term130843, term130843.getClass(), "gradeRating", 2054666202);
        setIntField(term130843, term130843.getClass(), "musicRating", 1227044061);
        setIntField(term130843, term130843.getClass(), "playerRating", -195818221);
        setIntField(term130843, term130843.getClass(), "highestRating", -210604022);
        setIntField(term130843, term130843.getClass(), "gradeRank", 1198201318);
        setIntField(term130843, term130843.getClass(), "classRank", -1343762602);
        setIntField(term130843, term130843.getClass(), "courseRank", -167150075);
        setField(term130843, term130843.getClass(), "charaSlot", term130908);
        setField(term130843, term130843.getClass(), "charaLockSlot", term130918);
        setLongField(term130843, term130843.getClass(), "contentBit", 1103834255350828015L);
        setIntField(term130843, term130843.getClass(), "playCount", -1368631720);
        setField(term130843, term130843.getClass(), "eventWatchedDate", "RAzeZQXqkC");
        setField(term130843, term130843.getClass(), "lastGameId", "NxfBiMaFGb");
        setField(term130843, term130843.getClass(), "lastRomVersion", "xKDTKfQIei");
        setField(term130843, term130843.getClass(), "lastDataVersion", "QHAkxVuuIr");
        setField(term130843, term130843.getClass(), "lastLoginDate", "OhJSELmFDf");
        setField(term130843, term130843.getClass(), "lastPlayDate", "WjtvlnduZO");
        setIntField(term130843, term130843.getClass(), "lastPlayCredit", -533410760);
        setIntField(term130843, term130843.getClass(), "lastPlayMode", -1280711293);
        setIntField(term130843, term130843.getClass(), "lastPlaceId", -986135027);
        setField(term130843, term130843.getClass(), "lastPlaceName", "EccuEVvNyG");
        setIntField(term130843, term130843.getClass(), "lastAllNetId", 759881914);
        setIntField(term130843, term130843.getClass(), "lastRegionId", -1651145659);
        setField(term130843, term130843.getClass(), "lastRegionName", "kqWUPOtRYQ");
        setField(term130843, term130843.getClass(), "lastClientId", "vtFFfsxqsd");
        setField(term130843, term130843.getClass(), "lastCountryCode", "OgafASdxEn");
        setIntField(term130843, term130843.getClass(), "lastSelectEMoney", -1747737642);
        setIntField(term130843, term130843.getClass(), "lastSelectTicket", -875663853);
        setIntField(term130843, term130843.getClass(), "lastSelectCourse", -956550555);
        setIntField(term130843, term130843.getClass(), "lastCountCourse", -396229522);
        setField(term130843, term130843.getClass(), "firstGameId", "SdEDpqIgHG");
        setField(term130843, term130843.getClass(), "firstRomVersion", "KiOHPfuKbp");
        setField(term130843, term130843.getClass(), "firstDataVersion", "faneZfiPkz");
        setField(term130843, term130843.getClass(), "firstPlayDate", "xKSrJBCTXk");
        setField(term130843, term130843.getClass(), "compatibleCmVersion", "GbWyFVlZnY");
        setField(term130843, term130843.getClass(), "dailyBonusDate", "DUXodxIhLc");
        setField(term130843, term130843.getClass(), "dailyCourseBonusDate", "LfEDxfBelf");
        setField(term130843, term130843.getClass(), "lastPairLoginDate", "VGpvGtWXWx");
        setField(term130843, term130843.getClass(), "lastTrialPlayDate", "SzRPOLwctZ");
        setIntField(term130843, term130843.getClass(), "playVsCount", -1504505239);
        setIntField(term130843, term130843.getClass(), "playSyncCount", 363428862);
        setIntField(term130843, term130843.getClass(), "winCount", -1175441949);
        setIntField(term130843, term130843.getClass(), "helpCount", -21088397);
        setIntField(term130843, term130843.getClass(), "comboCount", 727645543);
        setLongField(term130843, term130843.getClass(), "totalDeluxscore", -6703714899145499790L);
        setLongField(term130843, term130843.getClass(), "totalBasicDeluxscore", -2092586213522560044L);
        setLongField(term130843, term130843.getClass(), "totalAdvancedDeluxscore", 7521364751791985311L);
        setLongField(term130843, term130843.getClass(), "totalExpertDeluxscore", -2362717211512784297L);
        setLongField(term130843, term130843.getClass(), "totalMasterDeluxscore", 5025604058324282754L);
        setLongField(term130843, term130843.getClass(), "totalReMasterDeluxscore", -2959397318742188388L);
        setIntField(term130843, term130843.getClass(), "totalSync", 1617706309);
        setIntField(term130843, term130843.getClass(), "totalBasicSync", -1771065834);
        setIntField(term130843, term130843.getClass(), "totalAdvancedSync", -1607856343);
        setIntField(term130843, term130843.getClass(), "totalExpertSync", -1393066070);
        setIntField(term130843, term130843.getClass(), "totalMasterSync", 1089906374);
        setIntField(term130843, term130843.getClass(), "totalReMasterSync", 1430244220);
        setLongField(term130843, term130843.getClass(), "totalAchievement", 8582136574218148076L);
        setLongField(term130843, term130843.getClass(), "totalBasicAchievement", 220429133805481043L);
        setLongField(term130843, term130843.getClass(), "totalAdvancedAchievement", -443610926537795961L);
        setLongField(term130843, term130843.getClass(), "totalExpertAchievement", -2826747481250662816L);
        setLongField(term130843, term130843.getClass(), "totalMasterAchievement", -1003291252292924901L);
        setLongField(term130843, term130843.getClass(), "totalReMasterAchievement", 3561198714285352894L);
        setLongField(term130843, term130843.getClass(), "playerOldRating", 6434931519154050828L);
        setLongField(term130843, term130843.getClass(), "playerNewRating", 5161439677348398752L);
        setIntField(term130843, term130843.getClass(), "banState", 871438955);
        setLongField(term130843, term130843.getClass(), "dateTime", -7061143542246288858L);
        setField(term130841, term130841.getClass(), "user", term130843);
        setIntField(term130841, term130841.getClass(), "chargeId", 1578242981);
        setIntField(term130841, term130841.getClass(), "stock", 243686870);
        setField(term130841, term130841.getClass(), "purchaseDate", "guEINAQxpo");
        setField(term130841, term130841.getClass(), "validDate", "SxRLZbHkvS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term130841, args);
    }

};


