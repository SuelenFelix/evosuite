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

public class UserDetail_getTotalAwake_195129836911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201299;

    public UserDetail_getTotalAwake_195129836911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term201303 = new Long(4552367707739103094L);
        Integer term201366 = new Integer(-724930680);
        Integer term201368 = new Integer(-1859413089);
        Integer term201370 = new Integer(-288823387);
        Integer term201372 = new Integer(1565022809);
        ArrayList term201364 = new ArrayList();
        ((ArrayList) term201364).add(term201366);
        ((ArrayList) term201364).add(term201368);
        ((ArrayList) term201364).add(term201370);
        ((ArrayList) term201364).add(term201372);
        Integer term201378 = new Integer(286088345);
        Integer term201380 = new Integer(-1958895309);
        Integer term201382 = new Integer(-639022235);
        Integer term201384 = new Integer(-1063872965);
        Integer term201386 = new Integer(804907633);
        ArrayList term201376 = new ArrayList();
        ((ArrayList) term201376).add(term201378);
        ((ArrayList) term201376).add(term201380);
        ((ArrayList) term201376).add(term201382);
        ((ArrayList) term201376).add(term201384);
        ((ArrayList) term201376).add(term201386);
        term201299 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term201301 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term201317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term201327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201332 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201299, term201299.getClass(), "id", -1090685640573822657L);
        setLongField(term201301, term201301.getClass(), "id", 8481202509052388559L);
        setField(term201301, term201301.getClass(), "extId", term201303);
        setField(term201301, term201301.getClass(), "luid", "aCelWtbpig");
        setIntField(term201318, term201318.getClass(), "year", 2025);
        setShortField(term201318, term201318.getClass(), "month", (short) 9);
        setShortField(term201318, term201318.getClass(), "day", (short) 30);
        setField(term201317, term201317.getClass(), "date", term201318);
        setByteField(term201322, term201322.getClass(), "hour", (byte) 1);
        setByteField(term201322, term201322.getClass(), "minute", (byte) 24);
        setByteField(term201322, term201322.getClass(), "second", (byte) 57);
        setIntField(term201322, term201322.getClass(), "nano", 411199118);
        setField(term201317, term201317.getClass(), "time", term201322);
        setField(term201301, term201301.getClass(), "registerTime", term201317);
        setIntField(term201328, term201328.getClass(), "year", 2017);
        setShortField(term201328, term201328.getClass(), "month", (short) 5);
        setShortField(term201328, term201328.getClass(), "day", (short) 18);
        setField(term201327, term201327.getClass(), "date", term201328);
        setByteField(term201332, term201332.getClass(), "hour", (byte) 16);
        setByteField(term201332, term201332.getClass(), "minute", (byte) 29);
        setByteField(term201332, term201332.getClass(), "second", (byte) 6);
        setIntField(term201332, term201332.getClass(), "nano", 770428301);
        setField(term201327, term201327.getClass(), "time", term201332);
        setField(term201301, term201301.getClass(), "accessTime", term201327);
        setField(term201299, term201299.getClass(), "card", term201301);
        setField(term201299, term201299.getClass(), "userName", "TubQqMAZMG");
        setIntField(term201299, term201299.getClass(), "isNetMember", -41191754);
        setIntField(term201299, term201299.getClass(), "iconId", -298829219);
        setIntField(term201299, term201299.getClass(), "plateId", -1327779796);
        setIntField(term201299, term201299.getClass(), "titleId", -386655726);
        setIntField(term201299, term201299.getClass(), "partnerId", -1507263372);
        setIntField(term201299, term201299.getClass(), "frameId", 1422961512);
        setIntField(term201299, term201299.getClass(), "selectMapId", 1716206989);
        setIntField(term201299, term201299.getClass(), "totalAwake", -1686050149);
        setIntField(term201299, term201299.getClass(), "gradeRating", 801148897);
        setIntField(term201299, term201299.getClass(), "musicRating", -1859757820);
        setIntField(term201299, term201299.getClass(), "playerRating", -1791319968);
        setIntField(term201299, term201299.getClass(), "highestRating", 80849890);
        setIntField(term201299, term201299.getClass(), "gradeRank", -554684079);
        setIntField(term201299, term201299.getClass(), "classRank", 162685569);
        setIntField(term201299, term201299.getClass(), "courseRank", -291983428);
        setField(term201299, term201299.getClass(), "charaSlot", term201364);
        setField(term201299, term201299.getClass(), "charaLockSlot", term201376);
        setLongField(term201299, term201299.getClass(), "contentBit", 7721367588958130964L);
        setIntField(term201299, term201299.getClass(), "playCount", -1465588855);
        setField(term201299, term201299.getClass(), "eventWatchedDate", "IUuulkfmPZ");
        setField(term201299, term201299.getClass(), "lastGameId", "HMifkHQqqR");
        setField(term201299, term201299.getClass(), "lastRomVersion", "LUhJYRnWlM");
        setField(term201299, term201299.getClass(), "lastDataVersion", "PXBOCbWSgZ");
        setField(term201299, term201299.getClass(), "lastLoginDate", "MMzUVotIxA");
        setField(term201299, term201299.getClass(), "lastPlayDate", "IEsKbVeLPx");
        setIntField(term201299, term201299.getClass(), "lastPlayCredit", 758026643);
        setIntField(term201299, term201299.getClass(), "lastPlayMode", -1012041102);
        setIntField(term201299, term201299.getClass(), "lastPlaceId", 997299459);
        setField(term201299, term201299.getClass(), "lastPlaceName", "QAHCagitRs");
        setIntField(term201299, term201299.getClass(), "lastAllNetId", 1765607800);
        setIntField(term201299, term201299.getClass(), "lastRegionId", 1162343322);
        setField(term201299, term201299.getClass(), "lastRegionName", "gSOrkTglFJ");
        setField(term201299, term201299.getClass(), "lastClientId", "fKXvKpxZED");
        setField(term201299, term201299.getClass(), "lastCountryCode", "CprvJJGTqi");
        setIntField(term201299, term201299.getClass(), "lastSelectEMoney", -769830529);
        setIntField(term201299, term201299.getClass(), "lastSelectTicket", 980926498);
        setIntField(term201299, term201299.getClass(), "lastSelectCourse", 215326924);
        setIntField(term201299, term201299.getClass(), "lastCountCourse", -1550515105);
        setField(term201299, term201299.getClass(), "firstGameId", "OJGakpSQhy");
        setField(term201299, term201299.getClass(), "firstRomVersion", "FwGREezwMB");
        setField(term201299, term201299.getClass(), "firstDataVersion", "YxEZYvgyuO");
        setField(term201299, term201299.getClass(), "firstPlayDate", "lRBYPAjXhB");
        setField(term201299, term201299.getClass(), "compatibleCmVersion", "qrsQgUztdZ");
        setField(term201299, term201299.getClass(), "dailyBonusDate", "QenkwXumYt");
        setField(term201299, term201299.getClass(), "dailyCourseBonusDate", "ezxBCHaETQ");
        setField(term201299, term201299.getClass(), "lastPairLoginDate", "AgmkTabDEc");
        setField(term201299, term201299.getClass(), "lastTrialPlayDate", "zrLjRgoVtb");
        setIntField(term201299, term201299.getClass(), "playVsCount", -1856677255);
        setIntField(term201299, term201299.getClass(), "playSyncCount", -1066312681);
        setIntField(term201299, term201299.getClass(), "winCount", 1151101967);
        setIntField(term201299, term201299.getClass(), "helpCount", 720162054);
        setIntField(term201299, term201299.getClass(), "comboCount", 1656175535);
        setLongField(term201299, term201299.getClass(), "totalDeluxscore", -6789574876678140919L);
        setLongField(term201299, term201299.getClass(), "totalBasicDeluxscore", 4235835302914779558L);
        setLongField(term201299, term201299.getClass(), "totalAdvancedDeluxscore", 5789812911203527529L);
        setLongField(term201299, term201299.getClass(), "totalExpertDeluxscore", -2921396027918856479L);
        setLongField(term201299, term201299.getClass(), "totalMasterDeluxscore", 8769968545433324623L);
        setLongField(term201299, term201299.getClass(), "totalReMasterDeluxscore", 8714017236816228053L);
        setIntField(term201299, term201299.getClass(), "totalSync", -529922125);
        setIntField(term201299, term201299.getClass(), "totalBasicSync", -1030934359);
        setIntField(term201299, term201299.getClass(), "totalAdvancedSync", -1413405889);
        setIntField(term201299, term201299.getClass(), "totalExpertSync", 351830399);
        setIntField(term201299, term201299.getClass(), "totalMasterSync", -398403935);
        setIntField(term201299, term201299.getClass(), "totalReMasterSync", -1098793577);
        setLongField(term201299, term201299.getClass(), "totalAchievement", -2138860539097099816L);
        setLongField(term201299, term201299.getClass(), "totalBasicAchievement", 618190787574958453L);
        setLongField(term201299, term201299.getClass(), "totalAdvancedAchievement", 6155219870602408510L);
        setLongField(term201299, term201299.getClass(), "totalExpertAchievement", -3408269754908466021L);
        setLongField(term201299, term201299.getClass(), "totalMasterAchievement", -8672632881497791875L);
        setLongField(term201299, term201299.getClass(), "totalReMasterAchievement", 8521036802644417102L);
        setLongField(term201299, term201299.getClass(), "playerOldRating", -5475408143560615878L);
        setLongField(term201299, term201299.getClass(), "playerNewRating", 4925350046977345351L);
        setIntField(term201299, term201299.getClass(), "banState", 937901039);
        setLongField(term201299, term201299.getClass(), "dateTime", -1029002728045148704L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAwake", argTypes, term201299, args);
    }

};


