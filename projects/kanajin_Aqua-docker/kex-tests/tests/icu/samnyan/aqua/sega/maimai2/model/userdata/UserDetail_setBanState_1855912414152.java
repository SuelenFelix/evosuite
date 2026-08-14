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

public class UserDetail_setBanState_1855912414152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282142;
     Object term282497;

    public UserDetail_setBanState_1855912414152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term282146 = new Long(-4477377284889705897L);
        Integer term282209 = new Integer(2091263178);
        Integer term282211 = new Integer(-1726739412);
        ArrayList term282207 = new ArrayList();
        ((ArrayList) term282207).add(term282209);
        ((ArrayList) term282207).add(term282211);
        Integer term282217 = new Integer(-910985376);
        Integer term282219 = new Integer(1260410174);
        Integer term282221 = new Integer(-1557704101);
        Integer term282223 = new Integer(-764615686);
        Integer term282225 = new Integer(-762034217);
        Integer term282227 = new Integer(481600552);
        ArrayList term282215 = new ArrayList();
        ((ArrayList) term282215).add(term282217);
        ((ArrayList) term282215).add(term282219);
        ((ArrayList) term282215).add(term282221);
        ((ArrayList) term282215).add(term282223);
        ((ArrayList) term282215).add(term282225);
        ((ArrayList) term282215).add(term282227);
        term282142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term282144 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282142, term282142.getClass(), "id", 3044272234438088379L);
        setLongField(term282144, term282144.getClass(), "id", 6009078016784364018L);
        setField(term282144, term282144.getClass(), "extId", term282146);
        setField(term282144, term282144.getClass(), "luid", "IprMmbNdgK");
        setIntField(term282161, term282161.getClass(), "year", 2017);
        setShortField(term282161, term282161.getClass(), "month", (short) 7);
        setShortField(term282161, term282161.getClass(), "day", (short) 7);
        setField(term282160, term282160.getClass(), "date", term282161);
        setByteField(term282165, term282165.getClass(), "hour", (byte) 12);
        setByteField(term282165, term282165.getClass(), "minute", (byte) 29);
        setByteField(term282165, term282165.getClass(), "second", (byte) 38);
        setIntField(term282165, term282165.getClass(), "nano", 396071426);
        setField(term282160, term282160.getClass(), "time", term282165);
        setField(term282144, term282144.getClass(), "registerTime", term282160);
        setIntField(term282171, term282171.getClass(), "year", 2025);
        setShortField(term282171, term282171.getClass(), "month", (short) 12);
        setShortField(term282171, term282171.getClass(), "day", (short) 4);
        setField(term282170, term282170.getClass(), "date", term282171);
        setByteField(term282175, term282175.getClass(), "hour", (byte) 20);
        setByteField(term282175, term282175.getClass(), "minute", (byte) 48);
        setByteField(term282175, term282175.getClass(), "second", (byte) 37);
        setIntField(term282175, term282175.getClass(), "nano", 178948777);
        setField(term282170, term282170.getClass(), "time", term282175);
        setField(term282144, term282144.getClass(), "accessTime", term282170);
        setField(term282142, term282142.getClass(), "card", term282144);
        setField(term282142, term282142.getClass(), "userName", "UQNUJZpRUb");
        setIntField(term282142, term282142.getClass(), "isNetMember", 1296207972);
        setIntField(term282142, term282142.getClass(), "iconId", -1765363772);
        setIntField(term282142, term282142.getClass(), "plateId", -1800573269);
        setIntField(term282142, term282142.getClass(), "titleId", 843136842);
        setIntField(term282142, term282142.getClass(), "partnerId", -536389141);
        setIntField(term282142, term282142.getClass(), "frameId", 1439863682);
        setIntField(term282142, term282142.getClass(), "selectMapId", 837914754);
        setIntField(term282142, term282142.getClass(), "totalAwake", 182357886);
        setIntField(term282142, term282142.getClass(), "gradeRating", -100647034);
        setIntField(term282142, term282142.getClass(), "musicRating", 1940859649);
        setIntField(term282142, term282142.getClass(), "playerRating", 15211378);
        setIntField(term282142, term282142.getClass(), "highestRating", -60335940);
        setIntField(term282142, term282142.getClass(), "gradeRank", -1627060708);
        setIntField(term282142, term282142.getClass(), "classRank", -733101104);
        setIntField(term282142, term282142.getClass(), "courseRank", -179610883);
        setField(term282142, term282142.getClass(), "charaSlot", term282207);
        setField(term282142, term282142.getClass(), "charaLockSlot", term282215);
        setLongField(term282142, term282142.getClass(), "contentBit", 4972113992156000769L);
        setIntField(term282142, term282142.getClass(), "playCount", -1083733353);
        setField(term282142, term282142.getClass(), "eventWatchedDate", "CBlktFOQda");
        setField(term282142, term282142.getClass(), "lastGameId", "PCPVxMQysm");
        setField(term282142, term282142.getClass(), "lastRomVersion", "UKPyzDygDu");
        setField(term282142, term282142.getClass(), "lastDataVersion", "UiqcXrizus");
        setField(term282142, term282142.getClass(), "lastLoginDate", "MCZFJMkSTm");
        setField(term282142, term282142.getClass(), "lastPlayDate", "GVgfhrsULv");
        setIntField(term282142, term282142.getClass(), "lastPlayCredit", -422100154);
        setIntField(term282142, term282142.getClass(), "lastPlayMode", 1638326283);
        setIntField(term282142, term282142.getClass(), "lastPlaceId", 2130384239);
        setField(term282142, term282142.getClass(), "lastPlaceName", "GBfsuXbEmK");
        setIntField(term282142, term282142.getClass(), "lastAllNetId", 1789203008);
        setIntField(term282142, term282142.getClass(), "lastRegionId", -1942237169);
        setField(term282142, term282142.getClass(), "lastRegionName", "WSPSzlqJoy");
        setField(term282142, term282142.getClass(), "lastClientId", "grQbHXIHXs");
        setField(term282142, term282142.getClass(), "lastCountryCode", "luyQmnpgIR");
        setIntField(term282142, term282142.getClass(), "lastSelectEMoney", -1688458291);
        setIntField(term282142, term282142.getClass(), "lastSelectTicket", 325600836);
        setIntField(term282142, term282142.getClass(), "lastSelectCourse", 1269042968);
        setIntField(term282142, term282142.getClass(), "lastCountCourse", -1259199493);
        setField(term282142, term282142.getClass(), "firstGameId", "TDWpnOunaa");
        setField(term282142, term282142.getClass(), "firstRomVersion", "yoiqhkzkiu");
        setField(term282142, term282142.getClass(), "firstDataVersion", "BRgMLVjNzh");
        setField(term282142, term282142.getClass(), "firstPlayDate", "LqmtuqLGpS");
        setField(term282142, term282142.getClass(), "compatibleCmVersion", "sJIrCinDLf");
        setField(term282142, term282142.getClass(), "dailyBonusDate", "WohVHpctDb");
        setField(term282142, term282142.getClass(), "dailyCourseBonusDate", "BGfsLiPDgD");
        setField(term282142, term282142.getClass(), "lastPairLoginDate", "yLaQUBjMnt");
        setField(term282142, term282142.getClass(), "lastTrialPlayDate", "mkcRXETGnk");
        setIntField(term282142, term282142.getClass(), "playVsCount", 1451218402);
        setIntField(term282142, term282142.getClass(), "playSyncCount", -854091061);
        setIntField(term282142, term282142.getClass(), "winCount", 744569990);
        setIntField(term282142, term282142.getClass(), "helpCount", -2070422454);
        setIntField(term282142, term282142.getClass(), "comboCount", 1588346817);
        setLongField(term282142, term282142.getClass(), "totalDeluxscore", 4149752054808240311L);
        setLongField(term282142, term282142.getClass(), "totalBasicDeluxscore", 7198419662339263621L);
        setLongField(term282142, term282142.getClass(), "totalAdvancedDeluxscore", -3017573583471672736L);
        setLongField(term282142, term282142.getClass(), "totalExpertDeluxscore", -8991381588155051743L);
        setLongField(term282142, term282142.getClass(), "totalMasterDeluxscore", -1218586761232712494L);
        setLongField(term282142, term282142.getClass(), "totalReMasterDeluxscore", -5971634973934407035L);
        setIntField(term282142, term282142.getClass(), "totalSync", 398234886);
        setIntField(term282142, term282142.getClass(), "totalBasicSync", -563567351);
        setIntField(term282142, term282142.getClass(), "totalAdvancedSync", 682029949);
        setIntField(term282142, term282142.getClass(), "totalExpertSync", -1663944520);
        setIntField(term282142, term282142.getClass(), "totalMasterSync", 724138196);
        setIntField(term282142, term282142.getClass(), "totalReMasterSync", -147066224);
        setLongField(term282142, term282142.getClass(), "totalAchievement", 1070943823649743278L);
        setLongField(term282142, term282142.getClass(), "totalBasicAchievement", -6136931277593399788L);
        setLongField(term282142, term282142.getClass(), "totalAdvancedAchievement", 8682837824236094931L);
        setLongField(term282142, term282142.getClass(), "totalExpertAchievement", 8929296583350720779L);
        setLongField(term282142, term282142.getClass(), "totalMasterAchievement", 472782731829447975L);
        setLongField(term282142, term282142.getClass(), "totalReMasterAchievement", 3801241906839739368L);
        setLongField(term282142, term282142.getClass(), "playerOldRating", 1123018877288279703L);
        setLongField(term282142, term282142.getClass(), "playerNewRating", -406667177783640055L);
        setIntField(term282142, term282142.getClass(), "banState", -509514471);
        setLongField(term282142, term282142.getClass(), "dateTime", 1267172445594907739L);
        term282497 = new Integer(-1949091735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term282497;
        callMethod(klass, "setBanState", argTypes, term282142, args);
    }

};


