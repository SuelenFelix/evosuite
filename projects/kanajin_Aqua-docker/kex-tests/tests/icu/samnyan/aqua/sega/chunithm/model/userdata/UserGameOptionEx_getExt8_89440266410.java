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

public class UserGameOptionEx_getExt8_89440266410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314063;

    public UserGameOptionEx_getExt8_89440266410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314069 = new Long(5857854340777182167L);
        term314063 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term314065 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term314067 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314088 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314098 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314275 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term314063, term314063.getClass(), "id", -8079990214114446951L);
        setLongField(term314065, term314065.getClass(), "id", -9121863504856704916L);
        setLongField(term314067, term314067.getClass(), "id", -4459179453474120410L);
        setField(term314067, term314067.getClass(), "extId", term314069);
        setField(term314067, term314067.getClass(), "luid", "jCvumyMZwu");
        setIntField(term314084, term314084.getClass(), "year", 2022);
        setShortField(term314084, term314084.getClass(), "month", (short) 2);
        setShortField(term314084, term314084.getClass(), "day", (short) 18);
        setField(term314083, term314083.getClass(), "date", term314084);
        setByteField(term314088, term314088.getClass(), "hour", (byte) 11);
        setByteField(term314088, term314088.getClass(), "minute", (byte) 24);
        setByteField(term314088, term314088.getClass(), "second", (byte) 25);
        setIntField(term314088, term314088.getClass(), "nano", 692184433);
        setField(term314083, term314083.getClass(), "time", term314088);
        setField(term314067, term314067.getClass(), "registerTime", term314083);
        setIntField(term314094, term314094.getClass(), "year", 2029);
        setShortField(term314094, term314094.getClass(), "month", (short) 7);
        setShortField(term314094, term314094.getClass(), "day", (short) 20);
        setField(term314093, term314093.getClass(), "date", term314094);
        setByteField(term314098, term314098.getClass(), "hour", (byte) 2);
        setByteField(term314098, term314098.getClass(), "minute", (byte) 22);
        setByteField(term314098, term314098.getClass(), "second", (byte) 0);
        setIntField(term314098, term314098.getClass(), "nano", 232430537);
        setField(term314093, term314093.getClass(), "time", term314098);
        setField(term314067, term314067.getClass(), "accessTime", term314093);
        setField(term314065, term314065.getClass(), "card", term314067);
        setField(term314065, term314065.getClass(), "userName", "pUOexalUMM");
        setIntField(term314116, term314116.getClass(), "year", 2017);
        setShortField(term314116, term314116.getClass(), "month", (short) 1);
        setShortField(term314116, term314116.getClass(), "day", (short) 13);
        setField(term314115, term314115.getClass(), "date", term314116);
        setByteField(term314120, term314120.getClass(), "hour", (byte) 8);
        setByteField(term314120, term314120.getClass(), "minute", (byte) 40);
        setByteField(term314120, term314120.getClass(), "second", (byte) 25);
        setIntField(term314120, term314120.getClass(), "nano", 665543510);
        setField(term314115, term314115.getClass(), "time", term314120);
        setField(term314065, term314065.getClass(), "lastLoginDate", term314115);
        setBooleanField(term314065, term314065.getClass(), "isWebJoin", true);
        setField(term314065, term314065.getClass(), "webLimitDate", "IKkHVBybPv");
        setIntField(term314065, term314065.getClass(), "level", 1166953728);
        setIntField(term314065, term314065.getClass(), "reincarnationNum", -491154679);
        setField(term314065, term314065.getClass(), "exp", "uDfBwiLidX");
        setLongField(term314065, term314065.getClass(), "point", 2755379365736921497L);
        setLongField(term314065, term314065.getClass(), "totalPoint", -2208763219528665359L);
        setIntField(term314065, term314065.getClass(), "playCount", 578988160);
        setIntField(term314065, term314065.getClass(), "multiPlayCount", 913597896);
        setIntField(term314065, term314065.getClass(), "multiWinCount", -1479510884);
        setIntField(term314065, term314065.getClass(), "requestResCount", -402293884);
        setIntField(term314065, term314065.getClass(), "acceptResCount", 1232167596);
        setIntField(term314065, term314065.getClass(), "successResCount", 581831203);
        setIntField(term314065, term314065.getClass(), "playerRating", 87525395);
        setIntField(term314065, term314065.getClass(), "highestRating", -415212479);
        setIntField(term314065, term314065.getClass(), "nameplateId", 1307573065);
        setIntField(term314065, term314065.getClass(), "frameId", -2137861111);
        setIntField(term314065, term314065.getClass(), "characterId", 2127797521);
        setIntField(term314065, term314065.getClass(), "trophyId", -2135649917);
        setIntField(term314065, term314065.getClass(), "playedTutorialBit", -1474193289);
        setIntField(term314065, term314065.getClass(), "firstTutorialCancelNum", -170871329);
        setIntField(term314065, term314065.getClass(), "masterTutorialCancelNum", 291113104);
        setIntField(term314065, term314065.getClass(), "totalRepertoireCount", 179432580);
        setIntField(term314065, term314065.getClass(), "totalMapNum", -1258204903);
        setLongField(term314065, term314065.getClass(), "totalHiScore", -8331765952428714962L);
        setLongField(term314065, term314065.getClass(), "totalBasicHighScore", -8419887083771361951L);
        setLongField(term314065, term314065.getClass(), "totalAdvancedHighScore", 382074525446048429L);
        setLongField(term314065, term314065.getClass(), "totalExpertHighScore", 4945879608228215842L);
        setLongField(term314065, term314065.getClass(), "totalMasterHighScore", 3687726401872154598L);
        setIntField(term314177, term314177.getClass(), "year", 2019);
        setShortField(term314177, term314177.getClass(), "month", (short) 10);
        setShortField(term314177, term314177.getClass(), "day", (short) 13);
        setField(term314176, term314176.getClass(), "date", term314177);
        setByteField(term314181, term314181.getClass(), "hour", (byte) 22);
        setByteField(term314181, term314181.getClass(), "minute", (byte) 42);
        setByteField(term314181, term314181.getClass(), "second", (byte) 38);
        setIntField(term314181, term314181.getClass(), "nano", 367466072);
        setField(term314176, term314176.getClass(), "time", term314181);
        setField(term314065, term314065.getClass(), "eventWatchedDate", term314176);
        setIntField(term314065, term314065.getClass(), "friendCount", -1130609679);
        setBooleanField(term314065, term314065.getClass(), "isMaimai", false);
        setField(term314065, term314065.getClass(), "firstGameId", "LkaxztUhKP");
        setField(term314065, term314065.getClass(), "firstRomVersion", "JAiMiiwIyd");
        setField(term314065, term314065.getClass(), "firstDataVersion", "HZEoZFSfys");
        setIntField(term314225, term314225.getClass(), "year", 2010);
        setShortField(term314225, term314225.getClass(), "month", (short) 5);
        setShortField(term314225, term314225.getClass(), "day", (short) 20);
        setField(term314224, term314224.getClass(), "date", term314225);
        setByteField(term314229, term314229.getClass(), "hour", (byte) 13);
        setByteField(term314229, term314229.getClass(), "minute", (byte) 8);
        setByteField(term314229, term314229.getClass(), "second", (byte) 50);
        setIntField(term314229, term314229.getClass(), "nano", 924661883);
        setField(term314224, term314224.getClass(), "time", term314229);
        setField(term314065, term314065.getClass(), "firstPlayDate", term314224);
        setField(term314065, term314065.getClass(), "lastGameId", "usGpZUqeig");
        setField(term314065, term314065.getClass(), "lastRomVersion", "zshYTmGpAb");
        setField(term314065, term314065.getClass(), "lastDataVersion", "OLrThOaeRP");
        setIntField(term314271, term314271.getClass(), "year", 2025);
        setShortField(term314271, term314271.getClass(), "month", (short) 2);
        setShortField(term314271, term314271.getClass(), "day", (short) 8);
        setField(term314270, term314270.getClass(), "date", term314271);
        setByteField(term314275, term314275.getClass(), "hour", (byte) 22);
        setByteField(term314275, term314275.getClass(), "minute", (byte) 1);
        setByteField(term314275, term314275.getClass(), "second", (byte) 43);
        setIntField(term314275, term314275.getClass(), "nano", 917366452);
        setField(term314270, term314270.getClass(), "time", term314275);
        setField(term314065, term314065.getClass(), "lastPlayDate", term314270);
        setIntField(term314065, term314065.getClass(), "lastPlaceId", -1261330598);
        setField(term314065, term314065.getClass(), "lastPlaceName", "PXaTZfbXEG");
        setField(term314065, term314065.getClass(), "lastRegionId", "euhRkgIHwR");
        setField(term314065, term314065.getClass(), "lastRegionName", "fGCjMhYeuP");
        setField(term314065, term314065.getClass(), "lastAllNetId", "tQRvyNwDqB");
        setField(term314065, term314065.getClass(), "lastClientId", "dIKNQsSoMj");
        setField(term314063, term314063.getClass(), "user", term314065);
        setIntField(term314063, term314063.getClass(), "ext1", -1047805014);
        setIntField(term314063, term314063.getClass(), "ext2", 1879952127);
        setIntField(term314063, term314063.getClass(), "ext3", -486055477);
        setIntField(term314063, term314063.getClass(), "ext4", -710673716);
        setIntField(term314063, term314063.getClass(), "ext5", 879448569);
        setIntField(term314063, term314063.getClass(), "ext6", 1636702023);
        setIntField(term314063, term314063.getClass(), "ext7", -2138771257);
        setIntField(term314063, term314063.getClass(), "ext8", -1258830372);
        setIntField(term314063, term314063.getClass(), "ext9", -459007543);
        setIntField(term314063, term314063.getClass(), "ext10", 1545433344);
        setIntField(term314063, term314063.getClass(), "ext11", -287288345);
        setIntField(term314063, term314063.getClass(), "ext12", 1777620572);
        setIntField(term314063, term314063.getClass(), "ext13", -841007432);
        setIntField(term314063, term314063.getClass(), "ext14", -287194609);
        setIntField(term314063, term314063.getClass(), "ext15", -1593254684);
        setIntField(term314063, term314063.getClass(), "ext16", 13571711);
        setIntField(term314063, term314063.getClass(), "ext17", 1766722273);
        setIntField(term314063, term314063.getClass(), "ext18", 162206294);
        setIntField(term314063, term314063.getClass(), "ext19", -276924794);
        setIntField(term314063, term314063.getClass(), "ext20", 59212444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt8", argTypes, term314063, args);
    }

};


