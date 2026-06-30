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

public class UserDetail_setGradeRating_143799832088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4279470;
     Object term4279827;

    public UserDetail_setGradeRating_143799832088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4279474 = new Long(7156880244966092433L);
        Integer term4279537 = new Integer(1737709990);
        Integer term4279539 = new Integer(-1596985572);
        Integer term4279541 = new Integer(-1547597017);
        Integer term4279543 = new Integer(-1899999573);
        Integer term4279545 = new Integer(50986188);
        Integer term4279547 = new Integer(-1798385983);
        Integer term4279549 = new Integer(-1751426385);
        Integer term4279551 = new Integer(-2043903065);
        ArrayList term4279535 = new ArrayList();
        ((ArrayList) term4279535).add(term4279537);
        ((ArrayList) term4279535).add(term4279539);
        ((ArrayList) term4279535).add(term4279541);
        ((ArrayList) term4279535).add(term4279543);
        ((ArrayList) term4279535).add(term4279545);
        ((ArrayList) term4279535).add(term4279547);
        ((ArrayList) term4279535).add(term4279549);
        ((ArrayList) term4279535).add(term4279551);
        Integer term4279557 = new Integer(-1301683464);
        ArrayList term4279555 = new ArrayList();
        ((ArrayList) term4279555).add(term4279557);
        term4279470 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4279472 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4279488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4279489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4279493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4279498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4279499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4279503 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4279470, term4279470.getClass(), "id", -2255504587358420105L);
        setLongField(term4279472, term4279472.getClass(), "id", -2325612604708997856L);
        setField(term4279472, term4279472.getClass(), "extId", term4279474);
        setField(term4279472, term4279472.getClass(), "luid", "caJSHWdNpy");
        setIntField(term4279489, term4279489.getClass(), "year", 2022);
        setShortField(term4279489, term4279489.getClass(), "month", (short) 7);
        setShortField(term4279489, term4279489.getClass(), "day", (short) 8);
        setField(term4279488, term4279488.getClass(), "date", term4279489);
        setByteField(term4279493, term4279493.getClass(), "hour", (byte) 6);
        setByteField(term4279493, term4279493.getClass(), "minute", (byte) 32);
        setByteField(term4279493, term4279493.getClass(), "second", (byte) 45);
        setIntField(term4279493, term4279493.getClass(), "nano", 265909269);
        setField(term4279488, term4279488.getClass(), "time", term4279493);
        setField(term4279472, term4279472.getClass(), "registerTime", term4279488);
        setIntField(term4279499, term4279499.getClass(), "year", 2020);
        setShortField(term4279499, term4279499.getClass(), "month", (short) 2);
        setShortField(term4279499, term4279499.getClass(), "day", (short) 10);
        setField(term4279498, term4279498.getClass(), "date", term4279499);
        setByteField(term4279503, term4279503.getClass(), "hour", (byte) 12);
        setByteField(term4279503, term4279503.getClass(), "minute", (byte) 54);
        setByteField(term4279503, term4279503.getClass(), "second", (byte) 39);
        setIntField(term4279503, term4279503.getClass(), "nano", 149492247);
        setField(term4279498, term4279498.getClass(), "time", term4279503);
        setField(term4279472, term4279472.getClass(), "accessTime", term4279498);
        setField(term4279470, term4279470.getClass(), "card", term4279472);
        setField(term4279470, term4279470.getClass(), "userName", "hdmmvgVTAf");
        setIntField(term4279470, term4279470.getClass(), "isNetMember", 1997618534);
        setIntField(term4279470, term4279470.getClass(), "iconId", -78072241);
        setIntField(term4279470, term4279470.getClass(), "plateId", -626218010);
        setIntField(term4279470, term4279470.getClass(), "titleId", -270483388);
        setIntField(term4279470, term4279470.getClass(), "partnerId", -293383512);
        setIntField(term4279470, term4279470.getClass(), "frameId", -1074968972);
        setIntField(term4279470, term4279470.getClass(), "selectMapId", -126890368);
        setIntField(term4279470, term4279470.getClass(), "totalAwake", 1082406233);
        setIntField(term4279470, term4279470.getClass(), "gradeRating", 1794120872);
        setIntField(term4279470, term4279470.getClass(), "musicRating", 2086079619);
        setIntField(term4279470, term4279470.getClass(), "playerRating", 479089631);
        setIntField(term4279470, term4279470.getClass(), "highestRating", -87234683);
        setIntField(term4279470, term4279470.getClass(), "gradeRank", -1538543770);
        setIntField(term4279470, term4279470.getClass(), "classRank", 2013628853);
        setIntField(term4279470, term4279470.getClass(), "courseRank", -476972728);
        setField(term4279470, term4279470.getClass(), "charaSlot", term4279535);
        setField(term4279470, term4279470.getClass(), "charaLockSlot", term4279555);
        setLongField(term4279470, term4279470.getClass(), "contentBit", -8082673295969209385L);
        setIntField(term4279470, term4279470.getClass(), "playCount", -570781189);
        setField(term4279470, term4279470.getClass(), "eventWatchedDate", "IyOLAZHlHI");
        setField(term4279470, term4279470.getClass(), "lastGameId", "jaOCIpADkk");
        setField(term4279470, term4279470.getClass(), "lastRomVersion", "iuNGYYQzWU");
        setField(term4279470, term4279470.getClass(), "lastDataVersion", "HqcyKZHqNX");
        setField(term4279470, term4279470.getClass(), "lastLoginDate", "CGhaoZIhQz");
        setField(term4279470, term4279470.getClass(), "lastPlayDate", "jPXKDehLzM");
        setIntField(term4279470, term4279470.getClass(), "lastPlayCredit", -1956977777);
        setIntField(term4279470, term4279470.getClass(), "lastPlayMode", -328208062);
        setIntField(term4279470, term4279470.getClass(), "lastPlaceId", -735327147);
        setField(term4279470, term4279470.getClass(), "lastPlaceName", "diiwrkhGYq");
        setIntField(term4279470, term4279470.getClass(), "lastAllNetId", 190895435);
        setIntField(term4279470, term4279470.getClass(), "lastRegionId", 12439258);
        setField(term4279470, term4279470.getClass(), "lastRegionName", "MNpPOaVPSZ");
        setField(term4279470, term4279470.getClass(), "lastClientId", "NQqXVPnDpP");
        setField(term4279470, term4279470.getClass(), "lastCountryCode", "szlpQgfXNn");
        setIntField(term4279470, term4279470.getClass(), "lastSelectEMoney", 283394799);
        setIntField(term4279470, term4279470.getClass(), "lastSelectTicket", 1353937912);
        setIntField(term4279470, term4279470.getClass(), "lastSelectCourse", -52238825);
        setIntField(term4279470, term4279470.getClass(), "lastCountCourse", 209641140);
        setField(term4279470, term4279470.getClass(), "firstGameId", "IcHumzWNtg");
        setField(term4279470, term4279470.getClass(), "firstRomVersion", "eWAgZJzMfO");
        setField(term4279470, term4279470.getClass(), "firstDataVersion", "LnFRaRSCKd");
        setField(term4279470, term4279470.getClass(), "firstPlayDate", "AyFJEHUNyJ");
        setField(term4279470, term4279470.getClass(), "compatibleCmVersion", "EFHTtLojGZ");
        setField(term4279470, term4279470.getClass(), "dailyBonusDate", "pGtFLsRHYI");
        setField(term4279470, term4279470.getClass(), "dailyCourseBonusDate", "CcZJeXkbaa");
        setField(term4279470, term4279470.getClass(), "lastPairLoginDate", "cFrwqVkrMD");
        setField(term4279470, term4279470.getClass(), "lastTrialPlayDate", "pGRrFTTBNq");
        setIntField(term4279470, term4279470.getClass(), "playVsCount", 462748395);
        setIntField(term4279470, term4279470.getClass(), "playSyncCount", 1164150207);
        setIntField(term4279470, term4279470.getClass(), "winCount", 2079257357);
        setIntField(term4279470, term4279470.getClass(), "helpCount", 2040953118);
        setIntField(term4279470, term4279470.getClass(), "comboCount", 741436123);
        setLongField(term4279470, term4279470.getClass(), "totalDeluxscore", 6538542752473313783L);
        setLongField(term4279470, term4279470.getClass(), "totalBasicDeluxscore", -5060052102799192802L);
        setLongField(term4279470, term4279470.getClass(), "totalAdvancedDeluxscore", 7254291278346242551L);
        setLongField(term4279470, term4279470.getClass(), "totalExpertDeluxscore", -4785791423276123601L);
        setLongField(term4279470, term4279470.getClass(), "totalMasterDeluxscore", -1835492564663384266L);
        setLongField(term4279470, term4279470.getClass(), "totalReMasterDeluxscore", 7219413532726329533L);
        setIntField(term4279470, term4279470.getClass(), "totalSync", 1638886233);
        setIntField(term4279470, term4279470.getClass(), "totalBasicSync", 1156937232);
        setIntField(term4279470, term4279470.getClass(), "totalAdvancedSync", -1762834474);
        setIntField(term4279470, term4279470.getClass(), "totalExpertSync", 75632691);
        setIntField(term4279470, term4279470.getClass(), "totalMasterSync", -1781293992);
        setIntField(term4279470, term4279470.getClass(), "totalReMasterSync", 1248322744);
        setLongField(term4279470, term4279470.getClass(), "totalAchievement", 7120541559996754962L);
        setLongField(term4279470, term4279470.getClass(), "totalBasicAchievement", 5959993719557650889L);
        setLongField(term4279470, term4279470.getClass(), "totalAdvancedAchievement", -5348575983132112559L);
        setLongField(term4279470, term4279470.getClass(), "totalExpertAchievement", -8480946319242162584L);
        setLongField(term4279470, term4279470.getClass(), "totalMasterAchievement", 3523262489572840074L);
        setLongField(term4279470, term4279470.getClass(), "totalReMasterAchievement", -7353730094093714230L);
        setLongField(term4279470, term4279470.getClass(), "playerOldRating", 8818134128642774210L);
        setLongField(term4279470, term4279470.getClass(), "playerNewRating", 1876813421089466743L);
        setIntField(term4279470, term4279470.getClass(), "banState", -760901196);
        setLongField(term4279470, term4279470.getClass(), "dateTime", -5830754626337000615L);
        term4279827 = new Integer(826506183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4279827;
        callMethod(klass, "setGradeRating", argTypes, term4279470, args);
    }

};


