package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getTotalBasicHighScore_62403210729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141735;

    public UserData_getTotalBasicHighScore_62403210729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141739 = new Long(-5258945362776941718L);
        term141735 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term141737 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141790 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141899 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141945 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141735, term141735.getClass(), "id", 5220887092676977977L);
        setLongField(term141737, term141737.getClass(), "id", -738697333147106204L);
        setField(term141737, term141737.getClass(), "extId", term141739);
        setField(term141737, term141737.getClass(), "luid", "ZNYPPLOMix");
        setIntField(term141754, term141754.getClass(), "year", 2012);
        setShortField(term141754, term141754.getClass(), "month", (short) 7);
        setShortField(term141754, term141754.getClass(), "day", (short) 14);
        setField(term141753, term141753.getClass(), "date", term141754);
        setByteField(term141758, term141758.getClass(), "hour", (byte) 3);
        setByteField(term141758, term141758.getClass(), "minute", (byte) 53);
        setByteField(term141758, term141758.getClass(), "second", (byte) 44);
        setIntField(term141758, term141758.getClass(), "nano", 995672949);
        setField(term141753, term141753.getClass(), "time", term141758);
        setField(term141737, term141737.getClass(), "registerTime", term141753);
        setIntField(term141764, term141764.getClass(), "year", 2016);
        setShortField(term141764, term141764.getClass(), "month", (short) 10);
        setShortField(term141764, term141764.getClass(), "day", (short) 30);
        setField(term141763, term141763.getClass(), "date", term141764);
        setByteField(term141768, term141768.getClass(), "hour", (byte) 20);
        setByteField(term141768, term141768.getClass(), "minute", (byte) 18);
        setByteField(term141768, term141768.getClass(), "second", (byte) 6);
        setIntField(term141768, term141768.getClass(), "nano", 566555534);
        setField(term141763, term141763.getClass(), "time", term141768);
        setField(term141737, term141737.getClass(), "accessTime", term141763);
        setField(term141735, term141735.getClass(), "card", term141737);
        setField(term141735, term141735.getClass(), "userName", "HnUeaoqlvY");
        setIntField(term141786, term141786.getClass(), "year", 2011);
        setShortField(term141786, term141786.getClass(), "month", (short) 11);
        setShortField(term141786, term141786.getClass(), "day", (short) 4);
        setField(term141785, term141785.getClass(), "date", term141786);
        setByteField(term141790, term141790.getClass(), "hour", (byte) 17);
        setByteField(term141790, term141790.getClass(), "minute", (byte) 25);
        setByteField(term141790, term141790.getClass(), "second", (byte) 54);
        setIntField(term141790, term141790.getClass(), "nano", 959024049);
        setField(term141785, term141785.getClass(), "time", term141790);
        setField(term141735, term141735.getClass(), "lastLoginDate", term141785);
        setBooleanField(term141735, term141735.getClass(), "isWebJoin", false);
        setField(term141735, term141735.getClass(), "webLimitDate", "QoDtuFsSzS");
        setIntField(term141735, term141735.getClass(), "level", 606770187);
        setIntField(term141735, term141735.getClass(), "reincarnationNum", -2099435269);
        setField(term141735, term141735.getClass(), "exp", "hlFZKpXZIY");
        setLongField(term141735, term141735.getClass(), "point", 4762222530088432089L);
        setLongField(term141735, term141735.getClass(), "totalPoint", 1112619626486434161L);
        setIntField(term141735, term141735.getClass(), "playCount", -1960948468);
        setIntField(term141735, term141735.getClass(), "multiPlayCount", 463987540);
        setIntField(term141735, term141735.getClass(), "multiWinCount", -1061698279);
        setIntField(term141735, term141735.getClass(), "requestResCount", 955556184);
        setIntField(term141735, term141735.getClass(), "acceptResCount", -1983502078);
        setIntField(term141735, term141735.getClass(), "successResCount", 1255011076);
        setIntField(term141735, term141735.getClass(), "playerRating", -685777121);
        setIntField(term141735, term141735.getClass(), "highestRating", -1692733101);
        setIntField(term141735, term141735.getClass(), "nameplateId", 502455086);
        setIntField(term141735, term141735.getClass(), "frameId", -1126933002);
        setIntField(term141735, term141735.getClass(), "characterId", 1486444842);
        setIntField(term141735, term141735.getClass(), "trophyId", 2054666202);
        setIntField(term141735, term141735.getClass(), "playedTutorialBit", 1227044061);
        setIntField(term141735, term141735.getClass(), "firstTutorialCancelNum", -195818221);
        setIntField(term141735, term141735.getClass(), "masterTutorialCancelNum", -210604022);
        setIntField(term141735, term141735.getClass(), "totalRepertoireCount", 1198201318);
        setIntField(term141735, term141735.getClass(), "totalMapNum", -1343762602);
        setLongField(term141735, term141735.getClass(), "totalHiScore", 518071851793374019L);
        setLongField(term141735, term141735.getClass(), "totalBasicHighScore", -7335238292024569938L);
        setLongField(term141735, term141735.getClass(), "totalAdvancedHighScore", 145049428630073036L);
        setLongField(term141735, term141735.getClass(), "totalExpertHighScore", -7520070789498833755L);
        setLongField(term141735, term141735.getClass(), "totalMasterHighScore", 3123302858747592150L);
        setIntField(term141847, term141847.getClass(), "year", 2025);
        setShortField(term141847, term141847.getClass(), "month", (short) 2);
        setShortField(term141847, term141847.getClass(), "day", (short) 11);
        setField(term141846, term141846.getClass(), "date", term141847);
        setByteField(term141851, term141851.getClass(), "hour", (byte) 14);
        setByteField(term141851, term141851.getClass(), "minute", (byte) 2);
        setByteField(term141851, term141851.getClass(), "second", (byte) 23);
        setIntField(term141851, term141851.getClass(), "nano", 355080670);
        setField(term141846, term141846.getClass(), "time", term141851);
        setField(term141735, term141735.getClass(), "eventWatchedDate", term141846);
        setIntField(term141735, term141735.getClass(), "friendCount", -167150075);
        setBooleanField(term141735, term141735.getClass(), "isMaimai", false);
        setField(term141735, term141735.getClass(), "firstGameId", "tRkHyXXipG");
        setField(term141735, term141735.getClass(), "firstRomVersion", "OAJdjKRfIM");
        setField(term141735, term141735.getClass(), "firstDataVersion", "BvzAbMTwzf");
        setIntField(term141895, term141895.getClass(), "year", 2023);
        setShortField(term141895, term141895.getClass(), "month", (short) 11);
        setShortField(term141895, term141895.getClass(), "day", (short) 2);
        setField(term141894, term141894.getClass(), "date", term141895);
        setByteField(term141899, term141899.getClass(), "hour", (byte) 7);
        setByteField(term141899, term141899.getClass(), "minute", (byte) 17);
        setByteField(term141899, term141899.getClass(), "second", (byte) 3);
        setIntField(term141899, term141899.getClass(), "nano", 517568574);
        setField(term141894, term141894.getClass(), "time", term141899);
        setField(term141735, term141735.getClass(), "firstPlayDate", term141894);
        setField(term141735, term141735.getClass(), "lastGameId", "fcmWxpNhDp");
        setField(term141735, term141735.getClass(), "lastRomVersion", "eAuqPLqmIz");
        setField(term141735, term141735.getClass(), "lastDataVersion", "jttexnFOYa");
        setIntField(term141941, term141941.getClass(), "year", 2026);
        setShortField(term141941, term141941.getClass(), "month", (short) 9);
        setShortField(term141941, term141941.getClass(), "day", (short) 11);
        setField(term141940, term141940.getClass(), "date", term141941);
        setByteField(term141945, term141945.getClass(), "hour", (byte) 10);
        setByteField(term141945, term141945.getClass(), "minute", (byte) 55);
        setByteField(term141945, term141945.getClass(), "second", (byte) 55);
        setIntField(term141945, term141945.getClass(), "nano", 847939362);
        setField(term141940, term141940.getClass(), "time", term141945);
        setField(term141735, term141735.getClass(), "lastPlayDate", term141940);
        setIntField(term141735, term141735.getClass(), "lastPlaceId", -1368631720);
        setField(term141735, term141735.getClass(), "lastPlaceName", "VTcNUeCrHP");
        setField(term141735, term141735.getClass(), "lastRegionId", "dRGHrevrGk");
        setField(term141735, term141735.getClass(), "lastRegionName", "nUztHQImUf");
        setField(term141735, term141735.getClass(), "lastAllNetId", "ntLvGqxKQC");
        setField(term141735, term141735.getClass(), "lastClientId", "KJiHZHSclg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term141735, args);
    }

};


