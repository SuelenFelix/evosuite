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

public class UserDetail_setFrameId_143832626885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4277761;
     Object term4278132;

    public UserDetail_setFrameId_143832626885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4277765 = new Long(-4116568912512494319L);
        Integer term4277828 = new Integer(-2147257341);
        Integer term4277830 = new Integer(-295336805);
        Integer term4277832 = new Integer(-752400077);
        Integer term4277834 = new Integer(1527625114);
        Integer term4277836 = new Integer(-824285797);
        Integer term4277838 = new Integer(-1919566665);
        Integer term4277840 = new Integer(527364928);
        ArrayList term4277826 = new ArrayList();
        ((ArrayList) term4277826).add(term4277828);
        ((ArrayList) term4277826).add(term4277830);
        ((ArrayList) term4277826).add(term4277832);
        ((ArrayList) term4277826).add(term4277834);
        ((ArrayList) term4277826).add(term4277836);
        ((ArrayList) term4277826).add(term4277838);
        ((ArrayList) term4277826).add(term4277840);
        Integer term4277846 = new Integer(-52905236);
        Integer term4277848 = new Integer(1652428393);
        Integer term4277850 = new Integer(-1884232363);
        Integer term4277852 = new Integer(-1687662011);
        Integer term4277854 = new Integer(-1841656072);
        Integer term4277856 = new Integer(475913381);
        Integer term4277858 = new Integer(-200214552);
        Integer term4277860 = new Integer(87117477);
        Integer term4277862 = new Integer(-871200798);
        ArrayList term4277844 = new ArrayList();
        ((ArrayList) term4277844).add(term4277846);
        ((ArrayList) term4277844).add(term4277848);
        ((ArrayList) term4277844).add(term4277850);
        ((ArrayList) term4277844).add(term4277852);
        ((ArrayList) term4277844).add(term4277854);
        ((ArrayList) term4277844).add(term4277856);
        ((ArrayList) term4277844).add(term4277858);
        ((ArrayList) term4277844).add(term4277860);
        ((ArrayList) term4277844).add(term4277862);
        term4277761 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4277763 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4277779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4277780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4277784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4277789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4277790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4277794 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4277761, term4277761.getClass(), "id", -4526002857301772045L);
        setLongField(term4277763, term4277763.getClass(), "id", 8491881577410994716L);
        setField(term4277763, term4277763.getClass(), "extId", term4277765);
        setField(term4277763, term4277763.getClass(), "luid", "leittyBctT");
        setIntField(term4277780, term4277780.getClass(), "year", 2019);
        setShortField(term4277780, term4277780.getClass(), "month", (short) 11);
        setShortField(term4277780, term4277780.getClass(), "day", (short) 2);
        setField(term4277779, term4277779.getClass(), "date", term4277780);
        setByteField(term4277784, term4277784.getClass(), "hour", (byte) 22);
        setByteField(term4277784, term4277784.getClass(), "minute", (byte) 41);
        setByteField(term4277784, term4277784.getClass(), "second", (byte) 0);
        setIntField(term4277784, term4277784.getClass(), "nano", 45668331);
        setField(term4277779, term4277779.getClass(), "time", term4277784);
        setField(term4277763, term4277763.getClass(), "registerTime", term4277779);
        setIntField(term4277790, term4277790.getClass(), "year", 2016);
        setShortField(term4277790, term4277790.getClass(), "month", (short) 8);
        setShortField(term4277790, term4277790.getClass(), "day", (short) 25);
        setField(term4277789, term4277789.getClass(), "date", term4277790);
        setByteField(term4277794, term4277794.getClass(), "hour", (byte) 14);
        setByteField(term4277794, term4277794.getClass(), "minute", (byte) 35);
        setByteField(term4277794, term4277794.getClass(), "second", (byte) 42);
        setIntField(term4277794, term4277794.getClass(), "nano", 887537677);
        setField(term4277789, term4277789.getClass(), "time", term4277794);
        setField(term4277763, term4277763.getClass(), "accessTime", term4277789);
        setField(term4277761, term4277761.getClass(), "card", term4277763);
        setField(term4277761, term4277761.getClass(), "userName", "xPyEpNCpQC");
        setIntField(term4277761, term4277761.getClass(), "isNetMember", -1719035);
        setIntField(term4277761, term4277761.getClass(), "iconId", -296656740);
        setIntField(term4277761, term4277761.getClass(), "plateId", -919263272);
        setIntField(term4277761, term4277761.getClass(), "titleId", -1909651889);
        setIntField(term4277761, term4277761.getClass(), "partnerId", -1332510455);
        setIntField(term4277761, term4277761.getClass(), "frameId", 100110718);
        setIntField(term4277761, term4277761.getClass(), "selectMapId", -34518854);
        setIntField(term4277761, term4277761.getClass(), "totalAwake", -1659730520);
        setIntField(term4277761, term4277761.getClass(), "gradeRating", -1352204577);
        setIntField(term4277761, term4277761.getClass(), "musicRating", -1635317965);
        setIntField(term4277761, term4277761.getClass(), "playerRating", 1838165649);
        setIntField(term4277761, term4277761.getClass(), "highestRating", -416041888);
        setIntField(term4277761, term4277761.getClass(), "gradeRank", -1143161780);
        setIntField(term4277761, term4277761.getClass(), "classRank", 1321214014);
        setIntField(term4277761, term4277761.getClass(), "courseRank", -1858818471);
        setField(term4277761, term4277761.getClass(), "charaSlot", term4277826);
        setField(term4277761, term4277761.getClass(), "charaLockSlot", term4277844);
        setLongField(term4277761, term4277761.getClass(), "contentBit", 3530860616856203473L);
        setIntField(term4277761, term4277761.getClass(), "playCount", -908856394);
        setField(term4277761, term4277761.getClass(), "eventWatchedDate", "wWCMuBUAJt");
        setField(term4277761, term4277761.getClass(), "lastGameId", "oibmecYZSL");
        setField(term4277761, term4277761.getClass(), "lastRomVersion", "brLcnmDxrd");
        setField(term4277761, term4277761.getClass(), "lastDataVersion", "IcDlLlGKSR");
        setField(term4277761, term4277761.getClass(), "lastLoginDate", "cMBgsTtnMR");
        setField(term4277761, term4277761.getClass(), "lastPlayDate", "krJaECiXQj");
        setIntField(term4277761, term4277761.getClass(), "lastPlayCredit", -208316744);
        setIntField(term4277761, term4277761.getClass(), "lastPlayMode", -1771459619);
        setIntField(term4277761, term4277761.getClass(), "lastPlaceId", 1898371141);
        setField(term4277761, term4277761.getClass(), "lastPlaceName", "gQCCxEAaDY");
        setIntField(term4277761, term4277761.getClass(), "lastAllNetId", 1702507060);
        setIntField(term4277761, term4277761.getClass(), "lastRegionId", -912327444);
        setField(term4277761, term4277761.getClass(), "lastRegionName", "FekkPLzRbE");
        setField(term4277761, term4277761.getClass(), "lastClientId", "dQgNaMhyMb");
        setField(term4277761, term4277761.getClass(), "lastCountryCode", "XoPbJaCggt");
        setIntField(term4277761, term4277761.getClass(), "lastSelectEMoney", -42175874);
        setIntField(term4277761, term4277761.getClass(), "lastSelectTicket", 1776634151);
        setIntField(term4277761, term4277761.getClass(), "lastSelectCourse", -710907063);
        setIntField(term4277761, term4277761.getClass(), "lastCountCourse", 1564326172);
        setField(term4277761, term4277761.getClass(), "firstGameId", "hWJCwQZmph");
        setField(term4277761, term4277761.getClass(), "firstRomVersion", "bobYmEbAbM");
        setField(term4277761, term4277761.getClass(), "firstDataVersion", "HJZTGFAhaX");
        setField(term4277761, term4277761.getClass(), "firstPlayDate", "HkCdAqkWTy");
        setField(term4277761, term4277761.getClass(), "compatibleCmVersion", "SKimGPMQoe");
        setField(term4277761, term4277761.getClass(), "dailyBonusDate", "QDlDRMRzBO");
        setField(term4277761, term4277761.getClass(), "dailyCourseBonusDate", "tWqjIYheRN");
        setField(term4277761, term4277761.getClass(), "lastPairLoginDate", "OdqdpZnMox");
        setField(term4277761, term4277761.getClass(), "lastTrialPlayDate", "oPdMxIorCU");
        setIntField(term4277761, term4277761.getClass(), "playVsCount", -1382395535);
        setIntField(term4277761, term4277761.getClass(), "playSyncCount", 682602005);
        setIntField(term4277761, term4277761.getClass(), "winCount", -1121776619);
        setIntField(term4277761, term4277761.getClass(), "helpCount", 627037992);
        setIntField(term4277761, term4277761.getClass(), "comboCount", 1160699358);
        setLongField(term4277761, term4277761.getClass(), "totalDeluxscore", 4674456719064914034L);
        setLongField(term4277761, term4277761.getClass(), "totalBasicDeluxscore", -4683300750142747603L);
        setLongField(term4277761, term4277761.getClass(), "totalAdvancedDeluxscore", 565398990420105392L);
        setLongField(term4277761, term4277761.getClass(), "totalExpertDeluxscore", 3265812696031911880L);
        setLongField(term4277761, term4277761.getClass(), "totalMasterDeluxscore", 5343976617218309420L);
        setLongField(term4277761, term4277761.getClass(), "totalReMasterDeluxscore", -8216753604963494970L);
        setIntField(term4277761, term4277761.getClass(), "totalSync", -1279041975);
        setIntField(term4277761, term4277761.getClass(), "totalBasicSync", -796831356);
        setIntField(term4277761, term4277761.getClass(), "totalAdvancedSync", -1258558690);
        setIntField(term4277761, term4277761.getClass(), "totalExpertSync", 1728234232);
        setIntField(term4277761, term4277761.getClass(), "totalMasterSync", -491966647);
        setIntField(term4277761, term4277761.getClass(), "totalReMasterSync", 1585247134);
        setLongField(term4277761, term4277761.getClass(), "totalAchievement", 4541260093665891638L);
        setLongField(term4277761, term4277761.getClass(), "totalBasicAchievement", -5329173869443821205L);
        setLongField(term4277761, term4277761.getClass(), "totalAdvancedAchievement", -5530047227561749892L);
        setLongField(term4277761, term4277761.getClass(), "totalExpertAchievement", -8319274571691914967L);
        setLongField(term4277761, term4277761.getClass(), "totalMasterAchievement", 2619970557967296688L);
        setLongField(term4277761, term4277761.getClass(), "totalReMasterAchievement", 737030623772218586L);
        setLongField(term4277761, term4277761.getClass(), "playerOldRating", 6805861987902980967L);
        setLongField(term4277761, term4277761.getClass(), "playerNewRating", -6871391904993805751L);
        setIntField(term4277761, term4277761.getClass(), "banState", 610941955);
        setLongField(term4277761, term4277761.getClass(), "dateTime", 4535025686064199236L);
        term4278132 = new Integer(1340755826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4278132;
        callMethod(klass, "setFrameId", argTypes, term4277761, args);
    }

};


