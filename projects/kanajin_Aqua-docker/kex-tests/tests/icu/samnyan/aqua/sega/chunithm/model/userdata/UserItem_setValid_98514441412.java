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
import java.lang.Boolean;

public class UserItem_setValid_98514441412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126665;
     Object term126947;

    public UserItem_setValid_98514441412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126671 = new Long(5806367330808555223L);
        term126665 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term126667 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term126669 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126700 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126783 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126877 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126665, term126665.getClass(), "id", -8480921340301466389L);
        setLongField(term126667, term126667.getClass(), "id", 9058652129546004164L);
        setLongField(term126669, term126669.getClass(), "id", -3412024028741687993L);
        setField(term126669, term126669.getClass(), "extId", term126671);
        setField(term126669, term126669.getClass(), "luid", "yIAqrFHbcK");
        setIntField(term126686, term126686.getClass(), "year", 2018);
        setShortField(term126686, term126686.getClass(), "month", (short) 9);
        setShortField(term126686, term126686.getClass(), "day", (short) 2);
        setField(term126685, term126685.getClass(), "date", term126686);
        setByteField(term126690, term126690.getClass(), "hour", (byte) 22);
        setByteField(term126690, term126690.getClass(), "minute", (byte) 50);
        setByteField(term126690, term126690.getClass(), "second", (byte) 58);
        setIntField(term126690, term126690.getClass(), "nano", 374371327);
        setField(term126685, term126685.getClass(), "time", term126690);
        setField(term126669, term126669.getClass(), "registerTime", term126685);
        setIntField(term126696, term126696.getClass(), "year", 2012);
        setShortField(term126696, term126696.getClass(), "month", (short) 11);
        setShortField(term126696, term126696.getClass(), "day", (short) 2);
        setField(term126695, term126695.getClass(), "date", term126696);
        setByteField(term126700, term126700.getClass(), "hour", (byte) 16);
        setByteField(term126700, term126700.getClass(), "minute", (byte) 51);
        setByteField(term126700, term126700.getClass(), "second", (byte) 10);
        setIntField(term126700, term126700.getClass(), "nano", 30584226);
        setField(term126695, term126695.getClass(), "time", term126700);
        setField(term126669, term126669.getClass(), "accessTime", term126695);
        setField(term126667, term126667.getClass(), "card", term126669);
        setField(term126667, term126667.getClass(), "userName", "qoqkuSpUdQ");
        setIntField(term126718, term126718.getClass(), "year", 2023);
        setShortField(term126718, term126718.getClass(), "month", (short) 3);
        setShortField(term126718, term126718.getClass(), "day", (short) 7);
        setField(term126717, term126717.getClass(), "date", term126718);
        setByteField(term126722, term126722.getClass(), "hour", (byte) 7);
        setByteField(term126722, term126722.getClass(), "minute", (byte) 6);
        setByteField(term126722, term126722.getClass(), "second", (byte) 41);
        setIntField(term126722, term126722.getClass(), "nano", 888823271);
        setField(term126717, term126717.getClass(), "time", term126722);
        setField(term126667, term126667.getClass(), "lastLoginDate", term126717);
        setBooleanField(term126667, term126667.getClass(), "isWebJoin", false);
        setField(term126667, term126667.getClass(), "webLimitDate", "cuOkblUYnI");
        setIntField(term126667, term126667.getClass(), "level", 857653739);
        setIntField(term126667, term126667.getClass(), "reincarnationNum", -1000522677);
        setField(term126667, term126667.getClass(), "exp", "FpMNcPTbIL");
        setLongField(term126667, term126667.getClass(), "point", -4743773691033199856L);
        setLongField(term126667, term126667.getClass(), "totalPoint", 5445249338164045376L);
        setIntField(term126667, term126667.getClass(), "playCount", -17458048);
        setIntField(term126667, term126667.getClass(), "multiPlayCount", 1912855522);
        setIntField(term126667, term126667.getClass(), "multiWinCount", 1949021422);
        setIntField(term126667, term126667.getClass(), "requestResCount", -912838937);
        setIntField(term126667, term126667.getClass(), "acceptResCount", 16552477);
        setIntField(term126667, term126667.getClass(), "successResCount", -102621386);
        setIntField(term126667, term126667.getClass(), "playerRating", -1817209345);
        setIntField(term126667, term126667.getClass(), "highestRating", -1215141504);
        setIntField(term126667, term126667.getClass(), "nameplateId", -485437241);
        setIntField(term126667, term126667.getClass(), "frameId", -1166670409);
        setIntField(term126667, term126667.getClass(), "characterId", 832294648);
        setIntField(term126667, term126667.getClass(), "trophyId", -840215577);
        setIntField(term126667, term126667.getClass(), "playedTutorialBit", -53296007);
        setIntField(term126667, term126667.getClass(), "firstTutorialCancelNum", -424687506);
        setIntField(term126667, term126667.getClass(), "masterTutorialCancelNum", -624302325);
        setIntField(term126667, term126667.getClass(), "totalRepertoireCount", -1974788609);
        setIntField(term126667, term126667.getClass(), "totalMapNum", -262908707);
        setLongField(term126667, term126667.getClass(), "totalHiScore", 3904137395052612619L);
        setLongField(term126667, term126667.getClass(), "totalBasicHighScore", -2627351923440470903L);
        setLongField(term126667, term126667.getClass(), "totalAdvancedHighScore", 2227412096769748963L);
        setLongField(term126667, term126667.getClass(), "totalExpertHighScore", -5691770586987635129L);
        setLongField(term126667, term126667.getClass(), "totalMasterHighScore", 278469276073195090L);
        setIntField(term126779, term126779.getClass(), "year", 2020);
        setShortField(term126779, term126779.getClass(), "month", (short) 5);
        setShortField(term126779, term126779.getClass(), "day", (short) 12);
        setField(term126778, term126778.getClass(), "date", term126779);
        setByteField(term126783, term126783.getClass(), "hour", (byte) 6);
        setByteField(term126783, term126783.getClass(), "minute", (byte) 28);
        setByteField(term126783, term126783.getClass(), "second", (byte) 29);
        setIntField(term126783, term126783.getClass(), "nano", 672930064);
        setField(term126778, term126778.getClass(), "time", term126783);
        setField(term126667, term126667.getClass(), "eventWatchedDate", term126778);
        setIntField(term126667, term126667.getClass(), "friendCount", 885420232);
        setBooleanField(term126667, term126667.getClass(), "isMaimai", true);
        setField(term126667, term126667.getClass(), "firstGameId", "xLwIZPJWuC");
        setField(term126667, term126667.getClass(), "firstRomVersion", "nWudcjLvSq");
        setField(term126667, term126667.getClass(), "firstDataVersion", "WdAMelVmvU");
        setIntField(term126827, term126827.getClass(), "year", 2010);
        setShortField(term126827, term126827.getClass(), "month", (short) 2);
        setShortField(term126827, term126827.getClass(), "day", (short) 6);
        setField(term126826, term126826.getClass(), "date", term126827);
        setByteField(term126831, term126831.getClass(), "hour", (byte) 0);
        setByteField(term126831, term126831.getClass(), "minute", (byte) 13);
        setByteField(term126831, term126831.getClass(), "second", (byte) 40);
        setIntField(term126831, term126831.getClass(), "nano", 642726518);
        setField(term126826, term126826.getClass(), "time", term126831);
        setField(term126667, term126667.getClass(), "firstPlayDate", term126826);
        setField(term126667, term126667.getClass(), "lastGameId", "FSZMcVNHZZ");
        setField(term126667, term126667.getClass(), "lastRomVersion", "uasckiUYzs");
        setField(term126667, term126667.getClass(), "lastDataVersion", "dyPJplpZGY");
        setIntField(term126873, term126873.getClass(), "year", 2022);
        setShortField(term126873, term126873.getClass(), "month", (short) 12);
        setShortField(term126873, term126873.getClass(), "day", (short) 26);
        setField(term126872, term126872.getClass(), "date", term126873);
        setByteField(term126877, term126877.getClass(), "hour", (byte) 22);
        setByteField(term126877, term126877.getClass(), "minute", (byte) 58);
        setByteField(term126877, term126877.getClass(), "second", (byte) 55);
        setIntField(term126877, term126877.getClass(), "nano", 197522570);
        setField(term126872, term126872.getClass(), "time", term126877);
        setField(term126667, term126667.getClass(), "lastPlayDate", term126872);
        setIntField(term126667, term126667.getClass(), "lastPlaceId", -884205561);
        setField(term126667, term126667.getClass(), "lastPlaceName", "FidoqFOZww");
        setField(term126667, term126667.getClass(), "lastRegionId", "VthnTywRxB");
        setField(term126667, term126667.getClass(), "lastRegionName", "yHLHaopFRB");
        setField(term126667, term126667.getClass(), "lastAllNetId", "dYnLcyZTKV");
        setField(term126667, term126667.getClass(), "lastClientId", "EuhpauGeVe");
        setField(term126665, term126665.getClass(), "user", term126667);
        setIntField(term126665, term126665.getClass(), "itemKind", 1568826803);
        setIntField(term126665, term126665.getClass(), "itemId", 1283114550);
        setIntField(term126665, term126665.getClass(), "stock", 1);
        setBooleanField(term126665, term126665.getClass(), "isValid", true);
        term126947 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term126947;
        callMethod(klass, "setValid", argTypes, term126665, args);
    }

};


