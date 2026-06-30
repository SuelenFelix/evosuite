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

public class UserDetail_setLastTrialPlayDate_690771047127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267431;

    public UserDetail_setLastTrialPlayDate_690771047127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term267435 = new Long(1950957495500453461L);
        Integer term267498 = new Integer(552764103);
        Integer term267500 = new Integer(-913811608);
        Integer term267502 = new Integer(895728550);
        ArrayList term267496 = new ArrayList();
        ((ArrayList) term267496).add(term267498);
        ((ArrayList) term267496).add(term267500);
        ((ArrayList) term267496).add(term267502);
        Integer term267508 = new Integer(-419871359);
        Integer term267510 = new Integer(812478175);
        Integer term267512 = new Integer(-133199375);
        Integer term267514 = new Integer(-356245449);
        Integer term267516 = new Integer(-1305056502);
        Integer term267518 = new Integer(1382545880);
        Integer term267520 = new Integer(-1299406001);
        ArrayList term267506 = new ArrayList();
        ((ArrayList) term267506).add(term267508);
        ((ArrayList) term267506).add(term267510);
        ((ArrayList) term267506).add(term267512);
        ((ArrayList) term267506).add(term267514);
        ((ArrayList) term267506).add(term267516);
        ((ArrayList) term267506).add(term267518);
        ((ArrayList) term267506).add(term267520);
        term267431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term267433 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term267449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term267459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267464 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term267431, term267431.getClass(), "id", -6959868038927484216L);
        setLongField(term267433, term267433.getClass(), "id", 4074407792112132657L);
        setField(term267433, term267433.getClass(), "extId", term267435);
        setField(term267433, term267433.getClass(), "luid", "hlySbLstOL");
        setIntField(term267450, term267450.getClass(), "year", 2028);
        setShortField(term267450, term267450.getClass(), "month", (short) 1);
        setShortField(term267450, term267450.getClass(), "day", (short) 24);
        setField(term267449, term267449.getClass(), "date", term267450);
        setByteField(term267454, term267454.getClass(), "hour", (byte) 3);
        setByteField(term267454, term267454.getClass(), "minute", (byte) 52);
        setByteField(term267454, term267454.getClass(), "second", (byte) 50);
        setIntField(term267454, term267454.getClass(), "nano", 496872064);
        setField(term267449, term267449.getClass(), "time", term267454);
        setField(term267433, term267433.getClass(), "registerTime", term267449);
        setIntField(term267460, term267460.getClass(), "year", 2018);
        setShortField(term267460, term267460.getClass(), "month", (short) 10);
        setShortField(term267460, term267460.getClass(), "day", (short) 15);
        setField(term267459, term267459.getClass(), "date", term267460);
        setByteField(term267464, term267464.getClass(), "hour", (byte) 16);
        setByteField(term267464, term267464.getClass(), "minute", (byte) 49);
        setByteField(term267464, term267464.getClass(), "second", (byte) 22);
        setIntField(term267464, term267464.getClass(), "nano", 61396561);
        setField(term267459, term267459.getClass(), "time", term267464);
        setField(term267433, term267433.getClass(), "accessTime", term267459);
        setField(term267431, term267431.getClass(), "card", term267433);
        setField(term267431, term267431.getClass(), "userName", "BrhgoDPjVB");
        setIntField(term267431, term267431.getClass(), "isNetMember", 917621580);
        setIntField(term267431, term267431.getClass(), "iconId", 446002412);
        setIntField(term267431, term267431.getClass(), "plateId", -1099013474);
        setIntField(term267431, term267431.getClass(), "titleId", 455488849);
        setIntField(term267431, term267431.getClass(), "partnerId", -209063929);
        setIntField(term267431, term267431.getClass(), "frameId", 536230173);
        setIntField(term267431, term267431.getClass(), "selectMapId", 1592003857);
        setIntField(term267431, term267431.getClass(), "totalAwake", -1887501397);
        setIntField(term267431, term267431.getClass(), "gradeRating", 154448312);
        setIntField(term267431, term267431.getClass(), "musicRating", 138276904);
        setIntField(term267431, term267431.getClass(), "playerRating", -2109036857);
        setIntField(term267431, term267431.getClass(), "highestRating", 135499222);
        setIntField(term267431, term267431.getClass(), "gradeRank", 1653333305);
        setIntField(term267431, term267431.getClass(), "classRank", -627625760);
        setIntField(term267431, term267431.getClass(), "courseRank", -1512097288);
        setField(term267431, term267431.getClass(), "charaSlot", term267496);
        setField(term267431, term267431.getClass(), "charaLockSlot", term267506);
        setLongField(term267431, term267431.getClass(), "contentBit", -1874389098110083671L);
        setIntField(term267431, term267431.getClass(), "playCount", 855730514);
        setField(term267431, term267431.getClass(), "eventWatchedDate", "KtxsyuscWG");
        setField(term267431, term267431.getClass(), "lastGameId", "CBimniZbgp");
        setField(term267431, term267431.getClass(), "lastRomVersion", "FeoAVnPhfg");
        setField(term267431, term267431.getClass(), "lastDataVersion", "fTlWYYPrKH");
        setField(term267431, term267431.getClass(), "lastLoginDate", "mfXnrMabia");
        setField(term267431, term267431.getClass(), "lastPlayDate", "YelxRvGqHR");
        setIntField(term267431, term267431.getClass(), "lastPlayCredit", 1540516464);
        setIntField(term267431, term267431.getClass(), "lastPlayMode", -765931973);
        setIntField(term267431, term267431.getClass(), "lastPlaceId", 1553464782);
        setField(term267431, term267431.getClass(), "lastPlaceName", "XBkEFwWfkh");
        setIntField(term267431, term267431.getClass(), "lastAllNetId", -377732866);
        setIntField(term267431, term267431.getClass(), "lastRegionId", 793253863);
        setField(term267431, term267431.getClass(), "lastRegionName", "ozxxbmxRCe");
        setField(term267431, term267431.getClass(), "lastClientId", "GjUBsfBQMd");
        setField(term267431, term267431.getClass(), "lastCountryCode", "sgpWsdnOVL");
        setIntField(term267431, term267431.getClass(), "lastSelectEMoney", -65663655);
        setIntField(term267431, term267431.getClass(), "lastSelectTicket", 55766550);
        setIntField(term267431, term267431.getClass(), "lastSelectCourse", 1326458042);
        setIntField(term267431, term267431.getClass(), "lastCountCourse", 2065869723);
        setField(term267431, term267431.getClass(), "firstGameId", "hHyjmReKRL");
        setField(term267431, term267431.getClass(), "firstRomVersion", "MujDQptHTA");
        setField(term267431, term267431.getClass(), "firstDataVersion", "OvCJvfYBjg");
        setField(term267431, term267431.getClass(), "firstPlayDate", "iGbPhDXCXn");
        setField(term267431, term267431.getClass(), "compatibleCmVersion", "BIDinWjIgX");
        setField(term267431, term267431.getClass(), "dailyBonusDate", "supERaTQjg");
        setField(term267431, term267431.getClass(), "dailyCourseBonusDate", "EnJEYUwgVp");
        setField(term267431, term267431.getClass(), "lastPairLoginDate", "gAPDHJqyTc");
        setField(term267431, term267431.getClass(), "lastTrialPlayDate", "WyCSZSUlnV");
        setIntField(term267431, term267431.getClass(), "playVsCount", -865224762);
        setIntField(term267431, term267431.getClass(), "playSyncCount", -803624396);
        setIntField(term267431, term267431.getClass(), "winCount", 1824960332);
        setIntField(term267431, term267431.getClass(), "helpCount", 1452928275);
        setIntField(term267431, term267431.getClass(), "comboCount", -1153331717);
        setLongField(term267431, term267431.getClass(), "totalDeluxscore", 3481633440220113074L);
        setLongField(term267431, term267431.getClass(), "totalBasicDeluxscore", -8488418782157916073L);
        setLongField(term267431, term267431.getClass(), "totalAdvancedDeluxscore", 7635418360648985570L);
        setLongField(term267431, term267431.getClass(), "totalExpertDeluxscore", 7655365192544053763L);
        setLongField(term267431, term267431.getClass(), "totalMasterDeluxscore", 2871030135202947665L);
        setLongField(term267431, term267431.getClass(), "totalReMasterDeluxscore", 5056174954416845133L);
        setIntField(term267431, term267431.getClass(), "totalSync", -1018179752);
        setIntField(term267431, term267431.getClass(), "totalBasicSync", -958519673);
        setIntField(term267431, term267431.getClass(), "totalAdvancedSync", 1894821044);
        setIntField(term267431, term267431.getClass(), "totalExpertSync", 814997034);
        setIntField(term267431, term267431.getClass(), "totalMasterSync", -1942994450);
        setIntField(term267431, term267431.getClass(), "totalReMasterSync", -2062550615);
        setLongField(term267431, term267431.getClass(), "totalAchievement", 8298594061505181000L);
        setLongField(term267431, term267431.getClass(), "totalBasicAchievement", 4960013603709439205L);
        setLongField(term267431, term267431.getClass(), "totalAdvancedAchievement", 2289989629506276362L);
        setLongField(term267431, term267431.getClass(), "totalExpertAchievement", -4297233910018178443L);
        setLongField(term267431, term267431.getClass(), "totalMasterAchievement", 5434741207152953180L);
        setLongField(term267431, term267431.getClass(), "totalReMasterAchievement", -5505991504329412674L);
        setLongField(term267431, term267431.getClass(), "playerOldRating", -8615663136062885560L);
        setLongField(term267431, term267431.getClass(), "playerNewRating", -1103808477430625791L);
        setIntField(term267431, term267431.getClass(), "banState", -919180205);
        setLongField(term267431, term267431.getClass(), "dateTime", 908375582656406813L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SyHjOnayQl";
        callMethod(klass, "setLastTrialPlayDate", argTypes, term267431, args);
    }

};


