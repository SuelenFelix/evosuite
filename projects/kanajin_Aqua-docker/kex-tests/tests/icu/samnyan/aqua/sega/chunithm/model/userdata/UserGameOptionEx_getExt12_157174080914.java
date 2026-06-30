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

public class UserGameOptionEx_getExt12_157174080914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315855;

    public UserGameOptionEx_getExt12_157174080914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315861 = new Long(4036794646678680547L);
        term315855 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term315857 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term315859 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term315875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316067 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term315855, term315855.getClass(), "id", -3694252398964886431L);
        setLongField(term315857, term315857.getClass(), "id", -5400952784234386971L);
        setLongField(term315859, term315859.getClass(), "id", -4888336420869614311L);
        setField(term315859, term315859.getClass(), "extId", term315861);
        setField(term315859, term315859.getClass(), "luid", "VMmhmTHSAL");
        setIntField(term315876, term315876.getClass(), "year", 2027);
        setShortField(term315876, term315876.getClass(), "month", (short) 12);
        setShortField(term315876, term315876.getClass(), "day", (short) 8);
        setField(term315875, term315875.getClass(), "date", term315876);
        setByteField(term315880, term315880.getClass(), "hour", (byte) 15);
        setByteField(term315880, term315880.getClass(), "minute", (byte) 36);
        setByteField(term315880, term315880.getClass(), "second", (byte) 15);
        setIntField(term315880, term315880.getClass(), "nano", 624164953);
        setField(term315875, term315875.getClass(), "time", term315880);
        setField(term315859, term315859.getClass(), "registerTime", term315875);
        setIntField(term315886, term315886.getClass(), "year", 2029);
        setShortField(term315886, term315886.getClass(), "month", (short) 8);
        setShortField(term315886, term315886.getClass(), "day", (short) 11);
        setField(term315885, term315885.getClass(), "date", term315886);
        setByteField(term315890, term315890.getClass(), "hour", (byte) 21);
        setByteField(term315890, term315890.getClass(), "minute", (byte) 56);
        setByteField(term315890, term315890.getClass(), "second", (byte) 56);
        setIntField(term315890, term315890.getClass(), "nano", 993078633);
        setField(term315885, term315885.getClass(), "time", term315890);
        setField(term315859, term315859.getClass(), "accessTime", term315885);
        setField(term315857, term315857.getClass(), "card", term315859);
        setField(term315857, term315857.getClass(), "userName", "XGtrhXNaMV");
        setIntField(term315908, term315908.getClass(), "year", 2023);
        setShortField(term315908, term315908.getClass(), "month", (short) 5);
        setShortField(term315908, term315908.getClass(), "day", (short) 14);
        setField(term315907, term315907.getClass(), "date", term315908);
        setByteField(term315912, term315912.getClass(), "hour", (byte) 1);
        setByteField(term315912, term315912.getClass(), "minute", (byte) 25);
        setByteField(term315912, term315912.getClass(), "second", (byte) 33);
        setIntField(term315912, term315912.getClass(), "nano", 772808651);
        setField(term315907, term315907.getClass(), "time", term315912);
        setField(term315857, term315857.getClass(), "lastLoginDate", term315907);
        setBooleanField(term315857, term315857.getClass(), "isWebJoin", false);
        setField(term315857, term315857.getClass(), "webLimitDate", "KlhHeZgItV");
        setIntField(term315857, term315857.getClass(), "level", 72481893);
        setIntField(term315857, term315857.getClass(), "reincarnationNum", -1835966293);
        setField(term315857, term315857.getClass(), "exp", "YGWvExlOFa");
        setLongField(term315857, term315857.getClass(), "point", -6012619825906588170L);
        setLongField(term315857, term315857.getClass(), "totalPoint", 8373579218386204615L);
        setIntField(term315857, term315857.getClass(), "playCount", -408154519);
        setIntField(term315857, term315857.getClass(), "multiPlayCount", -300777303);
        setIntField(term315857, term315857.getClass(), "multiWinCount", 1741476389);
        setIntField(term315857, term315857.getClass(), "requestResCount", 785777431);
        setIntField(term315857, term315857.getClass(), "acceptResCount", -1694371655);
        setIntField(term315857, term315857.getClass(), "successResCount", -1608823920);
        setIntField(term315857, term315857.getClass(), "playerRating", 1821563586);
        setIntField(term315857, term315857.getClass(), "highestRating", -607557315);
        setIntField(term315857, term315857.getClass(), "nameplateId", -860984329);
        setIntField(term315857, term315857.getClass(), "frameId", -1536434576);
        setIntField(term315857, term315857.getClass(), "characterId", -987576592);
        setIntField(term315857, term315857.getClass(), "trophyId", 442011273);
        setIntField(term315857, term315857.getClass(), "playedTutorialBit", 1956149843);
        setIntField(term315857, term315857.getClass(), "firstTutorialCancelNum", -837480422);
        setIntField(term315857, term315857.getClass(), "masterTutorialCancelNum", 1860470993);
        setIntField(term315857, term315857.getClass(), "totalRepertoireCount", -863558477);
        setIntField(term315857, term315857.getClass(), "totalMapNum", -671527034);
        setLongField(term315857, term315857.getClass(), "totalHiScore", -4205123824650197721L);
        setLongField(term315857, term315857.getClass(), "totalBasicHighScore", 3807292775507608584L);
        setLongField(term315857, term315857.getClass(), "totalAdvancedHighScore", -2774036194156152136L);
        setLongField(term315857, term315857.getClass(), "totalExpertHighScore", -2474492075184927477L);
        setLongField(term315857, term315857.getClass(), "totalMasterHighScore", 2518230246615070982L);
        setIntField(term315969, term315969.getClass(), "year", 2015);
        setShortField(term315969, term315969.getClass(), "month", (short) 2);
        setShortField(term315969, term315969.getClass(), "day", (short) 19);
        setField(term315968, term315968.getClass(), "date", term315969);
        setByteField(term315973, term315973.getClass(), "hour", (byte) 5);
        setByteField(term315973, term315973.getClass(), "minute", (byte) 16);
        setByteField(term315973, term315973.getClass(), "second", (byte) 56);
        setIntField(term315973, term315973.getClass(), "nano", 195460421);
        setField(term315968, term315968.getClass(), "time", term315973);
        setField(term315857, term315857.getClass(), "eventWatchedDate", term315968);
        setIntField(term315857, term315857.getClass(), "friendCount", -355504967);
        setBooleanField(term315857, term315857.getClass(), "isMaimai", false);
        setField(term315857, term315857.getClass(), "firstGameId", "DtiQRHgJmm");
        setField(term315857, term315857.getClass(), "firstRomVersion", "SDJYcRQAkM");
        setField(term315857, term315857.getClass(), "firstDataVersion", "UKWTVmTWAK");
        setIntField(term316017, term316017.getClass(), "year", 2028);
        setShortField(term316017, term316017.getClass(), "month", (short) 9);
        setShortField(term316017, term316017.getClass(), "day", (short) 29);
        setField(term316016, term316016.getClass(), "date", term316017);
        setByteField(term316021, term316021.getClass(), "hour", (byte) 9);
        setByteField(term316021, term316021.getClass(), "minute", (byte) 7);
        setByteField(term316021, term316021.getClass(), "second", (byte) 13);
        setIntField(term316021, term316021.getClass(), "nano", 212705149);
        setField(term316016, term316016.getClass(), "time", term316021);
        setField(term315857, term315857.getClass(), "firstPlayDate", term316016);
        setField(term315857, term315857.getClass(), "lastGameId", "twYXqgjRmy");
        setField(term315857, term315857.getClass(), "lastRomVersion", "HFaAuAnTOn");
        setField(term315857, term315857.getClass(), "lastDataVersion", "EJiGWkJgKE");
        setIntField(term316063, term316063.getClass(), "year", 2022);
        setShortField(term316063, term316063.getClass(), "month", (short) 11);
        setShortField(term316063, term316063.getClass(), "day", (short) 2);
        setField(term316062, term316062.getClass(), "date", term316063);
        setByteField(term316067, term316067.getClass(), "hour", (byte) 7);
        setByteField(term316067, term316067.getClass(), "minute", (byte) 44);
        setByteField(term316067, term316067.getClass(), "second", (byte) 16);
        setIntField(term316067, term316067.getClass(), "nano", 186201890);
        setField(term316062, term316062.getClass(), "time", term316067);
        setField(term315857, term315857.getClass(), "lastPlayDate", term316062);
        setIntField(term315857, term315857.getClass(), "lastPlaceId", 487658174);
        setField(term315857, term315857.getClass(), "lastPlaceName", "MJovsjjSeM");
        setField(term315857, term315857.getClass(), "lastRegionId", "YONpdIaYPl");
        setField(term315857, term315857.getClass(), "lastRegionName", "xQwJTVPqIz");
        setField(term315857, term315857.getClass(), "lastAllNetId", "VkVNOcUvlO");
        setField(term315857, term315857.getClass(), "lastClientId", "DVBrSfNLwF");
        setField(term315855, term315855.getClass(), "user", term315857);
        setIntField(term315855, term315855.getClass(), "ext1", -1003494096);
        setIntField(term315855, term315855.getClass(), "ext2", -916635849);
        setIntField(term315855, term315855.getClass(), "ext3", -292870550);
        setIntField(term315855, term315855.getClass(), "ext4", 932232775);
        setIntField(term315855, term315855.getClass(), "ext5", -2014050836);
        setIntField(term315855, term315855.getClass(), "ext6", 1398941087);
        setIntField(term315855, term315855.getClass(), "ext7", 1739979538);
        setIntField(term315855, term315855.getClass(), "ext8", -525688968);
        setIntField(term315855, term315855.getClass(), "ext9", -27212490);
        setIntField(term315855, term315855.getClass(), "ext10", -262064529);
        setIntField(term315855, term315855.getClass(), "ext11", 882451306);
        setIntField(term315855, term315855.getClass(), "ext12", 1363101790);
        setIntField(term315855, term315855.getClass(), "ext13", 877478140);
        setIntField(term315855, term315855.getClass(), "ext14", -877898256);
        setIntField(term315855, term315855.getClass(), "ext15", -843145378);
        setIntField(term315855, term315855.getClass(), "ext16", -1108492087);
        setIntField(term315855, term315855.getClass(), "ext17", -2065560265);
        setIntField(term315855, term315855.getClass(), "ext18", -387620756);
        setIntField(term315855, term315855.getClass(), "ext19", -126979177);
        setIntField(term315855, term315855.getClass(), "ext20", -131484078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt12", argTypes, term315855, args);
    }

};


