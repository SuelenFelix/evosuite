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

public class UserDetail_setBanState_1855912414153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282197;
     Object term282552;

    public UserDetail_setBanState_1855912414153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term282201 = new Long(-4477377284889705897L);
        Integer term282264 = new Integer(2091263178);
        Integer term282266 = new Integer(-1726739412);
        ArrayList term282262 = new ArrayList();
        ((ArrayList) term282262).add(term282264);
        ((ArrayList) term282262).add(term282266);
        Integer term282272 = new Integer(-910985376);
        Integer term282274 = new Integer(1260410174);
        Integer term282276 = new Integer(-1557704101);
        Integer term282278 = new Integer(-764615686);
        Integer term282280 = new Integer(-762034217);
        Integer term282282 = new Integer(481600552);
        ArrayList term282270 = new ArrayList();
        ((ArrayList) term282270).add(term282272);
        ((ArrayList) term282270).add(term282274);
        ((ArrayList) term282270).add(term282276);
        ((ArrayList) term282270).add(term282278);
        ((ArrayList) term282270).add(term282280);
        ((ArrayList) term282270).add(term282282);
        term282197 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term282199 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282230 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282197, term282197.getClass(), "id", 3044272234438088379L);
        setLongField(term282199, term282199.getClass(), "id", 6009078016784364018L);
        setField(term282199, term282199.getClass(), "extId", term282201);
        setField(term282199, term282199.getClass(), "luid", "IprMmbNdgK");
        setIntField(term282216, term282216.getClass(), "year", 2017);
        setShortField(term282216, term282216.getClass(), "month", (short) 7);
        setShortField(term282216, term282216.getClass(), "day", (short) 7);
        setField(term282215, term282215.getClass(), "date", term282216);
        setByteField(term282220, term282220.getClass(), "hour", (byte) 12);
        setByteField(term282220, term282220.getClass(), "minute", (byte) 29);
        setByteField(term282220, term282220.getClass(), "second", (byte) 38);
        setIntField(term282220, term282220.getClass(), "nano", 396071426);
        setField(term282215, term282215.getClass(), "time", term282220);
        setField(term282199, term282199.getClass(), "registerTime", term282215);
        setIntField(term282226, term282226.getClass(), "year", 2025);
        setShortField(term282226, term282226.getClass(), "month", (short) 12);
        setShortField(term282226, term282226.getClass(), "day", (short) 4);
        setField(term282225, term282225.getClass(), "date", term282226);
        setByteField(term282230, term282230.getClass(), "hour", (byte) 20);
        setByteField(term282230, term282230.getClass(), "minute", (byte) 48);
        setByteField(term282230, term282230.getClass(), "second", (byte) 37);
        setIntField(term282230, term282230.getClass(), "nano", 178948777);
        setField(term282225, term282225.getClass(), "time", term282230);
        setField(term282199, term282199.getClass(), "accessTime", term282225);
        setField(term282197, term282197.getClass(), "card", term282199);
        setField(term282197, term282197.getClass(), "userName", "UQNUJZpRUb");
        setIntField(term282197, term282197.getClass(), "isNetMember", 1296207972);
        setIntField(term282197, term282197.getClass(), "iconId", -1765363772);
        setIntField(term282197, term282197.getClass(), "plateId", -1800573269);
        setIntField(term282197, term282197.getClass(), "titleId", 843136842);
        setIntField(term282197, term282197.getClass(), "partnerId", -536389141);
        setIntField(term282197, term282197.getClass(), "frameId", 1439863682);
        setIntField(term282197, term282197.getClass(), "selectMapId", 837914754);
        setIntField(term282197, term282197.getClass(), "totalAwake", 182357886);
        setIntField(term282197, term282197.getClass(), "gradeRating", -100647034);
        setIntField(term282197, term282197.getClass(), "musicRating", 1940859649);
        setIntField(term282197, term282197.getClass(), "playerRating", 15211378);
        setIntField(term282197, term282197.getClass(), "highestRating", -60335940);
        setIntField(term282197, term282197.getClass(), "gradeRank", -1627060708);
        setIntField(term282197, term282197.getClass(), "classRank", -733101104);
        setIntField(term282197, term282197.getClass(), "courseRank", -179610883);
        setField(term282197, term282197.getClass(), "charaSlot", term282262);
        setField(term282197, term282197.getClass(), "charaLockSlot", term282270);
        setLongField(term282197, term282197.getClass(), "contentBit", 4972113992156000769L);
        setIntField(term282197, term282197.getClass(), "playCount", -1083733353);
        setField(term282197, term282197.getClass(), "eventWatchedDate", "CBlktFOQda");
        setField(term282197, term282197.getClass(), "lastGameId", "PCPVxMQysm");
        setField(term282197, term282197.getClass(), "lastRomVersion", "UKPyzDygDu");
        setField(term282197, term282197.getClass(), "lastDataVersion", "UiqcXrizus");
        setField(term282197, term282197.getClass(), "lastLoginDate", "MCZFJMkSTm");
        setField(term282197, term282197.getClass(), "lastPlayDate", "GVgfhrsULv");
        setIntField(term282197, term282197.getClass(), "lastPlayCredit", -422100154);
        setIntField(term282197, term282197.getClass(), "lastPlayMode", 1638326283);
        setIntField(term282197, term282197.getClass(), "lastPlaceId", 2130384239);
        setField(term282197, term282197.getClass(), "lastPlaceName", "GBfsuXbEmK");
        setIntField(term282197, term282197.getClass(), "lastAllNetId", 1789203008);
        setIntField(term282197, term282197.getClass(), "lastRegionId", -1942237169);
        setField(term282197, term282197.getClass(), "lastRegionName", "WSPSzlqJoy");
        setField(term282197, term282197.getClass(), "lastClientId", "grQbHXIHXs");
        setField(term282197, term282197.getClass(), "lastCountryCode", "luyQmnpgIR");
        setIntField(term282197, term282197.getClass(), "lastSelectEMoney", -1688458291);
        setIntField(term282197, term282197.getClass(), "lastSelectTicket", 325600836);
        setIntField(term282197, term282197.getClass(), "lastSelectCourse", 1269042968);
        setIntField(term282197, term282197.getClass(), "lastCountCourse", -1259199493);
        setField(term282197, term282197.getClass(), "firstGameId", "TDWpnOunaa");
        setField(term282197, term282197.getClass(), "firstRomVersion", "yoiqhkzkiu");
        setField(term282197, term282197.getClass(), "firstDataVersion", "BRgMLVjNzh");
        setField(term282197, term282197.getClass(), "firstPlayDate", "LqmtuqLGpS");
        setField(term282197, term282197.getClass(), "compatibleCmVersion", "sJIrCinDLf");
        setField(term282197, term282197.getClass(), "dailyBonusDate", "WohVHpctDb");
        setField(term282197, term282197.getClass(), "dailyCourseBonusDate", "BGfsLiPDgD");
        setField(term282197, term282197.getClass(), "lastPairLoginDate", "yLaQUBjMnt");
        setField(term282197, term282197.getClass(), "lastTrialPlayDate", "mkcRXETGnk");
        setIntField(term282197, term282197.getClass(), "playVsCount", 1451218402);
        setIntField(term282197, term282197.getClass(), "playSyncCount", -854091061);
        setIntField(term282197, term282197.getClass(), "winCount", 744569990);
        setIntField(term282197, term282197.getClass(), "helpCount", -2070422454);
        setIntField(term282197, term282197.getClass(), "comboCount", 1588346817);
        setLongField(term282197, term282197.getClass(), "totalDeluxscore", 4149752054808240311L);
        setLongField(term282197, term282197.getClass(), "totalBasicDeluxscore", 7198419662339263621L);
        setLongField(term282197, term282197.getClass(), "totalAdvancedDeluxscore", -3017573583471672736L);
        setLongField(term282197, term282197.getClass(), "totalExpertDeluxscore", -8991381588155051743L);
        setLongField(term282197, term282197.getClass(), "totalMasterDeluxscore", -1218586761232712494L);
        setLongField(term282197, term282197.getClass(), "totalReMasterDeluxscore", -5971634973934407035L);
        setIntField(term282197, term282197.getClass(), "totalSync", 398234886);
        setIntField(term282197, term282197.getClass(), "totalBasicSync", -563567351);
        setIntField(term282197, term282197.getClass(), "totalAdvancedSync", 682029949);
        setIntField(term282197, term282197.getClass(), "totalExpertSync", -1663944520);
        setIntField(term282197, term282197.getClass(), "totalMasterSync", 724138196);
        setIntField(term282197, term282197.getClass(), "totalReMasterSync", -147066224);
        setLongField(term282197, term282197.getClass(), "totalAchievement", 1070943823649743278L);
        setLongField(term282197, term282197.getClass(), "totalBasicAchievement", -6136931277593399788L);
        setLongField(term282197, term282197.getClass(), "totalAdvancedAchievement", 8682837824236094931L);
        setLongField(term282197, term282197.getClass(), "totalExpertAchievement", 8929296583350720779L);
        setLongField(term282197, term282197.getClass(), "totalMasterAchievement", 472782731829447975L);
        setLongField(term282197, term282197.getClass(), "totalReMasterAchievement", 3801241906839739368L);
        setLongField(term282197, term282197.getClass(), "playerOldRating", 1123018877288279703L);
        setLongField(term282197, term282197.getClass(), "playerNewRating", -406667177783640055L);
        setIntField(term282197, term282197.getClass(), "banState", -509514471);
        setLongField(term282197, term282197.getClass(), "dateTime", 1267172445594907739L);
        term282552 = new Integer(-1949091735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term282552;
        callMethod(klass, "setBanState", argTypes, term282197, args);
    }

};


