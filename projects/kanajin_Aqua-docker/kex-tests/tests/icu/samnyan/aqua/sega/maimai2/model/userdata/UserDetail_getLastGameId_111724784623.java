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

public class UserDetail_getLastGameId_111724784623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208587;

    public UserDetail_getLastGameId_111724784623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208591 = new Long(7799452759993694308L);
        Integer term208654 = new Integer(984819165);
        Integer term208656 = new Integer(1276438509);
        Integer term208658 = new Integer(-934156422);
        Integer term208660 = new Integer(-1644931931);
        Integer term208662 = new Integer(-1890108963);
        ArrayList term208652 = new ArrayList();
        ((ArrayList) term208652).add(term208654);
        ((ArrayList) term208652).add(term208656);
        ((ArrayList) term208652).add(term208658);
        ((ArrayList) term208652).add(term208660);
        ((ArrayList) term208652).add(term208662);
        Integer term208668 = new Integer(1848496553);
        Integer term208670 = new Integer(79714955);
        Integer term208672 = new Integer(-1409613044);
        Integer term208674 = new Integer(-1594530234);
        Integer term208676 = new Integer(-414324261);
        Integer term208678 = new Integer(-1729893211);
        ArrayList term208666 = new ArrayList();
        ((ArrayList) term208666).add(term208668);
        ((ArrayList) term208666).add(term208670);
        ((ArrayList) term208666).add(term208672);
        ((ArrayList) term208666).add(term208674);
        ((ArrayList) term208666).add(term208676);
        ((ArrayList) term208666).add(term208678);
        term208587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term208589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term208605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term208587, term208587.getClass(), "id", 2784989584166782636L);
        setLongField(term208589, term208589.getClass(), "id", 5192263620993850189L);
        setField(term208589, term208589.getClass(), "extId", term208591);
        setField(term208589, term208589.getClass(), "luid", "bdCgoAUUik");
        setIntField(term208606, term208606.getClass(), "year", 2016);
        setShortField(term208606, term208606.getClass(), "month", (short) 12);
        setShortField(term208606, term208606.getClass(), "day", (short) 21);
        setField(term208605, term208605.getClass(), "date", term208606);
        setByteField(term208610, term208610.getClass(), "hour", (byte) 14);
        setByteField(term208610, term208610.getClass(), "minute", (byte) 3);
        setByteField(term208610, term208610.getClass(), "second", (byte) 9);
        setIntField(term208610, term208610.getClass(), "nano", 805869273);
        setField(term208605, term208605.getClass(), "time", term208610);
        setField(term208589, term208589.getClass(), "registerTime", term208605);
        setIntField(term208616, term208616.getClass(), "year", 2011);
        setShortField(term208616, term208616.getClass(), "month", (short) 12);
        setShortField(term208616, term208616.getClass(), "day", (short) 31);
        setField(term208615, term208615.getClass(), "date", term208616);
        setByteField(term208620, term208620.getClass(), "hour", (byte) 6);
        setByteField(term208620, term208620.getClass(), "minute", (byte) 27);
        setByteField(term208620, term208620.getClass(), "second", (byte) 8);
        setIntField(term208620, term208620.getClass(), "nano", 782094318);
        setField(term208615, term208615.getClass(), "time", term208620);
        setField(term208589, term208589.getClass(), "accessTime", term208615);
        setField(term208587, term208587.getClass(), "card", term208589);
        setField(term208587, term208587.getClass(), "userName", "kYlHaYBXUm");
        setIntField(term208587, term208587.getClass(), "isNetMember", 417417686);
        setIntField(term208587, term208587.getClass(), "iconId", -862439850);
        setIntField(term208587, term208587.getClass(), "plateId", -1769155675);
        setIntField(term208587, term208587.getClass(), "titleId", 56458333);
        setIntField(term208587, term208587.getClass(), "partnerId", 418235602);
        setIntField(term208587, term208587.getClass(), "frameId", 239913244);
        setIntField(term208587, term208587.getClass(), "selectMapId", -1013753559);
        setIntField(term208587, term208587.getClass(), "totalAwake", -43814994);
        setIntField(term208587, term208587.getClass(), "gradeRating", -703544966);
        setIntField(term208587, term208587.getClass(), "musicRating", -479486809);
        setIntField(term208587, term208587.getClass(), "playerRating", 958022606);
        setIntField(term208587, term208587.getClass(), "highestRating", -743651440);
        setIntField(term208587, term208587.getClass(), "gradeRank", 1996863622);
        setIntField(term208587, term208587.getClass(), "classRank", 538262655);
        setIntField(term208587, term208587.getClass(), "courseRank", -661864434);
        setField(term208587, term208587.getClass(), "charaSlot", term208652);
        setField(term208587, term208587.getClass(), "charaLockSlot", term208666);
        setLongField(term208587, term208587.getClass(), "contentBit", 3688805095243382453L);
        setIntField(term208587, term208587.getClass(), "playCount", 1633649139);
        setField(term208587, term208587.getClass(), "eventWatchedDate", "oQmIQsrCkS");
        setField(term208587, term208587.getClass(), "lastGameId", "NpDJoXcUkI");
        setField(term208587, term208587.getClass(), "lastRomVersion", "MqwWpEWgjk");
        setField(term208587, term208587.getClass(), "lastDataVersion", "BpBhuAjVQp");
        setField(term208587, term208587.getClass(), "lastLoginDate", "QKLHvMlwjO");
        setField(term208587, term208587.getClass(), "lastPlayDate", "cRYFnmgWkQ");
        setIntField(term208587, term208587.getClass(), "lastPlayCredit", 865740366);
        setIntField(term208587, term208587.getClass(), "lastPlayMode", 2055184211);
        setIntField(term208587, term208587.getClass(), "lastPlaceId", -178928635);
        setField(term208587, term208587.getClass(), "lastPlaceName", "vzPwHQljpk");
        setIntField(term208587, term208587.getClass(), "lastAllNetId", -1900928314);
        setIntField(term208587, term208587.getClass(), "lastRegionId", 1771936673);
        setField(term208587, term208587.getClass(), "lastRegionName", "fUhPiJEcYO");
        setField(term208587, term208587.getClass(), "lastClientId", "dkiklmXtsm");
        setField(term208587, term208587.getClass(), "lastCountryCode", "UWqNpGeOLP");
        setIntField(term208587, term208587.getClass(), "lastSelectEMoney", 2143013182);
        setIntField(term208587, term208587.getClass(), "lastSelectTicket", -1417724314);
        setIntField(term208587, term208587.getClass(), "lastSelectCourse", 399632866);
        setIntField(term208587, term208587.getClass(), "lastCountCourse", -2021554219);
        setField(term208587, term208587.getClass(), "firstGameId", "SbkAYLVQCU");
        setField(term208587, term208587.getClass(), "firstRomVersion", "KhujxNcUFH");
        setField(term208587, term208587.getClass(), "firstDataVersion", "wwasDIckaj");
        setField(term208587, term208587.getClass(), "firstPlayDate", "sjDZCQlsXB");
        setField(term208587, term208587.getClass(), "compatibleCmVersion", "fhzGBTdcwn");
        setField(term208587, term208587.getClass(), "dailyBonusDate", "szTrbIyfvl");
        setField(term208587, term208587.getClass(), "dailyCourseBonusDate", "ffkDPmGZUE");
        setField(term208587, term208587.getClass(), "lastPairLoginDate", "LCeiGlwPuu");
        setField(term208587, term208587.getClass(), "lastTrialPlayDate", "ZHSmPFRHgz");
        setIntField(term208587, term208587.getClass(), "playVsCount", -1413689781);
        setIntField(term208587, term208587.getClass(), "playSyncCount", 815841458);
        setIntField(term208587, term208587.getClass(), "winCount", 1868301095);
        setIntField(term208587, term208587.getClass(), "helpCount", -194834401);
        setIntField(term208587, term208587.getClass(), "comboCount", 1718483259);
        setLongField(term208587, term208587.getClass(), "totalDeluxscore", 4504937734635718579L);
        setLongField(term208587, term208587.getClass(), "totalBasicDeluxscore", 4550990309509192328L);
        setLongField(term208587, term208587.getClass(), "totalAdvancedDeluxscore", -6301961764848707433L);
        setLongField(term208587, term208587.getClass(), "totalExpertDeluxscore", -8747431336815446312L);
        setLongField(term208587, term208587.getClass(), "totalMasterDeluxscore", -5237303979276642621L);
        setLongField(term208587, term208587.getClass(), "totalReMasterDeluxscore", 827172037650237837L);
        setIntField(term208587, term208587.getClass(), "totalSync", 835852454);
        setIntField(term208587, term208587.getClass(), "totalBasicSync", -1015606044);
        setIntField(term208587, term208587.getClass(), "totalAdvancedSync", 772442148);
        setIntField(term208587, term208587.getClass(), "totalExpertSync", -801236347);
        setIntField(term208587, term208587.getClass(), "totalMasterSync", 1672056052);
        setIntField(term208587, term208587.getClass(), "totalReMasterSync", -980627332);
        setLongField(term208587, term208587.getClass(), "totalAchievement", 1415789027177212909L);
        setLongField(term208587, term208587.getClass(), "totalBasicAchievement", 5250367726867863750L);
        setLongField(term208587, term208587.getClass(), "totalAdvancedAchievement", 3641398779533777761L);
        setLongField(term208587, term208587.getClass(), "totalExpertAchievement", 517399789627055649L);
        setLongField(term208587, term208587.getClass(), "totalMasterAchievement", -6702247661881581347L);
        setLongField(term208587, term208587.getClass(), "totalReMasterAchievement", 8109320850468051513L);
        setLongField(term208587, term208587.getClass(), "playerOldRating", -7682038221789898309L);
        setLongField(term208587, term208587.getClass(), "playerNewRating", 9005437068517350512L);
        setIntField(term208587, term208587.getClass(), "banState", 437346255);
        setLongField(term208587, term208587.getClass(), "dateTime", 5993031302576036949L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term208587, args);
    }

};


