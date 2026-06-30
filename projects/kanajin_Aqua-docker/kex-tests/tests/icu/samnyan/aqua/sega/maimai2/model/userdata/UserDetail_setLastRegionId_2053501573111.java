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

public class UserDetail_setLastRegionId_2053501573111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258127;
     Object term258492;

    public UserDetail_setLastRegionId_2053501573111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258131 = new Long(8171709541116491249L);
        Integer term258194 = new Integer(2061882718);
        Integer term258196 = new Integer(-263593334);
        Integer term258198 = new Integer(257595375);
        Integer term258200 = new Integer(1494109106);
        Integer term258202 = new Integer(1902576230);
        Integer term258204 = new Integer(-1040460528);
        Integer term258206 = new Integer(990725836);
        Integer term258208 = new Integer(-1231785501);
        Integer term258210 = new Integer(-2112346885);
        ArrayList term258192 = new ArrayList();
        ((ArrayList) term258192).add(term258194);
        ((ArrayList) term258192).add(term258196);
        ((ArrayList) term258192).add(term258198);
        ((ArrayList) term258192).add(term258200);
        ((ArrayList) term258192).add(term258202);
        ((ArrayList) term258192).add(term258204);
        ((ArrayList) term258192).add(term258206);
        ((ArrayList) term258192).add(term258208);
        ((ArrayList) term258192).add(term258210);
        Integer term258216 = new Integer(-26311618);
        Integer term258218 = new Integer(-671595545);
        Integer term258220 = new Integer(-143541686);
        Integer term258222 = new Integer(-1201234880);
        ArrayList term258214 = new ArrayList();
        ((ArrayList) term258214).add(term258216);
        ((ArrayList) term258214).add(term258218);
        ((ArrayList) term258214).add(term258220);
        ((ArrayList) term258214).add(term258222);
        term258127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term258129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term258145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term258127, term258127.getClass(), "id", 1671807886415084360L);
        setLongField(term258129, term258129.getClass(), "id", 7135350412377163285L);
        setField(term258129, term258129.getClass(), "extId", term258131);
        setField(term258129, term258129.getClass(), "luid", "DMJMXIbDkU");
        setIntField(term258146, term258146.getClass(), "year", 2019);
        setShortField(term258146, term258146.getClass(), "month", (short) 1);
        setShortField(term258146, term258146.getClass(), "day", (short) 9);
        setField(term258145, term258145.getClass(), "date", term258146);
        setByteField(term258150, term258150.getClass(), "hour", (byte) 16);
        setByteField(term258150, term258150.getClass(), "minute", (byte) 39);
        setByteField(term258150, term258150.getClass(), "second", (byte) 1);
        setIntField(term258150, term258150.getClass(), "nano", 715938448);
        setField(term258145, term258145.getClass(), "time", term258150);
        setField(term258129, term258129.getClass(), "registerTime", term258145);
        setIntField(term258156, term258156.getClass(), "year", 2014);
        setShortField(term258156, term258156.getClass(), "month", (short) 8);
        setShortField(term258156, term258156.getClass(), "day", (short) 3);
        setField(term258155, term258155.getClass(), "date", term258156);
        setByteField(term258160, term258160.getClass(), "hour", (byte) 5);
        setByteField(term258160, term258160.getClass(), "minute", (byte) 41);
        setByteField(term258160, term258160.getClass(), "second", (byte) 29);
        setIntField(term258160, term258160.getClass(), "nano", 782499753);
        setField(term258155, term258155.getClass(), "time", term258160);
        setField(term258129, term258129.getClass(), "accessTime", term258155);
        setField(term258127, term258127.getClass(), "card", term258129);
        setField(term258127, term258127.getClass(), "userName", "kmMUYIoNgE");
        setIntField(term258127, term258127.getClass(), "isNetMember", 79302757);
        setIntField(term258127, term258127.getClass(), "iconId", -1070423794);
        setIntField(term258127, term258127.getClass(), "plateId", -1340282394);
        setIntField(term258127, term258127.getClass(), "titleId", 1626755839);
        setIntField(term258127, term258127.getClass(), "partnerId", -1483961873);
        setIntField(term258127, term258127.getClass(), "frameId", 1774470970);
        setIntField(term258127, term258127.getClass(), "selectMapId", -289561561);
        setIntField(term258127, term258127.getClass(), "totalAwake", -1540317966);
        setIntField(term258127, term258127.getClass(), "gradeRating", 1957621898);
        setIntField(term258127, term258127.getClass(), "musicRating", -2085629066);
        setIntField(term258127, term258127.getClass(), "playerRating", 332635381);
        setIntField(term258127, term258127.getClass(), "highestRating", 1402888541);
        setIntField(term258127, term258127.getClass(), "gradeRank", -77095792);
        setIntField(term258127, term258127.getClass(), "classRank", -2079226958);
        setIntField(term258127, term258127.getClass(), "courseRank", -386074);
        setField(term258127, term258127.getClass(), "charaSlot", term258192);
        setField(term258127, term258127.getClass(), "charaLockSlot", term258214);
        setLongField(term258127, term258127.getClass(), "contentBit", 2969654130198816423L);
        setIntField(term258127, term258127.getClass(), "playCount", 1447028198);
        setField(term258127, term258127.getClass(), "eventWatchedDate", "PfONuRjuSj");
        setField(term258127, term258127.getClass(), "lastGameId", "BxmcTjXInn");
        setField(term258127, term258127.getClass(), "lastRomVersion", "aVPQtBXJuy");
        setField(term258127, term258127.getClass(), "lastDataVersion", "SWtqfxdgNg");
        setField(term258127, term258127.getClass(), "lastLoginDate", "jsgrwgnbEn");
        setField(term258127, term258127.getClass(), "lastPlayDate", "vwbyoYQzvo");
        setIntField(term258127, term258127.getClass(), "lastPlayCredit", -1208205597);
        setIntField(term258127, term258127.getClass(), "lastPlayMode", 2055857288);
        setIntField(term258127, term258127.getClass(), "lastPlaceId", 1498740255);
        setField(term258127, term258127.getClass(), "lastPlaceName", "RtAsTvbELo");
        setIntField(term258127, term258127.getClass(), "lastAllNetId", 904155166);
        setIntField(term258127, term258127.getClass(), "lastRegionId", 72629006);
        setField(term258127, term258127.getClass(), "lastRegionName", "reFozIJLZz");
        setField(term258127, term258127.getClass(), "lastClientId", "oGDahLAYSF");
        setField(term258127, term258127.getClass(), "lastCountryCode", "RNRZKctZBC");
        setIntField(term258127, term258127.getClass(), "lastSelectEMoney", -1282766194);
        setIntField(term258127, term258127.getClass(), "lastSelectTicket", -1288900838);
        setIntField(term258127, term258127.getClass(), "lastSelectCourse", -1470172938);
        setIntField(term258127, term258127.getClass(), "lastCountCourse", -1939603541);
        setField(term258127, term258127.getClass(), "firstGameId", "OzqbIrAqJB");
        setField(term258127, term258127.getClass(), "firstRomVersion", "oHBNAywdjX");
        setField(term258127, term258127.getClass(), "firstDataVersion", "LtXEvmsGft");
        setField(term258127, term258127.getClass(), "firstPlayDate", "lQlNRkcQRY");
        setField(term258127, term258127.getClass(), "compatibleCmVersion", "tGFJhbkqHf");
        setField(term258127, term258127.getClass(), "dailyBonusDate", "IPPRLZGZBn");
        setField(term258127, term258127.getClass(), "dailyCourseBonusDate", "FvDAlgSUBA");
        setField(term258127, term258127.getClass(), "lastPairLoginDate", "RSpTPOOWxv");
        setField(term258127, term258127.getClass(), "lastTrialPlayDate", "mJAIaSwRTZ");
        setIntField(term258127, term258127.getClass(), "playVsCount", -274428693);
        setIntField(term258127, term258127.getClass(), "playSyncCount", -185933400);
        setIntField(term258127, term258127.getClass(), "winCount", 1459704689);
        setIntField(term258127, term258127.getClass(), "helpCount", -1941241597);
        setIntField(term258127, term258127.getClass(), "comboCount", 212571436);
        setLongField(term258127, term258127.getClass(), "totalDeluxscore", -55611212919132109L);
        setLongField(term258127, term258127.getClass(), "totalBasicDeluxscore", -3078465440430457200L);
        setLongField(term258127, term258127.getClass(), "totalAdvancedDeluxscore", -7793802183944986028L);
        setLongField(term258127, term258127.getClass(), "totalExpertDeluxscore", 4403582979821443154L);
        setLongField(term258127, term258127.getClass(), "totalMasterDeluxscore", -6563732025124365180L);
        setLongField(term258127, term258127.getClass(), "totalReMasterDeluxscore", -6795133593107599770L);
        setIntField(term258127, term258127.getClass(), "totalSync", 1303246137);
        setIntField(term258127, term258127.getClass(), "totalBasicSync", -1675951461);
        setIntField(term258127, term258127.getClass(), "totalAdvancedSync", 1619278331);
        setIntField(term258127, term258127.getClass(), "totalExpertSync", -2007394216);
        setIntField(term258127, term258127.getClass(), "totalMasterSync", -491166885);
        setIntField(term258127, term258127.getClass(), "totalReMasterSync", -186959175);
        setLongField(term258127, term258127.getClass(), "totalAchievement", 8284339812748291398L);
        setLongField(term258127, term258127.getClass(), "totalBasicAchievement", -4387471817415385828L);
        setLongField(term258127, term258127.getClass(), "totalAdvancedAchievement", 5999270362369063133L);
        setLongField(term258127, term258127.getClass(), "totalExpertAchievement", 3987579827432293750L);
        setLongField(term258127, term258127.getClass(), "totalMasterAchievement", 1334427035204317383L);
        setLongField(term258127, term258127.getClass(), "totalReMasterAchievement", 540796568180111955L);
        setLongField(term258127, term258127.getClass(), "playerOldRating", 8163233080480350089L);
        setLongField(term258127, term258127.getClass(), "playerNewRating", -5290437739278197809L);
        setIntField(term258127, term258127.getClass(), "banState", 1008949037);
        setLongField(term258127, term258127.getClass(), "dateTime", 8358592158040845490L);
        term258492 = new Integer(172789057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258492;
        callMethod(klass, "setLastRegionId", argTypes, term258127, args);
    }

};


