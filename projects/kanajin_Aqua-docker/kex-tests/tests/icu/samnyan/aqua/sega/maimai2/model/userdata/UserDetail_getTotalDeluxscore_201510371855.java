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

public class UserDetail_getTotalDeluxscore_201510371855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226727;

    public UserDetail_getTotalDeluxscore_201510371855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226731 = new Long(-769824408235898287L);
        Integer term226794 = new Integer(628507821);
        Integer term226796 = new Integer(247792610);
        Integer term226798 = new Integer(-2059652097);
        Integer term226800 = new Integer(75564248);
        Integer term226802 = new Integer(-829801689);
        Integer term226804 = new Integer(265481386);
        Integer term226806 = new Integer(-893720551);
        ArrayList term226792 = new ArrayList();
        ((ArrayList) term226792).add(term226794);
        ((ArrayList) term226792).add(term226796);
        ((ArrayList) term226792).add(term226798);
        ((ArrayList) term226792).add(term226800);
        ((ArrayList) term226792).add(term226802);
        ((ArrayList) term226792).add(term226804);
        ((ArrayList) term226792).add(term226806);
        ArrayList term226810 = new ArrayList();
        term226727 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term226729 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term226745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term226755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226760 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term226727, term226727.getClass(), "id", -526755729238290338L);
        setLongField(term226729, term226729.getClass(), "id", 1267411778368027297L);
        setField(term226729, term226729.getClass(), "extId", term226731);
        setField(term226729, term226729.getClass(), "luid", "AKmeKdDdvP");
        setIntField(term226746, term226746.getClass(), "year", 2018);
        setShortField(term226746, term226746.getClass(), "month", (short) 1);
        setShortField(term226746, term226746.getClass(), "day", (short) 8);
        setField(term226745, term226745.getClass(), "date", term226746);
        setByteField(term226750, term226750.getClass(), "hour", (byte) 23);
        setByteField(term226750, term226750.getClass(), "minute", (byte) 58);
        setByteField(term226750, term226750.getClass(), "second", (byte) 55);
        setIntField(term226750, term226750.getClass(), "nano", 748244349);
        setField(term226745, term226745.getClass(), "time", term226750);
        setField(term226729, term226729.getClass(), "registerTime", term226745);
        setIntField(term226756, term226756.getClass(), "year", 2012);
        setShortField(term226756, term226756.getClass(), "month", (short) 12);
        setShortField(term226756, term226756.getClass(), "day", (short) 21);
        setField(term226755, term226755.getClass(), "date", term226756);
        setByteField(term226760, term226760.getClass(), "hour", (byte) 3);
        setByteField(term226760, term226760.getClass(), "minute", (byte) 1);
        setByteField(term226760, term226760.getClass(), "second", (byte) 47);
        setIntField(term226760, term226760.getClass(), "nano", 592405787);
        setField(term226755, term226755.getClass(), "time", term226760);
        setField(term226729, term226729.getClass(), "accessTime", term226755);
        setField(term226727, term226727.getClass(), "card", term226729);
        setField(term226727, term226727.getClass(), "userName", "kqtcoMBiTN");
        setIntField(term226727, term226727.getClass(), "isNetMember", 168988978);
        setIntField(term226727, term226727.getClass(), "iconId", -523133922);
        setIntField(term226727, term226727.getClass(), "plateId", -1190413422);
        setIntField(term226727, term226727.getClass(), "titleId", -1614665116);
        setIntField(term226727, term226727.getClass(), "partnerId", 1721635852);
        setIntField(term226727, term226727.getClass(), "frameId", 560457275);
        setIntField(term226727, term226727.getClass(), "selectMapId", -1981813317);
        setIntField(term226727, term226727.getClass(), "totalAwake", 501970469);
        setIntField(term226727, term226727.getClass(), "gradeRating", -106034021);
        setIntField(term226727, term226727.getClass(), "musicRating", 364258643);
        setIntField(term226727, term226727.getClass(), "playerRating", -161354342);
        setIntField(term226727, term226727.getClass(), "highestRating", 165488822);
        setIntField(term226727, term226727.getClass(), "gradeRank", 1722923000);
        setIntField(term226727, term226727.getClass(), "classRank", 858754727);
        setIntField(term226727, term226727.getClass(), "courseRank", -1742452774);
        setField(term226727, term226727.getClass(), "charaSlot", term226792);
        setField(term226727, term226727.getClass(), "charaLockSlot", term226810);
        setLongField(term226727, term226727.getClass(), "contentBit", 2317459916332323737L);
        setIntField(term226727, term226727.getClass(), "playCount", 302391633);
        setField(term226727, term226727.getClass(), "eventWatchedDate", "JpjXzcwToy");
        setField(term226727, term226727.getClass(), "lastGameId", "yctcpaluhv");
        setField(term226727, term226727.getClass(), "lastRomVersion", "ZTEEpjBRFm");
        setField(term226727, term226727.getClass(), "lastDataVersion", "eGQdWVhZFd");
        setField(term226727, term226727.getClass(), "lastLoginDate", "rJCWXHswOA");
        setField(term226727, term226727.getClass(), "lastPlayDate", "wCsHrkJTEg");
        setIntField(term226727, term226727.getClass(), "lastPlayCredit", 840891134);
        setIntField(term226727, term226727.getClass(), "lastPlayMode", 897279041);
        setIntField(term226727, term226727.getClass(), "lastPlaceId", 1618600938);
        setField(term226727, term226727.getClass(), "lastPlaceName", "iAhGpxznud");
        setIntField(term226727, term226727.getClass(), "lastAllNetId", 1355173839);
        setIntField(term226727, term226727.getClass(), "lastRegionId", -1273719525);
        setField(term226727, term226727.getClass(), "lastRegionName", "oIZYdVpStA");
        setField(term226727, term226727.getClass(), "lastClientId", "WOBYQpSKJt");
        setField(term226727, term226727.getClass(), "lastCountryCode", "JvStduaHMS");
        setIntField(term226727, term226727.getClass(), "lastSelectEMoney", -627109579);
        setIntField(term226727, term226727.getClass(), "lastSelectTicket", -1837554447);
        setIntField(term226727, term226727.getClass(), "lastSelectCourse", -2008091503);
        setIntField(term226727, term226727.getClass(), "lastCountCourse", -1368642453);
        setField(term226727, term226727.getClass(), "firstGameId", "zJwrZrBJEV");
        setField(term226727, term226727.getClass(), "firstRomVersion", "VZVBTcOgtj");
        setField(term226727, term226727.getClass(), "firstDataVersion", "NxwtNEqZwc");
        setField(term226727, term226727.getClass(), "firstPlayDate", "scXUGbWVgO");
        setField(term226727, term226727.getClass(), "compatibleCmVersion", "vZnHzZGaqo");
        setField(term226727, term226727.getClass(), "dailyBonusDate", "DLxHFGRtHg");
        setField(term226727, term226727.getClass(), "dailyCourseBonusDate", "PQHyujWLlL");
        setField(term226727, term226727.getClass(), "lastPairLoginDate", "UEKVADcZqS");
        setField(term226727, term226727.getClass(), "lastTrialPlayDate", "qZRVFeFetw");
        setIntField(term226727, term226727.getClass(), "playVsCount", 2046248490);
        setIntField(term226727, term226727.getClass(), "playSyncCount", -1671715330);
        setIntField(term226727, term226727.getClass(), "winCount", 1265400484);
        setIntField(term226727, term226727.getClass(), "helpCount", 1440253698);
        setIntField(term226727, term226727.getClass(), "comboCount", -1090004456);
        setLongField(term226727, term226727.getClass(), "totalDeluxscore", -7528534982191518296L);
        setLongField(term226727, term226727.getClass(), "totalBasicDeluxscore", 3324576313620852526L);
        setLongField(term226727, term226727.getClass(), "totalAdvancedDeluxscore", 6901850304380041585L);
        setLongField(term226727, term226727.getClass(), "totalExpertDeluxscore", 3974913559658326104L);
        setLongField(term226727, term226727.getClass(), "totalMasterDeluxscore", 8913529807973832335L);
        setLongField(term226727, term226727.getClass(), "totalReMasterDeluxscore", 7102480627990060552L);
        setIntField(term226727, term226727.getClass(), "totalSync", -1834941052);
        setIntField(term226727, term226727.getClass(), "totalBasicSync", -720285664);
        setIntField(term226727, term226727.getClass(), "totalAdvancedSync", 178095497);
        setIntField(term226727, term226727.getClass(), "totalExpertSync", -211651758);
        setIntField(term226727, term226727.getClass(), "totalMasterSync", 718173188);
        setIntField(term226727, term226727.getClass(), "totalReMasterSync", -1945411376);
        setLongField(term226727, term226727.getClass(), "totalAchievement", -1022511683316739328L);
        setLongField(term226727, term226727.getClass(), "totalBasicAchievement", 3918249492698728421L);
        setLongField(term226727, term226727.getClass(), "totalAdvancedAchievement", 5056811364823438038L);
        setLongField(term226727, term226727.getClass(), "totalExpertAchievement", 364901119971402132L);
        setLongField(term226727, term226727.getClass(), "totalMasterAchievement", 3591948876135773977L);
        setLongField(term226727, term226727.getClass(), "totalReMasterAchievement", -5189953093105826248L);
        setLongField(term226727, term226727.getClass(), "playerOldRating", -5645220165267616021L);
        setLongField(term226727, term226727.getClass(), "playerNewRating", 4348732969026682940L);
        setIntField(term226727, term226727.getClass(), "banState", -1070288117);
        setLongField(term226727, term226727.getClass(), "dateTime", -6805474568319731987L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalDeluxscore", argTypes, term226727, args);
    }

};


