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

public class UserCharacter_equals_199591224613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192575;
     Object term192926;

    public UserCharacter_equals_199591224613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term192581 = new Long(-2195061939206930224L);
        Integer term192644 = new Integer(1361925101);
        ArrayList term192642 = new ArrayList();
        ((ArrayList) term192642).add(term192644);
        Integer term192650 = new Integer(-1702583840);
        Integer term192652 = new Integer(-1496594860);
        ArrayList term192648 = new ArrayList();
        ((ArrayList) term192648).add(term192650);
        ((ArrayList) term192648).add(term192652);
        term192575 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term192577 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term192579 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term192595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term192605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192610 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term192575, term192575.getClass(), "id", -1817118062205258940L);
        setLongField(term192577, term192577.getClass(), "id", 5152881384985879922L);
        setLongField(term192579, term192579.getClass(), "id", 6842453043778777728L);
        setField(term192579, term192579.getClass(), "extId", term192581);
        setField(term192579, term192579.getClass(), "luid", "MdFuelPZIq");
        setIntField(term192596, term192596.getClass(), "year", 2025);
        setShortField(term192596, term192596.getClass(), "month", (short) 10);
        setShortField(term192596, term192596.getClass(), "day", (short) 12);
        setField(term192595, term192595.getClass(), "date", term192596);
        setByteField(term192600, term192600.getClass(), "hour", (byte) 0);
        setByteField(term192600, term192600.getClass(), "minute", (byte) 58);
        setByteField(term192600, term192600.getClass(), "second", (byte) 44);
        setIntField(term192600, term192600.getClass(), "nano", 42807662);
        setField(term192595, term192595.getClass(), "time", term192600);
        setField(term192579, term192579.getClass(), "registerTime", term192595);
        setIntField(term192606, term192606.getClass(), "year", 2026);
        setShortField(term192606, term192606.getClass(), "month", (short) 3);
        setShortField(term192606, term192606.getClass(), "day", (short) 23);
        setField(term192605, term192605.getClass(), "date", term192606);
        setByteField(term192610, term192610.getClass(), "hour", (byte) 21);
        setByteField(term192610, term192610.getClass(), "minute", (byte) 25);
        setByteField(term192610, term192610.getClass(), "second", (byte) 41);
        setIntField(term192610, term192610.getClass(), "nano", 714890677);
        setField(term192605, term192605.getClass(), "time", term192610);
        setField(term192579, term192579.getClass(), "accessTime", term192605);
        setField(term192577, term192577.getClass(), "card", term192579);
        setField(term192577, term192577.getClass(), "userName", "ixzZuaWsYL");
        setIntField(term192577, term192577.getClass(), "isNetMember", 1406186846);
        setIntField(term192577, term192577.getClass(), "iconId", -709701767);
        setIntField(term192577, term192577.getClass(), "plateId", 1445634110);
        setIntField(term192577, term192577.getClass(), "titleId", 430916113);
        setIntField(term192577, term192577.getClass(), "partnerId", -62605968);
        setIntField(term192577, term192577.getClass(), "frameId", 743020447);
        setIntField(term192577, term192577.getClass(), "selectMapId", -227812702);
        setIntField(term192577, term192577.getClass(), "totalAwake", -1688725575);
        setIntField(term192577, term192577.getClass(), "gradeRating", -821504884);
        setIntField(term192577, term192577.getClass(), "musicRating", 628485113);
        setIntField(term192577, term192577.getClass(), "playerRating", 1121498523);
        setIntField(term192577, term192577.getClass(), "highestRating", 571250476);
        setIntField(term192577, term192577.getClass(), "gradeRank", 850454258);
        setIntField(term192577, term192577.getClass(), "classRank", -1170623459);
        setIntField(term192577, term192577.getClass(), "courseRank", 1449993114);
        setField(term192577, term192577.getClass(), "charaSlot", term192642);
        setField(term192577, term192577.getClass(), "charaLockSlot", term192648);
        setLongField(term192577, term192577.getClass(), "contentBit", -910417449802075841L);
        setIntField(term192577, term192577.getClass(), "playCount", -734393320);
        setField(term192577, term192577.getClass(), "eventWatchedDate", "CUkbIipVrl");
        setField(term192577, term192577.getClass(), "lastGameId", "xbQLgvzCPz");
        setField(term192577, term192577.getClass(), "lastRomVersion", "XHGONyJIOI");
        setField(term192577, term192577.getClass(), "lastDataVersion", "EgnNSamGhM");
        setField(term192577, term192577.getClass(), "lastLoginDate", "IjhiBHnJgI");
        setField(term192577, term192577.getClass(), "lastPlayDate", "QxAHzfZVve");
        setIntField(term192577, term192577.getClass(), "lastPlayCredit", -345557283);
        setIntField(term192577, term192577.getClass(), "lastPlayMode", 156448167);
        setIntField(term192577, term192577.getClass(), "lastPlaceId", -1594914286);
        setField(term192577, term192577.getClass(), "lastPlaceName", "xoqSauYvkW");
        setIntField(term192577, term192577.getClass(), "lastAllNetId", -1101748725);
        setIntField(term192577, term192577.getClass(), "lastRegionId", 1729452900);
        setField(term192577, term192577.getClass(), "lastRegionName", "cErqWEXoNv");
        setField(term192577, term192577.getClass(), "lastClientId", "lxTtgYEUNY");
        setField(term192577, term192577.getClass(), "lastCountryCode", "UgDLKYCyKA");
        setIntField(term192577, term192577.getClass(), "lastSelectEMoney", 1494418561);
        setIntField(term192577, term192577.getClass(), "lastSelectTicket", 1872045675);
        setIntField(term192577, term192577.getClass(), "lastSelectCourse", -663114662);
        setIntField(term192577, term192577.getClass(), "lastCountCourse", 1816340610);
        setField(term192577, term192577.getClass(), "firstGameId", "DepyVBcXry");
        setField(term192577, term192577.getClass(), "firstRomVersion", "niKvJJXdeU");
        setField(term192577, term192577.getClass(), "firstDataVersion", "mJgellfeNf");
        setField(term192577, term192577.getClass(), "firstPlayDate", "gPuHFpKpgV");
        setField(term192577, term192577.getClass(), "compatibleCmVersion", "QZttLDZgnr");
        setField(term192577, term192577.getClass(), "dailyBonusDate", "RTIZssHrmC");
        setField(term192577, term192577.getClass(), "dailyCourseBonusDate", "JjSHZkcGOm");
        setField(term192577, term192577.getClass(), "lastPairLoginDate", "AYriOKQIPd");
        setField(term192577, term192577.getClass(), "lastTrialPlayDate", "KAEOLEfusb");
        setIntField(term192577, term192577.getClass(), "playVsCount", -2106969244);
        setIntField(term192577, term192577.getClass(), "playSyncCount", 1867730492);
        setIntField(term192577, term192577.getClass(), "winCount", 2124844100);
        setIntField(term192577, term192577.getClass(), "helpCount", 23858291);
        setIntField(term192577, term192577.getClass(), "comboCount", 59541663);
        setLongField(term192577, term192577.getClass(), "totalDeluxscore", -7385931487102085953L);
        setLongField(term192577, term192577.getClass(), "totalBasicDeluxscore", -3982103351105202802L);
        setLongField(term192577, term192577.getClass(), "totalAdvancedDeluxscore", -5627863196070665350L);
        setLongField(term192577, term192577.getClass(), "totalExpertDeluxscore", -5579542290419917251L);
        setLongField(term192577, term192577.getClass(), "totalMasterDeluxscore", 6815290019296591289L);
        setLongField(term192577, term192577.getClass(), "totalReMasterDeluxscore", -7086517545258424662L);
        setIntField(term192577, term192577.getClass(), "totalSync", -200802631);
        setIntField(term192577, term192577.getClass(), "totalBasicSync", 80749910);
        setIntField(term192577, term192577.getClass(), "totalAdvancedSync", -1917030847);
        setIntField(term192577, term192577.getClass(), "totalExpertSync", -1678066921);
        setIntField(term192577, term192577.getClass(), "totalMasterSync", 1398239082);
        setIntField(term192577, term192577.getClass(), "totalReMasterSync", -822609904);
        setLongField(term192577, term192577.getClass(), "totalAchievement", 2119299410269026045L);
        setLongField(term192577, term192577.getClass(), "totalBasicAchievement", -5320140534299857617L);
        setLongField(term192577, term192577.getClass(), "totalAdvancedAchievement", 6766205978981204063L);
        setLongField(term192577, term192577.getClass(), "totalExpertAchievement", 3106810755038337776L);
        setLongField(term192577, term192577.getClass(), "totalMasterAchievement", -673134296655462408L);
        setLongField(term192577, term192577.getClass(), "totalReMasterAchievement", -3432351261442473005L);
        setLongField(term192577, term192577.getClass(), "playerOldRating", 411936084149811843L);
        setLongField(term192577, term192577.getClass(), "playerNewRating", -8587058752277798193L);
        setIntField(term192577, term192577.getClass(), "banState", 1496179101);
        setLongField(term192577, term192577.getClass(), "dateTime", 7238374563402543937L);
        setField(term192575, term192575.getClass(), "user", term192577);
        setIntField(term192575, term192575.getClass(), "characterId", -830145650);
        setIntField(term192575, term192575.getClass(), "level", 163814430);
        setIntField(term192575, term192575.getClass(), "awakening", 118692552);
        setIntField(term192575, term192575.getClass(), "useCount", -99466254);
        term192926 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term192926;
        callMethod(klass, "equals", argTypes, term192575, args);
    }

};


