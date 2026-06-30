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

public class UserDetail_setTotalExpertAchievement_1286721729148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279340;
     Object term279699;

    public UserDetail_setTotalExpertAchievement_1286721729148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279344 = new Long(2018084438165711668L);
        Integer term279407 = new Integer(-924513639);
        Integer term279409 = new Integer(-1763498118);
        ArrayList term279405 = new ArrayList();
        ((ArrayList) term279405).add(term279407);
        ((ArrayList) term279405).add(term279409);
        Integer term279415 = new Integer(-1084106934);
        Integer term279417 = new Integer(-1137769039);
        Integer term279419 = new Integer(753769464);
        Integer term279421 = new Integer(-2025824446);
        Integer term279423 = new Integer(-203123521);
        Integer term279425 = new Integer(2107969370);
        Integer term279427 = new Integer(-1606896209);
        Integer term279429 = new Integer(1824801079);
        ArrayList term279413 = new ArrayList();
        ((ArrayList) term279413).add(term279415);
        ((ArrayList) term279413).add(term279417);
        ((ArrayList) term279413).add(term279419);
        ((ArrayList) term279413).add(term279421);
        ((ArrayList) term279413).add(term279423);
        ((ArrayList) term279413).add(term279425);
        ((ArrayList) term279413).add(term279427);
        ((ArrayList) term279413).add(term279429);
        term279340 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term279342 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279340, term279340.getClass(), "id", -5159531072034606758L);
        setLongField(term279342, term279342.getClass(), "id", -1562170354566693504L);
        setField(term279342, term279342.getClass(), "extId", term279344);
        setField(term279342, term279342.getClass(), "luid", "nFYNkdURVQ");
        setIntField(term279359, term279359.getClass(), "year", 2025);
        setShortField(term279359, term279359.getClass(), "month", (short) 11);
        setShortField(term279359, term279359.getClass(), "day", (short) 3);
        setField(term279358, term279358.getClass(), "date", term279359);
        setByteField(term279363, term279363.getClass(), "hour", (byte) 17);
        setByteField(term279363, term279363.getClass(), "minute", (byte) 26);
        setByteField(term279363, term279363.getClass(), "second", (byte) 59);
        setIntField(term279363, term279363.getClass(), "nano", 407915348);
        setField(term279358, term279358.getClass(), "time", term279363);
        setField(term279342, term279342.getClass(), "registerTime", term279358);
        setIntField(term279369, term279369.getClass(), "year", 2029);
        setShortField(term279369, term279369.getClass(), "month", (short) 1);
        setShortField(term279369, term279369.getClass(), "day", (short) 21);
        setField(term279368, term279368.getClass(), "date", term279369);
        setByteField(term279373, term279373.getClass(), "hour", (byte) 6);
        setByteField(term279373, term279373.getClass(), "minute", (byte) 41);
        setByteField(term279373, term279373.getClass(), "second", (byte) 38);
        setIntField(term279373, term279373.getClass(), "nano", 30400186);
        setField(term279368, term279368.getClass(), "time", term279373);
        setField(term279342, term279342.getClass(), "accessTime", term279368);
        setField(term279340, term279340.getClass(), "card", term279342);
        setField(term279340, term279340.getClass(), "userName", "VaMZGFnePs");
        setIntField(term279340, term279340.getClass(), "isNetMember", 1038327828);
        setIntField(term279340, term279340.getClass(), "iconId", 1418723540);
        setIntField(term279340, term279340.getClass(), "plateId", 519713110);
        setIntField(term279340, term279340.getClass(), "titleId", -446830883);
        setIntField(term279340, term279340.getClass(), "partnerId", 410606492);
        setIntField(term279340, term279340.getClass(), "frameId", 1382733542);
        setIntField(term279340, term279340.getClass(), "selectMapId", 1612481933);
        setIntField(term279340, term279340.getClass(), "totalAwake", 1607981998);
        setIntField(term279340, term279340.getClass(), "gradeRating", -745736018);
        setIntField(term279340, term279340.getClass(), "musicRating", -2137149826);
        setIntField(term279340, term279340.getClass(), "playerRating", 380781928);
        setIntField(term279340, term279340.getClass(), "highestRating", -1571375910);
        setIntField(term279340, term279340.getClass(), "gradeRank", 635395361);
        setIntField(term279340, term279340.getClass(), "classRank", -1570990470);
        setIntField(term279340, term279340.getClass(), "courseRank", -1149009850);
        setField(term279340, term279340.getClass(), "charaSlot", term279405);
        setField(term279340, term279340.getClass(), "charaLockSlot", term279413);
        setLongField(term279340, term279340.getClass(), "contentBit", 1344110425049007724L);
        setIntField(term279340, term279340.getClass(), "playCount", 797100496);
        setField(term279340, term279340.getClass(), "eventWatchedDate", "lfngIPCkRz");
        setField(term279340, term279340.getClass(), "lastGameId", "ExFqbygbTc");
        setField(term279340, term279340.getClass(), "lastRomVersion", "wzNXDSGHuN");
        setField(term279340, term279340.getClass(), "lastDataVersion", "ChYSlyHfwK");
        setField(term279340, term279340.getClass(), "lastLoginDate", "WONvayWNCs");
        setField(term279340, term279340.getClass(), "lastPlayDate", "FyzhCvaPBp");
        setIntField(term279340, term279340.getClass(), "lastPlayCredit", 387188537);
        setIntField(term279340, term279340.getClass(), "lastPlayMode", 2117289330);
        setIntField(term279340, term279340.getClass(), "lastPlaceId", -1716176776);
        setField(term279340, term279340.getClass(), "lastPlaceName", "XAyaTiPVgp");
        setIntField(term279340, term279340.getClass(), "lastAllNetId", -945983725);
        setIntField(term279340, term279340.getClass(), "lastRegionId", -1130128512);
        setField(term279340, term279340.getClass(), "lastRegionName", "thjLrSQRdq");
        setField(term279340, term279340.getClass(), "lastClientId", "fAdWwXotkA");
        setField(term279340, term279340.getClass(), "lastCountryCode", "bviXUjxTVM");
        setIntField(term279340, term279340.getClass(), "lastSelectEMoney", -735578886);
        setIntField(term279340, term279340.getClass(), "lastSelectTicket", 122672951);
        setIntField(term279340, term279340.getClass(), "lastSelectCourse", -1025667815);
        setIntField(term279340, term279340.getClass(), "lastCountCourse", -1257702436);
        setField(term279340, term279340.getClass(), "firstGameId", "kchlDlnXwq");
        setField(term279340, term279340.getClass(), "firstRomVersion", "bIRvjZZUjf");
        setField(term279340, term279340.getClass(), "firstDataVersion", "BehfSbxgxB");
        setField(term279340, term279340.getClass(), "firstPlayDate", "wjLowxXqMV");
        setField(term279340, term279340.getClass(), "compatibleCmVersion", "ZKmgqtnyWl");
        setField(term279340, term279340.getClass(), "dailyBonusDate", "jbKfSPsbrl");
        setField(term279340, term279340.getClass(), "dailyCourseBonusDate", "cgnSRPOCMZ");
        setField(term279340, term279340.getClass(), "lastPairLoginDate", "rsZIFmJCSV");
        setField(term279340, term279340.getClass(), "lastTrialPlayDate", "tGfCBlTvvA");
        setIntField(term279340, term279340.getClass(), "playVsCount", -249942744);
        setIntField(term279340, term279340.getClass(), "playSyncCount", 1696885720);
        setIntField(term279340, term279340.getClass(), "winCount", 1489256822);
        setIntField(term279340, term279340.getClass(), "helpCount", 1421884382);
        setIntField(term279340, term279340.getClass(), "comboCount", -62634925);
        setLongField(term279340, term279340.getClass(), "totalDeluxscore", 2798403934006039965L);
        setLongField(term279340, term279340.getClass(), "totalBasicDeluxscore", 5220246767286316328L);
        setLongField(term279340, term279340.getClass(), "totalAdvancedDeluxscore", 5753478902711184187L);
        setLongField(term279340, term279340.getClass(), "totalExpertDeluxscore", 7764588813531114119L);
        setLongField(term279340, term279340.getClass(), "totalMasterDeluxscore", 5798396191805323323L);
        setLongField(term279340, term279340.getClass(), "totalReMasterDeluxscore", 75013683347246204L);
        setIntField(term279340, term279340.getClass(), "totalSync", 946481725);
        setIntField(term279340, term279340.getClass(), "totalBasicSync", 850914873);
        setIntField(term279340, term279340.getClass(), "totalAdvancedSync", 1246758487);
        setIntField(term279340, term279340.getClass(), "totalExpertSync", 1022269214);
        setIntField(term279340, term279340.getClass(), "totalMasterSync", -133112690);
        setIntField(term279340, term279340.getClass(), "totalReMasterSync", -734635114);
        setLongField(term279340, term279340.getClass(), "totalAchievement", 1657746606572126325L);
        setLongField(term279340, term279340.getClass(), "totalBasicAchievement", 1952804153016882556L);
        setLongField(term279340, term279340.getClass(), "totalAdvancedAchievement", 6609103050224210651L);
        setLongField(term279340, term279340.getClass(), "totalExpertAchievement", -585688649648579520L);
        setLongField(term279340, term279340.getClass(), "totalMasterAchievement", -6871181610954082082L);
        setLongField(term279340, term279340.getClass(), "totalReMasterAchievement", -629358270252686392L);
        setLongField(term279340, term279340.getClass(), "playerOldRating", -1493688352767330288L);
        setLongField(term279340, term279340.getClass(), "playerNewRating", -1903298675980750941L);
        setIntField(term279340, term279340.getClass(), "banState", 1091258417);
        setLongField(term279340, term279340.getClass(), "dateTime", -7091072290937533942L);
        term279699 = new Long(4440747220548229229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term279699;
        callMethod(klass, "setTotalExpertAchievement", argTypes, term279340, args);
    }

};


