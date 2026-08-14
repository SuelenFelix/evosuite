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

public class UserDetail_setTotalExpertAchievement_1286721729147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279285;
     Object term279644;

    public UserDetail_setTotalExpertAchievement_1286721729147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279289 = new Long(2018084438165711668L);
        Integer term279352 = new Integer(-924513639);
        Integer term279354 = new Integer(-1763498118);
        ArrayList term279350 = new ArrayList();
        ((ArrayList) term279350).add(term279352);
        ((ArrayList) term279350).add(term279354);
        Integer term279360 = new Integer(-1084106934);
        Integer term279362 = new Integer(-1137769039);
        Integer term279364 = new Integer(753769464);
        Integer term279366 = new Integer(-2025824446);
        Integer term279368 = new Integer(-203123521);
        Integer term279370 = new Integer(2107969370);
        Integer term279372 = new Integer(-1606896209);
        Integer term279374 = new Integer(1824801079);
        ArrayList term279358 = new ArrayList();
        ((ArrayList) term279358).add(term279360);
        ((ArrayList) term279358).add(term279362);
        ((ArrayList) term279358).add(term279364);
        ((ArrayList) term279358).add(term279366);
        ((ArrayList) term279358).add(term279368);
        ((ArrayList) term279358).add(term279370);
        ((ArrayList) term279358).add(term279372);
        ((ArrayList) term279358).add(term279374);
        term279285 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term279287 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279318 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279285, term279285.getClass(), "id", -5159531072034606758L);
        setLongField(term279287, term279287.getClass(), "id", -1562170354566693504L);
        setField(term279287, term279287.getClass(), "extId", term279289);
        setField(term279287, term279287.getClass(), "luid", "nFYNkdURVQ");
        setIntField(term279304, term279304.getClass(), "year", 2025);
        setShortField(term279304, term279304.getClass(), "month", (short) 11);
        setShortField(term279304, term279304.getClass(), "day", (short) 3);
        setField(term279303, term279303.getClass(), "date", term279304);
        setByteField(term279308, term279308.getClass(), "hour", (byte) 17);
        setByteField(term279308, term279308.getClass(), "minute", (byte) 26);
        setByteField(term279308, term279308.getClass(), "second", (byte) 59);
        setIntField(term279308, term279308.getClass(), "nano", 407915348);
        setField(term279303, term279303.getClass(), "time", term279308);
        setField(term279287, term279287.getClass(), "registerTime", term279303);
        setIntField(term279314, term279314.getClass(), "year", 2029);
        setShortField(term279314, term279314.getClass(), "month", (short) 1);
        setShortField(term279314, term279314.getClass(), "day", (short) 21);
        setField(term279313, term279313.getClass(), "date", term279314);
        setByteField(term279318, term279318.getClass(), "hour", (byte) 6);
        setByteField(term279318, term279318.getClass(), "minute", (byte) 41);
        setByteField(term279318, term279318.getClass(), "second", (byte) 38);
        setIntField(term279318, term279318.getClass(), "nano", 30400186);
        setField(term279313, term279313.getClass(), "time", term279318);
        setField(term279287, term279287.getClass(), "accessTime", term279313);
        setField(term279285, term279285.getClass(), "card", term279287);
        setField(term279285, term279285.getClass(), "userName", "VaMZGFnePs");
        setIntField(term279285, term279285.getClass(), "isNetMember", 1038327828);
        setIntField(term279285, term279285.getClass(), "iconId", 1418723540);
        setIntField(term279285, term279285.getClass(), "plateId", 519713110);
        setIntField(term279285, term279285.getClass(), "titleId", -446830883);
        setIntField(term279285, term279285.getClass(), "partnerId", 410606492);
        setIntField(term279285, term279285.getClass(), "frameId", 1382733542);
        setIntField(term279285, term279285.getClass(), "selectMapId", 1612481933);
        setIntField(term279285, term279285.getClass(), "totalAwake", 1607981998);
        setIntField(term279285, term279285.getClass(), "gradeRating", -745736018);
        setIntField(term279285, term279285.getClass(), "musicRating", -2137149826);
        setIntField(term279285, term279285.getClass(), "playerRating", 380781928);
        setIntField(term279285, term279285.getClass(), "highestRating", -1571375910);
        setIntField(term279285, term279285.getClass(), "gradeRank", 635395361);
        setIntField(term279285, term279285.getClass(), "classRank", -1570990470);
        setIntField(term279285, term279285.getClass(), "courseRank", -1149009850);
        setField(term279285, term279285.getClass(), "charaSlot", term279350);
        setField(term279285, term279285.getClass(), "charaLockSlot", term279358);
        setLongField(term279285, term279285.getClass(), "contentBit", 1344110425049007724L);
        setIntField(term279285, term279285.getClass(), "playCount", 797100496);
        setField(term279285, term279285.getClass(), "eventWatchedDate", "lfngIPCkRz");
        setField(term279285, term279285.getClass(), "lastGameId", "ExFqbygbTc");
        setField(term279285, term279285.getClass(), "lastRomVersion", "wzNXDSGHuN");
        setField(term279285, term279285.getClass(), "lastDataVersion", "ChYSlyHfwK");
        setField(term279285, term279285.getClass(), "lastLoginDate", "WONvayWNCs");
        setField(term279285, term279285.getClass(), "lastPlayDate", "FyzhCvaPBp");
        setIntField(term279285, term279285.getClass(), "lastPlayCredit", 387188537);
        setIntField(term279285, term279285.getClass(), "lastPlayMode", 2117289330);
        setIntField(term279285, term279285.getClass(), "lastPlaceId", -1716176776);
        setField(term279285, term279285.getClass(), "lastPlaceName", "XAyaTiPVgp");
        setIntField(term279285, term279285.getClass(), "lastAllNetId", -945983725);
        setIntField(term279285, term279285.getClass(), "lastRegionId", -1130128512);
        setField(term279285, term279285.getClass(), "lastRegionName", "thjLrSQRdq");
        setField(term279285, term279285.getClass(), "lastClientId", "fAdWwXotkA");
        setField(term279285, term279285.getClass(), "lastCountryCode", "bviXUjxTVM");
        setIntField(term279285, term279285.getClass(), "lastSelectEMoney", -735578886);
        setIntField(term279285, term279285.getClass(), "lastSelectTicket", 122672951);
        setIntField(term279285, term279285.getClass(), "lastSelectCourse", -1025667815);
        setIntField(term279285, term279285.getClass(), "lastCountCourse", -1257702436);
        setField(term279285, term279285.getClass(), "firstGameId", "kchlDlnXwq");
        setField(term279285, term279285.getClass(), "firstRomVersion", "bIRvjZZUjf");
        setField(term279285, term279285.getClass(), "firstDataVersion", "BehfSbxgxB");
        setField(term279285, term279285.getClass(), "firstPlayDate", "wjLowxXqMV");
        setField(term279285, term279285.getClass(), "compatibleCmVersion", "ZKmgqtnyWl");
        setField(term279285, term279285.getClass(), "dailyBonusDate", "jbKfSPsbrl");
        setField(term279285, term279285.getClass(), "dailyCourseBonusDate", "cgnSRPOCMZ");
        setField(term279285, term279285.getClass(), "lastPairLoginDate", "rsZIFmJCSV");
        setField(term279285, term279285.getClass(), "lastTrialPlayDate", "tGfCBlTvvA");
        setIntField(term279285, term279285.getClass(), "playVsCount", -249942744);
        setIntField(term279285, term279285.getClass(), "playSyncCount", 1696885720);
        setIntField(term279285, term279285.getClass(), "winCount", 1489256822);
        setIntField(term279285, term279285.getClass(), "helpCount", 1421884382);
        setIntField(term279285, term279285.getClass(), "comboCount", -62634925);
        setLongField(term279285, term279285.getClass(), "totalDeluxscore", 2798403934006039965L);
        setLongField(term279285, term279285.getClass(), "totalBasicDeluxscore", 5220246767286316328L);
        setLongField(term279285, term279285.getClass(), "totalAdvancedDeluxscore", 5753478902711184187L);
        setLongField(term279285, term279285.getClass(), "totalExpertDeluxscore", 7764588813531114119L);
        setLongField(term279285, term279285.getClass(), "totalMasterDeluxscore", 5798396191805323323L);
        setLongField(term279285, term279285.getClass(), "totalReMasterDeluxscore", 75013683347246204L);
        setIntField(term279285, term279285.getClass(), "totalSync", 946481725);
        setIntField(term279285, term279285.getClass(), "totalBasicSync", 850914873);
        setIntField(term279285, term279285.getClass(), "totalAdvancedSync", 1246758487);
        setIntField(term279285, term279285.getClass(), "totalExpertSync", 1022269214);
        setIntField(term279285, term279285.getClass(), "totalMasterSync", -133112690);
        setIntField(term279285, term279285.getClass(), "totalReMasterSync", -734635114);
        setLongField(term279285, term279285.getClass(), "totalAchievement", 1657746606572126325L);
        setLongField(term279285, term279285.getClass(), "totalBasicAchievement", 1952804153016882556L);
        setLongField(term279285, term279285.getClass(), "totalAdvancedAchievement", 6609103050224210651L);
        setLongField(term279285, term279285.getClass(), "totalExpertAchievement", -585688649648579520L);
        setLongField(term279285, term279285.getClass(), "totalMasterAchievement", -6871181610954082082L);
        setLongField(term279285, term279285.getClass(), "totalReMasterAchievement", -629358270252686392L);
        setLongField(term279285, term279285.getClass(), "playerOldRating", -1493688352767330288L);
        setLongField(term279285, term279285.getClass(), "playerNewRating", -1903298675980750941L);
        setIntField(term279285, term279285.getClass(), "banState", 1091258417);
        setLongField(term279285, term279285.getClass(), "dateTime", -7091072290937533942L);
        term279644 = new Long(4440747220548229229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term279644;
        callMethod(klass, "setTotalExpertAchievement", argTypes, term279285, args);
    }

};


