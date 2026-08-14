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

public class UserDetail_setLastTrialPlayDate_690771047126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267376;

    public UserDetail_setLastTrialPlayDate_690771047126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term267380 = new Long(1950957495500453461L);
        Integer term267443 = new Integer(552764103);
        Integer term267445 = new Integer(-913811608);
        Integer term267447 = new Integer(895728550);
        ArrayList term267441 = new ArrayList();
        ((ArrayList) term267441).add(term267443);
        ((ArrayList) term267441).add(term267445);
        ((ArrayList) term267441).add(term267447);
        Integer term267453 = new Integer(-419871359);
        Integer term267455 = new Integer(812478175);
        Integer term267457 = new Integer(-133199375);
        Integer term267459 = new Integer(-356245449);
        Integer term267461 = new Integer(-1305056502);
        Integer term267463 = new Integer(1382545880);
        Integer term267465 = new Integer(-1299406001);
        ArrayList term267451 = new ArrayList();
        ((ArrayList) term267451).add(term267453);
        ((ArrayList) term267451).add(term267455);
        ((ArrayList) term267451).add(term267457);
        ((ArrayList) term267451).add(term267459);
        ((ArrayList) term267451).add(term267461);
        ((ArrayList) term267451).add(term267463);
        ((ArrayList) term267451).add(term267465);
        term267376 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term267378 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term267394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term267404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267409 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term267376, term267376.getClass(), "id", -6959868038927484216L);
        setLongField(term267378, term267378.getClass(), "id", 4074407792112132657L);
        setField(term267378, term267378.getClass(), "extId", term267380);
        setField(term267378, term267378.getClass(), "luid", "hlySbLstOL");
        setIntField(term267395, term267395.getClass(), "year", 2028);
        setShortField(term267395, term267395.getClass(), "month", (short) 1);
        setShortField(term267395, term267395.getClass(), "day", (short) 24);
        setField(term267394, term267394.getClass(), "date", term267395);
        setByteField(term267399, term267399.getClass(), "hour", (byte) 3);
        setByteField(term267399, term267399.getClass(), "minute", (byte) 52);
        setByteField(term267399, term267399.getClass(), "second", (byte) 50);
        setIntField(term267399, term267399.getClass(), "nano", 496872064);
        setField(term267394, term267394.getClass(), "time", term267399);
        setField(term267378, term267378.getClass(), "registerTime", term267394);
        setIntField(term267405, term267405.getClass(), "year", 2018);
        setShortField(term267405, term267405.getClass(), "month", (short) 10);
        setShortField(term267405, term267405.getClass(), "day", (short) 15);
        setField(term267404, term267404.getClass(), "date", term267405);
        setByteField(term267409, term267409.getClass(), "hour", (byte) 16);
        setByteField(term267409, term267409.getClass(), "minute", (byte) 49);
        setByteField(term267409, term267409.getClass(), "second", (byte) 22);
        setIntField(term267409, term267409.getClass(), "nano", 61396561);
        setField(term267404, term267404.getClass(), "time", term267409);
        setField(term267378, term267378.getClass(), "accessTime", term267404);
        setField(term267376, term267376.getClass(), "card", term267378);
        setField(term267376, term267376.getClass(), "userName", "BrhgoDPjVB");
        setIntField(term267376, term267376.getClass(), "isNetMember", 917621580);
        setIntField(term267376, term267376.getClass(), "iconId", 446002412);
        setIntField(term267376, term267376.getClass(), "plateId", -1099013474);
        setIntField(term267376, term267376.getClass(), "titleId", 455488849);
        setIntField(term267376, term267376.getClass(), "partnerId", -209063929);
        setIntField(term267376, term267376.getClass(), "frameId", 536230173);
        setIntField(term267376, term267376.getClass(), "selectMapId", 1592003857);
        setIntField(term267376, term267376.getClass(), "totalAwake", -1887501397);
        setIntField(term267376, term267376.getClass(), "gradeRating", 154448312);
        setIntField(term267376, term267376.getClass(), "musicRating", 138276904);
        setIntField(term267376, term267376.getClass(), "playerRating", -2109036857);
        setIntField(term267376, term267376.getClass(), "highestRating", 135499222);
        setIntField(term267376, term267376.getClass(), "gradeRank", 1653333305);
        setIntField(term267376, term267376.getClass(), "classRank", -627625760);
        setIntField(term267376, term267376.getClass(), "courseRank", -1512097288);
        setField(term267376, term267376.getClass(), "charaSlot", term267441);
        setField(term267376, term267376.getClass(), "charaLockSlot", term267451);
        setLongField(term267376, term267376.getClass(), "contentBit", -1874389098110083671L);
        setIntField(term267376, term267376.getClass(), "playCount", 855730514);
        setField(term267376, term267376.getClass(), "eventWatchedDate", "KtxsyuscWG");
        setField(term267376, term267376.getClass(), "lastGameId", "CBimniZbgp");
        setField(term267376, term267376.getClass(), "lastRomVersion", "FeoAVnPhfg");
        setField(term267376, term267376.getClass(), "lastDataVersion", "fTlWYYPrKH");
        setField(term267376, term267376.getClass(), "lastLoginDate", "mfXnrMabia");
        setField(term267376, term267376.getClass(), "lastPlayDate", "YelxRvGqHR");
        setIntField(term267376, term267376.getClass(), "lastPlayCredit", 1540516464);
        setIntField(term267376, term267376.getClass(), "lastPlayMode", -765931973);
        setIntField(term267376, term267376.getClass(), "lastPlaceId", 1553464782);
        setField(term267376, term267376.getClass(), "lastPlaceName", "XBkEFwWfkh");
        setIntField(term267376, term267376.getClass(), "lastAllNetId", -377732866);
        setIntField(term267376, term267376.getClass(), "lastRegionId", 793253863);
        setField(term267376, term267376.getClass(), "lastRegionName", "ozxxbmxRCe");
        setField(term267376, term267376.getClass(), "lastClientId", "GjUBsfBQMd");
        setField(term267376, term267376.getClass(), "lastCountryCode", "sgpWsdnOVL");
        setIntField(term267376, term267376.getClass(), "lastSelectEMoney", -65663655);
        setIntField(term267376, term267376.getClass(), "lastSelectTicket", 55766550);
        setIntField(term267376, term267376.getClass(), "lastSelectCourse", 1326458042);
        setIntField(term267376, term267376.getClass(), "lastCountCourse", 2065869723);
        setField(term267376, term267376.getClass(), "firstGameId", "hHyjmReKRL");
        setField(term267376, term267376.getClass(), "firstRomVersion", "MujDQptHTA");
        setField(term267376, term267376.getClass(), "firstDataVersion", "OvCJvfYBjg");
        setField(term267376, term267376.getClass(), "firstPlayDate", "iGbPhDXCXn");
        setField(term267376, term267376.getClass(), "compatibleCmVersion", "BIDinWjIgX");
        setField(term267376, term267376.getClass(), "dailyBonusDate", "supERaTQjg");
        setField(term267376, term267376.getClass(), "dailyCourseBonusDate", "EnJEYUwgVp");
        setField(term267376, term267376.getClass(), "lastPairLoginDate", "gAPDHJqyTc");
        setField(term267376, term267376.getClass(), "lastTrialPlayDate", "WyCSZSUlnV");
        setIntField(term267376, term267376.getClass(), "playVsCount", -865224762);
        setIntField(term267376, term267376.getClass(), "playSyncCount", -803624396);
        setIntField(term267376, term267376.getClass(), "winCount", 1824960332);
        setIntField(term267376, term267376.getClass(), "helpCount", 1452928275);
        setIntField(term267376, term267376.getClass(), "comboCount", -1153331717);
        setLongField(term267376, term267376.getClass(), "totalDeluxscore", 3481633440220113074L);
        setLongField(term267376, term267376.getClass(), "totalBasicDeluxscore", -8488418782157916073L);
        setLongField(term267376, term267376.getClass(), "totalAdvancedDeluxscore", 7635418360648985570L);
        setLongField(term267376, term267376.getClass(), "totalExpertDeluxscore", 7655365192544053763L);
        setLongField(term267376, term267376.getClass(), "totalMasterDeluxscore", 2871030135202947665L);
        setLongField(term267376, term267376.getClass(), "totalReMasterDeluxscore", 5056174954416845133L);
        setIntField(term267376, term267376.getClass(), "totalSync", -1018179752);
        setIntField(term267376, term267376.getClass(), "totalBasicSync", -958519673);
        setIntField(term267376, term267376.getClass(), "totalAdvancedSync", 1894821044);
        setIntField(term267376, term267376.getClass(), "totalExpertSync", 814997034);
        setIntField(term267376, term267376.getClass(), "totalMasterSync", -1942994450);
        setIntField(term267376, term267376.getClass(), "totalReMasterSync", -2062550615);
        setLongField(term267376, term267376.getClass(), "totalAchievement", 8298594061505181000L);
        setLongField(term267376, term267376.getClass(), "totalBasicAchievement", 4960013603709439205L);
        setLongField(term267376, term267376.getClass(), "totalAdvancedAchievement", 2289989629506276362L);
        setLongField(term267376, term267376.getClass(), "totalExpertAchievement", -4297233910018178443L);
        setLongField(term267376, term267376.getClass(), "totalMasterAchievement", 5434741207152953180L);
        setLongField(term267376, term267376.getClass(), "totalReMasterAchievement", -5505991504329412674L);
        setLongField(term267376, term267376.getClass(), "playerOldRating", -8615663136062885560L);
        setLongField(term267376, term267376.getClass(), "playerNewRating", -1103808477430625791L);
        setIntField(term267376, term267376.getClass(), "banState", -919180205);
        setLongField(term267376, term267376.getClass(), "dateTime", 908375582656406813L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SyHjOnayQl";
        callMethod(klass, "setLastTrialPlayDate", argTypes, term267376, args);
    }

};


