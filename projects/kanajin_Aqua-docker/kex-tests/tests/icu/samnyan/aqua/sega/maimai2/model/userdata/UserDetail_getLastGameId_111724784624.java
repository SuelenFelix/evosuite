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

public class UserDetail_getLastGameId_111724784624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208642;

    public UserDetail_getLastGameId_111724784624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208646 = new Long(7799452759993694308L);
        Integer term208709 = new Integer(984819165);
        Integer term208711 = new Integer(1276438509);
        Integer term208713 = new Integer(-934156422);
        Integer term208715 = new Integer(-1644931931);
        Integer term208717 = new Integer(-1890108963);
        ArrayList term208707 = new ArrayList();
        ((ArrayList) term208707).add(term208709);
        ((ArrayList) term208707).add(term208711);
        ((ArrayList) term208707).add(term208713);
        ((ArrayList) term208707).add(term208715);
        ((ArrayList) term208707).add(term208717);
        Integer term208723 = new Integer(1848496553);
        Integer term208725 = new Integer(79714955);
        Integer term208727 = new Integer(-1409613044);
        Integer term208729 = new Integer(-1594530234);
        Integer term208731 = new Integer(-414324261);
        Integer term208733 = new Integer(-1729893211);
        ArrayList term208721 = new ArrayList();
        ((ArrayList) term208721).add(term208723);
        ((ArrayList) term208721).add(term208725);
        ((ArrayList) term208721).add(term208727);
        ((ArrayList) term208721).add(term208729);
        ((ArrayList) term208721).add(term208731);
        ((ArrayList) term208721).add(term208733);
        term208642 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term208644 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term208660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208675 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term208642, term208642.getClass(), "id", 2784989584166782636L);
        setLongField(term208644, term208644.getClass(), "id", 5192263620993850189L);
        setField(term208644, term208644.getClass(), "extId", term208646);
        setField(term208644, term208644.getClass(), "luid", "bdCgoAUUik");
        setIntField(term208661, term208661.getClass(), "year", 2016);
        setShortField(term208661, term208661.getClass(), "month", (short) 12);
        setShortField(term208661, term208661.getClass(), "day", (short) 21);
        setField(term208660, term208660.getClass(), "date", term208661);
        setByteField(term208665, term208665.getClass(), "hour", (byte) 14);
        setByteField(term208665, term208665.getClass(), "minute", (byte) 3);
        setByteField(term208665, term208665.getClass(), "second", (byte) 9);
        setIntField(term208665, term208665.getClass(), "nano", 805869273);
        setField(term208660, term208660.getClass(), "time", term208665);
        setField(term208644, term208644.getClass(), "registerTime", term208660);
        setIntField(term208671, term208671.getClass(), "year", 2011);
        setShortField(term208671, term208671.getClass(), "month", (short) 12);
        setShortField(term208671, term208671.getClass(), "day", (short) 31);
        setField(term208670, term208670.getClass(), "date", term208671);
        setByteField(term208675, term208675.getClass(), "hour", (byte) 6);
        setByteField(term208675, term208675.getClass(), "minute", (byte) 27);
        setByteField(term208675, term208675.getClass(), "second", (byte) 8);
        setIntField(term208675, term208675.getClass(), "nano", 782094318);
        setField(term208670, term208670.getClass(), "time", term208675);
        setField(term208644, term208644.getClass(), "accessTime", term208670);
        setField(term208642, term208642.getClass(), "card", term208644);
        setField(term208642, term208642.getClass(), "userName", "kYlHaYBXUm");
        setIntField(term208642, term208642.getClass(), "isNetMember", 417417686);
        setIntField(term208642, term208642.getClass(), "iconId", -862439850);
        setIntField(term208642, term208642.getClass(), "plateId", -1769155675);
        setIntField(term208642, term208642.getClass(), "titleId", 56458333);
        setIntField(term208642, term208642.getClass(), "partnerId", 418235602);
        setIntField(term208642, term208642.getClass(), "frameId", 239913244);
        setIntField(term208642, term208642.getClass(), "selectMapId", -1013753559);
        setIntField(term208642, term208642.getClass(), "totalAwake", -43814994);
        setIntField(term208642, term208642.getClass(), "gradeRating", -703544966);
        setIntField(term208642, term208642.getClass(), "musicRating", -479486809);
        setIntField(term208642, term208642.getClass(), "playerRating", 958022606);
        setIntField(term208642, term208642.getClass(), "highestRating", -743651440);
        setIntField(term208642, term208642.getClass(), "gradeRank", 1996863622);
        setIntField(term208642, term208642.getClass(), "classRank", 538262655);
        setIntField(term208642, term208642.getClass(), "courseRank", -661864434);
        setField(term208642, term208642.getClass(), "charaSlot", term208707);
        setField(term208642, term208642.getClass(), "charaLockSlot", term208721);
        setLongField(term208642, term208642.getClass(), "contentBit", 3688805095243382453L);
        setIntField(term208642, term208642.getClass(), "playCount", 1633649139);
        setField(term208642, term208642.getClass(), "eventWatchedDate", "oQmIQsrCkS");
        setField(term208642, term208642.getClass(), "lastGameId", "NpDJoXcUkI");
        setField(term208642, term208642.getClass(), "lastRomVersion", "MqwWpEWgjk");
        setField(term208642, term208642.getClass(), "lastDataVersion", "BpBhuAjVQp");
        setField(term208642, term208642.getClass(), "lastLoginDate", "QKLHvMlwjO");
        setField(term208642, term208642.getClass(), "lastPlayDate", "cRYFnmgWkQ");
        setIntField(term208642, term208642.getClass(), "lastPlayCredit", 865740366);
        setIntField(term208642, term208642.getClass(), "lastPlayMode", 2055184211);
        setIntField(term208642, term208642.getClass(), "lastPlaceId", -178928635);
        setField(term208642, term208642.getClass(), "lastPlaceName", "vzPwHQljpk");
        setIntField(term208642, term208642.getClass(), "lastAllNetId", -1900928314);
        setIntField(term208642, term208642.getClass(), "lastRegionId", 1771936673);
        setField(term208642, term208642.getClass(), "lastRegionName", "fUhPiJEcYO");
        setField(term208642, term208642.getClass(), "lastClientId", "dkiklmXtsm");
        setField(term208642, term208642.getClass(), "lastCountryCode", "UWqNpGeOLP");
        setIntField(term208642, term208642.getClass(), "lastSelectEMoney", 2143013182);
        setIntField(term208642, term208642.getClass(), "lastSelectTicket", -1417724314);
        setIntField(term208642, term208642.getClass(), "lastSelectCourse", 399632866);
        setIntField(term208642, term208642.getClass(), "lastCountCourse", -2021554219);
        setField(term208642, term208642.getClass(), "firstGameId", "SbkAYLVQCU");
        setField(term208642, term208642.getClass(), "firstRomVersion", "KhujxNcUFH");
        setField(term208642, term208642.getClass(), "firstDataVersion", "wwasDIckaj");
        setField(term208642, term208642.getClass(), "firstPlayDate", "sjDZCQlsXB");
        setField(term208642, term208642.getClass(), "compatibleCmVersion", "fhzGBTdcwn");
        setField(term208642, term208642.getClass(), "dailyBonusDate", "szTrbIyfvl");
        setField(term208642, term208642.getClass(), "dailyCourseBonusDate", "ffkDPmGZUE");
        setField(term208642, term208642.getClass(), "lastPairLoginDate", "LCeiGlwPuu");
        setField(term208642, term208642.getClass(), "lastTrialPlayDate", "ZHSmPFRHgz");
        setIntField(term208642, term208642.getClass(), "playVsCount", -1413689781);
        setIntField(term208642, term208642.getClass(), "playSyncCount", 815841458);
        setIntField(term208642, term208642.getClass(), "winCount", 1868301095);
        setIntField(term208642, term208642.getClass(), "helpCount", -194834401);
        setIntField(term208642, term208642.getClass(), "comboCount", 1718483259);
        setLongField(term208642, term208642.getClass(), "totalDeluxscore", 4504937734635718579L);
        setLongField(term208642, term208642.getClass(), "totalBasicDeluxscore", 4550990309509192328L);
        setLongField(term208642, term208642.getClass(), "totalAdvancedDeluxscore", -6301961764848707433L);
        setLongField(term208642, term208642.getClass(), "totalExpertDeluxscore", -8747431336815446312L);
        setLongField(term208642, term208642.getClass(), "totalMasterDeluxscore", -5237303979276642621L);
        setLongField(term208642, term208642.getClass(), "totalReMasterDeluxscore", 827172037650237837L);
        setIntField(term208642, term208642.getClass(), "totalSync", 835852454);
        setIntField(term208642, term208642.getClass(), "totalBasicSync", -1015606044);
        setIntField(term208642, term208642.getClass(), "totalAdvancedSync", 772442148);
        setIntField(term208642, term208642.getClass(), "totalExpertSync", -801236347);
        setIntField(term208642, term208642.getClass(), "totalMasterSync", 1672056052);
        setIntField(term208642, term208642.getClass(), "totalReMasterSync", -980627332);
        setLongField(term208642, term208642.getClass(), "totalAchievement", 1415789027177212909L);
        setLongField(term208642, term208642.getClass(), "totalBasicAchievement", 5250367726867863750L);
        setLongField(term208642, term208642.getClass(), "totalAdvancedAchievement", 3641398779533777761L);
        setLongField(term208642, term208642.getClass(), "totalExpertAchievement", 517399789627055649L);
        setLongField(term208642, term208642.getClass(), "totalMasterAchievement", -6702247661881581347L);
        setLongField(term208642, term208642.getClass(), "totalReMasterAchievement", 8109320850468051513L);
        setLongField(term208642, term208642.getClass(), "playerOldRating", -7682038221789898309L);
        setLongField(term208642, term208642.getClass(), "playerNewRating", 9005437068517350512L);
        setIntField(term208642, term208642.getClass(), "banState", 437346255);
        setLongField(term208642, term208642.getClass(), "dateTime", 5993031302576036949L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term208642, args);
    }

};


