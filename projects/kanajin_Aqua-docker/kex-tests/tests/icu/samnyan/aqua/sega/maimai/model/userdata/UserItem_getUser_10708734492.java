package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_getUser_10708734492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84828;

    public UserItem_getUser_10708734492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84834 = new Long(-8514728180792822493L);
        term84828 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term84830 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term84832 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84828, term84828.getClass(), "id", -6664891356964396236L);
        setLongField(term84830, term84830.getClass(), "id", 5307445998877056304L);
        setLongField(term84832, term84832.getClass(), "id", -8148408579143384073L);
        setField(term84832, term84832.getClass(), "extId", term84834);
        setField(term84832, term84832.getClass(), "luid", "VzkPDPPGQl");
        setIntField(term84849, term84849.getClass(), "year", 2022);
        setShortField(term84849, term84849.getClass(), "month", (short) 6);
        setShortField(term84849, term84849.getClass(), "day", (short) 2);
        setField(term84848, term84848.getClass(), "date", term84849);
        setByteField(term84853, term84853.getClass(), "hour", (byte) 18);
        setByteField(term84853, term84853.getClass(), "minute", (byte) 14);
        setByteField(term84853, term84853.getClass(), "second", (byte) 42);
        setIntField(term84853, term84853.getClass(), "nano", 593545677);
        setField(term84848, term84848.getClass(), "time", term84853);
        setField(term84832, term84832.getClass(), "registerTime", term84848);
        setIntField(term84859, term84859.getClass(), "year", 2010);
        setShortField(term84859, term84859.getClass(), "month", (short) 7);
        setShortField(term84859, term84859.getClass(), "day", (short) 19);
        setField(term84858, term84858.getClass(), "date", term84859);
        setByteField(term84863, term84863.getClass(), "hour", (byte) 16);
        setByteField(term84863, term84863.getClass(), "minute", (byte) 23);
        setByteField(term84863, term84863.getClass(), "second", (byte) 11);
        setIntField(term84863, term84863.getClass(), "nano", 638450755);
        setField(term84858, term84858.getClass(), "time", term84863);
        setField(term84832, term84832.getClass(), "accessTime", term84858);
        setField(term84830, term84830.getClass(), "card", term84832);
        setIntField(term84830, term84830.getClass(), "lastDataVersion", 1748720356);
        setField(term84830, term84830.getClass(), "userName", "iojOXjfZFr");
        setIntField(term84830, term84830.getClass(), "point", -1104509081);
        setIntField(term84830, term84830.getClass(), "totalPoint", 444190847);
        setIntField(term84830, term84830.getClass(), "iconId", 2111517446);
        setIntField(term84830, term84830.getClass(), "nameplateId", -39807030);
        setIntField(term84830, term84830.getClass(), "frameId", -308723512);
        setIntField(term84830, term84830.getClass(), "trophyId", -500062566);
        setIntField(term84830, term84830.getClass(), "playCount", -955513817);
        setIntField(term84830, term84830.getClass(), "playVsCount", -1864369159);
        setIntField(term84830, term84830.getClass(), "playSyncCount", -1507868397);
        setIntField(term84830, term84830.getClass(), "winCount", -525791468);
        setIntField(term84830, term84830.getClass(), "helpCount", 1134512930);
        setIntField(term84830, term84830.getClass(), "comboCount", -1582011061);
        setIntField(term84830, term84830.getClass(), "feverCount", 1582993223);
        setIntField(term84830, term84830.getClass(), "totalHiScore", 246696471);
        setIntField(term84830, term84830.getClass(), "totalEasyHighScore", -316548746);
        setIntField(term84830, term84830.getClass(), "totalBasicHighScore", 352020388);
        setIntField(term84830, term84830.getClass(), "totalAdvancedHighScore", -499509478);
        setIntField(term84830, term84830.getClass(), "totalExpertHighScore", 466328915);
        setIntField(term84830, term84830.getClass(), "totalMasterHighScore", -1590658996);
        setIntField(term84830, term84830.getClass(), "totalReMasterHighScore", -1738020486);
        setIntField(term84830, term84830.getClass(), "totalHighSync", 140506413);
        setIntField(term84830, term84830.getClass(), "totalEasySync", -785678813);
        setIntField(term84830, term84830.getClass(), "totalBasicSync", 1295397324);
        setIntField(term84830, term84830.getClass(), "totalAdvancedSync", -1445387113);
        setIntField(term84830, term84830.getClass(), "totalExpertSync", -1584901503);
        setIntField(term84830, term84830.getClass(), "totalMasterSync", -1865762318);
        setIntField(term84830, term84830.getClass(), "totalReMasterSync", 431315883);
        setIntField(term84830, term84830.getClass(), "playerRating", -1117456611);
        setIntField(term84830, term84830.getClass(), "highestRating", 459866921);
        setIntField(term84830, term84830.getClass(), "rankAuthTailId", -1981792037);
        setField(term84830, term84830.getClass(), "eventWatchedDate", "yyrkuIYJKj");
        setField(term84830, term84830.getClass(), "webLimitDate", "reGIMbnrGF");
        setIntField(term84830, term84830.getClass(), "challengeTrackPhase", 41826056);
        setIntField(term84830, term84830.getClass(), "firstPlayBits", 1336045771);
        setField(term84830, term84830.getClass(), "lastPlayDate", "yquSngBHqd");
        setIntField(term84830, term84830.getClass(), "lastPlaceId", 282549313);
        setField(term84830, term84830.getClass(), "lastPlaceName", "ZSdaJkZZPm");
        setIntField(term84830, term84830.getClass(), "lastRegionId", -332892529);
        setField(term84830, term84830.getClass(), "lastRegionName", "ICnzwgujDT");
        setField(term84830, term84830.getClass(), "lastClientId", "RfDgUkIYjW");
        setField(term84830, term84830.getClass(), "lastCountryCode", "QnZKCwkmMh");
        setIntField(term84830, term84830.getClass(), "eventPoint", 1007630712);
        setIntField(term84830, term84830.getClass(), "totalLv", 1203824766);
        setIntField(term84830, term84830.getClass(), "lastLoginBonusDay", 413201694);
        setIntField(term84830, term84830.getClass(), "lastSurvivalBonusDay", -340513413);
        setIntField(term84830, term84830.getClass(), "loginBonusLv", -2054663329);
        setField(term84828, term84828.getClass(), "user", term84830);
        setIntField(term84828, term84828.getClass(), "itemKind", 448554489);
        setIntField(term84828, term84828.getClass(), "itemId", 1385351110);
        setIntField(term84828, term84828.getClass(), "stock", -1224101846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term84828, args);
    }

};


