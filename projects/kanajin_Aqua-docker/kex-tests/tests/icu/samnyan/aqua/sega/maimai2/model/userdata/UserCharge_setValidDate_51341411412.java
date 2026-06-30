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

public class UserCharge_setValidDate_51341411412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128325;

    public UserCharge_setValidDate_51341411412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128331 = new Long(3580984732036213717L);
        Integer term128394 = new Integer(27780241);
        Integer term128396 = new Integer(-683868408);
        Integer term128398 = new Integer(-381130069);
        Integer term128400 = new Integer(885769749);
        Integer term128402 = new Integer(-1021168716);
        Integer term128404 = new Integer(-1238055654);
        Integer term128406 = new Integer(1561513428);
        ArrayList term128392 = new ArrayList();
        ((ArrayList) term128392).add(term128394);
        ((ArrayList) term128392).add(term128396);
        ((ArrayList) term128392).add(term128398);
        ((ArrayList) term128392).add(term128400);
        ((ArrayList) term128392).add(term128402);
        ((ArrayList) term128392).add(term128404);
        ((ArrayList) term128392).add(term128406);
        Integer term128412 = new Integer(778959809);
        Integer term128414 = new Integer(-7504064);
        Integer term128416 = new Integer(-1464364418);
        Integer term128418 = new Integer(1050420173);
        Integer term128420 = new Integer(994300935);
        Integer term128422 = new Integer(433954476);
        Integer term128424 = new Integer(1780958641);
        ArrayList term128410 = new ArrayList();
        ((ArrayList) term128410).add(term128412);
        ((ArrayList) term128410).add(term128414);
        ((ArrayList) term128410).add(term128416);
        ((ArrayList) term128410).add(term128418);
        ((ArrayList) term128410).add(term128420);
        ((ArrayList) term128410).add(term128422);
        ((ArrayList) term128410).add(term128424);
        term128325 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term128327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term128329 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128350 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128360 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128325, term128325.getClass(), "id", -1258197335072720560L);
        setLongField(term128327, term128327.getClass(), "id", -1827011306138353528L);
        setLongField(term128329, term128329.getClass(), "id", -1541278924689136810L);
        setField(term128329, term128329.getClass(), "extId", term128331);
        setField(term128329, term128329.getClass(), "luid", "KKIqUqWzEr");
        setIntField(term128346, term128346.getClass(), "year", 2018);
        setShortField(term128346, term128346.getClass(), "month", (short) 11);
        setShortField(term128346, term128346.getClass(), "day", (short) 23);
        setField(term128345, term128345.getClass(), "date", term128346);
        setByteField(term128350, term128350.getClass(), "hour", (byte) 15);
        setByteField(term128350, term128350.getClass(), "minute", (byte) 21);
        setByteField(term128350, term128350.getClass(), "second", (byte) 39);
        setIntField(term128350, term128350.getClass(), "nano", 255623386);
        setField(term128345, term128345.getClass(), "time", term128350);
        setField(term128329, term128329.getClass(), "registerTime", term128345);
        setIntField(term128356, term128356.getClass(), "year", 2016);
        setShortField(term128356, term128356.getClass(), "month", (short) 11);
        setShortField(term128356, term128356.getClass(), "day", (short) 8);
        setField(term128355, term128355.getClass(), "date", term128356);
        setByteField(term128360, term128360.getClass(), "hour", (byte) 7);
        setByteField(term128360, term128360.getClass(), "minute", (byte) 33);
        setByteField(term128360, term128360.getClass(), "second", (byte) 30);
        setIntField(term128360, term128360.getClass(), "nano", 274725601);
        setField(term128355, term128355.getClass(), "time", term128360);
        setField(term128329, term128329.getClass(), "accessTime", term128355);
        setField(term128327, term128327.getClass(), "card", term128329);
        setField(term128327, term128327.getClass(), "userName", "ERiiSXCvBM");
        setIntField(term128327, term128327.getClass(), "isNetMember", 1847948269);
        setIntField(term128327, term128327.getClass(), "iconId", -1587620345);
        setIntField(term128327, term128327.getClass(), "plateId", 1594802760);
        setIntField(term128327, term128327.getClass(), "titleId", -737020605);
        setIntField(term128327, term128327.getClass(), "partnerId", -1689975721);
        setIntField(term128327, term128327.getClass(), "frameId", -559277061);
        setIntField(term128327, term128327.getClass(), "selectMapId", -1559272301);
        setIntField(term128327, term128327.getClass(), "totalAwake", -695146667);
        setIntField(term128327, term128327.getClass(), "gradeRating", 504837140);
        setIntField(term128327, term128327.getClass(), "musicRating", 1644155444);
        setIntField(term128327, term128327.getClass(), "playerRating", -146974597);
        setIntField(term128327, term128327.getClass(), "highestRating", 1867052080);
        setIntField(term128327, term128327.getClass(), "gradeRank", 1062960081);
        setIntField(term128327, term128327.getClass(), "classRank", -1298172941);
        setIntField(term128327, term128327.getClass(), "courseRank", -601138209);
        setField(term128327, term128327.getClass(), "charaSlot", term128392);
        setField(term128327, term128327.getClass(), "charaLockSlot", term128410);
        setLongField(term128327, term128327.getClass(), "contentBit", 3370913951731278257L);
        setIntField(term128327, term128327.getClass(), "playCount", -1113477185);
        setField(term128327, term128327.getClass(), "eventWatchedDate", "RgePgJxaiq");
        setField(term128327, term128327.getClass(), "lastGameId", "wbdTRzpToE");
        setField(term128327, term128327.getClass(), "lastRomVersion", "hYyOXAATCh");
        setField(term128327, term128327.getClass(), "lastDataVersion", "UbvbXQRnLW");
        setField(term128327, term128327.getClass(), "lastLoginDate", "CkIbQCWOgW");
        setField(term128327, term128327.getClass(), "lastPlayDate", "JWaRuPqymE");
        setIntField(term128327, term128327.getClass(), "lastPlayCredit", 585885138);
        setIntField(term128327, term128327.getClass(), "lastPlayMode", 567631199);
        setIntField(term128327, term128327.getClass(), "lastPlaceId", -1413886938);
        setField(term128327, term128327.getClass(), "lastPlaceName", "nTasTwGyTu");
        setIntField(term128327, term128327.getClass(), "lastAllNetId", 2087447261);
        setIntField(term128327, term128327.getClass(), "lastRegionId", 1781286950);
        setField(term128327, term128327.getClass(), "lastRegionName", "qRRPimcPhW");
        setField(term128327, term128327.getClass(), "lastClientId", "vhGXukwBWg");
        setField(term128327, term128327.getClass(), "lastCountryCode", "JahleHixdz");
        setIntField(term128327, term128327.getClass(), "lastSelectEMoney", -1567536215);
        setIntField(term128327, term128327.getClass(), "lastSelectTicket", -193229422);
        setIntField(term128327, term128327.getClass(), "lastSelectCourse", -1390564838);
        setIntField(term128327, term128327.getClass(), "lastCountCourse", 1895198236);
        setField(term128327, term128327.getClass(), "firstGameId", "rnkTocCEbH");
        setField(term128327, term128327.getClass(), "firstRomVersion", "wsDKWECjHf");
        setField(term128327, term128327.getClass(), "firstDataVersion", "FBPRmfNDEr");
        setField(term128327, term128327.getClass(), "firstPlayDate", "qOEJpzrzgF");
        setField(term128327, term128327.getClass(), "compatibleCmVersion", "ExvDwmtNdV");
        setField(term128327, term128327.getClass(), "dailyBonusDate", "MmhamxEBqw");
        setField(term128327, term128327.getClass(), "dailyCourseBonusDate", "heEXeIaieQ");
        setField(term128327, term128327.getClass(), "lastPairLoginDate", "MhsNUxKgPP");
        setField(term128327, term128327.getClass(), "lastTrialPlayDate", "cGLyrLlynk");
        setIntField(term128327, term128327.getClass(), "playVsCount", -1239270544);
        setIntField(term128327, term128327.getClass(), "playSyncCount", -877554724);
        setIntField(term128327, term128327.getClass(), "winCount", -1123007297);
        setIntField(term128327, term128327.getClass(), "helpCount", 144368885);
        setIntField(term128327, term128327.getClass(), "comboCount", -1855501977);
        setLongField(term128327, term128327.getClass(), "totalDeluxscore", -8561144190874118120L);
        setLongField(term128327, term128327.getClass(), "totalBasicDeluxscore", -8161974836877108744L);
        setLongField(term128327, term128327.getClass(), "totalAdvancedDeluxscore", 2414751913272857198L);
        setLongField(term128327, term128327.getClass(), "totalExpertDeluxscore", 5631636010149656965L);
        setLongField(term128327, term128327.getClass(), "totalMasterDeluxscore", 9083023389109779559L);
        setLongField(term128327, term128327.getClass(), "totalReMasterDeluxscore", 5259536683055374610L);
        setIntField(term128327, term128327.getClass(), "totalSync", -602021892);
        setIntField(term128327, term128327.getClass(), "totalBasicSync", 1020456975);
        setIntField(term128327, term128327.getClass(), "totalAdvancedSync", 164978650);
        setIntField(term128327, term128327.getClass(), "totalExpertSync", -1868859083);
        setIntField(term128327, term128327.getClass(), "totalMasterSync", -626522297);
        setIntField(term128327, term128327.getClass(), "totalReMasterSync", 973355727);
        setLongField(term128327, term128327.getClass(), "totalAchievement", -6261765077527362927L);
        setLongField(term128327, term128327.getClass(), "totalBasicAchievement", -5033229053418942258L);
        setLongField(term128327, term128327.getClass(), "totalAdvancedAchievement", 2634970689877661559L);
        setLongField(term128327, term128327.getClass(), "totalExpertAchievement", -299054155457724028L);
        setLongField(term128327, term128327.getClass(), "totalMasterAchievement", 6592361866954566506L);
        setLongField(term128327, term128327.getClass(), "totalReMasterAchievement", -4430640238371361796L);
        setLongField(term128327, term128327.getClass(), "playerOldRating", -4412379824210027388L);
        setLongField(term128327, term128327.getClass(), "playerNewRating", 3481375031536067233L);
        setIntField(term128327, term128327.getClass(), "banState", 1359931152);
        setLongField(term128327, term128327.getClass(), "dateTime", -8163957580883746071L);
        setField(term128325, term128325.getClass(), "user", term128327);
        setIntField(term128325, term128325.getClass(), "chargeId", -1310947684);
        setIntField(term128325, term128325.getClass(), "stock", -690317377);
        setField(term128325, term128325.getClass(), "purchaseDate", "mMpSzaWkTz");
        setField(term128325, term128325.getClass(), "validDate", "leDgyXJudi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YgSDrWcUog";
        callMethod(klass, "setValidDate", argTypes, term128325, args);
    }

};


