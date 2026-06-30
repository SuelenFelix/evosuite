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

public class UserDetail_setTotalExpertDeluxscore_1701720050135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4306602;
     Object term4306973;

    public UserDetail_setTotalExpertDeluxscore_1701720050135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4306606 = new Long(-3105437328811671426L);
        Integer term4306669 = new Integer(-1514712203);
        Integer term4306671 = new Integer(1598781132);
        Integer term4306673 = new Integer(1899169938);
        Integer term4306675 = new Integer(2086291792);
        Integer term4306677 = new Integer(-1433187744);
        Integer term4306679 = new Integer(1762255097);
        Integer term4306681 = new Integer(888018912);
        ArrayList term4306667 = new ArrayList();
        ((ArrayList) term4306667).add(term4306669);
        ((ArrayList) term4306667).add(term4306671);
        ((ArrayList) term4306667).add(term4306673);
        ((ArrayList) term4306667).add(term4306675);
        ((ArrayList) term4306667).add(term4306677);
        ((ArrayList) term4306667).add(term4306679);
        ((ArrayList) term4306667).add(term4306681);
        Integer term4306687 = new Integer(856692442);
        Integer term4306689 = new Integer(-2001484892);
        Integer term4306691 = new Integer(-196301425);
        Integer term4306693 = new Integer(1709968466);
        Integer term4306695 = new Integer(1751184955);
        Integer term4306697 = new Integer(1782993942);
        Integer term4306699 = new Integer(963677814);
        Integer term4306701 = new Integer(-1797863095);
        Integer term4306703 = new Integer(857108422);
        ArrayList term4306685 = new ArrayList();
        ((ArrayList) term4306685).add(term4306687);
        ((ArrayList) term4306685).add(term4306689);
        ((ArrayList) term4306685).add(term4306691);
        ((ArrayList) term4306685).add(term4306693);
        ((ArrayList) term4306685).add(term4306695);
        ((ArrayList) term4306685).add(term4306697);
        ((ArrayList) term4306685).add(term4306699);
        ((ArrayList) term4306685).add(term4306701);
        ((ArrayList) term4306685).add(term4306703);
        term4306602 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4306604 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4306620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4306621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4306625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4306630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4306631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4306635 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4306602, term4306602.getClass(), "id", 6984265541313195759L);
        setLongField(term4306604, term4306604.getClass(), "id", 4354659741243864804L);
        setField(term4306604, term4306604.getClass(), "extId", term4306606);
        setField(term4306604, term4306604.getClass(), "luid", "zJBxlnHgGZ");
        setIntField(term4306621, term4306621.getClass(), "year", 2017);
        setShortField(term4306621, term4306621.getClass(), "month", (short) 12);
        setShortField(term4306621, term4306621.getClass(), "day", (short) 31);
        setField(term4306620, term4306620.getClass(), "date", term4306621);
        setByteField(term4306625, term4306625.getClass(), "hour", (byte) 16);
        setByteField(term4306625, term4306625.getClass(), "minute", (byte) 23);
        setByteField(term4306625, term4306625.getClass(), "second", (byte) 37);
        setIntField(term4306625, term4306625.getClass(), "nano", 30775329);
        setField(term4306620, term4306620.getClass(), "time", term4306625);
        setField(term4306604, term4306604.getClass(), "registerTime", term4306620);
        setIntField(term4306631, term4306631.getClass(), "year", 2026);
        setShortField(term4306631, term4306631.getClass(), "month", (short) 5);
        setShortField(term4306631, term4306631.getClass(), "day", (short) 23);
        setField(term4306630, term4306630.getClass(), "date", term4306631);
        setByteField(term4306635, term4306635.getClass(), "hour", (byte) 1);
        setByteField(term4306635, term4306635.getClass(), "minute", (byte) 46);
        setByteField(term4306635, term4306635.getClass(), "second", (byte) 51);
        setIntField(term4306635, term4306635.getClass(), "nano", 892180506);
        setField(term4306630, term4306630.getClass(), "time", term4306635);
        setField(term4306604, term4306604.getClass(), "accessTime", term4306630);
        setField(term4306602, term4306602.getClass(), "card", term4306604);
        setField(term4306602, term4306602.getClass(), "userName", "MxsPSVYHoT");
        setIntField(term4306602, term4306602.getClass(), "isNetMember", 1965665357);
        setIntField(term4306602, term4306602.getClass(), "iconId", 978492772);
        setIntField(term4306602, term4306602.getClass(), "plateId", -1467131773);
        setIntField(term4306602, term4306602.getClass(), "titleId", -1507015959);
        setIntField(term4306602, term4306602.getClass(), "partnerId", -805990705);
        setIntField(term4306602, term4306602.getClass(), "frameId", -1908214528);
        setIntField(term4306602, term4306602.getClass(), "selectMapId", 43088700);
        setIntField(term4306602, term4306602.getClass(), "totalAwake", -488006977);
        setIntField(term4306602, term4306602.getClass(), "gradeRating", -1969145861);
        setIntField(term4306602, term4306602.getClass(), "musicRating", -121192163);
        setIntField(term4306602, term4306602.getClass(), "playerRating", -1283738805);
        setIntField(term4306602, term4306602.getClass(), "highestRating", 1949947938);
        setIntField(term4306602, term4306602.getClass(), "gradeRank", 1333836192);
        setIntField(term4306602, term4306602.getClass(), "classRank", -370666787);
        setIntField(term4306602, term4306602.getClass(), "courseRank", -1473190552);
        setField(term4306602, term4306602.getClass(), "charaSlot", term4306667);
        setField(term4306602, term4306602.getClass(), "charaLockSlot", term4306685);
        setLongField(term4306602, term4306602.getClass(), "contentBit", 1903139823348419948L);
        setIntField(term4306602, term4306602.getClass(), "playCount", -1727306293);
        setField(term4306602, term4306602.getClass(), "eventWatchedDate", "gpKINvlnco");
        setField(term4306602, term4306602.getClass(), "lastGameId", "wyNUKKPuXe");
        setField(term4306602, term4306602.getClass(), "lastRomVersion", "hVBvvNCEMG");
        setField(term4306602, term4306602.getClass(), "lastDataVersion", "FtuOLKnzdK");
        setField(term4306602, term4306602.getClass(), "lastLoginDate", "NIUnaogpHf");
        setField(term4306602, term4306602.getClass(), "lastPlayDate", "hSTuAYrBzH");
        setIntField(term4306602, term4306602.getClass(), "lastPlayCredit", 1319668458);
        setIntField(term4306602, term4306602.getClass(), "lastPlayMode", 790948761);
        setIntField(term4306602, term4306602.getClass(), "lastPlaceId", -1049809399);
        setField(term4306602, term4306602.getClass(), "lastPlaceName", "gkNDhCVRrC");
        setIntField(term4306602, term4306602.getClass(), "lastAllNetId", 1020509795);
        setIntField(term4306602, term4306602.getClass(), "lastRegionId", -2074576650);
        setField(term4306602, term4306602.getClass(), "lastRegionName", "pmjVSsbmzC");
        setField(term4306602, term4306602.getClass(), "lastClientId", "xkElZtWYuU");
        setField(term4306602, term4306602.getClass(), "lastCountryCode", "QxBdNwHphR");
        setIntField(term4306602, term4306602.getClass(), "lastSelectEMoney", 596419553);
        setIntField(term4306602, term4306602.getClass(), "lastSelectTicket", 713446935);
        setIntField(term4306602, term4306602.getClass(), "lastSelectCourse", 1260737826);
        setIntField(term4306602, term4306602.getClass(), "lastCountCourse", 986483880);
        setField(term4306602, term4306602.getClass(), "firstGameId", "QmpDoyAoSH");
        setField(term4306602, term4306602.getClass(), "firstRomVersion", "MVcPCKDJKg");
        setField(term4306602, term4306602.getClass(), "firstDataVersion", "oYTCjRbmYM");
        setField(term4306602, term4306602.getClass(), "firstPlayDate", "CRoVyqDfYJ");
        setField(term4306602, term4306602.getClass(), "compatibleCmVersion", "IChWIPMeVs");
        setField(term4306602, term4306602.getClass(), "dailyBonusDate", "EiDzRACLNr");
        setField(term4306602, term4306602.getClass(), "dailyCourseBonusDate", "MDVGBkSFFZ");
        setField(term4306602, term4306602.getClass(), "lastPairLoginDate", "mfBykCSctR");
        setField(term4306602, term4306602.getClass(), "lastTrialPlayDate", "LcUTOktQaF");
        setIntField(term4306602, term4306602.getClass(), "playVsCount", 1537097409);
        setIntField(term4306602, term4306602.getClass(), "playSyncCount", 9723621);
        setIntField(term4306602, term4306602.getClass(), "winCount", -425696071);
        setIntField(term4306602, term4306602.getClass(), "helpCount", 987101628);
        setIntField(term4306602, term4306602.getClass(), "comboCount", 2074225990);
        setLongField(term4306602, term4306602.getClass(), "totalDeluxscore", -2727780094449708621L);
        setLongField(term4306602, term4306602.getClass(), "totalBasicDeluxscore", -2491688446378199425L);
        setLongField(term4306602, term4306602.getClass(), "totalAdvancedDeluxscore", 7422600315809595270L);
        setLongField(term4306602, term4306602.getClass(), "totalExpertDeluxscore", -2625174544337179403L);
        setLongField(term4306602, term4306602.getClass(), "totalMasterDeluxscore", -1165997755039984028L);
        setLongField(term4306602, term4306602.getClass(), "totalReMasterDeluxscore", -2165990989785629048L);
        setIntField(term4306602, term4306602.getClass(), "totalSync", -234727075);
        setIntField(term4306602, term4306602.getClass(), "totalBasicSync", -152614798);
        setIntField(term4306602, term4306602.getClass(), "totalAdvancedSync", 707488539);
        setIntField(term4306602, term4306602.getClass(), "totalExpertSync", -1176615360);
        setIntField(term4306602, term4306602.getClass(), "totalMasterSync", -1074201477);
        setIntField(term4306602, term4306602.getClass(), "totalReMasterSync", 1360839572);
        setLongField(term4306602, term4306602.getClass(), "totalAchievement", -7639021348403229858L);
        setLongField(term4306602, term4306602.getClass(), "totalBasicAchievement", 427974161275640488L);
        setLongField(term4306602, term4306602.getClass(), "totalAdvancedAchievement", -6042838536751910669L);
        setLongField(term4306602, term4306602.getClass(), "totalExpertAchievement", 5871390361831248254L);
        setLongField(term4306602, term4306602.getClass(), "totalMasterAchievement", -6486618019492169802L);
        setLongField(term4306602, term4306602.getClass(), "totalReMasterAchievement", 4265547231698501421L);
        setLongField(term4306602, term4306602.getClass(), "playerOldRating", -7946845836965882579L);
        setLongField(term4306602, term4306602.getClass(), "playerNewRating", -6920769858765822118L);
        setIntField(term4306602, term4306602.getClass(), "banState", -981385105);
        setLongField(term4306602, term4306602.getClass(), "dateTime", -9099169406891756292L);
        term4306973 = new Long(2749366677117994222L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4306973;
        callMethod(klass, "setTotalExpertDeluxscore", argTypes, term4306602, args);
    }

};


