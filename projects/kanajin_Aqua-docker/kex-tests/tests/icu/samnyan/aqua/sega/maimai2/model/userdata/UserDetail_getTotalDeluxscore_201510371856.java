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

public class UserDetail_getTotalDeluxscore_201510371856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226782;

    public UserDetail_getTotalDeluxscore_201510371856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226786 = new Long(-769824408235898287L);
        Integer term226849 = new Integer(628507821);
        Integer term226851 = new Integer(247792610);
        Integer term226853 = new Integer(-2059652097);
        Integer term226855 = new Integer(75564248);
        Integer term226857 = new Integer(-829801689);
        Integer term226859 = new Integer(265481386);
        Integer term226861 = new Integer(-893720551);
        ArrayList term226847 = new ArrayList();
        ((ArrayList) term226847).add(term226849);
        ((ArrayList) term226847).add(term226851);
        ((ArrayList) term226847).add(term226853);
        ((ArrayList) term226847).add(term226855);
        ((ArrayList) term226847).add(term226857);
        ((ArrayList) term226847).add(term226859);
        ((ArrayList) term226847).add(term226861);
        ArrayList term226865 = new ArrayList();
        term226782 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term226784 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term226800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term226810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226815 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term226782, term226782.getClass(), "id", -526755729238290338L);
        setLongField(term226784, term226784.getClass(), "id", 1267411778368027297L);
        setField(term226784, term226784.getClass(), "extId", term226786);
        setField(term226784, term226784.getClass(), "luid", "AKmeKdDdvP");
        setIntField(term226801, term226801.getClass(), "year", 2018);
        setShortField(term226801, term226801.getClass(), "month", (short) 1);
        setShortField(term226801, term226801.getClass(), "day", (short) 8);
        setField(term226800, term226800.getClass(), "date", term226801);
        setByteField(term226805, term226805.getClass(), "hour", (byte) 23);
        setByteField(term226805, term226805.getClass(), "minute", (byte) 58);
        setByteField(term226805, term226805.getClass(), "second", (byte) 55);
        setIntField(term226805, term226805.getClass(), "nano", 748244349);
        setField(term226800, term226800.getClass(), "time", term226805);
        setField(term226784, term226784.getClass(), "registerTime", term226800);
        setIntField(term226811, term226811.getClass(), "year", 2012);
        setShortField(term226811, term226811.getClass(), "month", (short) 12);
        setShortField(term226811, term226811.getClass(), "day", (short) 21);
        setField(term226810, term226810.getClass(), "date", term226811);
        setByteField(term226815, term226815.getClass(), "hour", (byte) 3);
        setByteField(term226815, term226815.getClass(), "minute", (byte) 1);
        setByteField(term226815, term226815.getClass(), "second", (byte) 47);
        setIntField(term226815, term226815.getClass(), "nano", 592405787);
        setField(term226810, term226810.getClass(), "time", term226815);
        setField(term226784, term226784.getClass(), "accessTime", term226810);
        setField(term226782, term226782.getClass(), "card", term226784);
        setField(term226782, term226782.getClass(), "userName", "kqtcoMBiTN");
        setIntField(term226782, term226782.getClass(), "isNetMember", 168988978);
        setIntField(term226782, term226782.getClass(), "iconId", -523133922);
        setIntField(term226782, term226782.getClass(), "plateId", -1190413422);
        setIntField(term226782, term226782.getClass(), "titleId", -1614665116);
        setIntField(term226782, term226782.getClass(), "partnerId", 1721635852);
        setIntField(term226782, term226782.getClass(), "frameId", 560457275);
        setIntField(term226782, term226782.getClass(), "selectMapId", -1981813317);
        setIntField(term226782, term226782.getClass(), "totalAwake", 501970469);
        setIntField(term226782, term226782.getClass(), "gradeRating", -106034021);
        setIntField(term226782, term226782.getClass(), "musicRating", 364258643);
        setIntField(term226782, term226782.getClass(), "playerRating", -161354342);
        setIntField(term226782, term226782.getClass(), "highestRating", 165488822);
        setIntField(term226782, term226782.getClass(), "gradeRank", 1722923000);
        setIntField(term226782, term226782.getClass(), "classRank", 858754727);
        setIntField(term226782, term226782.getClass(), "courseRank", -1742452774);
        setField(term226782, term226782.getClass(), "charaSlot", term226847);
        setField(term226782, term226782.getClass(), "charaLockSlot", term226865);
        setLongField(term226782, term226782.getClass(), "contentBit", 2317459916332323737L);
        setIntField(term226782, term226782.getClass(), "playCount", 302391633);
        setField(term226782, term226782.getClass(), "eventWatchedDate", "JpjXzcwToy");
        setField(term226782, term226782.getClass(), "lastGameId", "yctcpaluhv");
        setField(term226782, term226782.getClass(), "lastRomVersion", "ZTEEpjBRFm");
        setField(term226782, term226782.getClass(), "lastDataVersion", "eGQdWVhZFd");
        setField(term226782, term226782.getClass(), "lastLoginDate", "rJCWXHswOA");
        setField(term226782, term226782.getClass(), "lastPlayDate", "wCsHrkJTEg");
        setIntField(term226782, term226782.getClass(), "lastPlayCredit", 840891134);
        setIntField(term226782, term226782.getClass(), "lastPlayMode", 897279041);
        setIntField(term226782, term226782.getClass(), "lastPlaceId", 1618600938);
        setField(term226782, term226782.getClass(), "lastPlaceName", "iAhGpxznud");
        setIntField(term226782, term226782.getClass(), "lastAllNetId", 1355173839);
        setIntField(term226782, term226782.getClass(), "lastRegionId", -1273719525);
        setField(term226782, term226782.getClass(), "lastRegionName", "oIZYdVpStA");
        setField(term226782, term226782.getClass(), "lastClientId", "WOBYQpSKJt");
        setField(term226782, term226782.getClass(), "lastCountryCode", "JvStduaHMS");
        setIntField(term226782, term226782.getClass(), "lastSelectEMoney", -627109579);
        setIntField(term226782, term226782.getClass(), "lastSelectTicket", -1837554447);
        setIntField(term226782, term226782.getClass(), "lastSelectCourse", -2008091503);
        setIntField(term226782, term226782.getClass(), "lastCountCourse", -1368642453);
        setField(term226782, term226782.getClass(), "firstGameId", "zJwrZrBJEV");
        setField(term226782, term226782.getClass(), "firstRomVersion", "VZVBTcOgtj");
        setField(term226782, term226782.getClass(), "firstDataVersion", "NxwtNEqZwc");
        setField(term226782, term226782.getClass(), "firstPlayDate", "scXUGbWVgO");
        setField(term226782, term226782.getClass(), "compatibleCmVersion", "vZnHzZGaqo");
        setField(term226782, term226782.getClass(), "dailyBonusDate", "DLxHFGRtHg");
        setField(term226782, term226782.getClass(), "dailyCourseBonusDate", "PQHyujWLlL");
        setField(term226782, term226782.getClass(), "lastPairLoginDate", "UEKVADcZqS");
        setField(term226782, term226782.getClass(), "lastTrialPlayDate", "qZRVFeFetw");
        setIntField(term226782, term226782.getClass(), "playVsCount", 2046248490);
        setIntField(term226782, term226782.getClass(), "playSyncCount", -1671715330);
        setIntField(term226782, term226782.getClass(), "winCount", 1265400484);
        setIntField(term226782, term226782.getClass(), "helpCount", 1440253698);
        setIntField(term226782, term226782.getClass(), "comboCount", -1090004456);
        setLongField(term226782, term226782.getClass(), "totalDeluxscore", -7528534982191518296L);
        setLongField(term226782, term226782.getClass(), "totalBasicDeluxscore", 3324576313620852526L);
        setLongField(term226782, term226782.getClass(), "totalAdvancedDeluxscore", 6901850304380041585L);
        setLongField(term226782, term226782.getClass(), "totalExpertDeluxscore", 3974913559658326104L);
        setLongField(term226782, term226782.getClass(), "totalMasterDeluxscore", 8913529807973832335L);
        setLongField(term226782, term226782.getClass(), "totalReMasterDeluxscore", 7102480627990060552L);
        setIntField(term226782, term226782.getClass(), "totalSync", -1834941052);
        setIntField(term226782, term226782.getClass(), "totalBasicSync", -720285664);
        setIntField(term226782, term226782.getClass(), "totalAdvancedSync", 178095497);
        setIntField(term226782, term226782.getClass(), "totalExpertSync", -211651758);
        setIntField(term226782, term226782.getClass(), "totalMasterSync", 718173188);
        setIntField(term226782, term226782.getClass(), "totalReMasterSync", -1945411376);
        setLongField(term226782, term226782.getClass(), "totalAchievement", -1022511683316739328L);
        setLongField(term226782, term226782.getClass(), "totalBasicAchievement", 3918249492698728421L);
        setLongField(term226782, term226782.getClass(), "totalAdvancedAchievement", 5056811364823438038L);
        setLongField(term226782, term226782.getClass(), "totalExpertAchievement", 364901119971402132L);
        setLongField(term226782, term226782.getClass(), "totalMasterAchievement", 3591948876135773977L);
        setLongField(term226782, term226782.getClass(), "totalReMasterAchievement", -5189953093105826248L);
        setLongField(term226782, term226782.getClass(), "playerOldRating", -5645220165267616021L);
        setLongField(term226782, term226782.getClass(), "playerNewRating", 4348732969026682940L);
        setIntField(term226782, term226782.getClass(), "banState", -1070288117);
        setLongField(term226782, term226782.getClass(), "dateTime", -6805474568319731987L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalDeluxscore", argTypes, term226782, args);
    }

};


