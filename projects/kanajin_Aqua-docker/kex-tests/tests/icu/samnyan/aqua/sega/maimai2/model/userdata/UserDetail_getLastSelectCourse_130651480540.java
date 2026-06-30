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

public class UserDetail_getLastSelectCourse_130651480540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217698;

    public UserDetail_getLastSelectCourse_130651480540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217702 = new Long(6895382576300001141L);
        Integer term217765 = new Integer(2120008602);
        ArrayList term217763 = new ArrayList();
        ((ArrayList) term217763).add(term217765);
        Integer term217771 = new Integer(1085966764);
        Integer term217773 = new Integer(-609882960);
        Integer term217775 = new Integer(-1690283734);
        Integer term217777 = new Integer(-1620783951);
        Integer term217779 = new Integer(1400387811);
        Integer term217781 = new Integer(903826116);
        Integer term217783 = new Integer(641366348);
        Integer term217785 = new Integer(-353276989);
        Integer term217787 = new Integer(-505563323);
        ArrayList term217769 = new ArrayList();
        ((ArrayList) term217769).add(term217771);
        ((ArrayList) term217769).add(term217773);
        ((ArrayList) term217769).add(term217775);
        ((ArrayList) term217769).add(term217777);
        ((ArrayList) term217769).add(term217779);
        ((ArrayList) term217769).add(term217781);
        ((ArrayList) term217769).add(term217783);
        ((ArrayList) term217769).add(term217785);
        ((ArrayList) term217769).add(term217787);
        term217698 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term217700 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217731 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217698, term217698.getClass(), "id", -5451630668638977834L);
        setLongField(term217700, term217700.getClass(), "id", 3816575703649188940L);
        setField(term217700, term217700.getClass(), "extId", term217702);
        setField(term217700, term217700.getClass(), "luid", "IDxgeSVtht");
        setIntField(term217717, term217717.getClass(), "year", 2014);
        setShortField(term217717, term217717.getClass(), "month", (short) 9);
        setShortField(term217717, term217717.getClass(), "day", (short) 26);
        setField(term217716, term217716.getClass(), "date", term217717);
        setByteField(term217721, term217721.getClass(), "hour", (byte) 5);
        setByteField(term217721, term217721.getClass(), "minute", (byte) 40);
        setByteField(term217721, term217721.getClass(), "second", (byte) 6);
        setIntField(term217721, term217721.getClass(), "nano", 923937756);
        setField(term217716, term217716.getClass(), "time", term217721);
        setField(term217700, term217700.getClass(), "registerTime", term217716);
        setIntField(term217727, term217727.getClass(), "year", 2023);
        setShortField(term217727, term217727.getClass(), "month", (short) 8);
        setShortField(term217727, term217727.getClass(), "day", (short) 18);
        setField(term217726, term217726.getClass(), "date", term217727);
        setByteField(term217731, term217731.getClass(), "hour", (byte) 14);
        setByteField(term217731, term217731.getClass(), "minute", (byte) 2);
        setByteField(term217731, term217731.getClass(), "second", (byte) 54);
        setIntField(term217731, term217731.getClass(), "nano", 97633516);
        setField(term217726, term217726.getClass(), "time", term217731);
        setField(term217700, term217700.getClass(), "accessTime", term217726);
        setField(term217698, term217698.getClass(), "card", term217700);
        setField(term217698, term217698.getClass(), "userName", "fEgDyAlFot");
        setIntField(term217698, term217698.getClass(), "isNetMember", -357230273);
        setIntField(term217698, term217698.getClass(), "iconId", -537888142);
        setIntField(term217698, term217698.getClass(), "plateId", -1600863169);
        setIntField(term217698, term217698.getClass(), "titleId", -151268707);
        setIntField(term217698, term217698.getClass(), "partnerId", 687322930);
        setIntField(term217698, term217698.getClass(), "frameId", -1091459660);
        setIntField(term217698, term217698.getClass(), "selectMapId", -729567674);
        setIntField(term217698, term217698.getClass(), "totalAwake", -1285026670);
        setIntField(term217698, term217698.getClass(), "gradeRating", -1081713412);
        setIntField(term217698, term217698.getClass(), "musicRating", -698893307);
        setIntField(term217698, term217698.getClass(), "playerRating", -198530739);
        setIntField(term217698, term217698.getClass(), "highestRating", -820225259);
        setIntField(term217698, term217698.getClass(), "gradeRank", -1310113307);
        setIntField(term217698, term217698.getClass(), "classRank", 1548923560);
        setIntField(term217698, term217698.getClass(), "courseRank", -624904888);
        setField(term217698, term217698.getClass(), "charaSlot", term217763);
        setField(term217698, term217698.getClass(), "charaLockSlot", term217769);
        setLongField(term217698, term217698.getClass(), "contentBit", -8364829941856463433L);
        setIntField(term217698, term217698.getClass(), "playCount", -2104329060);
        setField(term217698, term217698.getClass(), "eventWatchedDate", "bLIDBOCeeG");
        setField(term217698, term217698.getClass(), "lastGameId", "YEaYKAoFqS");
        setField(term217698, term217698.getClass(), "lastRomVersion", "zFPvOGZrLO");
        setField(term217698, term217698.getClass(), "lastDataVersion", "mfbnfWlLlE");
        setField(term217698, term217698.getClass(), "lastLoginDate", "BsfZWxmVYU");
        setField(term217698, term217698.getClass(), "lastPlayDate", "IQqvmZgDVk");
        setIntField(term217698, term217698.getClass(), "lastPlayCredit", 69884134);
        setIntField(term217698, term217698.getClass(), "lastPlayMode", 1238870233);
        setIntField(term217698, term217698.getClass(), "lastPlaceId", -1384138147);
        setField(term217698, term217698.getClass(), "lastPlaceName", "kUQFEfdpcf");
        setIntField(term217698, term217698.getClass(), "lastAllNetId", -421652245);
        setIntField(term217698, term217698.getClass(), "lastRegionId", 1322177151);
        setField(term217698, term217698.getClass(), "lastRegionName", "pbLlqwRbUg");
        setField(term217698, term217698.getClass(), "lastClientId", "roIhjmdeCK");
        setField(term217698, term217698.getClass(), "lastCountryCode", "IhjFAWGhyk");
        setIntField(term217698, term217698.getClass(), "lastSelectEMoney", 233940754);
        setIntField(term217698, term217698.getClass(), "lastSelectTicket", 193794265);
        setIntField(term217698, term217698.getClass(), "lastSelectCourse", 851696638);
        setIntField(term217698, term217698.getClass(), "lastCountCourse", 101083079);
        setField(term217698, term217698.getClass(), "firstGameId", "oGIzSnBUVR");
        setField(term217698, term217698.getClass(), "firstRomVersion", "xQBxAvtLQu");
        setField(term217698, term217698.getClass(), "firstDataVersion", "rjtJdFXCBi");
        setField(term217698, term217698.getClass(), "firstPlayDate", "LTKFwrAcxc");
        setField(term217698, term217698.getClass(), "compatibleCmVersion", "iqFGevKgJk");
        setField(term217698, term217698.getClass(), "dailyBonusDate", "yPhusfJmEO");
        setField(term217698, term217698.getClass(), "dailyCourseBonusDate", "pOzKISGwzB");
        setField(term217698, term217698.getClass(), "lastPairLoginDate", "UubhrFCOkC");
        setField(term217698, term217698.getClass(), "lastTrialPlayDate", "uzcAjyxlMe");
        setIntField(term217698, term217698.getClass(), "playVsCount", -389509495);
        setIntField(term217698, term217698.getClass(), "playSyncCount", 1355682915);
        setIntField(term217698, term217698.getClass(), "winCount", -143860949);
        setIntField(term217698, term217698.getClass(), "helpCount", -199507260);
        setIntField(term217698, term217698.getClass(), "comboCount", 279510269);
        setLongField(term217698, term217698.getClass(), "totalDeluxscore", 6600517470617673840L);
        setLongField(term217698, term217698.getClass(), "totalBasicDeluxscore", -8113170645249933687L);
        setLongField(term217698, term217698.getClass(), "totalAdvancedDeluxscore", 5838639850524113941L);
        setLongField(term217698, term217698.getClass(), "totalExpertDeluxscore", 5355929630915463748L);
        setLongField(term217698, term217698.getClass(), "totalMasterDeluxscore", -5315531364455719448L);
        setLongField(term217698, term217698.getClass(), "totalReMasterDeluxscore", -4658138664140766892L);
        setIntField(term217698, term217698.getClass(), "totalSync", 1637234291);
        setIntField(term217698, term217698.getClass(), "totalBasicSync", -653743992);
        setIntField(term217698, term217698.getClass(), "totalAdvancedSync", 202545148);
        setIntField(term217698, term217698.getClass(), "totalExpertSync", 1455433906);
        setIntField(term217698, term217698.getClass(), "totalMasterSync", -503364604);
        setIntField(term217698, term217698.getClass(), "totalReMasterSync", -940394359);
        setLongField(term217698, term217698.getClass(), "totalAchievement", -6205506425338335293L);
        setLongField(term217698, term217698.getClass(), "totalBasicAchievement", -4332323893295849314L);
        setLongField(term217698, term217698.getClass(), "totalAdvancedAchievement", -8454521075131051178L);
        setLongField(term217698, term217698.getClass(), "totalExpertAchievement", 454285570562556096L);
        setLongField(term217698, term217698.getClass(), "totalMasterAchievement", 7366210029539026180L);
        setLongField(term217698, term217698.getClass(), "totalReMasterAchievement", 2462299976129637789L);
        setLongField(term217698, term217698.getClass(), "playerOldRating", 7987458655093426442L);
        setLongField(term217698, term217698.getClass(), "playerNewRating", 493465833808425496L);
        setIntField(term217698, term217698.getClass(), "banState", 1125467468);
        setLongField(term217698, term217698.getClass(), "dateTime", 8360361375556347622L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectCourse", argTypes, term217698, args);
    }

};


