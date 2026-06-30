package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_equals_16094446979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110811;
     Object term111011;

    public UserGeneralData_equals_16094446979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110817 = new Long(3472971833455746664L);
        term110811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term110813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term110815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110846 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110811, term110811.getClass(), "id", 280552269591781447L);
        setLongField(term110813, term110813.getClass(), "id", 1721306000453653222L);
        setLongField(term110815, term110815.getClass(), "id", -8538252445590221089L);
        setField(term110815, term110815.getClass(), "extId", term110817);
        setField(term110815, term110815.getClass(), "luid", "BwsQOfTpXz");
        setIntField(term110832, term110832.getClass(), "year", 2026);
        setShortField(term110832, term110832.getClass(), "month", (short) 11);
        setShortField(term110832, term110832.getClass(), "day", (short) 25);
        setField(term110831, term110831.getClass(), "date", term110832);
        setByteField(term110836, term110836.getClass(), "hour", (byte) 12);
        setByteField(term110836, term110836.getClass(), "minute", (byte) 39);
        setByteField(term110836, term110836.getClass(), "second", (byte) 8);
        setIntField(term110836, term110836.getClass(), "nano", 444272669);
        setField(term110831, term110831.getClass(), "time", term110836);
        setField(term110815, term110815.getClass(), "registerTime", term110831);
        setIntField(term110842, term110842.getClass(), "year", 2023);
        setShortField(term110842, term110842.getClass(), "month", (short) 1);
        setShortField(term110842, term110842.getClass(), "day", (short) 9);
        setField(term110841, term110841.getClass(), "date", term110842);
        setByteField(term110846, term110846.getClass(), "hour", (byte) 5);
        setByteField(term110846, term110846.getClass(), "minute", (byte) 45);
        setByteField(term110846, term110846.getClass(), "second", (byte) 39);
        setIntField(term110846, term110846.getClass(), "nano", 734895244);
        setField(term110841, term110841.getClass(), "time", term110846);
        setField(term110815, term110815.getClass(), "accessTime", term110841);
        setField(term110813, term110813.getClass(), "card", term110815);
        setIntField(term110813, term110813.getClass(), "lastDataVersion", -1501372469);
        setField(term110813, term110813.getClass(), "userName", "ywBwAaqimp");
        setIntField(term110813, term110813.getClass(), "point", -2144578406);
        setIntField(term110813, term110813.getClass(), "totalPoint", -1984046630);
        setIntField(term110813, term110813.getClass(), "iconId", -1548385276);
        setIntField(term110813, term110813.getClass(), "nameplateId", 565549934);
        setIntField(term110813, term110813.getClass(), "frameId", 1177281465);
        setIntField(term110813, term110813.getClass(), "trophyId", -1236004824);
        setIntField(term110813, term110813.getClass(), "playCount", -311539591);
        setIntField(term110813, term110813.getClass(), "playVsCount", -1770831459);
        setIntField(term110813, term110813.getClass(), "playSyncCount", -502669627);
        setIntField(term110813, term110813.getClass(), "winCount", 2108204698);
        setIntField(term110813, term110813.getClass(), "helpCount", 1506339933);
        setIntField(term110813, term110813.getClass(), "comboCount", -928174053);
        setIntField(term110813, term110813.getClass(), "feverCount", 1179317706);
        setIntField(term110813, term110813.getClass(), "totalHiScore", -279431300);
        setIntField(term110813, term110813.getClass(), "totalEasyHighScore", 1136629984);
        setIntField(term110813, term110813.getClass(), "totalBasicHighScore", -1618661197);
        setIntField(term110813, term110813.getClass(), "totalAdvancedHighScore", 38755177);
        setIntField(term110813, term110813.getClass(), "totalExpertHighScore", 164361364);
        setIntField(term110813, term110813.getClass(), "totalMasterHighScore", -1933122225);
        setIntField(term110813, term110813.getClass(), "totalReMasterHighScore", 6941292);
        setIntField(term110813, term110813.getClass(), "totalHighSync", -1894535169);
        setIntField(term110813, term110813.getClass(), "totalEasySync", -1194320522);
        setIntField(term110813, term110813.getClass(), "totalBasicSync", 513650910);
        setIntField(term110813, term110813.getClass(), "totalAdvancedSync", -1964199429);
        setIntField(term110813, term110813.getClass(), "totalExpertSync", 628292358);
        setIntField(term110813, term110813.getClass(), "totalMasterSync", -169146602);
        setIntField(term110813, term110813.getClass(), "totalReMasterSync", 899306663);
        setIntField(term110813, term110813.getClass(), "playerRating", 708799864);
        setIntField(term110813, term110813.getClass(), "highestRating", -851159365);
        setIntField(term110813, term110813.getClass(), "rankAuthTailId", 1399097502);
        setField(term110813, term110813.getClass(), "eventWatchedDate", "ksNDLlwYiK");
        setField(term110813, term110813.getClass(), "webLimitDate", "KNuSMewyWo");
        setIntField(term110813, term110813.getClass(), "challengeTrackPhase", 1779069426);
        setIntField(term110813, term110813.getClass(), "firstPlayBits", 1157660501);
        setField(term110813, term110813.getClass(), "lastPlayDate", "OeZpauZbQm");
        setIntField(term110813, term110813.getClass(), "lastPlaceId", 490025473);
        setField(term110813, term110813.getClass(), "lastPlaceName", "UjNsLLEXru");
        setIntField(term110813, term110813.getClass(), "lastRegionId", 966189442);
        setField(term110813, term110813.getClass(), "lastRegionName", "VNJLpmwKSs");
        setField(term110813, term110813.getClass(), "lastClientId", "kOHYxuEOpb");
        setField(term110813, term110813.getClass(), "lastCountryCode", "kyzuYwxwKl");
        setIntField(term110813, term110813.getClass(), "eventPoint", -322248521);
        setIntField(term110813, term110813.getClass(), "totalLv", 1676012683);
        setIntField(term110813, term110813.getClass(), "lastLoginBonusDay", 1173048453);
        setIntField(term110813, term110813.getClass(), "lastSurvivalBonusDay", -702583600);
        setIntField(term110813, term110813.getClass(), "loginBonusLv", 1234272864);
        setField(term110811, term110811.getClass(), "user", term110813);
        setField(term110811, term110811.getClass(), "propertyKey", "plqwsHlTLA");
        setField(term110811, term110811.getClass(), "propertyValue", "DDkbTPlKrm");
        term111011 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111011;
        callMethod(klass, "equals", argTypes, term110811, args);
    }

};


