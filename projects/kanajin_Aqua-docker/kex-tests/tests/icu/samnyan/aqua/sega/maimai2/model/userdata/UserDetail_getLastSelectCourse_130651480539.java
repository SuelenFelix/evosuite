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

public class UserDetail_getLastSelectCourse_130651480539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217643;

    public UserDetail_getLastSelectCourse_130651480539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217647 = new Long(6895382576300001141L);
        Integer term217710 = new Integer(2120008602);
        ArrayList term217708 = new ArrayList();
        ((ArrayList) term217708).add(term217710);
        Integer term217716 = new Integer(1085966764);
        Integer term217718 = new Integer(-609882960);
        Integer term217720 = new Integer(-1690283734);
        Integer term217722 = new Integer(-1620783951);
        Integer term217724 = new Integer(1400387811);
        Integer term217726 = new Integer(903826116);
        Integer term217728 = new Integer(641366348);
        Integer term217730 = new Integer(-353276989);
        Integer term217732 = new Integer(-505563323);
        ArrayList term217714 = new ArrayList();
        ((ArrayList) term217714).add(term217716);
        ((ArrayList) term217714).add(term217718);
        ((ArrayList) term217714).add(term217720);
        ((ArrayList) term217714).add(term217722);
        ((ArrayList) term217714).add(term217724);
        ((ArrayList) term217714).add(term217726);
        ((ArrayList) term217714).add(term217728);
        ((ArrayList) term217714).add(term217730);
        ((ArrayList) term217714).add(term217732);
        term217643 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term217645 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217676 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217643, term217643.getClass(), "id", -5451630668638977834L);
        setLongField(term217645, term217645.getClass(), "id", 3816575703649188940L);
        setField(term217645, term217645.getClass(), "extId", term217647);
        setField(term217645, term217645.getClass(), "luid", "IDxgeSVtht");
        setIntField(term217662, term217662.getClass(), "year", 2014);
        setShortField(term217662, term217662.getClass(), "month", (short) 9);
        setShortField(term217662, term217662.getClass(), "day", (short) 26);
        setField(term217661, term217661.getClass(), "date", term217662);
        setByteField(term217666, term217666.getClass(), "hour", (byte) 5);
        setByteField(term217666, term217666.getClass(), "minute", (byte) 40);
        setByteField(term217666, term217666.getClass(), "second", (byte) 6);
        setIntField(term217666, term217666.getClass(), "nano", 923937756);
        setField(term217661, term217661.getClass(), "time", term217666);
        setField(term217645, term217645.getClass(), "registerTime", term217661);
        setIntField(term217672, term217672.getClass(), "year", 2023);
        setShortField(term217672, term217672.getClass(), "month", (short) 8);
        setShortField(term217672, term217672.getClass(), "day", (short) 18);
        setField(term217671, term217671.getClass(), "date", term217672);
        setByteField(term217676, term217676.getClass(), "hour", (byte) 14);
        setByteField(term217676, term217676.getClass(), "minute", (byte) 2);
        setByteField(term217676, term217676.getClass(), "second", (byte) 54);
        setIntField(term217676, term217676.getClass(), "nano", 97633516);
        setField(term217671, term217671.getClass(), "time", term217676);
        setField(term217645, term217645.getClass(), "accessTime", term217671);
        setField(term217643, term217643.getClass(), "card", term217645);
        setField(term217643, term217643.getClass(), "userName", "fEgDyAlFot");
        setIntField(term217643, term217643.getClass(), "isNetMember", -357230273);
        setIntField(term217643, term217643.getClass(), "iconId", -537888142);
        setIntField(term217643, term217643.getClass(), "plateId", -1600863169);
        setIntField(term217643, term217643.getClass(), "titleId", -151268707);
        setIntField(term217643, term217643.getClass(), "partnerId", 687322930);
        setIntField(term217643, term217643.getClass(), "frameId", -1091459660);
        setIntField(term217643, term217643.getClass(), "selectMapId", -729567674);
        setIntField(term217643, term217643.getClass(), "totalAwake", -1285026670);
        setIntField(term217643, term217643.getClass(), "gradeRating", -1081713412);
        setIntField(term217643, term217643.getClass(), "musicRating", -698893307);
        setIntField(term217643, term217643.getClass(), "playerRating", -198530739);
        setIntField(term217643, term217643.getClass(), "highestRating", -820225259);
        setIntField(term217643, term217643.getClass(), "gradeRank", -1310113307);
        setIntField(term217643, term217643.getClass(), "classRank", 1548923560);
        setIntField(term217643, term217643.getClass(), "courseRank", -624904888);
        setField(term217643, term217643.getClass(), "charaSlot", term217708);
        setField(term217643, term217643.getClass(), "charaLockSlot", term217714);
        setLongField(term217643, term217643.getClass(), "contentBit", -8364829941856463433L);
        setIntField(term217643, term217643.getClass(), "playCount", -2104329060);
        setField(term217643, term217643.getClass(), "eventWatchedDate", "bLIDBOCeeG");
        setField(term217643, term217643.getClass(), "lastGameId", "YEaYKAoFqS");
        setField(term217643, term217643.getClass(), "lastRomVersion", "zFPvOGZrLO");
        setField(term217643, term217643.getClass(), "lastDataVersion", "mfbnfWlLlE");
        setField(term217643, term217643.getClass(), "lastLoginDate", "BsfZWxmVYU");
        setField(term217643, term217643.getClass(), "lastPlayDate", "IQqvmZgDVk");
        setIntField(term217643, term217643.getClass(), "lastPlayCredit", 69884134);
        setIntField(term217643, term217643.getClass(), "lastPlayMode", 1238870233);
        setIntField(term217643, term217643.getClass(), "lastPlaceId", -1384138147);
        setField(term217643, term217643.getClass(), "lastPlaceName", "kUQFEfdpcf");
        setIntField(term217643, term217643.getClass(), "lastAllNetId", -421652245);
        setIntField(term217643, term217643.getClass(), "lastRegionId", 1322177151);
        setField(term217643, term217643.getClass(), "lastRegionName", "pbLlqwRbUg");
        setField(term217643, term217643.getClass(), "lastClientId", "roIhjmdeCK");
        setField(term217643, term217643.getClass(), "lastCountryCode", "IhjFAWGhyk");
        setIntField(term217643, term217643.getClass(), "lastSelectEMoney", 233940754);
        setIntField(term217643, term217643.getClass(), "lastSelectTicket", 193794265);
        setIntField(term217643, term217643.getClass(), "lastSelectCourse", 851696638);
        setIntField(term217643, term217643.getClass(), "lastCountCourse", 101083079);
        setField(term217643, term217643.getClass(), "firstGameId", "oGIzSnBUVR");
        setField(term217643, term217643.getClass(), "firstRomVersion", "xQBxAvtLQu");
        setField(term217643, term217643.getClass(), "firstDataVersion", "rjtJdFXCBi");
        setField(term217643, term217643.getClass(), "firstPlayDate", "LTKFwrAcxc");
        setField(term217643, term217643.getClass(), "compatibleCmVersion", "iqFGevKgJk");
        setField(term217643, term217643.getClass(), "dailyBonusDate", "yPhusfJmEO");
        setField(term217643, term217643.getClass(), "dailyCourseBonusDate", "pOzKISGwzB");
        setField(term217643, term217643.getClass(), "lastPairLoginDate", "UubhrFCOkC");
        setField(term217643, term217643.getClass(), "lastTrialPlayDate", "uzcAjyxlMe");
        setIntField(term217643, term217643.getClass(), "playVsCount", -389509495);
        setIntField(term217643, term217643.getClass(), "playSyncCount", 1355682915);
        setIntField(term217643, term217643.getClass(), "winCount", -143860949);
        setIntField(term217643, term217643.getClass(), "helpCount", -199507260);
        setIntField(term217643, term217643.getClass(), "comboCount", 279510269);
        setLongField(term217643, term217643.getClass(), "totalDeluxscore", 6600517470617673840L);
        setLongField(term217643, term217643.getClass(), "totalBasicDeluxscore", -8113170645249933687L);
        setLongField(term217643, term217643.getClass(), "totalAdvancedDeluxscore", 5838639850524113941L);
        setLongField(term217643, term217643.getClass(), "totalExpertDeluxscore", 5355929630915463748L);
        setLongField(term217643, term217643.getClass(), "totalMasterDeluxscore", -5315531364455719448L);
        setLongField(term217643, term217643.getClass(), "totalReMasterDeluxscore", -4658138664140766892L);
        setIntField(term217643, term217643.getClass(), "totalSync", 1637234291);
        setIntField(term217643, term217643.getClass(), "totalBasicSync", -653743992);
        setIntField(term217643, term217643.getClass(), "totalAdvancedSync", 202545148);
        setIntField(term217643, term217643.getClass(), "totalExpertSync", 1455433906);
        setIntField(term217643, term217643.getClass(), "totalMasterSync", -503364604);
        setIntField(term217643, term217643.getClass(), "totalReMasterSync", -940394359);
        setLongField(term217643, term217643.getClass(), "totalAchievement", -6205506425338335293L);
        setLongField(term217643, term217643.getClass(), "totalBasicAchievement", -4332323893295849314L);
        setLongField(term217643, term217643.getClass(), "totalAdvancedAchievement", -8454521075131051178L);
        setLongField(term217643, term217643.getClass(), "totalExpertAchievement", 454285570562556096L);
        setLongField(term217643, term217643.getClass(), "totalMasterAchievement", 7366210029539026180L);
        setLongField(term217643, term217643.getClass(), "totalReMasterAchievement", 2462299976129637789L);
        setLongField(term217643, term217643.getClass(), "playerOldRating", 7987458655093426442L);
        setLongField(term217643, term217643.getClass(), "playerNewRating", 493465833808425496L);
        setIntField(term217643, term217643.getClass(), "banState", 1125467468);
        setLongField(term217643, term217643.getClass(), "dateTime", 8360361375556347622L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectCourse", argTypes, term217643, args);
    }

};


