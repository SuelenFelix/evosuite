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

public class UserCourse_getCourseId_19331521503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72779;

    public UserCourse_getCourseId_19331521503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72785 = new Long(-4393710401270724527L);
        Integer term72848 = new Integer(-2078879114);
        Integer term72850 = new Integer(-1186882318);
        Integer term72852 = new Integer(1077647088);
        Integer term72854 = new Integer(-705176810);
        Integer term72856 = new Integer(-1584779593);
        Integer term72858 = new Integer(303007547);
        Integer term72860 = new Integer(1498738343);
        Integer term72862 = new Integer(-1635571857);
        ArrayList term72846 = new ArrayList();
        ((ArrayList) term72846).add(term72848);
        ((ArrayList) term72846).add(term72850);
        ((ArrayList) term72846).add(term72852);
        ((ArrayList) term72846).add(term72854);
        ((ArrayList) term72846).add(term72856);
        ((ArrayList) term72846).add(term72858);
        ((ArrayList) term72846).add(term72860);
        ((ArrayList) term72846).add(term72862);
        Integer term72868 = new Integer(1407309162);
        Integer term72870 = new Integer(-534033672);
        Integer term72872 = new Integer(-1162790806);
        ArrayList term72866 = new ArrayList();
        ((ArrayList) term72866).add(term72868);
        ((ArrayList) term72866).add(term72870);
        ((ArrayList) term72866).add(term72872);
        term72779 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term72781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term72783 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72814 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72779, term72779.getClass(), "id", 410377497345443793L);
        setLongField(term72781, term72781.getClass(), "id", 3905078592631516923L);
        setLongField(term72783, term72783.getClass(), "id", -5051305828138891800L);
        setField(term72783, term72783.getClass(), "extId", term72785);
        setField(term72783, term72783.getClass(), "luid", "jkCUxevJxb");
        setIntField(term72800, term72800.getClass(), "year", 2028);
        setShortField(term72800, term72800.getClass(), "month", (short) 3);
        setShortField(term72800, term72800.getClass(), "day", (short) 20);
        setField(term72799, term72799.getClass(), "date", term72800);
        setByteField(term72804, term72804.getClass(), "hour", (byte) 15);
        setByteField(term72804, term72804.getClass(), "minute", (byte) 5);
        setByteField(term72804, term72804.getClass(), "second", (byte) 16);
        setIntField(term72804, term72804.getClass(), "nano", 223082659);
        setField(term72799, term72799.getClass(), "time", term72804);
        setField(term72783, term72783.getClass(), "registerTime", term72799);
        setIntField(term72810, term72810.getClass(), "year", 2019);
        setShortField(term72810, term72810.getClass(), "month", (short) 4);
        setShortField(term72810, term72810.getClass(), "day", (short) 1);
        setField(term72809, term72809.getClass(), "date", term72810);
        setByteField(term72814, term72814.getClass(), "hour", (byte) 8);
        setByteField(term72814, term72814.getClass(), "minute", (byte) 11);
        setByteField(term72814, term72814.getClass(), "second", (byte) 4);
        setIntField(term72814, term72814.getClass(), "nano", 648208624);
        setField(term72809, term72809.getClass(), "time", term72814);
        setField(term72783, term72783.getClass(), "accessTime", term72809);
        setField(term72781, term72781.getClass(), "card", term72783);
        setField(term72781, term72781.getClass(), "userName", "WqobQIRpLc");
        setIntField(term72781, term72781.getClass(), "isNetMember", -1053470670);
        setIntField(term72781, term72781.getClass(), "iconId", 421827493);
        setIntField(term72781, term72781.getClass(), "plateId", 720401594);
        setIntField(term72781, term72781.getClass(), "titleId", -814068886);
        setIntField(term72781, term72781.getClass(), "partnerId", -393844160);
        setIntField(term72781, term72781.getClass(), "frameId", -1396955867);
        setIntField(term72781, term72781.getClass(), "selectMapId", 1259575995);
        setIntField(term72781, term72781.getClass(), "totalAwake", 1206636813);
        setIntField(term72781, term72781.getClass(), "gradeRating", -1592307241);
        setIntField(term72781, term72781.getClass(), "musicRating", -92983331);
        setIntField(term72781, term72781.getClass(), "playerRating", -1635511750);
        setIntField(term72781, term72781.getClass(), "highestRating", -1920687540);
        setIntField(term72781, term72781.getClass(), "gradeRank", 1907562616);
        setIntField(term72781, term72781.getClass(), "classRank", -1207669605);
        setIntField(term72781, term72781.getClass(), "courseRank", 154054470);
        setField(term72781, term72781.getClass(), "charaSlot", term72846);
        setField(term72781, term72781.getClass(), "charaLockSlot", term72866);
        setLongField(term72781, term72781.getClass(), "contentBit", 8023209931514440397L);
        setIntField(term72781, term72781.getClass(), "playCount", 843710230);
        setField(term72781, term72781.getClass(), "eventWatchedDate", "jesZbitPYU");
        setField(term72781, term72781.getClass(), "lastGameId", "oIbEvXxpda");
        setField(term72781, term72781.getClass(), "lastRomVersion", "QyHVDeaOqb");
        setField(term72781, term72781.getClass(), "lastDataVersion", "ZwnEWySrcE");
        setField(term72781, term72781.getClass(), "lastLoginDate", "laQWfyDqCq");
        setField(term72781, term72781.getClass(), "lastPlayDate", "gMFGfpbPZE");
        setIntField(term72781, term72781.getClass(), "lastPlayCredit", 547665841);
        setIntField(term72781, term72781.getClass(), "lastPlayMode", -12983617);
        setIntField(term72781, term72781.getClass(), "lastPlaceId", -1791051420);
        setField(term72781, term72781.getClass(), "lastPlaceName", "QcfydYbOGP");
        setIntField(term72781, term72781.getClass(), "lastAllNetId", 98451832);
        setIntField(term72781, term72781.getClass(), "lastRegionId", 584008261);
        setField(term72781, term72781.getClass(), "lastRegionName", "FdMzwKizAk");
        setField(term72781, term72781.getClass(), "lastClientId", "jjwHVTqCkP");
        setField(term72781, term72781.getClass(), "lastCountryCode", "uUAkxSFPyL");
        setIntField(term72781, term72781.getClass(), "lastSelectEMoney", -881683610);
        setIntField(term72781, term72781.getClass(), "lastSelectTicket", -109698584);
        setIntField(term72781, term72781.getClass(), "lastSelectCourse", 2001696613);
        setIntField(term72781, term72781.getClass(), "lastCountCourse", -1753516884);
        setField(term72781, term72781.getClass(), "firstGameId", "XfzbAdTaCO");
        setField(term72781, term72781.getClass(), "firstRomVersion", "rDcGfVDmsE");
        setField(term72781, term72781.getClass(), "firstDataVersion", "agspBqCjgG");
        setField(term72781, term72781.getClass(), "firstPlayDate", "HMJaeNiTNW");
        setField(term72781, term72781.getClass(), "compatibleCmVersion", "ggcJNlLcZb");
        setField(term72781, term72781.getClass(), "dailyBonusDate", "EzhvjUZCQP");
        setField(term72781, term72781.getClass(), "dailyCourseBonusDate", "FTHebphiPR");
        setField(term72781, term72781.getClass(), "lastPairLoginDate", "OQjMPmyJQz");
        setField(term72781, term72781.getClass(), "lastTrialPlayDate", "FZQimBsMNt");
        setIntField(term72781, term72781.getClass(), "playVsCount", -1562955063);
        setIntField(term72781, term72781.getClass(), "playSyncCount", -1549644922);
        setIntField(term72781, term72781.getClass(), "winCount", 1217352889);
        setIntField(term72781, term72781.getClass(), "helpCount", 159996093);
        setIntField(term72781, term72781.getClass(), "comboCount", 1937937383);
        setLongField(term72781, term72781.getClass(), "totalDeluxscore", 3229827238251743416L);
        setLongField(term72781, term72781.getClass(), "totalBasicDeluxscore", -1624594002510583135L);
        setLongField(term72781, term72781.getClass(), "totalAdvancedDeluxscore", -8686015569355599560L);
        setLongField(term72781, term72781.getClass(), "totalExpertDeluxscore", 5562155951994796526L);
        setLongField(term72781, term72781.getClass(), "totalMasterDeluxscore", -292696468317320629L);
        setLongField(term72781, term72781.getClass(), "totalReMasterDeluxscore", 225938424578773140L);
        setIntField(term72781, term72781.getClass(), "totalSync", -639813848);
        setIntField(term72781, term72781.getClass(), "totalBasicSync", 1894367611);
        setIntField(term72781, term72781.getClass(), "totalAdvancedSync", 2121003177);
        setIntField(term72781, term72781.getClass(), "totalExpertSync", 1093708386);
        setIntField(term72781, term72781.getClass(), "totalMasterSync", 1609837057);
        setIntField(term72781, term72781.getClass(), "totalReMasterSync", 895453282);
        setLongField(term72781, term72781.getClass(), "totalAchievement", 2075261430191543110L);
        setLongField(term72781, term72781.getClass(), "totalBasicAchievement", 6988441824698665724L);
        setLongField(term72781, term72781.getClass(), "totalAdvancedAchievement", -4515956536909746513L);
        setLongField(term72781, term72781.getClass(), "totalExpertAchievement", -6677795573873753988L);
        setLongField(term72781, term72781.getClass(), "totalMasterAchievement", 7779093916932577607L);
        setLongField(term72781, term72781.getClass(), "totalReMasterAchievement", 3437816211301899263L);
        setLongField(term72781, term72781.getClass(), "playerOldRating", 5390474329543871819L);
        setLongField(term72781, term72781.getClass(), "playerNewRating", 8749770092315515620L);
        setIntField(term72781, term72781.getClass(), "banState", -1488970453);
        setLongField(term72781, term72781.getClass(), "dateTime", 1347723683044734453L);
        setField(term72779, term72779.getClass(), "user", term72781);
        setIntField(term72779, term72779.getClass(), "courseId", -289323354);
        setBooleanField(term72779, term72779.getClass(), "isLastClear", false);
        setIntField(term72779, term72779.getClass(), "totalRestlife", 1649025249);
        setIntField(term72779, term72779.getClass(), "totalAchievement", -937498214);
        setIntField(term72779, term72779.getClass(), "totalDeluxscore", 1605317373);
        setIntField(term72779, term72779.getClass(), "playCount", 904392784);
        setField(term72779, term72779.getClass(), "clearDate", "lowANLpXCV");
        setField(term72779, term72779.getClass(), "lastPlayDate", "orjiIcUIcD");
        setIntField(term72779, term72779.getClass(), "bestAchievement", -165829430);
        setField(term72779, term72779.getClass(), "bestAchievementDate", "lGzFueHQqZ");
        setIntField(term72779, term72779.getClass(), "bestDeluxscore", -206826041);
        setField(term72779, term72779.getClass(), "bestDeluxscoreDate", "cjiDFHGGlp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseId", argTypes, term72779, args);
    }

};


