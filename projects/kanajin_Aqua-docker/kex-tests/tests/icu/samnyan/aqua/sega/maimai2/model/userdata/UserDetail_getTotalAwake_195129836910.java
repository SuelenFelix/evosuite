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

public class UserDetail_getTotalAwake_195129836910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201244;

    public UserDetail_getTotalAwake_195129836910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term201248 = new Long(4552367707739103094L);
        Integer term201311 = new Integer(-724930680);
        Integer term201313 = new Integer(-1859413089);
        Integer term201315 = new Integer(-288823387);
        Integer term201317 = new Integer(1565022809);
        ArrayList term201309 = new ArrayList();
        ((ArrayList) term201309).add(term201311);
        ((ArrayList) term201309).add(term201313);
        ((ArrayList) term201309).add(term201315);
        ((ArrayList) term201309).add(term201317);
        Integer term201323 = new Integer(286088345);
        Integer term201325 = new Integer(-1958895309);
        Integer term201327 = new Integer(-639022235);
        Integer term201329 = new Integer(-1063872965);
        Integer term201331 = new Integer(804907633);
        ArrayList term201321 = new ArrayList();
        ((ArrayList) term201321).add(term201323);
        ((ArrayList) term201321).add(term201325);
        ((ArrayList) term201321).add(term201327);
        ((ArrayList) term201321).add(term201329);
        ((ArrayList) term201321).add(term201331);
        term201244 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term201246 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term201262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term201272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201277 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201244, term201244.getClass(), "id", -1090685640573822657L);
        setLongField(term201246, term201246.getClass(), "id", 8481202509052388559L);
        setField(term201246, term201246.getClass(), "extId", term201248);
        setField(term201246, term201246.getClass(), "luid", "aCelWtbpig");
        setIntField(term201263, term201263.getClass(), "year", 2025);
        setShortField(term201263, term201263.getClass(), "month", (short) 9);
        setShortField(term201263, term201263.getClass(), "day", (short) 30);
        setField(term201262, term201262.getClass(), "date", term201263);
        setByteField(term201267, term201267.getClass(), "hour", (byte) 1);
        setByteField(term201267, term201267.getClass(), "minute", (byte) 24);
        setByteField(term201267, term201267.getClass(), "second", (byte) 57);
        setIntField(term201267, term201267.getClass(), "nano", 411199118);
        setField(term201262, term201262.getClass(), "time", term201267);
        setField(term201246, term201246.getClass(), "registerTime", term201262);
        setIntField(term201273, term201273.getClass(), "year", 2017);
        setShortField(term201273, term201273.getClass(), "month", (short) 5);
        setShortField(term201273, term201273.getClass(), "day", (short) 18);
        setField(term201272, term201272.getClass(), "date", term201273);
        setByteField(term201277, term201277.getClass(), "hour", (byte) 16);
        setByteField(term201277, term201277.getClass(), "minute", (byte) 29);
        setByteField(term201277, term201277.getClass(), "second", (byte) 6);
        setIntField(term201277, term201277.getClass(), "nano", 770428301);
        setField(term201272, term201272.getClass(), "time", term201277);
        setField(term201246, term201246.getClass(), "accessTime", term201272);
        setField(term201244, term201244.getClass(), "card", term201246);
        setField(term201244, term201244.getClass(), "userName", "TubQqMAZMG");
        setIntField(term201244, term201244.getClass(), "isNetMember", -41191754);
        setIntField(term201244, term201244.getClass(), "iconId", -298829219);
        setIntField(term201244, term201244.getClass(), "plateId", -1327779796);
        setIntField(term201244, term201244.getClass(), "titleId", -386655726);
        setIntField(term201244, term201244.getClass(), "partnerId", -1507263372);
        setIntField(term201244, term201244.getClass(), "frameId", 1422961512);
        setIntField(term201244, term201244.getClass(), "selectMapId", 1716206989);
        setIntField(term201244, term201244.getClass(), "totalAwake", -1686050149);
        setIntField(term201244, term201244.getClass(), "gradeRating", 801148897);
        setIntField(term201244, term201244.getClass(), "musicRating", -1859757820);
        setIntField(term201244, term201244.getClass(), "playerRating", -1791319968);
        setIntField(term201244, term201244.getClass(), "highestRating", 80849890);
        setIntField(term201244, term201244.getClass(), "gradeRank", -554684079);
        setIntField(term201244, term201244.getClass(), "classRank", 162685569);
        setIntField(term201244, term201244.getClass(), "courseRank", -291983428);
        setField(term201244, term201244.getClass(), "charaSlot", term201309);
        setField(term201244, term201244.getClass(), "charaLockSlot", term201321);
        setLongField(term201244, term201244.getClass(), "contentBit", 7721367588958130964L);
        setIntField(term201244, term201244.getClass(), "playCount", -1465588855);
        setField(term201244, term201244.getClass(), "eventWatchedDate", "IUuulkfmPZ");
        setField(term201244, term201244.getClass(), "lastGameId", "HMifkHQqqR");
        setField(term201244, term201244.getClass(), "lastRomVersion", "LUhJYRnWlM");
        setField(term201244, term201244.getClass(), "lastDataVersion", "PXBOCbWSgZ");
        setField(term201244, term201244.getClass(), "lastLoginDate", "MMzUVotIxA");
        setField(term201244, term201244.getClass(), "lastPlayDate", "IEsKbVeLPx");
        setIntField(term201244, term201244.getClass(), "lastPlayCredit", 758026643);
        setIntField(term201244, term201244.getClass(), "lastPlayMode", -1012041102);
        setIntField(term201244, term201244.getClass(), "lastPlaceId", 997299459);
        setField(term201244, term201244.getClass(), "lastPlaceName", "QAHCagitRs");
        setIntField(term201244, term201244.getClass(), "lastAllNetId", 1765607800);
        setIntField(term201244, term201244.getClass(), "lastRegionId", 1162343322);
        setField(term201244, term201244.getClass(), "lastRegionName", "gSOrkTglFJ");
        setField(term201244, term201244.getClass(), "lastClientId", "fKXvKpxZED");
        setField(term201244, term201244.getClass(), "lastCountryCode", "CprvJJGTqi");
        setIntField(term201244, term201244.getClass(), "lastSelectEMoney", -769830529);
        setIntField(term201244, term201244.getClass(), "lastSelectTicket", 980926498);
        setIntField(term201244, term201244.getClass(), "lastSelectCourse", 215326924);
        setIntField(term201244, term201244.getClass(), "lastCountCourse", -1550515105);
        setField(term201244, term201244.getClass(), "firstGameId", "OJGakpSQhy");
        setField(term201244, term201244.getClass(), "firstRomVersion", "FwGREezwMB");
        setField(term201244, term201244.getClass(), "firstDataVersion", "YxEZYvgyuO");
        setField(term201244, term201244.getClass(), "firstPlayDate", "lRBYPAjXhB");
        setField(term201244, term201244.getClass(), "compatibleCmVersion", "qrsQgUztdZ");
        setField(term201244, term201244.getClass(), "dailyBonusDate", "QenkwXumYt");
        setField(term201244, term201244.getClass(), "dailyCourseBonusDate", "ezxBCHaETQ");
        setField(term201244, term201244.getClass(), "lastPairLoginDate", "AgmkTabDEc");
        setField(term201244, term201244.getClass(), "lastTrialPlayDate", "zrLjRgoVtb");
        setIntField(term201244, term201244.getClass(), "playVsCount", -1856677255);
        setIntField(term201244, term201244.getClass(), "playSyncCount", -1066312681);
        setIntField(term201244, term201244.getClass(), "winCount", 1151101967);
        setIntField(term201244, term201244.getClass(), "helpCount", 720162054);
        setIntField(term201244, term201244.getClass(), "comboCount", 1656175535);
        setLongField(term201244, term201244.getClass(), "totalDeluxscore", -6789574876678140919L);
        setLongField(term201244, term201244.getClass(), "totalBasicDeluxscore", 4235835302914779558L);
        setLongField(term201244, term201244.getClass(), "totalAdvancedDeluxscore", 5789812911203527529L);
        setLongField(term201244, term201244.getClass(), "totalExpertDeluxscore", -2921396027918856479L);
        setLongField(term201244, term201244.getClass(), "totalMasterDeluxscore", 8769968545433324623L);
        setLongField(term201244, term201244.getClass(), "totalReMasterDeluxscore", 8714017236816228053L);
        setIntField(term201244, term201244.getClass(), "totalSync", -529922125);
        setIntField(term201244, term201244.getClass(), "totalBasicSync", -1030934359);
        setIntField(term201244, term201244.getClass(), "totalAdvancedSync", -1413405889);
        setIntField(term201244, term201244.getClass(), "totalExpertSync", 351830399);
        setIntField(term201244, term201244.getClass(), "totalMasterSync", -398403935);
        setIntField(term201244, term201244.getClass(), "totalReMasterSync", -1098793577);
        setLongField(term201244, term201244.getClass(), "totalAchievement", -2138860539097099816L);
        setLongField(term201244, term201244.getClass(), "totalBasicAchievement", 618190787574958453L);
        setLongField(term201244, term201244.getClass(), "totalAdvancedAchievement", 6155219870602408510L);
        setLongField(term201244, term201244.getClass(), "totalExpertAchievement", -3408269754908466021L);
        setLongField(term201244, term201244.getClass(), "totalMasterAchievement", -8672632881497791875L);
        setLongField(term201244, term201244.getClass(), "totalReMasterAchievement", 8521036802644417102L);
        setLongField(term201244, term201244.getClass(), "playerOldRating", -5475408143560615878L);
        setLongField(term201244, term201244.getClass(), "playerNewRating", 4925350046977345351L);
        setIntField(term201244, term201244.getClass(), "banState", 937901039);
        setLongField(term201244, term201244.getClass(), "dateTime", -1029002728045148704L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAwake", argTypes, term201244, args);
    }

};


