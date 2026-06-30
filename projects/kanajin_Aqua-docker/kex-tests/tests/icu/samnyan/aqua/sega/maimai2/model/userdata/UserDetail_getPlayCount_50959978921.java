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

public class UserDetail_getPlayCount_50959978921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241407;

    public UserDetail_getPlayCount_50959978921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4241411 = new Long(5739102563597880951L);
        Integer term4241474 = new Integer(-981567119);
        Integer term4241476 = new Integer(925481683);
        Integer term4241478 = new Integer(-1873713064);
        Integer term4241480 = new Integer(2075342882);
        Integer term4241482 = new Integer(1797445263);
        Integer term4241484 = new Integer(1653675136);
        Integer term4241486 = new Integer(661708296);
        Integer term4241488 = new Integer(-238072053);
        ArrayList term4241472 = new ArrayList();
        ((ArrayList) term4241472).add(term4241474);
        ((ArrayList) term4241472).add(term4241476);
        ((ArrayList) term4241472).add(term4241478);
        ((ArrayList) term4241472).add(term4241480);
        ((ArrayList) term4241472).add(term4241482);
        ((ArrayList) term4241472).add(term4241484);
        ((ArrayList) term4241472).add(term4241486);
        ((ArrayList) term4241472).add(term4241488);
        Integer term4241494 = new Integer(-1590160640);
        Integer term4241496 = new Integer(912288551);
        ArrayList term4241492 = new ArrayList();
        ((ArrayList) term4241492).add(term4241494);
        ((ArrayList) term4241492).add(term4241496);
        term4241407 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4241409 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4241425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4241426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4241430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4241435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4241436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4241440 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4241407, term4241407.getClass(), "id", -4553139606730435759L);
        setLongField(term4241409, term4241409.getClass(), "id", 4537163859254477703L);
        setField(term4241409, term4241409.getClass(), "extId", term4241411);
        setField(term4241409, term4241409.getClass(), "luid", "VCIDFzEHSp");
        setIntField(term4241426, term4241426.getClass(), "year", 2027);
        setShortField(term4241426, term4241426.getClass(), "month", (short) 2);
        setShortField(term4241426, term4241426.getClass(), "day", (short) 12);
        setField(term4241425, term4241425.getClass(), "date", term4241426);
        setByteField(term4241430, term4241430.getClass(), "hour", (byte) 18);
        setByteField(term4241430, term4241430.getClass(), "minute", (byte) 12);
        setByteField(term4241430, term4241430.getClass(), "second", (byte) 18);
        setIntField(term4241430, term4241430.getClass(), "nano", 582354893);
        setField(term4241425, term4241425.getClass(), "time", term4241430);
        setField(term4241409, term4241409.getClass(), "registerTime", term4241425);
        setIntField(term4241436, term4241436.getClass(), "year", 2012);
        setShortField(term4241436, term4241436.getClass(), "month", (short) 1);
        setShortField(term4241436, term4241436.getClass(), "day", (short) 5);
        setField(term4241435, term4241435.getClass(), "date", term4241436);
        setByteField(term4241440, term4241440.getClass(), "hour", (byte) 12);
        setByteField(term4241440, term4241440.getClass(), "minute", (byte) 25);
        setByteField(term4241440, term4241440.getClass(), "second", (byte) 12);
        setIntField(term4241440, term4241440.getClass(), "nano", 661148409);
        setField(term4241435, term4241435.getClass(), "time", term4241440);
        setField(term4241409, term4241409.getClass(), "accessTime", term4241435);
        setField(term4241407, term4241407.getClass(), "card", term4241409);
        setField(term4241407, term4241407.getClass(), "userName", "VyiTTXwufC");
        setIntField(term4241407, term4241407.getClass(), "isNetMember", -96930956);
        setIntField(term4241407, term4241407.getClass(), "iconId", -661749196);
        setIntField(term4241407, term4241407.getClass(), "plateId", -1322320044);
        setIntField(term4241407, term4241407.getClass(), "titleId", -217344292);
        setIntField(term4241407, term4241407.getClass(), "partnerId", 538515956);
        setIntField(term4241407, term4241407.getClass(), "frameId", 1646646227);
        setIntField(term4241407, term4241407.getClass(), "selectMapId", -1230002280);
        setIntField(term4241407, term4241407.getClass(), "totalAwake", -693629304);
        setIntField(term4241407, term4241407.getClass(), "gradeRating", -1873073892);
        setIntField(term4241407, term4241407.getClass(), "musicRating", 674300283);
        setIntField(term4241407, term4241407.getClass(), "playerRating", 761608933);
        setIntField(term4241407, term4241407.getClass(), "highestRating", -1863536907);
        setIntField(term4241407, term4241407.getClass(), "gradeRank", -1810714554);
        setIntField(term4241407, term4241407.getClass(), "classRank", 1368706081);
        setIntField(term4241407, term4241407.getClass(), "courseRank", 2018941331);
        setField(term4241407, term4241407.getClass(), "charaSlot", term4241472);
        setField(term4241407, term4241407.getClass(), "charaLockSlot", term4241492);
        setLongField(term4241407, term4241407.getClass(), "contentBit", -5749160956272650628L);
        setIntField(term4241407, term4241407.getClass(), "playCount", -599279308);
        setField(term4241407, term4241407.getClass(), "eventWatchedDate", "VAqMFLwNYQ");
        setField(term4241407, term4241407.getClass(), "lastGameId", "wTHAFGunTa");
        setField(term4241407, term4241407.getClass(), "lastRomVersion", "MXoqAwOQaq");
        setField(term4241407, term4241407.getClass(), "lastDataVersion", "teghZSOhqx");
        setField(term4241407, term4241407.getClass(), "lastLoginDate", "fBefahhkEk");
        setField(term4241407, term4241407.getClass(), "lastPlayDate", "XtRlSRHGmN");
        setIntField(term4241407, term4241407.getClass(), "lastPlayCredit", 1497931892);
        setIntField(term4241407, term4241407.getClass(), "lastPlayMode", -1992163433);
        setIntField(term4241407, term4241407.getClass(), "lastPlaceId", 1207444800);
        setField(term4241407, term4241407.getClass(), "lastPlaceName", "YYMSBenCpE");
        setIntField(term4241407, term4241407.getClass(), "lastAllNetId", 68975914);
        setIntField(term4241407, term4241407.getClass(), "lastRegionId", -1430996641);
        setField(term4241407, term4241407.getClass(), "lastRegionName", "uYVFOagksI");
        setField(term4241407, term4241407.getClass(), "lastClientId", "iAwaVvMvpN");
        setField(term4241407, term4241407.getClass(), "lastCountryCode", "dlPOPLZScC");
        setIntField(term4241407, term4241407.getClass(), "lastSelectEMoney", -1231496176);
        setIntField(term4241407, term4241407.getClass(), "lastSelectTicket", 721176071);
        setIntField(term4241407, term4241407.getClass(), "lastSelectCourse", -920074058);
        setIntField(term4241407, term4241407.getClass(), "lastCountCourse", -34065457);
        setField(term4241407, term4241407.getClass(), "firstGameId", "MuoriXDtjn");
        setField(term4241407, term4241407.getClass(), "firstRomVersion", "QngceigpGY");
        setField(term4241407, term4241407.getClass(), "firstDataVersion", "EwRmdSaAja");
        setField(term4241407, term4241407.getClass(), "firstPlayDate", "wCttyEIUwX");
        setField(term4241407, term4241407.getClass(), "compatibleCmVersion", "xtIjADNErv");
        setField(term4241407, term4241407.getClass(), "dailyBonusDate", "rFIrDirPup");
        setField(term4241407, term4241407.getClass(), "dailyCourseBonusDate", "QtrEWHOOZn");
        setField(term4241407, term4241407.getClass(), "lastPairLoginDate", "JiKltegdAu");
        setField(term4241407, term4241407.getClass(), "lastTrialPlayDate", "BRbVPobuKR");
        setIntField(term4241407, term4241407.getClass(), "playVsCount", -1629809693);
        setIntField(term4241407, term4241407.getClass(), "playSyncCount", -1635086607);
        setIntField(term4241407, term4241407.getClass(), "winCount", 112174360);
        setIntField(term4241407, term4241407.getClass(), "helpCount", 2099789101);
        setIntField(term4241407, term4241407.getClass(), "comboCount", -1533451889);
        setLongField(term4241407, term4241407.getClass(), "totalDeluxscore", -2060814493378020887L);
        setLongField(term4241407, term4241407.getClass(), "totalBasicDeluxscore", 2198119912054953852L);
        setLongField(term4241407, term4241407.getClass(), "totalAdvancedDeluxscore", -1965771181456260470L);
        setLongField(term4241407, term4241407.getClass(), "totalExpertDeluxscore", -3648255542873119191L);
        setLongField(term4241407, term4241407.getClass(), "totalMasterDeluxscore", 1863980495087581275L);
        setLongField(term4241407, term4241407.getClass(), "totalReMasterDeluxscore", 2961635122172947252L);
        setIntField(term4241407, term4241407.getClass(), "totalSync", -933218901);
        setIntField(term4241407, term4241407.getClass(), "totalBasicSync", -1882716528);
        setIntField(term4241407, term4241407.getClass(), "totalAdvancedSync", 374085718);
        setIntField(term4241407, term4241407.getClass(), "totalExpertSync", -850003457);
        setIntField(term4241407, term4241407.getClass(), "totalMasterSync", 508809593);
        setIntField(term4241407, term4241407.getClass(), "totalReMasterSync", -2131471803);
        setLongField(term4241407, term4241407.getClass(), "totalAchievement", 8023155809352942368L);
        setLongField(term4241407, term4241407.getClass(), "totalBasicAchievement", -3502786613671513680L);
        setLongField(term4241407, term4241407.getClass(), "totalAdvancedAchievement", 2183211122332395163L);
        setLongField(term4241407, term4241407.getClass(), "totalExpertAchievement", -5807677480897444652L);
        setLongField(term4241407, term4241407.getClass(), "totalMasterAchievement", -9061270430891139095L);
        setLongField(term4241407, term4241407.getClass(), "totalReMasterAchievement", 1031747789523428863L);
        setLongField(term4241407, term4241407.getClass(), "playerOldRating", -5383183038164323029L);
        setLongField(term4241407, term4241407.getClass(), "playerNewRating", 2834392010639597307L);
        setIntField(term4241407, term4241407.getClass(), "banState", -2124679247);
        setLongField(term4241407, term4241407.getClass(), "dateTime", -6221405579942077593L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term4241407, args);
    }

};


