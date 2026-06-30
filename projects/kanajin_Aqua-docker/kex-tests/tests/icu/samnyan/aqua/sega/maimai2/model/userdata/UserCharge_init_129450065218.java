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
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCharge_init_129450065218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131456;
     Object term131458;
     Object term131815;
     Object term131817;

    public UserCharge_init_129450065218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131456 = new Long(8169580960659211736L);
        Long term131462 = new Long(-8338004844694486146L);
        Integer term131525 = new Integer(-1408615666);
        Integer term131527 = new Integer(-502299598);
        Integer term131529 = new Integer(-516287593);
        Integer term131531 = new Integer(-187311406);
        ArrayList term131523 = new ArrayList();
        ((ArrayList) term131523).add(term131525);
        ((ArrayList) term131523).add(term131527);
        ((ArrayList) term131523).add(term131529);
        ((ArrayList) term131523).add(term131531);
        Integer term131537 = new Integer(1496632406);
        Integer term131539 = new Integer(1858277277);
        Integer term131541 = new Integer(2145928130);
        Integer term131543 = new Integer(-1095947031);
        Integer term131545 = new Integer(1504187156);
        ArrayList term131535 = new ArrayList();
        ((ArrayList) term131535).add(term131537);
        ((ArrayList) term131535).add(term131539);
        ((ArrayList) term131535).add(term131541);
        ((ArrayList) term131535).add(term131543);
        ((ArrayList) term131535).add(term131545);
        term131458 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term131460 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131458, term131458.getClass(), "id", -5551356079533519971L);
        setLongField(term131460, term131460.getClass(), "id", 6144678288643819644L);
        setField(term131460, term131460.getClass(), "extId", term131462);
        setField(term131460, term131460.getClass(), "luid", "HtiqQJqDeX");
        setIntField(term131477, term131477.getClass(), "year", 2018);
        setShortField(term131477, term131477.getClass(), "month", (short) 12);
        setShortField(term131477, term131477.getClass(), "day", (short) 9);
        setField(term131476, term131476.getClass(), "date", term131477);
        setByteField(term131481, term131481.getClass(), "hour", (byte) 11);
        setByteField(term131481, term131481.getClass(), "minute", (byte) 17);
        setByteField(term131481, term131481.getClass(), "second", (byte) 16);
        setIntField(term131481, term131481.getClass(), "nano", 832353222);
        setField(term131476, term131476.getClass(), "time", term131481);
        setField(term131460, term131460.getClass(), "registerTime", term131476);
        setIntField(term131487, term131487.getClass(), "year", 2022);
        setShortField(term131487, term131487.getClass(), "month", (short) 10);
        setShortField(term131487, term131487.getClass(), "day", (short) 18);
        setField(term131486, term131486.getClass(), "date", term131487);
        setByteField(term131491, term131491.getClass(), "hour", (byte) 21);
        setByteField(term131491, term131491.getClass(), "minute", (byte) 51);
        setByteField(term131491, term131491.getClass(), "second", (byte) 0);
        setIntField(term131491, term131491.getClass(), "nano", 906699884);
        setField(term131486, term131486.getClass(), "time", term131491);
        setField(term131460, term131460.getClass(), "accessTime", term131486);
        setField(term131458, term131458.getClass(), "card", term131460);
        setField(term131458, term131458.getClass(), "userName", "tqDmiYDfPG");
        setIntField(term131458, term131458.getClass(), "isNetMember", -220352077);
        setIntField(term131458, term131458.getClass(), "iconId", -248969650);
        setIntField(term131458, term131458.getClass(), "plateId", 33246852);
        setIntField(term131458, term131458.getClass(), "titleId", 1051049624);
        setIntField(term131458, term131458.getClass(), "partnerId", 23316800);
        setIntField(term131458, term131458.getClass(), "frameId", 1501200024);
        setIntField(term131458, term131458.getClass(), "selectMapId", 813083025);
        setIntField(term131458, term131458.getClass(), "totalAwake", 1439986578);
        setIntField(term131458, term131458.getClass(), "gradeRating", -1393477237);
        setIntField(term131458, term131458.getClass(), "musicRating", 1806901617);
        setIntField(term131458, term131458.getClass(), "playerRating", -1060700711);
        setIntField(term131458, term131458.getClass(), "highestRating", 1281979005);
        setIntField(term131458, term131458.getClass(), "gradeRank", -1535572179);
        setIntField(term131458, term131458.getClass(), "classRank", -1210680742);
        setIntField(term131458, term131458.getClass(), "courseRank", -2024761841);
        setField(term131458, term131458.getClass(), "charaSlot", term131523);
        setField(term131458, term131458.getClass(), "charaLockSlot", term131535);
        setLongField(term131458, term131458.getClass(), "contentBit", -8132258096950512306L);
        setIntField(term131458, term131458.getClass(), "playCount", 517435996);
        setField(term131458, term131458.getClass(), "eventWatchedDate", "NIFTrWKaFV");
        setField(term131458, term131458.getClass(), "lastGameId", "fczMoiWIlg");
        setField(term131458, term131458.getClass(), "lastRomVersion", "FLDFVNZCaf");
        setField(term131458, term131458.getClass(), "lastDataVersion", "RatdSkwnHJ");
        setField(term131458, term131458.getClass(), "lastLoginDate", "oseqzeIHdW");
        setField(term131458, term131458.getClass(), "lastPlayDate", "ByJOYpCmFi");
        setIntField(term131458, term131458.getClass(), "lastPlayCredit", 997085806);
        setIntField(term131458, term131458.getClass(), "lastPlayMode", -1890633633);
        setIntField(term131458, term131458.getClass(), "lastPlaceId", 556792495);
        setField(term131458, term131458.getClass(), "lastPlaceName", "PdnAkNWoHq");
        setIntField(term131458, term131458.getClass(), "lastAllNetId", 1635397327);
        setIntField(term131458, term131458.getClass(), "lastRegionId", -1407747575);
        setField(term131458, term131458.getClass(), "lastRegionName", "lQITAtdMxP");
        setField(term131458, term131458.getClass(), "lastClientId", "OXJdVKkuub");
        setField(term131458, term131458.getClass(), "lastCountryCode", "uMRcoxIazP");
        setIntField(term131458, term131458.getClass(), "lastSelectEMoney", -129952888);
        setIntField(term131458, term131458.getClass(), "lastSelectTicket", 1093590118);
        setIntField(term131458, term131458.getClass(), "lastSelectCourse", -610005848);
        setIntField(term131458, term131458.getClass(), "lastCountCourse", 1856644657);
        setField(term131458, term131458.getClass(), "firstGameId", "JskWlUhLMp");
        setField(term131458, term131458.getClass(), "firstRomVersion", "IxZRiNpvbq");
        setField(term131458, term131458.getClass(), "firstDataVersion", "ImAEcQhwQN");
        setField(term131458, term131458.getClass(), "firstPlayDate", "bBtEXrbQOO");
        setField(term131458, term131458.getClass(), "compatibleCmVersion", "WZsnWyKyyP");
        setField(term131458, term131458.getClass(), "dailyBonusDate", "UmOVAGRRWa");
        setField(term131458, term131458.getClass(), "dailyCourseBonusDate", "TmxjPyLcFT");
        setField(term131458, term131458.getClass(), "lastPairLoginDate", "BgvFipVgjI");
        setField(term131458, term131458.getClass(), "lastTrialPlayDate", "jwrtzwtiwQ");
        setIntField(term131458, term131458.getClass(), "playVsCount", -1777396332);
        setIntField(term131458, term131458.getClass(), "playSyncCount", 1949483184);
        setIntField(term131458, term131458.getClass(), "winCount", -116853826);
        setIntField(term131458, term131458.getClass(), "helpCount", 720273368);
        setIntField(term131458, term131458.getClass(), "comboCount", 439433705);
        setLongField(term131458, term131458.getClass(), "totalDeluxscore", -8619557135959868474L);
        setLongField(term131458, term131458.getClass(), "totalBasicDeluxscore", -6530707478457931445L);
        setLongField(term131458, term131458.getClass(), "totalAdvancedDeluxscore", 2688818424894417724L);
        setLongField(term131458, term131458.getClass(), "totalExpertDeluxscore", 1307629924223046806L);
        setLongField(term131458, term131458.getClass(), "totalMasterDeluxscore", -7754415683690581232L);
        setLongField(term131458, term131458.getClass(), "totalReMasterDeluxscore", 7524357305395972651L);
        setIntField(term131458, term131458.getClass(), "totalSync", 651646147);
        setIntField(term131458, term131458.getClass(), "totalBasicSync", -182685183);
        setIntField(term131458, term131458.getClass(), "totalAdvancedSync", 1900550190);
        setIntField(term131458, term131458.getClass(), "totalExpertSync", -223373115);
        setIntField(term131458, term131458.getClass(), "totalMasterSync", -2069853525);
        setIntField(term131458, term131458.getClass(), "totalReMasterSync", -20546610);
        setLongField(term131458, term131458.getClass(), "totalAchievement", -6203733697011665719L);
        setLongField(term131458, term131458.getClass(), "totalBasicAchievement", 4013144018451677763L);
        setLongField(term131458, term131458.getClass(), "totalAdvancedAchievement", -6089031270216011230L);
        setLongField(term131458, term131458.getClass(), "totalExpertAchievement", -3960813943739315753L);
        setLongField(term131458, term131458.getClass(), "totalMasterAchievement", 2440185930201362993L);
        setLongField(term131458, term131458.getClass(), "totalReMasterAchievement", -6790748395430140318L);
        setLongField(term131458, term131458.getClass(), "playerOldRating", 8769881600538318027L);
        setLongField(term131458, term131458.getClass(), "playerNewRating", 3133103815143371243L);
        setIntField(term131458, term131458.getClass(), "banState", 2028422247);
        setLongField(term131458, term131458.getClass(), "dateTime", -1199652862106814426L);
        term131815 = new Integer(776507834);
        term131817 = new Integer(-1588665163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term131456;
        args[1] = term131458;
        args[2] = term131815;
        args[3] = term131817;
        args[4] = "HyjgdbYLEd";
        args[5] = "ZNYPPLOMix";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


