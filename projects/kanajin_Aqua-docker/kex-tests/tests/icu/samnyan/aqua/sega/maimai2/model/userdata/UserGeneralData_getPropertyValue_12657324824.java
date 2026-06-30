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

public class UserGeneralData_getPropertyValue_12657324824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134579;

    public UserGeneralData_getPropertyValue_12657324824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134585 = new Long(2191130532479601175L);
        Integer term134648 = new Integer(795205527);
        Integer term134650 = new Integer(600958607);
        Integer term134652 = new Integer(897159778);
        Integer term134654 = new Integer(-1934934961);
        Integer term134656 = new Integer(2120054887);
        Integer term134658 = new Integer(2145648967);
        Integer term134660 = new Integer(2060624021);
        ArrayList term134646 = new ArrayList();
        ((ArrayList) term134646).add(term134648);
        ((ArrayList) term134646).add(term134650);
        ((ArrayList) term134646).add(term134652);
        ((ArrayList) term134646).add(term134654);
        ((ArrayList) term134646).add(term134656);
        ((ArrayList) term134646).add(term134658);
        ((ArrayList) term134646).add(term134660);
        Integer term134666 = new Integer(-1853309523);
        Integer term134668 = new Integer(241741655);
        Integer term134670 = new Integer(-1062022366);
        Integer term134672 = new Integer(-1347618079);
        Integer term134674 = new Integer(1510246255);
        Integer term134676 = new Integer(-515631808);
        Integer term134678 = new Integer(1546701347);
        Integer term134680 = new Integer(-111931851);
        Integer term134682 = new Integer(-251696516);
        ArrayList term134664 = new ArrayList();
        ((ArrayList) term134664).add(term134666);
        ((ArrayList) term134664).add(term134668);
        ((ArrayList) term134664).add(term134670);
        ((ArrayList) term134664).add(term134672);
        ((ArrayList) term134664).add(term134674);
        ((ArrayList) term134664).add(term134676);
        ((ArrayList) term134664).add(term134678);
        ((ArrayList) term134664).add(term134680);
        ((ArrayList) term134664).add(term134682);
        term134579 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term134581 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term134583 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134614 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134579, term134579.getClass(), "id", -7755825356575550601L);
        setLongField(term134581, term134581.getClass(), "id", -7010012266529110156L);
        setLongField(term134583, term134583.getClass(), "id", 5236095463512454816L);
        setField(term134583, term134583.getClass(), "extId", term134585);
        setField(term134583, term134583.getClass(), "luid", "xWbVCwRARi");
        setIntField(term134600, term134600.getClass(), "year", 2016);
        setShortField(term134600, term134600.getClass(), "month", (short) 12);
        setShortField(term134600, term134600.getClass(), "day", (short) 3);
        setField(term134599, term134599.getClass(), "date", term134600);
        setByteField(term134604, term134604.getClass(), "hour", (byte) 8);
        setByteField(term134604, term134604.getClass(), "minute", (byte) 59);
        setByteField(term134604, term134604.getClass(), "second", (byte) 39);
        setIntField(term134604, term134604.getClass(), "nano", 208911877);
        setField(term134599, term134599.getClass(), "time", term134604);
        setField(term134583, term134583.getClass(), "registerTime", term134599);
        setIntField(term134610, term134610.getClass(), "year", 2023);
        setShortField(term134610, term134610.getClass(), "month", (short) 6);
        setShortField(term134610, term134610.getClass(), "day", (short) 5);
        setField(term134609, term134609.getClass(), "date", term134610);
        setByteField(term134614, term134614.getClass(), "hour", (byte) 22);
        setByteField(term134614, term134614.getClass(), "minute", (byte) 22);
        setByteField(term134614, term134614.getClass(), "second", (byte) 4);
        setIntField(term134614, term134614.getClass(), "nano", 656087896);
        setField(term134609, term134609.getClass(), "time", term134614);
        setField(term134583, term134583.getClass(), "accessTime", term134609);
        setField(term134581, term134581.getClass(), "card", term134583);
        setField(term134581, term134581.getClass(), "userName", "WNZjPUZVwT");
        setIntField(term134581, term134581.getClass(), "isNetMember", -910208002);
        setIntField(term134581, term134581.getClass(), "iconId", 1779017343);
        setIntField(term134581, term134581.getClass(), "plateId", 1035172702);
        setIntField(term134581, term134581.getClass(), "titleId", -2014376784);
        setIntField(term134581, term134581.getClass(), "partnerId", -1636759557);
        setIntField(term134581, term134581.getClass(), "frameId", -558790646);
        setIntField(term134581, term134581.getClass(), "selectMapId", -1501041458);
        setIntField(term134581, term134581.getClass(), "totalAwake", 704257790);
        setIntField(term134581, term134581.getClass(), "gradeRating", 84488553);
        setIntField(term134581, term134581.getClass(), "musicRating", 112186676);
        setIntField(term134581, term134581.getClass(), "playerRating", 1529668856);
        setIntField(term134581, term134581.getClass(), "highestRating", 1327244707);
        setIntField(term134581, term134581.getClass(), "gradeRank", 636264680);
        setIntField(term134581, term134581.getClass(), "classRank", 549590868);
        setIntField(term134581, term134581.getClass(), "courseRank", -2123777150);
        setField(term134581, term134581.getClass(), "charaSlot", term134646);
        setField(term134581, term134581.getClass(), "charaLockSlot", term134664);
        setLongField(term134581, term134581.getClass(), "contentBit", -1421362129691631912L);
        setIntField(term134581, term134581.getClass(), "playCount", 1239505784);
        setField(term134581, term134581.getClass(), "eventWatchedDate", "RrHlTUwGAK");
        setField(term134581, term134581.getClass(), "lastGameId", "HnGWMIfZqD");
        setField(term134581, term134581.getClass(), "lastRomVersion", "wzcInEwTXc");
        setField(term134581, term134581.getClass(), "lastDataVersion", "GpvNlGeEJB");
        setField(term134581, term134581.getClass(), "lastLoginDate", "qxFCCLLOPc");
        setField(term134581, term134581.getClass(), "lastPlayDate", "jRzPtIZZPq");
        setIntField(term134581, term134581.getClass(), "lastPlayCredit", 1973303309);
        setIntField(term134581, term134581.getClass(), "lastPlayMode", 1732667310);
        setIntField(term134581, term134581.getClass(), "lastPlaceId", 1895584040);
        setField(term134581, term134581.getClass(), "lastPlaceName", "jWLMtLmajF");
        setIntField(term134581, term134581.getClass(), "lastAllNetId", -51888709);
        setIntField(term134581, term134581.getClass(), "lastRegionId", 1238498169);
        setField(term134581, term134581.getClass(), "lastRegionName", "yilQWbXHUb");
        setField(term134581, term134581.getClass(), "lastClientId", "gVcKciUjfM");
        setField(term134581, term134581.getClass(), "lastCountryCode", "QaVgtUzVJm");
        setIntField(term134581, term134581.getClass(), "lastSelectEMoney", -1375200779);
        setIntField(term134581, term134581.getClass(), "lastSelectTicket", 1855996400);
        setIntField(term134581, term134581.getClass(), "lastSelectCourse", 1409066038);
        setIntField(term134581, term134581.getClass(), "lastCountCourse", 987148838);
        setField(term134581, term134581.getClass(), "firstGameId", "siJZKpfTHw");
        setField(term134581, term134581.getClass(), "firstRomVersion", "YPFFWDNfXT");
        setField(term134581, term134581.getClass(), "firstDataVersion", "QrnjkRvNan");
        setField(term134581, term134581.getClass(), "firstPlayDate", "TZfRFyUTAy");
        setField(term134581, term134581.getClass(), "compatibleCmVersion", "fDBSbnZQEb");
        setField(term134581, term134581.getClass(), "dailyBonusDate", "eWwifIiXBf");
        setField(term134581, term134581.getClass(), "dailyCourseBonusDate", "WeglJEjdLT");
        setField(term134581, term134581.getClass(), "lastPairLoginDate", "BCHkdVYkdA");
        setField(term134581, term134581.getClass(), "lastTrialPlayDate", "jKLqoDVqyY");
        setIntField(term134581, term134581.getClass(), "playVsCount", 2060323601);
        setIntField(term134581, term134581.getClass(), "playSyncCount", -1877309791);
        setIntField(term134581, term134581.getClass(), "winCount", 1057601439);
        setIntField(term134581, term134581.getClass(), "helpCount", 1009362436);
        setIntField(term134581, term134581.getClass(), "comboCount", 465082402);
        setLongField(term134581, term134581.getClass(), "totalDeluxscore", -1652507985634410327L);
        setLongField(term134581, term134581.getClass(), "totalBasicDeluxscore", -3585886572555403047L);
        setLongField(term134581, term134581.getClass(), "totalAdvancedDeluxscore", 8745393770629785944L);
        setLongField(term134581, term134581.getClass(), "totalExpertDeluxscore", -5304817075733769484L);
        setLongField(term134581, term134581.getClass(), "totalMasterDeluxscore", 2308240981940675456L);
        setLongField(term134581, term134581.getClass(), "totalReMasterDeluxscore", 2076490946006669400L);
        setIntField(term134581, term134581.getClass(), "totalSync", -572966539);
        setIntField(term134581, term134581.getClass(), "totalBasicSync", -70620606);
        setIntField(term134581, term134581.getClass(), "totalAdvancedSync", -131245628);
        setIntField(term134581, term134581.getClass(), "totalExpertSync", 1389986243);
        setIntField(term134581, term134581.getClass(), "totalMasterSync", 1400795661);
        setIntField(term134581, term134581.getClass(), "totalReMasterSync", 1870026461);
        setLongField(term134581, term134581.getClass(), "totalAchievement", -4340558436394575009L);
        setLongField(term134581, term134581.getClass(), "totalBasicAchievement", -3912185940292374291L);
        setLongField(term134581, term134581.getClass(), "totalAdvancedAchievement", -2657261053068511416L);
        setLongField(term134581, term134581.getClass(), "totalExpertAchievement", -4275761724673637224L);
        setLongField(term134581, term134581.getClass(), "totalMasterAchievement", -4230964304129966463L);
        setLongField(term134581, term134581.getClass(), "totalReMasterAchievement", 1000998944335552189L);
        setLongField(term134581, term134581.getClass(), "playerOldRating", -50149617519867282L);
        setLongField(term134581, term134581.getClass(), "playerNewRating", -6608961698637316603L);
        setIntField(term134581, term134581.getClass(), "banState", -2127214606);
        setLongField(term134581, term134581.getClass(), "dateTime", 749347423874016750L);
        setField(term134579, term134579.getClass(), "user", term134581);
        setField(term134579, term134579.getClass(), "propertyKey", "nXxhbinfxu");
        setField(term134579, term134579.getClass(), "propertyValue", "YUJWXjGqoj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyValue", argTypes, term134579, args);
    }

};


