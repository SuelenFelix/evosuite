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

public class UserDetail_setLastRegionId_2053501573110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258072;
     Object term258437;

    public UserDetail_setLastRegionId_2053501573110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258076 = new Long(8171709541116491249L);
        Integer term258139 = new Integer(2061882718);
        Integer term258141 = new Integer(-263593334);
        Integer term258143 = new Integer(257595375);
        Integer term258145 = new Integer(1494109106);
        Integer term258147 = new Integer(1902576230);
        Integer term258149 = new Integer(-1040460528);
        Integer term258151 = new Integer(990725836);
        Integer term258153 = new Integer(-1231785501);
        Integer term258155 = new Integer(-2112346885);
        ArrayList term258137 = new ArrayList();
        ((ArrayList) term258137).add(term258139);
        ((ArrayList) term258137).add(term258141);
        ((ArrayList) term258137).add(term258143);
        ((ArrayList) term258137).add(term258145);
        ((ArrayList) term258137).add(term258147);
        ((ArrayList) term258137).add(term258149);
        ((ArrayList) term258137).add(term258151);
        ((ArrayList) term258137).add(term258153);
        ((ArrayList) term258137).add(term258155);
        Integer term258161 = new Integer(-26311618);
        Integer term258163 = new Integer(-671595545);
        Integer term258165 = new Integer(-143541686);
        Integer term258167 = new Integer(-1201234880);
        ArrayList term258159 = new ArrayList();
        ((ArrayList) term258159).add(term258161);
        ((ArrayList) term258159).add(term258163);
        ((ArrayList) term258159).add(term258165);
        ((ArrayList) term258159).add(term258167);
        term258072 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term258074 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term258090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258095 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258105 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term258072, term258072.getClass(), "id", 1671807886415084360L);
        setLongField(term258074, term258074.getClass(), "id", 7135350412377163285L);
        setField(term258074, term258074.getClass(), "extId", term258076);
        setField(term258074, term258074.getClass(), "luid", "DMJMXIbDkU");
        setIntField(term258091, term258091.getClass(), "year", 2019);
        setShortField(term258091, term258091.getClass(), "month", (short) 1);
        setShortField(term258091, term258091.getClass(), "day", (short) 9);
        setField(term258090, term258090.getClass(), "date", term258091);
        setByteField(term258095, term258095.getClass(), "hour", (byte) 16);
        setByteField(term258095, term258095.getClass(), "minute", (byte) 39);
        setByteField(term258095, term258095.getClass(), "second", (byte) 1);
        setIntField(term258095, term258095.getClass(), "nano", 715938448);
        setField(term258090, term258090.getClass(), "time", term258095);
        setField(term258074, term258074.getClass(), "registerTime", term258090);
        setIntField(term258101, term258101.getClass(), "year", 2014);
        setShortField(term258101, term258101.getClass(), "month", (short) 8);
        setShortField(term258101, term258101.getClass(), "day", (short) 3);
        setField(term258100, term258100.getClass(), "date", term258101);
        setByteField(term258105, term258105.getClass(), "hour", (byte) 5);
        setByteField(term258105, term258105.getClass(), "minute", (byte) 41);
        setByteField(term258105, term258105.getClass(), "second", (byte) 29);
        setIntField(term258105, term258105.getClass(), "nano", 782499753);
        setField(term258100, term258100.getClass(), "time", term258105);
        setField(term258074, term258074.getClass(), "accessTime", term258100);
        setField(term258072, term258072.getClass(), "card", term258074);
        setField(term258072, term258072.getClass(), "userName", "kmMUYIoNgE");
        setIntField(term258072, term258072.getClass(), "isNetMember", 79302757);
        setIntField(term258072, term258072.getClass(), "iconId", -1070423794);
        setIntField(term258072, term258072.getClass(), "plateId", -1340282394);
        setIntField(term258072, term258072.getClass(), "titleId", 1626755839);
        setIntField(term258072, term258072.getClass(), "partnerId", -1483961873);
        setIntField(term258072, term258072.getClass(), "frameId", 1774470970);
        setIntField(term258072, term258072.getClass(), "selectMapId", -289561561);
        setIntField(term258072, term258072.getClass(), "totalAwake", -1540317966);
        setIntField(term258072, term258072.getClass(), "gradeRating", 1957621898);
        setIntField(term258072, term258072.getClass(), "musicRating", -2085629066);
        setIntField(term258072, term258072.getClass(), "playerRating", 332635381);
        setIntField(term258072, term258072.getClass(), "highestRating", 1402888541);
        setIntField(term258072, term258072.getClass(), "gradeRank", -77095792);
        setIntField(term258072, term258072.getClass(), "classRank", -2079226958);
        setIntField(term258072, term258072.getClass(), "courseRank", -386074);
        setField(term258072, term258072.getClass(), "charaSlot", term258137);
        setField(term258072, term258072.getClass(), "charaLockSlot", term258159);
        setLongField(term258072, term258072.getClass(), "contentBit", 2969654130198816423L);
        setIntField(term258072, term258072.getClass(), "playCount", 1447028198);
        setField(term258072, term258072.getClass(), "eventWatchedDate", "PfONuRjuSj");
        setField(term258072, term258072.getClass(), "lastGameId", "BxmcTjXInn");
        setField(term258072, term258072.getClass(), "lastRomVersion", "aVPQtBXJuy");
        setField(term258072, term258072.getClass(), "lastDataVersion", "SWtqfxdgNg");
        setField(term258072, term258072.getClass(), "lastLoginDate", "jsgrwgnbEn");
        setField(term258072, term258072.getClass(), "lastPlayDate", "vwbyoYQzvo");
        setIntField(term258072, term258072.getClass(), "lastPlayCredit", -1208205597);
        setIntField(term258072, term258072.getClass(), "lastPlayMode", 2055857288);
        setIntField(term258072, term258072.getClass(), "lastPlaceId", 1498740255);
        setField(term258072, term258072.getClass(), "lastPlaceName", "RtAsTvbELo");
        setIntField(term258072, term258072.getClass(), "lastAllNetId", 904155166);
        setIntField(term258072, term258072.getClass(), "lastRegionId", 72629006);
        setField(term258072, term258072.getClass(), "lastRegionName", "reFozIJLZz");
        setField(term258072, term258072.getClass(), "lastClientId", "oGDahLAYSF");
        setField(term258072, term258072.getClass(), "lastCountryCode", "RNRZKctZBC");
        setIntField(term258072, term258072.getClass(), "lastSelectEMoney", -1282766194);
        setIntField(term258072, term258072.getClass(), "lastSelectTicket", -1288900838);
        setIntField(term258072, term258072.getClass(), "lastSelectCourse", -1470172938);
        setIntField(term258072, term258072.getClass(), "lastCountCourse", -1939603541);
        setField(term258072, term258072.getClass(), "firstGameId", "OzqbIrAqJB");
        setField(term258072, term258072.getClass(), "firstRomVersion", "oHBNAywdjX");
        setField(term258072, term258072.getClass(), "firstDataVersion", "LtXEvmsGft");
        setField(term258072, term258072.getClass(), "firstPlayDate", "lQlNRkcQRY");
        setField(term258072, term258072.getClass(), "compatibleCmVersion", "tGFJhbkqHf");
        setField(term258072, term258072.getClass(), "dailyBonusDate", "IPPRLZGZBn");
        setField(term258072, term258072.getClass(), "dailyCourseBonusDate", "FvDAlgSUBA");
        setField(term258072, term258072.getClass(), "lastPairLoginDate", "RSpTPOOWxv");
        setField(term258072, term258072.getClass(), "lastTrialPlayDate", "mJAIaSwRTZ");
        setIntField(term258072, term258072.getClass(), "playVsCount", -274428693);
        setIntField(term258072, term258072.getClass(), "playSyncCount", -185933400);
        setIntField(term258072, term258072.getClass(), "winCount", 1459704689);
        setIntField(term258072, term258072.getClass(), "helpCount", -1941241597);
        setIntField(term258072, term258072.getClass(), "comboCount", 212571436);
        setLongField(term258072, term258072.getClass(), "totalDeluxscore", -55611212919132109L);
        setLongField(term258072, term258072.getClass(), "totalBasicDeluxscore", -3078465440430457200L);
        setLongField(term258072, term258072.getClass(), "totalAdvancedDeluxscore", -7793802183944986028L);
        setLongField(term258072, term258072.getClass(), "totalExpertDeluxscore", 4403582979821443154L);
        setLongField(term258072, term258072.getClass(), "totalMasterDeluxscore", -6563732025124365180L);
        setLongField(term258072, term258072.getClass(), "totalReMasterDeluxscore", -6795133593107599770L);
        setIntField(term258072, term258072.getClass(), "totalSync", 1303246137);
        setIntField(term258072, term258072.getClass(), "totalBasicSync", -1675951461);
        setIntField(term258072, term258072.getClass(), "totalAdvancedSync", 1619278331);
        setIntField(term258072, term258072.getClass(), "totalExpertSync", -2007394216);
        setIntField(term258072, term258072.getClass(), "totalMasterSync", -491166885);
        setIntField(term258072, term258072.getClass(), "totalReMasterSync", -186959175);
        setLongField(term258072, term258072.getClass(), "totalAchievement", 8284339812748291398L);
        setLongField(term258072, term258072.getClass(), "totalBasicAchievement", -4387471817415385828L);
        setLongField(term258072, term258072.getClass(), "totalAdvancedAchievement", 5999270362369063133L);
        setLongField(term258072, term258072.getClass(), "totalExpertAchievement", 3987579827432293750L);
        setLongField(term258072, term258072.getClass(), "totalMasterAchievement", 1334427035204317383L);
        setLongField(term258072, term258072.getClass(), "totalReMasterAchievement", 540796568180111955L);
        setLongField(term258072, term258072.getClass(), "playerOldRating", 8163233080480350089L);
        setLongField(term258072, term258072.getClass(), "playerNewRating", -5290437739278197809L);
        setIntField(term258072, term258072.getClass(), "banState", 1008949037);
        setLongField(term258072, term258072.getClass(), "dateTime", 8358592158040845490L);
        term258437 = new Integer(172789057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258437;
        callMethod(klass, "setLastRegionId", argTypes, term258072, args);
    }

};


